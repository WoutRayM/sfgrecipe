package be.giantoaf.sfgrecipeproject.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecipeCreationTest {

    @Test
    void recipeCreationTest() {
        Recipe recipe = new Recipe(1L, "Some tasty food", 35, 35, 5,
                "www.waronline.be", "use some good stuff", "yaMon", new Byte[] {}, new Notes());
        assertThat(recipe).isNotNull();
        assertThat(recipe.getDescription()).isEqualToIgnoringCase("some tasty food");
    }

}
