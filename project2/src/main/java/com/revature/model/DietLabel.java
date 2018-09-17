package com.revature.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "diet_label_table")
public class DietLabel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int diet_label_id;
	
	@Column(name = "diet_label")
	private String dietLabelId;
	@OneToMany(mappedBy = "dietLabel")
	private List<Recipe> recipe;
	public DietLabel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DietLabel(int diet_label_id, String dietLabelId, List<Recipe> recipe) {
		super();
		this.diet_label_id = diet_label_id;
		this.dietLabelId = dietLabelId;
		this.recipe = recipe;
	}
	public int getDiet_label_id() {
		return diet_label_id;
	}
	public void setDiet_label_id(int diet_label_id) {
		this.diet_label_id = diet_label_id;
	}
	public String getDietLabelId() {
		return dietLabelId;
	}
	public void setDietLabelId(String dietLabelId) {
		this.dietLabelId = dietLabelId;
	}
	public List<Recipe> getRecipe() {
		return recipe;
	}
	public void setRecipe(List<Recipe> recipe) {
		this.recipe = recipe;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dietLabelId == null) ? 0 : dietLabelId.hashCode());
		result = prime * result + diet_label_id;
		result = prime * result + ((recipe == null) ? 0 : recipe.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DietLabel other = (DietLabel) obj;
		if (dietLabelId == null) {
			if (other.dietLabelId != null)
				return false;
		} else if (!dietLabelId.equals(other.dietLabelId))
			return false;
		if (diet_label_id != other.diet_label_id)
			return false;
		if (recipe == null) {
			if (other.recipe != null)
				return false;
		} else if (!recipe.equals(other.recipe))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DietLabel [diet_label_id=" + diet_label_id + ", dietLabelId=" + dietLabelId + ", recipe=" + recipe
				+ "]";
	}

}