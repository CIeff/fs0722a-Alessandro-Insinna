for(let i=0;i<=10;i++)
            {
                document.write(i);
            }

                                                            document.write("<hr>");


for(let i=10;i>=1;i--)
            {
                document.write(i);
            }
            
                                                            document.write("<hr>");


// FOR APPLICATO AGLI ARRAY

let animali=["gatto ","cane ","anatra ","orso "];

for(i=0;i<animali.length;i++)
            {
                document.write(animali[i]);
            }

                                                             document.write("<hr>");

let  numeri=[0,1,2,3,4,5,6,7,8,9];
let somma=0;
for(i=0;i<numeri.length;i++)
            {
                somma+=numeri[i];
            }
document.write("somma: "+somma);

                                                            document.write("<hr>");


console.log(numeri.reduce((c,p)=>c+p));


                                                            document.write("<hr>");

                                                    

