package dev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Discussion;
import dev.exception.RepoException;
import dev.repository.DiscussionRepository;

@Service
public class DiscussionService {

    private DiscussionRepository discussionRepo;

    public DiscussionService(DiscussionRepository discussionRepo) {
        super();
        this.discussionRepo = discussionRepo;
    }

    public List<Discussion> readAll() {
        return discussionRepo.findAll();
    }

    public Discussion readById(Long id) throws RepoException {
        Optional<Discussion> optDiscussion = discussionRepo.findById(id);
        if (optDiscussion.isPresent()) {
            return optDiscussion.get();
        } else throw new RepoException("id_discussion non trouvé");
    }

    public Discussion create(Discussion discussion) {
        return discussionRepo.save(discussion);
    }

    public void delete(long id) throws RepoException {
        discussionRepo.delete(this.readById(id));
    }

}
