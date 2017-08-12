package it.seahawk.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    var scoreTeamA: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayScoreForTeamA(score: Int) {
        val scoreView = findViewById(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

    /**
     * Add 3 points to score of team A.
     */
    fun add3PointsForTeamA(view: View) {
        scoreTeamA = scoreTeamA + 3
        displayScoreForTeamA(scoreTeamA)
    }

    /**
     * Add 2 points to score of team A.
     */
    fun add2PointsForTeamA(view: View) {
        scoreTeamA = scoreTeamA + 2
        displayScoreForTeamA(scoreTeamA)
    }

    /**
     * Add 1 free throw point to score of team A.
     */
    fun addFreeThrowForTeamA(view: View) {
        scoreTeamA = scoreTeamA + 1
        displayScoreForTeamA(scoreTeamA)
    }

}
