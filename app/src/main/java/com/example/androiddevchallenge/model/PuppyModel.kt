/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.R
import java.io.Serializable

fun getPuppyList(): List<Puppy> {
    val list = mutableListOf<Puppy>()
    for (i in 1..20) {
        list.add(
            Puppy(
                name = "Nothingness",
                image = R.drawable.puppy1,
                desc = "The cab arrived late. The inside was in as bad of shape as the outside which was concerning, and it didn't appear that it had been cleaned in months. The green tree air-freshener hanging from the rearview mirror was either exhausted of its scent or not strong enough to overcome the other odors emitting from the cab. The correct decision, in this case, was to get the hell out of it and to call another cab, but she was late and didn't have a choice."
            )
        )
        list.add(
            Puppy(
                name = "An Enigma",
                image = R.drawable.puppy2,
                desc = "She didn't understand how changed worked. When she looked at today compared to yesterday, there was nothing that she could see that was different. Yet, when she looked at today compared to last year, she couldn't see how anything was ever the same."
            )
        )
        list.add(
            Puppy(
                name = "An Idea",
                image = R.drawable.puppy3,
                desc = "What is the best way to get what you want?\" she asked. He looked down at the ground knowing that she wouldn't like his answer. He hesitated, knowing that the truth would only hurt. How was he going to tell her that the best way for him to get what he wanted was to leave her?"
            )
        )
        list.add(
            Puppy(
                name = "Everything",
                image = R.drawable.puppy4,
                desc = "Spending time at national parks can be an exciting adventure, but this wasn't the type of excitement she was hoping to experience. As she contemplated the situation she found herself in, she knew she'd gotten herself in a little more than she bargained for. It wasn't often that she found herself in a tree staring down at a pack of wolves that were looking to make her their next meal."
            )
        )
        list.add(
            Puppy(
                name = "A Principal Idea",
                image = R.drawable.puppy5,
                desc = "Dave watched as the forest burned up on the hill, only a few miles from her house. The car had been hastily packed and Marta was inside trying to round up the last of the pets. Dave went through his mental list of the most important papers and documents that they couldn't leave behind. He scolded himself for not having prepared these better in advance and hoped that he had remembered everything that was needed. He continued to wait for Marta to appear with the pets, but she still was nowhere to be seen."
            )
        )
    }
    return list
}

data class Puppy(val name: String, val image: Int, val desc: String) : Serializable {
    companion object {
        private const val serialVersionUID = 20180617104400L
    }
}
