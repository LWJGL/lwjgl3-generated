/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4711))
#endif
#include "common_tools.h"
#define FB_ASSERTIONS_ENABLED 0
#define YG_ASSERT(X, message)
DISABLE_WARNINGS()
#include "Yoga.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_YGNodeNew(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)YGNodeNew();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeFree(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeFree(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeFreeRecursive(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeFreeRecursive(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeReset(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeReset(node);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_YGNodeGetInstanceCount(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeGetInstanceCount();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeInsertChild(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong childAddress, jint index) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	const YGNodeRef child = (const YGNodeRef)(intptr_t)childAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeInsertChild(node, child, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeRemoveChild(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong childAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	const YGNodeRef child = (const YGNodeRef)(intptr_t)childAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeRemoveChild(node, child);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetChild(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint index) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)YGNodeGetChild(node, index);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetParent(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)YGNodeGetParent(node);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetChildCount(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeGetChildCount(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeCalculateLayout(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat availableWidth, jfloat availableHeight, jint parentDirection) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeCalculateLayout(node, availableWidth, availableHeight, parentDirection);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeMarkDirty(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeMarkDirty(node);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeIsDirty(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)YGNodeIsDirty(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodePrint(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint options) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodePrint(node, options);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_YGValueIsUndefined(JNIEnv *__env, jclass clazz, jfloat value) {
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)YGValueIsUndefined(value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_YGNodeCanUseCachedMeasurement(JNIEnv *__env, jclass clazz, jint widthMode, jfloat width, jint heightMode, jfloat height, jint lastWidthMode, jfloat lastWidth, jint lastHeightMode, jfloat lastHeight, jfloat lastComputedWidth, jfloat lastComputedHeight, jfloat marginRow, jfloat marginColumn) {
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)YGNodeCanUseCachedMeasurement(widthMode, width, heightMode, height, lastWidthMode, lastWidth, lastHeightMode, lastHeight, lastComputedWidth, lastComputedHeight, marginRow, marginColumn);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeCopyStyle(JNIEnv *__env, jclass clazz, jlong dstNodeAddress, jlong srcNodeAddress) {
	const YGNodeRef dstNode = (const YGNodeRef)(intptr_t)dstNodeAddress;
	const YGNodeRef srcNode = (const YGNodeRef)(intptr_t)srcNodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeCopyStyle(dstNode, srcNode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetContext(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong contextAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	void *context = (void *)(intptr_t)contextAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeSetContext(node, context);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetContext(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)YGNodeGetContext(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetMeasureFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong measureFuncAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	YGMeasureFunc measureFunc = (YGMeasureFunc)(intptr_t)measureFuncAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeSetMeasureFunc(node, measureFunc);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetMeasureFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)YGNodeGetMeasureFunc(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetPrintFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong printFuncAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	YGPrintFunc printFunc = (YGPrintFunc)(intptr_t)printFuncAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeSetPrintFunc(node, printFunc);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetPrintFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)YGNodeGetPrintFunc(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetHasNewLayout(JNIEnv *__env, jclass clazz, jlong nodeAddress, jboolean hasNewLayout) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeSetHasNewLayout(node, hasNewLayout);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetHasNewLayout(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)YGNodeGetHasNewLayout(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint direction) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetDirection(node, direction);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeStyleGetDirection(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint flexDirection) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetFlexDirection(node, flexDirection);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeStyleGetFlexDirection(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetJustifyContent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint justifyContent) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetJustifyContent(node, justifyContent);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetJustifyContent(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeStyleGetJustifyContent(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignContent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint alignContent) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetAlignContent(node, alignContent);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignContent(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeStyleGetAlignContent(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignItems(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint alignItems) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetAlignItems(node, alignItems);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignItems(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeStyleGetAlignItems(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignSelf(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint alignSelf) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetAlignSelf(node, alignSelf);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignSelf(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeStyleGetAlignSelf(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPositionType(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint positionType) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetPositionType(node, positionType);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPositionType(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeStyleGetPositionType(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexWrap(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint flexWrap) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetFlexWrap(node, flexWrap);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexWrap(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeStyleGetFlexWrap(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetOverflow(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint overflow) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetOverflow(node, overflow);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetOverflow(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeStyleGetOverflow(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlex(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flex) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetFlex(node, flex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexGrow(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flexGrow) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetFlexGrow(node, flexGrow);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexGrow(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetFlexGrow(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexShrink(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flexShrink) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetFlexShrink(node, flexShrink);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexShrink(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetFlexShrink(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasis(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flexBasis) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetFlexBasis(node, flexBasis);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexBasis(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetFlexBasis(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPosition(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat position) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetPosition(node, edge, position);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPosition(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetPosition(node, edge);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMargin(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat margin) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetMargin(node, edge, margin);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMargin(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetMargin(node, edge);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPadding(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat padding) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetPadding(node, edge, padding);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPadding(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetPadding(node, edge);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetBorder(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat border) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetBorder(node, edge, border);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetBorder(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetBorder(node, edge);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat width) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetWidth(node, width);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetWidth(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat height) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetHeight(node, height);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetHeight(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat minWidth) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetMinWidth(node, minWidth);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMinWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetMinWidth(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat minHeight) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetMinHeight(node, minHeight);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMinHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetMinHeight(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat maxWidth) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetMaxWidth(node, maxWidth);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMaxWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetMaxWidth(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat maxHeight) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetMaxHeight(node, maxHeight);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMaxHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetMaxHeight(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAspectRatio(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat aspectRatio) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGNodeStyleSetAspectRatio(node, aspectRatio);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAspectRatio(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeStyleGetAspectRatio(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetLeft(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeLayoutGetLeft(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetTop(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeLayoutGetTop(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetRight(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeLayoutGetRight(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetBottom(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeLayoutGetBottom(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeLayoutGetWidth(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)YGNodeLayoutGetHeight(node);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
	const YGNodeRef node = (const YGNodeRef)(intptr_t)nodeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)YGNodeLayoutGetDirection(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGSetLogger(JNIEnv *__env, jclass clazz, jlong loggerAddress) {
	YGLogger logger = (YGLogger)(intptr_t)loggerAddress;
	UNUSED_PARAMS(__env, clazz)
	YGSetLogger(logger);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGLog(JNIEnv *__env, jclass clazz, jint level, jlong messageAddress) {
	const char *message = (const char *)(intptr_t)messageAddress;
	UNUSED_PARAMS(__env, clazz)
	YGLog(level, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_YGSetExperimentalFeatureEnabled(JNIEnv *__env, jclass clazz, jint feature, jboolean enabled) {
	UNUSED_PARAMS(__env, clazz)
	YGSetExperimentalFeatureEnabled(feature, enabled);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_YGIsExperimentalFeatureEnabled(JNIEnv *__env, jclass clazz, jint feature) {
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)YGIsExperimentalFeatureEnabled(feature);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGSetMemoryFuncs(JNIEnv *__env, jclass clazz, jlong ygmallocAddress, jlong yccallocAddress, jlong ygreallocAddress, jlong ygfreeAddress) {
	YGMalloc ygmalloc = (YGMalloc)(intptr_t)ygmallocAddress;
	YGCalloc yccalloc = (YGCalloc)(intptr_t)yccallocAddress;
	YGRealloc ygrealloc = (YGRealloc)(intptr_t)ygreallocAddress;
	YGFree ygfree = (YGFree)(intptr_t)ygfreeAddress;
	UNUSED_PARAMS(__env, clazz)
	YGSetMemoryFuncs(ygmalloc, yccalloc, ygrealloc, ygfree);
}

EXTERN_C_EXIT
