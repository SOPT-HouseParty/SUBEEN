package com.sopt.ob.houseparty

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.sopt.ob.houseparty.databinding.FragmentGameBinding
import com.sopt.ob.houseparty.databinding.FragmentGameOverBinding


class GameOverFragment : Fragment() {
    private var _binding: FragmentGameOverBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game_over, container, false)
        /*binding.btnHome.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_gameOverFragment_to_gameFragment)
        }*/
        binding.btnHome.setOnClickListener { view: View ->
            view.findNavController().navigate(GameOverFragmentDirections.actionGameOverFragmentToGameFragment())
        }
        return binding.root
    }

}