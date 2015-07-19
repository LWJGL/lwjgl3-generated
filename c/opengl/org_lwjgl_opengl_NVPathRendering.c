/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glPathCommandsNVPROC) (GLuint, GLsizei, const GLubyte *, GLsizei, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glPathCoordsNVPROC) (GLuint, GLsizei, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glPathSubCommandsNVPROC) (GLuint, GLsizei, GLsizei, GLsizei, const GLubyte *, GLsizei, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glPathSubCoordsNVPROC) (GLuint, GLsizei, GLsizei, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glPathStringNVPROC) (GLuint, GLenum, GLsizei, const GLvoid *);
typedef GLvoid (APIENTRY *glPathGlyphsNVPROC) (GLuint, GLenum, const GLvoid *, GLbitfield, GLsizei, GLenum, const GLvoid *, GLenum, GLuint, GLfloat);
typedef GLvoid (APIENTRY *glPathGlyphRangeNVPROC) (GLuint, GLenum, const GLvoid *, GLbitfield, GLuint, GLsizei, GLenum, GLuint, GLfloat);
typedef GLenum (APIENTRY *glPathGlyphIndexArrayNVPROC) (GLuint, GLenum, const GLvoid *, GLbitfield, GLuint, GLsizei, GLuint, GLfloat);
typedef GLenum (APIENTRY *glPathMemoryGlyphIndexArrayNVPROC) (GLuint, GLenum, GLsizeiptr, const GLvoid *, GLsizei, GLuint, GLsizei, GLuint, GLfloat);
typedef GLvoid (APIENTRY *glCopyPathNVPROC) (GLuint, GLuint);
typedef GLvoid (APIENTRY *glInterpolatePathsNVPROC) (GLuint, GLuint, GLuint, GLfloat);
typedef GLvoid (APIENTRY *glTransformPathNVPROC) (GLuint, GLuint, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glPathParameterivNVPROC) (GLuint, GLenum, const GLint *);
typedef GLvoid (APIENTRY *glPathParameteriNVPROC) (GLuint, GLenum, GLint);
typedef GLvoid (APIENTRY *glPathParameterfvNVPROC) (GLuint, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glPathParameterfNVPROC) (GLuint, GLenum, GLfloat);
typedef GLvoid (APIENTRY *glPathDashArrayNVPROC) (GLuint, GLsizei, const GLfloat *);
typedef GLuint (APIENTRY *glGenPathsNVPROC) (GLsizei);
typedef GLvoid (APIENTRY *glDeletePathsNVPROC) (GLuint, GLsizei);
typedef GLboolean (APIENTRY *glIsPathNVPROC) (GLuint);
typedef GLvoid (APIENTRY *glPathStencilFuncNVPROC) (GLenum, GLint, GLuint);
typedef GLvoid (APIENTRY *glPathStencilDepthOffsetNVPROC) (GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glStencilFillPathNVPROC) (GLuint, GLenum, GLuint);
typedef GLvoid (APIENTRY *glStencilStrokePathNVPROC) (GLuint, GLint, GLuint);
typedef GLvoid (APIENTRY *glStencilFillPathInstancedNVPROC) (GLsizei, GLenum, const GLvoid *, GLuint, GLenum, GLuint, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glStencilStrokePathInstancedNVPROC) (GLsizei, GLenum, const GLvoid *, GLuint, GLint, GLuint, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glPathCoverDepthFuncNVPROC) (GLenum);
typedef GLvoid (APIENTRY *glPathColorGenNVPROC) (GLenum, GLenum, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glPathTexGenNVPROC) (GLenum, GLenum, GLint, const GLfloat *);
typedef GLvoid (APIENTRY *glPathFogGenNVPROC) (GLenum);
typedef GLvoid (APIENTRY *glCoverFillPathNVPROC) (GLuint, GLenum);
typedef GLvoid (APIENTRY *glCoverStrokePathNVPROC) (GLuint, GLenum);
typedef GLvoid (APIENTRY *glCoverFillPathInstancedNVPROC) (GLsizei, GLenum, const GLvoid *, GLuint, GLenum, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glCoverStrokePathInstancedNVPROC) (GLsizei, GLenum, const GLvoid *, GLuint, GLenum, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glStencilThenCoverFillPathNVPROC) (GLuint, GLenum, GLuint, GLenum);
typedef GLvoid (APIENTRY *glStencilThenCoverStrokePathNVPROC) (GLuint, GLint, GLuint, GLenum);
typedef GLvoid (APIENTRY *glStencilThenCoverFillPathInstancedNVPROC) (GLsizei, GLenum, const GLvoid *, GLuint, GLenum, GLuint, GLenum, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glStencilThenCoverStrokePathInstancedNVPROC) (GLsizei, GLenum, const GLvoid *, GLuint, GLint, GLuint, GLenum, GLenum, const GLfloat *);
typedef GLenum (APIENTRY *glPathGlyphIndexRangeNVPROC) (GLenum, const GLvoid *, GLbitfield, GLuint, GLfloat, GLuint);
typedef GLvoid (APIENTRY *glProgramPathFragmentInputGenNVPROC) (GLuint, GLint, GLenum, GLint, const GLfloat *);
typedef GLvoid (APIENTRY *glGetPathParameterivNVPROC) (GLuint, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetPathParameterfvNVPROC) (GLuint, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetPathCommandsNVPROC) (GLuint, GLubyte *);
typedef GLvoid (APIENTRY *glGetPathCoordsNVPROC) (GLuint, GLfloat *);
typedef GLvoid (APIENTRY *glGetPathDashArrayNVPROC) (GLuint, GLfloat *);
typedef GLvoid (APIENTRY *glGetPathMetricsNVPROC) (GLbitfield, GLsizei, GLenum, const GLvoid *, GLuint, GLsizei, GLfloat *);
typedef GLvoid (APIENTRY *glGetPathMetricRangeNVPROC) (GLbitfield, GLuint, GLsizei, GLsizei, GLfloat *);
typedef GLvoid (APIENTRY *glGetPathSpacingNVPROC) (GLenum, GLsizei, GLenum, const GLvoid *, GLuint, GLfloat, GLfloat, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetPathColorGenivNVPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetPathColorGenfvNVPROC) (GLenum, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetPathTexGenivNVPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetPathTexGenfvNVPROC) (GLenum, GLenum, GLfloat *);
typedef GLboolean (APIENTRY *glIsPointInFillPathNVPROC) (GLuint, GLuint, GLfloat, GLfloat);
typedef GLboolean (APIENTRY *glIsPointInStrokePathNVPROC) (GLuint, GLfloat, GLfloat);
typedef GLfloat (APIENTRY *glGetPathLengthNVPROC) (GLuint, GLsizei, GLsizei);
typedef GLboolean (APIENTRY *glPointAlongPathNVPROC) (GLuint, GLsizei, GLsizei, GLfloat, GLfloat *, GLfloat *, GLfloat *, GLfloat *);
typedef GLvoid (APIENTRY *glMatrixLoad3x2fNVPROC) (GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glMatrixLoad3x3fNVPROC) (GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glMatrixLoadTranspose3x3fNVPROC) (GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glMatrixMult3x2fNVPROC) (GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glMatrixMult3x3fNVPROC) (GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glMatrixMultTranspose3x3fNVPROC) (GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glGetProgramResourcefvNVPROC) (GLuint, GLenum, GLuint, GLsizei, const GLenum *, GLsizei, GLsizei *, GLfloat *);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathCommandsNV(JNIEnv *__env, jclass clazz, jint path, jint numCommands, jlong commandsAddress, jint numCoords, jint coordType, jlong coordsAddress, jlong __functionAddress) {
	const GLubyte *commands = (const GLubyte *)(intptr_t)commandsAddress;
	const GLvoid *coords = (const GLvoid *)(intptr_t)coordsAddress;
	glPathCommandsNVPROC glPathCommandsNV = (glPathCommandsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathCommandsNV(path, numCommands, commands, numCoords, coordType, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathCoordsNV(JNIEnv *__env, jclass clazz, jint path, jint numCoords, jint coordType, jlong coordsAddress, jlong __functionAddress) {
	const GLvoid *coords = (const GLvoid *)(intptr_t)coordsAddress;
	glPathCoordsNVPROC glPathCoordsNV = (glPathCoordsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathCoordsNV(path, numCoords, coordType, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathSubCommandsNV(JNIEnv *__env, jclass clazz, jint path, jint commandStart, jint commandsToDelete, jint numCommands, jlong commandsAddress, jint numCoords, jint coordType, jlong coordsAddress, jlong __functionAddress) {
	const GLubyte *commands = (const GLubyte *)(intptr_t)commandsAddress;
	const GLvoid *coords = (const GLvoid *)(intptr_t)coordsAddress;
	glPathSubCommandsNVPROC glPathSubCommandsNV = (glPathSubCommandsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathSubCommandsNV(path, commandStart, commandsToDelete, numCommands, commands, numCoords, coordType, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathSubCoordsNV(JNIEnv *__env, jclass clazz, jint path, jint coordStart, jint numCoords, jint coordType, jlong coordsAddress, jlong __functionAddress) {
	const GLvoid *coords = (const GLvoid *)(intptr_t)coordsAddress;
	glPathSubCoordsNVPROC glPathSubCoordsNV = (glPathSubCoordsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathSubCoordsNV(path, coordStart, numCoords, coordType, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathStringNV(JNIEnv *__env, jclass clazz, jint path, jint format, jint length, jlong pathStringAddress, jlong __functionAddress) {
	const GLvoid *pathString = (const GLvoid *)(intptr_t)pathStringAddress;
	glPathStringNVPROC glPathStringNV = (glPathStringNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathStringNV(path, format, length, pathString);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathGlyphsNV(JNIEnv *__env, jclass clazz, jint firstPathName, jint fontTarget, jlong fontNameAddress, jint fontStyle, jint numGlyphs, jint type, jlong charcodesAddress, jint handleMissingGlyphs, jint pathParameterTemplate, jfloat emScale, jlong __functionAddress) {
	const GLvoid *fontName = (const GLvoid *)(intptr_t)fontNameAddress;
	const GLvoid *charcodes = (const GLvoid *)(intptr_t)charcodesAddress;
	glPathGlyphsNVPROC glPathGlyphsNV = (glPathGlyphsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathGlyphsNV(firstPathName, fontTarget, fontName, fontStyle, numGlyphs, type, charcodes, handleMissingGlyphs, pathParameterTemplate, emScale);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathGlyphRangeNV(JNIEnv *__env, jclass clazz, jint firstPathName, jint fontTarget, jlong fontNameAddress, jint fontStyle, jint firstGlyph, jint numGlyphs, jint handleMissingGlyphs, jint pathParameterTemplate, jfloat emScale, jlong __functionAddress) {
	const GLvoid *fontName = (const GLvoid *)(intptr_t)fontNameAddress;
	glPathGlyphRangeNVPROC glPathGlyphRangeNV = (glPathGlyphRangeNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathGlyphRangeNV(firstPathName, fontTarget, fontName, fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathGlyphIndexArrayNV(JNIEnv *__env, jclass clazz, jint firstPathName, jint fontTarget, jlong fontNameAddress, jint fontStyle, jint firstGlyphIndex, jint numGlyphs, jint pathParameterTemplate, jfloat emScale, jlong __functionAddress) {
	const GLvoid *fontName = (const GLvoid *)(intptr_t)fontNameAddress;
	glPathGlyphIndexArrayNVPROC glPathGlyphIndexArrayNV = (glPathGlyphIndexArrayNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glPathGlyphIndexArrayNV(firstPathName, fontTarget, fontName, fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathMemoryGlyphIndexArrayNV(JNIEnv *__env, jclass clazz, jint firstPathName, jint fontTarget, jlong fontSize, jlong fontDataAddress, jint faceIndex, jint firstGlyphIndex, jint numGlyphs, jint pathParameterTemplate, jfloat emScale, jlong __functionAddress) {
	const GLvoid *fontData = (const GLvoid *)(intptr_t)fontDataAddress;
	glPathMemoryGlyphIndexArrayNVPROC glPathMemoryGlyphIndexArrayNV = (glPathMemoryGlyphIndexArrayNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glPathMemoryGlyphIndexArrayNV(firstPathName, fontTarget, (GLsizeiptr)fontSize, fontData, faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglCopyPathNV(JNIEnv *__env, jclass clazz, jint resultPath, jint srcPath, jlong __functionAddress) {
	glCopyPathNVPROC glCopyPathNV = (glCopyPathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyPathNV(resultPath, srcPath);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglInterpolatePathsNV(JNIEnv *__env, jclass clazz, jint resultPath, jint pathA, jint pathB, jfloat weight, jlong __functionAddress) {
	glInterpolatePathsNVPROC glInterpolatePathsNV = (glInterpolatePathsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glInterpolatePathsNV(resultPath, pathA, pathB, weight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglTransformPathNV(JNIEnv *__env, jclass clazz, jint resultPath, jint srcPath, jint transformType, jlong transformValuesAddress, jlong __functionAddress) {
	const GLfloat *transformValues = (const GLfloat *)(intptr_t)transformValuesAddress;
	glTransformPathNVPROC glTransformPathNV = (glTransformPathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTransformPathNV(resultPath, srcPath, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathParameterivNV(JNIEnv *__env, jclass clazz, jint path, jint pname, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glPathParameterivNVPROC glPathParameterivNV = (glPathParameterivNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathParameterivNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathParameteriNV(JNIEnv *__env, jclass clazz, jint path, jint pname, jint value, jlong __functionAddress) {
	glPathParameteriNVPROC glPathParameteriNV = (glPathParameteriNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathParameteriNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathParameterfvNV(JNIEnv *__env, jclass clazz, jint path, jint pname, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glPathParameterfvNVPROC glPathParameterfvNV = (glPathParameterfvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathParameterfvNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathParameterfNV(JNIEnv *__env, jclass clazz, jint path, jint pname, jfloat value, jlong __functionAddress) {
	glPathParameterfNVPROC glPathParameterfNV = (glPathParameterfNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathParameterfNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathDashArrayNV(JNIEnv *__env, jclass clazz, jint path, jint dashCount, jlong dashArrayAddress, jlong __functionAddress) {
	const GLfloat *dashArray = (const GLfloat *)(intptr_t)dashArrayAddress;
	glPathDashArrayNVPROC glPathDashArrayNV = (glPathDashArrayNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathDashArrayNV(path, dashCount, dashArray);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGenPathsNV(JNIEnv *__env, jclass clazz, jint range, jlong __functionAddress) {
	glGenPathsNVPROC glGenPathsNV = (glGenPathsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGenPathsNV(range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglDeletePathsNV(JNIEnv *__env, jclass clazz, jint path, jint range, jlong __functionAddress) {
	glDeletePathsNVPROC glDeletePathsNV = (glDeletePathsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeletePathsNV(path, range);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglIsPathNV(JNIEnv *__env, jclass clazz, jint path, jlong __functionAddress) {
	glIsPathNVPROC glIsPathNV = (glIsPathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsPathNV(path);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathStencilFuncNV(JNIEnv *__env, jclass clazz, jint func, jint ref, jint mask, jlong __functionAddress) {
	glPathStencilFuncNVPROC glPathStencilFuncNV = (glPathStencilFuncNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathStencilFuncNV(func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathStencilDepthOffsetNV(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units, jlong __functionAddress) {
	glPathStencilDepthOffsetNVPROC glPathStencilDepthOffsetNV = (glPathStencilDepthOffsetNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathStencilDepthOffsetNV(factor, units);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglStencilFillPathNV(JNIEnv *__env, jclass clazz, jint path, jint fillMode, jint mask, jlong __functionAddress) {
	glStencilFillPathNVPROC glStencilFillPathNV = (glStencilFillPathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilFillPathNV(path, fillMode, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglStencilStrokePathNV(JNIEnv *__env, jclass clazz, jint path, jint reference, jint mask, jlong __functionAddress) {
	glStencilStrokePathNVPROC glStencilStrokePathNV = (glStencilStrokePathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilStrokePathNV(path, reference, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglStencilFillPathInstancedNV(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint fillMode, jint mask, jint transformType, jlong transformValuesAddress, jlong __functionAddress) {
	const GLvoid *paths = (const GLvoid *)(intptr_t)pathsAddress;
	const GLfloat *transformValues = (const GLfloat *)(intptr_t)transformValuesAddress;
	glStencilFillPathInstancedNVPROC glStencilFillPathInstancedNV = (glStencilFillPathInstancedNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilFillPathInstancedNV(numPaths, pathNameType, paths, pathBase, fillMode, mask, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglStencilStrokePathInstancedNV(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint reference, jint mask, jint transformType, jlong transformValuesAddress, jlong __functionAddress) {
	const GLvoid *paths = (const GLvoid *)(intptr_t)pathsAddress;
	const GLfloat *transformValues = (const GLfloat *)(intptr_t)transformValuesAddress;
	glStencilStrokePathInstancedNVPROC glStencilStrokePathInstancedNV = (glStencilStrokePathInstancedNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilStrokePathInstancedNV(numPaths, pathNameType, paths, pathBase, reference, mask, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathCoverDepthFuncNV(JNIEnv *__env, jclass clazz, jint zfunc, jlong __functionAddress) {
	glPathCoverDepthFuncNVPROC glPathCoverDepthFuncNV = (glPathCoverDepthFuncNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathCoverDepthFuncNV(zfunc);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathColorGenNV(JNIEnv *__env, jclass clazz, jint color, jint genMode, jint colorFormat, jlong coeffsAddress, jlong __functionAddress) {
	const GLfloat *coeffs = (const GLfloat *)(intptr_t)coeffsAddress;
	glPathColorGenNVPROC glPathColorGenNV = (glPathColorGenNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathColorGenNV(color, genMode, colorFormat, coeffs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathTexGenNV(JNIEnv *__env, jclass clazz, jint texCoordSet, jint genMode, jint components, jlong coeffsAddress, jlong __functionAddress) {
	const GLfloat *coeffs = (const GLfloat *)(intptr_t)coeffsAddress;
	glPathTexGenNVPROC glPathTexGenNV = (glPathTexGenNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathTexGenNV(texCoordSet, genMode, components, coeffs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathFogGenNV(JNIEnv *__env, jclass clazz, jint genMode, jlong __functionAddress) {
	glPathFogGenNVPROC glPathFogGenNV = (glPathFogGenNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPathFogGenNV(genMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglCoverFillPathNV(JNIEnv *__env, jclass clazz, jint path, jint coverMode, jlong __functionAddress) {
	glCoverFillPathNVPROC glCoverFillPathNV = (glCoverFillPathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCoverFillPathNV(path, coverMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglCoverStrokePathNV(JNIEnv *__env, jclass clazz, jint path, jint coverMode, jlong __functionAddress) {
	glCoverStrokePathNVPROC glCoverStrokePathNV = (glCoverStrokePathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCoverStrokePathNV(path, coverMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglCoverFillPathInstancedNV(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint coverMode, jint transformType, jlong transformValuesAddress, jlong __functionAddress) {
	const GLvoid *paths = (const GLvoid *)(intptr_t)pathsAddress;
	const GLfloat *transformValues = (const GLfloat *)(intptr_t)transformValuesAddress;
	glCoverFillPathInstancedNVPROC glCoverFillPathInstancedNV = (glCoverFillPathInstancedNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCoverFillPathInstancedNV(numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglCoverStrokePathInstancedNV(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint coverMode, jint transformType, jlong transformValuesAddress, jlong __functionAddress) {
	const GLvoid *paths = (const GLvoid *)(intptr_t)pathsAddress;
	const GLfloat *transformValues = (const GLfloat *)(intptr_t)transformValuesAddress;
	glCoverStrokePathInstancedNVPROC glCoverStrokePathInstancedNV = (glCoverStrokePathInstancedNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCoverStrokePathInstancedNV(numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglStencilThenCoverFillPathNV(JNIEnv *__env, jclass clazz, jint path, jint fillMode, jint mask, jint coverMode, jlong __functionAddress) {
	glStencilThenCoverFillPathNVPROC glStencilThenCoverFillPathNV = (glStencilThenCoverFillPathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilThenCoverFillPathNV(path, fillMode, mask, coverMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglStencilThenCoverStrokePathNV(JNIEnv *__env, jclass clazz, jint path, jint reference, jint mask, jint coverMode, jlong __functionAddress) {
	glStencilThenCoverStrokePathNVPROC glStencilThenCoverStrokePathNV = (glStencilThenCoverStrokePathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilThenCoverStrokePathNV(path, reference, mask, coverMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglStencilThenCoverFillPathInstancedNV(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint fillMode, jint mask, jint coverMode, jint transformType, jlong transformValuesAddress, jlong __functionAddress) {
	const GLvoid *paths = (const GLvoid *)(intptr_t)pathsAddress;
	const GLfloat *transformValues = (const GLfloat *)(intptr_t)transformValuesAddress;
	glStencilThenCoverFillPathInstancedNVPROC glStencilThenCoverFillPathInstancedNV = (glStencilThenCoverFillPathInstancedNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilThenCoverFillPathInstancedNV(numPaths, pathNameType, paths, pathBase, fillMode, mask, coverMode, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglStencilThenCoverStrokePathInstancedNV(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint reference, jint mask, jint coverMode, jint transformType, jlong transformValuesAddress, jlong __functionAddress) {
	const GLvoid *paths = (const GLvoid *)(intptr_t)pathsAddress;
	const GLfloat *transformValues = (const GLfloat *)(intptr_t)transformValuesAddress;
	glStencilThenCoverStrokePathInstancedNVPROC glStencilThenCoverStrokePathInstancedNV = (glStencilThenCoverStrokePathInstancedNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilThenCoverStrokePathInstancedNV(numPaths, pathNameType, paths, pathBase, reference, mask, coverMode, transformType, transformValues);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPathGlyphIndexRangeNV(JNIEnv *__env, jclass clazz, jint fontTarget, jlong fontNameAddress, jint fontStyle, jint pathParameterTemplate, jfloat emScale, jint baseAndCount, jlong __functionAddress) {
	const GLvoid *fontName = (const GLvoid *)(intptr_t)fontNameAddress;
	glPathGlyphIndexRangeNVPROC glPathGlyphIndexRangeNV = (glPathGlyphIndexRangeNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glPathGlyphIndexRangeNV(fontTarget, fontName, fontStyle, pathParameterTemplate, emScale, baseAndCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglProgramPathFragmentInputGenNV(JNIEnv *__env, jclass clazz, jint program, jint location, jint genMode, jint components, jlong coeffsAddress, jlong __functionAddress) {
	const GLfloat *coeffs = (const GLfloat *)(intptr_t)coeffsAddress;
	glProgramPathFragmentInputGenNVPROC glProgramPathFragmentInputGenNV = (glProgramPathFragmentInputGenNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramPathFragmentInputGenNV(program, location, genMode, components, coeffs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathParameterivNV(JNIEnv *__env, jclass clazz, jint path, jint pname, jlong valueAddress, jlong __functionAddress) {
	GLint *value = (GLint *)(intptr_t)valueAddress;
	glGetPathParameterivNVPROC glGetPathParameterivNV = (glGetPathParameterivNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathParameterivNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathParameterfvNV(JNIEnv *__env, jclass clazz, jint path, jint pname, jlong valueAddress, jlong __functionAddress) {
	GLfloat *value = (GLfloat *)(intptr_t)valueAddress;
	glGetPathParameterfvNVPROC glGetPathParameterfvNV = (glGetPathParameterfvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathParameterfvNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathCommandsNV(JNIEnv *__env, jclass clazz, jint path, jlong commandsAddress, jlong __functionAddress) {
	GLubyte *commands = (GLubyte *)(intptr_t)commandsAddress;
	glGetPathCommandsNVPROC glGetPathCommandsNV = (glGetPathCommandsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathCommandsNV(path, commands);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathCoordsNV(JNIEnv *__env, jclass clazz, jint path, jlong coordsAddress, jlong __functionAddress) {
	GLfloat *coords = (GLfloat *)(intptr_t)coordsAddress;
	glGetPathCoordsNVPROC glGetPathCoordsNV = (glGetPathCoordsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathCoordsNV(path, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathDashArrayNV(JNIEnv *__env, jclass clazz, jint path, jlong dashArrayAddress, jlong __functionAddress) {
	GLfloat *dashArray = (GLfloat *)(intptr_t)dashArrayAddress;
	glGetPathDashArrayNVPROC glGetPathDashArrayNV = (glGetPathDashArrayNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathDashArrayNV(path, dashArray);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathMetricsNV(JNIEnv *__env, jclass clazz, jint metricQueryMask, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint stride, jlong metricsAddress, jlong __functionAddress) {
	const GLvoid *paths = (const GLvoid *)(intptr_t)pathsAddress;
	GLfloat *metrics = (GLfloat *)(intptr_t)metricsAddress;
	glGetPathMetricsNVPROC glGetPathMetricsNV = (glGetPathMetricsNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathMetricsNV(metricQueryMask, numPaths, pathNameType, paths, pathBase, stride, metrics);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathMetricRangeNV(JNIEnv *__env, jclass clazz, jint metricQueryMask, jint firstPathName, jint numPaths, jint stride, jlong metricsAddress, jlong __functionAddress) {
	GLfloat *metrics = (GLfloat *)(intptr_t)metricsAddress;
	glGetPathMetricRangeNVPROC glGetPathMetricRangeNV = (glGetPathMetricRangeNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathMetricRangeNV(metricQueryMask, firstPathName, numPaths, stride, metrics);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathSpacingNV(JNIEnv *__env, jclass clazz, jint pathListMode, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jfloat advanceScale, jfloat kerningScale, jint transformType, jlong returnedSpacingAddress, jlong __functionAddress) {
	const GLvoid *paths = (const GLvoid *)(intptr_t)pathsAddress;
	GLfloat *returnedSpacing = (GLfloat *)(intptr_t)returnedSpacingAddress;
	glGetPathSpacingNVPROC glGetPathSpacingNV = (glGetPathSpacingNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathSpacingNV(pathListMode, numPaths, pathNameType, paths, pathBase, advanceScale, kerningScale, transformType, returnedSpacing);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathColorGenivNV(JNIEnv *__env, jclass clazz, jint color, jint pname, jlong valueAddress, jlong __functionAddress) {
	GLint *value = (GLint *)(intptr_t)valueAddress;
	glGetPathColorGenivNVPROC glGetPathColorGenivNV = (glGetPathColorGenivNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathColorGenivNV(color, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathColorGenfvNV(JNIEnv *__env, jclass clazz, jint color, jint pname, jlong valueAddress, jlong __functionAddress) {
	GLfloat *value = (GLfloat *)(intptr_t)valueAddress;
	glGetPathColorGenfvNVPROC glGetPathColorGenfvNV = (glGetPathColorGenfvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathColorGenfvNV(color, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathTexGenivNV(JNIEnv *__env, jclass clazz, jint texCoordSet, jint pname, jlong valueAddress, jlong __functionAddress) {
	GLint *value = (GLint *)(intptr_t)valueAddress;
	glGetPathTexGenivNVPROC glGetPathTexGenivNV = (glGetPathTexGenivNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathTexGenivNV(texCoordSet, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathTexGenfvNV(JNIEnv *__env, jclass clazz, jint texCoordSet, jint pname, jlong valueAddress, jlong __functionAddress) {
	GLfloat *value = (GLfloat *)(intptr_t)valueAddress;
	glGetPathTexGenfvNVPROC glGetPathTexGenfvNV = (glGetPathTexGenfvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPathTexGenfvNV(texCoordSet, pname, value);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglIsPointInFillPathNV(JNIEnv *__env, jclass clazz, jint path, jint mask, jfloat x, jfloat y, jlong __functionAddress) {
	glIsPointInFillPathNVPROC glIsPointInFillPathNV = (glIsPointInFillPathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsPointInFillPathNV(path, mask, x, y);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglIsPointInStrokePathNV(JNIEnv *__env, jclass clazz, jint path, jfloat x, jfloat y, jlong __functionAddress) {
	glIsPointInStrokePathNVPROC glIsPointInStrokePathNV = (glIsPointInStrokePathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsPointInStrokePathNV(path, x, y);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetPathLengthNV(JNIEnv *__env, jclass clazz, jint path, jint startSegment, jint numSegments, jlong __functionAddress) {
	glGetPathLengthNVPROC glGetPathLengthNV = (glGetPathLengthNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)glGetPathLengthNV(path, startSegment, numSegments);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglPointAlongPathNV(JNIEnv *__env, jclass clazz, jint path, jint startSegment, jint numSegments, jfloat distance, jlong xAddress, jlong yAddress, jlong tangentXAddress, jlong tangentYAddress, jlong __functionAddress) {
	GLfloat *x = (GLfloat *)(intptr_t)xAddress;
	GLfloat *y = (GLfloat *)(intptr_t)yAddress;
	GLfloat *tangentX = (GLfloat *)(intptr_t)tangentXAddress;
	GLfloat *tangentY = (GLfloat *)(intptr_t)tangentYAddress;
	glPointAlongPathNVPROC glPointAlongPathNV = (glPointAlongPathNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glPointAlongPathNV(path, startSegment, numSegments, distance, x, y, tangentX, tangentY);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglMatrixLoad3x2fNV(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMatrixLoad3x2fNVPROC glMatrixLoad3x2fNV = (glMatrixLoad3x2fNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixLoad3x2fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglMatrixLoad3x3fNV(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMatrixLoad3x3fNVPROC glMatrixLoad3x3fNV = (glMatrixLoad3x3fNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixLoad3x3fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglMatrixLoadTranspose3x3fNV(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMatrixLoadTranspose3x3fNVPROC glMatrixLoadTranspose3x3fNV = (glMatrixLoadTranspose3x3fNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixLoadTranspose3x3fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglMatrixMult3x2fNV(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMatrixMult3x2fNVPROC glMatrixMult3x2fNV = (glMatrixMult3x2fNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixMult3x2fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglMatrixMult3x3fNV(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMatrixMult3x3fNVPROC glMatrixMult3x3fNV = (glMatrixMult3x3fNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixMult3x3fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglMatrixMultTranspose3x3fNV(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMatrixMultTranspose3x3fNVPROC glMatrixMultTranspose3x3fNV = (glMatrixMultTranspose3x3fNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixMultTranspose3x3fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPathRendering_nglGetProgramResourcefvNV(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint propCount, jlong propsAddress, jint bufSize, jlong lengthAddress, jlong paramsAddress, jlong __functionAddress) {
	const GLenum *props = (const GLenum *)(intptr_t)propsAddress;
	GLsizei *length = (GLsizei *)(intptr_t)lengthAddress;
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetProgramResourcefvNVPROC glGetProgramResourcefvNV = (glGetProgramResourcefvNVPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetProgramResourcefvNV(program, programInterface, index, propCount, props, bufSize, length, params);
}

EXTERN_C_EXIT
