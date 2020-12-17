package org.academiadecodigo.offstring.prankguru.services;

import org.academiadecodigo.offstring.prankguru.models.Prank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrankManager {

    private List<Prank> prankList;

    public List<Prank> getPrankList() {
        if (prankList == null) {
            createPranks();
        }
        return prankList;
    }


    public boolean exists(Integer id) {
        if (prankList == null) {
            createPranks();
        }
        return id <= prankList.size();
    }


    public void addPrank(Prank prank) {
        int savingId = prankList.size();
        prank.setId(prankList.get(savingId -1).getId() + 1);
        prankList.add(prank);
    }

    public void deletePrank(Integer id) {
        prankList.removeIf(prank -> prank.getId().equals(id));
    }


    public List<Prank> createPranks() {
        prankList = new ArrayList<>();
        prankList.add(new Prank( 1,"bucketDoor", "bucket of water falls of your head when you open a door.", "1", "indoors", "easy", "https://www.youtube.com/embed/wPuVlj-DRvs" ));
        prankList.add(new Prank( 2,"peripherals swap", "swap bluetooth periferics from everyone on your office", "1", "office", "medium", "https://www.youtube.com/embed/wPuVlj-DRvs"));
        prankList.add(new Prank( 3,"bucketDoor", "bucket of water falls of your head when you open a door.", "1", "indoors", "easy", "https://www.youtube.com/embed/wPuVlj-DRvs" ));
        prankList.add(new Prank( 4,"peripherals swap", "swap bluetooth periferics from everyone on your office", "1", "office", "medium", "https://www.youtube.com/embed/wPuVlj-DRvs"));
        prankList.add(new Prank( 5,"bucketDoor", "bucket of water falls of your head when you open a door.", "1", "indoors", "easy", "https://www.youtube.com/embed/wPuVlj-DRvs" ));
        prankList.add(new Prank( 6,"peripherals swap", "swap bluetooth periferics from everyone on your office", "1", "office", "medium", "https://www.youtube.com/embed/wPuVlj-DRvs"));
        prankList.add(new Prank( 7,"bucketDoor", "bucket of water falls of your head when you open a door.", "1", "indoors", "easy", "https://www.youtube.com/embed/wPuVlj-DRvs" ));
        prankList.add(new Prank( 8,"peripherals swap", "swap bluetooth periferics from everyone on your office", "1", "office", "medium", "https://www.youtube.com/embed/wPuVlj-DRvs"));
        prankList.add(new Prank( 9,"bucketDoor", "bucket of water falls of your head when you open a door.", "1", "indoors", "easy", "https://www.youtube.com/embed/wPuVlj-DRvs" ));
        prankList.add(new Prank( 10,"peripherals swap", "swap bluetooth periferics from everyone on your office", "1", "office", "medium", "https://www.youtube.com/embed/wPuVlj-DRvs"));
        prankList.add(new Prank( 11,"bucketDoor", "bucket of water falls of your head when you open a door.", "1", "indoors", "easy", "https://www.youtube.com/embed/wPuVlj-DRvs" ));
        prankList.add(new Prank( 12,"peripherals swap", "swap bluetooth periferics from everyone on your office", "1", "office", "medium", "https://www.youtube.com/embed/wPuVlj-DRvs"));
        prankList.add(new Prank( 13,"bucketDoor", "bucket of water falls of your head when you open a door.", "1", "indoors", "easy", "https://www.youtube.com/embed/wPuVlj-DRvs" ));
        prankList.add(new Prank( 14,"peripherals swap", "swap bluetooth periferics from everyone on your office", "1", "office", "medium", "https://www.youtube.com/embed/wPuVlj-DRvs"));
        prankList.add(new Prank( 15,"bucketDoor", "bucket of water falls of your head when you open a door.", "1", "indoors", "easy", "https://www.youtube.com/embed/wPuVlj-DRvs" ));
        prankList.add(new Prank( 16,"peripherals swap", "swap bluetooth periferics from everyone on your office", "1", "office", "medium", "https://www.youtube.com/embed/wPuVlj-DRvs"));

        //adding a prank review to test(argumento do .get(X) tem que ser id da prank -1 ):
        prankList.get(0).createReview("Tone", "Dancing in the rain", "5", "Loved it!!!!");
        return prankList;
    }


    public List<Prank> filteredPranks (String environment, String difficulty, String participants) {

        List<Prank> filteredPrankList = new ArrayList<>();

        for (Prank prank : prankList) {

            if ((environment.equals(prank.getEnvironment()) || environment.equals("any")) &&
                    (difficulty.equals(prank.getDifficulty()) || difficulty.equals("any")) &&
                    (participants.equals(prank.getParticipants()) || participants.equals("any"))) {

                filteredPrankList.add(prank);
            }
        }
        return filteredPrankList;
    }
}
