package ru.itmo.wm4.service;

import org.springframework.stereotype.Service;
import ru.itmo.wm4.domain.Notice;
import ru.itmo.wm4.form.NoticeCredentials;
import ru.itmo.wm4.repository.NoticeRepository;

import java.util.List;

@Service
public class NoticeService {
    private final NoticeRepository noticeRepository;

    public NoticeService(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    public Notice findById(Long noticeId) {
        return noticeId == null ? null : noticeRepository.findById(noticeId).orElse(null);
    }

    public List<Notice> findAll() {
        return noticeRepository.findAll();
    }

    public void save(NoticeCredentials form) {
        Notice notice = new Notice();
        notice.setContent(form.getContent());
        noticeRepository.save(notice);
    }
}
