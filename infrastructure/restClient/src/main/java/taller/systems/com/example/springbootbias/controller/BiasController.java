package taller.systems.com.example.springbootbias.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import taller.systems.com.example.springbootbias.domain.WikiPage;

import javax.validation.Valid;
import java.util.List;

public interface BiasController {

    @GetMapping("/hello")
    String index();


    @GetMapping("/wikiPage")
    ResponseEntity<List<WikiPage>> getAllWikiPages();

    @PostMapping("/wikiPage")
    ResponseEntity<Void> createWikiPage(@RequestBody WikiPage wikiPage);

    // Think I have to change the request method to RequestParam
    @GetMapping("/wikiPage/{pageName}/{data}")
    ResponseEntity createWikiPage1(@PathVariable String pageName,@PathVariable String data);


    @DeleteMapping("/wikiPage")
    ResponseEntity<Void> deleteWikiPage(@PathVariable String wikiPageId);

    @GetMapping("/wikiPage/{wikiPageId}")
    ResponseEntity<WikiPage> findWikiPageById(@PathVariable String wikiPageId);

}