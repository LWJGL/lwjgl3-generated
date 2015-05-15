/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <objc/objc-runtime.h>
typedef void (*EnumerationMutationHandler)(id);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobject_1copy(JNIEnv *__env, jclass clazz, jlong objAddress, jlong size) {
	id obj = (id)(intptr_t)objAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)object_copy(obj, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobject_1dispose(JNIEnv *__env, jclass clazz, jlong objAddress) {
	id obj = (id)(intptr_t)objAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)object_dispose(obj);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_object_1getClass(JNIEnv *__env, jclass clazz, jlong objAddress) {
	id obj = (id)(intptr_t)objAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)object_getClass(obj);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobject_1setClass(JNIEnv *__env, jclass clazz, jlong objAddress, jlong clsAddress) {
	id obj = (id)(intptr_t)objAddress;
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)object_setClass(obj, cls);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobject_1getClassName(JNIEnv *__env, jclass clazz, jlong objAddress) {
	id obj = (id)(intptr_t)objAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)object_getClassName(obj);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobject_1getIndexedIvars(JNIEnv *__env, jclass clazz, jlong objAddress) {
	id obj = (id)(intptr_t)objAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)object_getIndexedIvars(obj);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobject_1getIvar(JNIEnv *__env, jclass clazz, jlong objAddress, jlong ivarAddress) {
	id obj = (id)(intptr_t)objAddress;
	Ivar ivar = (Ivar)(intptr_t)ivarAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)object_getIvar(obj, ivar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobject_1setIvar(JNIEnv *__env, jclass clazz, jlong objAddress, jlong ivarAddress, jlong valueAddress) {
	id obj = (id)(intptr_t)objAddress;
	Ivar ivar = (Ivar)(intptr_t)ivarAddress;
	id value = (id)(intptr_t)valueAddress;
	UNUSED_PARAMS(__env, clazz)
	object_setIvar(obj, ivar, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobject_1setInstanceVariable(JNIEnv *__env, jclass clazz, jlong objAddress, jlong nameAddress, jlong valueAddress) {
	id obj = (id)(intptr_t)objAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	void *value = (void *)(intptr_t)valueAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)object_setInstanceVariable(obj, name, value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobject_1getInstanceVariable(JNIEnv *__env, jclass clazz, jlong objAddress, jlong nameAddress, jlong outValueAddress) {
	id obj = (id)(intptr_t)objAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	void **outValue = (void **)(intptr_t)outValueAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)object_getInstanceVariable(obj, name, outValue);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1getClass(JNIEnv *__env, jclass clazz, jlong nameAddress) {
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_getClass(name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1getMetaClass(JNIEnv *__env, jclass clazz, jlong nameAddress) {
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_getMetaClass(name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1lookUpClass(JNIEnv *__env, jclass clazz, jlong nameAddress) {
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_lookUpClass(name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1getRequiredClass(JNIEnv *__env, jclass clazz, jlong nameAddress) {
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_getRequiredClass(name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1getClassList(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint bufferCount) {
	Class *buffer = (Class *)(intptr_t)bufferAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)objc_getClassList(buffer, bufferCount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1copyClassList(JNIEnv *__env, jclass clazz, jlong outCountAddress) {
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_copyClassList(outCount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1getName(JNIEnv *__env, jclass clazz, jlong clsAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_getName(cls);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_class_1isMetaClass(JNIEnv *__env, jclass clazz, jlong clsAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jbyte)class_isMetaClass(cls);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_class_1getSuperclass(JNIEnv *__env, jclass clazz, jlong clsAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_getSuperclass(cls);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1getVersion(JNIEnv *__env, jclass clazz, jlong clsAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)class_getVersion(cls);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1setVersion(JNIEnv *__env, jclass clazz, jlong clsAddress, jint version) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	class_setVersion(cls, version);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_class_1getInstanceSize(JNIEnv *__env, jclass clazz, jlong clsAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)class_getInstanceSize(cls);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1getInstanceVariable(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_getInstanceVariable(cls, name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1getClassVariable(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_getClassVariable(cls, name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1copyIvarList(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong outCountAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_copyIvarList(cls, outCount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1getInstanceMethod(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	SEL name = (SEL)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_getInstanceMethod(cls, name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1getClassMethod(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	SEL name = (SEL)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_getClassMethod(cls, name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1getMethodImplementation(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	SEL name = (SEL)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_getMethodImplementation(cls, name);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1respondsToSelector(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	SEL name = (SEL)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jbyte)class_respondsToSelector(cls, name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1copyMethodList(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong outCountAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_copyMethodList(cls, outCount);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1conformsToProtocol(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong protocolAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	Protocol *protocol = (Protocol *)(intptr_t)protocolAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jbyte)class_conformsToProtocol(cls, protocol);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1copyProtocolList(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong outCountAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_copyProtocolList(cls, outCount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1getProperty(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_getProperty(cls, name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1copyPropertyList(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong outCountAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_copyPropertyList(cls, outCount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1getIvarLayout(JNIEnv *__env, jclass clazz, jlong clsAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_getIvarLayout(cls);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1getWeakIvarLayout(JNIEnv *__env, jclass clazz, jlong clsAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_getWeakIvarLayout(cls);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1addMethod(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress, jlong impAddress, jlong typesAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	SEL name = (SEL)(intptr_t)nameAddress;
	IMP imp = (IMP)(intptr_t)impAddress;
	const char *types = (const char *)(intptr_t)typesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jbyte)class_addMethod(cls, name, imp, types);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1replaceMethod(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress, jlong impAddress, jlong typesAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	SEL name = (SEL)(intptr_t)nameAddress;
	IMP imp = (IMP)(intptr_t)impAddress;
	const char *types = (const char *)(intptr_t)typesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_replaceMethod(cls, name, imp, types);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1addIvar(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress, jlong size, jbyte alignment, jlong typesAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	const char *types = (const char *)(intptr_t)typesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jbyte)class_addIvar(cls, name, (size_t)size, alignment, types);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1addProtocol(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong protocolAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	Protocol *protocol = (Protocol *)(intptr_t)protocolAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jbyte)class_addProtocol(cls, protocol);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1addProperty(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress, jlong attributesAddress, jint attributeCount) {
	Class cls = (Class)(intptr_t)clsAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	const objc_property_attribute_t *attributes = (const objc_property_attribute_t *)(intptr_t)attributesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jbyte)class_addProperty(cls, name, attributes, attributeCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1replaceProperty(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong nameAddress, jlong attributesAddress, jint attributeCount) {
	Class cls = (Class)(intptr_t)clsAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	const objc_property_attribute_t *attributes = (const objc_property_attribute_t *)(intptr_t)attributesAddress;
	UNUSED_PARAMS(__env, clazz)
	class_replaceProperty(cls, name, attributes, attributeCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1setIvarLayout(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong layoutAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	const uint8_t *layout = (const uint8_t *)(intptr_t)layoutAddress;
	UNUSED_PARAMS(__env, clazz)
	class_setIvarLayout(cls, layout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1setWeakIvarLayout(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong layoutAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	const uint8_t *layout = (const uint8_t *)(intptr_t)layoutAddress;
	UNUSED_PARAMS(__env, clazz)
	class_setWeakIvarLayout(cls, layout);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1createInstance(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong extraBytes) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_createInstance(cls, (size_t)extraBytes);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1constructInstance(JNIEnv *__env, jclass clazz, jlong clsAddress, jlong bytesAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	void *bytes = (void *)(intptr_t)bytesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_constructInstance(cls, bytes);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1destructInstance(JNIEnv *__env, jclass clazz, jlong objAddress) {
	id obj = (id)(intptr_t)objAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_destructInstance(obj);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1allocateClassPair(JNIEnv *__env, jclass clazz, jlong superclassAddress, jlong nameAddress, jlong extraBytes) {
	Class superclass = (Class)(intptr_t)superclassAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_allocateClassPair(superclass, name, (size_t)extraBytes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1registerClassPair(JNIEnv *__env, jclass clazz, jlong clsAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	objc_registerClassPair(cls);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1disposeClassPair(JNIEnv *__env, jclass clazz, jlong clsAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	objc_disposeClassPair(cls);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nmethod_1getName(JNIEnv *__env, jclass clazz, jlong mAddress) {
	Method m = (Method)(intptr_t)mAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)method_getName(m);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nmethod_1getImplementation(JNIEnv *__env, jclass clazz, jlong mAddress) {
	Method m = (Method)(intptr_t)mAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)method_getImplementation(m);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nmethod_1getTypeEncoding(JNIEnv *__env, jclass clazz, jlong mAddress) {
	Method m = (Method)(intptr_t)mAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)method_getTypeEncoding(m);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nmethod_1getNumberOfArguments(JNIEnv *__env, jclass clazz, jlong mAddress) {
	Method m = (Method)(intptr_t)mAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)method_getNumberOfArguments(m);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nmethod_1copyReturnType(JNIEnv *__env, jclass clazz, jlong mAddress) {
	Method m = (Method)(intptr_t)mAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)method_copyReturnType(m);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nmethod_1copyArgumentType(JNIEnv *__env, jclass clazz, jlong mAddress, jint index) {
	Method m = (Method)(intptr_t)mAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)method_copyArgumentType(m, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nmethod_1getReturnType(JNIEnv *__env, jclass clazz, jlong mAddress, jlong dstAddress, jlong dst_len) {
	Method m = (Method)(intptr_t)mAddress;
	char *dst = (char *)(intptr_t)dstAddress;
	UNUSED_PARAMS(__env, clazz)
	method_getReturnType(m, dst, (size_t)dst_len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nmethod_1getArgumentType(JNIEnv *__env, jclass clazz, jlong mAddress, jint index, jlong dstAddress, jlong dst_len) {
	Method m = (Method)(intptr_t)mAddress;
	char *dst = (char *)(intptr_t)dstAddress;
	UNUSED_PARAMS(__env, clazz)
	method_getArgumentType(m, index, dst, (size_t)dst_len);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nmethod_1setImplementation(JNIEnv *__env, jclass clazz, jlong mAddress, jlong impAddress) {
	Method m = (Method)(intptr_t)mAddress;
	IMP imp = (IMP)(intptr_t)impAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)method_setImplementation(m, imp);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nmethod_1exchangeImplementations(JNIEnv *__env, jclass clazz, jlong m1Address, jlong m2Address) {
	Method m1 = (Method)(intptr_t)m1Address;
	Method m2 = (Method)(intptr_t)m2Address;
	UNUSED_PARAMS(__env, clazz)
	method_exchangeImplementations(m1, m2);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nivar_1getName(JNIEnv *__env, jclass clazz, jlong vAddress) {
	Ivar v = (Ivar)(intptr_t)vAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ivar_getName(v);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nivar_1getTypeEncoding(JNIEnv *__env, jclass clazz, jlong vAddress) {
	Ivar v = (Ivar)(intptr_t)vAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)ivar_getTypeEncoding(v);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nivar_1getOffset(JNIEnv *__env, jclass clazz, jlong vAddress) {
	Ivar v = (Ivar)(intptr_t)vAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)ivar_getOffset(v);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nproperty_1getName(JNIEnv *__env, jclass clazz, jlong propertyAddress) {
	objc_property_t property = (objc_property_t)(intptr_t)propertyAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)property_getName(property);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nproperty_1getAttributes(JNIEnv *__env, jclass clazz, jlong propertyAddress) {
	objc_property_t property = (objc_property_t)(intptr_t)propertyAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)property_getAttributes(property);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nproperty_1copyAttributeList(JNIEnv *__env, jclass clazz, jlong propertyAddress, jlong outCountAddress) {
	objc_property_t property = (objc_property_t)(intptr_t)propertyAddress;
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)property_copyAttributeList(property, outCount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nproperty_1copyAttributeValue(JNIEnv *__env, jclass clazz, jlong propertyAddress, jlong attributeNameAddress) {
	objc_property_t property = (objc_property_t)(intptr_t)propertyAddress;
	const char *attributeName = (const char *)(intptr_t)attributeNameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)property_copyAttributeValue(property, attributeName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1getProtocol(JNIEnv *__env, jclass clazz, jlong nameAddress) {
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_getProtocol(name);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1copyProtocolList(JNIEnv *__env, jclass clazz, jlong outCountAddress) {
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_copyProtocolList(outCount);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1conformsToProtocol(JNIEnv *__env, jclass clazz, jlong protoAddress, jlong otherAddress) {
	Protocol *proto = (Protocol *)(intptr_t)protoAddress;
	Protocol *other = (Protocol *)(intptr_t)otherAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jbyte)protocol_conformsToProtocol(proto, other);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1isEqual(JNIEnv *__env, jclass clazz, jlong protoAddress, jlong otherAddress) {
	Protocol *proto = (Protocol *)(intptr_t)protoAddress;
	Protocol *other = (Protocol *)(intptr_t)otherAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jbyte)protocol_isEqual(proto, other);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1getName(JNIEnv *__env, jclass clazz, jlong pAddress) {
	Protocol *p = (Protocol *)(intptr_t)pAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)protocol_getName(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1getMethodDescription(JNIEnv *__env, jclass clazz, jlong pAddress, jlong aSelAddress, jbyte isRequiredMethod, jbyte isInstanceMethod, jlong __result) {
	Protocol *p = (Protocol *)(intptr_t)pAddress;
	SEL aSel = (SEL)(intptr_t)aSelAddress;
	UNUSED_PARAMS(__env, clazz)
	*((struct objc_method_description*)(intptr_t)__result) = protocol_getMethodDescription(p, aSel, isRequiredMethod, isInstanceMethod);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1copyMethodDescriptionList(JNIEnv *__env, jclass clazz, jlong pAddress, jbyte isRequiredMethod, jbyte isInstanceMethod, jlong outCountAddress) {
	Protocol *p = (Protocol *)(intptr_t)pAddress;
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)protocol_copyMethodDescriptionList(p, isRequiredMethod, isInstanceMethod, outCount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1getProperty(JNIEnv *__env, jclass clazz, jlong protoAddress, jlong nameAddress, jbyte isRequiredProperty, jbyte isInstanceProperty) {
	Protocol *proto = (Protocol *)(intptr_t)protoAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)protocol_getProperty(proto, name, isRequiredProperty, isInstanceProperty);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1copyPropertyList(JNIEnv *__env, jclass clazz, jlong protoAddress, jlong outCountAddress) {
	Protocol *proto = (Protocol *)(intptr_t)protoAddress;
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)protocol_copyPropertyList(proto, outCount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1copyProtocolList(JNIEnv *__env, jclass clazz, jlong protoAddress, jlong outCountAddress) {
	Protocol *proto = (Protocol *)(intptr_t)protoAddress;
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)protocol_copyProtocolList(proto, outCount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1allocateProtocol(JNIEnv *__env, jclass clazz, jlong nameAddress) {
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_allocateProtocol(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1registerProtocol(JNIEnv *__env, jclass clazz, jlong protoAddress) {
	Protocol *proto = (Protocol *)(intptr_t)protoAddress;
	UNUSED_PARAMS(__env, clazz)
	objc_registerProtocol(proto);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1addMethodDescription(JNIEnv *__env, jclass clazz, jlong protoAddress, jlong nameAddress, jlong typesAddress, jbyte isRequiredMethod, jbyte isInstanceMethod) {
	Protocol *proto = (Protocol *)(intptr_t)protoAddress;
	SEL name = (SEL)(intptr_t)nameAddress;
	const char *types = (const char *)(intptr_t)typesAddress;
	UNUSED_PARAMS(__env, clazz)
	protocol_addMethodDescription(proto, name, types, isRequiredMethod, isInstanceMethod);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1addProtocol(JNIEnv *__env, jclass clazz, jlong protoAddress, jlong additionAddress) {
	Protocol *proto = (Protocol *)(intptr_t)protoAddress;
	Protocol *addition = (Protocol *)(intptr_t)additionAddress;
	UNUSED_PARAMS(__env, clazz)
	protocol_addProtocol(proto, addition);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1addProperty(JNIEnv *__env, jclass clazz, jlong protoAddress, jlong nameAddress, jlong attributesAddress, jint attributeCount, jbyte isRequiredProperty, jbyte isInstanceProperty) {
	Protocol *proto = (Protocol *)(intptr_t)protoAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	const objc_property_attribute_t *attributes = (const objc_property_attribute_t *)(intptr_t)attributesAddress;
	UNUSED_PARAMS(__env, clazz)
	protocol_addProperty(proto, name, attributes, attributeCount, isRequiredProperty, isInstanceProperty);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1copyImageNames(JNIEnv *__env, jclass clazz, jlong outCountAddress) {
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_copyImageNames(outCount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nclass_1getImageName(JNIEnv *__env, jclass clazz, jlong clsAddress) {
	Class cls = (Class)(intptr_t)clsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)class_getImageName(cls);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1copyClassNamesForImage(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong outCountAddress) {
	const char *image = (const char *)(intptr_t)imageAddress;
	unsigned int *outCount = (unsigned int *)(intptr_t)outCountAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_copyClassNamesForImage(image, outCount);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nsel_1getName(JNIEnv *__env, jclass clazz, jlong selAddress) {
	SEL sel = (SEL)(intptr_t)selAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)sel_getName(sel);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nsel_1getUid(JNIEnv *__env, jclass clazz, jlong strAddress) {
	const char *str = (const char *)(intptr_t)strAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)sel_getUid(str);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nsel_1registerName(JNIEnv *__env, jclass clazz, jlong strAddress) {
	const char *str = (const char *)(intptr_t)strAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)sel_registerName(str);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nsel_1isEqual(JNIEnv *__env, jclass clazz, jlong lhsAddress, jlong rhsAddress) {
	SEL lhs = (SEL)(intptr_t)lhsAddress;
	SEL rhs = (SEL)(intptr_t)rhsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jbyte)sel_isEqual(lhs, rhs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1enumerationMutation(JNIEnv *__env, jclass clazz, jlong objAddress) {
	id obj = (id)(intptr_t)objAddress;
	UNUSED_PARAMS(__env, clazz)
	objc_enumerationMutation(obj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1setEnumerationMutationHandler(JNIEnv *__env, jclass clazz, jlong handlerAddress) {
	EnumerationMutationHandler handler = (EnumerationMutationHandler)(intptr_t)handlerAddress;
	UNUSED_PARAMS(__env, clazz)
	objc_setEnumerationMutationHandler(handler);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nimp_1implementationWithBlock(JNIEnv *__env, jclass clazz, jlong blockAddress) {
	id block = (id)(intptr_t)blockAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)imp_implementationWithBlock(block);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nimp_1getBlock(JNIEnv *__env, jclass clazz, jlong anImpAddress) {
	IMP anImp = (IMP)(intptr_t)anImpAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)imp_getBlock(anImp);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nimp_1removeBlock(JNIEnv *__env, jclass clazz, jlong anImpAddress) {
	IMP anImp = (IMP)(intptr_t)anImpAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jbyte)imp_removeBlock(anImp);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1loadWeak(JNIEnv *__env, jclass clazz, jlong locationAddress) {
	id *location = (id *)(intptr_t)locationAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_loadWeak(location);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1storeWeak(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong objAddress) {
	id *location = (id *)(intptr_t)locationAddress;
	id obj = (id)(intptr_t)objAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_storeWeak(location, obj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1setAssociatedObject(JNIEnv *__env, jclass clazz, jlong objectAddress, jlong keyAddress, jlong valueAddress, jlong policy) {
	id object = (id)(intptr_t)objectAddress;
	const void *key = (const void *)(intptr_t)keyAddress;
	id value = (id)(intptr_t)valueAddress;
	UNUSED_PARAMS(__env, clazz)
	objc_setAssociatedObject(object, key, value, (objc_AssociationPolicy)policy);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1getAssociatedObject(JNIEnv *__env, jclass clazz, jlong objectAddress, jlong keyAddress) {
	id object = (id)(intptr_t)objectAddress;
	const void *key = (const void *)(intptr_t)keyAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)objc_getAssociatedObject(object, key);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nobjc_1removeAssociatedObjects(JNIEnv *__env, jclass clazz, jlong objectAddress) {
	id object = (id)(intptr_t)objectAddress;
	UNUSED_PARAMS(__env, clazz)
	objc_removeAssociatedObjects(object);
}

EXTERN_C_EXIT
