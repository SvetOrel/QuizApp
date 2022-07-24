package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1, "The so-called “pleasure planet” Risa was first visited by which vacationing Trek captain?",
            R.drawable.galaxy,
            "James T. Kirk",
            "Jean-Luc Picard",
            "Kathryn Janeway",
            "Benjamin Sisko",
            "John Archer",
            5
        )
        questionList.add(que1)

        val que2 = Question(
            2, "Which character serves as the head of security for the space station Deep Space Nine?",
            R.drawable.alien,
            "Malcolm Reed",
            "Odo",
            "Tuvok",
            "Mae C. Jemison",
            "Worf",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3, "Who was the captain in the first pilot episode of the original Star Trek series?",
            R.drawable.borg,
            "Spoke",
            "James T. Kirk",
            "Christopher Pike",
            "Jean-Luc Picard",
            "John Archer",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            4, "In the Mirror universe, what has replaced the United Federation of Planets?",
            R.drawable.science,
            "Breen Confederacy",
            "Cardassian Union",
            "Klingon Empire",
            "Borg Empire",
            "Terran Empire",
            5
        )
        questionList.add(que4)

        val que5 = Question(
            5, "What was Seven of Nine’s name before she was assimilated by the Borg?",
            R.drawable.space,
            "Tasha Yar",
            "Annika Hansen",
            "Edith Keeler",
            "Ro Laren",
            "T'Pol",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6, "Who was the first Star Trek actor to write a Star Trek story?",
            R.drawable.space_ship_model,
            "William Shatner",
            "Leonard Nimoy",
            "Nichelle Nichols",
            "Walter Koenig",
            "James Doohan",
            4
        )
        questionList.add(que6)

        val que7 = Question(
            7, "Which alien race did Ronald Reagan say reminded him of Congress?",
            R.drawable.space_station,
            "Romulans",
            "Bajorans",
            "Borg",
            "The Edo",
            "Klingons",
            5
        )
        questionList.add(que7)

        val que8 = Question(
            8, "Who is the youngest captain in Starfleet history?",
            R.drawable.spaceship,
            "James Kirk",
            "Benjamin Sisko",
            "William T. Riker",
            "Itzak Arrat",
            "Lisa Cusak",
            1
        )
        questionList.add(que8)

        val que9 = Question(
            9, "What is the Klingon homeworld?",
            R.drawable.spaceship2,
            "cha'DIch",
            "Cho'echu",
            "Qo’noS",
            "D'akturak",
            "Fek'lhr",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10, "Which Chief Medical Officer is a Denobulan?",
            R.drawable.toy,
            "Phil Boyce",
            "M'Benga",
            "Mark Piper",
            "Katherine Pulaski",
            "Phlox",
            5
        )
        questionList.add(que10)
        return questionList
    }
}