package com.example.demo.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FoodDao {

	// foodテーブルから、カテゴリ名(category_name) を条件に、該当する全ての食品名(food_name) を取得する	
	@Select("""
			SELECT
			  food_name
			FROM
			  food
			WHERE
			  category_name = #{searchWord};
			""")
	public ArrayList<String> selectFoodName(String searchWord);

}
