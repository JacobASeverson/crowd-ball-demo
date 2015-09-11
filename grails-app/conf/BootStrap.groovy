import com.objectpartners.crowdball.atbat.Result
import com.objectpartners.crowdball.player.Player
import com.objectpartners.crowdball.team.Team

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                /**************** TEAMS ****************/
                Team twins = new Team (
                        name: 'Twins',
                        country: 'United States',
                        city: 'Minneapolis',
                        state: 'Minnesota'
                ).save(flush: true)

                Team cubs = new Team (
                        name: 'Cubs',
                        country: 'United States',
                        city: 'Chicago',
                        state: 'Illinois'
                ).save(flush: true)

                /**************** PLAYERS ****************/
                new Player (
                        firstName: 'Blaine',
                        lastName: 'Boyer',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Neal',
                        lastName: 'Cotts',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Brian',
                        lastName: 'Duensing',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Tyler',
                        lastName: 'Duffey',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Casey',
                        lastName: 'Fien',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Kyle',
                        lastName: 'Gibson',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Kevin',
                        lastName: 'Jepson',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Trevor',
                        lastName: 'May',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Tommy',
                        lastName: 'Milone',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Ryan',
                        lastName: "O'Rourke",
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Mike',
                        lastName: 'Pelfrey',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Glen',
                        lastName: 'Perkins',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Ervin',
                        lastName: 'Santana',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Chris',
                        lastName: 'Herrman',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Kurt',
                        lastName: 'Suzuki',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Brian',
                        lastName: 'Dozier',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Eduardo',
                        lastName: 'Escobar',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Joe',
                        lastName: 'Mauer',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Eduardo',
                        lastName: 'Nunez',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Trevor',
                        lastName: 'Plouffe',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Byron',
                        lastName: 'Buxton',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Torii',
                        lastName: 'Hunter',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Shane',
                        lastName: 'Robinson',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Eddie',
                        lastName: 'Rosario',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Miguel',
                        lastName: 'Sano',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Jake',
                        lastName: 'Arrieta',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Justin',
                        lastName: 'Grimm',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Jason',
                        lastName: 'Hammel',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Dan Haren',
                        lastName: '',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Kyle',
                        lastName: 'Hendricks',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Tommy',
                        lastName: 'Hunter',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Jon',
                        lastName: 'Lester',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Clayton',
                        lastName: 'Richard',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Fernando',
                        lastName: 'Rodney',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Hector',
                        lastName: 'Rondon',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'James',
                        lastName: 'Russel',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Pedro',
                        lastName: 'Strop',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Travis',
                        lastName: 'Wood',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Miguel',
                        lastName: 'Montero',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Kris',
                        lastName: 'Bryant',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Starlin',
                        lastName: 'Castro',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Jonathan',
                        lastName: 'Herrera',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Tommy',
                        lastName: 'La Stella',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Anthony',
                        lastName: 'Rizzo',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Addison',
                        lastName: 'Russel',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Chris',
                        lastName: 'Coghlan',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Chris',
                        lastName: 'Denorfia',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Dexter',
                        lastName: 'Fowler',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Kyle',
                        lastName: 'Schwarber',
                        team: cubs
                ).save(flush: true)

                new Player (
                        firstName: 'Matt',
                        lastName: 'Szczur',
                        team: cubs
                ).save(flush: true)

                /**************** RESULTS ****************/
                new Result (
                        type: 'SF',
                        display: 'Sacrifice Fly'
                ).save(flush: true)

                new Result (
                        type: 'HBP',
                        display: 'Hit By Pitch'
                ).save(flush: true)

                new Result (
                        type: 'BB',
                        display: 'Base on Balls'
                ).save(flush: true)

                new Result (
                        type: 'SD',
                        display: 'Safe on Dropped 3rd Strike'
                ).save(flush: true)

                new Result (
                        type: 'SE',
                        display: 'Safe on Error'
                ).save(flush: true)

                new Result (
                        type: 'O',
                        display: 'Out'
                ).save(flush: true)

                new Result (
                        type: '1B',
                        display: 'Single'
                ).save(flush: true)

                new Result (
                        type: '2B',
                        display: 'Double'
                ).save(flush: true)

                new Result (
                        type: '3B',
                        display: 'Triple'
                ).save(flush: true)

                new Result (
                        type: 'HR',
                        display: 'Home Run'
                ).save(flush: true)
            }
        }
    }
    def destroy = {
    }
}
