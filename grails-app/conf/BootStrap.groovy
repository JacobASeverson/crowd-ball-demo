import com.objectpartners.crowdball.atbat.AtBat
import com.objectpartners.crowdball.atbat.Pitch
import com.objectpartners.crowdball.atbat.Result
import com.objectpartners.crowdball.game.Game
import com.objectpartners.crowdball.game.GameEntry
import com.objectpartners.crowdball.game.Inning
import com.objectpartners.crowdball.player.Player
import com.objectpartners.crowdball.team.Team
import com.objectpartners.crowdball.user.Role
import com.objectpartners.crowdball.user.User
import com.objectpartners.crowdball.user.UserRole

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                /**************** TEAMS ****************/
                log.info "Creating teams for development..."
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
                log.info "Creating players for development..."
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

                Player kyleGibson = new Player (
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

                Player brianDozier = new Player (
                        firstName: 'Brian',
                        lastName: 'Dozier',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Eduardo',
                        lastName: 'Escobar',
                        team: twins
                ).save(flush: true)

                Player joeMauer = new Player (
                        firstName: 'Joe',
                        lastName: 'Mauer',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Eduardo',
                        lastName: 'Nunez',
                        team: twins
                ).save(flush: true)

                Player trevorPlouffe = new Player (
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

                Player eddieRosario = new Player (
                        firstName: 'Eddie',
                        lastName: 'Rosario',
                        team: twins
                ).save(flush: true)

                new Player (
                        firstName: 'Miguel',
                        lastName: 'Sano',
                        team: twins
                ).save(flush: true)

                Player jakeArrieta = new Player (
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

                Player miguelMontero = new Player (
                        firstName: 'Miguel',
                        lastName: 'Montero',
                        team: cubs
                ).save(flush: true)

                Player krisBryant = new Player (
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

                Player anthonyRizzo = new Player (
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

                Player dexterFowler = new Player (
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
                log.info "Creating results for development..."
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

                Result out = new Result (
                        type: 'O',
                        display: 'Out'
                ).save(flush: true)

                Result single = new Result (
                        type: '1B',
                        display: 'Single'
                ).save(flush: true)

                Result doubleResult = new Result (
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

                /**************** SECURITY ******************/
                log.info "Creating a user and security for development..."
                Role roleUser = new Role("ROLE_USER").save(flush: true)
                User userJacob = new User('jacob', 'crowdball').save(flush: true)
                new UserRole(userJacob, roleUser).save(flush: true)

                /**************** GAMES ****************/
                AtBat atBat1 = new AtBat(pitcher: kyleGibson, batter: dexterFowler)
                atBat1.addToPitches(new Pitch(type: 'Fastball', speed: 92.4, pitchResult: 'Called Strike'))
                atBat1.addToPitches(new Pitch(type: 'Fastball', speed: 92.3, pitchResult: 'Called Strike'))
                atBat1.addToPitches(new Pitch(type: 'Slider', speed: 82.1, pitchResult: 'Ball'))
                atBat1.addToPitches(new Pitch(type: 'Changeup', speed: 83.8, pitchResult: 'Swinging Strike'))
                atBat1.result = out
                atBat1.save(flush: true)

                AtBat atBat2 = new AtBat(pitcher: kyleGibson, batter: anthonyRizzo).save(flush: true)
                atBat2.addToPitches(new Pitch(type: 'Fastball', speed: 93.6, pitchResult: 'Ball'))
                atBat2.addToPitches(new Pitch(type: 'Fastball', speed: 92.6, pitchResult: 'Called Strike'))
                atBat2.addToPitches(new Pitch(type: 'Slider', speed: 85.7, pitchResult: 'Ball'))
                atBat2.addToPitches(new Pitch(type: 'Fastball', speed: 93.2, pitchResult: 'In Play'))
                atBat2.result = single
                atBat2.save(flush: true)

                AtBat atBat3 = new AtBat(pitcher: kyleGibson, batter: krisBryant).save(flush: true)
                atBat3.addToPitches(new Pitch(type: 'Fastball', speed: 92.9, pitchResult: 'Ball'))
                atBat3.addToPitches(new Pitch(type: 'Slider', speed: 85.9, pitchResult: 'In Play'))
                atBat3.result = out
                atBat3.save(flush: true)

                AtBat atBat4 = new AtBat(pitcher: kyleGibson, batter: miguelMontero).save(flush: true)
                atBat4.addToPitches(new Pitch(type: 'Fastball', speed: 92.9, pitchResult: 'Foul'))
                atBat4.addToPitches(new Pitch(type: 'Fastball', speed: 92.0, pitchResult: 'Swinging Strike'))
                atBat4.addToPitches(new Pitch(type: 'Changeup', speed: 84.0, pitchResult: 'Ball'))
                atBat4.addToPitches(new Pitch(type: 'Fastball', speed: 86.9, pitchResult: 'Ball'))
                atBat4.addToPitches(new Pitch(type: 'Slider', speed: 87.5, pitchResult: 'Ball'))
                atBat4.addToPitches(new Pitch(type: 'Fastball', speed: 93.3, pitchResult: 'Called Strike'))
                atBat4.result = out
                atBat4.save(flush: true)

                AtBat atBat5 = new AtBat(pitcher: jakeArrieta, batter: brianDozier).save(flush: true)
                atBat5.addToPitches(new Pitch(type: 'Fastball', speed: 94.0, pitchResult: 'Called Strike'))
                atBat5.addToPitches(new Pitch(type: 'Curveball', speed: 81.4, pitchResult: 'Ball'))
                atBat5.addToPitches(new Pitch(type: 'Slider', speed: 91.2, pitchResult: 'Ball'))
                atBat5.addToPitches(new Pitch(type: 'Fastball', speed: 95.1, pitchResult: 'In Play'))
                atBat5.result = single
                atBat5.save(flush: true)

                AtBat atBat6 = new AtBat(pitcher: jakeArrieta, batter: eddieRosario).save(flush: true)
                atBat6.addToPitches(new Pitch(type: 'Slider', speed: 95.6, pitchResult: 'Foul'))
                atBat6.addToPitches(new Pitch(type: 'Slider', speed: 92.0, pitchResult: 'Foul'))
                atBat6.addToPitches(new Pitch(type: 'Curveball', speed: 82.7, pitchResult: 'Ball'))
                atBat6.addToPitches(new Pitch(type: 'Curveball', speed: 80.7, pitchResult: 'Foul'))
                atBat6.addToPitches(new Pitch(type: 'Fastball', speed: 95.5, pitchResult: 'Foul'))
                atBat6.addToPitches(new Pitch(type: 'Slider', speed: 91.7, pitchResult: 'In Play'))
                atBat6.result = out
                atBat6.save(flush: true)

                AtBat atBat7 = new AtBat(pitcher: jakeArrieta, batter: joeMauer).save(flush: true)
                atBat7.addToPitches(new Pitch(type: 'Fastball', speed: 94.6, pitchResult: 'Called Strike'))
                atBat7.addToPitches(new Pitch(type: 'Curveball', speed: 80.8, pitchResult: 'Ball'))
                atBat7.addToPitches(new Pitch(type: 'Changeup', speed: 90.0, pitchResult: 'Ball'))
                atBat7.addToPitches(new Pitch(type: 'Fastball', speed: 96.0, pitchResult: 'Foul'))
                atBat7.addToPitches(new Pitch(type: 'Curveball', speed: 80.8, pitchResult: 'Ball'))
                atBat7.addToPitches(new Pitch(type: 'Slider', speed: 92.4, pitchResult: 'In Play'))
                atBat7.result = doubleResult
                atBat7.save(flush: true)

                AtBat atBat8 = new AtBat(pitcher: jakeArrieta, batter: trevorPlouffe).save(flush: true)
                atBat8.addToPitches(new Pitch(type: 'Slider', speed: 92.7, pitchResult: 'Ball'))
                atBat8.addToPitches(new Pitch(type: 'Slider', speed: 90.4, pitchResult: 'Ball'))
                atBat8.addToPitches(new Pitch(type: 'Slider', speed: 93.1, pitchResult: 'Called Strike'))
                atBat8.addToPitches(new Pitch(type: 'Curveball', speed: 81.4, pitchResult: 'In Play'))
                atBat8.result = out
                atBat8.save(flush: true)

                Inning first = new Inning(number: 1)
                first.addToAtBats(atBat1)
                first.addToAtBats(atBat2)
                first.addToAtBats(atBat3)
                first.addToAtBats(atBat4)
                first.addToAtBats(atBat5)
                first.addToAtBats(atBat6)
                first.addToAtBats(atBat7)
                first.addToAtBats(atBat8)
                first.save(flush: true)

                Game jacobGame = new Game(home: twins, away: cubs, date: new Date(2015, 5, 21))
                jacobGame.addToInnings(first)
                jacobGame.addToInnings(new Inning(number: 2))
                jacobGame.addToInnings(new Inning(number: 3))
                jacobGame.addToInnings(new Inning(number: 4))
                jacobGame.addToInnings(new Inning(number: 5))
                jacobGame.addToInnings(new Inning(number: 6))
                jacobGame.addToInnings(new Inning(number: 7))
                jacobGame.addToInnings(new Inning(number: 8))
                jacobGame.addToInnings(new Inning(number: 9))
                jacobGame.save(flush: true)

                new GameEntry(user: userJacob, game: jacobGame).save(flush: true)
            }
        }
    }
    def destroy = {}
}
