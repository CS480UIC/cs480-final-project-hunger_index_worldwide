# N Simple Queries

select country, continent
from world_body_fat_percentage
where body_fat_percentage > 1.00
order by country;

select country, continent
from world_death_rate
where death_rate > 2.00
order by continent;

select country, continent
from world_happiness_index
where happiness_index > 3.00
order by country;

# N Complex Queries

select DTH.death_rate AS death_rates, VC.vaccination_rate AS vaccination_rates, DTH.country
from world_death_rate DTH 
INNER JOIN world_vaccination_rate VC
ON DTH.country = VC.country
order by DTH.country;



