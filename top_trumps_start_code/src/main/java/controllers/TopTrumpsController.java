package controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.TopTrumpService;

import static com.sun.tools.jdi.Packet.Reply;


@RestController
@RequestMapping(value = "/cards")
public class TopTrumpsController {

    @Autowired
    TopTrumpService topTrumpService;

    @PostMapping
    public ResponseEntity <Reply> newGame(){
        Reply reply = topTrumpService.startNewGame();
        return new ResponseEntity<Reply>(reply, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Reply> getGameStatus(){
        Reply reply;

        if (topTrumpService.== null){
            reply = new Reply(
                    topTrumpService.ge,
                    "Game has not been started",
                    false
            );
        } else {
            reply = new Reply(
                    gameService.getCurrentWord(),
                    "Game in progress",
                    false
            );
        }



}
