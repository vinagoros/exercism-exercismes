package lasagna

// TODO: define the 'PreparationTime()' function
func PreparationTime(layers []string, timePerLayer int) int {
	if timePerLayer == 0 {
		timePerLayer = 2
	}
	return len(layers) * timePerLayer
}

// TODO: define the 'Quantities()' function
func Quantities(layers []string) (noodles int, sauce float64) {
	for _, layer := range layers {
		if layer == "noodles" {
			noodles += 50
		} else if layer == "sauce" {
			sauce += 0.2
		}
	}
	return
}

// TODO: define the 'AddSecretIngredient()' function
func AddSecretIngredient(friendIngredientList []string, myIngredientList []string) {
	myIngredientList[len(myIngredientList)-1] = friendIngredientList[len(friendIngredientList)-1]
}

// TODO: define the 'ScaleRecipe()' function
func ScaleRecipe(quantitiesForTwo []float64, nrOfDesiredPortions int) (scaledQuantities []float64) {
	scaledQuantities = make([]float64, len(quantitiesForTwo))
	for i, quantity := range quantitiesForTwo {
		scaledQuantities[i] = quantity * float64(nrOfDesiredPortions) / 2
	}
	return
}

// Your first steps could be to read through the tasks, and create
// these functions with their correct parameter lists and return types.
// The function body only needs to contain `panic("")`.
//
// This will make the tests compile, but they will fail.
// You can then implement the function logic one by one and see
// an increasing number of tests passing as you implement more
// functionality.
