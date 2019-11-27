/**
 * 
 */

function ResidentialAddress(r) {
  if(r.restoo.checked == true) {
    r.paddr1.value = r.raddr1.value;
    r.paddr2.value = r.raddr2.value;
    r.plandmark.value = r.rlandmark.value;
    r.pstate.value = r.rstate.value;
    r.pcity.value = r.rcity.value;
    r.ppincode.value = r.rpincode.value;
  }
}