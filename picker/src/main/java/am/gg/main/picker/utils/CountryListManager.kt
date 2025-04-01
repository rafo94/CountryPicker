package am.gg.main.picker.utils

import am.gg.main.picker.R
import am.gg.main.picker.model.CountryItem
import am.gg.main.picker.utils.CountryListManager.countryList

/**
 * Created by Rafik Gasparyan on 08.05.24
 * ggTeam
 */
object CountryListManager {
    var countryList = mutableListOf<CountryItem>()
}

fun setCountryList() {
    countryList = mutableListOf(
        CountryItem("Afghanistan", "+93", "AF", R.drawable.flag_afghanistan),
        CountryItem("Albania", "+355", "AL", R.drawable.flag_albania),
        CountryItem("Algeria", "+213", "DZ", R.drawable.flag_algeria),
        CountryItem("AmericanSamoa", "+1 684", "AS", R.drawable.flag_american_samoa),
        CountryItem("Andorra", "+376", "AD", R.drawable.flag_andorra),
        CountryItem("Angola", "+244", "AO", R.drawable.flag_angola),
        CountryItem("Anguilla", "+1 264", "AI", R.drawable.flag_anguilla),
        CountryItem("Antarctica", "+672", "AQ", R.drawable.flag_antarctica),
        CountryItem("Antigua and Barbuda", "+1268", "AG", R.drawable.flag_antigua_and_barbuda),
        CountryItem("Argentina", "+54", "AR", R.drawable.flag_argentina),
        CountryItem("Armenia", "+374", "AM", R.drawable.flag_armenia),
        CountryItem("Aruba", "+297", "AW", R.drawable.flag_aruba),
        CountryItem("Australia", "+61", "AU", R.drawable.flag_australia),
        CountryItem("Austria", "+43", "AT", R.drawable.flag_austria),
        CountryItem("Azerbaijan", "+994", "AZ", R.drawable.flag_azerbaijan),
        CountryItem("Bahamas", "+1 242", "BS", R.drawable.flag_bahamas),
        CountryItem("Bahrain", "+973", "BH", R.drawable.flag_bahrain),
        CountryItem("Bangladesh", "+880", "BD", R.drawable.flag_bangladesh),
        CountryItem("Barbados", "+1 246", "BB", R.drawable.flag_barbados),
        CountryItem("Belarus", "+375", "BY", R.drawable.flag_belarus),
        CountryItem("Belgium", "+32", "BE", R.drawable.flag_belgium),
        CountryItem("Belize", "+501", "BZ", R.drawable.flag_belize),
        CountryItem("Benin", "+229", "BJ", R.drawable.flag_benin),
        CountryItem("Bermuda", "+1 441", "BM", R.drawable.flag_bermuda),
        CountryItem("Bhutan", "+975", "BT", R.drawable.flag_bhutan),
        CountryItem("Bolivia, Plurinational State of", "+591", "BO", R.drawable.flag_bolivia),
        CountryItem("Bosnia and Herzegovina", "+387", "BA", R.drawable.flag_bosnia),
        CountryItem("Botswana", "+267", "BW", R.drawable.flag_botswana),
        CountryItem("Brazil", "+55", "BR", R.drawable.flag_brazil),
        CountryItem("British Indian Ocean Territory", "+246", "IO", R.drawable.flag_british_indian_ocean_territory),
        CountryItem("Brunei Darussalam", "+673", "BN", R.drawable.flag_brunei),
        CountryItem("Bulgaria", "+359", "BG", R.drawable.flag_bulgaria),
        CountryItem("Burkina Faso", "+226", "BF", R.drawable.flag_burkina_faso),
        CountryItem("Burundi", "+257", "BI", R.drawable.flag_burundi),
        CountryItem("Cambodia", "+855", "KH", R.drawable.flag_cambodia),
        CountryItem("Cameroon", "+237", "CM", R.drawable.flag_cameroon),
        CountryItem("Canada", "+1", "CA", R.drawable.flag_canada),
        CountryItem("Cape Verde", "+238", "CV", R.drawable.flag_cape_verde),
        CountryItem("Cayman Islands", "+ 345", "KY", R.drawable.flag_cayman_islands),
        CountryItem("Central African Republic", "+236", "CF", R.drawable.flag_central_african_republic),
        CountryItem("Chad", "+235", "TD", R.drawable.flag_chad),
        CountryItem("Chile", "+56", "CL", R.drawable.flag_chile),
        CountryItem("China", "+86", "CN", R.drawable.flag_china),
        CountryItem("Christmas Island", "+61", "CX", R.drawable.flag_christmas_island),
        CountryItem("Cocos (Keeling) Islands", "+61", "CC", R.drawable.flag_cocos),
        CountryItem("Colombia", "+57", "CO", R.drawable.flag_colombia),
        CountryItem("Comoros", "+269", "KM", R.drawable.flag_comoros),
        CountryItem("Congo", "+242", "CG", R.drawable.flag_republic_of_the_congo),
        CountryItem("Congo, The Democratic Republic of the", "+243", "CD", R.drawable.flag_democratic_republic_of_the_congo),
        CountryItem("Cook Islands", "+682", "CK", R.drawable.flag_cook_islands),
        CountryItem("Costa Rica", "+506", "CR", R.drawable.flag_costa_rica),
        CountryItem("Cote d'Ivoire", "+225", "CI", R.drawable.flag_cote_divoire),
        CountryItem("Croatia", "+385", "HR", R.drawable.flag_croatia),
        CountryItem("Cuba", "+53", "CU", R.drawable.flag_cuba),
        CountryItem("Cyprus", "+357", "CY", R.drawable.flag_cyprus),
        CountryItem("Czech Republic", "+420", "CZ", R.drawable.flag_czech_republic),
        CountryItem("Denmark", "+45", "DK", R.drawable.flag_denmark),
        CountryItem("Djibouti", "+253", "DJ", R.drawable.flag_djibouti),
        CountryItem("Dominica", "+1 767", "DM", R.drawable.flag_dominica),
        CountryItem("Dominican Republic", "+1 849", "DO", R.drawable.flag_dominican_republic),
        CountryItem("Ecuador", "+593", "EC", R.drawable.flag_ecuador),
        CountryItem("Egypt", "+20", "EG", R.drawable.flag_egypt),
        CountryItem("El Salvador", "+503", "SV", R.drawable.flag_el_salvador),
        CountryItem("Equatorial Guinea", "+240", "GQ", R.drawable.flag_equatorial_guinea),
        CountryItem("Eritrea", "+291", "ER", R.drawable.flag_eritrea),
        CountryItem("Estonia", "+372", "EE", R.drawable.flag_estonia),
        CountryItem("Ethiopia", "+251", "ET", R.drawable.flag_ethiopia),
        CountryItem("Falkland Islands (Malvinas)", "+500", "FK", R.drawable.flag_falkland_islands),
        CountryItem("Faroe Islands", "+298", "FO", R.drawable.flag_faroe_islands),
        CountryItem("Fiji", "+679", "FJ", R.drawable.flag_fiji),
        CountryItem("Finland", "+358", "FI", R.drawable.flag_finland),
        CountryItem("France", "+33", "FR", R.drawable.flag_france),
        CountryItem("French Polynesia", "+689", "PF", R.drawable.flag_french_polynesia),
        CountryItem("Gabon", "+241", "GA", R.drawable.flag_gabon),
        CountryItem("Gambia", "+220", "GM", R.drawable.flag_gambia),
        CountryItem("Georgia", "+995", "GE", R.drawable.flag_georgia),
        CountryItem("Germany", "+49", "DE", R.drawable.flag_germany),
        CountryItem("Ghana", "+233", "GH", R.drawable.flag_ghana),
        CountryItem("Gibraltar", "+350", "GI", R.drawable.flag_gibraltar),
        CountryItem("Greece", "+30", "GR", R.drawable.flag_greece),
        CountryItem("Greenland", "+299", "GL", R.drawable.flag_greenland),
        CountryItem("Grenada", "+1 473", "GD", R.drawable.flag_grenada),
        CountryItem("Guadeloupe", "+590", "GP", R.drawable.flag_guadeloupe),
        CountryItem("Guam", "+1 671", "GU", R.drawable.flag_guam),
        CountryItem("Guatemala", "+502", "GT", R.drawable.flag_guatemala),
        CountryItem("Guernsey", "+44", "GG", R.drawable.flag_guernsey),
        CountryItem("Guinea", "+224", "GN", R.drawable.flag_guinea),
        CountryItem("Guinea-Bissau", "+245", "GW", R.drawable.flag_guinea_bissau),
        CountryItem("Guyana", "+592", "GY", R.drawable.flag_guyana),
        CountryItem("Haiti", "+509", "HT", R.drawable.flag_haiti),
        CountryItem("Holy See (Vatican City State)", "+379", "VA", R.drawable.flag_vatican_city),
        CountryItem("Honduras", "+504", "HN", R.drawable.flag_honduras),
        CountryItem("Hong Kong", "+852", "HK", R.drawable.flag_hong_kong),
        CountryItem("Hungary", "+36", "HU", R.drawable.flag_hungary),
        CountryItem("Iceland", "+354", "IS", R.drawable.flag_iceland),
        CountryItem("India", "+91", "IN", R.drawable.flag_india),
        CountryItem("Indonesia", "+62", "ID", R.drawable.flag_indonesia),
        CountryItem("Iran, Islamic Republic of", "+98", "IR", R.drawable.flag_iran),
        CountryItem("Iraq", "+964", "IQ", R.drawable.flag_iraq),
        CountryItem("Ireland", "+353", "IE", R.drawable.flag_ireland),
        CountryItem("Isle of Man", "+44", "IM", R.drawable.flag_isleof_man),
        CountryItem("Israel", "+972", "IL", R.drawable.flag_israel),
        CountryItem("Italy", "+39", "IT", R.drawable.flag_italy),
        CountryItem("Jamaica", "+1 876", "JM", R.drawable.flag_jamaica),
        CountryItem("Japan", "+81", "JP", R.drawable.flag_japan),
        CountryItem("Jersey", "+44", "JE", R.drawable.flag_jersey),
        CountryItem("Jordan", "+962", "JO", R.drawable.flag_jordan),
        CountryItem("Kazakhstan", "+7", "KZ", R.drawable.flag_kazakhstan),
        CountryItem("Kenya", "+254", "KE", R.drawable.flag_kenya),
        CountryItem("Kiribati", "+686", "KI", R.drawable.flag_kiribati),
        CountryItem("Korea, Democratic People's Republic of", "+850", "KP", R.drawable.flag_north_korea),
        CountryItem("Korea, Republic of", "+82", "KR", R.drawable.flag_south_korea),
        CountryItem("Kuwait", "+965", "KW", R.drawable.flag_kuwait),
        CountryItem("Kyrgyzstan", "+996", "KG", R.drawable.flag_kyrgyzstan),
        CountryItem("Lao People's Democratic Republic", "+856", "LA", R.drawable.flag_laos),
        CountryItem("Latvia", "+371", "LV", R.drawable.flag_latvia),
        CountryItem("Lebanon", "+961", "LB", R.drawable.flag_lebanon),
        CountryItem("Lesotho", "+266", "LS", R.drawable.flag_lesotho),
        CountryItem("Liberia", "+231", "LR", R.drawable.flag_liberia),
        CountryItem("Libyan Arab Jamahiriya", "+218", "LY", R.drawable.flag_libya),
        CountryItem("Liechtenstein", "+423", "LI", R.drawable.flag_liechtenstein),
        CountryItem("Lithuania", "+370", "LT", R.drawable.flag_lithuania),
        CountryItem("Luxembourg", "+352", "LU", R.drawable.flag_luxembourg),
        CountryItem("Macao", "+853", "MO", R.drawable.flag_macao),
        CountryItem("Macedonia, The Former Yugoslav Republic of", "+389", "MK", R.drawable.flag_macedonia),
        CountryItem("Madagascar", "+261", "MG", R.drawable.flag_madagascar),
        CountryItem("Malawi", "+265", "MW", R.drawable.flag_malawi),
        CountryItem("Malaysia", "+60", "MY", R.drawable.flag_malaysia),
        CountryItem("Maldives", "+960", "MV", R.drawable.flag_maldives),
        CountryItem("Mali", "+223", "ML", R.drawable.flag_mali),
        CountryItem("Malta", "+356", "MT", R.drawable.flag_malta),
        CountryItem("Marshall Islands", "+692", "MH", R.drawable.flag_marshall_islands),
        CountryItem("Martinique", "+596", "MQ", R.drawable.flag_martinique),
        CountryItem("Mauritania", "+222", "MR", R.drawable.flag_mauritania),
        CountryItem("Mauritius", "+230", "MU", R.drawable.flag_mauritius),
        CountryItem("Mexico", "+52", "MX", R.drawable.flag_mexico),
        CountryItem("Micronesia, Federated States of", "+691", "FM", R.drawable.flag_micronesia),
        CountryItem("Moldova, Republic of", "+373", "MD", R.drawable.flag_moldova),
        CountryItem("Monaco", "+377", "MC", R.drawable.flag_monaco),
        CountryItem("Mongolia", "+976", "MN", R.drawable.flag_mongolia),
        CountryItem("Montenegro", "+382", "ME", R.drawable.flag_of_montenegro),
        CountryItem("Montserrat", "+1664", "MS", R.drawable.flag_montserrat),
        CountryItem("Morocco", "+212", "MA", R.drawable.flag_morocco),
        CountryItem("Mozambique", "+258", "MZ", R.drawable.flag_mozambique),
        CountryItem("Myanmar", "+95", "MM", R.drawable.flag_myanmar),
        CountryItem("Namibia", "+264", "NA", R.drawable.flag_namibia),
        CountryItem("Nauru", "+674", "NR", R.drawable.flag_nauru),
        CountryItem("Nepal", "+977", "NP", R.drawable.flag_nepal),
        CountryItem("Netherlands", "+31", "NL", R.drawable.flag_netherlands),
        CountryItem("Netherlands Antilles", "+599", "AN", R.drawable.flag_netherlands_antilles),
        CountryItem("New Caledonia", "+687", "NC", R.drawable.flag_new_caledonia),
        CountryItem("New Zealand", "+64", "NZ", R.drawable.flag_new_zealand),
        CountryItem("Nicaragua", "+505", "NI", R.drawable.flag_nicaragua),
        CountryItem("Niger", "+227", "NE", R.drawable.flag_niger),
        CountryItem("Nigeria", "+234", "NG", R.drawable.flag_nigeria),
        CountryItem("Niue", "+683", "NU", R.drawable.flag_niue),
        CountryItem("Norfolk Island", "+672", "NF", R.drawable.flag_norfolk_island),
        CountryItem("Northern Mariana Islands", "+1 670", "MP", R.drawable.flag_northern_mariana_islands),
        CountryItem("Norway", "+47", "NO", R.drawable.flag_norway),
        CountryItem("Oman", "+968", "OM", R.drawable.flag_oman),
        CountryItem("Pakistan", "+92", "PK", R.drawable.flag_pakistan),
        CountryItem("Palau", "+680", "PW", R.drawable.flag_palau),
        CountryItem("Panama", "+507", "PA", R.drawable.flag_panama),
        CountryItem("Papua New Guinea", "+675", "PG", R.drawable.flag_papua_new_guinea),
        CountryItem("Paraguay", "+595", "PY", R.drawable.flag_paraguay),
        CountryItem("Peru", "+51", "PE", R.drawable.flag_peru),
        CountryItem("Philippines", "+63", "PH", R.drawable.flag_philippines),
        CountryItem("Pitcairn", "+872", "PN", R.drawable.flag_pitcairn_islands),
        CountryItem("Poland", "+48", "PL", R.drawable.flag_poland),
        CountryItem("Portugal", "+351", "PT", R.drawable.flag_portugal),
        CountryItem("Puerto Rico", "+1 939", "PR", R.drawable.flag_puerto_rico),
        CountryItem("Qatar", "+974", "QA", R.drawable.flag_qatar),
        CountryItem("Romania", "+40", "RO", R.drawable.flag_romania),
        CountryItem("Russia", "+7", "RU", R.drawable.flag_russian_federation),
        CountryItem("Rwanda", "+250", "RW", R.drawable.flag_rwanda),
        CountryItem("Saint Barthélemy", "+590", "BL", R.drawable.flag_saint_barthelemy),
        CountryItem("Saint Helena, Ascension and Tristan Da Cunha", "+290", "SH", R.drawable.flag_saint_helena),
        CountryItem("Saint Kitts and Nevis", "+1 869", "KN", R.drawable.flag_saint_kitts_and_nevis),
        CountryItem("Saint Lucia", "+1 758", "LC", R.drawable.flag_saint_lucia),
        CountryItem("Saint Martin", "+590", "MF", R.drawable.flag_saint_martin),
        CountryItem("Saint Pierre and Miquelon", "+508", "PM", R.drawable.flag_saint_pierre),
        CountryItem("Saint Vincent and the Grenadines", "+1 784", "VC", R.drawable.flag_saint_vicent_and_the_grenadines),
        CountryItem("Samoa", "+685", "WS", R.drawable.flag_samoa),
        CountryItem("San Marino", "+378", "SM", R.drawable.flag_san_marino),
        CountryItem("Sao Tome and Principe", "+239", "ST", R.drawable.flag_sao_tome_and_principe),
        CountryItem("Saudi Arabia", "+966", "SA", R.drawable.flag_saudi_arabia),
        CountryItem("Senegal", "+221", "SN", R.drawable.flag_senegal),
        CountryItem("Serbia", "+381", "RS", R.drawable.flag_serbia),
        CountryItem("Seychelles", "+248", "SC", R.drawable.flag_seychelles),
        CountryItem("Sierra Leone", "+232", "SL", R.drawable.flag_sierra_leone),
        CountryItem("Singapore", "+65", "SG", R.drawable.flag_singapore),
        CountryItem("Slovakia", "+421", "SK", R.drawable.flag_slovakia),
        CountryItem("Slovenia", "+386", "SI", R.drawable.flag_slovenia),
        CountryItem("Solomon Islands", "+677", "SB", R.drawable.flag_soloman_islands),
        CountryItem("Somalia", "+252", "SO", R.drawable.flag_somalia),
        CountryItem("South Africa", "+27", "ZA", R.drawable.flag_south_africa),
        CountryItem("South Sudan", "+211", "SS", R.drawable.flag_south_sudan),
        CountryItem("Spain", "+34", "ES", R.drawable.flag_spain),
        CountryItem("Sri Lanka", "+94", "LK", R.drawable.flag_sri_lanka),
        CountryItem("Sudan", "+249", "SD", R.drawable.flag_sudan),
        CountryItem("Suriname", "+597", "SR", R.drawable.flag_suriname),
        CountryItem("Swaziland", "+268", "SZ", R.drawable.flag_swaziland),
        CountryItem("Sweden", "+46", "SE", R.drawable.flag_sweden),
        CountryItem("Switzerland", "+41", "CH", R.drawable.flag_switzerland),
        CountryItem("Syrian Arab Republic", "+963", "SY", R.drawable.flag_syria),
        CountryItem("Taiwan", "+886", "TW", R.drawable.flag_taiwan),
        CountryItem("Tajikistan", "+992", "TJ", R.drawable.flag_tajikistan),
        CountryItem("Tanzania, United Republic of", "+255", "TZ", R.drawable.flag_tanzania),
        CountryItem("Thailand", "+66", "TH", R.drawable.flag_thailand),
        CountryItem("Timor-Leste", "+670", "TL", R.drawable.flag_timor_leste),
        CountryItem("Togo", "+228", "TG", R.drawable.flag_togo),
        CountryItem("Tokelau", "+690", "TK", R.drawable.flag_tokelau),
        CountryItem("Tonga", "+676", "TO", R.drawable.flag_tonga),
        CountryItem("Trinidad and Tobago", "+1 868", "TT", R.drawable.flag_trinidad_and_tobago),
        CountryItem("Tunisia", "+216", "TN", R.drawable.flag_tunisia),
        CountryItem("Turkey", "+90", "TR", R.drawable.flag_turkey),
        CountryItem("Turkmenistan", "+993", "TM", R.drawable.flag_turkmenistan),
        CountryItem("Turks and Caicos Islands", "+1 649", "TC", R.drawable.flag_turks_and_caicos_islands),
        CountryItem("Tuvalu", "+688", "TV", R.drawable.flag_tuvalu),
        CountryItem("Uganda", "+256", "UG", R.drawable.flag_uganda),
        CountryItem("Ukraine", "+380", "UA", R.drawable.flag_ukraine),
        CountryItem("United Arab Emirates", "+971", "AE", R.drawable.flag_saudi_arabia),
        CountryItem("United Kingdom", "+44", "GB", R.drawable.flag_united_kingdom),
        CountryItem("United States", "+1", "US", R.drawable.flag_united_states_of_america),
        CountryItem("Uruguay", "+598", "UY", R.drawable.flag_uruguay),
        CountryItem("Uzbekistan", "+998", "UZ", R.drawable.flag_uzbekistan),
        CountryItem("Vanuatu", "+678", "VU", R.drawable.flag_vanuatu),
        CountryItem("Venezuela, Bolivarian Republic of", "+58", "VE", R.drawable.flag_venezuela),
        CountryItem("Viet Nam", "+84", "VN", R.drawable.flag_vietnam),
        CountryItem("Virgin Islands, British", "+1 284", "VG", R.drawable.flag_british_virgin_islands),
        CountryItem("Virgin Islands, U.S.", "+1 340", "VI", R.drawable.flag_us_virgin_islands),
        CountryItem("Wallis and Futuna", "+681", "WF", R.drawable.flag_wallis_and_futuna),
        CountryItem("Yemen", "+967", "YE", R.drawable.flag_yemen),
        CountryItem("Zambia", "+260", "ZM", R.drawable.flag_zambia),
        CountryItem("Zimbabwe", "+263", "ZW", R.drawable.flag_zimbabwe)
    )
}