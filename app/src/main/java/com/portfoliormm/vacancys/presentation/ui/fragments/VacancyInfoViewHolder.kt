package com.portfoliormm.vacancys.presentation.ui.fragments

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.portfoliormm.vacancys.R
import com.portfoliormm.vacancys.data.model.ParametersVacancy
import com.portfoliormm.vacancys.databinding.VacanciesBinding
import com.portfoliormm.vacancys.domain.model.VacanciesData

class VacancyInfoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = VacanciesBinding.bind(view)

    fun bind(vacancy : VacanciesData){
        binding.textTitle.text = vacancy.parametersVacancy.title
        binding.textNameCity.text = vacancy.parametersVacancy.address
        binding.textNameCompany.text = vacancy.parametersVacancy.company
        if (vacancy.parametersVacancy.lookingNumber!=null){
            var people = setPeopleCount(itemView.context, vacancy.parametersVacancy.lookingNumber)
            binding.textViewing.text = "Сейчас просматривает ${people}"
        }else{
            binding.textViewing.text = ""
        }
        if (vacancy.favourite){
            binding.imageFavourites.setImageResource(R.drawable.like_blue)
        }else{
            binding.imageFavourites.setImageResource(R.drawable.like_grey)
        }
    }

    fun setPeopleCount(context: Context, count : Int) : String{
        val people = context.resources.getQuantityString(R.plurals.count_people, count)
        return "${count}${people}"
    }
}