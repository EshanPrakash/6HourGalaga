/*How does our version of Galaga run?
* The player has 3 spaceships and fights against (N amount) waves of enemies
* Spaceships can only be moved left and right
* There are 3 enemy types, Goei, Zako, and Boss Galaga
* The player can defeat enemies by launching bullets
* The player can only launch up to 7 bullets at once
* Each bullet deals a fixed amount of damage, and each enemy has a fixed amount of health
* Enemies can also fight back, trying to get close to the player's spaceship to deal damage
* Spaceships have a fixed amount of health
* One enemy usually only does 1 damage when it gets through
* However, taking one hit from Boss Galaga will result in a Spaceship's instant destruction
* The game is endless, only ending if the player loses all its spaceships
*/

/*ALSO, you might be wondering about my lack of arrays here
* As you can tell this was cobbled together really quickly (6 hour coding contest)
* And frankly I just didn't think of it at the time
* In retrospect I could have made this much quicker by using classes and arrays
* Overall, this was both a learning experience and an enjoyable contest
*/


public class Main{

    public static void main(String[] args) {

        new MyFrame();

    }
}