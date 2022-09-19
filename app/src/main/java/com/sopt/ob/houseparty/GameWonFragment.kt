package com.sopt.ob.houseparty

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.sopt.ob.houseparty.databinding.FragmentGameOverBinding
import com.sopt.ob.houseparty.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {

    private var _binding: FragmentGameWonBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game_won, container, false)
        /*binding.btnHome.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_gameWonFragment_to_gameFragment)
        }*/
        binding.btnHome.setOnClickListener { view: View ->
            view.findNavController().navigate(
                GameWonFragmentDirections.actionGameWonFragmentToGameFragment()
            )
        }
        var args = GameWonFragmentArgs.fromBundle(requireArguments())
        Toast.makeText(
            context,
            "NumCorrect: ${args.numCorrect}, NumQuestions: ${args.numQuestions}",
            Toast.LENGTH_LONG
        ).show()
        return binding.root
    }

}