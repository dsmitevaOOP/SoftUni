<!DOCTYPE html>
<?php
if(isset($_POST['firstName']) && isset($_POST['secondName']) && isset($_POST['email-add']) && isset($_POST['phone']) &&
    isset($_POST['gender']) && isset($_POST['date']) && isset($_POST['nation']) && isset($_POST['cn']) && isset($_POST['from']) &&
    isset($_POST['to']) && isset($_POST['progLanguages']) && isset($_POST['comprehension']) && isset($_POST['reading']) &&
    isset($_POST['writing'])) {

    $firstName = $_POST['firstName'];
    $lastName = $_POST['secondName'];
    $email = $_POST['email-add'];
    $phone = $_POST['phone'];
    $gender = $_POST['gender'];
    $birthDate = $_POST['date'];
    $nationality = $_POST['nation'];
    $company = $_POST['cn'];
    $workedFrom = $_POST['from'];
    $workedTo = $_POST['to'];
    $programmingLanguage = $_POST['progLanguages'];
    $levelProgramming = $_POST['level'];
    $speakingLanguages = $_POST['language-text'];
    $comprehension = $_POST['comprehension'];
    $reading = $_POST['reading'];
    $writing = $_POST['writing'];
    $bCategory = ''; $cCategory = ''; $aCategory = '';
    if(isset($_POST['bCategory'])) {
        $bCategory = 'B';
    }
    if(isset($_POST['aCategory'])) {
        $aCategory = 'A';
    }
    if(isset($_POST['cCategory'])) {
        $cCategory = 'C';
    }
    if(!preg_match('/[^A-Za-z]/', $firstName) && !preg_match('/[^A-Za-z]/', $lastName)
        && !preg_match('/[^A-Za-z0-9 ]/', $company) && strlen($firstName) <= 20 && strlen($firstName) >= 2 &&
        strlen($lastName) <= 20 && strlen($lastName) >= 2 &&
        strlen($company) <= 20 && strlen($company) >= 2 &&
        !preg_match("/^[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/", $birthDate) &&
        !preg_match('/[^0-9\+\-\s]/', $phone)
    ) {
        $personalInfoTable = '<table><thead><tr><th colspan="2">Personal Information</th></tr></thead><tbody>' .
            '<tr><td>First Name</td><td>' . $firstName . '</td></tr><td>Last Name</td><td>' . $lastName  . '</td></tr>' .
            '<tr><td>Email</td><td>' . $email . '</td></tr>' .
            '<tr><td>Phone</td><td>' . $phone . '</td></tr>' .
            '<tr><td>Gender</td><td>' . $gender . '</td></tr>' .
            '<tr><td>Birth Date</td><td>' . $birthDate . '</td></tr>' .
            '<tr><td>Nationality</td><td>' . $nationality . '</td></tr></tbody></table>';
        $lastWorkTable = '<table><thead><tr><th colspan="2">Last Work Position</th></tr></thead><tbody>' .
            '<tr><td>Company Name</td><td>' . $company . '</td></tr>' .
            '<tr><td>From</td><td>' . $workedFrom . '</td></tr>' .
            '<tr><td>To</td><td>' . $workedTo . '</td></tr></tbody></table>';
        $computerSkillsTable = '<table><thead><tr><th colspan="2">Computer Skills</th></tr></thead><tbody>' .
            '<tr><td>Programming Languages</td><td><table><thead><tr><th>Language</th><th>Skill Level</th></tr></thead>' .
            '<tbody>';
        for($i = 0; $i < count($levelProgramming) ;$i++) {
            $computerSkillsTable .= '<tr>';
            $computerSkillsTable .= '<td>' . $programmingLanguage[$i] . '</td>';
            $computerSkillsTable .= '<td>' . $levelProgramming[$i] . '</td>';
            $computerSkillsTable .= '</tr>';

        }
        $computerSkillsTable .= '</tbody></table></tr></tbody></table>';

        $otherSkills = '<table><thead><tr><th colspan="2">Other Skills</th></tr></thead><tbody>' .
            '<tr><td>Languages</td><td><table><thead><th>Language</th><th>Comprehension</th>' .
            '<th>Reading</th><th>Writing</th></tr>';

        for($i = 0; $i < count($comprehension) ;$i++) {
            $otherSkills .= '<tr>';
            $otherSkills .= '<td>' . $speakingLanguages[$i] . '</td>';
            $otherSkills .= '<td>' . $comprehension[$i] . '</td>';
            $otherSkills .= '<td>' . $reading[$i] . '</td>';
            $otherSkills .= '<td>' . $writing[$i] . '</td>';
        }
        $otherSkills .= '</tbody></table></tr><tr><td>Driver`s License</td><td>' . $bCategory . " ".  $aCategory. "" . $cCategory .'</td></tr>';
        $otherSkills .= '</tbody></table>';
    }

}
?>
<html>
<head>
    <title>CV Generator</title>
    <style>
        div#container {
            display:inline-block;
            width: 35%;
        }
        div.forms {
            width:100%;
            padding:10px;
            border:1px solid black;
        }
        div#result {
            display:inline-block;
            width:500px;
            vertical-align:top;
            margin-left:80px;
        }
        table {
            border:1px solid black;
            margin-bottom:30px;
        }
        th, td {
            border:1px solid black;
            padding:5px;
        }
    </style>
    <script>
        var idCounter = 0;
        function addProgLang() {
            var myDiv = document.createElement("div");
            myDiv.setAttribute("id", "inputBox" + idCounter);
            idCounter++;
            myDiv.innerHTML = '<input type="text" name="progLanguages[]" id="prog-langs" required="true"/>' +
                '<select name="level[]" id="level" required="true">' +
                '<option value="Beginner">Beginner</option>' +
                '<option value="Programmer">Programmer</option>' +
                '<option value="Ninja">Ninja</option>' +
                '</select>' +
                '<br/>';
            document.getElementById("parent-prog-lang").appendChild(myDiv);
        }

        function removeProgLang() {
            var getChild = document.getElementById("parent-prog-lang").lastChild;
            if(getChild.id != "inputBox0") {
                document.getElementById("parent-prog-lang").removeChild(getChild);
            }
        }

        var idLangCounter = 0;
        function addSpeakingLang() {
            var langParent = document.getElementById("speaking-lang-parent");
            var newDiv = document.createElement("div");
            newDiv.setAttribute("id", "lang" + idLangCounter);
            idLangCounter++;
            newDiv.innerHTML = '<input type="text" id="lang" name="language-text[]" required="true"/>' +
                '<select name="comprehension[]" id="comprehension" required="true">'+
                '<option value="default" disabled selected>-Comprehension-</option>' +
                '<option value="beginner">beginner</option>' +
                '<option value="intermediate">intermediate</option>' +
                '<option value="advanced">advanced</option>' +
                '</select>' +
                '<select name="reading[]" id="reading" required="true">' +
                '<option value="default" disabled selected>-Reading-</option>' +
                '<option value="beginner">beginner</option>' +
                '<option value="intermediate">intermediate</option>' +
                '<option value="advanced">advanced</option>' +
                ' </select>' +
                ' <select name="writing[]" id="writing">' +
                '<option value="default" disabled selected required="true">-Writing-</option>' +
                ' <option value="beginner">beginner</option>' +
                '<option value="intermediate">intermediate</option>'+
                '<option value="advanced">advanced</option>'+
                '</select>'+
                ' <br/>';

            langParent.appendChild(newDiv);
        }
        function removeSpeakingLang() {
            var lastElement = document.getElementById('speaking-lang-parent').lastChild;
            if(lastElement.id != "lang0") {
                document.getElementById("speaking-lang-parent").removeChild(lastElement);
            }
        }
    </script>
</head>
<body>
<div id="container">
    <form action="_05_CVGenerator.php" method="post" id="CV-form" name="mainForm">
        <h2>Personal Information</h2>
        <div class="forms">
            <input type="text" name="firstName" id="first-name" placeholder="First Name" required="true"/><br/>
            <input type="text" name="secondName" id="second-name" placeholder="Last Name" required="true"/><br/>
            <input type="email" name="email-add" id="email" placeholder="Email" required="true"/><br/>
            <input type="tel" name="phone" id="phone" placeholder="Phone Number" required="true"/><br/>
            <label for="female">Female</label>
            <input type="radio" name="gender" id="female" value="female" required="true"/>
            <label for="male">Male</label>
            <input type="radio" name="gender" id="male" value="male" required="true"/><br/>
            <label for="date">Birth Date</label><br/>
            <input type="text" name="date" id="date" placeholder="yyyy/mm/dd" required="true"/><br/>
            <label for="nation">Nationality</label><br/>
            <select name="nation" id="nation" required="true">
                <option value="Bulgarian">Bulgarian</option>
                <option value="Ukranian">Ukranian</option>
                <option value="Sweden">Sweden</option>
                <option value="USA">USA</option>
            </select>
        </div>
        <h2>Last Work Positon</h2>
        <div class="forms">
            <label for="comp-name">Company Name</label>
            <input type="text" name="cn" id="comp-name" required="true"/><br/>
            <label for="from">From</label>
            <input type="text" id="from" name="from" placeholder="yyyy/mm/dd" required="true"/><br/>
            <label for="from">To</label>
            <input type="text" id="to" name="to" placeholder="yyyy/mm/dd" required="true"/><br/>
        </div>
        <h2>Computer Skills</h2>
        <div class="forms">
            <label for="prog-langs">Programming Languages</label><br/>
            <div id="parent-prog-lang">

            </div>
            <script>addProgLang();</script>
            <input type="button" name="remove-item" id="remove" value="Remove Language" onclick="removeProgLang()"/>
            <input type="button" name="progLang[]" id="add" value="Add Language" onclick="addProgLang()"/>
        </div>
        <h2>Other Skills</h2>
        <div class="forms">
            <label for="lang">Languages</label><br/>
            <div id="speaking-lang-parent">

            </div>
            <script> addSpeakingLang();</script>
            <input type="button" id="remove-lang" name="remove-lang" value="Remove Language" onclick="removeSpeakingLang()"/>
            <input type="button" id="remove-lang" name="remove-lang" value="Add Language" onclick="addSpeakingLang()"/><br/>
            <label for="driver">Driver`s License</label><br/>
            <label for="b-category">B</label>
            <input type="checkbox" name="bCategory" id="b-category"/>
            <label for="b-category">A</label>
            <input type="checkbox" name="aCategory" id="a-category"/>
            <label for="b-category">C</label>
            <input type="checkbox" name="cCategory" id="c-category"/>
        </div>
        <input type="submit" name="submit-cv" id="submitBtn" onclick="submitAll()"/>
    </form>
</div>
<div id="result">
    <?php
    if(isset($personalInfoTable) && isset($lastWorkTable) && isset($computerSkillsTable) && $otherSkills) {
        echo $personalInfoTable;
        echo $lastWorkTable;
        echo $computerSkillsTable;
        echo $otherSkills;
    }
    else {
        echo "Please enter a valid information to generate your CV";
    }
    ?>
</div>
</body>
</html>