/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "tinyfiledialogs.h"
#ifndef LWJGL_WINDOWS
    static int tinyfd_winUtf8;
#endif

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1version(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)tinyfd_version;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1winUtf8(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&tinyfd_winUtf8;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1forceConsole(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&tinyfd_forceConsole;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1response(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)tinyfd_response;
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_tinyfd_1beep(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    tinyfd_beep();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1notifyPopup(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aMessageAddress, jlong aIconTypeAddress) {
    const char *aTitle = (const char *)(intptr_t)aTitleAddress;
    const char *aMessage = (const char *)(intptr_t)aMessageAddress;
    const char *aIconType = (const char *)(intptr_t)aIconTypeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)tinyfd_notifyPopup(aTitle, aMessage, aIconType);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1messageBox(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aMessageAddress, jlong aDialogTypeAddress, jlong aIconTypeAddress, jint aDefaultButton) {
    const char *aTitle = (const char *)(intptr_t)aTitleAddress;
    const char *aMessage = (const char *)(intptr_t)aMessageAddress;
    const char *aDialogType = (const char *)(intptr_t)aDialogTypeAddress;
    const char *aIconType = (const char *)(intptr_t)aIconTypeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)tinyfd_messageBox(aTitle, aMessage, aDialogType, aIconType, aDefaultButton);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1inputBox(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aMessageAddress, jlong aDefaultInputAddress) {
    const char *aTitle = (const char *)(intptr_t)aTitleAddress;
    const char *aMessage = (const char *)(intptr_t)aMessageAddress;
    const char *aDefaultInput = (const char *)(intptr_t)aDefaultInputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)tinyfd_inputBox(aTitle, aMessage, aDefaultInput);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1saveFileDialog(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultPathAndFileAddress, jint aNumOfFilterPatterns, jlong aFilterPatternsAddress, jlong aSingleFilterDescriptionAddress) {
    const char *aTitle = (const char *)(intptr_t)aTitleAddress;
    const char *aDefaultPathAndFile = (const char *)(intptr_t)aDefaultPathAndFileAddress;
    const char * const *aFilterPatterns = (const char * const *)(intptr_t)aFilterPatternsAddress;
    const char *aSingleFilterDescription = (const char *)(intptr_t)aSingleFilterDescriptionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)tinyfd_saveFileDialog(aTitle, aDefaultPathAndFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1openFileDialog(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultPathAndFileAddress, jint aNumOfFilterPatterns, jlong aFilterPatternsAddress, jlong aSingleFilterDescriptionAddress, jint aAllowMultipleSelects) {
    const char *aTitle = (const char *)(intptr_t)aTitleAddress;
    const char *aDefaultPathAndFile = (const char *)(intptr_t)aDefaultPathAndFileAddress;
    const char * const *aFilterPatterns = (const char * const *)(intptr_t)aFilterPatternsAddress;
    const char *aSingleFilterDescription = (const char *)(intptr_t)aSingleFilterDescriptionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)tinyfd_openFileDialog(aTitle, aDefaultPathAndFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription, aAllowMultipleSelects);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1selectFolderDialog(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultPathAddress) {
    const char *aTitle = (const char *)(intptr_t)aTitleAddress;
    const char *aDefaultPath = (const char *)(intptr_t)aDefaultPathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)tinyfd_selectFolderDialog(aTitle, aDefaultPath);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1colorChooser(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultHexRGBAddress, jlong aDefaultRGBAddress, jlong aoResultRGBAddress) {
    const char *aTitle = (const char *)(intptr_t)aTitleAddress;
    const char *aDefaultHexRGB = (const char *)(intptr_t)aDefaultHexRGBAddress;
    unsigned char *aDefaultRGB = (unsigned char *)(intptr_t)aDefaultRGBAddress;
    unsigned char *aoResultRGB = (unsigned char *)(intptr_t)aoResultRGBAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)tinyfd_colorChooser(aTitle, aDefaultHexRGB, aDefaultRGB, aoResultRGB);
}

EXTERN_C_EXIT
