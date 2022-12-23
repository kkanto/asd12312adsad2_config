 
listView('asd12312adsad2 Jobs') {
    description('asd12312adsad2 Jobs')
    jobs {
        regex('asd12312adsad2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
