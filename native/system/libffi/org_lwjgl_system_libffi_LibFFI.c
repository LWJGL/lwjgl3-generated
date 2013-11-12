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

EXTERN_C_EXIT
