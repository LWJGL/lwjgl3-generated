/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "ffi.h"

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1prep_1cif(JNIEnv *__env, jclass clazz, jlong cifAddress, jint abi, jint nargs, jlong rtypeAddress, jlong atypesAddress) {
	ffi_cif *cif = (ffi_cif *)(intptr_t)cifAddress;
	ffi_type *rtype = (ffi_type *)(intptr_t)rtypeAddress;
	ffi_type **atypes = (ffi_type **)(intptr_t)atypesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ffi_prep_cif(cif, abi, nargs, rtype, atypes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1prep_1cif_1var(JNIEnv *__env, jclass clazz, jlong cifAddress, jint abi, jint nfixedargs, jint ntotalargs, jlong rtypeAddress, jlong atypesAddress) {
	ffi_cif *cif = (ffi_cif *)(intptr_t)cifAddress;
	ffi_type *rtype = (ffi_type *)(intptr_t)rtypeAddress;
	ffi_type **atypes = (ffi_type **)(intptr_t)atypesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ffi_prep_cif_var(cif, abi, nfixedargs, ntotalargs, rtype, atypes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1call(JNIEnv *__env, jclass clazz, jlong cifAddress, jlong fnAddress, jlong rvalueAddress, jlong avalueAddress) {
	ffi_cif *cif = (ffi_cif *)(intptr_t)cifAddress;
	FFI_FN_TYPE fn = (FFI_FN_TYPE)(intptr_t)fnAddress;
	void *rvalue = (void *)(intptr_t)rvalueAddress;
	void **avalue = (void **)(intptr_t)avalueAddress;
	UNUSED_PARAMS(__env, clazz)
	ffi_call(cif, fn, rvalue, avalue);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1closure_1alloc(JNIEnv *__env, jclass clazz, jlong size, jlong codeAddress) {
	void **code = (void **)(intptr_t)codeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ffi_closure_alloc((size_t)size, code);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1closure_1free(JNIEnv *__env, jclass clazz, jlong writableAddress) {
	void *writable = (void *)(intptr_t)writableAddress;
	UNUSED_PARAMS(__env, clazz)
	ffi_closure_free(writable);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1prep_1closure_1loc(JNIEnv *__env, jclass clazz, jlong closureAddress, jlong cifAddress, jlong funAddress, jlong user_dataAddress, jlong codelocAddress) {
	ffi_closure *closure = (ffi_closure *)(intptr_t)closureAddress;
	ffi_cif *cif = (ffi_cif *)(intptr_t)cifAddress;
	FFI_CLOSURE_FUN fun = (FFI_CLOSURE_FUN)(intptr_t)funAddress;
	void *user_data = (void *)(intptr_t)user_dataAddress;
	void *codeloc = (void *)(intptr_t)codelocAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)ffi_prep_closure_loc(closure, cif, fun, user_data, codeloc);
}

EXTERN_C_EXIT
