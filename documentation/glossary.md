## Table of Contents
1. [Entities](#Entites)
1. [Relationships](#Relationships)
1. [Attributes](#Attributes)
 
# Entites

### login_user
##### ---Name: login_user
##### ---Synonym: user_credentials
##### ---Description: access for the users

### world_hunger_statistics
##### ---Name: world_hunger_statistics
##### ---Synonym: world_hunger_data
##### ---Description: This entity contains records of the hunger statistics

### world_income_avg
##### ---Name: world_income_avg
##### ---Synonym: avg_income
##### ---Description: This entity contains a distribution according to average income

### world_vaccination_info
##### ---Name: world_vaccination_info
##### ---Synonym: vaccine_records
##### ---Description: This entity contains information regarding the covid vaccine distribution

### world_unemployment_rate
##### ---Name: world_unemployment_rate
##### ---Synonym: unemployment_data
##### ---Description: This entity contains information about the change in unemployment rate due to covid

### world_body_fat_percentage
##### ---Name: world_body_fat_percentage
##### ---Synonym: body_mass_index
##### ---Description: This entity contains different levels of body fat percentage

### world_death_rate
##### ---Name: world_death_rate
##### ---Synonym: population_difference
##### ---Description: This entity contains information about the change in death rate due to covid

### world_happiness_index
##### ---Name: world_happiness_index
##### ---Synonym: general_population_happiness
##### ---Description: This entity contains the changes in the happiness index due to covid


# Relationships

# Attributes
### login_user 
user_id 1-M(1), user_name 1-1(1).

### world_hunger_statistics
user_id 1-M(1), income_avg M-1(1), vaccination_rate M-1(1), death_rate M-1(1), happiness_index M-1(1), unemployment_rate M-1(1), avg_body_fat M-1(1).

### world_income_avg
avg_income M-1(1), country M-1(1), continent M-1(1).

### world_vaccination_info
vaccination_rate M-1(1), country M-1(1), continent M-1(1)

### world_unemployement_rate
unemployment_rate M-1(1), country M-1(1), continent M-1(1)

### world_body_fat_percentage
body_fat_percentage M-1(1), country M-1(1), continent M-1(1).

### world_happiness_index
happiness_index M-1(1), country M-1(1), continent M-1(1)

### world_death_rate
death_rate M-1(1), country M-1(1), continent M-1(1)
