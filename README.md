# Jasperpdfcvgenerator
SELECT osobneinformacije.ImePrezime,osobneinformacije.brojMobitela,osobneinformacije.emailAdresa,osobneinformacije.adresa,osobneinformacije.linkovi,zanimanje.Zvanje ,obrazovanje.datumPočetka,obrazovanje.datumZavršetka,obrazovanje.titula,obrazovanje.mjesto,obrazovanje.tehnikeZanimanja FROM osobneinformacije,zanimanje,obrazovanje WHERE obrazovanje.datumPočetka="2012-07-25" UNION SELECT osobneinformacije.ImePrezime,osobneinformacije.brojMobitela,osobneinformacije.emailAdresa,osobneinformacije.adresa,osobneinformacije.linkovi,zanimanje.Zvanje ,obrazovanje.datumPočetka,obrazovanje.datumZavršetka,obrazovanje.titula,obrazovanje.mjesto,obrazovanje.tehnikeZanimanja FROM osobneinformacije,zanimanje,obrazovanje WHERE obrazovanje.datumPočetka="2015-10-05"
