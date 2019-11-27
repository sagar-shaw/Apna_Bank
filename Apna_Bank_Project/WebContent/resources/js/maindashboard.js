/**
 * 
 */



// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } else {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

// Close the sidebar with the close button
function w3_close() {
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}

// <!-- Tab Content for displaying code in the same block without refresing the whole window -->

    function openCity(evt, cityName) {
      var i, tabcontent, tablinks;
      tabcontent = document.getElementsByClassName("tabcontent");
      for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
      }
      tablinks = document.getElementsByClassName("tablinks");
      for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
      }
      document.getElementById(cityName).style.display = "block";
      evt.currentTarget.className += " active";
    }


        function testpass(){
          
        var firstnumber=document.form_action.password1.value;
        var secondnumber=document.form_action.password2.value;
        if(firstnumber == secondnumber)
        {
          alert("Password Changed Successfully");
         // return myFunction();
        }
        else
        {
            alert("Password entered/re-entered Incorrectly!");
            return document.getElementById("passform").reset(); 
        }
       
        }
       



        function testacc(){
          
          var firstnumber1=document.beneficiary.accountNo1.value;
        var secondnumber2=document.beneficiary.accountNo2.value;
         
          if(firstnumber1 == secondnumber2)
          {
            alert("Beneficiary Added Successfully");
           // return myFunction();
          }
          else
          {
              alert("Account Number entered/re-entered Incorrectly!");
              return document.getElementById("beneform").reset(); 
          }
         
          }


        function userID()
        {
          alert("ID changed Successfully");
        }

        // <!-- snackbar -->
       
                function myFunction() {
                  var x = document.getElementById("snackbar");
                  x.className = "show";
                  setTimeout(function(){ x.className = x.className.replace("show", ""); }, 6000);
               
                }
              // Set timeout variables.
var timoutWarning = 300000; // Display warning in 14 Mins.
var timoutNow = 200000; // Timeout in 15 mins.
var logoutUrl = 'loggedout.jsp'; // URL to logout page.

var warningTimer;
var timeoutTimer;

// Start timers.
function StartTimers() {
    warningTimer = setTimeout("IdleWarning()", timoutWarning);
    timeoutTimer = setTimeout("IdleTimeout()", timoutNow);
}

// Reset timers.
function ResetTimers() {
    clearTimeout(warningTimer);
    clearTimeout(timeoutTimer);
    StartTimers();
    $("#timeout").dialog('close');
}

// Show idle timeout warning dialog.
function IdleWarning() {
    $("#timeout").dialog({
        modal: true
    });
}

// Logout the user.
function IdleTimeout() {
    window.location = logoutUrl;
}
        
function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};