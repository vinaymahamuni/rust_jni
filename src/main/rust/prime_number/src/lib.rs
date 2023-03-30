use jni::objects::JClass;
use jni::JNIEnv;
use jni::sys::jint;

pub type Jint = u32;
pub type JBool = bool;

fn is_prime<'a>(number: Jint) -> JBool {
    if number < 2 {
        return false;
    }
    for divisor in 2..(number) {
        if number % divisor == 0 {
            return false;
        }
    }
    return true;
}

#[no_mangle]
pub extern "system" fn Java_org_e4r_PrimeNumber_getCount<'local>(
    _env: JNIEnv<'local>,
    _class: JClass<'local>,
    range: Jint,
) -> Jint {
    let mut prime_number_count: Jint = 0;
    for number in 1..=range {
        if is_prime(number) {
            prime_number_count += 1;
        }
    }
    return prime_number_count;
}

// #[no_mangle]
// pub extern "system" fn Java_multiply_Main_timesRust<'local>(
//     env: JNIEnv<'local>,
//     obj: JClass<'local>,
//     multiplier: jint,
// ) -> jint {
//     let state = env.get_field(obj, "state", "I");
//     state.unwrap().i().unwrap() * multiplier
// }