package taller.systems.com.example.springbootbias.repository;

import taller.systems.com.example.springbootbias.domain.WikiPage;

import org.springframework.stereotype.Repository;
import taller.systems.com.example.springbootbias.spi.BiasRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class JPABiasRepositoryImpl implements BiasRepository {

    private List<WikiPage> inMemoryPages = new ArrayList();


    @Override
    public void addWikiPage(WikiPage wikiPage) {
        this.inMemoryPages.add(wikiPage);

    }

    @Override
    public void deleteWikiPage(String id) {
        this.inMemoryPages.remove(id);
    }

    @Override
    public List<WikiPage> getAllWikiPages() {
        return inMemoryPages;
    }

    @Override
    public Optional<WikiPage> findWikiPageById(String wikiPageId) {
        return inMemoryPages.stream().filter(page ->page.getId().equals(wikiPageId)).findFirst();
    }
}
