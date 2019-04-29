package taller.systems.com.example.springbootbias.spi;

import taller.systems.com.example.springbootbias.domain.WikiPage;

import java.util.List;
import java.util.Optional;


public interface BiasRepository {

    void addWikiPage(WikiPage wikiPage);

    void deleteWikiPage(String id);

    List<WikiPage> getAllWikiPages();

    Optional<WikiPage> findWikiPageById(String wikiPageId);

}
