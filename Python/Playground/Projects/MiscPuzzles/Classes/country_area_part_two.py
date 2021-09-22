import requests
import json


# Crude program to get any the % of any country's landmass vs Earths total landmass
# please see the link below to find a list of valid country codes to use with the program
# https://gist.github.com/vxnick/380904
def get_country_code():
    # Prompt that takes country code to retrieve area data
    val = input("Please enter a ISO 3166-1 2-letter or 3-letter country code ")
    print(val)
    url = "https://restcountries.eu/rest/v2/alpha/{}".format(val)
    print(url)
    return url


def get_country_area_percentage():
    # Assume all landmass areas are in Km^2
    worlds_total_landmass = 148940000

    # get response calls get_country_code() method to provide url
    response = requests.get(get_country_code())
    print(response.json())

    # saves the country code response in a dictionary accesses the countries area, and preforms the comparison
    # calculation to get its % of landmass vs Earths total landmass
    response_dict = json.loads(response.text)
    country_area = response_dict.get("area")
    result = round((country_area / worlds_total_landmass * 100), 2)
    print("Your Country's area is " + str(result) + "%" + " of the Earths Landmass.")
    return result


get_country_area_percentage()
