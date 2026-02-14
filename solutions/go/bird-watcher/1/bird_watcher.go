package birdwatcher

// TotalBirdCount return the total bird count by summing
// the individual day's counts.
func TotalBirdCount(birdsPerDay []int) int {
	var totalBirds int
	for _, dailyBirdCount := range birdsPerDay {
		totalBirds += dailyBirdCount
	}
	return totalBirds
}

// BirdsInWeek returns the total bird count by summing
// only the items belonging to the given week.
func BirdsInWeek(birdsPerDay []int, week int) int {
	weekIndex := 7 * (week - 1)
	weekBirdCount := birdsPerDay[weekIndex : weekIndex+7]
	return TotalBirdCount(weekBirdCount)
}

// FixBirdCountLog returns the bird counts after correcting
// the bird counts for alternate days.
func FixBirdCountLog(birdsPerDay []int) []int {
	for i, dailyBirds := range birdsPerDay {
		if i%2 == 0 {
			birdsPerDay[i] = dailyBirds + 1
		}
	}
	return birdsPerDay
}
