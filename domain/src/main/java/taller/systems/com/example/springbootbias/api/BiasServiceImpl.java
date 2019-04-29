package taller.systems.com.example.springbootbias.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import taller.systems.com.example.springbootbias.spi.BiasRepository;
import taller.systems.com.example.springbootbias.domain.WikiPage;

import java.util.List;
import java.util.Optional;

@Service
public class BiasServiceImpl implements BiasService {

    private BiasRepository biasRepository;

    @Autowired
    public BiasServiceImpl(BiasRepository biasRepository) {
        this.biasRepository = biasRepository;
    }


    @Override
    public void createWikiPage(WikiPage wikiPage) {
        // todo: add Exceptions
         biasRepository.addWikiPage(wikiPage);
    }

    @Override
    public void deleteWikiPage(String wikiId) {
        // todo: add Exceptions
        Optional<WikiPage> wikiPageById = findWikiPageById(wikiId);
        biasRepository.deleteWikiPage(wikiPageById.get().getId());
    }

    @Override
    public List<WikiPage> getAllWikiPages() {
        return biasRepository.getAllWikiPages();
    }

    @Override
    public Optional<WikiPage> findWikiPageById(String wikiPageId) {
        return biasRepository.findWikiPageById(wikiPageId);
    }


}
