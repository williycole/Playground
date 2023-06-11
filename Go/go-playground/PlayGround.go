package main

import (
	"fmt"
	"math"
	"math/rand"
	"regexp"
	"strings"
	time "time"
)

func main() {
	//	fmt.Println("Hello world!")
	//	fmt.Println("------------------------------")
	//	message := `
	//**************************
	//*    BUY NOW, SAVE 11%   *
	//**************************`
	//	CleanupMessage(message)
	//	fmt.Println("------------------------------")
	//	slice := []int{5, 2, 10, 6, 8, 7, 0, 9}
	//	fmt.Printf("len: %d\n", len(slice))
	//	fmt.Printf("index: %d\n", slice[7])
	//	item := GetItem(slice, 8)
	//	println(item)
	//	fmt.Println("------------------------------")
	//	sliceB := []int{3, 4, 5, 6}
	//	RemoveItem(sliceB, 1)
	//birdCountAs := []int{3, 0, 3, 3, 2, 1, 0}
	//birdCountsB := []int{3, 0, 5, 1, 0, 4, 1, 0, 3, 4, 3, 0, 8, 0}
	//BirdsInWeek(birdCountsB, 1)
	//BirdsInWeek(birdCountAs, 1)
	//GenerateWandEnergy() //layers := []string{"sauce", "noodles", "sauce", "meat", "mozzarella", "noodles"}
	//PreparationTime(layers, 3) // => 18
	//PreparationTime(layers, 0) // => 12
	Quantities([]string{"sauce", "noodles", "sauce", "meat", "mozzarella", "noodles"}) // => 100, 0.4
	//friendsList := []string{"noodles", "sauce", "mozzarella", "kampot pepper"}
	//myList := []string{"noodles", "meat", "sauce", "mozzarella", "?"}
	// myList => []string{"noodles", "meat", "sauce", "mozzarella", "kampot pepper"}
	//AddSecretIngredient(friendsList, myList)
	//quantities := []float64{1.2, 3.6, 10.5}
	//ScaleRecipe(quantities, 4) //=> []float64{ 2.4, 7.2, 21 }
	//quantities2 := []float64{0.6, 300, 1, 0.5, 50, 0.1, 100}
	// expected: []float64{0.9, 450, 1.5, 0.75, 75, 0.15, 150}
	//ScaleRecipe(quantities2, 3)
}

func CleanupMessage(oldMsg string) string {
	re := regexp.MustCompile(`\*`)
	noStarOrNewLines := strings.Trim(re.ReplaceAllString(oldMsg, ""), "\n")
	cleanAndTrim := strings.Trim(noStarOrNewLines, " ")

	fmt.Println(cleanAndTrim)
	return cleanAndTrim
}

// GetItem retrieves an item from a slice at given position.
// If the index is out of range, we want it to return -1.
func GetItem(slice []int, index int) int {
	if index >= len(slice) || index == -1 {
		return -1
	} else {
		return slice[index]
	}
}

// RemoveItem removes an item from a slice by modifying the existing slice.
func RemoveItem(slice []int, index int) []int {
	if index >= len(slice) || index == -1 {
		return slice
	} else {
		beg := slice[:index]
		end := slice[index+1:]
		fmt.Printf("slice: %v\n", slice)
		fmt.Printf("index: %d\n", index)
		fmt.Printf("beg: %v\n", beg)
		fmt.Printf("end: %v\n", end)
		newStack := append(beg, end...)
		fmt.Printf("%v", newStack)
		return newStack
	}
}

// ParseCard returns the integer value of a card following blackjack ruleset.
// Note: Commonly, aces can take the value of 1 or 11 but for simplicity we will assume that
// they can only take the value of 11.
//
// Depending on your two cards and the card of the dealer, there is a strategy for the first turn of the game,
// in which you have the following options:
//
// Stand (S)
// Hit (H)
// Split (P)
// Automatically win (W)
// Although not optimal yet, you will follow the strategy your friend Alex has been developing, which is as follows
// in the comments of the function below :
func ParseCard(card string) int {
	switch card {
	case "one":
		return 1
	case "two":
		return 2
	case "three":
		return 3
	case "four":
		return 4
	case "five":
		return 5
	case "six":
		return 6
	case "seven":
		return 7
	case "eight":
		return 8
	case "nine":
		return 9
	case "ten", "jack", "queen", "king":
		return 10
	case "ace":
		return 11
	default:
		return 0
	}
}

// FirstTurn returns the decision for the first turn, given two cards of the
// player and one card of the dealer.
func FirstTurn(card1, card2, dealerCard string) string {
	var playerSum = 0
	var dealerSum = ParseCard(dealerCard)
	//TODO
	//If you have a pair of aces you must always split them.
	//var isPairOfAces = CheckForAcePair(card1, card2)
	if card1 == "ace" && card2 == "ace" {
		playerSum = GetTotalPlayerCardSum(card1)
	} else {
		playerSum = GetTotalPlayerCardSum(card1, card2)
	}
	//TODO
	//If your cards sum up to a value within the range [17, 20] you should always stand.
	if playerSum >= 17 && playerSum <= 20 {
		return "S"
	}
	//If your cards sum up to 11 or lower you should always hit.
	if playerSum <= 11 {
		return "H"
	}
	//TODO
	//If your cards sum up to a value within the range [12, 16] you should always stand
	if playerSum >= 12 && playerSum <= 16 {
		return "S"
	} else if dealerSum >= 7 { //else if unless the dealer has a 7 or higher, in which case you should always hit.
		return "H"
	}
	//TODO
	//If you have a Blackjack (two cards that sum up to a value of 21),
	//and the dealer does not have an ace, a figure or a ten then you automatically win.
	if playerSum == 21 && dealerCard != "ace" || playerSum == 21 && dealerCard != "king" || playerSum == 21 && dealerCard != "queen" || playerSum == 21 && dealerCard != "jack" || playerSum == 21 && dealerSum != 10 {
		return "W"
	} //else If the dealer does have any of those cards then you'll have to stand and wait for the reveal of the other card.
	//dealerCard != "ace" || dealerCard != "king"|| dealerCard != "queen" || dealerCard != "jack" || dealerSum != 10{
	return "S"
	//}
}

func GetTotalPlayerCardSum(cards ...string) int {
	//fmt.Print(cards, " ")
	total := 0

	//Within the function, the type of nums is equivalent to []int. We can call len(nums), iterate over it with range, etc.
	for _, card := range cards {
		total += ParseCard(card)
	}
	//fmt.Println(total)
	return total
}

type Car struct {
	speed        int
	batteryDrain int
	battery      int
	distance     int
}

// NewCar creates a new remote controlled car with full battery and given specifications.
func NewCar(speed, batteryDrain int) Car {
	return Car{
		speed:        speed,
		batteryDrain: batteryDrain,
		battery:      100,
		distance:     0,
	}
}

type Track struct {
	distance int
}

// NewTrack creates a new track
func NewTrack(distance int) Track {
	return Track{distance: distance}
}

// Drive drives the car one time. If there is not enough battery to drive one more time,
// the car will not move.
func Drive(car Car) Car {
	if car.battery <= 0 {
		return car
	}
	return Car{
		speed:        car.speed,
		batteryDrain: car.batteryDrain,
		battery:      car.battery - car.batteryDrain,
		distance:     car.distance,
	}
}

// CanFinish checks if a car is able to finish a certain track.
// To finish a race, a car has to be able to drive the race's distance. This means not draining its battery before
// having crossed the finish line. Implement the CanFinish function that takes a Car and a Track instance as its
// parameter and returns true if the car can finish the race; otherwise, return false.
// Assume that you are currently at the starting line of the race and start the engine of the car for the race.
// Take into account that the car's battery might not necessarily be fully charged when starting the race:
func CanFinish(car Car, track Track) bool {
	trackDist := float64(track.distance)
	carTimes := int(math.Ceil(trackDist / float64(car.speed)))
	carDrain := car.batteryDrain * carTimes
	return carDrain <= car.battery
}

// BirdsInWeek returns the total bird count by summing
// only the items belonging to the given week.
func BirdsInWeek(birdsPerDay []int, week int) int {
	var birdCount = 0
	var weeksEnd = 0
	var weeksBeg = 0
	//println(len(birdsPerDay))
	if len(birdsPerDay)-1 < 7 {
		weeksEnd = len(birdsPerDay) - 1
		weeksBeg = 0
	} else {
		weeksEnd = week * 7
		weeksBeg = weeksEnd - 7
	}

	println(weeksEnd)
	println(weeksBeg)
	for i := weeksBeg; i <= weeksEnd; i++ {
		birdCount += birdsPerDay[i]
	}
	println(birdCount)
	return birdCount
}

// SeedWithTime seeds math/rand with the current computer time.
func SeedWithTime() {
	rand.Seed(time.Now().UnixNano())
}

// RollADie returns a random int d with 1 <= d <= 20.
func RollADie() int {
	rand.Seed(time.Now().UnixNano())
	return rand.Intn(20) + 1
}

// GenerateWandEnergy returns a random float64 f with 0.0 <= f < 12.0.
func GenerateWandEnergy() float64 {
	return rand.Float64() * 12.0
}

// ShuffleAnimals returns a slice with all eight animal strings in random order.
func ShuffleAnimals() []string {
	animals := []string{"ant", "beaver", "cat", "dog", "elephant", "fox", "giraffe", "hedgehog"}
	rand.Shuffle(len(animals), func(i, j int) { animals[i], animals[j] = animals[j], animals[i] })
	return animals
}

func PreparationTime(layers []string, prepTime int) int {
	tm := 0
	if prepTime == 0 {
		tm = 2 * len(layers)
		fmt.Printf("tm: %d\n", tm)
		return tm
	} else {
		tm = prepTime * len(layers)
		fmt.Printf("tm: %d\n", tm)
		return tm
	}
}

func Quantities(layers []string) (int, float64) {
	noodles := 0
	sauce := 0.0

	for _, layer := range layers {
		switch layer {
		case "noodles":
			noodles += 50
		case "sauce":
			sauce += 0.2
		}
	}

	return noodles, sauce
}

func AddSecretIngredient(friendsList []string, myList []string) []string {
	friendsItem := friendsList[len(friendsList)-1]
	index := len(myList) - 1
	myList[index] = friendsItem
	//fmt.Printf("myNewList: %s\n", myList)
	return myList
}

func ScaleRecipe(quantities []float64, servings int) []float64 {
	fmt.Printf("Quantities: %.2f\n", quantities)
	var scaledRecipe []float64
	defaultServings := 2.00
	servingsFloat := float64(servings)
	for i := range quantities {
		twoDecimalsFactor := math.Pow(10, 2)
		scaledRecipe = append(scaledRecipe,
			math.Round(((quantities[i]*servingsFloat)/defaultServings)*twoDecimalsFactor)/twoDecimalsFactor)
	}
	fmt.Printf("ScaledQuantities: %.2f\n", quantities)
	return scaledRecipe
}

func Units() map[string]int {
	unitsMap := make(map[string]int)
	unitsMap["quarter_of_a_dozen"] = 3
	unitsMap["half_of_a_dozen"] = 6
	unitsMap["dozen"] = 12
	unitsMap["small_gross"] = 120
	unitsMap["gross"] = 144
	unitsMap["great_gross"] = 1728
	return unitsMap
}
