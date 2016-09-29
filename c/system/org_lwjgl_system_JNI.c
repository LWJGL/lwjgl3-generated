/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

#ifdef LWJGL_WINDOWS
	#define APIENTRY __stdcall
	__pragma(warning(disable : 4711))
#else
	#define APIENTRY
#endif

#define _p_ ,
#define ARITY0(type, signature, expression) \
JNIEXPORT type JNICALL Java_org_lwjgl_system_JNI_##signature(JNIEnv *__env, jclass clazz, jlong __functionAddress) { \
	UNUSED_PARAMS(__env, clazz) \
	expression; \
}

#define ARITYn(type, signature, params, expression) \
JNIEXPORT type JNICALL Java_org_lwjgl_system_JNI_##signature(JNIEnv *__env, jclass clazz, jlong __functionAddress, params) { \
	UNUSED_PARAMS(__env, clazz) \
	expression; \
}

ARITYn(jbyte, invokePB__JJ, jlong param0, return ((jbyte (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0))
ARITY0(jdouble, invokeD__J, return ((jdouble (*) ())(intptr_t)__functionAddress)())
ARITYn(jdouble, invokeD__JI, jint param0, return ((jdouble (*) (jint))(intptr_t)__functionAddress)(param0))
ARITYn(jfloat, invokeF__JI, jint param0, return ((jfloat (*) (jint))(intptr_t)__functionAddress)(param0))
ARITY0(jint, invokeI__J, return ((jint (*) ())(intptr_t)__functionAddress)())
ARITYn(jint, invokeI__JB, jbyte param0, return ((jint (*) (jbyte))(intptr_t)__functionAddress)(param0))
ARITYn(jint, invokeI__JBSIZ, jbyte param0 _p_ jshort param1 _p_ jint param2 _p_ jboolean param3, return ((jint (*) (jbyte, jshort, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(jint, invokeI__JBSSIZ, jbyte param0 _p_ jshort param1 _p_ jshort param2 _p_ jint param3 _p_ jboolean param4, return ((jint (*) (jbyte, jshort, jshort, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(jint, invokeI__JBSSSSB, jbyte param0 _p_ jshort param1 _p_ jshort param2 _p_ jshort param3 _p_ jshort param4 _p_ jbyte param5, return ((jint (*) (jbyte, jshort, jshort, jshort, jshort, jbyte))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITYn(jint, invokeI__JBSSSSIZ, jbyte param0 _p_ jshort param1 _p_ jshort param2 _p_ jshort param3 _p_ jshort param4 _p_ jint param5 _p_ jboolean param6, return ((jint (*) (jbyte, jshort, jshort, jshort, jshort, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6))
ARITYn(jint, invokeI__JI, jint param0, return ((jint (*) (jint))(intptr_t)__functionAddress)(param0))
ARITYn(jint, invokePPI__JIJIJIZ, jint param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jboolean param5, return ((jint (*) (jint, intptr_t, jint, intptr_t, jint, jboolean))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, param4, param5))
ARITYn(jint, invokePI__JJ, jlong param0, return ((jint (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0))
ARITYn(jint, invokePI__JJI, jlong param0 _p_ jint param1, return ((jint (*) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(jint, invokePPI__JJJ, jlong param0 _p_ jlong param1, return ((jint (*) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1))
ARITYn(jint, invokePPI__JJJI, jlong param0 _p_ jlong param1 _p_ jint param2, return ((jint (*) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2))
ARITYn(jint, invokePPPI__JJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2, return ((jint (*) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2))
ARITYn(jint, invokePPPPI__JJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, return ((jint (*) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(jint, invokePPPPPI__JJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, return ((jint (*) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jint, invokePPPPPPI__JJJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, return ((jint (*) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jint, invokePI__JJS, jlong param0 _p_ jshort param1, return ((jint (*) (intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(jint, invokeI__JS, jshort param0, return ((jint (*) (jshort))(intptr_t)__functionAddress)(param0))
ARITYn(jint, invokePI__JSBJ, jshort param0 _p_ jbyte param1 _p_ jlong param2, return ((jint (*) (jshort, jbyte, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2))
ARITYn(jint, invokePI__JSJ, jshort param0 _p_ jlong param1, return ((jint (*) (jshort, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1))
ARITYn(jint, invokeI__JZ, jboolean param0, return ((jint (*) (jboolean))(intptr_t)__functionAddress)(param0))
ARITY0(jlong, invokeJ__J, return ((jlong (*) ())(intptr_t)__functionAddress)())
ARITY0(jlong, invokeP__J, return (jlong)((intptr_t (*) ())(intptr_t)__functionAddress)())
ARITYn(jlong, invokeP__JI, jint param0, return (jlong)((intptr_t (*) (jint))(intptr_t)__functionAddress)(param0))
ARITYn(jlong, invokeP__JII, jint param0 _p_ jint param1, return (jlong)((intptr_t (*) (jint, jint))(intptr_t)__functionAddress)(param0, param1))
ARITYn(jlong, invokePPPP__JIIJJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, return (jlong)((intptr_t (*) (jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jlong, invokePP__JIJ, jint param0 _p_ jlong param1, return (jlong)((intptr_t (*) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1))
ARITYn(jlong, invokeP__JIS, jint param0 _p_ jshort param1, return (jlong)((intptr_t (*) (jint, jshort))(intptr_t)__functionAddress)(param0, param1))
ARITYn(jlong, invokePP__JJ, jlong param0, return (jlong)((intptr_t (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0))
ARITYn(jlong, invokePP__JJI, jlong param0 _p_ jint param1, return (jlong)((intptr_t (*) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(jlong, invokePP__JJII, jlong param0 _p_ jint param1 _p_ jint param2, return (jlong)((intptr_t (*) (intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(jlong, invokePP__JJIII, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3, return (jlong)((intptr_t (*) (intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3))
ARITYn(jlong, invokePPPP__JJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3, return (jlong)((intptr_t (*) (intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(jlong, invokePPP__JJJ, jlong param0 _p_ jlong param1, return (jlong)((intptr_t (*) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1))
ARITYn(jlong, invokePPP__JJJI, jlong param0 _p_ jlong param1 _p_ jint param2, return (jlong)((intptr_t (*) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2))
ARITYn(jlong, invokePPPPPP__JJJIIIIIIIJJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jint param8 _p_ jlong param9 _p_ jlong param10 _p_ jlong param11, return (jlong)((intptr_t (*) (intptr_t, intptr_t, jint, jint, jint, jint, jint, jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9, (intptr_t)param10, (intptr_t)param11))
ARITYn(jlong, invokePPPP__JJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2, return (jlong)((intptr_t (*) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2))
ARITYn(jlong, invokePPPP__JJJJI, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3, return (jlong)((intptr_t (*) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3))
ARITYn(jlong, invokePPPPP__JJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, return (jlong)((intptr_t (*) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(jlong, invokePPP__JJJZZ, jlong param0 _p_ jlong param1 _p_ jboolean param2 _p_ jboolean param3, return (jlong)((intptr_t (*) (intptr_t, intptr_t, jboolean, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3))
ARITYn(jlong, invokePPP__JJZZJ, jlong param0 _p_ jboolean param1 _p_ jboolean param2 _p_ jlong param3, return (jlong)((intptr_t (*) (intptr_t, jboolean, jboolean, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3))
ARITYn(jlong, invokePP__JSJ, jshort param0 _p_ jlong param1, return (jlong)((intptr_t (*) (jshort, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1))
ARITYn(jlong, invokeP__JSSSBII, jshort param0 _p_ jshort param1 _p_ jshort param2 _p_ jbyte param3 _p_ jint param4 _p_ jint param5, return (jlong)((intptr_t (*) (jshort, jshort, jshort, jbyte, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITY0(jshort, invokeS__J, return ((jshort (*) ())(intptr_t)__functionAddress)())
ARITYn(jshort, invokePS__JBJZ, jbyte param0 _p_ jlong param1 _p_ jboolean param2, return ((jshort (*) (jbyte, intptr_t, jboolean))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2))
ARITYn(jshort, invokeS__JI, jint param0, return ((jshort (*) (jint))(intptr_t)__functionAddress)(param0))
ARITYn(jshort, invokeS__JIII, jint param0 _p_ jint param1 _p_ jint param2, return ((jshort (*) (jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(jshort, invokePS__JIJS, jint param0 _p_ jlong param1 _p_ jshort param2, return ((jshort (*) (jint, intptr_t, jshort))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2))
ARITYn(jshort, invokeS__JIS, jint param0 _p_ jshort param1, return ((jshort (*) (jint, jshort))(intptr_t)__functionAddress)(param0, param1))
ARITYn(jshort, invokeS__JIZSII, jint param0 _p_ jboolean param1 _p_ jshort param2 _p_ jint param3 _p_ jint param4, return ((jshort (*) (jint, jboolean, jshort, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(jshort, invokePS__JJ, jlong param0, return ((jshort (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0))
ARITYn(jshort, invokePPS__JJIBJ, jlong param0 _p_ jint param1 _p_ jbyte param2 _p_ jlong param3, return ((jshort (*) (intptr_t, jint, jbyte, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3))
ARITYn(jshort, invokePS__JJIS, jlong param0 _p_ jint param1 _p_ jshort param2, return ((jshort (*) (intptr_t, jint, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(jshort, invokePPPS__JJJJSF, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jshort param3 _p_ jfloat param4, return ((jshort (*) (intptr_t, intptr_t, intptr_t, jshort, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, param4))
ARITYn(jshort, invokePPS__JJJS, jlong param0 _p_ jlong param1 _p_ jshort param2, return ((jshort (*) (intptr_t, intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2))
ARITYn(jshort, invokePS__JJS, jlong param0 _p_ jshort param1, return ((jshort (*) (intptr_t, jshort))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(jshort, invokePS__JJSSI, jlong param0 _p_ jshort param1 _p_ jshort param2 _p_ jint param3, return ((jshort (*) (intptr_t, jshort, jshort, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3))
ARITYn(jshort, invokePS__JSJS, jshort param0 _p_ jlong param1 _p_ jshort param2, return ((jshort (*) (jshort, intptr_t, jshort))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2))
ARITYn(jshort, invokeS__JSSII, jshort param0 _p_ jshort param1 _p_ jint param2 _p_ jint param3, return ((jshort (*) (jshort, jshort, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(jshort, invokeS__JSSSS, jshort param0 _p_ jshort param1 _p_ jshort param2 _p_ jshort param3, return ((jshort (*) (jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(jshort, invokePS__JSSSZIIJ, jshort param0 _p_ jshort param1 _p_ jshort param2 _p_ jboolean param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6, return ((jshort (*) (jshort, jshort, jshort, jboolean, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (intptr_t)param6))
ARITYn(jshort, invokeS__JSSZ, jshort param0 _p_ jshort param1 _p_ jboolean param2, return ((jshort (*) (jshort, jshort, jboolean))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(jshort, invokePS__JSSZSIIJ, jshort param0 _p_ jshort param1 _p_ jboolean param2 _p_ jshort param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6, return ((jshort (*) (jshort, jshort, jboolean, jshort, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (intptr_t)param6))
ARITYn(jshort, invokeS__JSZ, jshort param0 _p_ jboolean param1, return ((jshort (*) (jshort, jboolean))(intptr_t)__functionAddress)(param0, param1))
ARITYn(jshort, invokePS__JSZSIIJ, jshort param0 _p_ jboolean param1 _p_ jshort param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5, return ((jshort (*) (jshort, jboolean, jshort, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5))
ARITY0(void, invokeV__J, ((void (*) ())(intptr_t)__functionAddress)())
ARITYn(void, invokeV__JB, jbyte param0, ((void (*) (jbyte))(intptr_t)__functionAddress)(param0))
ARITYn(void, invokePV__JBBJ, jbyte param0 _p_ jbyte param1 _p_ jlong param2, ((void (*) (jbyte, jbyte, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2))
ARITYn(void, invokePV__JBJ, jbyte param0 _p_ jlong param1, ((void (*) (jbyte, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1))
ARITYn(void, invokePPV__JBJJ, jbyte param0 _p_ jlong param1 _p_ jlong param2, ((void (*) (jbyte, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2))
ARITYn(void, invokePPPV__JBJJBJ, jbyte param0 _p_ jlong param1 _p_ jlong param2 _p_ jbyte param3 _p_ jlong param4, ((void (*) (jbyte, intptr_t, intptr_t, jbyte, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4))
ARITYn(void, invokeV__JBS, jbyte param0 _p_ jshort param1, ((void (*) (jbyte, jshort))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, invokeV__JBSBSSSSBBSSSSSS, jbyte param0 _p_ jshort param1 _p_ jbyte param2 _p_ jshort param3 _p_ jshort param4 _p_ jshort param5 _p_ jshort param6 _p_ jbyte param7 _p_ jbyte param8 _p_ jshort param9 _p_ jshort param10 _p_ jshort param11 _p_ jshort param12 _p_ jshort param13 _p_ jshort param14, ((void (*) (jbyte, jshort, jbyte, jshort, jshort, jshort, jshort, jbyte, jbyte, jshort, jshort, jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14))
ARITYn(void, invokeV__JBSBSSSSBSSSSSS, jbyte param0 _p_ jshort param1 _p_ jbyte param2 _p_ jshort param3 _p_ jshort param4 _p_ jshort param5 _p_ jshort param6 _p_ jbyte param7 _p_ jshort param8 _p_ jshort param9 _p_ jshort param10 _p_ jshort param11 _p_ jshort param12 _p_ jshort param13, ((void (*) (jbyte, jshort, jbyte, jshort, jshort, jshort, jshort, jbyte, jshort, jshort, jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13))
ARITYn(void, invokeV__JBSFBBBBBBBBB, jbyte param0 _p_ jshort param1 _p_ jfloat param2 _p_ jbyte param3 _p_ jbyte param4 _p_ jbyte param5 _p_ jbyte param6 _p_ jbyte param7 _p_ jbyte param8 _p_ jbyte param9 _p_ jbyte param10 _p_ jbyte param11, ((void (*) (jbyte, jshort, jfloat, jbyte, jbyte, jbyte, jbyte, jbyte, jbyte, jbyte, jbyte, jbyte))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11))
ARITYn(void, invokeV__JBSI, jbyte param0 _p_ jshort param1 _p_ jint param2, ((void (*) (jbyte, jshort, jint))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, invokeV__JBSIFB, jbyte param0 _p_ jshort param1 _p_ jint param2 _p_ jfloat param3 _p_ jbyte param4, ((void (*) (jbyte, jshort, jint, jfloat, jbyte))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, invokeV__JBSSBI, jbyte param0 _p_ jshort param1 _p_ jshort param2 _p_ jbyte param3 _p_ jint param4, ((void (*) (jbyte, jshort, jshort, jbyte, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, invokeV__JBSSBII, jbyte param0 _p_ jshort param1 _p_ jshort param2 _p_ jbyte param3 _p_ jint param4 _p_ jint param5, ((void (*) (jbyte, jshort, jshort, jbyte, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITYn(void, invokeV__JBSSI, jbyte param0 _p_ jshort param1 _p_ jshort param2 _p_ jint param3, ((void (*) (jbyte, jshort, jshort, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, invokeV__JBSSSS, jbyte param0 _p_ jshort param1 _p_ jshort param2 _p_ jshort param3 _p_ jshort param4, ((void (*) (jbyte, jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, invokeV__JBZ, jbyte param0 _p_ jboolean param1, ((void (*) (jbyte, jboolean))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, invokeV__JD, jdouble param0, ((void (*) (jdouble))(intptr_t)__functionAddress)(param0))
ARITYn(void, invokeV__JF, jfloat param0, ((void (*) (jfloat))(intptr_t)__functionAddress)(param0))
ARITYn(void, invokeV__JI, jint param0, ((void (*) (jint))(intptr_t)__functionAddress)(param0))
ARITYn(void, invokeV__JIF, jint param0 _p_ jfloat param1, ((void (*) (jint, jfloat))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, invokeV__JIFFF, jint param0 _p_ jfloat param1 _p_ jfloat param2 _p_ jfloat param3, ((void (*) (jint, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, invokeV__JII, jint param0 _p_ jint param1, ((void (*) (jint, jint))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, invokeV__JIID, jint param0 _p_ jint param1 _p_ jdouble param2, ((void (*) (jint, jint, jdouble))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, invokeV__JIIDDD, jint param0 _p_ jint param1 _p_ jdouble param2 _p_ jdouble param3 _p_ jdouble param4, ((void (*) (jint, jint, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, invokeV__JIIF, jint param0 _p_ jint param1 _p_ jfloat param2, ((void (*) (jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, invokeV__JIIFFF, jint param0 _p_ jint param1 _p_ jfloat param2 _p_ jfloat param3 _p_ jfloat param4, ((void (*) (jint, jint, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, invokeV__JIII, jint param0 _p_ jint param1 _p_ jint param2, ((void (*) (jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, invokeV__JIIIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4, ((void (*) (jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, invokePPV__JIIIJJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4, ((void (*) (jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(void, invokePV__JIIJ, jint param0 _p_ jint param1 _p_ jlong param2, ((void (*) (jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2))
ARITYn(void, invokeJV__JIIJ, jint param0 _p_ jint param1 _p_ jlong param2, ((void (*) (jint, jint, jlong))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, invokePV__JIIJII, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4, ((void (*) (jint, jint, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4))
ARITYn(void, invokePPPV__JIIJJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, ((void (*) (jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(void, invokeJJJV__JIIJJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, ((void (*) (jint, jint, jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, invokePV__JIJ, jint param0 _p_ jlong param1, ((void (*) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1))
ARITYn(void, invokePPPPPV__JIJIJJJIJIZ, jint param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jint param6 _p_ jlong param7 _p_ jint param8 _p_ jboolean param9, ((void (*) (jint, intptr_t, jint, intptr_t, intptr_t, intptr_t, jint, intptr_t, jint, jboolean))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6, (intptr_t)param7, param8, param9))
ARITYn(void, invokePPPV__JIJJJ, jint param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, ((void (*) (jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(void, invokeV__JIS, jint param0 _p_ jshort param1, ((void (*) (jint, jshort))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, invokePV__JJ, jlong param0, ((void (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0))
ARITYn(void, invokePV__JJB, jlong param0 _p_ jbyte param1, ((void (*) (intptr_t, jbyte))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(void, invokePV__JJDD, jlong param0 _p_ jdouble param1 _p_ jdouble param2, ((void (*) (intptr_t, jdouble, jdouble))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(void, invokePV__JJF, jlong param0 _p_ jfloat param1, ((void (*) (intptr_t, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(void, invokePV__JJI, jlong param0 _p_ jint param1, ((void (*) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(void, invokeJV__JJI, jlong param0 _p_ jint param1, ((void (*) (jlong, jint))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, invokePV__JJIBIZZ, jlong param0 _p_ jint param1 _p_ jbyte param2 _p_ jint param3 _p_ jboolean param4 _p_ jboolean param5, ((void (*) (intptr_t, jint, jbyte, jint, jboolean, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5))
ARITYn(void, invokePV__JJII, jlong param0 _p_ jint param1 _p_ jint param2, ((void (*) (intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(void, invokePV__JJIIII, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4, ((void (*) (intptr_t, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4))
ARITYn(void, invokePPV__JJIIJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3, ((void (*) (intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3))
ARITYn(void, invokePPV__JJIJ, jlong param0 _p_ jint param1 _p_ jlong param2, ((void (*) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2))
ARITYn(void, invokePPPV__JJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3, ((void (*) (intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(void, invokePPPV__JJIJJI, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4, ((void (*) (intptr_t, jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, param4))
ARITYn(void, invokePPV__JJJ, jlong param0 _p_ jlong param1, ((void (*) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1))
ARITYn(void, invokePPV__JJJI, jlong param0 _p_ jlong param1 _p_ jint param2, ((void (*) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2))
ARITYn(void, invokePPV__JJJIIIII, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6, ((void (*) (intptr_t, intptr_t, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, param5, param6))
ARITYn(void, invokePPPV__JJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2, ((void (*) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2))
ARITYn(void, invokePPPV__JJJJI, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3, ((void (*) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3))
ARITYn(void, invokePPPV__JJJJIZZ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jboolean param4 _p_ jboolean param5, ((void (*) (intptr_t, intptr_t, intptr_t, jint, jboolean, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, param4, param5))
ARITYn(void, invokePPPPV__JJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, ((void (*) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(void, invokePPPPV__JJJJJI, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4, ((void (*) (intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4))
ARITYn(void, invokePPPPPV__JJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, ((void (*) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(void, invokePPPV__JJJJZZ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jboolean param3 _p_ jboolean param4, ((void (*) (intptr_t, intptr_t, intptr_t, jboolean, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, param4))
ARITYn(void, invokePPV__JJJZ, jlong param0 _p_ jlong param1 _p_ jboolean param2, ((void (*) (intptr_t, intptr_t, jboolean))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2))
ARITYn(void, invokePV__JJSSSZZSI, jlong param0 _p_ jshort param1 _p_ jshort param2 _p_ jshort param3 _p_ jboolean param4 _p_ jboolean param5 _p_ jshort param6 _p_ jint param7, ((void (*) (intptr_t, jshort, jshort, jshort, jboolean, jboolean, jshort, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, param7))
ARITYn(void, invokePPPV__JJZIJJI, jlong param0 _p_ jboolean param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jint param5, ((void (*) (intptr_t, jboolean, jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4, param5))
ARITYn(void, invokeV__JS, jshort param0, ((void (*) (jshort))(intptr_t)__functionAddress)(param0))
ARITYn(void, invokePV__JSBSSSSSSJ, jshort param0 _p_ jbyte param1 _p_ jshort param2 _p_ jshort param3 _p_ jshort param4 _p_ jshort param5 _p_ jshort param6 _p_ jshort param7 _p_ jlong param8, ((void (*) (jshort, jbyte, jshort, jshort, jshort, jshort, jshort, jshort, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8))
ARITYn(void, invokeV__JSII, jshort param0 _p_ jint param1 _p_ jint param2, ((void (*) (jshort, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, invokePV__JSIJ, jshort param0 _p_ jint param1 _p_ jlong param2, ((void (*) (jshort, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2))
ARITYn(void, invokePV__JSJS, jshort param0 _p_ jlong param1 _p_ jshort param2, ((void (*) (jshort, intptr_t, jshort))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2))
ARITYn(void, invokePV__JSSBBSSSSJS, jshort param0 _p_ jshort param1 _p_ jbyte param2 _p_ jbyte param3 _p_ jshort param4 _p_ jshort param5 _p_ jshort param6 _p_ jshort param7 _p_ jlong param8 _p_ jshort param9, ((void (*) (jshort, jshort, jbyte, jbyte, jshort, jshort, jshort, jshort, intptr_t, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8, param9))
ARITYn(void, invokePV__JSSBJ, jshort param0 _p_ jshort param1 _p_ jbyte param2 _p_ jlong param3, ((void (*) (jshort, jshort, jbyte, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3))
ARITYn(void, invokePPV__JSSBJJ, jshort param0 _p_ jshort param1 _p_ jbyte param2 _p_ jlong param3 _p_ jlong param4, ((void (*) (jshort, jshort, jbyte, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(void, invokePV__JSSBSSSSJS, jshort param0 _p_ jshort param1 _p_ jbyte param2 _p_ jshort param3 _p_ jshort param4 _p_ jshort param5 _p_ jshort param6 _p_ jlong param7 _p_ jshort param8, ((void (*) (jshort, jshort, jbyte, jshort, jshort, jshort, jshort, intptr_t, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8))
ARITYn(void, invokePV__JSSSSJS, jshort param0 _p_ jshort param1 _p_ jshort param2 _p_ jshort param3 _p_ jlong param4 _p_ jshort param5, ((void (*) (jshort, jshort, jshort, jshort, intptr_t, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, param5))
ARITYn(void, invokeV__JSZ, jshort param0 _p_ jboolean param1, ((void (*) (jshort, jboolean))(intptr_t)__functionAddress)(param0, param1))
ARITYn(jboolean, invokeZ__JI, jint param0, return ((jboolean (*) (jint))(intptr_t)__functionAddress)(param0))
ARITYn(jboolean, invokePZ__JIJ, jint param0 _p_ jlong param1, return ((jboolean (*) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1))
ARITYn(jboolean, invokePZ__JIJI, jint param0 _p_ jlong param1 _p_ jint param2, return ((jboolean (*) (jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2))
ARITYn(jboolean, invokeZ__JIS, jint param0 _p_ jshort param1, return ((jboolean (*) (jint, jshort))(intptr_t)__functionAddress)(param0, param1))
ARITYn(jboolean, invokePPZ__JISSJJ, jint param0 _p_ jshort param1 _p_ jshort param2 _p_ jlong param3 _p_ jlong param4, return ((jboolean (*) (jint, jshort, jshort, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jboolean, invokePZ__JJ, jlong param0, return ((jboolean (*) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0))
ARITYn(jboolean, invokePZ__JJIII, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3, return ((jboolean (*) (intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3))
ARITYn(jboolean, invokePPZ__JJJ, jlong param0 _p_ jlong param1, return ((jboolean (*) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1))
ARITYn(jboolean, invokePPPZ__JJJIJI, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4, return ((jboolean (*) (intptr_t, intptr_t, jint, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, param4))
ARITYn(jboolean, invokePPPPZ__JJJJBJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jbyte param3 _p_ jlong param4, return ((jboolean (*) (intptr_t, intptr_t, intptr_t, jbyte, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4))
ARITYn(jboolean, invokePPPZ__JJJJI, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3, return ((jboolean (*) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3))
ARITYn(jboolean, invokePPPPZ__JJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, return ((jboolean (*) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(jfloat, callF__JIII, jint param0 _p_ jint param1 _p_ jint param2, return ((jfloat (APIENTRY *) (jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2))
ARITY0(jint, callI__J, return ((jint (APIENTRY *) ())(intptr_t)__functionAddress)())
ARITYn(jint, callI__JI, jint param0, return ((jint (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0))
ARITYn(jint, callI__JII, jint param0 _p_ jint param1, return ((jint (APIENTRY *) (jint, jint))(intptr_t)__functionAddress)(param0, param1))
ARITYn(jint, callPI__JIIIIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5, return ((jint (APIENTRY *) (jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(jint, callPI__JIIIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4, return ((jint (APIENTRY *) (jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4))
ARITYn(jint, callPI__JIIJ, jint param0 _p_ jint param1 _p_ jlong param2, return ((jint (APIENTRY *) (jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2))
ARITYn(jint, callPI__JIIJIIIIF, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jfloat param7, return ((jint (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, param6, param7))
ARITYn(jint, callPPI__JIIJJIIIIF, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jfloat param8, return ((jint (APIENTRY *) (jint, jint, intptr_t, intptr_t, jint, jint, jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, param4, param5, param6, param7, param8))
ARITYn(jint, callPPPPPI__JIIJJJJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6, return ((jint (APIENTRY *) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6))
ARITYn(jint, callPPPPPPI__JIIJJJJJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7, return ((jint (APIENTRY *) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(jint, callPI__JIJ, jint param0 _p_ jlong param1, return ((jint (APIENTRY *) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1))
ARITYn(jint, callPI__JIJIIFI, jint param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jfloat param4 _p_ jint param5, return ((jint (APIENTRY *) (jint, intptr_t, jint, jint, jfloat, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3, param4, param5))
ARITYn(jint, callPPI__JIJJ, jint param0 _p_ jlong param1 _p_ jlong param2, return ((jint (APIENTRY *) (jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2))
ARITYn(jint, callPI__JJ, jlong param0, return ((jint (APIENTRY *) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0))
ARITYn(jint, callPI__JJF, jlong param0 _p_ jfloat param1, return ((jint (APIENTRY *) (intptr_t, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(jint, callPI__JJI, jlong param0 _p_ jint param1, return ((jint (APIENTRY *) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(jint, callPI__JJII, jlong param0 _p_ jint param1 _p_ jint param2, return ((jint (APIENTRY *) (intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(jint, callPI__JJIII, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3))
ARITYn(jint, callPPI__JJIIIFFIJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jfloat param4 _p_ jfloat param5 _p_ jint param6 _p_ jlong param7, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, jfloat, jfloat, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7))
ARITYn(jint, callPI__JJIIII, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4))
ARITYn(jint, callPI__JJIIIIII, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6))
ARITYn(jint, callPPI__JJIIIIIIJIIIIIIIII, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jlong param7 _p_ jint param8 _p_ jint param9 _p_ jint param10 _p_ jint param11 _p_ jint param12 _p_ jint param13 _p_ jint param14 _p_ jint param15 _p_ jint param16, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, jint, intptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8, param9, param10, param11, param12, param13, param14, param15, param16))
ARITYn(jint, callPPI__JJIIIIIJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, (intptr_t)param6))
ARITYn(jint, callPPI__JJIIIJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4))
ARITYn(jint, callPPPI__JJIIIJJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jint, callPPI__JJIIJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3, return ((jint (APIENTRY *) (intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3))
ARITYn(jint, callPPPPI__JJIIJJJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jint, callPPI__JJIJ, jlong param0 _p_ jint param1 _p_ jlong param2, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2))
ARITYn(jint, callPJI__JJIJ, jlong param0 _p_ jint param1 _p_ jlong param2, return ((jint (APIENTRY *) (intptr_t, jint, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(jint, callPPI__JJIJI, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3))
ARITYn(jint, callPPPPI__JJIJIIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5 _p_ jlong param6, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, param4, (intptr_t)param5, (intptr_t)param6))
ARITYn(jint, callPPJI__JJIJIJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jlong param4, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jint, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, param4))
ARITYn(jint, callPPPPPI__JJIJIJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jlong param4 _p_ jint param5 _p_ jlong param6 _p_ jlong param7, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jint, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(jint, callPPPPI__JJIJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jlong param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jint, callPJPI__JJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3, return ((jint (APIENTRY *) (intptr_t, jint, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3))
ARITYn(jint, callPPJI__JJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3))
ARITYn(jint, callPPPI__JJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(jint, callPPJPPI__JJIJJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4 _p_ jlong param5 _p_ jlong param6, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, jlong, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, param4, (intptr_t)param5, (intptr_t)param6))
ARITYn(jint, callPPPPPPPI__JJIJJIJJJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7 _p_ jlong param8, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8))
ARITYn(jint, callPPPPI__JJIJJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jint, callPJPPPPI__JJIJJJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jint param5 _p_ jlong param6 _p_ jlong param7, return ((jint (APIENTRY *) (intptr_t, jint, jlong, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(jint, callPPPPPPI__JJIJJJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jint param5 _p_ jlong param6 _p_ jlong param7, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(jint, callPPPJPPI__JJIJJJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jint param5 _p_ jlong param6 _p_ jlong param7, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, jlong, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, param4, param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(jint, callPPPPPI__JJIJJJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jint, callPJI__JJJ, jlong param0 _p_ jlong param1, return ((jint (APIENTRY *) (intptr_t, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(jint, callPPI__JJJ, jlong param0 _p_ jlong param1, return ((jint (APIENTRY *) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1))
ARITYn(jint, callPPI__JJJF, jlong param0 _p_ jlong param1 _p_ jfloat param2, return ((jint (APIENTRY *) (intptr_t, intptr_t, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2))
ARITYn(jint, callPJI__JJJI, jlong param0 _p_ jlong param1 _p_ jint param2, return ((jint (APIENTRY *) (intptr_t, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(jint, callPPI__JJJI, jlong param0 _p_ jlong param1 _p_ jint param2, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2))
ARITYn(jint, callPPI__JJJII, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3))
ARITYn(jint, callPPI__JJJIII, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jint param4, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4))
ARITYn(jint, callPPI__JJJIIII, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, param5))
ARITYn(jint, callPPPI__JJJIIIIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, param5, (intptr_t)param6))
ARITYn(jint, callPPPI__JJJIIIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, (intptr_t)param5))
ARITYn(jint, callPPPPI__JJJIIJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jint, callPJPPI__JJJIIJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, jlong, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jint, callPJPPJI__JJJIIJJJI, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6 _p_ jint param7, return ((jint (APIENTRY *) (intptr_t, jlong, jint, jint, intptr_t, intptr_t, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5, param6, param7))
ARITYn(jint, callPPJI__JJJIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jlong))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3))
ARITYn(jint, callPPPI__JJJIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3))
ARITYn(jint, callPJPI__JJJIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3, return ((jint (APIENTRY *) (intptr_t, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3))
ARITYn(jint, callPPJPPI__JJJIJIJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jlong param5 _p_ jlong param6, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, jlong, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, (intptr_t)param5, (intptr_t)param6))
ARITYn(jint, callPJPPI__JJJIJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4, return ((jint (APIENTRY *) (intptr_t, jlong, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jint, callPPPPI__JJJIJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jint, callPJPPPI__JJJIJJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, jlong, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jint, callPPPPPI__JJJIJJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jint, callPPPPPPPI__JJJIJJJIJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jint param6 _p_ jlong param7 _p_ jlong param8, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6, (intptr_t)param7, (intptr_t)param8))
ARITYn(jint, callPPPPPPPI__JJJIJJJJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(jint, callPPPPPPPPPI__JJJIJJJJJIJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7 _p_ jint param8 _p_ jlong param9 _p_ jlong param10, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, param8, (intptr_t)param9, (intptr_t)param10))
ARITYn(jint, callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7 _p_ jlong param8 _p_ jlong param9 _p_ jlong param10 _p_ jint param11 _p_ jlong param12 _p_ jlong param13, return ((jint (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9, (intptr_t)param10, param11, (intptr_t)param12, (intptr_t)param13))
ARITYn(jint, callPJPI__JJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2, return ((jint (APIENTRY *) (intptr_t, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2))
ARITYn(jint, callPPJI__JJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2, return ((jint (APIENTRY *) (intptr_t, intptr_t, jlong))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2))
ARITYn(jint, callPPPI__JJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2))
ARITYn(jint, callPPPI__JJJJI, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3))
ARITYn(jint, callPPPPI__JJJJIJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jlong param4, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4))
ARITYn(jint, callPPPPPI__JJJJIJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jlong param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jint, callPJJJI__JJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, return ((jint (APIENTRY *) (intptr_t, jlong, jlong, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3))
ARITYn(jint, callPPPPI__JJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(jint, callPJPPI__JJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, return ((jint (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(jint, callPJJJPI__JJJJJIJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, jlong, jlong, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(jint, callPPPPPPPPI__JJJJJIJJIJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4 _p_ jlong param5 _p_ jlong param6 _p_ jint param7 _p_ jlong param8 _p_ jlong param9, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6, param7, (intptr_t)param8, (intptr_t)param9))
ARITYn(jint, callPPPPPPPI__JJJJJIJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(jint, callPJPPPI__JJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, return ((jint (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jint, callPPPPPI__JJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jint, callPPPPPPPI__JJJJJJIJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jint param5 _p_ jlong param6 _p_ jlong param7, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(jint, callPJJJJPI__JJJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, jlong, jlong, jlong, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(jint, callPPPPPPI__JJJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jint, callPPPPPPPPI__JJJJJJJIJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jint param6 _p_ jlong param7 _p_ jlong param8, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6, (intptr_t)param7, (intptr_t)param8))
ARITYn(jint, callPPPPPPPPPPPPI__JJJJJJJJJJJIJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7 _p_ jlong param8 _p_ jlong param9 _p_ jint param10 _p_ jlong param11 _p_ jlong param12, return ((jint (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9, param10, (intptr_t)param11, (intptr_t)param12))
ARITY0(jlong, callJ__J, return ((jlong (APIENTRY *) ())(intptr_t)__functionAddress)())
ARITYn(jlong, callJ__JI, jint param0, return ((jlong (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0))
ARITYn(jlong, callJ__JII, jint param0 _p_ jint param1, return ((jlong (APIENTRY *) (jint, jint))(intptr_t)__functionAddress)(param0, param1))
ARITYn(jlong, callJ__JIIZII, jint param0 _p_ jint param1 _p_ jboolean param2 _p_ jint param3 _p_ jint param4, return ((jlong (APIENTRY *) (jint, jint, jboolean, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITY0(jlong, callP__J, return (jlong)((intptr_t (APIENTRY *) ())(intptr_t)__functionAddress)())
ARITYn(jlong, callP__JI, jint param0, return (jlong)((intptr_t (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0))
ARITYn(jlong, callP__JIFFF, jint param0 _p_ jfloat param1 _p_ jfloat param2 _p_ jfloat param3, return (jlong)((intptr_t (APIENTRY *) (jint, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(jlong, callP__JII, jint param0 _p_ jint param1, return (jlong)((intptr_t (APIENTRY *) (jint, jint))(intptr_t)__functionAddress)(param0, param1))
ARITYn(jlong, callPPP__JIIIJJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4, return (jlong)((intptr_t (APIENTRY *) (jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jlong, callPP__JIJ, jint param0 _p_ jlong param1, return (jlong)((intptr_t (APIENTRY *) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1))
ARITYn(jlong, callPP__JIJI, jint param0 _p_ jlong param1 _p_ jint param2, return (jlong)((intptr_t (APIENTRY *) (jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2))
ARITYn(jlong, callPPP__JIJJ, jint param0 _p_ jlong param1 _p_ jlong param2, return (jlong)((intptr_t (APIENTRY *) (jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2))
ARITYn(jlong, callPPP__JIJJI, jint param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3, return (jlong)((intptr_t (APIENTRY *) (jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3))
ARITYn(jlong, callPP__JJ, jlong param0, return (jlong)((intptr_t (APIENTRY *) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0))
ARITYn(jlong, callPP__JJI, jlong param0 _p_ jint param1, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(jlong, callPP__JJII, jlong param0 _p_ jint param1 _p_ jint param2, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(jlong, callPPP__JJIIIJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4))
ARITYn(jlong, callPPP__JJIJ, jlong param0 _p_ jint param1 _p_ jlong param2, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2))
ARITYn(jlong, callPPPP__JJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(jlong, callPPPPPPP__JJIJJIJJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(jlong, callPPPPP__JJIJJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jlong, callPPPPPP__JJIJJJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jlong, callPPPPPPP__JJIJJJJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6))
ARITYn(jlong, callPPP__JJJ, jlong param0 _p_ jlong param1, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1))
ARITYn(jlong, callPPP__JJJI, jlong param0 _p_ jlong param1 _p_ jint param2, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2))
ARITYn(jlong, callPPP__JJJIII, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jint param4, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4))
ARITYn(jlong, callPJPP__JJJIIIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(jlong, callPPPP__JJJIIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, (intptr_t)param4))
ARITYn(jlong, callPJPPP__JJJIIJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4 _p_ jlong param5, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jlong, callPPPP__JJJIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3))
ARITYn(jlong, callPJPP__JJJIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3))
ARITYn(jlong, callPPPP__JJJIJI, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, param4))
ARITYn(jlong, callPJPPP__JJJIJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jlong, callPPPPP__JJJIJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jlong, callPPJPPPPPP__JJJIJJJIJJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jint param6 _p_ jlong param7 _p_ jlong param8 _p_ jlong param9, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, jlong, intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, (intptr_t)param4, (intptr_t)param5, param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9))
ARITYn(jlong, callPPJPPPPPPPP__JJJIJJJJJIJJJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7 _p_ jint param8 _p_ jlong param9 _p_ jlong param10 _p_ jlong param11, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jint, jlong, intptr_t, intptr_t, intptr_t, intptr_t, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, param8, (intptr_t)param9, (intptr_t)param10, (intptr_t)param11))
ARITYn(jlong, callPPPP__JJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2))
ARITYn(jlong, callPJPP__JJJJI, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3))
ARITYn(jlong, callPPPP__JJJJI, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3))
ARITYn(jlong, callPPPPP__JJJJIJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jlong param4, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4))
ARITYn(jlong, callPJPPP__JJJJIJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jlong param4, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4))
ARITYn(jlong, callPPPPP__JJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(jlong, callPPJPP__JJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3))
ARITYn(jlong, callPJPPPP__JJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(jlong, callPJPPPPP__JJJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jlong, callPPPJPPP__JJJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, return (jlong)((intptr_t (APIENTRY *) (intptr_t, intptr_t, intptr_t, jlong, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(jlong, callPJPPPPPPP__JJJJJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(jlong, callPJPPPPPPPPP__JJJJJJJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7 _p_ jlong param8 _p_ jlong param9, return (jlong)((intptr_t (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9))
ARITYn(jshort, callS__JI, jint param0, return ((jshort (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0))
ARITY0(void, callV__J, ((void (APIENTRY *) ())(intptr_t)__functionAddress)())
ARITYn(void, callV__JB, jbyte param0, ((void (APIENTRY *) (jbyte))(intptr_t)__functionAddress)(param0))
ARITYn(void, callV__JBBB, jbyte param0 _p_ jbyte param1 _p_ jbyte param2, ((void (APIENTRY *) (jbyte, jbyte, jbyte))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callV__JBBBB, jbyte param0 _p_ jbyte param1 _p_ jbyte param2 _p_ jbyte param3, ((void (APIENTRY *) (jbyte, jbyte, jbyte, jbyte))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JD, jdouble param0, ((void (APIENTRY *) (jdouble))(intptr_t)__functionAddress)(param0))
ARITYn(void, callV__JDD, jdouble param0 _p_ jdouble param1, ((void (APIENTRY *) (jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, callV__JDDD, jdouble param0 _p_ jdouble param1 _p_ jdouble param2, ((void (APIENTRY *) (jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callV__JDDDD, jdouble param0 _p_ jdouble param1 _p_ jdouble param2 _p_ jdouble param3, ((void (APIENTRY *) (jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JDDDDDD, jdouble param0 _p_ jdouble param1 _p_ jdouble param2 _p_ jdouble param3 _p_ jdouble param4 _p_ jdouble param5, ((void (APIENTRY *) (jdouble, jdouble, jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITYn(void, callV__JF, jfloat param0, ((void (APIENTRY *) (jfloat))(intptr_t)__functionAddress)(param0))
ARITYn(void, callV__JFF, jfloat param0 _p_ jfloat param1, ((void (APIENTRY *) (jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, callV__JFFF, jfloat param0 _p_ jfloat param1 _p_ jfloat param2, ((void (APIENTRY *) (jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callV__JFFFF, jfloat param0 _p_ jfloat param1 _p_ jfloat param2 _p_ jfloat param3, ((void (APIENTRY *) (jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JFFFFFFFF, jfloat param0 _p_ jfloat param1 _p_ jfloat param2 _p_ jfloat param3 _p_ jfloat param4 _p_ jfloat param5 _p_ jfloat param6 _p_ jfloat param7, ((void (APIENTRY *) (jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7))
ARITYn(void, callV__JFZ, jfloat param0 _p_ jboolean param1, ((void (APIENTRY *) (jfloat, jboolean))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, callV__JI, jint param0, ((void (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0))
ARITYn(void, callV__JIBBBB, jint param0 _p_ jbyte param1 _p_ jbyte param2 _p_ jbyte param3 _p_ jbyte param4, ((void (APIENTRY *) (jint, jbyte, jbyte, jbyte, jbyte))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callV__JID, jint param0 _p_ jdouble param1, ((void (APIENTRY *) (jint, jdouble))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, callV__JIDD, jint param0 _p_ jdouble param1 _p_ jdouble param2, ((void (APIENTRY *) (jint, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callV__JIDDD, jint param0 _p_ jdouble param1 _p_ jdouble param2 _p_ jdouble param3, ((void (APIENTRY *) (jint, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JIDDDD, jint param0 _p_ jdouble param1 _p_ jdouble param2 _p_ jdouble param3 _p_ jdouble param4, ((void (APIENTRY *) (jint, jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callV__JIDDDDDD, jint param0 _p_ jdouble param1 _p_ jdouble param2 _p_ jdouble param3 _p_ jdouble param4 _p_ jdouble param5 _p_ jdouble param6, ((void (APIENTRY *) (jint, jdouble, jdouble, jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6))
ARITYn(void, callV__JIDDIDD, jint param0 _p_ jdouble param1 _p_ jdouble param2 _p_ jint param3 _p_ jdouble param4 _p_ jdouble param5, ((void (APIENTRY *) (jint, jdouble, jdouble, jint, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITYn(void, callPV__JIDDIIDDIIJ, jint param0 _p_ jdouble param1 _p_ jdouble param2 _p_ jint param3 _p_ jint param4 _p_ jdouble param5 _p_ jdouble param6 _p_ jint param7 _p_ jint param8 _p_ jlong param9, ((void (APIENTRY *) (jint, jdouble, jdouble, jint, jint, jdouble, jdouble, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9))
ARITYn(void, callPV__JIDDIIJ, jint param0 _p_ jdouble param1 _p_ jdouble param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5, ((void (APIENTRY *) (jint, jdouble, jdouble, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(void, callV__JIF, jint param0 _p_ jfloat param1, ((void (APIENTRY *) (jint, jfloat))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, callV__JIFF, jint param0 _p_ jfloat param1 _p_ jfloat param2, ((void (APIENTRY *) (jint, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callV__JIFFF, jint param0 _p_ jfloat param1 _p_ jfloat param2 _p_ jfloat param3, ((void (APIENTRY *) (jint, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JIFFFF, jint param0 _p_ jfloat param1 _p_ jfloat param2 _p_ jfloat param3 _p_ jfloat param4, ((void (APIENTRY *) (jint, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callV__JIFFIFF, jint param0 _p_ jfloat param1 _p_ jfloat param2 _p_ jint param3 _p_ jfloat param4 _p_ jfloat param5, ((void (APIENTRY *) (jint, jfloat, jfloat, jint, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITYn(void, callPV__JIFFIIFFIIJ, jint param0 _p_ jfloat param1 _p_ jfloat param2 _p_ jint param3 _p_ jint param4 _p_ jfloat param5 _p_ jfloat param6 _p_ jint param7 _p_ jint param8 _p_ jlong param9, ((void (APIENTRY *) (jint, jfloat, jfloat, jint, jint, jfloat, jfloat, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9))
ARITYn(void, callPV__JIFFIIJ, jint param0 _p_ jfloat param1 _p_ jfloat param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5, ((void (APIENTRY *) (jint, jfloat, jfloat, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(void, callV__JII, jint param0 _p_ jint param1, ((void (APIENTRY *) (jint, jint))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, callV__JIID, jint param0 _p_ jint param1 _p_ jdouble param2, ((void (APIENTRY *) (jint, jint, jdouble))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callV__JIIDD, jint param0 _p_ jint param1 _p_ jdouble param2 _p_ jdouble param3, ((void (APIENTRY *) (jint, jint, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JIIDDD, jint param0 _p_ jint param1 _p_ jdouble param2 _p_ jdouble param3 _p_ jdouble param4, ((void (APIENTRY *) (jint, jint, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callV__JIIDDDD, jint param0 _p_ jint param1 _p_ jdouble param2 _p_ jdouble param3 _p_ jdouble param4 _p_ jdouble param5, ((void (APIENTRY *) (jint, jint, jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITYn(void, callV__JIIF, jint param0 _p_ jint param1 _p_ jfloat param2, ((void (APIENTRY *) (jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callV__JIIFF, jint param0 _p_ jint param1 _p_ jfloat param2 _p_ jfloat param3, ((void (APIENTRY *) (jint, jint, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JIIFFF, jint param0 _p_ jint param1 _p_ jfloat param2 _p_ jfloat param3 _p_ jfloat param4, ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callV__JIIFFFF, jint param0 _p_ jint param1 _p_ jfloat param2 _p_ jfloat param3 _p_ jfloat param4 _p_ jfloat param5, ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITYn(void, callV__JIIFFFFFFFFF, jint param0 _p_ jint param1 _p_ jfloat param2 _p_ jfloat param3 _p_ jfloat param4 _p_ jfloat param5 _p_ jfloat param6 _p_ jfloat param7 _p_ jfloat param8 _p_ jfloat param9 _p_ jfloat param10, ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10))
ARITYn(void, callPV__JIIFFFFJ, jint param0 _p_ jint param1 _p_ jfloat param2 _p_ jfloat param3 _p_ jfloat param4 _p_ jfloat param5 _p_ jlong param6, ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat, jfloat, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (intptr_t)param6))
ARITYn(void, callV__JIIFI, jint param0 _p_ jint param1 _p_ jfloat param2 _p_ jint param3, ((void (APIENTRY *) (jint, jint, jfloat, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JIII, jint param0 _p_ jint param1 _p_ jint param2, ((void (APIENTRY *) (jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callV__JIIID, jint param0 _p_ jint param1 _p_ jint param2 _p_ jdouble param3, ((void (APIENTRY *) (jint, jint, jint, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JIIIDDDD, jint param0 _p_ jint param1 _p_ jint param2 _p_ jdouble param3 _p_ jdouble param4 _p_ jdouble param5 _p_ jdouble param6, ((void (APIENTRY *) (jint, jint, jint, jdouble, jdouble, jdouble, jdouble))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6))
ARITYn(void, callV__JIIIF, jint param0 _p_ jint param1 _p_ jint param2 _p_ jfloat param3, ((void (APIENTRY *) (jint, jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JIIIFFFF, jint param0 _p_ jint param1 _p_ jint param2 _p_ jfloat param3 _p_ jfloat param4 _p_ jfloat param5 _p_ jfloat param6, ((void (APIENTRY *) (jint, jint, jint, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6))
ARITYn(void, callV__JIIIFI, jint param0 _p_ jint param1 _p_ jint param2 _p_ jfloat param3 _p_ jint param4, ((void (APIENTRY *) (jint, jint, jint, jfloat, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callV__JIIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3, ((void (APIENTRY *) (jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JIIIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4, ((void (APIENTRY *) (jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callV__JIIIIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITYn(void, callV__JIIIIIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6))
ARITYn(void, callV__JIIIIIIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7))
ARITYn(void, callV__JIIIIIIIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jint param8, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8))
ARITYn(void, callV__JIIIIIIIIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jint param8 _p_ jint param9, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9))
ARITYn(void, callV__JIIIIIIIIIIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jint param8 _p_ jint param9 _p_ jint param10 _p_ jint param11, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11))
ARITYn(void, callV__JIIIIIIIIIIIIIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jint param8 _p_ jint param9 _p_ jint param10 _p_ jint param11 _p_ jint param12 _p_ jint param13 _p_ jint param14, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14))
ARITYn(void, callV__JIIIIIIIIIIIIIIIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jint param8 _p_ jint param9 _p_ jint param10 _p_ jint param11 _p_ jint param12 _p_ jint param13 _p_ jint param14 _p_ jint param15 _p_ jint param16, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16))
ARITYn(void, callPV__JIIIIIIIIIIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jint param8 _p_ jint param9 _p_ jint param10 _p_ jlong param11, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11))
ARITYn(void, callPV__JIIIIIIIIIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jint param8 _p_ jint param9 _p_ jlong param10, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10))
ARITYn(void, callPV__JIIIIIIIIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jint param8 _p_ jlong param9, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9))
ARITYn(void, callPV__JIIIIIIIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jlong param8, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8))
ARITYn(void, callV__JIIIIIIIIZ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jboolean param8, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8))
ARITYn(void, callPV__JIIIIIIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jlong param7, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7))
ARITYn(void, callV__JIIIIIIIZ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jboolean param7, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7))
ARITYn(void, callPV__JIIIIIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (intptr_t)param6))
ARITYn(void, callPPV__JIIIIIIJJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6 _p_ jlong param7, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(void, callV__JIIIIIIZ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jboolean param6, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6))
ARITYn(void, callPV__JIIIIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5, ((void (APIENTRY *) (jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(void, callPV__JIIIIIJI, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5 _p_ jint param6, ((void (APIENTRY *) (jint, jint, jint, jint, jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5, param6))
ARITYn(void, callV__JIIIIIZ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jboolean param5, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITYn(void, callPV__JIIIIIZIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jboolean param5 _p_ jint param6 _p_ jlong param7, ((void (APIENTRY *) (jint, jint, jint, jint, jint, jboolean, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7))
ARITYn(void, callPV__JIIIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4))
ARITYn(void, callPPV__JIIIIJIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4 _p_ jint param5 _p_ jint param6 _p_ jlong param7, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, param5, param6, (intptr_t)param7))
ARITYn(void, callPPPV__JIIIIJIJJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4 _p_ jint param5 _p_ jlong param6 _p_ jlong param7, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(void, callPPV__JIIIIJJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4 _p_ jlong param5, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(void, callPPPV__JIIIIJJJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6))
ARITYn(void, callPV__JIIIIJZ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4 _p_ jboolean param5, ((void (APIENTRY *) (jint, jint, jint, jint, intptr_t, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, param5))
ARITYn(void, callV__JIIIIZI, jint param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jboolean param4 _p_ jint param5, ((void (APIENTRY *) (jint, jint, jint, jint, jboolean, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITYn(void, callPV__JIIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3, ((void (APIENTRY *) (jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3))
ARITYn(void, callPV__JIIIJI, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4))
ARITYn(void, callPPV__JIIIJIFFIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jfloat param5 _p_ jfloat param6 _p_ jint param7 _p_ jlong param8, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint, jfloat, jfloat, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, param5, param6, param7, (intptr_t)param8))
ARITYn(void, callPV__JIIIJII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jint param5, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, param5))
ARITYn(void, callPV__JIIIJIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jint param5 _p_ jint param6, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, param5, param6))
ARITYn(void, callPPV__JIIIJIIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, param5, (intptr_t)param6))
ARITYn(void, callPPPPPPPV__JIIIJIJJJJJJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7 _p_ jlong param8 _p_ jlong param9 _p_ jlong param10, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9, (intptr_t)param10))
ARITYn(void, callPPV__JIIIJJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4, ((void (APIENTRY *) (jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(void, callPPPV__JIIIJJJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, ((void (APIENTRY *) (jint, jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5))
ARITYn(void, callPPPPV__JIIIJJJJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6, ((void (APIENTRY *) (jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6))
ARITYn(void, callPV__JIIIJZ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jboolean param4, ((void (APIENTRY *) (jint, jint, jint, intptr_t, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3, param4))
ARITYn(void, callV__JIIIZ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jboolean param3, ((void (APIENTRY *) (jint, jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JIIIZI, jint param0 _p_ jint param1 _p_ jint param2 _p_ jboolean param3 _p_ jint param4, ((void (APIENTRY *) (jint, jint, jint, jboolean, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callV__JIIIZIII, jint param0 _p_ jint param1 _p_ jint param2 _p_ jboolean param3 _p_ jint param4 _p_ jint param5 _p_ jint param6, ((void (APIENTRY *) (jint, jint, jint, jboolean, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6))
ARITYn(void, callPV__JIIIZIJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jboolean param3 _p_ jint param4 _p_ jlong param5, ((void (APIENTRY *) (jint, jint, jint, jboolean, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(void, callPV__JIIIZJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jboolean param3 _p_ jlong param4, ((void (APIENTRY *) (jint, jint, jint, jboolean, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4))
ARITYn(void, callPV__JIIJ, jint param0 _p_ jint param1 _p_ jlong param2, ((void (APIENTRY *) (jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2))
ARITYn(void, callJV__JIIJ, jint param0 _p_ jint param1 _p_ jlong param2, ((void (APIENTRY *) (jint, jint, jlong))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callPV__JIIJI, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3, ((void (APIENTRY *) (jint, jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3))
ARITYn(void, callPV__JIIJII, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4))
ARITYn(void, callPV__JIIJIII, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jint param5, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5))
ARITYn(void, callPV__JIIJIIII, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, param6))
ARITYn(void, callPV__JIIJIIIIIF, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jfloat param8, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, param6, param7, param8))
ARITYn(void, callPPV__JIIJIIIIIJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jlong param8, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, param6, param7, (intptr_t)param8))
ARITYn(void, callPPV__JIIJIIIIJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jlong param7, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, param6, (intptr_t)param7))
ARITYn(void, callPPV__JIIJIIIJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, (intptr_t)param6))
ARITYn(void, callPPV__JIIJIIIJIIF, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6 _p_ jint param7 _p_ jint param8 _p_ jfloat param9, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, jint, intptr_t, jint, jint, jfloat))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, param5, (intptr_t)param6, param7, param8, param9))
ARITYn(void, callPPV__JIIJIIJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5, ((void (APIENTRY *) (jint, jint, intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, param4, (intptr_t)param5))
ARITYn(void, callPPV__JIIJIJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jlong param4, ((void (APIENTRY *) (jint, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, param3, (intptr_t)param4))
ARITYn(void, callJJV__JIIJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3, ((void (APIENTRY *) (jint, jint, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callPPV__JIIJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(void, callJPV__JIIJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3, ((void (APIENTRY *) (jint, jint, jlong, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3))
ARITYn(void, callPPV__JIIJJI, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, param4))
ARITYn(void, callPPV__JIIJJII, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4 _p_ jint param5, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, param4, param5))
ARITYn(void, callPPV__JIIJJIII, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4 _p_ jint param5 _p_ jint param6, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, param4, param5, param6))
ARITYn(void, callPPPV__JIIJJIIJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, param4, param5, (intptr_t)param6))
ARITYn(void, callPPPV__JIIJJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(void, callJJJV__JIIJJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, ((void (APIENTRY *) (jint, jint, jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callJJJJV__JIIJJJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5, ((void (APIENTRY *) (jint, jint, jlong, jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5))
ARITYn(void, callPPPPV__JIIJJJJI, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jint param6, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6))
ARITYn(void, callPPPPPV__JIIJJJJJ, jint param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6, ((void (APIENTRY *) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6))
ARITYn(void, callV__JIIZ, jint param0 _p_ jint param1 _p_ jboolean param2, ((void (APIENTRY *) (jint, jint, jboolean))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callV__JIIZI, jint param0 _p_ jint param1 _p_ jboolean param2 _p_ jint param3, ((void (APIENTRY *) (jint, jint, jboolean, jint))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callPV__JIIZJ, jint param0 _p_ jint param1 _p_ jboolean param2 _p_ jlong param3, ((void (APIENTRY *) (jint, jint, jboolean, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, (intptr_t)param3))
ARITYn(void, callPV__JIJ, jint param0 _p_ jlong param1, ((void (APIENTRY *) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1))
ARITYn(void, callJV__JIJ, jint param0 _p_ jlong param1, ((void (APIENTRY *) (jint, jlong))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, callPV__JIJI, jint param0 _p_ jlong param1 _p_ jint param2, ((void (APIENTRY *) (jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2))
ARITYn(void, callPV__JIJII, jint param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3, ((void (APIENTRY *) (jint, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3))
ARITYn(void, callPV__JIJIII, jint param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jint param4, ((void (APIENTRY *) (jint, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, param3, param4))
ARITYn(void, callPPV__JIJIJ, jint param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3, ((void (APIENTRY *) (jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3))
ARITYn(void, callPPV__JIJIJI, jint param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4, ((void (APIENTRY *) (jint, intptr_t, jint, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, param4))
ARITYn(void, callPPPV__JIJIJIJ, jint param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jlong param5, ((void (APIENTRY *) (jint, intptr_t, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, param4, (intptr_t)param5))
ARITYn(void, callPPPV__JIJIJJ, jint param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4, ((void (APIENTRY *) (jint, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(void, callPPV__JIJJ, jint param0 _p_ jlong param1 _p_ jlong param2, ((void (APIENTRY *) (jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2))
ARITYn(void, callJJV__JIJJ, jint param0 _p_ jlong param1 _p_ jlong param2, ((void (APIENTRY *) (jint, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callPPV__JIJJI, jint param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3, ((void (APIENTRY *) (jint, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3))
ARITYn(void, callPPV__JIJJII, jint param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4, ((void (APIENTRY *) (jint, intptr_t, intptr_t, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3, param4))
ARITYn(void, callPPV__JIJJIII, jint param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jint param5, ((void (APIENTRY *) (jint, intptr_t, intptr_t, jint, jint, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3, param4, param5))
ARITYn(void, callPPPV__JIJJIJ, jint param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jlong param4, ((void (APIENTRY *) (jint, intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4))
ARITYn(void, callPPPV__JIJJJ, jint param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, ((void (APIENTRY *) (jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(void, callJJJV__JIJJJ, jint param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, ((void (APIENTRY *) (jint, jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callJJJJV__JIJJJJ, jint param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, ((void (APIENTRY *) (jint, jlong, jlong, jlong, jlong))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callPPPPV__JIJJJJI, jint param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4 _p_ jint param5, ((void (APIENTRY *) (jint, intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5))
ARITYn(void, callPPV__JIJJZ, jint param0 _p_ jlong param1 _p_ jlong param2 _p_ jboolean param3, ((void (APIENTRY *) (jint, intptr_t, intptr_t, jboolean))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2, param3))
ARITYn(void, callV__JIS, jint param0 _p_ jshort param1, ((void (APIENTRY *) (jint, jshort))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, callV__JISS, jint param0 _p_ jshort param1 _p_ jshort param2, ((void (APIENTRY *) (jint, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callV__JISSS, jint param0 _p_ jshort param1 _p_ jshort param2 _p_ jshort param3, ((void (APIENTRY *) (jint, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JISSSS, jint param0 _p_ jshort param1 _p_ jshort param2 _p_ jshort param3 _p_ jshort param4, ((void (APIENTRY *) (jint, jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callV__JIZ, jint param0 _p_ jboolean param1, ((void (APIENTRY *) (jint, jboolean))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, callPV__JIZIIIJ, jint param0 _p_ jboolean param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5, ((void (APIENTRY *) (jint, jboolean, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(void, callPV__JIZIIJ, jint param0 _p_ jboolean param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4, ((void (APIENTRY *) (jint, jboolean, jint, jint, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4))
ARITYn(void, callV__JIZZZZ, jint param0 _p_ jboolean param1 _p_ jboolean param2 _p_ jboolean param3 _p_ jboolean param4, ((void (APIENTRY *) (jint, jboolean, jboolean, jboolean, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4))
ARITYn(void, callJV__JJ, jlong param0, ((void (APIENTRY *) (jlong))(intptr_t)__functionAddress)(param0))
ARITYn(void, callPV__JJ, jlong param0, ((void (APIENTRY *) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0))
ARITYn(void, callPV__JJF, jlong param0 _p_ jfloat param1, ((void (APIENTRY *) (intptr_t, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(void, callPV__JJFF, jlong param0 _p_ jfloat param1 _p_ jfloat param2, ((void (APIENTRY *) (intptr_t, jfloat, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(void, callPV__JJFFF, jlong param0 _p_ jfloat param1 _p_ jfloat param2 _p_ jfloat param3, ((void (APIENTRY *) (intptr_t, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3))
ARITYn(void, callPV__JJI, jlong param0 _p_ jint param1, ((void (APIENTRY *) (intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(void, callJV__JJI, jlong param0 _p_ jint param1, ((void (APIENTRY *) (jlong, jint))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, callJV__JJIFFFFFFFFF, jlong param0 _p_ jint param1 _p_ jfloat param2 _p_ jfloat param3 _p_ jfloat param4 _p_ jfloat param5 _p_ jfloat param6 _p_ jfloat param7 _p_ jfloat param8 _p_ jfloat param9 _p_ jfloat param10, ((void (APIENTRY *) (jlong, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10))
ARITYn(void, callPV__JJII, jlong param0 _p_ jint param1 _p_ jint param2, ((void (APIENTRY *) (intptr_t, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(void, callPV__JJIII, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3, ((void (APIENTRY *) (intptr_t, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3))
ARITYn(void, callPV__JJIIII, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4, ((void (APIENTRY *) (intptr_t, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4))
ARITYn(void, callPV__JJIIIII, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5, ((void (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5))
ARITYn(void, callPV__JJIIIIIIIIII, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jint param8 _p_ jint param9 _p_ jint param10, ((void (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10))
ARITYn(void, callPPPV__JJIIIIIJJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6 _p_ jlong param7, ((void (APIENTRY *) (intptr_t, jint, jint, jint, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(void, callPPPPV__JJIIIIJIJIJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5 _p_ jint param6 _p_ jlong param7 _p_ jint param8 _p_ jlong param9, ((void (APIENTRY *) (intptr_t, jint, jint, jint, jint, intptr_t, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5, param6, (intptr_t)param7, param8, (intptr_t)param9))
ARITYn(void, callPPV__JJIIJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3, ((void (APIENTRY *) (intptr_t, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3))
ARITYn(void, callPPPV__JJIIJJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4, ((void (APIENTRY *) (intptr_t, jint, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, (intptr_t)param4))
ARITYn(void, callPJPPPV__JJIIJJIJJ, jlong param0 _p_ jint param1 _p_ jint param2 _p_ jlong param3 _p_ jlong param4 _p_ jint param5 _p_ jlong param6 _p_ jlong param7, ((void (APIENTRY *) (intptr_t, jint, jint, jlong, intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(void, callPPV__JJIJ, jlong param0 _p_ jint param1 _p_ jlong param2, ((void (APIENTRY *) (intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2))
ARITYn(void, callPJV__JJIJ, jlong param0 _p_ jint param1 _p_ jlong param2, ((void (APIENTRY *) (intptr_t, jint, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(void, callPJV__JJIJI, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3, ((void (APIENTRY *) (intptr_t, jint, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3))
ARITYn(void, callPPPPPV__JJIJIIIJIJIJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6 _p_ jint param7 _p_ jlong param8 _p_ jint param9 _p_ jlong param10, ((void (APIENTRY *) (intptr_t, jint, intptr_t, jint, jint, jint, intptr_t, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, param4, param5, (intptr_t)param6, param7, (intptr_t)param8, param9, (intptr_t)param10))
ARITYn(void, callPJPPV__JJIJIIJIJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5 _p_ jint param6 _p_ jlong param7, ((void (APIENTRY *) (intptr_t, jint, jlong, jint, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5, param6, (intptr_t)param7))
ARITYn(void, callPPPV__JJIJIJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jint param3 _p_ jlong param4, ((void (APIENTRY *) (intptr_t, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, param3, (intptr_t)param4))
ARITYn(void, callPPPV__JJIJJ, jlong param0 _p_ jint param1 _p_ jlong param2 _p_ jlong param3, ((void (APIENTRY *) (intptr_t, jint, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(void, callPPV__JJJ, jlong param0 _p_ jlong param1, ((void (APIENTRY *) (intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1))
ARITYn(void, callPJV__JJJ, jlong param0 _p_ jlong param1, ((void (APIENTRY *) (intptr_t, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1))
ARITYn(void, callPPV__JJJI, jlong param0 _p_ jlong param1 _p_ jint param2, ((void (APIENTRY *) (intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2))
ARITYn(void, callPJV__JJJI, jlong param0 _p_ jlong param1 _p_ jint param2, ((void (APIENTRY *) (intptr_t, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(void, callPJV__JJJII, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3, ((void (APIENTRY *) (intptr_t, jlong, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3))
ARITYn(void, callPPPV__JJJIIIIIIJIIIIIIIII, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jint param5 _p_ jint param6 _p_ jint param7 _p_ jlong param8 _p_ jint param9 _p_ jint param10 _p_ jint param11 _p_ jint param12 _p_ jint param13 _p_ jint param14 _p_ jint param15 _p_ jint param16 _p_ jint param17, ((void (APIENTRY *) (intptr_t, intptr_t, jint, jint, jint, jint, jint, jint, intptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8, param9, param10, param11, param12, param13, param14, param15, param16, param17))
ARITYn(void, callPJPV__JJJIIIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5, ((void (APIENTRY *) (intptr_t, jlong, jint, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(void, callPJJJJV__JJJIIJJJI, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jint param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6 _p_ jint param7, ((void (APIENTRY *) (intptr_t, jlong, jint, jint, jlong, jlong, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, param6, param7))
ARITYn(void, callPJPV__JJJIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3, ((void (APIENTRY *) (intptr_t, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3))
ARITYn(void, callPPPV__JJJIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3, ((void (APIENTRY *) (intptr_t, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, param2, (intptr_t)param3))
ARITYn(void, callPJJPV__JJJIJIIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6, ((void (APIENTRY *) (intptr_t, jlong, jint, jlong, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, (intptr_t)param6))
ARITYn(void, callPJJPV__JJJIJIIJI, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jint param5 _p_ jlong param6 _p_ jint param7, ((void (APIENTRY *) (intptr_t, jlong, jint, jlong, jint, jint, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, param5, (intptr_t)param6, param7))
ARITYn(void, callPJJPV__JJJIJIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jlong param5, ((void (APIENTRY *) (intptr_t, jlong, jint, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(void, callPJPPV__JJJIJIJ, jlong param0 _p_ jlong param1 _p_ jint param2 _p_ jlong param3 _p_ jint param4 _p_ jlong param5, ((void (APIENTRY *) (intptr_t, jlong, jint, intptr_t, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5))
ARITYn(void, callPJPV__JJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2, ((void (APIENTRY *) (intptr_t, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2))
ARITYn(void, callPPPV__JJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2, ((void (APIENTRY *) (intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2))
ARITYn(void, callPJJV__JJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2, ((void (APIENTRY *) (intptr_t, jlong, jlong))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2))
ARITYn(void, callPJJV__JJJJI, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3, ((void (APIENTRY *) (intptr_t, jlong, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3))
ARITYn(void, callPJJV__JJJJII, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4, ((void (APIENTRY *) (intptr_t, jlong, jlong, jint, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4))
ARITYn(void, callPJJPV__JJJJIIJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5, ((void (APIENTRY *) (intptr_t, jlong, jlong, jint, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4, (intptr_t)param5))
ARITYn(void, callPPPPPPV__JJJJIIJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jint param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7, ((void (APIENTRY *) (intptr_t, intptr_t, intptr_t, jint, jint, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, param3, param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(void, callPJJPV__JJJJIJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jint param3 _p_ jlong param4, ((void (APIENTRY *) (intptr_t, jlong, jlong, jint, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4))
ARITYn(void, callPJPPV__JJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, ((void (APIENTRY *) (intptr_t, jlong, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(void, callPPPPV__JJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3, ((void (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3))
ARITYn(void, callPJJJV__JJJJJI, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4, ((void (APIENTRY *) (intptr_t, jlong, jlong, jlong, jint))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, param4))
ARITYn(void, callPPPPV__JJJJJI, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jint param4, ((void (APIENTRY *) (intptr_t, intptr_t, intptr_t, intptr_t, jint))(intptr_t)__functionAddress)((intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4))
ARITYn(void, callPJJJPV__JJJJJJ, jlong param0 _p_ jlong param1 _p_ jlong param2 _p_ jlong param3 _p_ jlong param4, ((void (APIENTRY *) (intptr_t, jlong, jlong, jlong, intptr_t))(intptr_t)__functionAddress)((intptr_t)param0, param1, param2, param3, (intptr_t)param4))
ARITYn(void, callV__JS, jshort param0, ((void (APIENTRY *) (jshort))(intptr_t)__functionAddress)(param0))
ARITYn(void, callV__JSS, jshort param0 _p_ jshort param1, ((void (APIENTRY *) (jshort, jshort))(intptr_t)__functionAddress)(param0, param1))
ARITYn(void, callV__JSSS, jshort param0 _p_ jshort param1 _p_ jshort param2, ((void (APIENTRY *) (jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(void, callV__JSSSS, jshort param0 _p_ jshort param1 _p_ jshort param2 _p_ jshort param3, ((void (APIENTRY *) (jshort, jshort, jshort, jshort))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(void, callV__JZ, jboolean param0, ((void (APIENTRY *) (jboolean))(intptr_t)__functionAddress)(param0))
ARITYn(void, callV__JZZZZ, jboolean param0 _p_ jboolean param1 _p_ jboolean param2 _p_ jboolean param3, ((void (APIENTRY *) (jboolean, jboolean, jboolean, jboolean))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(jboolean, callZ__JI, jint param0, return ((jboolean (APIENTRY *) (jint))(intptr_t)__functionAddress)(param0))
ARITYn(jboolean, callZ__JIFF, jint param0 _p_ jfloat param1 _p_ jfloat param2, return ((jboolean (APIENTRY *) (jint, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2))
ARITYn(jboolean, callZ__JII, jint param0 _p_ jint param1, return ((jboolean (APIENTRY *) (jint, jint))(intptr_t)__functionAddress)(param0, param1))
ARITYn(jboolean, callZ__JIIFF, jint param0 _p_ jint param1 _p_ jfloat param2 _p_ jfloat param3, return ((jboolean (APIENTRY *) (jint, jint, jfloat, jfloat))(intptr_t)__functionAddress)(param0, param1, param2, param3))
ARITYn(jboolean, callPPPPZ__JIIIFJJJJ, jint param0 _p_ jint param1 _p_ jint param2 _p_ jfloat param3 _p_ jlong param4 _p_ jlong param5 _p_ jlong param6 _p_ jlong param7, return ((jboolean (APIENTRY *) (jint, jint, jint, jfloat, intptr_t, intptr_t, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7))
ARITYn(jboolean, callPZ__JIJ, jint param0 _p_ jlong param1, return ((jboolean (APIENTRY *) (jint, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1))
ARITYn(jboolean, callPPZ__JIJJ, jint param0 _p_ jlong param1 _p_ jlong param2, return ((jboolean (APIENTRY *) (jint, intptr_t, intptr_t))(intptr_t)__functionAddress)(param0, (intptr_t)param1, (intptr_t)param2))
ARITYn(jboolean, callPZ__JJ, jlong param0, return ((jboolean (APIENTRY *) (intptr_t))(intptr_t)__functionAddress)((intptr_t)param0))
ARITYn(jboolean, callJZ__JJ, jlong param0, return ((jboolean (APIENTRY *) (jlong))(intptr_t)__functionAddress)(param0))

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_JNI_invokePB__J_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jbyte __result = Java_org_lwjgl_system_JNI_invokePB__JJ(__env, clazz, __functionAddress, (intptr_t)paramArray0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jbyte JNICALL JavaCritical_org_lwjgl_system_JNI_invokePB__J_3I(jlong __functionAddress, jint length0, jint* param0) {
	UNUSED_PARAM(length0)
	return Java_org_lwjgl_system_JNI_invokePB__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JI_3II_3IIZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jintArray param3, jint param4, jboolean param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_invokePPI__JIJIJIZ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2, (intptr_t)paramArray3, param4, param5);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPI__JI_3II_3IIZ(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jint length3, jint* param3, jint param4, jboolean param5) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_invokePPI__JIJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, (intptr_t)param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JI_3SI_3SIZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jshortArray param1, jint param2, jshortArray param3, jint param4, jboolean param5) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jshort *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_invokePPI__JIJIJIZ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2, (intptr_t)paramArray3, param4, param5);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPI__JI_3SI_3SIZ(jlong __functionAddress, jint param0, jint length1, jshort* param1, jint param2, jint length3, jshort* param3, jint param4, jboolean param5) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_invokePPI__JIJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, (intptr_t)param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlongArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_invokePPPPI__JJJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPI__JJJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jlong* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_invokePPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JSB_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jbyte param1, jfloatArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_invokePI__JSBJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__JSB_3F(jlong __functionAddress, jshort param0, jbyte param1, jint length2, jfloat* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_invokePI__JSBJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JSB_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jbyte param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_invokePI__JSBJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__JSB_3I(jlong __functionAddress, jshort param0, jbyte param1, jint length2, jint* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_invokePI__JSBJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JSB_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jbyte param1, jshortArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_invokePI__JSBJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__JSB_3S(jlong __functionAddress, jshort param0, jbyte param1, jint length2, jshort* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_invokePI__JSBJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JS_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jfloatArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint __result = Java_org_lwjgl_system_JNI_invokePI__JSJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__JS_3F(jlong __functionAddress, jshort param0, jint length1, jfloat* param1) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_invokePI__JSJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JS_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jintArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint __result = Java_org_lwjgl_system_JNI_invokePI__JSJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__JS_3I(jlong __functionAddress, jshort param0, jint length1, jint* param1) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_invokePI__JSJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JS_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jshortArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint __result = Java_org_lwjgl_system_JNI_invokePI__JSJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__JS_3S(jlong __functionAddress, jshort param0, jint length1, jshort* param1) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_invokePI__JSJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__J_3FS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0, jshort param1) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jint __result = Java_org_lwjgl_system_JNI_invokePI__JJS(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_invokePI__J_3FS(jlong __functionAddress, jint length0, jfloat* param0, jshort param1) {
	UNUSED_PARAM(length0)
	return Java_org_lwjgl_system_JNI_invokePI__JJS(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jlong __result = Java_org_lwjgl_system_JNI_invokePPP__JJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPP__JJ_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_invokePPP__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__J_3DI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jdoubleArray param0, jint param1) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jlong __result = Java_org_lwjgl_system_JNI_invokePP__JJI(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePP__J_3DI(jlong __functionAddress, jint length0, jdouble* param0, jint param1) {
	UNUSED_PARAM(length0)
	return Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__J_3FI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0, jint param1) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jlong __result = Java_org_lwjgl_system_JNI_invokePP__JJI(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePP__J_3FI(jlong __functionAddress, jint length0, jfloat* param0, jint param1) {
	UNUSED_PARAM(length0)
	return Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__J_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jint param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jlong __result = Java_org_lwjgl_system_JNI_invokePP__JJI(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePP__J_3II(jlong __functionAddress, jint length0, jint* param0, jint param1) {
	UNUSED_PARAM(length0)
	return Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__J_3JI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlongArray param0, jint param1) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jlong __result = Java_org_lwjgl_system_JNI_invokePP__JJI(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePP__J_3JI(jlong __functionAddress, jint length0, jlong* param0, jint param1) {
	UNUSED_PARAM(length0)
	return Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__J_3SI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshortArray param0, jint param1) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jlong __result = Java_org_lwjgl_system_JNI_invokePP__JJI(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_invokePP__J_3SI(jlong __functionAddress, jint length0, jshort* param0, jint param1) {
	UNUSED_PARAM(length0)
	return Java_org_lwjgl_system_JNI_invokePP__JJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePS__JB_3SZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jbyte param0, jshortArray param1, jboolean param2) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jshort __result = Java_org_lwjgl_system_JNI_invokePS__JBJZ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_system_JNI_invokePS__JB_3SZ(jlong __functionAddress, jbyte param0, jint length1, jshort* param1, jboolean param2) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_invokePS__JBJZ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePS__JS_3SS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jshortArray param1, jshort param2) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jshort __result = Java_org_lwjgl_system_JNI_invokePS__JSJS(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_system_JNI_invokePS__JS_3SS(jlong __functionAddress, jshort param0, jint length1, jshort* param1, jshort param2) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_invokePS__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePPPS__J_3SJJSF(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshortArray param0, jlong param1, jlong param2, jshort param3, jfloat param4) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jshort __result = Java_org_lwjgl_system_JNI_invokePPPS__JJJJSF(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1, param2, param3, param4);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPS__J_3SJJSF(jlong __functionAddress, jint length0, jshort* param0, jlong param1, jlong param2, jshort param3, jfloat param4) {
	UNUSED_PARAM(length0)
	return Java_org_lwjgl_system_JNI_invokePPPS__JJJJSF(NULL, NULL, __functionAddress, (intptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JB_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jbyte param0, jfloatArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePV__JBJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JB_3F(jlong __functionAddress, jbyte param0, jint length1, jfloat* param1) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePV__JBJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JB_3F_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jbyte param0, jfloatArray param1, jfloatArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jfloat *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_invokePPV__JBJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JB_3F_3F(jlong __functionAddress, jbyte param0, jint length1, jfloat* param1, jint length2, jfloat* param2) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_invokePPV__JBJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JB_3F_3FB_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jbyte param0, jfloatArray param1, jfloatArray param2, jbyte param3, jfloatArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jfloat *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_invokePPPV__JBJJBJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JB_3F_3FB_3F(jlong __functionAddress, jbyte param0, jint length1, jfloat* param1, jint length2, jfloat* param2, jbyte param3, jint length4, jfloat* param4) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_invokePPPV__JBJJBJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_invokePPV__JIIIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JIII_3I_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jint length4, jint* param4) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_invokePPV__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jdoubleArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_invokePV__JIIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3D(jlong __functionAddress, jint param0, jint param1, jint length2, jdouble* param2) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JII_3D_3D_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jdoubleArray param2, jdoubleArray param3, jdoubleArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jdouble *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jdouble *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JII_3D_3D_3D(jlong __functionAddress, jint param0, jint param1, jint length2, jdouble* param2, jint length3, jdouble* param3, jint length4, jdouble* param4) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jfloatArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_invokePV__JIIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3F(jlong __functionAddress, jint param0, jint param1, jint length2, jfloat* param2) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3FII(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jfloatArray param2, jint param3, jint param4) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_invokePV__JIIJII(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3FII(jlong __functionAddress, jint param0, jint param1, jint length2, jfloat* param2, jint param3, jint param4) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_invokePV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JII_3F_3F_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jfloatArray param2, jfloatArray param3, jfloatArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jfloat *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JII_3F_3F_3F(jlong __functionAddress, jint param0, jint param1, jint length2, jfloat* param2, jint length3, jfloat* param3, jint length4, jfloat* param4) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_invokePV__JIIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3III(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jint param3, jint param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_invokePV__JIIJII(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3III(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint param3, jint param4) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_invokePV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlongArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_invokePV__JIIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3J(jlong __functionAddress, jint param0, jint param1, jint length2, jlong* param2) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_invokePV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JII_3J_3J_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlongArray param2, jlongArray param3, jlongArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jlong *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jlong *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JII_3J_3J_3J(jlong __functionAddress, jint param0, jint param1, jint length2, jlong* param2, jint length3, jlong* param3, jint length4, jlong* param4) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JII_3SII(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jshortArray param2, jint param3, jint param4) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_invokePV__JIIJII(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JII_3SII(jlong __functionAddress, jint param0, jint param1, jint length2, jshort* param2, jint param3, jint param4) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_invokePV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JIJI_3F_3FJIJIZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jlong param7, jint param8, jboolean param9) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4, param5, param6, param7, param8, param9);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPPV__JIJI_3F_3FJIJIZ(jlong __functionAddress, jint param0, jlong param1, jint param2, jint length3, jfloat* param3, jint length4, jfloat* param4, jlong param5, jint param6, jlong param7, jint param8, jboolean param9) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4, param5, param6, param7, param8, param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JI_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jdoubleArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePV__JIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JI_3D(jlong __functionAddress, jint param0, jint length1, jdouble* param1) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JI_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jfloatArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePV__JIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JI_3F(jlong __functionAddress, jint param0, jint length1, jfloat* param1) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JI_3F_3F_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jfloatArray param1, jfloatArray param2, jfloatArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jfloat *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jfloat *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_invokePPPV__JIJJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JI_3F_3F_3F(jlong __functionAddress, jint param0, jint length1, jfloat* param1, jint length2, jfloat* param2, jint length3, jfloat* param3) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_invokePPPV__JIJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePV__JIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JI_3I(jlong __functionAddress, jint param0, jint length1, jint* param1) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JI_3II_3F_3FJI_3IIZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jintArray param7, jint param8, jboolean param9) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jfloat *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4, param5, param6, (intptr_t)paramArray7, param8, param9);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPPV__JI_3II_3F_3FJI_3IIZ(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jint length3, jfloat* param3, jint length4, jfloat* param4, jlong param5, jint param6, jint length7, jint* param7, jint param8, jboolean param9) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, param5, param6, (intptr_t)param7, param8, param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JI_3SI_3F_3FJI_3SIZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jshortArray param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jshortArray param7, jint param8, jboolean param9) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jfloat *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jshort *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4, param5, param6, (intptr_t)paramArray7, param8, param9);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPPV__JI_3SI_3F_3FJI_3SIZ(jlong __functionAddress, jint param0, jint length1, jshort* param1, jint param2, jint length3, jfloat* param3, jint length4, jfloat* param4, jlong param5, jint param6, jint length7, jshort* param7, jint param8, jboolean param9) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_invokePPPPPV__JIJIJJJIJIZ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, (intptr_t)param3, (intptr_t)param4, param5, param6, (intptr_t)param7, param8, param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_invokePPV__JJIIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJII_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_invokePPV__JJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJ_3D_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jdoubleArray param1, jdoubleArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jdouble *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JJ_3D_3D(jlong __functionAddress, jlong param0, jint length1, jdouble* param1, jint length2, jdouble* param2) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJ_3FI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jfloatArray param1, jint param2) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePPV__JJJI(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJ_3FI(jlong __functionAddress, jlong param0, jint length1, jfloat* param1, jint param2) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePPV__JJJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJ_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jint param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePPV__JJJI(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJ_3II(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint param2) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePPV__JJJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__JJ_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJ_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2, jintArray param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_invokePPPPPV__JJJJJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPPPV__JJ_3I_3I_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_invokePPPPPV__JJJJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJ_3SI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jshortArray param1, jint param2) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePPV__JJJI(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPV__JJ_3SI(jlong __functionAddress, jlong param0, jint length1, jshort* param1, jint param2) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePPV__JJJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JS_3DS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jdoubleArray param1, jshort param2) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePV__JSJS(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JS_3DS(jlong __functionAddress, jshort param0, jint length1, jdouble* param1, jshort param2) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JS_3FS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jfloatArray param1, jshort param2) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePV__JSJS(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JS_3FS(jlong __functionAddress, jshort param0, jint length1, jfloat* param1, jshort param2) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JS_3IS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jintArray param1, jshort param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePV__JSJS(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JS_3IS(jlong __functionAddress, jshort param0, jint length1, jint* param1, jshort param2) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JS_3JS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jlongArray param1, jshort param2) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePV__JSJS(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JS_3JS(jlong __functionAddress, jshort param0, jint length1, jlong* param1, jshort param2) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JS_3SS(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshort param0, jshortArray param1, jshort param2) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_invokePV__JSJS(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePV__JS_3SS(jlong __functionAddress, jshort param0, jint length1, jshort* param1, jshort param2) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_invokePV__JSJS(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__J_3FIJJI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0, jint param1, jlong param2, jlong param3, jint param4) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	Java_org_lwjgl_system_JNI_invokePPPV__JJIJJI(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1, param2, param3, param4);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__J_3FIJJI(jlong __functionAddress, jint length0, jfloat* param0, jint param1, jlong param2, jlong param3, jint param4) {
	UNUSED_PARAM(length0)
	Java_org_lwjgl_system_JNI_invokePPPV__JJIJJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__J_3FZIJJI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0, jboolean param1, jint param2, jlong param3, jlong param4, jint param5) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	Java_org_lwjgl_system_JNI_invokePPPV__JJZIJJI(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1, param2, param3, param4, param5);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__J_3FZIJJI(jlong __functionAddress, jint length0, jfloat* param0, jboolean param1, jint param2, jlong param3, jlong param4, jint param5) {
	UNUSED_PARAM(length0)
	Java_org_lwjgl_system_JNI_invokePPPV__JJZIJJI(NULL, NULL, __functionAddress, (intptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__J_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jintArray param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(__env, clazz, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPPV__J_3I_3I_3I(jlong __functionAddress, jint length0, jint* param0, jint length1, jint* param1, jint length2, jint* param2) {
	UNUSED_PARAM(length0)
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jboolean __result = Java_org_lwjgl_system_JNI_invokePPZ__JJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_system_JNI_invokePPZ__JJ_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_invokePPZ__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jfloatArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPI__JIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__JIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jfloat* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPI__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPI__JIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__JIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPI__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPI__JIIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__JII_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPI__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JII_3I_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jintArray param3, jintArray param4, jintArray param5, jlong param6) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JIIJJJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4, (intptr_t)paramArray5, param6);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JII_3I_3I_3I_3IJ(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4, jint length5, jint* param5, jlong param6) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPPPPPI__JIIJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPI__JII_3I_3I_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jintArray param3, jintArray param4, jintArray param5, jintArray param6, jlong param7) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPI__JIIJJJJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4, (intptr_t)paramArray5, (intptr_t)paramArray6, param7);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPI__JII_3I_3I_3I_3I_3IJ(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4, jint length5, jint* param5, jint length6, jint* param6, jlong param7) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	UNUSED_PARAM(length6)
	return Java_org_lwjgl_system_JNI_callPPPPPPI__JIIJJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPI__JIJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JIJ_3I(jlong __functionAddress, jint param0, jlong param1, jint length2, jint* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPI__JIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPI__JIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__JI_3I(jlong __functionAddress, jint param0, jint length1, jint* param1) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_callPI__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIII_3I_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jintArray param4, jfloatArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jfloat *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIIIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIII_3I_3F(jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jint length5, jfloat* param5) {
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPPPI__JJIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jintArray param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIIIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIII_3I_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jint length5, jint* param5) {
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPPPI__JJIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIIJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jlong param3, jintArray param4, jlong param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIIJ_3IJ(jlong __functionAddress, jlong param0, jint param1, jint param2, jlong param3, jint length4, jint* param4, jlong param5) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIIJ_3JJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jlong param3, jlongArray param4, jlong param5) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIIJ_3JJ(jlong __functionAddress, jlong param0, jint param1, jint param2, jlong param3, jint length4, jlong* param4, jlong param5) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPI__JJIIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JJII_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPI__JJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIJIIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jintArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIJIIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIJIIJ_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jint length6, jint* param6) {
	UNUSED_PARAM(length6)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJIJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jlongArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIJJ_3J(jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jint length4, jlong* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jdoubleArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIJ_3D(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jdouble* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jfloatArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIJ_3F(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jfloat* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJPI__JJIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPI__JJIJ_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPJPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIJ_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jintArray param3, jlong param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIJ_3IJ(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jint* param3, jlong param4) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlongArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIJ_3J(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jlong* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIJ_3JJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlongArray param3, jlong param4) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJIJ_3JJ(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jlong* param3, jlong param4) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJ_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jshortArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJIJ_3S(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint length3, jshort* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPI__JJIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JJI_3I(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPI__JJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJI_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJI_3I_3I(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2, jint length3, jint* param3) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJI_3I_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2, jlongArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jlong *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJI_3I_3J(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2, jint length3, jlong* param3) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJI_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlongArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPI__JJIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JJI_3J(jlong __functionAddress, jlong param0, jint param1, jint length2, jlong* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPI__JJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJI__JJI_3JIJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlongArray param2, jint param3, jlong param4) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPJI__JJIJIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPJI__JJI_3JIJ(jlong __functionAddress, jlong param0, jint param1, jint length2, jlong* param2, jint param3, jlong param4) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPJI__JJIJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJIIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJPPI__JJJIIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPI__JJJIIJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jint length5, jint* param5) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPJPPI__JJJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJ_3IJI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jintArray param5, jlong param6, jint param7) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJJJI(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPJI__JJJIIJ_3IJI(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jint length5, jint* param5, jlong param6, jint param7) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJJJI(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJ_3JJI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlongArray param5, jlong param6, jint param7) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJJJI(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPJI__JJJIIJ_3JJI(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jint length5, jlong* param5, jlong param6, jint param7) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPJPPJI__JJJIIJJJI(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3DIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jdoubleArray param10, jint param11, jlong param12, jlong param13) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10, param11, param12, param13);
	if ( param10 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3DIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jint length10, jdouble* param10, jint param11, jlong param12, jlong param13) {
	UNUSED_PARAM(length10)
	return Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10, param11, param12, param13);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3FIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jfloatArray param10, jint param11, jlong param12, jlong param13) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10, param11, param12, param13);
	if ( param10 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3FIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jint length10, jfloat* param10, jint param11, jlong param12, jlong param13) {
	UNUSED_PARAM(length10)
	return Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10, param11, param12, param13);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3IIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jintArray param10, jint param11, jlong param12, jlong param13) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10, param11, param12, param13);
	if ( param10 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3IIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jint length10, jint* param10, jint param11, jlong param12, jlong param13) {
	UNUSED_PARAM(length10)
	return Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10, param11, param12, param13);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3SIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jshortArray param10, jint param11, jlong param12, jlong param13) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10, param11, param12, param13);
	if ( param10 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJ_3SIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jint length10, jshort* param10, jint param11, jlong param12, jlong param13) {
	UNUSED_PARAM(length10)
	return Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJIJJJJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10, param11, param12, param13);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3DIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jdoubleArray param7, jint param8, jlong param9, jlong param10) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7, param8, param9, param10);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3DIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jint length7, jdouble* param7, jint param8, jlong param9, jlong param10) {
	UNUSED_PARAM(length7)
	return Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8, param9, param10);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3FIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jfloatArray param7, jint param8, jlong param9, jlong param10) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7, param8, param9, param10);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3FIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jint length7, jfloat* param7, jint param8, jlong param9, jlong param10) {
	UNUSED_PARAM(length7)
	return Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8, param9, param10);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3IIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jintArray param7, jint param8, jlong param9, jlong param10) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7, param8, param9, param10);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3IIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jint length7, jint* param7, jint param8, jlong param9, jlong param10) {
	UNUSED_PARAM(length7)
	return Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8, param9, param10);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3SIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jshortArray param7, jint param8, jlong param9, jlong param10) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7, param8, param9, param10);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJ_3SIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jint length7, jshort* param7, jint param8, jlong param9, jlong param10) {
	UNUSED_PARAM(length7)
	return Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJIJJJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7, param8, param9, param10);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3DIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jdoubleArray param5, jint param6, jlong param7, jlong param8) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7, param8);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3DIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint length5, jdouble* param5, jint param6, jlong param7, jlong param8) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7, param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3FIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jfloatArray param5, jint param6, jlong param7, jlong param8) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7, param8);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3FIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint length5, jfloat* param5, jint param6, jlong param7, jlong param8) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7, param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3IIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jintArray param5, jint param6, jlong param7, jlong param8) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7, param8);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3IIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint length5, jint* param5, jint param6, jlong param7, jlong param8) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7, param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPPI__JJJIJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlongArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJPPPI__JJJIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPI__JJJIJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint length5, jlong* param5) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPJPPPI__JJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3SIJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jshortArray param5, jint param6, jlong param7, jlong param8) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, param7, param8);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJ_3SIJJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint length5, jshort* param5, jint param6, jlong param7, jlong param8) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, param7, param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJPPI__JJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPI__JJJIJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPJPPI__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJJIJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4, jlong param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJJIJ_3IJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jint* param4, jlong param5) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJ_3JJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlongArray param4, jlong param5) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJJIJ_3JJ(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jlong* param4, jlong param5) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPI__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJI_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlongArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJJI_3J(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jlong* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPI__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JJJI_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlongArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJPI__JJJIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPI__JJJI_3J(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jlong* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPJPI__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJJIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJIJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jintArray param6, jlong param7) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, param7);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJIJ_3IJ(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jint length6, jint* param6, jlong param7) {
	UNUSED_PARAM(length6)
	return Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJJJPI__JJJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJJJJPI__JJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJJPI__JJJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint length5, jint* param5) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPJJJJPI__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPPI__JJJJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlongArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJPPPI__JJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPI__JJJJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jlong* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPJPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlongArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jlong* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJ_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jint param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJI(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJJ_3II(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint param3) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPPI__JJJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jlong param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJJ_3IJ(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jlong param3) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jlong param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPI__JJJ_3IJ(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jlong param3) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint length3, jint* param3) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPI__JJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint length3, jint* param3) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJ_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jintArray param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJJ_3I_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJ_3I_3I_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jintArray param3, jlongArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jlong *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJJ_3I_3I_3J(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jlong* param4) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJ_3I_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jlongArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jlong *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPI__JJJ_3I_3J(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint length3, jlong* param3) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlongArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jint length2, jlong* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPI__JJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JJ_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_callPPI__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jlong param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJ_3IJ(jlong __functionAddress, jlong param0, jint length1, jint* param1, jlong param2) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJ_3IJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jlong param2, jint param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJJIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJ_3IJI_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jlong param2, jint param3, jint length4, jint* param4) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJJJIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJ_3I_3FI_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jfloatArray param2, jint param3, jintArray param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jfloat *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJJIJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJ_3I_3FI_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jfloat* param2, jint param3, jint length4, jint* param4, jint length5, jint* param5) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPPPPPI__JJJJIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4, (intptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJ_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJ_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2, jintArray param3, jlong param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, (intptr_t)paramArray3, param4);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPI__JJ_3I_3I_3IJ(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2, jint length3, jint* param3, jlong param4) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPI__JJ_3I_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2, jintArray param3, jintArray param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPPPI__JJJJJJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPI__JJ_3I_3I_3I_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4, jint length5, jint* param5) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPPPPPPI__JJJJJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlongArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPI__JJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__JJ_3J(jlong __functionAddress, jlong param0, jint length1, jlong* param1) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_callPPI__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJ_3JIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlongArray param1, jint param2, jlong param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPPI__JJJIJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPI__JJ_3JIJ_3I(jlong __functionAddress, jlong param0, jint length1, jlong* param1, jint param2, jlong param3, jint length4, jint* param4) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPI__JJJIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJ_3J_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlongArray param1, jlongArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jlong *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__JJ_3J_3J(jlong __functionAddress, jlong param0, jint length1, jlong* param1, jint length2, jlong* param2) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__J_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPI__JJ(__env, clazz, __functionAddress, (intptr_t)paramArray0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPI__J_3I(jlong __functionAddress, jint length0, jint* param0) {
	UNUSED_PARAM(length0)
	return Java_org_lwjgl_system_JNI_callPI__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__J_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jlong param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPI__JJJ(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPI__J_3IJ(jlong __functionAddress, jint length0, jint* param0, jlong param1) {
	UNUSED_PARAM(length0)
	return Java_org_lwjgl_system_JNI_callPPI__JJJ(NULL, NULL, __functionAddress, (intptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__J_3IJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jlong param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint __result = Java_org_lwjgl_system_JNI_callPPPI__JJJJ(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPI__J_3IJ_3I(jlong __functionAddress, jint length0, jint* param0, jlong param1, jint length2, jint* param2) {
	UNUSED_PARAM(length0)
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPPI__JJJJ(NULL, NULL, __functionAddress, (intptr_t)param0, param1, (intptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JIII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPP__JIIIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPP__JIII_3I_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jint length4, jint* param4) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPP__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPP__JIJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPP__JIJ_3I(jlong __functionAddress, jint param0, jlong param1, jint length2, jint* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPP__JIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JJIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPP__JJIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPP__JJIII_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPP__JJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPP__JJIJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPPPP__JJIJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPP__JJIJJJ_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint length5, jint* param5) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPPPPPP__JJIJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPPP__JJIJJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jintArray param5, jintArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPPPPP__JJIJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPP__JJIJJJ_3I_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint length5, jint* param5, jint length6, jint* param6) {
	UNUSED_PARAM(length5)
	UNUSED_PARAM(length6)
	return Java_org_lwjgl_system_JNI_callPPPPPPP__JJIJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, (intptr_t)param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJIJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPPP__JJIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPP__JJIJJ_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jlong param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPP__JJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPP__JJIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPP__JJI_3I(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPP__JJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJI_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2, jlong param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPP__JJIJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPP__JJI_3IJ(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2, jlong param3) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPPP__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPP__JJJIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPP__JJJIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPP__JJJIII_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jint* param5) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPJPP__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJJII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPP__JJJIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPP__JJJII_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPP__JJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJJII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jintArray param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPP__JJJIIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPP__JJJII_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint length4, jint* param4, jint length5, jint* param5) {
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPJPPP__JJJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPPP__JJJIJJJIJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8, jintArray param9) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPJPPPPPP__JJJIJJJIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPJPPPPPP__JJJIJJJIJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8, jint length9, jint* param9) {
	UNUSED_PARAM(length9)
	return Java_org_lwjgl_system_JNI_callPPJPPPPPP__JJJIJJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPPPPP__JJJIJJJJJIJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint param8, jlong param9, jlong param10, jintArray param11) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray11 = param11 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param11, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPJPPPPPPPP__JJJIJJJJJIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)paramArray11);
	if ( param11 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param11, paramArray11, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPJPPPPPPPP__JJJIJJJJJIJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint param8, jlong param9, jlong param10, jint length11, jint* param11) {
	UNUSED_PARAM(length11)
	return Java_org_lwjgl_system_JNI_callPPJPPPPPPPP__JJJIJJJJJIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPPP__JJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPP__JJJIJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPP__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJJIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPP__JJJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPP__JJJIJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jlong param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPJPPP__JJJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPP__JJJIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPP__JJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPP__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPP__JJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPP__JJJIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPP__JJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPJPP__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPPP__JJJJIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPP__JJJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPPPPP__JJJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jintArray param9) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jint length9, jint* param9) {
	UNUSED_PARAM(length9)
	return Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3F_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jfloatArray param8, jintArray param9) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
	jint *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8, (intptr_t)paramArray9);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
	if ( param8 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3F_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint length8, jfloat* param8, jint length9, jint* param9) {
	UNUSED_PARAM(length8)
	UNUSED_PARAM(length9)
	return Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8, (intptr_t)param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jintArray param8, jintArray param9) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
	jint *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8, (intptr_t)paramArray9);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
	if ( param8 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint length8, jint* param8, jint length9, jint* param9) {
	UNUSED_PARAM(length8)
	UNUSED_PARAM(length9)
	return Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8, (intptr_t)param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3S_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jshortArray param8, jintArray param9) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
	jint *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8, (intptr_t)paramArray9);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
	if ( param8 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3S_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint length8, jshort* param8, jint length9, jint* param9) {
	UNUSED_PARAM(length8)
	UNUSED_PARAM(length9)
	return Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8, (intptr_t)param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jintArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jint length7, jint* param7) {
	UNUSED_PARAM(length7)
	return Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3F_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jfloatArray param6, jintArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	jint *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3F_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint length6, jfloat* param6, jint length7, jint* param7) {
	UNUSED_PARAM(length6)
	UNUSED_PARAM(length7)
	return Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jintArray param6, jintArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	jint *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint length6, jint* param6, jint length7, jint* param7) {
	UNUSED_PARAM(length6)
	UNUSED_PARAM(length7)
	return Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3S_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jshortArray param6, jintArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	jint *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3S_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint length6, jshort* param6, jint length7, jint* param7) {
	UNUSED_PARAM(length6)
	UNUSED_PARAM(length7)
	return Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPJPPP__JJJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPJPPP__JJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPJPPP__JJJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint length5, jint* param5) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPPPJPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint length5, jint* param5) {
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3F_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jfloatArray param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3F_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jfloat* param4, jint length5, jint* param5) {
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPP__JJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jintArray param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jint* param4, jint length5, jint* param5) {
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3S_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jshortArray param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3S_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jshort* param4, jint length5, jint* param5) {
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	return Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3D_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jdoubleArray param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3D_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jdouble* param3, jint length4, jint* param4) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3F_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jfloatArray param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3F_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jfloat* param3, jint length4, jint* param4) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPPP__JJJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPP__JJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPPP__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPP__JJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPJPP__JJJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPJPP__JJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPJPP__JJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jintArray param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3I_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jint* param3, jint length4, jint* param4) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3S_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jshortArray param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3S_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jint length3, jshort* param3, jint length4, jint* param4) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPP__JJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPP__JJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2) {
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPPP__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJJ_3II_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jint param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPJPPP__JJJJIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPP__JJJ_3II_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jint param3, jint length4, jint* param4) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length4)
	return Java_org_lwjgl_system_JNI_callPJPPP__JJJJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, (intptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJ_3J_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlongArray param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPPP__JJJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPP__JJJ_3J_3I(jlong __functionAddress, jlong param0, jlong param1, jint length2, jlong* param2, jint length3, jint* param3) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	return Java_org_lwjgl_system_JNI_callPPPPP__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPP__JJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPP__JJ_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_callPPP__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJ_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPPPP__JJJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPP__JJ_3I_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1, jint length2, jint* param2) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	return Java_org_lwjgl_system_JNI_callPPPP__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP__J_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jlong __result = Java_org_lwjgl_system_JNI_callPP__JJ(__env, clazz, __functionAddress, (intptr_t)paramArray0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_JNI_callPP__J_3I(jlong __functionAddress, jint length0, jint* param0) {
	UNUSED_PARAM(length0)
	return Java_org_lwjgl_system_JNI_callPP__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIDDIIDDII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jdouble param5, jdouble param6, jint param7, jint param8, jdoubleArray param9) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	Java_org_lwjgl_system_JNI_callPV__JIDDIIDDIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIDDIIDDII_3D(jlong __functionAddress, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jdouble param5, jdouble param6, jint param7, jint param8, jint length9, jdouble* param9) {
	UNUSED_PARAM(length9)
	Java_org_lwjgl_system_JNI_callPV__JIDDIIDDIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIDDII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jdoubleArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPV__JIDDIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIDDII_3D(jlong __functionAddress, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jint length5, jdouble* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPV__JIDDIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIFFIIFFII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jfloat param5, jfloat param6, jint param7, jint param8, jfloatArray param9) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	Java_org_lwjgl_system_JNI_callPV__JIFFIIFFIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIFFIIFFII_3F(jlong __functionAddress, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jfloat param5, jfloat param6, jint param7, jint param8, jint length9, jfloat* param9) {
	UNUSED_PARAM(length9)
	Java_org_lwjgl_system_JNI_callPV__JIFFIIFFIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIFFII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jfloatArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPV__JIFFIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIFFII_3F(jlong __functionAddress, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jint length5, jfloat* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPV__JIFFIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jdoubleArray param11) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray11 = param11 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param11, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)paramArray11);
	if ( param11 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param11, paramArray11, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint length11, jdouble* param11) {
	UNUSED_PARAM(length11)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jfloatArray param11) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray11 = param11 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param11, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)paramArray11);
	if ( param11 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param11, paramArray11, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint length11, jfloat* param11) {
	UNUSED_PARAM(length11)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jintArray param11) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray11 = param11 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param11, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)paramArray11);
	if ( param11 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param11, paramArray11, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint length11, jint* param11) {
	UNUSED_PARAM(length11)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jshortArray param11) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray11 = param11 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param11, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)paramArray11);
	if ( param11 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param11, paramArray11, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint length11, jshort* param11) {
	UNUSED_PARAM(length11)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (intptr_t)param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jdoubleArray param10) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10);
	if ( param10 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint length10, jdouble* param10) {
	UNUSED_PARAM(length10)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jfloatArray param10) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10);
	if ( param10 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint length10, jfloat* param10) {
	UNUSED_PARAM(length10)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jintArray param10) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10);
	if ( param10 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint length10, jint* param10) {
	UNUSED_PARAM(length10)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jshortArray param10) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)paramArray10);
	if ( param10 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint length10, jshort* param10) {
	UNUSED_PARAM(length10)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (intptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jdoubleArray param9) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint length9, jdouble* param9) {
	UNUSED_PARAM(length9)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jfloatArray param9) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint length9, jfloat* param9) {
	UNUSED_PARAM(length9)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jintArray param9) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint length9, jint* param9) {
	UNUSED_PARAM(length9)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jshortArray param9) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)paramArray9);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint length9, jshort* param9) {
	UNUSED_PARAM(length9)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, param8, (intptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jdoubleArray param8) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
	if ( param8 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint length8, jdouble* param8) {
	UNUSED_PARAM(length8)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jfloatArray param8) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
	if ( param8 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint length8, jfloat* param8) {
	UNUSED_PARAM(length8)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jintArray param8) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
	if ( param8 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint length8, jint* param8) {
	UNUSED_PARAM(length8)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jshortArray param8) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
	if ( param8 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint length8, jshort* param8) {
	UNUSED_PARAM(length8)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jdoubleArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint length7, jdouble* param7) {
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jfloatArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint length7, jfloat* param7) {
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jintArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint length7, jint* param7) {
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jshortArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint length7, jshort* param7) {
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jdoubleArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint length6, jdouble* param6) {
	UNUSED_PARAM(length6)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jfloatArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint length6, jfloat* param6) {
	UNUSED_PARAM(length6)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jintArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint length6, jint* param6) {
	UNUSED_PARAM(length6)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jshortArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint length6, jshort* param6) {
	UNUSED_PARAM(length6)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jdoubleArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint length5, jdouble* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jfloatArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint length5, jfloat* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint length5, jint* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jshortArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint param4, jint length5, jshort* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIIIJII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jfloatArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIIIJIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIIIJII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jint length7, jfloat* param7) {
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_callPPV__JIIIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIIIJII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jshortArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIIIJIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIIIJII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jint length7, jshort* param7) {
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_callPPV__JIIIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jdoubleArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jdouble* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jfloatArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jfloat* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIII_3II_3I_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4, jint param5, jintArray param6, jfloatArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	jfloat *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIIIJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIII_3II_3I_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jint param5, jint length6, jint* param6, jint length7, jfloat* param7) {
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length6)
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_callPPPV__JIIIIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIII_3II_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4, jint param5, jintArray param6, jintArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	jint *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIIIJIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIII_3II_3I_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jint param5, jint length6, jint* param6, jint length7, jint* param7) {
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length6)
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_callPPPV__JIIIIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5, (intptr_t)param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIII_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4, jlong param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIIIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIII_3IJ(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jlong param5) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPV__JIIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3IZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jintArray param4, jboolean param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIJZ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, param5);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3IZ(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jint* param4, jboolean param5) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPV__JIIIIJZ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jlongArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3J(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jlong* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jshortArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint param3, jint length4, jshort* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPV__JIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIIJIFFI_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jfloat param5, jfloat param6, jint param7, jfloatArray param8) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIIJIFFIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
	if ( param8 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIIJIFFI_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jfloat param5, jfloat param6, jint param7, jint length8, jfloat* param8) {
	UNUSED_PARAM(length8)
	Java_org_lwjgl_system_JNI_callPPV__JIIIJIFFIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIIJII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jfloatArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIIJIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIIJII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jint length6, jfloat* param6) {
	UNUSED_PARAM(length6)
	Java_org_lwjgl_system_JNI_callPPV__JIIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPV__JIIIJIJ_3I_3I_3I_3I_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jintArray param6, jintArray param7, jintArray param8, jintArray param9, jlongArray param10) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	jint *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	jint *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
	jint *paramArray9 = param9 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param9, 0);
	jlong *paramArray10 = param10 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param10, 0);
	Java_org_lwjgl_system_JNI_callPPPPPPPV__JIIIJIJJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, (intptr_t)paramArray7, (intptr_t)paramArray8, (intptr_t)paramArray9, (intptr_t)paramArray10);
	if ( param10 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param10, paramArray10, 0);
	if ( param9 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param9, paramArray9, 0);
	if ( param8 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPPPV__JIIIJIJ_3I_3I_3I_3I_3J(jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jint length6, jint* param6, jint length7, jint* param7, jint length8, jint* param8, jint length9, jint* param9, jint length10, jlong* param10) {
	UNUSED_PARAM(length6)
	UNUSED_PARAM(length7)
	UNUSED_PARAM(length8)
	UNUSED_PARAM(length9)
	UNUSED_PARAM(length10)
	Java_org_lwjgl_system_JNI_callPPPPPPPV__JIIIJIJJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, (intptr_t)param7, (intptr_t)param8, (intptr_t)param9, (intptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIIJ_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jlong param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIZI_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jfloatArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIZI_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jint length5, jfloat* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIZI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIZI_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jint length5, jint* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIZI_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jshortArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIZI_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint param4, jint length5, jshort* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPV__JIIIZIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIZ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jdoubleArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIZJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIZ_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint length4, jdouble* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPV__JIIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIZ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jfloatArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIZJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIIZ_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jboolean param3, jint length4, jfloat* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPV__JIIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jdoubleArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3D(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jdouble* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jfloatArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jfloat* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIII_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jlong param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIII_3IJ(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jlong param4) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIII_3IJJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jlong param4, jlong param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIIJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4, param5);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIII_3IJJ(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jlong param4, jlong param5) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPPV__JIIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIII_3IJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jlong param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIIJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIII_3IJ_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jlong param4, jint length5, jint* param5) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPPPV__JIIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3IZ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jboolean param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIJZ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3IZ(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jboolean param4) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPV__JIIIJZ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIII_3I_3I(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jint length4, jint* param4) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JIII_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jintArray param3, jintArray param4, jintArray param5, jlong param6) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPPPPV__JIIIJJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4, (intptr_t)paramArray5, param6);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPV__JIII_3I_3I_3IJ(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jint* param3, jint length4, jint* param4, jint length5, jint* param5, jlong param6) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPPPPV__JIIIJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jlongArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3J(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jlong* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jshortArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIII_3S(jlong __functionAddress, jint param0, jint param1, jint param2, jint length3, jshort* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPV__JIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJIIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint param7, jfloatArray param8) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray8 = param8 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param8, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJIIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)paramArray8);
	if ( param8 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param8, paramArray8, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJIIIII_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint length8, jfloat* param8) {
	UNUSED_PARAM(length8)
	Java_org_lwjgl_system_JNI_callPPV__JIIJIIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, param7, (intptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJIIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jfloatArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJIIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJIIII_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint length7, jfloat* param7) {
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_callPPV__JIIJIIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jfloatArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJIII_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint length6, jfloat* param6) {
	UNUSED_PARAM(length6)
	Java_org_lwjgl_system_JNI_callPPV__JIIJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jfloatArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJII_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint length5, jfloat* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPPV__JIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jshortArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJII_3S(jlong __functionAddress, jint param0, jint param1, jlong param2, jint param3, jint param4, jint length5, jshort* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPPV__JIIJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jfloatArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJII_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jint length6, jfloat* param6) {
	UNUSED_PARAM(length6)
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jintArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJII_3I(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jint length6, jint* param6) {
	UNUSED_PARAM(length6)
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jshortArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJII_3S(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jint length6, jshort* param6) {
	UNUSED_PARAM(length6)
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jdoubleArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJ_3D(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint length4, jdouble* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jfloatArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJ_3F(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint length4, jfloat* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJ_3I(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JIIJJ_3I_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jintArray param4, jintArray param5, jint param6) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPPPPV__JIIJJJJI(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5, param6);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPV__JIIJJ_3I_3II(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint length4, jint* param4, jint length5, jint* param5, jint param6) {
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPPPPV__JIIJJJJI(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJ_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jshortArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIIJJ_3S(jlong __functionAddress, jint param0, jint param1, jlong param2, jlong param3, jint length4, jshort* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJ_3I(jlong __functionAddress, jint param0, jint param1, jlong param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJ_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jintArray param3, jint param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJJI(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIIJ_3II(jlong __functionAddress, jint param0, jint param1, jlong param2, jint length3, jint* param3, jint param4) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPV__JIIJJI(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__JIIJ_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlong param2, jintArray param3, jintArray param4, jintArray param5, jintArray param6) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	Java_org_lwjgl_system_JNI_callPPPPPV__JIIJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4, (intptr_t)paramArray5, (intptr_t)paramArray6);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPV__JIIJ_3I_3I_3I_3I(jlong __functionAddress, jint param0, jint param1, jlong param2, jint length3, jint* param3, jint length4, jint* param4, jint length5, jint* param5, jint length6, jint* param6) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	UNUSED_PARAM(length6)
	Java_org_lwjgl_system_JNI_callPPPPPV__JIIJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIZ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jboolean param2, jdoubleArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIZJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIZ_3D(jlong __functionAddress, jint param0, jint param1, jboolean param2, jint length3, jdouble* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPV__JIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIZ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jboolean param2, jfloatArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIZJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIZ_3F(jlong __functionAddress, jint param0, jint param1, jboolean param2, jint length3, jfloat* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPV__JIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIZ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jboolean param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIZJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIIZ_3I(jlong __functionAddress, jint param0, jint param1, jboolean param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPV__JIIZJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jdoubleArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3D(jlong __functionAddress, jint param0, jint param1, jint length2, jdouble* param2) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jfloatArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3F(jlong __functionAddress, jint param0, jint param1, jint length2, jfloat* param2) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jint param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIJI(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3II(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint param3) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPV__JIIJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3III(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jint param3, jint param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIJII(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3III(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint param3, jint param4) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPV__JIIJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3IIIII(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jint param3, jint param4, jint param5, jint param6) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIJIIII(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4, param5, param6);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3IIIII(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint param3, jint param4, jint param5, jint param6) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPV__JIIJIIII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JII_3II_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jint param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JII_3II_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint param3, jint length4, jint* param4) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPV__JIIJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JII_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jlong param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JII_3IJ(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jlong param3) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JII_3IJII(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jlong param3, jint param4, jint param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJJII(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4, param5);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JII_3IJII(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jlong param3, jint param4, jint param5) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPV__JIIJJII(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JII_3IJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jlong param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JII_3IJ_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jlong param3, jint length4, jint* param4) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JII_3I_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jfloatArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jfloat *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JII_3I_3F(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint length3, jfloat* param3) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIIJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JII_3I_3I(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint length3, jint* param3) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPV__JIIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JII_3I_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jintArray param2, jintArray param3, jlong param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, param4);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JII_3I_3IJ(jlong __functionAddress, jint param0, jint param1, jint length2, jint* param2, jint length3, jint* param3, jlong param4) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jlongArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3J(jlong __functionAddress, jint param0, jint param1, jint length2, jlong* param2) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jshortArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPV__JIIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JII_3S(jlong __functionAddress, jint param0, jint param1, jint length2, jshort* param2) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPV__JIIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jint param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJI_3I(jlong __functionAddress, jint param0, jlong param1, jint param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPV__JIJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJI_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jint param2, jintArray param3, jlong param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIJIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, param4);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJI_3IJ(jlong __functionAddress, jint param0, jlong param1, jint param2, jint length3, jint* param3, jlong param4) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPPV__JIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJI_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jint param2, jintArray param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIJIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJI_3I_3I(jlong __functionAddress, jint param0, jlong param1, jint param2, jint length3, jint* param3, jint length4, jint* param4) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPPV__JIJIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJJ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jlong param2, jdoubleArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJJ_3D(jlong __functionAddress, jint param0, jlong param1, jlong param2, jint length3, jdouble* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJJ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jlong param2, jfloatArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJJ_3F(jlong __functionAddress, jint param0, jlong param1, jlong param2, jint length3, jfloat* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jlong param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJJ_3I(jlong __functionAddress, jint param0, jlong param1, jlong param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJJ_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jlong param2, jshortArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JIJJ_3S(jlong __functionAddress, jint param0, jlong param1, jlong param2, jint length3, jshort* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJ_3DI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jdoubleArray param2, jint param3) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJ_3DI(jlong __functionAddress, jint param0, jlong param1, jint length2, jdouble* param2, jint param3) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJ_3FI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jfloatArray param2, jint param3) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJ_3FI(jlong __functionAddress, jint param0, jlong param1, jint length2, jfloat* param2, jint param3) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJ_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jintArray param2, jint param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJ_3II(jlong __functionAddress, jint param0, jlong param1, jint length2, jint* param2, jint param3) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JIJ_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jintArray param2, jintArray param3, jintArray param4, jint param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPPPV__JIJJJJI(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, (intptr_t)paramArray3, (intptr_t)paramArray4, param5);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPV__JIJ_3I_3I_3II(jlong __functionAddress, jint param0, jlong param1, jint length2, jint* param2, jint length3, jint* param3, jint length4, jint* param4, jint param5) {
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPPPV__JIJJJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, (intptr_t)param3, (intptr_t)param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJ_3SI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlong param1, jshortArray param2, jint param3) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JIJ_3SI(jlong __functionAddress, jint param0, jlong param1, jint length2, jshort* param2, jint param3) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIZII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jboolean param1, jint param2, jint param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPV__JIZIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JIZII_3I(jlong __functionAddress, jint param0, jboolean param1, jint param2, jint param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPV__JIZIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jdoubleArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPV__JIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3D(jlong __functionAddress, jint param0, jint length1, jdouble* param1) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jfloatArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPV__JIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3F(jlong __functionAddress, jint param0, jint length1, jfloat* param1) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPV__JIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3I(jlong __functionAddress, jint param0, jint length1, jint* param1) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPV__JIJI(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3II(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPV__JIJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3III(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jint param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPV__JIJII(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2, param3);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3III(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jint param3) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPV__JIJII(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3IIJI(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jlong param3, jint param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJIJI(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2, param3, param4);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3IIJI(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jlong param3, jint param4) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPPV__JIJIJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JI_3IIJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jlong param3, jint param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIJIJIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JI_3IIJI_3I(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jlong param3, jint param4, jint length5, jint* param5) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPPPV__JIJIJIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3II_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jint param2, jintArray param3, jint param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJIJI(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2, (intptr_t)paramArray3, param4);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3II_3II(jlong __functionAddress, jint param0, jint length1, jint* param1, jint param2, jint length3, jint* param3, jint param4) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPV__JIJIJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3IJII(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jlong param2, jint param3, jint param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJJII(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2, param3, param4);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3IJII(jlong __functionAddress, jint param0, jint length1, jint* param1, jlong param2, jint param3, jint param4) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPPV__JIJJII(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3I_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jfloatArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jfloat *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3I_3F(jlong __functionAddress, jint param0, jint length1, jint* param1, jint length2, jfloat* param2) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPV__JIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3I_3I(jlong __functionAddress, jint param0, jint length1, jint* param1, jint length2, jint* param2) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPV__JIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3I_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jintArray param2, jint param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3I_3II(jlong __functionAddress, jint param0, jint length1, jint* param1, jint length2, jint* param2, jint param3) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JI_3I_3II_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jintArray param2, jint param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JIJJIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JI_3I_3II_3I(jlong __functionAddress, jint param0, jint length1, jint* param1, jint length2, jint* param2, jint param3, jint length4, jint* param4) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPPV__JIJJIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlongArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPV__JIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3J(jlong __functionAddress, jint param0, jint length1, jlong* param1) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3J_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jlongArray param1, jintArray param2, jint param3) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JI_3J_3II(jlong __functionAddress, jint param0, jint length1, jlong* param1, jint length2, jint* param2, jint param3) {
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPV__JIJJI(NULL, NULL, __functionAddress, param0, (intptr_t)param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JI_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jshortArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPV__JIJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__JI_3S(jlong __functionAddress, jint param0, jint length1, jshort* param1) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPV__JIJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJIIIII_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jintArray param6, jlong param7) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JJIIIIIJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)paramArray6, param7);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJIIIII_3IJ(jlong __functionAddress, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint length6, jint* param6, jlong param7) {
	UNUSED_PARAM(length6)
	Java_org_lwjgl_system_JNI_callPPPV__JJIIIIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, param5, (intptr_t)param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJII_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jintArray param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JJIIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJII_3I_3I(jlong __functionAddress, jlong param0, jint param1, jint param2, jint length3, jint* param3, jint length4, jint* param4) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPPV__JJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJII_3J_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jint param2, jlongArray param3, jlongArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	jlong *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JJIIJJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJII_3J_3J(jlong __functionAddress, jlong param0, jint param1, jint param2, jint length3, jlong* param3, jint length4, jlong* param4) {
	UNUSED_PARAM(length3)
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPPPV__JJIIJJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPV__JJIJII_3JI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlongArray param5, jint param6, jintArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jint *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	Java_org_lwjgl_system_JNI_callPJPPV__JJIJIIJIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5, param6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPV__JJIJII_3JI_3I(jlong __functionAddress, jlong param0, jint param1, jlong param2, jint param3, jint param4, jint length5, jlong* param5, jint param6, jint length7, jint* param7) {
	UNUSED_PARAM(length5)
	UNUSED_PARAM(length7)
	Java_org_lwjgl_system_JNI_callPJPPV__JJIJIIJIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5, param6, (intptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJI_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jintArray param2, jlong param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JJIJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJI_3IJ(jlong __functionAddress, jlong param0, jint param1, jint length2, jint* param2, jlong param3) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPPV__JJIJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__JJI_3JIIIJIJIJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jint param1, jlongArray param2, jint param3, jint param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPPPPV__JJIJIIIJIJIJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3, param4, param5, param6, param7, param8, param9, param10);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPPV__JJI_3JIIIJIJIJ(jlong __functionAddress, jlong param0, jint param1, jint length2, jlong* param2, jint param3, jint param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPPPPV__JJIJIIIJIJIJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3, param4, param5, param6, param7, param8, param9, param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJIII_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jdoubleArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJIII_3D(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jdouble* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJIII_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jfloatArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJIII_3F(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jfloat* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJIII_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jintArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJIII_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jint* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJIII_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlongArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJIII_3J(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jlong* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJIII_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jshortArray param5) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(__env, clazz, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)paramArray5);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJIII_3S(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint length5, jshort* param5) {
	UNUSED_PARAM(length5)
	Java_org_lwjgl_system_JNI_callPJPV__JJJIIIJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, param4, (intptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJJI_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jint param2, jintArray param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JJJIJ(__env, clazz, __functionAddress, param0, param1, param2, (intptr_t)paramArray3);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJJI_3I(jlong __functionAddress, jlong param0, jlong param1, jint param2, jint length3, jint* param3) {
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPPV__JJJIJ(NULL, NULL, __functionAddress, param0, param1, param2, (intptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jdoubleArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3D(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jdouble* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jfloatArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3F(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jfloat* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jintArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3I(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jint* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jlongArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jlong* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jshortArray param4) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJJJPV__JJJJJ_3S(jlong __functionAddress, jlong param0, jlong param1, jlong param2, jlong param3, jint length4, jshort* param4) {
	UNUSED_PARAM(length4)
	Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPV__JJJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jintArray param2, jlong param3) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPJPPV__JJJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2, param3);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPPV__JJJ_3IJ(jlong __functionAddress, jlong param0, jlong param1, jint length2, jint* param2, jlong param3) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPJPPV__JJJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJ_3J(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jlong param1, jlongArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPJPV__JJJJ(__env, clazz, __functionAddress, param0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPJPV__JJJ_3J(jlong __functionAddress, jlong param0, jlong param1, jint length2, jlong* param2) {
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPJPV__JJJJ(NULL, NULL, __functionAddress, param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JJ_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jfloatArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPPV__JJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JJ_3F(jlong __functionAddress, jlong param0, jint length1, jfloat* param1) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JJ_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPPV__JJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__JJ_3I(jlong __functionAddress, jlong param0, jint length1, jint* param1) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJ_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong param0, jintArray param1, jlong param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPPPV__JJJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPV__JJ_3IJ(jlong __functionAddress, jlong param0, jint length1, jint* param1, jlong param2) {
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPPPV__JJJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__J_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jdoubleArray param0) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	Java_org_lwjgl_system_JNI_callPV__JJ(__env, clazz, __functionAddress, (intptr_t)paramArray0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__J_3D(jlong __functionAddress, jint length0, jdouble* param0) {
	UNUSED_PARAM(length0)
	Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3D_3D(JNIEnv *__env, jclass clazz, jlong __functionAddress, jdoubleArray param0, jdoubleArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jdouble *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jdouble *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPPV__JJJ(__env, clazz, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__J_3D_3D(jlong __functionAddress, jint length0, jdouble* param0, jint length1, jdouble* param1) {
	UNUSED_PARAM(length0)
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__J_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	Java_org_lwjgl_system_JNI_callPV__JJ(__env, clazz, __functionAddress, (intptr_t)paramArray0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__J_3F(jlong __functionAddress, jint length0, jfloat* param0) {
	UNUSED_PARAM(length0)
	Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3F_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jfloatArray param0, jfloatArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jfloat *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPPV__JJJ(__env, clazz, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__J_3F_3F(jlong __functionAddress, jint length0, jfloat* param0, jint length1, jfloat* param1) {
	UNUSED_PARAM(length0)
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__J_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	Java_org_lwjgl_system_JNI_callPV__JJ(__env, clazz, __functionAddress, (intptr_t)paramArray0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__J_3I(jlong __functionAddress, jint length0, jint* param0) {
	UNUSED_PARAM(length0)
	Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3II_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jint param1, jintArray param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	Java_org_lwjgl_system_JNI_callPPV__JJIJ(__env, clazz, __functionAddress, (intptr_t)paramArray0, param1, (intptr_t)paramArray2);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__J_3II_3I(jlong __functionAddress, jint length0, jint* param0, jint param1, jint length2, jint* param2) {
	UNUSED_PARAM(length0)
	UNUSED_PARAM(length2)
	Java_org_lwjgl_system_JNI_callPPV__JJIJ(NULL, NULL, __functionAddress, (intptr_t)param0, param1, (intptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3I_3I(JNIEnv *__env, jclass clazz, jlong __functionAddress, jintArray param0, jintArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPPV__JJJ(__env, clazz, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__J_3I_3I(jlong __functionAddress, jint length0, jint* param0, jint length1, jint* param1) {
	UNUSED_PARAM(length0)
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__J_3J_3I_3I_3II(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlongArray param0, jintArray param1, jintArray param2, jintArray param3, jint param4) {
	UNUSED_PARAMS(__env, clazz)
	jlong *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jint *paramArray2 = param2 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param2, 0);
	jint *paramArray3 = param3 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param3, 0);
	Java_org_lwjgl_system_JNI_callPPPPV__JJJJJI(__env, clazz, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1, (intptr_t)paramArray2, (intptr_t)paramArray3, param4);
	if ( param3 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param3, paramArray3, 0);
	if ( param2 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param2, paramArray2, 0);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPV__J_3J_3I_3I_3II(jlong __functionAddress, jint length0, jlong* param0, jint length1, jint* param1, jint length2, jint* param2, jint length3, jint* param3, jint param4) {
	UNUSED_PARAM(length0)
	UNUSED_PARAM(length1)
	UNUSED_PARAM(length2)
	UNUSED_PARAM(length3)
	Java_org_lwjgl_system_JNI_callPPPPV__JJJJJI(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1, (intptr_t)param2, (intptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__J_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshortArray param0) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	Java_org_lwjgl_system_JNI_callPV__JJ(__env, clazz, __functionAddress, (intptr_t)paramArray0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPV__J_3S(jlong __functionAddress, jint length0, jshort* param0) {
	UNUSED_PARAM(length0)
	Java_org_lwjgl_system_JNI_callPV__JJ(NULL, NULL, __functionAddress, (intptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3S_3S(JNIEnv *__env, jclass clazz, jlong __functionAddress, jshortArray param0, jshortArray param1) {
	UNUSED_PARAMS(__env, clazz)
	jshort *paramArray0 = param0 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param0, 0);
	jshort *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	Java_org_lwjgl_system_JNI_callPPV__JJJ(__env, clazz, __functionAddress, (intptr_t)paramArray0, (intptr_t)paramArray1);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	if ( param0 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param0, paramArray0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_JNI_callPPV__J_3S_3S(jlong __functionAddress, jint length0, jshort* param0, jint length1, jshort* param1) {
	UNUSED_PARAM(length0)
	UNUSED_PARAM(length1)
	Java_org_lwjgl_system_JNI_callPPV__JJJ(NULL, NULL, __functionAddress, (intptr_t)param0, (intptr_t)param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callPPPPZ__JIIIF_3F_3F_3F_3F(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jint param1, jint param2, jfloat param3, jfloatArray param4, jfloatArray param5, jfloatArray param6, jfloatArray param7) {
	UNUSED_PARAMS(__env, clazz)
	jfloat *paramArray4 = param4 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param4, 0);
	jfloat *paramArray5 = param5 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param5, 0);
	jfloat *paramArray6 = param6 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param6, 0);
	jfloat *paramArray7 = param7 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param7, 0);
	jboolean __result = Java_org_lwjgl_system_JNI_callPPPPZ__JIIIFJJJJ(__env, clazz, __functionAddress, param0, param1, param2, param3, (intptr_t)paramArray4, (intptr_t)paramArray5, (intptr_t)paramArray6, (intptr_t)paramArray7);
	if ( param7 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param7, paramArray7, 0);
	if ( param6 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param6, paramArray6, 0);
	if ( param5 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param5, paramArray5, 0);
	if ( param4 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param4, paramArray4, 0);
	return __result;
}
JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_system_JNI_callPPPPZ__JIIIF_3F_3F_3F_3F(jlong __functionAddress, jint param0, jint param1, jint param2, jfloat param3, jint length4, jfloat* param4, jint length5, jfloat* param5, jint length6, jfloat* param6, jint length7, jfloat* param7) {
	UNUSED_PARAM(length4)
	UNUSED_PARAM(length5)
	UNUSED_PARAM(length6)
	UNUSED_PARAM(length7)
	return Java_org_lwjgl_system_JNI_callPPPPZ__JIIIFJJJJ(NULL, NULL, __functionAddress, param0, param1, param2, param3, (intptr_t)param4, (intptr_t)param5, (intptr_t)param6, (intptr_t)param7);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callPPZ__JI_3IJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint param0, jintArray param1, jlong param2) {
	UNUSED_PARAMS(__env, clazz)
	jint *paramArray1 = param1 == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, param1, 0);
	jboolean __result = Java_org_lwjgl_system_JNI_callPPZ__JIJJ(__env, clazz, __functionAddress, param0, (intptr_t)paramArray1, param2);
	if ( param1 != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, param1, paramArray1, 0);
	return __result;
}
JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_system_JNI_callPPZ__JI_3IJ(jlong __functionAddress, jint param0, jint length1, jint* param1, jlong param2) {
	UNUSED_PARAM(length1)
	return Java_org_lwjgl_system_JNI_callPPZ__JIJJ(NULL, NULL, __functionAddress, param0, (intptr_t)param1, param2);
}

EXTERN_C_EXIT
