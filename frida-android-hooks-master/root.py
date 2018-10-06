import frida
import sys

package_name = "com.github.piasy.fridademo"


def get_messages_from_js(message, data):
            print(message)
            print (message['payload'])
 

def instrument_root_checks():

        hook_code = """
        setTimeout(function(){
        Java.perform(function () {

            var TM = Java.use("com.github.piasy.fridademo.RootCheck");

            TM.isPhoneRooted.implementation = function () {

                send("Called - isPhoneRooted()");

                return false;

            };

        });

    },0);
        """

        return hook_code

process = frida.get_device_manager().enumerate_devices()[-1].attach(package_name)
script = process.create_script(instrument_root_checks())
script.on('message',get_messages_from_js)
script.load()
sys.stdin.read()
              