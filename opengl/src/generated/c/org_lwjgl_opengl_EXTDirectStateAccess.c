/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glClientAttribDefaultEXTPROC) (jint);
typedef void (APIENTRY *glPushClientAttribDefaultEXTPROC) (jint);
typedef void (APIENTRY *glMatrixLoadfEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glMatrixLoaddEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glMatrixMultfEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glMatrixMultdEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glMatrixLoadIdentityEXTPROC) (jint);
typedef void (APIENTRY *glMatrixRotatefEXTPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glMatrixRotatedEXTPROC) (jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMatrixScalefEXTPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glMatrixScaledEXTPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMatrixTranslatefEXTPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glMatrixTranslatedEXTPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMatrixOrthoEXTPROC) (jint, jdouble, jdouble, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMatrixFrustumEXTPROC) (jint, jdouble, jdouble, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMatrixPushEXTPROC) (jint);
typedef void (APIENTRY *glMatrixPopEXTPROC) (jint);
typedef void (APIENTRY *glTextureParameteriEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTextureParameterivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTextureParameterfEXTPROC) (jint, jint, jint, jfloat);
typedef void (APIENTRY *glTextureParameterfvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTextureImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTextureImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTextureSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTextureSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCopyTextureImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTextureImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTextureSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTextureSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGetTextureImageEXTPROC) (jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTextureParameterfvEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTextureParameterivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTextureLevelParameterfvEXTPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTextureLevelParameterivEXTPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glTextureImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTextureSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCopyTextureSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glBindMultiTextureEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glMultiTexCoordPointerEXTPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexEnvfEXTPROC) (jint, jint, jint, jfloat);
typedef void (APIENTRY *glMultiTexEnvfvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexEnviEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glMultiTexEnvivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexGendEXTPROC) (jint, jint, jint, jdouble);
typedef void (APIENTRY *glMultiTexGendvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexGenfEXTPROC) (jint, jint, jint, jfloat);
typedef void (APIENTRY *glMultiTexGenfvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexGeniEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glMultiTexGenivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetMultiTexEnvfvEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetMultiTexEnvivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetMultiTexGendvEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetMultiTexGenfvEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetMultiTexGenivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glMultiTexParameteriEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glMultiTexParameterivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexParameterfEXTPROC) (jint, jint, jint, jfloat);
typedef void (APIENTRY *glMultiTexParameterfvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCopyMultiTexImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyMultiTexImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyMultiTexSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyMultiTexSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGetMultiTexImageEXTPROC) (jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetMultiTexParameterfvEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetMultiTexParameterivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetMultiTexLevelParameterfvEXTPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetMultiTexLevelParameterivEXTPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glMultiTexImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCopyMultiTexSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glEnableClientStateIndexedEXTPROC) (jint, jint);
typedef void (APIENTRY *glDisableClientStateIndexedEXTPROC) (jint, jint);
typedef void (APIENTRY *glEnableClientStateiEXTPROC) (jint, jint);
typedef void (APIENTRY *glDisableClientStateiEXTPROC) (jint, jint);
typedef void (APIENTRY *glGetFloatIndexedvEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetDoubleIndexedvEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetPointerIndexedvEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetFloati_vEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetDoublei_vEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetPointeri_vEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glEnableIndexedEXTPROC) (jint, jint);
typedef void (APIENTRY *glDisableIndexedEXTPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsEnabledIndexedEXTPROC) (jint, jint);
typedef void (APIENTRY *glGetIntegerIndexedvEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetBooleanIndexedvEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glNamedProgramStringEXTPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glNamedProgramLocalParameter4dEXTPROC) (jint, jint, jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glNamedProgramLocalParameter4dvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glNamedProgramLocalParameter4fEXTPROC) (jint, jint, jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glNamedProgramLocalParameter4fvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetNamedProgramLocalParameterdvEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetNamedProgramLocalParameterfvEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetNamedProgramivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetNamedProgramStringEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCompressedTextureImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedTextureImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedTextureImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetCompressedTextureImageEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCompressedMultiTexImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedMultiTexImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedMultiTexImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedMultiTexSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedMultiTexSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCompressedMultiTexSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetCompressedMultiTexImageEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glMatrixLoadTransposefEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glMatrixLoadTransposedEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glMatrixMultTransposefEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glMatrixMultTransposedEXTPROC) (jint, const intptr_t);
typedef void (APIENTRY *glNamedBufferDataEXTPROC) (jint, intptr_t, const intptr_t, jint);
typedef void (APIENTRY *glNamedBufferSubDataEXTPROC) (jint, intptr_t, intptr_t, const intptr_t);
typedef intptr_t (APIENTRY *glMapNamedBufferEXTPROC) (jint, jint);
typedef jboolean (APIENTRY *glUnmapNamedBufferEXTPROC) (jint);
typedef void (APIENTRY *glGetNamedBufferParameterivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetNamedBufferSubDataEXTPROC) (jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glProgramUniform1fEXTPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glProgramUniform2fEXTPROC) (jint, jint, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform3fEXTPROC) (jint, jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform4fEXTPROC) (jint, jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform1iEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glProgramUniform2iEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform3iEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform4iEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform1fvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform2fvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform3fvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform4fvEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform1ivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform2ivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform3ivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform4ivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2fvEXTPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3fvEXTPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4fvEXTPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x3fvEXTPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x2fvEXTPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x4fvEXTPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x2fvEXTPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x4fvEXTPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x3fvEXTPROC) (jint, jint, jint, jboolean, const intptr_t);
typedef void (APIENTRY *glTextureBufferEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glMultiTexBufferEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTextureParameterIivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTextureParameterIuivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetTextureParameterIivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTextureParameterIuivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glMultiTexParameterIivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glMultiTexParameterIuivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetMultiTexParameterIivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetMultiTexParameterIuivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform1uiEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glProgramUniform2uiEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform3uiEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform4uiEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform1uivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform2uivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform3uivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glProgramUniform4uivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glNamedProgramLocalParameters4fvEXTPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glNamedProgramLocalParameterI4iEXTPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedProgramLocalParameterI4ivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glNamedProgramLocalParametersI4ivEXTPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glNamedProgramLocalParameterI4uiEXTPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedProgramLocalParameterI4uivEXTPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glNamedProgramLocalParametersI4uivEXTPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glGetNamedProgramLocalParameterIivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetNamedProgramLocalParameterIuivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glNamedRenderbufferStorageEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glGetNamedRenderbufferParameterivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glNamedRenderbufferStorageMultisampleEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedRenderbufferStorageMultisampleCoverageEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef jint (APIENTRY *glCheckNamedFramebufferStatusEXTPROC) (jint, jint);
typedef void (APIENTRY *glNamedFramebufferTexture1DEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTexture2DEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTexture3DEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferRenderbufferEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glGetNamedFramebufferAttachmentParameterivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGenerateTextureMipmapEXTPROC) (jint, jint);
typedef void (APIENTRY *glGenerateMultiTexMipmapEXTPROC) (jint, jint);
typedef void (APIENTRY *glFramebufferDrawBufferEXTPROC) (jint, jint);
typedef void (APIENTRY *glFramebufferDrawBuffersEXTPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glFramebufferReadBufferEXTPROC) (jint, jint);
typedef void (APIENTRY *glGetFramebufferParameterivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glNamedCopyBufferSubDataEXTPROC) (jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glNamedFramebufferTextureEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTextureLayerEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTextureFaceEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureRenderbufferEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glMultiTexRenderbufferEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertexArrayVertexOffsetEXTPROC) (jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glVertexArrayColorOffsetEXTPROC) (jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glVertexArrayEdgeFlagOffsetEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glVertexArrayIndexOffsetEXTPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glVertexArrayNormalOffsetEXTPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glVertexArrayTexCoordOffsetEXTPROC) (jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glVertexArrayMultiTexCoordOffsetEXTPROC) (jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glVertexArrayFogCoordOffsetEXTPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glVertexArraySecondaryColorOffsetEXTPROC) (jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glVertexArrayVertexAttribOffsetEXTPROC) (jint, jint, jint, jint, jint, jboolean, jint, intptr_t);
typedef void (APIENTRY *glVertexArrayVertexAttribIOffsetEXTPROC) (jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glEnableVertexArrayEXTPROC) (jint, jint);
typedef void (APIENTRY *glDisableVertexArrayEXTPROC) (jint, jint);
typedef void (APIENTRY *glEnableVertexArrayAttribEXTPROC) (jint, jint);
typedef void (APIENTRY *glDisableVertexArrayAttribEXTPROC) (jint, jint);
typedef void (APIENTRY *glGetVertexArrayIntegervEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexArrayPointervEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexArrayIntegeri_vEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexArrayPointeri_vEXTPROC) (jint, jint, jint, intptr_t);
typedef intptr_t (APIENTRY *glMapNamedBufferRangeEXTPROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glFlushMappedNamedBufferRangeEXTPROC) (jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glClientAttribDefaultEXT(JNIEnv *__env, jclass clazz, jint mask) {
    glClientAttribDefaultEXTPROC glClientAttribDefaultEXT = (glClientAttribDefaultEXTPROC)tlsGetFunction(138);
    UNUSED_PARAM(clazz)
    glClientAttribDefaultEXT(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glPushClientAttribDefaultEXT(JNIEnv *__env, jclass clazz, jint mask) {
    glPushClientAttribDefaultEXTPROC glPushClientAttribDefaultEXT = (glPushClientAttribDefaultEXTPROC)tlsGetFunction(1431);
    UNUSED_PARAM(clazz)
    glPushClientAttribDefaultEXT(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoadfEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixLoadfEXTPROC glMatrixLoadfEXT = (glMatrixLoadfEXTPROC)tlsGetFunction(981);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixLoadfEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoaddEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixLoaddEXTPROC glMatrixLoaddEXT = (glMatrixLoaddEXTPROC)tlsGetFunction(980);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixLoaddEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultfEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixMultfEXTPROC glMatrixMultfEXT = (glMatrixMultfEXTPROC)tlsGetFunction(989);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixMultfEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultdEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixMultdEXTPROC glMatrixMultdEXT = (glMatrixMultdEXTPROC)tlsGetFunction(988);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixMultdEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixLoadIdentityEXT(JNIEnv *__env, jclass clazz, jint matrixMode) {
    glMatrixLoadIdentityEXTPROC glMatrixLoadIdentityEXT = (glMatrixLoadIdentityEXTPROC)tlsGetFunction(976);
    UNUSED_PARAM(clazz)
    glMatrixLoadIdentityEXT(matrixMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixRotatefEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jfloat angle, jfloat x, jfloat y, jfloat z) {
    glMatrixRotatefEXTPROC glMatrixRotatefEXT = (glMatrixRotatefEXTPROC)tlsGetFunction(994);
    UNUSED_PARAM(clazz)
    glMatrixRotatefEXT(matrixMode, angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixRotatedEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble angle, jdouble x, jdouble y, jdouble z) {
    glMatrixRotatedEXTPROC glMatrixRotatedEXT = (glMatrixRotatedEXTPROC)tlsGetFunction(993);
    UNUSED_PARAM(clazz)
    glMatrixRotatedEXT(matrixMode, angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixScalefEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jfloat x, jfloat y, jfloat z) {
    glMatrixScalefEXTPROC glMatrixScalefEXT = (glMatrixScalefEXTPROC)tlsGetFunction(996);
    UNUSED_PARAM(clazz)
    glMatrixScalefEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixScaledEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble x, jdouble y, jdouble z) {
    glMatrixScaledEXTPROC glMatrixScaledEXT = (glMatrixScaledEXTPROC)tlsGetFunction(995);
    UNUSED_PARAM(clazz)
    glMatrixScaledEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixTranslatefEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jfloat x, jfloat y, jfloat z) {
    glMatrixTranslatefEXTPROC glMatrixTranslatefEXT = (glMatrixTranslatefEXTPROC)tlsGetFunction(998);
    UNUSED_PARAM(clazz)
    glMatrixTranslatefEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixTranslatedEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble x, jdouble y, jdouble z) {
    glMatrixTranslatedEXTPROC glMatrixTranslatedEXT = (glMatrixTranslatedEXTPROC)tlsGetFunction(997);
    UNUSED_PARAM(clazz)
    glMatrixTranslatedEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixOrthoEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f) {
    glMatrixOrthoEXTPROC glMatrixOrthoEXT = (glMatrixOrthoEXTPROC)tlsGetFunction(990);
    UNUSED_PARAM(clazz)
    glMatrixOrthoEXT(matrixMode, l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixFrustumEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f) {
    glMatrixFrustumEXTPROC glMatrixFrustumEXT = (glMatrixFrustumEXTPROC)tlsGetFunction(969);
    UNUSED_PARAM(clazz)
    glMatrixFrustumEXT(matrixMode, l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixPushEXT(JNIEnv *__env, jclass clazz, jint matrixMode) {
    glMatrixPushEXTPROC glMatrixPushEXT = (glMatrixPushEXTPROC)tlsGetFunction(992);
    UNUSED_PARAM(clazz)
    glMatrixPushEXT(matrixMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixPopEXT(JNIEnv *__env, jclass clazz, jint matrixMode) {
    glMatrixPopEXTPROC glMatrixPopEXT = (glMatrixPopEXTPROC)tlsGetFunction(991);
    UNUSED_PARAM(clazz)
    glMatrixPopEXT(matrixMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glTextureParameteriEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jint param) {
    glTextureParameteriEXTPROC glTextureParameteriEXT = (glTextureParameteriEXTPROC)tlsGetFunction(1705);
    UNUSED_PARAM(clazz)
    glTextureParameteriEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramAddress) {
    glTextureParameterivEXTPROC glTextureParameterivEXT = (glTextureParameterivEXTPROC)tlsGetFunction(1707);
    const intptr_t param = (const intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterivEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glTextureParameterfEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jfloat param) {
    glTextureParameterfEXTPROC glTextureParameterfEXT = (glTextureParameterfEXTPROC)tlsGetFunction(1701);
    UNUSED_PARAM(clazz)
    glTextureParameterfEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramAddress) {
    glTextureParameterfvEXTPROC glTextureParameterfvEXT = (glTextureParameterfvEXTPROC)tlsGetFunction(1703);
    const intptr_t param = (const intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterfvEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureImage1DEXT__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint border, jint format, jint type, jlong pixelsAddress) {
    glTextureImage1DEXTPROC glTextureImage1DEXT = (glTextureImage1DEXTPROC)tlsGetFunction(1688);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureImage2DEXT__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress) {
    glTextureImage2DEXTPROC glTextureImage2DEXT = (glTextureImage2DEXTPROC)tlsGetFunction(1689);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureSubImage1DEXT__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage1DEXTPROC glTextureSubImage1DEXT = (glTextureSubImage1DEXTPROC)tlsGetFunction(1726);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureSubImage2DEXT__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage2DEXTPROC glTextureSubImage2DEXT = (glTextureSubImage2DEXTPROC)tlsGetFunction(1728);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyTextureImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint border) {
    glCopyTextureImage1DEXTPROC glCopyTextureImage1DEXT = (glCopyTextureImage1DEXTPROC)tlsGetFunction(252);
    UNUSED_PARAM(clazz)
    glCopyTextureImage1DEXT(texture, target, level, internalformat, x, y, width, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyTextureImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {
    glCopyTextureImage2DEXTPROC glCopyTextureImage2DEXT = (glCopyTextureImage2DEXTPROC)tlsGetFunction(253);
    UNUSED_PARAM(clazz)
    glCopyTextureImage2DEXT(texture, target, level, internalformat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyTextureSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint x, jint y, jint width) {
    glCopyTextureSubImage1DEXTPROC glCopyTextureSubImage1DEXT = (glCopyTextureSubImage1DEXTPROC)tlsGetFunction(255);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage1DEXT(texture, target, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyTextureSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
    glCopyTextureSubImage2DEXTPROC glCopyTextureSubImage2DEXT = (glCopyTextureSubImage2DEXTPROC)tlsGetFunction(257);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureImageEXT__IIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint format, jint type, jlong pixelsAddress) {
    glGetTextureImageEXTPROC glGetTextureImageEXT = (glGetTextureImageEXTPROC)tlsGetFunction(735);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureImageEXT(texture, target, level, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glGetTextureParameterfvEXTPROC glGetTextureParameterfvEXT = (glGetTextureParameterfvEXTPROC)tlsGetFunction(745);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterfvEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glGetTextureParameterivEXTPROC glGetTextureParameterivEXT = (glGetTextureParameterivEXTPROC)tlsGetFunction(747);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureLevelParameterfvEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetTextureLevelParameterfvEXTPROC glGetTextureLevelParameterfvEXT = (glGetTextureLevelParameterfvEXTPROC)tlsGetFunction(737);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureLevelParameterfvEXT(texture, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureLevelParameterivEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetTextureLevelParameterivEXTPROC glGetTextureLevelParameterivEXT = (glGetTextureLevelParameterivEXTPROC)tlsGetFunction(739);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureLevelParameterivEXT(texture, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureImage3DEXT__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress) {
    glTextureImage3DEXTPROC glTextureImage3DEXT = (glTextureImage3DEXTPROC)tlsGetFunction(1692);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureSubImage3DEXT__IIIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage3DEXTPROC glTextureSubImage3DEXT = (glTextureSubImage3DEXTPROC)tlsGetFunction(1730);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyTextureSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height) {
    glCopyTextureSubImage3DEXTPROC glCopyTextureSubImage3DEXT = (glCopyTextureSubImage3DEXTPROC)tlsGetFunction(259);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glBindMultiTextureEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint texture) {
    glBindMultiTextureEXTPROC glBindMultiTextureEXT = (glBindMultiTextureEXTPROC)tlsGetFunction(49);
    UNUSED_PARAM(clazz)
    glBindMultiTextureEXT(texunit, target, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexCoordPointerEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint size, jint type, jint stride, jlong pointerAddress) {
    glMultiTexCoordPointerEXTPROC glMultiTexCoordPointerEXT = (glMultiTexCoordPointerEXTPROC)tlsGetFunction(1108);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoordPointerEXT(texunit, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexEnvfEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jfloat param) {
    glMultiTexEnvfEXTPROC glMultiTexEnvfEXT = (glMultiTexEnvfEXTPROC)tlsGetFunction(1109);
    UNUSED_PARAM(clazz)
    glMultiTexEnvfEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexEnvfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glMultiTexEnvfvEXTPROC glMultiTexEnvfvEXT = (glMultiTexEnvfvEXTPROC)tlsGetFunction(1110);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexEnvfvEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexEnviEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jint param) {
    glMultiTexEnviEXTPROC glMultiTexEnviEXT = (glMultiTexEnviEXTPROC)tlsGetFunction(1111);
    UNUSED_PARAM(clazz)
    glMultiTexEnviEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexEnvivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glMultiTexEnvivEXTPROC glMultiTexEnvivEXT = (glMultiTexEnvivEXTPROC)tlsGetFunction(1112);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexEnvivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexGendEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jdouble param) {
    glMultiTexGendEXTPROC glMultiTexGendEXT = (glMultiTexGendEXTPROC)tlsGetFunction(1113);
    UNUSED_PARAM(clazz)
    glMultiTexGendEXT(texunit, coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGendvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glMultiTexGendvEXTPROC glMultiTexGendvEXT = (glMultiTexGendvEXTPROC)tlsGetFunction(1114);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexGendvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexGenfEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jfloat param) {
    glMultiTexGenfEXTPROC glMultiTexGenfEXT = (glMultiTexGenfEXTPROC)tlsGetFunction(1115);
    UNUSED_PARAM(clazz)
    glMultiTexGenfEXT(texunit, coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGenfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glMultiTexGenfvEXTPROC glMultiTexGenfvEXT = (glMultiTexGenfvEXTPROC)tlsGetFunction(1116);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexGenfvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexGeniEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jint param) {
    glMultiTexGeniEXTPROC glMultiTexGeniEXT = (glMultiTexGeniEXTPROC)tlsGetFunction(1117);
    UNUSED_PARAM(clazz)
    glMultiTexGeniEXT(texunit, coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGenivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glMultiTexGenivEXTPROC glMultiTexGenivEXT = (glMultiTexGenivEXTPROC)tlsGetFunction(1118);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexGenivEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexEnvfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexEnvfvEXTPROC glGetMultiTexEnvfvEXT = (glGetMultiTexEnvfvEXTPROC)tlsGetFunction(594);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexEnvfvEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexEnvivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexEnvivEXTPROC glGetMultiTexEnvivEXT = (glGetMultiTexEnvivEXTPROC)tlsGetFunction(595);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexEnvivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexGendvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glGetMultiTexGendvEXTPROC glGetMultiTexGendvEXT = (glGetMultiTexGendvEXTPROC)tlsGetFunction(596);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexGendvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexGenfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glGetMultiTexGenfvEXTPROC glGetMultiTexGenfvEXT = (glGetMultiTexGenfvEXTPROC)tlsGetFunction(597);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexGenfvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexGenivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glGetMultiTexGenivEXTPROC glGetMultiTexGenivEXT = (glGetMultiTexGenivEXTPROC)tlsGetFunction(598);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexGenivEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexParameteriEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jint param) {
    glMultiTexParameteriEXTPROC glMultiTexParameteriEXT = (glMultiTexParameteriEXTPROC)tlsGetFunction(1126);
    UNUSED_PARAM(clazz)
    glMultiTexParameteriEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramAddress) {
    glMultiTexParameterivEXTPROC glMultiTexParameterivEXT = (glMultiTexParameterivEXTPROC)tlsGetFunction(1127);
    const intptr_t param = (const intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glMultiTexParameterivEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexParameterfEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jfloat param) {
    glMultiTexParameterfEXTPROC glMultiTexParameterfEXT = (glMultiTexParameterfEXTPROC)tlsGetFunction(1124);
    UNUSED_PARAM(clazz)
    glMultiTexParameterfEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramAddress) {
    glMultiTexParameterfvEXTPROC glMultiTexParameterfvEXT = (glMultiTexParameterfvEXTPROC)tlsGetFunction(1125);
    const intptr_t param = (const intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glMultiTexParameterfvEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexImage1DEXT__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint border, jint format, jint type, jlong pixelsAddress) {
    glMultiTexImage1DEXTPROC glMultiTexImage1DEXT = (glMultiTexImage1DEXTPROC)tlsGetFunction(1119);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexImage2DEXT__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress) {
    glMultiTexImage2DEXTPROC glMultiTexImage2DEXT = (glMultiTexImage2DEXTPROC)tlsGetFunction(1120);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexSubImage1DEXT__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress) {
    glMultiTexSubImage1DEXTPROC glMultiTexSubImage1DEXT = (glMultiTexSubImage1DEXTPROC)tlsGetFunction(1129);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexSubImage2DEXT__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glMultiTexSubImage2DEXTPROC glMultiTexSubImage2DEXT = (glMultiTexSubImage2DEXTPROC)tlsGetFunction(1130);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyMultiTexImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint border) {
    glCopyMultiTexImage1DEXTPROC glCopyMultiTexImage1DEXT = (glCopyMultiTexImage1DEXTPROC)tlsGetFunction(239);
    UNUSED_PARAM(clazz)
    glCopyMultiTexImage1DEXT(texunit, target, level, internalformat, x, y, width, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyMultiTexImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {
    glCopyMultiTexImage2DEXTPROC glCopyMultiTexImage2DEXT = (glCopyMultiTexImage2DEXTPROC)tlsGetFunction(240);
    UNUSED_PARAM(clazz)
    glCopyMultiTexImage2DEXT(texunit, target, level, internalformat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyMultiTexSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint x, jint y, jint width) {
    glCopyMultiTexSubImage1DEXTPROC glCopyMultiTexSubImage1DEXT = (glCopyMultiTexSubImage1DEXTPROC)tlsGetFunction(241);
    UNUSED_PARAM(clazz)
    glCopyMultiTexSubImage1DEXT(texunit, target, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyMultiTexSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
    glCopyMultiTexSubImage2DEXTPROC glCopyMultiTexSubImage2DEXT = (glCopyMultiTexSubImage2DEXTPROC)tlsGetFunction(242);
    UNUSED_PARAM(clazz)
    glCopyMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexImageEXT__IIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint format, jint type, jlong pixelsAddress) {
    glGetMultiTexImageEXTPROC glGetMultiTexImageEXT = (glGetMultiTexImageEXTPROC)tlsGetFunction(599);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexImageEXT(texunit, target, level, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexParameterfvEXTPROC glGetMultiTexParameterfvEXT = (glGetMultiTexParameterfvEXTPROC)tlsGetFunction(604);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexParameterfvEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexParameterivEXTPROC glGetMultiTexParameterivEXT = (glGetMultiTexParameterivEXTPROC)tlsGetFunction(605);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexParameterivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexLevelParameterfvEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetMultiTexLevelParameterfvEXTPROC glGetMultiTexLevelParameterfvEXT = (glGetMultiTexLevelParameterfvEXTPROC)tlsGetFunction(600);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexLevelParameterivEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetMultiTexLevelParameterivEXTPROC glGetMultiTexLevelParameterivEXT = (glGetMultiTexLevelParameterivEXTPROC)tlsGetFunction(601);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexLevelParameterivEXT(texunit, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexImage3DEXT__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress) {
    glMultiTexImage3DEXTPROC glMultiTexImage3DEXT = (glMultiTexImage3DEXTPROC)tlsGetFunction(1121);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexSubImage3DEXT__IIIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress) {
    glMultiTexSubImage3DEXTPROC glMultiTexSubImage3DEXT = (glMultiTexSubImage3DEXTPROC)tlsGetFunction(1131);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyMultiTexSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height) {
    glCopyMultiTexSubImage3DEXTPROC glCopyMultiTexSubImage3DEXT = (glCopyMultiTexSubImage3DEXTPROC)tlsGetFunction(243);
    UNUSED_PARAM(clazz)
    glCopyMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glEnableClientStateIndexedEXT(JNIEnv *__env, jclass clazz, jint array, jint index) {
    glEnableClientStateIndexedEXTPROC glEnableClientStateIndexedEXT = (glEnableClientStateIndexedEXTPROC)tlsGetFunction(390);
    UNUSED_PARAM(clazz)
    glEnableClientStateIndexedEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glDisableClientStateIndexedEXT(JNIEnv *__env, jclass clazz, jint array, jint index) {
    glDisableClientStateIndexedEXTPROC glDisableClientStateIndexedEXT = (glDisableClientStateIndexedEXTPROC)tlsGetFunction(340);
    UNUSED_PARAM(clazz)
    glDisableClientStateIndexedEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glEnableClientStateiEXT(JNIEnv *__env, jclass clazz, jint array, jint index) {
    glEnableClientStateiEXTPROC glEnableClientStateiEXT = (glEnableClientStateiEXTPROC)tlsGetFunction(391);
    UNUSED_PARAM(clazz)
    glEnableClientStateiEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glDisableClientStateiEXT(JNIEnv *__env, jclass clazz, jint array, jint index) {
    glDisableClientStateiEXTPROC glDisableClientStateiEXT = (glDisableClientStateiEXTPROC)tlsGetFunction(341);
    UNUSED_PARAM(clazz)
    glDisableClientStateiEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetFloatIndexedvEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetFloatIndexedvEXTPROC glGetFloatIndexedvEXT = (glGetFloatIndexedvEXTPROC)tlsGetFunction(553);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFloatIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetDoubleIndexedvEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetDoubleIndexedvEXTPROC glGetDoubleIndexedvEXT = (glGetDoubleIndexedvEXTPROC)tlsGetFunction(546);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetDoubleIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetPointerIndexedvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetPointerIndexedvEXTPROC glGetPointerIndexedvEXT = (glGetPointerIndexedvEXTPROC)tlsGetFunction(661);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetPointerIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetFloati_1vEXT__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong paramsAddress) {
    glGetFloati_vEXTPROC glGetFloati_vEXT = (glGetFloati_vEXTPROC)tlsGetFunction(555);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFloati_vEXT(pname, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetDoublei_1vEXT__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong paramsAddress) {
    glGetDoublei_vEXTPROC glGetDoublei_vEXT = (glGetDoublei_vEXTPROC)tlsGetFunction(548);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetDoublei_vEXT(pname, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetPointeri_1vEXT(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong paramsAddress) {
    glGetPointeri_vEXTPROC glGetPointeri_vEXT = (glGetPointeri_vEXTPROC)tlsGetFunction(662);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetPointeri_vEXT(pname, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glEnableIndexedEXT(JNIEnv *__env, jclass clazz, jint cap, jint index) {
    glEnableIndexedEXTPROC glEnableIndexedEXT = (glEnableIndexedEXTPROC)tlsGetFunction(392);
    UNUSED_PARAM(clazz)
    glEnableIndexedEXT(cap, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glDisableIndexedEXT(JNIEnv *__env, jclass clazz, jint cap, jint index) {
    glDisableIndexedEXTPROC glDisableIndexedEXT = (glDisableIndexedEXTPROC)tlsGetFunction(342);
    UNUSED_PARAM(clazz)
    glDisableIndexedEXT(cap, index);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glIsEnabledIndexedEXT(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glIsEnabledIndexedEXTPROC glIsEnabledIndexedEXT = (glIsEnabledIndexedEXTPROC)tlsGetFunction(880);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsEnabledIndexedEXT(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetIntegerIndexedvEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetIntegerIndexedvEXTPROC glGetIntegerIndexedvEXT = (glGetIntegerIndexedvEXTPROC)tlsGetFunction(575);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetIntegerIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetBooleanIndexedvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetBooleanIndexedvEXTPROC glGetBooleanIndexedvEXT = (glGetBooleanIndexedvEXTPROC)tlsGetFunction(517);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetBooleanIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramStringEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint format, jint len, jlong stringAddress) {
    glNamedProgramStringEXTPROC glNamedProgramStringEXT = (glNamedProgramStringEXTPROC)tlsGetFunction(1183);
    const intptr_t string = (const intptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramStringEXT(program, target, format, len, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedProgramLocalParameter4dEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jdouble x, jdouble y, jdouble z, jdouble w) {
    glNamedProgramLocalParameter4dEXTPROC glNamedProgramLocalParameter4dEXT = (glNamedProgramLocalParameter4dEXTPROC)tlsGetFunction(1172);
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameter4dEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameter4dvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glNamedProgramLocalParameter4dvEXTPROC glNamedProgramLocalParameter4dvEXT = (glNamedProgramLocalParameter4dvEXTPROC)tlsGetFunction(1173);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameter4dvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedProgramLocalParameter4fEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jfloat x, jfloat y, jfloat z, jfloat w) {
    glNamedProgramLocalParameter4fEXTPROC glNamedProgramLocalParameter4fEXT = (glNamedProgramLocalParameter4fEXTPROC)tlsGetFunction(1174);
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameter4fEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameter4fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glNamedProgramLocalParameter4fvEXTPROC glNamedProgramLocalParameter4fvEXT = (glNamedProgramLocalParameter4fvEXTPROC)tlsGetFunction(1175);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameter4fvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterdvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glGetNamedProgramLocalParameterdvEXTPROC glGetNamedProgramLocalParameterdvEXT = (glGetNamedProgramLocalParameterdvEXTPROC)tlsGetFunction(621);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramLocalParameterdvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glGetNamedProgramLocalParameterfvEXTPROC glGetNamedProgramLocalParameterfvEXT = (glGetNamedProgramLocalParameterfvEXTPROC)tlsGetFunction(622);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramLocalParameterfvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint pname, jlong paramsAddress) {
    glGetNamedProgramivEXTPROC glGetNamedProgramivEXT = (glGetNamedProgramivEXTPROC)tlsGetFunction(624);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramivEXT(program, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramStringEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint pname, jlong stringAddress) {
    glGetNamedProgramStringEXTPROC glGetNamedProgramStringEXT = (glGetNamedProgramStringEXTPROC)tlsGetFunction(623);
    intptr_t string = (intptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramStringEXT(program, target, pname, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureImage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTextureImage3DEXTPROC glCompressedTextureImage3DEXT = (glCompressedTextureImage3DEXTPROC)tlsGetFunction(217);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTextureImage2DEXTPROC glCompressedTextureImage2DEXT = (glCompressedTextureImage2DEXTPROC)tlsGetFunction(216);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTextureImage1DEXTPROC glCompressedTextureImage1DEXT = (glCompressedTextureImage1DEXTPROC)tlsGetFunction(215);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage3DEXTPROC glCompressedTextureSubImage3DEXT = (glCompressedTextureSubImage3DEXTPROC)tlsGetFunction(223);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage2DEXTPROC glCompressedTextureSubImage2DEXT = (glCompressedTextureSubImage2DEXTPROC)tlsGetFunction(221);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint width, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage1DEXTPROC glCompressedTextureSubImage1DEXT = (glCompressedTextureSubImage1DEXTPROC)tlsGetFunction(219);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetCompressedTextureImageEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jlong imgAddress) {
    glGetCompressedTextureImageEXTPROC glGetCompressedTextureImageEXT = (glGetCompressedTextureImageEXTPROC)tlsGetFunction(537);
    intptr_t img = (intptr_t)imgAddress;
    UNUSED_PARAM(clazz)
    glGetCompressedTextureImageEXT(texture, target, level, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexImage3DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexImage3DEXTPROC glCompressedMultiTexImage3DEXT = (glCompressedMultiTexImage3DEXTPROC)tlsGetFunction(199);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexImage2DEXTPROC glCompressedMultiTexImage2DEXT = (glCompressedMultiTexImage2DEXTPROC)tlsGetFunction(198);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint border, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexImage1DEXTPROC glCompressedMultiTexImage1DEXT = (glCompressedMultiTexImage1DEXTPROC)tlsGetFunction(197);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexSubImage3DEXTPROC glCompressedMultiTexSubImage3DEXT = (glCompressedMultiTexSubImage3DEXTPROC)tlsGetFunction(202);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexSubImage2DEXTPROC glCompressedMultiTexSubImage2DEXT = (glCompressedMultiTexSubImage2DEXTPROC)tlsGetFunction(201);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint width, jint format, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexSubImage1DEXTPROC glCompressedMultiTexSubImage1DEXT = (glCompressedMultiTexSubImage1DEXTPROC)tlsGetFunction(200);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetCompressedMultiTexImageEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jlong imgAddress) {
    glGetCompressedMultiTexImageEXTPROC glGetCompressedMultiTexImageEXT = (glGetCompressedMultiTexImageEXTPROC)tlsGetFunction(533);
    intptr_t img = (intptr_t)imgAddress;
    UNUSED_PARAM(clazz)
    glGetCompressedMultiTexImageEXT(texunit, target, level, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoadTransposefEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixLoadTransposefEXTPROC glMatrixLoadTransposefEXT = (glMatrixLoadTransposefEXTPROC)tlsGetFunction(979);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixLoadTransposefEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoadTransposedEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixLoadTransposedEXTPROC glMatrixLoadTransposedEXT = (glMatrixLoadTransposedEXTPROC)tlsGetFunction(978);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixLoadTransposedEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultTransposefEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixMultTransposefEXTPROC glMatrixMultTransposefEXT = (glMatrixMultTransposefEXTPROC)tlsGetFunction(987);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixMultTransposefEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultTransposedEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixMultTransposedEXTPROC glMatrixMultTransposedEXT = (glMatrixMultTransposedEXTPROC)tlsGetFunction(986);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixMultTransposedEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedBufferDataEXT__IJJI(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint usage) {
    glNamedBufferDataEXTPROC glNamedBufferDataEXT = (glNamedBufferDataEXTPROC)tlsGetFunction(1144);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferDataEXT(buffer, (intptr_t)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedBufferSubDataEXT__IJJJ(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress) {
    glNamedBufferSubDataEXTPROC glNamedBufferSubDataEXT = (glNamedBufferSubDataEXTPROC)tlsGetFunction(1152);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferSubDataEXT(buffer, (intptr_t)offset, (intptr_t)size, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMapNamedBufferEXT(JNIEnv *__env, jclass clazz, jint buffer, jint access) {
    glMapNamedBufferEXTPROC glMapNamedBufferEXT = (glMapNamedBufferEXTPROC)tlsGetFunction(961);
    UNUSED_PARAM(clazz)
    return (jlong)glMapNamedBufferEXT(buffer, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glUnmapNamedBufferEXT(JNIEnv *__env, jclass clazz, jint buffer) {
    glUnmapNamedBufferEXTPROC glUnmapNamedBufferEXT = (glUnmapNamedBufferEXTPROC)tlsGetFunction(1864);
    UNUSED_PARAM(clazz)
    return (jboolean)glUnmapNamedBufferEXT(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedBufferParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress) {
    glGetNamedBufferParameterivEXTPROC glGetNamedBufferParameterivEXT = (glGetNamedBufferParameterivEXTPROC)tlsGetFunction(610);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferParameterivEXT(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedBufferSubDataEXT__IJJJ(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress) {
    glGetNamedBufferSubDataEXTPROC glGetNamedBufferSubDataEXT = (glGetNamedBufferSubDataEXTPROC)tlsGetFunction(614);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferSubDataEXT(buffer, (intptr_t)offset, (intptr_t)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform1fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0) {
    glProgramUniform1fEXTPROC glProgramUniform1fEXT = (glProgramUniform1fEXTPROC)tlsGetFunction(1294);
    UNUSED_PARAM(clazz)
    glProgramUniform1fEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform2fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1) {
    glProgramUniform2fEXTPROC glProgramUniform2fEXT = (glProgramUniform2fEXTPROC)tlsGetFunction(1318);
    UNUSED_PARAM(clazz)
    glProgramUniform2fEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform3fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2) {
    glProgramUniform3fEXTPROC glProgramUniform3fEXT = (glProgramUniform3fEXTPROC)tlsGetFunction(1342);
    UNUSED_PARAM(clazz)
    glProgramUniform3fEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform4fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
    glProgramUniform4fEXTPROC glProgramUniform4fEXT = (glProgramUniform4fEXTPROC)tlsGetFunction(1366);
    UNUSED_PARAM(clazz)
    glProgramUniform4fEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform1iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0) {
    glProgramUniform1iEXTPROC glProgramUniform1iEXT = (glProgramUniform1iEXTPROC)tlsGetFunction(1302);
    UNUSED_PARAM(clazz)
    glProgramUniform1iEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform2iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1) {
    glProgramUniform2iEXTPROC glProgramUniform2iEXT = (glProgramUniform2iEXTPROC)tlsGetFunction(1326);
    UNUSED_PARAM(clazz)
    glProgramUniform2iEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform3iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {
    glProgramUniform3iEXTPROC glProgramUniform3iEXT = (glProgramUniform3iEXTPROC)tlsGetFunction(1350);
    UNUSED_PARAM(clazz)
    glProgramUniform3iEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform4iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {
    glProgramUniform4iEXTPROC glProgramUniform4iEXT = (glProgramUniform4iEXTPROC)tlsGetFunction(1374);
    UNUSED_PARAM(clazz)
    glProgramUniform4iEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1fvEXTPROC glProgramUniform1fvEXT = (glProgramUniform1fvEXTPROC)tlsGetFunction(1296);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2fvEXTPROC glProgramUniform2fvEXT = (glProgramUniform2fvEXTPROC)tlsGetFunction(1320);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3fvEXTPROC glProgramUniform3fvEXT = (glProgramUniform3fvEXTPROC)tlsGetFunction(1344);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4fvEXTPROC glProgramUniform4fvEXT = (glProgramUniform4fvEXTPROC)tlsGetFunction(1368);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1ivEXTPROC glProgramUniform1ivEXT = (glProgramUniform1ivEXTPROC)tlsGetFunction(1304);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2ivEXTPROC glProgramUniform2ivEXT = (glProgramUniform2ivEXTPROC)tlsGetFunction(1328);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3ivEXTPROC glProgramUniform3ivEXT = (glProgramUniform3ivEXTPROC)tlsGetFunction(1352);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4ivEXTPROC glProgramUniform4ivEXT = (glProgramUniform4ivEXTPROC)tlsGetFunction(1376);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix2fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2fvEXTPROC glProgramUniformMatrix2fvEXT = (glProgramUniformMatrix2fvEXTPROC)tlsGetFunction(1392);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix3fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3fvEXTPROC glProgramUniformMatrix3fvEXT = (glProgramUniformMatrix3fvEXTPROC)tlsGetFunction(1404);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix4fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4fvEXTPROC glProgramUniformMatrix4fvEXT = (glProgramUniformMatrix4fvEXTPROC)tlsGetFunction(1416);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix2x3fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x3fvEXTPROC glProgramUniformMatrix2x3fvEXT = (glProgramUniformMatrix2x3fvEXTPROC)tlsGetFunction(1396);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix3x2fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x2fvEXTPROC glProgramUniformMatrix3x2fvEXT = (glProgramUniformMatrix3x2fvEXTPROC)tlsGetFunction(1408);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix2x4fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x4fvEXTPROC glProgramUniformMatrix2x4fvEXT = (glProgramUniformMatrix2x4fvEXTPROC)tlsGetFunction(1400);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix4x2fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x2fvEXTPROC glProgramUniformMatrix4x2fvEXT = (glProgramUniformMatrix4x2fvEXTPROC)tlsGetFunction(1420);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix3x4fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x4fvEXTPROC glProgramUniformMatrix3x4fvEXT = (glProgramUniformMatrix3x4fvEXTPROC)tlsGetFunction(1412);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix4x3fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x3fvEXTPROC glProgramUniformMatrix4x3fvEXT = (glProgramUniformMatrix4x3fvEXTPROC)tlsGetFunction(1424);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glTextureBufferEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint internalformat, jint buffer) {
    glTextureBufferEXTPROC glTextureBufferEXT = (glTextureBufferEXTPROC)tlsGetFunction(1685);
    UNUSED_PARAM(clazz)
    glTextureBufferEXT(texture, target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexBufferEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint internalformat, jint buffer) {
    glMultiTexBufferEXTPROC glMultiTexBufferEXT = (glMultiTexBufferEXTPROC)tlsGetFunction(1027);
    UNUSED_PARAM(clazz)
    glMultiTexBufferEXT(texunit, target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterIivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glTextureParameterIivEXTPROC glTextureParameterIivEXT = (glTextureParameterIivEXTPROC)tlsGetFunction(1697);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterIivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterIuivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glTextureParameterIuivEXTPROC glTextureParameterIuivEXT = (glTextureParameterIuivEXTPROC)tlsGetFunction(1699);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterIuivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterIivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glGetTextureParameterIivEXTPROC glGetTextureParameterIivEXT = (glGetTextureParameterIivEXTPROC)tlsGetFunction(741);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterIivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterIuivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glGetTextureParameterIuivEXTPROC glGetTextureParameterIuivEXT = (glGetTextureParameterIuivEXTPROC)tlsGetFunction(743);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterIuivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterIivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glMultiTexParameterIivEXTPROC glMultiTexParameterIivEXT = (glMultiTexParameterIivEXTPROC)tlsGetFunction(1122);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexParameterIivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterIuivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glMultiTexParameterIuivEXTPROC glMultiTexParameterIuivEXT = (glMultiTexParameterIuivEXTPROC)tlsGetFunction(1123);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexParameterIuivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterIivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexParameterIivEXTPROC glGetMultiTexParameterIivEXT = (glGetMultiTexParameterIivEXTPROC)tlsGetFunction(602);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexParameterIivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterIuivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexParameterIuivEXTPROC glGetMultiTexParameterIuivEXT = (glGetMultiTexParameterIuivEXTPROC)tlsGetFunction(603);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexParameterIuivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform1uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0) {
    glProgramUniform1uiEXTPROC glProgramUniform1uiEXT = (glProgramUniform1uiEXTPROC)tlsGetFunction(1310);
    UNUSED_PARAM(clazz)
    glProgramUniform1uiEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform2uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1) {
    glProgramUniform2uiEXTPROC glProgramUniform2uiEXT = (glProgramUniform2uiEXTPROC)tlsGetFunction(1334);
    UNUSED_PARAM(clazz)
    glProgramUniform2uiEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform3uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {
    glProgramUniform3uiEXTPROC glProgramUniform3uiEXT = (glProgramUniform3uiEXTPROC)tlsGetFunction(1358);
    UNUSED_PARAM(clazz)
    glProgramUniform3uiEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform4uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {
    glProgramUniform4uiEXTPROC glProgramUniform4uiEXT = (glProgramUniform4uiEXTPROC)tlsGetFunction(1382);
    UNUSED_PARAM(clazz)
    glProgramUniform4uiEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1uivEXTPROC glProgramUniform1uivEXT = (glProgramUniform1uivEXTPROC)tlsGetFunction(1312);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2uivEXTPROC glProgramUniform2uivEXT = (glProgramUniform2uivEXTPROC)tlsGetFunction(1336);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3uivEXTPROC glProgramUniform3uivEXT = (glProgramUniform3uivEXTPROC)tlsGetFunction(1360);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4uivEXTPROC glProgramUniform4uivEXT = (glProgramUniform4uivEXTPROC)tlsGetFunction(1384);
    const intptr_t value = (const intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameters4fvEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint count, jlong paramsAddress) {
    glNamedProgramLocalParameters4fvEXTPROC glNamedProgramLocalParameters4fvEXT = (glNamedProgramLocalParameters4fvEXTPROC)tlsGetFunction(1180);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameters4fvEXT(program, target, index, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedProgramLocalParameterI4iEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint x, jint y, jint z, jint w) {
    glNamedProgramLocalParameterI4iEXTPROC glNamedProgramLocalParameterI4iEXT = (glNamedProgramLocalParameterI4iEXTPROC)tlsGetFunction(1176);
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameterI4iEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameterI4ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glNamedProgramLocalParameterI4ivEXTPROC glNamedProgramLocalParameterI4ivEXT = (glNamedProgramLocalParameterI4ivEXTPROC)tlsGetFunction(1177);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameterI4ivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParametersI4ivEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint count, jlong paramsAddress) {
    glNamedProgramLocalParametersI4ivEXTPROC glNamedProgramLocalParametersI4ivEXT = (glNamedProgramLocalParametersI4ivEXTPROC)tlsGetFunction(1181);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParametersI4ivEXT(program, target, index, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedProgramLocalParameterI4uiEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint x, jint y, jint z, jint w) {
    glNamedProgramLocalParameterI4uiEXTPROC glNamedProgramLocalParameterI4uiEXT = (glNamedProgramLocalParameterI4uiEXTPROC)tlsGetFunction(1178);
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameterI4uiEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameterI4uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glNamedProgramLocalParameterI4uivEXTPROC glNamedProgramLocalParameterI4uivEXT = (glNamedProgramLocalParameterI4uivEXTPROC)tlsGetFunction(1179);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameterI4uivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParametersI4uivEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint count, jlong paramsAddress) {
    glNamedProgramLocalParametersI4uivEXTPROC glNamedProgramLocalParametersI4uivEXT = (glNamedProgramLocalParametersI4uivEXTPROC)tlsGetFunction(1182);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParametersI4uivEXT(program, target, index, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterIivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glGetNamedProgramLocalParameterIivEXTPROC glGetNamedProgramLocalParameterIivEXT = (glGetNamedProgramLocalParameterIivEXTPROC)tlsGetFunction(619);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramLocalParameterIivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterIuivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glGetNamedProgramLocalParameterIuivEXTPROC glGetNamedProgramLocalParameterIuivEXT = (glGetNamedProgramLocalParameterIuivEXTPROC)tlsGetFunction(620);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramLocalParameterIuivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedRenderbufferStorageEXT(JNIEnv *__env, jclass clazz, jint renderbuffer, jint internalformat, jint width, jint height) {
    glNamedRenderbufferStorageEXTPROC glNamedRenderbufferStorageEXT = (glNamedRenderbufferStorageEXTPROC)tlsGetFunction(1185);
    UNUSED_PARAM(clazz)
    glNamedRenderbufferStorageEXT(renderbuffer, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedRenderbufferParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint renderbuffer, jint pname, jlong paramsAddress) {
    glGetNamedRenderbufferParameterivEXTPROC glGetNamedRenderbufferParameterivEXT = (glGetNamedRenderbufferParameterivEXTPROC)tlsGetFunction(626);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedRenderbufferParameterivEXT(renderbuffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedRenderbufferStorageMultisampleEXT(JNIEnv *__env, jclass clazz, jint renderbuffer, jint samples, jint internalformat, jint width, jint height) {
    glNamedRenderbufferStorageMultisampleEXTPROC glNamedRenderbufferStorageMultisampleEXT = (glNamedRenderbufferStorageMultisampleEXTPROC)tlsGetFunction(1188);
    UNUSED_PARAM(clazz)
    glNamedRenderbufferStorageMultisampleEXT(renderbuffer, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedRenderbufferStorageMultisampleCoverageEXT(JNIEnv *__env, jclass clazz, jint renderbuffer, jint coverageSamples, jint colorSamples, jint internalformat, jint width, jint height) {
    glNamedRenderbufferStorageMultisampleCoverageEXTPROC glNamedRenderbufferStorageMultisampleCoverageEXT = (glNamedRenderbufferStorageMultisampleCoverageEXTPROC)tlsGetFunction(1187);
    UNUSED_PARAM(clazz)
    glNamedRenderbufferStorageMultisampleCoverageEXT(renderbuffer, coverageSamples, colorSamples, internalformat, width, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCheckNamedFramebufferStatusEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint target) {
    glCheckNamedFramebufferStatusEXTPROC glCheckNamedFramebufferStatusEXT = (glCheckNamedFramebufferStatusEXTPROC)tlsGetFunction(107);
    UNUSED_PARAM(clazz)
    return (jint)glCheckNamedFramebufferStatusEXT(framebuffer, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTexture1DEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint textarget, jint texture, jint level) {
    glNamedFramebufferTexture1DEXTPROC glNamedFramebufferTexture1DEXT = (glNamedFramebufferTexture1DEXTPROC)tlsGetFunction(1164);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTexture1DEXT(framebuffer, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTexture2DEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint textarget, jint texture, jint level) {
    glNamedFramebufferTexture2DEXTPROC glNamedFramebufferTexture2DEXT = (glNamedFramebufferTexture2DEXTPROC)tlsGetFunction(1165);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTexture2DEXT(framebuffer, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTexture3DEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint textarget, jint texture, jint level, jint zoffset) {
    glNamedFramebufferTexture3DEXTPROC glNamedFramebufferTexture3DEXT = (glNamedFramebufferTexture3DEXTPROC)tlsGetFunction(1166);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTexture3DEXT(framebuffer, attachment, textarget, texture, level, zoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferRenderbufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint renderbuffertarget, jint renderbuffer) {
    glNamedFramebufferRenderbufferEXTPROC glNamedFramebufferRenderbufferEXT = (glNamedFramebufferRenderbufferEXTPROC)tlsGetFunction(1160);
    UNUSED_PARAM(clazz)
    glNamedFramebufferRenderbufferEXT(framebuffer, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedFramebufferAttachmentParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint pname, jlong paramsAddress) {
    glGetNamedFramebufferAttachmentParameterivEXTPROC glGetNamedFramebufferAttachmentParameterivEXT = (glGetNamedFramebufferAttachmentParameterivEXTPROC)tlsGetFunction(616);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glGenerateTextureMipmapEXT(JNIEnv *__env, jclass clazz, jint texture, jint target) {
    glGenerateTextureMipmapEXTPROC glGenerateTextureMipmapEXT = (glGenerateTextureMipmapEXTPROC)tlsGetFunction(499);
    UNUSED_PARAM(clazz)
    glGenerateTextureMipmapEXT(texture, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glGenerateMultiTexMipmapEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target) {
    glGenerateMultiTexMipmapEXTPROC glGenerateMultiTexMipmapEXT = (glGenerateMultiTexMipmapEXTPROC)tlsGetFunction(497);
    UNUSED_PARAM(clazz)
    glGenerateMultiTexMipmapEXT(texunit, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glFramebufferDrawBufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint mode) {
    glFramebufferDrawBufferEXTPROC glFramebufferDrawBufferEXT = (glFramebufferDrawBufferEXTPROC)tlsGetFunction(449);
    UNUSED_PARAM(clazz)
    glFramebufferDrawBufferEXT(framebuffer, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglFramebufferDrawBuffersEXT__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint n, jlong bufsAddress) {
    glFramebufferDrawBuffersEXTPROC glFramebufferDrawBuffersEXT = (glFramebufferDrawBuffersEXTPROC)tlsGetFunction(450);
    const intptr_t bufs = (const intptr_t)bufsAddress;
    UNUSED_PARAM(clazz)
    glFramebufferDrawBuffersEXT(framebuffer, n, bufs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glFramebufferReadBufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint mode) {
    glFramebufferReadBufferEXTPROC glFramebufferReadBufferEXT = (glFramebufferReadBufferEXTPROC)tlsGetFunction(452);
    UNUSED_PARAM(clazz)
    glFramebufferReadBufferEXT(framebuffer, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetFramebufferParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jlong paramAddress) {
    glGetFramebufferParameterivEXTPROC glGetFramebufferParameterivEXT = (glGetFramebufferParameterivEXTPROC)tlsGetFunction(563);
    intptr_t param = (intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetFramebufferParameterivEXT(framebuffer, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedCopyBufferSubDataEXT(JNIEnv *__env, jclass clazz, jint readBuffer, jint writeBuffer, jlong readOffset, jlong writeOffset, jlong size) {
    glNamedCopyBufferSubDataEXTPROC glNamedCopyBufferSubDataEXT = (glNamedCopyBufferSubDataEXTPROC)tlsGetFunction(1153);
    UNUSED_PARAM(clazz)
    glNamedCopyBufferSubDataEXT(readBuffer, writeBuffer, (intptr_t)readOffset, (intptr_t)writeOffset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTextureEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level) {
    glNamedFramebufferTextureEXTPROC glNamedFramebufferTextureEXT = (glNamedFramebufferTextureEXTPROC)tlsGetFunction(1167);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTextureEXT(framebuffer, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTextureLayerEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level, jint layer) {
    glNamedFramebufferTextureLayerEXTPROC glNamedFramebufferTextureLayerEXT = (glNamedFramebufferTextureLayerEXTPROC)tlsGetFunction(1170);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTextureLayerEXT(framebuffer, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTextureFaceEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level, jint face) {
    glNamedFramebufferTextureFaceEXTPROC glNamedFramebufferTextureFaceEXT = (glNamedFramebufferTextureFaceEXTPROC)tlsGetFunction(1168);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTextureFaceEXT(framebuffer, attachment, texture, level, face);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glTextureRenderbufferEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint renderbuffer) {
    glTextureRenderbufferEXTPROC glTextureRenderbufferEXT = (glTextureRenderbufferEXTPROC)tlsGetFunction(1708);
    UNUSED_PARAM(clazz)
    glTextureRenderbufferEXT(texture, target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexRenderbufferEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint renderbuffer) {
    glMultiTexRenderbufferEXTPROC glMultiTexRenderbufferEXT = (glMultiTexRenderbufferEXTPROC)tlsGetFunction(1128);
    UNUSED_PARAM(clazz)
    glMultiTexRenderbufferEXT(texunit, target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayVertexOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayVertexOffsetEXTPROC glVertexArrayVertexOffsetEXT = (glVertexArrayVertexOffsetEXTPROC)tlsGetFunction(1930);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexOffsetEXT(vaobj, buffer, size, type, stride, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayColorOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayColorOffsetEXTPROC glVertexArrayColorOffsetEXT = (glVertexArrayColorOffsetEXTPROC)tlsGetFunction(1909);
    UNUSED_PARAM(clazz)
    glVertexArrayColorOffsetEXT(vaobj, buffer, size, type, stride, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayEdgeFlagOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint stride, jlong offset) {
    glVertexArrayEdgeFlagOffsetEXTPROC glVertexArrayEdgeFlagOffsetEXT = (glVertexArrayEdgeFlagOffsetEXTPROC)tlsGetFunction(1910);
    UNUSED_PARAM(clazz)
    glVertexArrayEdgeFlagOffsetEXT(vaobj, buffer, stride, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayIndexOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint type, jint stride, jlong offset) {
    glVertexArrayIndexOffsetEXTPROC glVertexArrayIndexOffsetEXT = (glVertexArrayIndexOffsetEXTPROC)tlsGetFunction(1913);
    UNUSED_PARAM(clazz)
    glVertexArrayIndexOffsetEXT(vaobj, buffer, type, stride, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayNormalOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint type, jint stride, jlong offset) {
    glVertexArrayNormalOffsetEXTPROC glVertexArrayNormalOffsetEXT = (glVertexArrayNormalOffsetEXTPROC)tlsGetFunction(1915);
    UNUSED_PARAM(clazz)
    glVertexArrayNormalOffsetEXT(vaobj, buffer, type, stride, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayTexCoordOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayTexCoordOffsetEXTPROC glVertexArrayTexCoordOffsetEXT = (glVertexArrayTexCoordOffsetEXTPROC)tlsGetFunction(1918);
    UNUSED_PARAM(clazz)
    glVertexArrayTexCoordOffsetEXT(vaobj, buffer, size, type, stride, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayMultiTexCoordOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint texunit, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayMultiTexCoordOffsetEXTPROC glVertexArrayMultiTexCoordOffsetEXT = (glVertexArrayMultiTexCoordOffsetEXTPROC)tlsGetFunction(1914);
    UNUSED_PARAM(clazz)
    glVertexArrayMultiTexCoordOffsetEXT(vaobj, buffer, texunit, size, type, stride, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayFogCoordOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint type, jint stride, jlong offset) {
    glVertexArrayFogCoordOffsetEXTPROC glVertexArrayFogCoordOffsetEXT = (glVertexArrayFogCoordOffsetEXTPROC)tlsGetFunction(1912);
    UNUSED_PARAM(clazz)
    glVertexArrayFogCoordOffsetEXT(vaobj, buffer, type, stride, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArraySecondaryColorOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset) {
    glVertexArraySecondaryColorOffsetEXTPROC glVertexArraySecondaryColorOffsetEXT = (glVertexArraySecondaryColorOffsetEXTPROC)tlsGetFunction(1917);
    UNUSED_PARAM(clazz)
    glVertexArraySecondaryColorOffsetEXT(vaobj, buffer, size, type, stride, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayVertexAttribOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint index, jint size, jint type, jboolean normalized, jint stride, jlong offset) {
    glVertexArrayVertexAttribOffsetEXTPROC glVertexArrayVertexAttribOffsetEXT = (glVertexArrayVertexAttribOffsetEXTPROC)tlsGetFunction(1926);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexAttribOffsetEXT(vaobj, buffer, index, size, type, normalized, stride, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayVertexAttribIOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint index, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayVertexAttribIOffsetEXTPROC glVertexArrayVertexAttribIOffsetEXT = (glVertexArrayVertexAttribIOffsetEXTPROC)tlsGetFunction(1923);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexAttribIOffsetEXT(vaobj, buffer, index, size, type, stride, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glEnableVertexArrayEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint array) {
    glEnableVertexArrayEXTPROC glEnableVertexArrayEXT = (glEnableVertexArrayEXTPROC)tlsGetFunction(395);
    UNUSED_PARAM(clazz)
    glEnableVertexArrayEXT(vaobj, array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glDisableVertexArrayEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint array) {
    glDisableVertexArrayEXTPROC glDisableVertexArrayEXT = (glDisableVertexArrayEXTPROC)tlsGetFunction(345);
    UNUSED_PARAM(clazz)
    glDisableVertexArrayEXT(vaobj, array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glEnableVertexArrayAttribEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index) {
    glEnableVertexArrayAttribEXTPROC glEnableVertexArrayAttribEXT = (glEnableVertexArrayAttribEXTPROC)tlsGetFunction(394);
    UNUSED_PARAM(clazz)
    glEnableVertexArrayAttribEXT(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glDisableVertexArrayAttribEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index) {
    glDisableVertexArrayAttribEXTPROC glDisableVertexArrayAttribEXT = (glDisableVertexArrayAttribEXTPROC)tlsGetFunction(344);
    UNUSED_PARAM(clazz)
    glDisableVertexArrayAttribEXT(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayIntegervEXT__IIJ(JNIEnv *__env, jclass clazz, jint vaobj, jint pname, jlong paramAddress) {
    glGetVertexArrayIntegervEXTPROC glGetVertexArrayIntegervEXT = (glGetVertexArrayIntegervEXTPROC)tlsGetFunction(781);
    intptr_t param = (intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayIntegervEXT(vaobj, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayPointervEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint pname, jlong paramAddress) {
    glGetVertexArrayPointervEXTPROC glGetVertexArrayPointervEXT = (glGetVertexArrayPointervEXTPROC)tlsGetFunction(783);
    intptr_t param = (intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayPointervEXT(vaobj, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayIntegeri_1vEXT__IIIJ(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress) {
    glGetVertexArrayIntegeri_vEXTPROC glGetVertexArrayIntegeri_vEXT = (glGetVertexArrayIntegeri_vEXTPROC)tlsGetFunction(780);
    intptr_t param = (intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayIntegeri_vEXT(vaobj, index, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayPointeri_1vEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress) {
    glGetVertexArrayPointeri_vEXTPROC glGetVertexArrayPointeri_vEXT = (glGetVertexArrayPointeri_vEXTPROC)tlsGetFunction(782);
    intptr_t param = (intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayPointeri_vEXT(vaobj, index, pname, param);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMapNamedBufferRangeEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length, jint access) {
    glMapNamedBufferRangeEXTPROC glMapNamedBufferRangeEXT = (glMapNamedBufferRangeEXTPROC)tlsGetFunction(963);
    UNUSED_PARAM(clazz)
    return (jlong)glMapNamedBufferRangeEXT(buffer, (intptr_t)offset, (intptr_t)length, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glFlushMappedNamedBufferRangeEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length) {
    glFlushMappedNamedBufferRangeEXTPROC glFlushMappedNamedBufferRangeEXT = (glFlushMappedNamedBufferRangeEXTPROC)tlsGetFunction(432);
    UNUSED_PARAM(clazz)
    glFlushMappedNamedBufferRangeEXT(buffer, (intptr_t)offset, (intptr_t)length);
}

EXTERN_C_EXIT
