# ==============Program Specs==============
# Create a function that takes a country's name and its area as arguments and returns the area of the country's
# proportion of the total world's landmass.

# areaOfCountry("Russia", 17098242) ➞ "Russia is 11.48% of the total world's landmass"
# areaOfCountry("USA", 9372610), "USA is 6.29% of the total world's landmass"
# areaOfCountry("Iran", 1648195) ➞ "Iran is 1.11% of the total world's landmass"


# ==============The Program==============
def area_of_country(country):
    # Assume all landmass areas are in Km^2
    worlds_total_landmass = 148940000
    countries_dict = {"Russia": 17098242, "USA": 9372610, "Iran": 1648195}

    # Checks if the country is current in countries_dict and then returns the landmass % as compared to
    # worlds_total_landmass
    if countries_dict.__contains__(country):
        country_area = countries_dict.get(country)
        result = round((country_area / worlds_total_landmass * 100), 2)
        print("Your Country is " + country + ". Its landmass compared to the World's is " + str(result) + "%")
        return result
    else:
        print("Sorry that's not in our County Dictionary currently")
        if country == "Python":
            print("Close! Python Rules but it is actually not a country... YET!")
        else:
            print("Sorry that's not in our County Dictionary currently")


# ==============The Program==============

area_of_country("Russia")
area_of_country("USA")
area_of_country("Iran")
area_of_country("Python")
