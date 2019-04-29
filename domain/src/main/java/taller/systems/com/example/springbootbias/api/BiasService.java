package taller.systems.com.example.springbootbias.api;

import taller.systems.com.example.springbootbias.domain.WikiPage;

import java.util.List;
import java.util.Optional;

public interface BiasService {

    void createWikiPage(WikiPage wikiPage);
    void deleteWikiPage(String id);
    List<WikiPage> getAllWikiPages();
    Optional<WikiPage> findWikiPageById(String wikiPageId);

}
