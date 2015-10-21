package com.epicodus.beetsbandapp.Models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Dictionary;

/**
 * Created by Aimee and Diana on 10/21/15.
 */
public class SongLibrary {
    private ArrayList<Song> mSongs;

    public SongLibrary() {
        setSongs();
    }

    public ArrayList<Song>getSongs() {
        return mSongs;
    }

    private void setSongs() {
        mSongs = new ArrayList<>();

        mSongs.add(new Song(
                "Bangin' on a Trash Can",
                "Bangin' on a Trash Can\n" + "Drumming on a Streelight"
        ));

        mSongs.add(new Song(
                "Shout Your Lungs Out",
                "You gotta whistle\n" +
                        "gotta rumble\n" +
                        "gotta scream\n" +
                        "gotta stomp\n" +
                        "gotta SHOUT your lungs out!\n" +
                        "\n" +
                        "You gotta holler\n" +
                        "gotta yell\n" +
                        "gotta clap\n" +
                        "gotta wail\n" +
                        "you gotta SHOUT your lungs out!\n" +
                        "\n" +
                        "You gotta roll your windows down\n" +
                        "You gotta rock your socks\n" +
                        "you gotta roll your soul\n" +
                        "bust a vocal chord\n" +
                        "You gotta lose control\n" +
                        "\n" +
                        "You gotta roll your windows down\n" +
                        "You gotta rock your socks\n" +
                        "you gotta roll your soul\n" +
                        "bust a vocal chord\n" +
                        "You gotta lose control\n" +
                        "\n" +
                        "You gotta whistle\n" +
                        "gotta rumble\n" +
                        "gotta scream\n" +
                        "gotta stomp\n" +
                        "you gotta SHOUT your lungs out!"
        ));

        mSongs.add(new Song(
                "I Need Mo Allowance",
                "I need mo' allowance (yodelayee)\n" +
                        "I need mo' allowance (yodelayeoo)\n" +
                        "I need mo' allowance (yodelayeoo)\n" +
                        "Why? Because I do!\n" +
                        "\n" +
                        "Yodelayeoo\n" +
                        "\n" +
                        "I need mo' allowance (yodelayee)\n" +
                        "I need mo' allowance (yodelayeoo)\n" +
                        "I need mo' allowance (yodelayeoo)\n" +
                        "Yo! I'm talking to you!\n" +
                        "\n" +
                        "I need to buy some CDs\n" +
                        "I need to buy some gum\n" +
                        "I mow the grass, I clean the house\n" +
                        "I think I deserve some... some mo' allowance!\n" +
                        "\n" +
                        "I need mo' allowance (yodelayee)\n" +
                        "I need mo' allowance (yodelayeoo)\n" +
                        "I need mo' allowance (yodelayeoo)\n" +
                        "Why? Because I do!\n" +
                        "\n" +
                        "Yodelayeoo\n" +
                        "I need mo' allowance!"
        ));

        mSongs.add(new Song(
                "Killer Tofu",
                "Killer tofu!\n" +
                        "\n" +
                        "Fast food feels fuzzy\n" +
                        "'Cuz it's made from stuff that's scuzzy\n" +
                        "I always thought I was such a nerd\n" +
                        "I refuse to touch that strange bean curd\n" +
                        "\n" +
                        "I wouldn't eat it - wooh!\n" +
                        "But it ate you!\n" +
                        "\n" +
                        "Ah ee ooh\n" +
                        "Killer tofu\n" +
                        "Ee ah ee\n" +
                        "Ooh ee ooh\n" +
                        "Killer tofu\n" +
                        "\n" +
                        "I eat my sugar cereal\n" +
                        "But it makes my teeth bacterial!\n" +
                        "Ee ah ee oh oh\n" +
                        "Ee ah ee\n" +
                        "\n" +
                        "If you're feelin' kind of cruddy\n" +
                        "Ee ah ee\n" +
                        "Just stick right by your buddy\n" +
                        "Ee ah ee oh oh\n" +
                        "I don't eat\n" +
                        "T-t-t-t-t-too much fried food!\n" +
                        "Yah!\n" +
                        "\n" +
                        "Ah ee ooh\n" +
                        "Killer tofu\n" +
                        "Ee ah ee\n" +
                        "Ooh ee ooh\n" +
                        "Killer tofu"
        ));

        mSongs.add(new Song(
                "Patty You're the Mayonnaise For Me",
                "Patty, you're the pickle in my coleslaw, \n" +
                        "Patty, you're the sugar in my tea, \n" +
                        "Patty, you're the relish on my hotdog, \n" +
                        "and \n" +
                        "Patty, \n" +
                        "you're the mayonnaise for me. \n" +
                        "Whoa, whoa, whoa!"
        ));
    }
}
