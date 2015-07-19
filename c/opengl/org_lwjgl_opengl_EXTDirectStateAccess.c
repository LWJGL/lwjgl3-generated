/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef void (APIENTRY *glClientAttribDefaultEXTPROC) (GLbitfield);
typedef void (APIENTRY *glPushClientAttribDefaultEXTPROC) (GLbitfield);
typedef void (APIENTRY *glMatrixLoadfEXTPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMatrixLoaddEXTPROC) (GLenum, const GLdouble *);
typedef void (APIENTRY *glMatrixMultfEXTPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMatrixMultdEXTPROC) (GLenum, const GLdouble *);
typedef void (APIENTRY *glMatrixLoadIdentityEXTPROC) (GLenum);
typedef void (APIENTRY *glMatrixRotatefEXTPROC) (GLenum, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glMatrixRotatedEXTPROC) (GLenum, GLdouble, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glMatrixScalefEXTPROC) (GLenum, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glMatrixScaledEXTPROC) (GLenum, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glMatrixTranslatefEXTPROC) (GLenum, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glMatrixTranslatedEXTPROC) (GLenum, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glMatrixOrthoEXTPROC) (GLenum, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glMatrixFrustumEXTPROC) (GLenum, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glMatrixPushEXTPROC) (GLenum);
typedef void (APIENTRY *glMatrixPopEXTPROC) (GLenum);
typedef void (APIENTRY *glTextureParameteriEXTPROC) (GLuint, GLenum, GLenum, GLint);
typedef void (APIENTRY *glTextureParameterivEXTPROC) (GLuint, GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glTextureParameterfEXTPROC) (GLuint, GLenum, GLenum, GLfloat);
typedef void (APIENTRY *glTextureParameterfvEXTPROC) (GLuint, GLenum, GLenum, const GLfloat *);
typedef void (APIENTRY *glTextureImage1DEXTPROC) (GLuint, GLenum, GLint, GLint, GLsizei, GLint, GLenum, GLenum, const void *);
typedef void (APIENTRY *glTextureImage2DEXTPROC) (GLuint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint, GLenum, GLenum, const void *);
typedef void (APIENTRY *glTextureSubImage1DEXTPROC) (GLuint, GLenum, GLint, GLint, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glTextureSubImage2DEXTPROC) (GLuint, GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glCopyTextureImage1DEXTPROC) (GLuint, GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLint);
typedef void (APIENTRY *glCopyTextureImage2DEXTPROC) (GLuint, GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint);
typedef void (APIENTRY *glCopyTextureSubImage1DEXTPROC) (GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei);
typedef void (APIENTRY *glCopyTextureSubImage2DEXTPROC) (GLuint, GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glGetTextureImageEXTPROC) (GLuint, GLenum, GLint, GLenum, GLenum, void *);
typedef void (APIENTRY *glGetTextureParameterfvEXTPROC) (GLuint, GLenum, GLenum, GLfloat *);
typedef void (APIENTRY *glGetTextureParameterivEXTPROC) (GLuint, GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetTextureLevelParameterfvEXTPROC) (GLuint, GLenum, GLint, GLenum, GLfloat *);
typedef void (APIENTRY *glGetTextureLevelParameterivEXTPROC) (GLuint, GLenum, GLint, GLenum, GLint *);
typedef void (APIENTRY *glTextureImage3DEXTPROC) (GLuint, GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, const void *);
typedef void (APIENTRY *glTextureSubImage3DEXTPROC) (GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glCopyTextureSubImage3DEXTPROC) (GLuint, GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glBindMultiTextureEXTPROC) (GLenum, GLenum, GLuint);
typedef void (APIENTRY *glMultiTexCoordPointerEXTPROC) (GLenum, GLint, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glMultiTexEnvfEXTPROC) (GLenum, GLenum, GLenum, GLfloat);
typedef void (APIENTRY *glMultiTexEnvfvEXTPROC) (GLenum, GLenum, GLenum, const GLfloat *);
typedef void (APIENTRY *glMultiTexEnviEXTPROC) (GLenum, GLenum, GLenum, GLint);
typedef void (APIENTRY *glMultiTexEnvivEXTPROC) (GLenum, GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glMultiTexGendEXTPROC) (GLenum, GLenum, GLenum, GLdouble);
typedef void (APIENTRY *glMultiTexGendvEXTPROC) (GLenum, GLenum, GLenum, const GLdouble *);
typedef void (APIENTRY *glMultiTexGenfEXTPROC) (GLenum, GLenum, GLenum, GLfloat);
typedef void (APIENTRY *glMultiTexGenfvEXTPROC) (GLenum, GLenum, GLenum, const GLfloat *);
typedef void (APIENTRY *glMultiTexGeniEXTPROC) (GLenum, GLenum, GLenum, GLint);
typedef void (APIENTRY *glMultiTexGenivEXTPROC) (GLenum, GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glGetMultiTexEnvfvEXTPROC) (GLenum, GLenum, GLenum, GLfloat *);
typedef void (APIENTRY *glGetMultiTexEnvivEXTPROC) (GLenum, GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetMultiTexGendvEXTPROC) (GLenum, GLenum, GLenum, GLdouble *);
typedef void (APIENTRY *glGetMultiTexGenfvEXTPROC) (GLenum, GLenum, GLenum, GLfloat *);
typedef void (APIENTRY *glGetMultiTexGenivEXTPROC) (GLenum, GLenum, GLenum, GLint *);
typedef void (APIENTRY *glMultiTexParameteriEXTPROC) (GLenum, GLenum, GLenum, GLint);
typedef void (APIENTRY *glMultiTexParameterivEXTPROC) (GLenum, GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glMultiTexParameterfEXTPROC) (GLenum, GLenum, GLenum, GLfloat);
typedef void (APIENTRY *glMultiTexParameterfvEXTPROC) (GLenum, GLenum, GLenum, const GLfloat *);
typedef void (APIENTRY *glMultiTexImage1DEXTPROC) (GLenum, GLenum, GLint, GLint, GLsizei, GLint, GLenum, GLenum, const void *);
typedef void (APIENTRY *glMultiTexImage2DEXTPROC) (GLenum, GLenum, GLint, GLint, GLsizei, GLsizei, GLint, GLenum, GLenum, const void *);
typedef void (APIENTRY *glMultiTexSubImage1DEXTPROC) (GLenum, GLenum, GLint, GLint, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glMultiTexSubImage2DEXTPROC) (GLenum, GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glCopyMultiTexImage1DEXTPROC) (GLenum, GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLint);
typedef void (APIENTRY *glCopyMultiTexImage2DEXTPROC) (GLenum, GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint);
typedef void (APIENTRY *glCopyMultiTexSubImage1DEXTPROC) (GLenum, GLenum, GLint, GLint, GLint, GLint, GLsizei);
typedef void (APIENTRY *glCopyMultiTexSubImage2DEXTPROC) (GLenum, GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glGetMultiTexImageEXTPROC) (GLenum, GLenum, GLint, GLenum, GLenum, void *);
typedef void (APIENTRY *glGetMultiTexParameterfvEXTPROC) (GLenum, GLenum, GLenum, GLfloat *);
typedef void (APIENTRY *glGetMultiTexParameterivEXTPROC) (GLenum, GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetMultiTexLevelParameterfvEXTPROC) (GLenum, GLenum, GLint, GLenum, GLfloat *);
typedef void (APIENTRY *glGetMultiTexLevelParameterivEXTPROC) (GLenum, GLenum, GLint, GLenum, GLint *);
typedef void (APIENTRY *glMultiTexImage3DEXTPROC) (GLenum, GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, const void *);
typedef void (APIENTRY *glMultiTexSubImage3DEXTPROC) (GLenum, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, const void *);
typedef void (APIENTRY *glCopyMultiTexSubImage3DEXTPROC) (GLenum, GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef void (APIENTRY *glEnableClientStateIndexedEXTPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDisableClientStateIndexedEXTPROC) (GLenum, GLuint);
typedef void (APIENTRY *glEnableClientStateiEXTPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDisableClientStateiEXTPROC) (GLenum, GLuint);
typedef void (APIENTRY *glGetFloatIndexedvEXTPROC) (GLenum, GLuint, GLfloat *);
typedef void (APIENTRY *glGetDoubleIndexedvEXTPROC) (GLenum, GLuint, GLdouble *);
typedef void (APIENTRY *glGetPointerIndexedvEXTPROC) (GLenum, GLuint, void **);
typedef void (APIENTRY *glGetFloati_vEXTPROC) (GLenum, GLuint, GLfloat *);
typedef void (APIENTRY *glGetDoublei_vEXTPROC) (GLenum, GLuint, GLdouble *);
typedef void (APIENTRY *glGetPointeri_vEXTPROC) (GLenum, GLuint, void **);
typedef void (APIENTRY *glEnableIndexedEXTPROC) (GLenum, GLuint);
typedef void (APIENTRY *glDisableIndexedEXTPROC) (GLenum, GLuint);
typedef GLboolean (APIENTRY *glIsEnabledIndexedEXTPROC) (GLenum, GLuint);
typedef void (APIENTRY *glGetIntegerIndexedvEXTPROC) (GLenum, GLuint, GLint *);
typedef void (APIENTRY *glGetBooleanIndexedvEXTPROC) (GLenum, GLuint, GLboolean *);
typedef void (APIENTRY *glNamedProgramStringEXTPROC) (GLuint, GLenum, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glNamedProgramLocalParameter4dEXTPROC) (GLuint, GLenum, GLuint, GLdouble, GLdouble, GLdouble, GLdouble);
typedef void (APIENTRY *glNamedProgramLocalParameter4dvEXTPROC) (GLuint, GLenum, GLuint, const GLdouble *);
typedef void (APIENTRY *glNamedProgramLocalParameter4fEXTPROC) (GLuint, GLenum, GLuint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glNamedProgramLocalParameter4fvEXTPROC) (GLuint, GLenum, GLuint, const GLfloat *);
typedef void (APIENTRY *glGetNamedProgramLocalParameterdvEXTPROC) (GLuint, GLenum, GLuint, GLdouble *);
typedef void (APIENTRY *glGetNamedProgramLocalParameterfvEXTPROC) (GLuint, GLenum, GLuint, GLfloat *);
typedef void (APIENTRY *glGetNamedProgramivEXTPROC) (GLuint, GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetNamedProgramStringEXTPROC) (GLuint, GLenum, GLenum, void *);
typedef void (APIENTRY *glCompressedTextureImage3DEXTPROC) (GLuint, GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTextureImage2DEXTPROC) (GLuint, GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTextureImage1DEXTPROC) (GLuint, GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTextureSubImage3DEXTPROC) (GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTextureSubImage2DEXTPROC) (GLuint, GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glCompressedTextureSubImage1DEXTPROC) (GLuint, GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glGetCompressedTextureImageEXTPROC) (GLuint, GLenum, GLint, void *);
typedef void (APIENTRY *glCompressedMultiTexImage3DEXTPROC) (GLenum, GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedMultiTexImage2DEXTPROC) (GLenum, GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedMultiTexImage1DEXTPROC) (GLenum, GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, const void *);
typedef void (APIENTRY *glCompressedMultiTexSubImage3DEXTPROC) (GLenum, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glCompressedMultiTexSubImage2DEXTPROC) (GLenum, GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glCompressedMultiTexSubImage1DEXTPROC) (GLenum, GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, const void *);
typedef void (APIENTRY *glGetCompressedMultiTexImageEXTPROC) (GLenum, GLenum, GLint, void *);
typedef void (APIENTRY *glMatrixLoadTransposefEXTPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMatrixLoadTransposedEXTPROC) (GLenum, const GLdouble *);
typedef void (APIENTRY *glMatrixMultTransposefEXTPROC) (GLenum, const GLfloat *);
typedef void (APIENTRY *glMatrixMultTransposedEXTPROC) (GLenum, const GLdouble *);
typedef void (APIENTRY *glNamedBufferDataEXTPROC) (GLuint, GLsizeiptr, const void *, GLenum);
typedef void (APIENTRY *glNamedBufferSubDataEXTPROC) (GLuint, GLintptr, GLsizeiptr, const void *);
typedef void * (APIENTRY *glMapNamedBufferEXTPROC) (GLuint, GLenum);
typedef GLboolean (APIENTRY *glUnmapNamedBufferEXTPROC) (GLuint);
typedef void (APIENTRY *glGetNamedBufferParameterivEXTPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetNamedBufferSubDataEXTPROC) (GLuint, GLintptr, GLsizeiptr, void *);
typedef void (APIENTRY *glProgramUniform1fEXTPROC) (GLuint, GLint, GLfloat);
typedef void (APIENTRY *glProgramUniform2fEXTPROC) (GLuint, GLint, GLfloat, GLfloat);
typedef void (APIENTRY *glProgramUniform3fEXTPROC) (GLuint, GLint, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glProgramUniform4fEXTPROC) (GLuint, GLint, GLfloat, GLfloat, GLfloat, GLfloat);
typedef void (APIENTRY *glProgramUniform1iEXTPROC) (GLuint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform2iEXTPROC) (GLuint, GLint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform3iEXTPROC) (GLuint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform4iEXTPROC) (GLuint, GLint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glProgramUniform1fvEXTPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniform2fvEXTPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniform3fvEXTPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniform4fvEXTPROC) (GLuint, GLint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glProgramUniform1ivEXTPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniform2ivEXTPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniform3ivEXTPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniform4ivEXTPROC) (GLuint, GLint, GLsizei, const GLint *);
typedef void (APIENTRY *glProgramUniformMatrix2fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix2x3fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3x2fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix2x4fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4x2fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix3x4fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glProgramUniformMatrix4x3fvEXTPROC) (GLuint, GLint, GLsizei, GLboolean, const GLfloat *);
typedef void (APIENTRY *glTextureBufferEXTPROC) (GLuint, GLenum, GLenum, GLuint);
typedef void (APIENTRY *glMultiTexBufferEXTPROC) (GLenum, GLenum, GLenum, GLuint);
typedef void (APIENTRY *glTextureParameterIivEXTPROC) (GLuint, GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glTextureParameterIuivEXTPROC) (GLuint, GLenum, GLenum, const GLuint *);
typedef void (APIENTRY *glGetTextureParameterIivEXTPROC) (GLuint, GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetTextureParameterIuivEXTPROC) (GLuint, GLenum, GLenum, GLuint *);
typedef void (APIENTRY *glMultiTexParameterIivEXTPROC) (GLenum, GLenum, GLenum, const GLint *);
typedef void (APIENTRY *glMultiTexParameterIuivEXTPROC) (GLenum, GLenum, GLenum, const GLuint *);
typedef void (APIENTRY *glGetMultiTexParameterIivEXTPROC) (GLenum, GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGetMultiTexParameterIuivEXTPROC) (GLenum, GLenum, GLenum, GLuint *);
typedef void (APIENTRY *glProgramUniform1uiEXTPROC) (GLuint, GLint, GLuint);
typedef void (APIENTRY *glProgramUniform2uiEXTPROC) (GLuint, GLint, GLuint, GLuint);
typedef void (APIENTRY *glProgramUniform3uiEXTPROC) (GLuint, GLint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glProgramUniform4uiEXTPROC) (GLuint, GLint, GLuint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glProgramUniform1uivEXTPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glProgramUniform2uivEXTPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glProgramUniform3uivEXTPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glProgramUniform4uivEXTPROC) (GLuint, GLint, GLsizei, const GLuint *);
typedef void (APIENTRY *glNamedProgramLocalParameters4fvEXTPROC) (GLuint, GLenum, GLuint, GLsizei, const GLfloat *);
typedef void (APIENTRY *glNamedProgramLocalParameterI4iEXTPROC) (GLuint, GLenum, GLuint, GLint, GLint, GLint, GLint);
typedef void (APIENTRY *glNamedProgramLocalParameterI4ivEXTPROC) (GLuint, GLenum, GLuint, const GLint *);
typedef void (APIENTRY *glNamedProgramLocalParametersI4ivEXTPROC) (GLuint, GLenum, GLuint, GLsizei, const GLint *);
typedef void (APIENTRY *glNamedProgramLocalParameterI4uiEXTPROC) (GLuint, GLenum, GLuint, GLuint, GLuint, GLuint, GLuint);
typedef void (APIENTRY *glNamedProgramLocalParameterI4uivEXTPROC) (GLuint, GLenum, GLuint, const GLuint *);
typedef void (APIENTRY *glNamedProgramLocalParametersI4uivEXTPROC) (GLuint, GLenum, GLuint, GLsizei, const GLuint *);
typedef void (APIENTRY *glGetNamedProgramLocalParameterIivEXTPROC) (GLuint, GLenum, GLuint, GLint *);
typedef void (APIENTRY *glGetNamedProgramLocalParameterIuivEXTPROC) (GLuint, GLenum, GLuint, GLuint *);
typedef void (APIENTRY *glNamedRenderbufferStorageEXTPROC) (GLuint, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glGetNamedRenderbufferParameterivEXTPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glNamedRenderbufferStorageMultisampleEXTPROC) (GLuint, GLsizei, GLenum, GLsizei, GLsizei);
typedef void (APIENTRY *glNamedRenderbufferStorageMultisampleCoverageEXTPROC) (GLuint, GLsizei, GLsizei, GLenum, GLsizei, GLsizei);
typedef GLenum (APIENTRY *glCheckNamedFramebufferStatusEXTPROC) (GLuint, GLenum);
typedef void (APIENTRY *glNamedFramebufferTexture1DEXTPROC) (GLuint, GLenum, GLenum, GLuint, GLint);
typedef void (APIENTRY *glNamedFramebufferTexture2DEXTPROC) (GLuint, GLenum, GLenum, GLuint, GLint);
typedef void (APIENTRY *glNamedFramebufferTexture3DEXTPROC) (GLuint, GLenum, GLenum, GLuint, GLint, GLint);
typedef void (APIENTRY *glNamedFramebufferRenderbufferEXTPROC) (GLuint, GLenum, GLenum, GLuint);
typedef void (APIENTRY *glGetNamedFramebufferAttachmentParameterivEXTPROC) (GLuint, GLenum, GLenum, GLint *);
typedef void (APIENTRY *glGenerateTextureMipmapEXTPROC) (GLuint, GLenum);
typedef void (APIENTRY *glGenerateMultiTexMipmapEXTPROC) (GLenum, GLenum);
typedef void (APIENTRY *glFramebufferDrawBufferEXTPROC) (GLuint, GLenum);
typedef void (APIENTRY *glFramebufferDrawBuffersEXTPROC) (GLuint, GLsizei, const GLenum *);
typedef void (APIENTRY *glFramebufferReadBufferEXTPROC) (GLuint, GLenum);
typedef void (APIENTRY *glGetFramebufferParameterivEXTPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glNamedCopyBufferSubDataEXTPROC) (GLuint, GLuint, GLintptr, GLintptr, GLsizeiptr);
typedef void (APIENTRY *glNamedFramebufferTextureEXTPROC) (GLuint, GLenum, GLuint, GLint);
typedef void (APIENTRY *glNamedFramebufferTextureLayerEXTPROC) (GLuint, GLenum, GLuint, GLint, GLint);
typedef void (APIENTRY *glNamedFramebufferTextureFaceEXTPROC) (GLuint, GLenum, GLuint, GLint, GLenum);
typedef void (APIENTRY *glTextureRenderbufferEXTPROC) (GLuint, GLenum, GLuint);
typedef void (APIENTRY *glMultiTexRenderbufferEXTPROC) (GLenum, GLenum, GLuint);
typedef void (APIENTRY *glVertexArrayVertexOffsetEXTPROC) (GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr);
typedef void (APIENTRY *glVertexArrayColorOffsetEXTPROC) (GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr);
typedef void (APIENTRY *glVertexArrayEdgeFlagOffsetEXTPROC) (GLuint, GLuint, GLsizei, GLintptr);
typedef void (APIENTRY *glVertexArrayIndexOffsetEXTPROC) (GLuint, GLuint, GLenum, GLsizei, GLintptr);
typedef void (APIENTRY *glVertexArrayNormalOffsetEXTPROC) (GLuint, GLuint, GLenum, GLsizei, GLintptr);
typedef void (APIENTRY *glVertexArrayTexCoordOffsetEXTPROC) (GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr);
typedef void (APIENTRY *glVertexArrayMultiTexCoordOffsetEXTPROC) (GLuint, GLuint, GLenum, GLint, GLenum, GLsizei, GLintptr);
typedef void (APIENTRY *glVertexArrayFogCoordOffsetEXTPROC) (GLuint, GLuint, GLenum, GLsizei, GLintptr);
typedef void (APIENTRY *glVertexArraySecondaryColorOffsetEXTPROC) (GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr);
typedef void (APIENTRY *glVertexArrayVertexAttribOffsetEXTPROC) (GLuint, GLuint, GLuint, GLint, GLenum, GLboolean, GLsizei, GLintptr);
typedef void (APIENTRY *glVertexArrayVertexAttribIOffsetEXTPROC) (GLuint, GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr);
typedef void (APIENTRY *glEnableVertexArrayEXTPROC) (GLuint, GLenum);
typedef void (APIENTRY *glDisableVertexArrayEXTPROC) (GLuint, GLenum);
typedef void (APIENTRY *glEnableVertexArrayAttribEXTPROC) (GLuint, GLuint);
typedef void (APIENTRY *glDisableVertexArrayAttribEXTPROC) (GLuint, GLuint);
typedef void (APIENTRY *glGetVertexArrayIntegervEXTPROC) (GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetVertexArrayPointervEXTPROC) (GLuint, GLenum, void **);
typedef void (APIENTRY *glGetVertexArrayIntegeri_vEXTPROC) (GLuint, GLuint, GLenum, GLint *);
typedef void (APIENTRY *glGetVertexArrayPointeri_vEXTPROC) (GLuint, GLuint, GLenum, void **);
typedef void * (APIENTRY *glMapNamedBufferRangeEXTPROC) (GLuint, GLintptr, GLsizeiptr, GLbitfield);
typedef void (APIENTRY *glFlushMappedNamedBufferRangeEXTPROC) (GLuint, GLintptr, GLsizeiptr);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglClientAttribDefaultEXT(JNIEnv *__env, jclass clazz, jint mask, jlong __functionAddress) {
	glClientAttribDefaultEXTPROC glClientAttribDefaultEXT = (glClientAttribDefaultEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClientAttribDefaultEXT(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglPushClientAttribDefaultEXT(JNIEnv *__env, jclass clazz, jint mask, jlong __functionAddress) {
	glPushClientAttribDefaultEXTPROC glPushClientAttribDefaultEXT = (glPushClientAttribDefaultEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPushClientAttribDefaultEXT(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoadfEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMatrixLoadfEXTPROC glMatrixLoadfEXT = (glMatrixLoadfEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixLoadfEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoaddEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLdouble *m = (const GLdouble *)(intptr_t)mAddress;
	glMatrixLoaddEXTPROC glMatrixLoaddEXT = (glMatrixLoaddEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixLoaddEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultfEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMatrixMultfEXTPROC glMatrixMultfEXT = (glMatrixMultfEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixMultfEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultdEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLdouble *m = (const GLdouble *)(intptr_t)mAddress;
	glMatrixMultdEXTPROC glMatrixMultdEXT = (glMatrixMultdEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixMultdEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoadIdentityEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jlong __functionAddress) {
	glMatrixLoadIdentityEXTPROC glMatrixLoadIdentityEXT = (glMatrixLoadIdentityEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixLoadIdentityEXT(matrixMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixRotatefEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jfloat angle, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glMatrixRotatefEXTPROC glMatrixRotatefEXT = (glMatrixRotatefEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixRotatefEXT(matrixMode, angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixRotatedEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble angle, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glMatrixRotatedEXTPROC glMatrixRotatedEXT = (glMatrixRotatedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixRotatedEXT(matrixMode, angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixScalefEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glMatrixScalefEXTPROC glMatrixScalefEXT = (glMatrixScalefEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixScalefEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixScaledEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glMatrixScaledEXTPROC glMatrixScaledEXT = (glMatrixScaledEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixScaledEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixTranslatefEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glMatrixTranslatefEXTPROC glMatrixTranslatefEXT = (glMatrixTranslatefEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixTranslatefEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixTranslatedEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glMatrixTranslatedEXTPROC glMatrixTranslatedEXT = (glMatrixTranslatedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixTranslatedEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixOrthoEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f, jlong __functionAddress) {
	glMatrixOrthoEXTPROC glMatrixOrthoEXT = (glMatrixOrthoEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixOrthoEXT(matrixMode, l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixFrustumEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f, jlong __functionAddress) {
	glMatrixFrustumEXTPROC glMatrixFrustumEXT = (glMatrixFrustumEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixFrustumEXT(matrixMode, l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixPushEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jlong __functionAddress) {
	glMatrixPushEXTPROC glMatrixPushEXT = (glMatrixPushEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixPushEXT(matrixMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixPopEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jlong __functionAddress) {
	glMatrixPopEXTPROC glMatrixPopEXT = (glMatrixPopEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixPopEXT(matrixMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameteriEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jint param, jlong __functionAddress) {
	glTextureParameteriEXTPROC glTextureParameteriEXT = (glTextureParameteriEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameteriEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterivEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramAddress, jlong __functionAddress) {
	const GLint *param = (const GLint *)(intptr_t)paramAddress;
	glTextureParameterivEXTPROC glTextureParameterivEXT = (glTextureParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameterivEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterfEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jfloat param, jlong __functionAddress) {
	glTextureParameterfEXTPROC glTextureParameterfEXT = (glTextureParameterfEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameterfEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterfvEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramAddress, jlong __functionAddress) {
	const GLfloat *param = (const GLfloat *)(intptr_t)paramAddress;
	glTextureParameterfvEXTPROC glTextureParameterfvEXT = (glTextureParameterfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameterfvEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTextureImage1DEXTPROC glTextureImage1DEXT = (glTextureImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTextureImage2DEXTPROC glTextureImage2DEXT = (glTextureImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTextureSubImage1DEXTPROC glTextureSubImage1DEXT = (glTextureSubImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTextureSubImage2DEXTPROC glTextureSubImage2DEXT = (glTextureSubImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCopyTextureImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint border, jlong __functionAddress) {
	glCopyTextureImage1DEXTPROC glCopyTextureImage1DEXT = (glCopyTextureImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTextureImage1DEXT(texture, target, level, internalformat, x, y, width, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCopyTextureImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border, jlong __functionAddress) {
	glCopyTextureImage2DEXTPROC glCopyTextureImage2DEXT = (glCopyTextureImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTextureImage2DEXT(texture, target, level, internalformat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCopyTextureSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint x, jint y, jint width, jlong __functionAddress) {
	glCopyTextureSubImage1DEXTPROC glCopyTextureSubImage1DEXT = (glCopyTextureSubImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTextureSubImage1DEXT(texture, target, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCopyTextureSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyTextureSubImage2DEXTPROC glCopyTextureSubImage2DEXT = (glCopyTextureSubImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureImageEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	void *pixels = (void *)(intptr_t)pixelsAddress;
	glGetTextureImageEXTPROC glGetTextureImageEXT = (glGetTextureImageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureImageEXT(texture, target, level, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterfvEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetTextureParameterfvEXTPROC glGetTextureParameterfvEXT = (glGetTextureParameterfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureParameterfvEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterivEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTextureParameterivEXTPROC glGetTextureParameterivEXT = (glGetTextureParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureParameterivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureLevelParameterfvEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetTextureLevelParameterfvEXTPROC glGetTextureLevelParameterfvEXT = (glGetTextureLevelParameterfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureLevelParameterfvEXT(texture, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureLevelParameterivEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTextureLevelParameterivEXTPROC glGetTextureLevelParameterivEXT = (glGetTextureLevelParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureLevelParameterivEXT(texture, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureImage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTextureImage3DEXTPROC glTextureImage3DEXT = (glTextureImage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glTextureSubImage3DEXTPROC glTextureSubImage3DEXT = (glTextureSubImage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCopyTextureSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyTextureSubImage3DEXTPROC glCopyTextureSubImage3DEXT = (glCopyTextureSubImage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglBindMultiTextureEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint texture, jlong __functionAddress) {
	glBindMultiTextureEXTPROC glBindMultiTextureEXT = (glBindMultiTextureEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindMultiTextureEXT(texunit, target, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexCoordPointerEXT(JNIEnv *__env, jclass clazz, jint texunit, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const void *pointer = (const void *)(intptr_t)pointerAddress;
	glMultiTexCoordPointerEXTPROC glMultiTexCoordPointerEXT = (glMultiTexCoordPointerEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexCoordPointerEXT(texunit, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexEnvfEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jfloat param, jlong __functionAddress) {
	glMultiTexEnvfEXTPROC glMultiTexEnvfEXT = (glMultiTexEnvfEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexEnvfEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexEnvfvEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glMultiTexEnvfvEXTPROC glMultiTexEnvfvEXT = (glMultiTexEnvfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexEnvfvEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexEnviEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jint param, jlong __functionAddress) {
	glMultiTexEnviEXTPROC glMultiTexEnviEXT = (glMultiTexEnviEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexEnviEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexEnvivEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glMultiTexEnvivEXTPROC glMultiTexEnvivEXT = (glMultiTexEnvivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexEnvivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGendEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jdouble param, jlong __functionAddress) {
	glMultiTexGendEXTPROC glMultiTexGendEXT = (glMultiTexGendEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexGendEXT(texunit, coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGendvEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLdouble *params = (const GLdouble *)(intptr_t)paramsAddress;
	glMultiTexGendvEXTPROC glMultiTexGendvEXT = (glMultiTexGendvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexGendvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGenfEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jfloat param, jlong __functionAddress) {
	glMultiTexGenfEXTPROC glMultiTexGenfEXT = (glMultiTexGenfEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexGenfEXT(texunit, coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGenfvEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glMultiTexGenfvEXTPROC glMultiTexGenfvEXT = (glMultiTexGenfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexGenfvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGeniEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jint param, jlong __functionAddress) {
	glMultiTexGeniEXTPROC glMultiTexGeniEXT = (glMultiTexGeniEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexGeniEXT(texunit, coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGenivEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glMultiTexGenivEXTPROC glMultiTexGenivEXT = (glMultiTexGenivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexGenivEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexEnvfvEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetMultiTexEnvfvEXTPROC glGetMultiTexEnvfvEXT = (glGetMultiTexEnvfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexEnvfvEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexEnvivEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetMultiTexEnvivEXTPROC glGetMultiTexEnvivEXT = (glGetMultiTexEnvivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexEnvivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexGendvEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetMultiTexGendvEXTPROC glGetMultiTexGendvEXT = (glGetMultiTexGendvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexGendvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexGenfvEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetMultiTexGenfvEXTPROC glGetMultiTexGenfvEXT = (glGetMultiTexGenfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexGenfvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexGenivEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetMultiTexGenivEXTPROC glGetMultiTexGenivEXT = (glGetMultiTexGenivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexGenivEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameteriEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jint param, jlong __functionAddress) {
	glMultiTexParameteriEXTPROC glMultiTexParameteriEXT = (glMultiTexParameteriEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexParameteriEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterivEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramAddress, jlong __functionAddress) {
	const GLint *param = (const GLint *)(intptr_t)paramAddress;
	glMultiTexParameterivEXTPROC glMultiTexParameterivEXT = (glMultiTexParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexParameterivEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterfEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jfloat param, jlong __functionAddress) {
	glMultiTexParameterfEXTPROC glMultiTexParameterfEXT = (glMultiTexParameterfEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexParameterfEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterfvEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramAddress, jlong __functionAddress) {
	const GLfloat *param = (const GLfloat *)(intptr_t)paramAddress;
	glMultiTexParameterfvEXTPROC glMultiTexParameterfvEXT = (glMultiTexParameterfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexParameterfvEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glMultiTexImage1DEXTPROC glMultiTexImage1DEXT = (glMultiTexImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glMultiTexImage2DEXTPROC glMultiTexImage2DEXT = (glMultiTexImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glMultiTexSubImage1DEXTPROC glMultiTexSubImage1DEXT = (glMultiTexSubImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glMultiTexSubImage2DEXTPROC glMultiTexSubImage2DEXT = (glMultiTexSubImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCopyMultiTexImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint border, jlong __functionAddress) {
	glCopyMultiTexImage1DEXTPROC glCopyMultiTexImage1DEXT = (glCopyMultiTexImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyMultiTexImage1DEXT(texunit, target, level, internalformat, x, y, width, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCopyMultiTexImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border, jlong __functionAddress) {
	glCopyMultiTexImage2DEXTPROC glCopyMultiTexImage2DEXT = (glCopyMultiTexImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyMultiTexImage2DEXT(texunit, target, level, internalformat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCopyMultiTexSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint x, jint y, jint width, jlong __functionAddress) {
	glCopyMultiTexSubImage1DEXTPROC glCopyMultiTexSubImage1DEXT = (glCopyMultiTexSubImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyMultiTexSubImage1DEXT(texunit, target, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCopyMultiTexSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyMultiTexSubImage2DEXTPROC glCopyMultiTexSubImage2DEXT = (glCopyMultiTexSubImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexImageEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	void *pixels = (void *)(intptr_t)pixelsAddress;
	glGetMultiTexImageEXTPROC glGetMultiTexImageEXT = (glGetMultiTexImageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexImageEXT(texunit, target, level, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterfvEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetMultiTexParameterfvEXTPROC glGetMultiTexParameterfvEXT = (glGetMultiTexParameterfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexParameterfvEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterivEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetMultiTexParameterivEXTPROC glGetMultiTexParameterivEXT = (glGetMultiTexParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexParameterivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexLevelParameterfvEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetMultiTexLevelParameterfvEXTPROC glGetMultiTexLevelParameterfvEXT = (glGetMultiTexLevelParameterfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexLevelParameterivEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetMultiTexLevelParameterivEXTPROC glGetMultiTexLevelParameterivEXT = (glGetMultiTexLevelParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexLevelParameterivEXT(texunit, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexImage3DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glMultiTexImage3DEXTPROC glMultiTexImage3DEXT = (glMultiTexImage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const void *pixels = (const void *)(intptr_t)pixelsAddress;
	glMultiTexSubImage3DEXTPROC glMultiTexSubImage3DEXT = (glMultiTexSubImage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCopyMultiTexSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyMultiTexSubImage3DEXTPROC glCopyMultiTexSubImage3DEXT = (glCopyMultiTexSubImage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglEnableClientStateIndexedEXT(JNIEnv *__env, jclass clazz, jint array, jint index, jlong __functionAddress) {
	glEnableClientStateIndexedEXTPROC glEnableClientStateIndexedEXT = (glEnableClientStateIndexedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableClientStateIndexedEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglDisableClientStateIndexedEXT(JNIEnv *__env, jclass clazz, jint array, jint index, jlong __functionAddress) {
	glDisableClientStateIndexedEXTPROC glDisableClientStateIndexedEXT = (glDisableClientStateIndexedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableClientStateIndexedEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglEnableClientStateiEXT(JNIEnv *__env, jclass clazz, jint array, jint index, jlong __functionAddress) {
	glEnableClientStateiEXTPROC glEnableClientStateiEXT = (glEnableClientStateiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableClientStateiEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglDisableClientStateiEXT(JNIEnv *__env, jclass clazz, jint array, jint index, jlong __functionAddress) {
	glDisableClientStateiEXTPROC glDisableClientStateiEXT = (glDisableClientStateiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableClientStateiEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetFloatIndexedvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetFloatIndexedvEXTPROC glGetFloatIndexedvEXT = (glGetFloatIndexedvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFloatIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetDoubleIndexedvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetDoubleIndexedvEXTPROC glGetDoubleIndexedvEXT = (glGetDoubleIndexedvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetDoubleIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetPointerIndexedvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	void **params = (void **)(intptr_t)paramsAddress;
	glGetPointerIndexedvEXTPROC glGetPointerIndexedvEXT = (glGetPointerIndexedvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPointerIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetFloati_1vEXT(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetFloati_vEXTPROC glGetFloati_vEXT = (glGetFloati_vEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFloati_vEXT(pname, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetDoublei_1vEXT(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetDoublei_vEXTPROC glGetDoublei_vEXT = (glGetDoublei_vEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetDoublei_vEXT(pname, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetPointeri_1vEXT(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong paramsAddress, jlong __functionAddress) {
	void **params = (void **)(intptr_t)paramsAddress;
	glGetPointeri_vEXTPROC glGetPointeri_vEXT = (glGetPointeri_vEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPointeri_vEXT(pname, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglEnableIndexedEXT(JNIEnv *__env, jclass clazz, jint cap, jint index, jlong __functionAddress) {
	glEnableIndexedEXTPROC glEnableIndexedEXT = (glEnableIndexedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableIndexedEXT(cap, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglDisableIndexedEXT(JNIEnv *__env, jclass clazz, jint cap, jint index, jlong __functionAddress) {
	glDisableIndexedEXTPROC glDisableIndexedEXT = (glDisableIndexedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableIndexedEXT(cap, index);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglIsEnabledIndexedEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong __functionAddress) {
	glIsEnabledIndexedEXTPROC glIsEnabledIndexedEXT = (glIsEnabledIndexedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsEnabledIndexedEXT(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetIntegerIndexedvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetIntegerIndexedvEXTPROC glGetIntegerIndexedvEXT = (glGetIntegerIndexedvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetIntegerIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetBooleanIndexedvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLboolean *params = (GLboolean *)(intptr_t)paramsAddress;
	glGetBooleanIndexedvEXTPROC glGetBooleanIndexedvEXT = (glGetBooleanIndexedvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBooleanIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramStringEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint format, jint len, jlong stringAddress, jlong __functionAddress) {
	const void *string = (const void *)(intptr_t)stringAddress;
	glNamedProgramStringEXTPROC glNamedProgramStringEXT = (glNamedProgramStringEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramStringEXT(program, target, format, len, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameter4dEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glNamedProgramLocalParameter4dEXTPROC glNamedProgramLocalParameter4dEXT = (glNamedProgramLocalParameter4dEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramLocalParameter4dEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameter4dvEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	const GLdouble *params = (const GLdouble *)(intptr_t)paramsAddress;
	glNamedProgramLocalParameter4dvEXTPROC glNamedProgramLocalParameter4dvEXT = (glNamedProgramLocalParameter4dvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramLocalParameter4dvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameter4fEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jfloat x, jfloat y, jfloat z, jfloat w, jlong __functionAddress) {
	glNamedProgramLocalParameter4fEXTPROC glNamedProgramLocalParameter4fEXT = (glNamedProgramLocalParameter4fEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramLocalParameter4fEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameter4fvEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glNamedProgramLocalParameter4fvEXTPROC glNamedProgramLocalParameter4fvEXT = (glNamedProgramLocalParameter4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramLocalParameter4fvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterdvEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetNamedProgramLocalParameterdvEXTPROC glGetNamedProgramLocalParameterdvEXT = (glGetNamedProgramLocalParameterdvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedProgramLocalParameterdvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterfvEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetNamedProgramLocalParameterfvEXTPROC glGetNamedProgramLocalParameterfvEXT = (glGetNamedProgramLocalParameterfvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedProgramLocalParameterfvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramivEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetNamedProgramivEXTPROC glGetNamedProgramivEXT = (glGetNamedProgramivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedProgramivEXT(program, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramStringEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint pname, jlong stringAddress, jlong __functionAddress) {
	void *string = (void *)(intptr_t)stringAddress;
	glGetNamedProgramStringEXTPROC glGetNamedProgramStringEXT = (glGetNamedProgramStringEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedProgramStringEXT(program, target, pname, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureImage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTextureImage3DEXTPROC glCompressedTextureImage3DEXT = (glCompressedTextureImage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTextureImage2DEXTPROC glCompressedTextureImage2DEXT = (glCompressedTextureImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTextureImage1DEXTPROC glCompressedTextureImage1DEXT = (glCompressedTextureImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTextureSubImage3DEXTPROC glCompressedTextureSubImage3DEXT = (glCompressedTextureSubImage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTextureSubImage2DEXTPROC glCompressedTextureSubImage2DEXT = (glCompressedTextureSubImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint width, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedTextureSubImage1DEXTPROC glCompressedTextureSubImage1DEXT = (glCompressedTextureSubImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetCompressedTextureImageEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jlong imgAddress, jlong __functionAddress) {
	void *img = (void *)(intptr_t)imgAddress;
	glGetCompressedTextureImageEXTPROC glGetCompressedTextureImageEXT = (glGetCompressedTextureImageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetCompressedTextureImageEXT(texture, target, level, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexImage3DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedMultiTexImage3DEXTPROC glCompressedMultiTexImage3DEXT = (glCompressedMultiTexImage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedMultiTexImage2DEXTPROC glCompressedMultiTexImage2DEXT = (glCompressedMultiTexImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint border, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedMultiTexImage1DEXTPROC glCompressedMultiTexImage1DEXT = (glCompressedMultiTexImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedMultiTexSubImage3DEXTPROC glCompressedMultiTexSubImage3DEXT = (glCompressedMultiTexSubImage3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedMultiTexSubImage2DEXTPROC glCompressedMultiTexSubImage2DEXT = (glCompressedMultiTexSubImage2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint width, jint format, jint imageSize, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glCompressedMultiTexSubImage1DEXTPROC glCompressedMultiTexSubImage1DEXT = (glCompressedMultiTexSubImage1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetCompressedMultiTexImageEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jlong imgAddress, jlong __functionAddress) {
	void *img = (void *)(intptr_t)imgAddress;
	glGetCompressedMultiTexImageEXTPROC glGetCompressedMultiTexImageEXT = (glGetCompressedMultiTexImageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetCompressedMultiTexImageEXT(texunit, target, level, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoadTransposefEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMatrixLoadTransposefEXTPROC glMatrixLoadTransposefEXT = (glMatrixLoadTransposefEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixLoadTransposefEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoadTransposedEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLdouble *m = (const GLdouble *)(intptr_t)mAddress;
	glMatrixLoadTransposedEXTPROC glMatrixLoadTransposedEXT = (glMatrixLoadTransposedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixLoadTransposedEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultTransposefEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMatrixMultTransposefEXTPROC glMatrixMultTransposefEXT = (glMatrixMultTransposefEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixMultTransposefEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultTransposedEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress, jlong __functionAddress) {
	const GLdouble *m = (const GLdouble *)(intptr_t)mAddress;
	glMatrixMultTransposedEXTPROC glMatrixMultTransposedEXT = (glMatrixMultTransposedEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixMultTransposedEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedBufferDataEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint usage, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glNamedBufferDataEXTPROC glNamedBufferDataEXT = (glNamedBufferDataEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedBufferDataEXT(buffer, (GLsizeiptr)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedBufferSubDataEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress, jlong __functionAddress) {
	const void *data = (const void *)(intptr_t)dataAddress;
	glNamedBufferSubDataEXTPROC glNamedBufferSubDataEXT = (glNamedBufferSubDataEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedBufferSubDataEXT(buffer, (GLintptr)offset, (GLsizeiptr)size, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMapNamedBufferEXT(JNIEnv *__env, jclass clazz, jint buffer, jint access, jlong __functionAddress) {
	glMapNamedBufferEXTPROC glMapNamedBufferEXT = (glMapNamedBufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glMapNamedBufferEXT(buffer, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglUnmapNamedBufferEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong __functionAddress) {
	glUnmapNamedBufferEXTPROC glUnmapNamedBufferEXT = (glUnmapNamedBufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glUnmapNamedBufferEXT(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedBufferParameterivEXT(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetNamedBufferParameterivEXTPROC glGetNamedBufferParameterivEXT = (glGetNamedBufferParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedBufferParameterivEXT(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedBufferSubDataEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress, jlong __functionAddress) {
	void *data = (void *)(intptr_t)dataAddress;
	glGetNamedBufferSubDataEXTPROC glGetNamedBufferSubDataEXT = (glGetNamedBufferSubDataEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedBufferSubDataEXT(buffer, (GLintptr)offset, (GLsizeiptr)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jlong __functionAddress) {
	glProgramUniform1fEXTPROC glProgramUniform1fEXT = (glProgramUniform1fEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1fEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jlong __functionAddress) {
	glProgramUniform2fEXTPROC glProgramUniform2fEXT = (glProgramUniform2fEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2fEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jlong __functionAddress) {
	glProgramUniform3fEXTPROC glProgramUniform3fEXT = (glProgramUniform3fEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3fEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3, jlong __functionAddress) {
	glProgramUniform4fEXTPROC glProgramUniform4fEXT = (glProgramUniform4fEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4fEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jlong __functionAddress) {
	glProgramUniform1iEXTPROC glProgramUniform1iEXT = (glProgramUniform1iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1iEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jlong __functionAddress) {
	glProgramUniform2iEXTPROC glProgramUniform2iEXT = (glProgramUniform2iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2iEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glProgramUniform3iEXTPROC glProgramUniform3iEXT = (glProgramUniform3iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3iEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glProgramUniform4iEXTPROC glProgramUniform4iEXT = (glProgramUniform4iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4iEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform1fvEXTPROC glProgramUniform1fvEXT = (glProgramUniform1fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform2fvEXTPROC glProgramUniform2fvEXT = (glProgramUniform2fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform3fvEXTPROC glProgramUniform3fvEXT = (glProgramUniform3fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniform4fvEXTPROC glProgramUniform4fvEXT = (glProgramUniform4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1ivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform1ivEXTPROC glProgramUniform1ivEXT = (glProgramUniform1ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2ivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform2ivEXTPROC glProgramUniform2ivEXT = (glProgramUniform2ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3ivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform3ivEXTPROC glProgramUniform3ivEXT = (glProgramUniform3ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4ivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLint *value = (const GLint *)(intptr_t)valueAddress;
	glProgramUniform4ivEXTPROC glProgramUniform4ivEXT = (glProgramUniform4ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix2fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2fvEXTPROC glProgramUniformMatrix2fvEXT = (glProgramUniformMatrix2fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix3fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3fvEXTPROC glProgramUniformMatrix3fvEXT = (glProgramUniformMatrix3fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix4fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4fvEXTPROC glProgramUniformMatrix4fvEXT = (glProgramUniformMatrix4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix2x3fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x3fvEXTPROC glProgramUniformMatrix2x3fvEXT = (glProgramUniformMatrix2x3fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix3x2fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x2fvEXTPROC glProgramUniformMatrix3x2fvEXT = (glProgramUniformMatrix3x2fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix2x4fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix2x4fvEXTPROC glProgramUniformMatrix2x4fvEXT = (glProgramUniformMatrix2x4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix2x4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix4x2fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x2fvEXTPROC glProgramUniformMatrix4x2fvEXT = (glProgramUniformMatrix4x2fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix3x4fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix3x4fvEXTPROC glProgramUniformMatrix3x4fvEXT = (glProgramUniformMatrix3x4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix3x4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix4x3fvEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress, jlong __functionAddress) {
	const GLfloat *value = (const GLfloat *)(intptr_t)valueAddress;
	glProgramUniformMatrix4x3fvEXTPROC glProgramUniformMatrix4x3fvEXT = (glProgramUniformMatrix4x3fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniformMatrix4x3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureBufferEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint internalformat, jint buffer, jlong __functionAddress) {
	glTextureBufferEXTPROC glTextureBufferEXT = (glTextureBufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureBufferEXT(texture, target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexBufferEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint internalformat, jint buffer, jlong __functionAddress) {
	glMultiTexBufferEXTPROC glMultiTexBufferEXT = (glMultiTexBufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexBufferEXT(texunit, target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterIivEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glTextureParameterIivEXTPROC glTextureParameterIivEXT = (glTextureParameterIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameterIivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterIuivEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *params = (const GLuint *)(intptr_t)paramsAddress;
	glTextureParameterIuivEXTPROC glTextureParameterIuivEXT = (glTextureParameterIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureParameterIuivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterIivEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTextureParameterIivEXTPROC glGetTextureParameterIivEXT = (glGetTextureParameterIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureParameterIivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterIuivEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetTextureParameterIuivEXTPROC glGetTextureParameterIuivEXT = (glGetTextureParameterIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTextureParameterIuivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterIivEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glMultiTexParameterIivEXTPROC glMultiTexParameterIivEXT = (glMultiTexParameterIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexParameterIivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterIuivEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *params = (const GLuint *)(intptr_t)paramsAddress;
	glMultiTexParameterIuivEXTPROC glMultiTexParameterIuivEXT = (glMultiTexParameterIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexParameterIuivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterIivEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetMultiTexParameterIivEXTPROC glGetMultiTexParameterIivEXT = (glGetMultiTexParameterIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexParameterIivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterIuivEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetMultiTexParameterIuivEXTPROC glGetMultiTexParameterIuivEXT = (glGetMultiTexParameterIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMultiTexParameterIuivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jlong __functionAddress) {
	glProgramUniform1uiEXTPROC glProgramUniform1uiEXT = (glProgramUniform1uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1uiEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jlong __functionAddress) {
	glProgramUniform2uiEXTPROC glProgramUniform2uiEXT = (glProgramUniform2uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2uiEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jlong __functionAddress) {
	glProgramUniform3uiEXTPROC glProgramUniform3uiEXT = (glProgramUniform3uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3uiEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3, jlong __functionAddress) {
	glProgramUniform4uiEXTPROC glProgramUniform4uiEXT = (glProgramUniform4uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4uiEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1uivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform1uivEXTPROC glProgramUniform1uivEXT = (glProgramUniform1uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform1uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2uivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform2uivEXTPROC glProgramUniform2uivEXT = (glProgramUniform2uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform2uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3uivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform3uivEXTPROC glProgramUniform3uivEXT = (glProgramUniform3uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform3uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4uivEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress, jlong __functionAddress) {
	const GLuint *value = (const GLuint *)(intptr_t)valueAddress;
	glProgramUniform4uivEXTPROC glProgramUniform4uivEXT = (glProgramUniform4uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glProgramUniform4uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameters4fvEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint count, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glNamedProgramLocalParameters4fvEXTPROC glNamedProgramLocalParameters4fvEXT = (glNamedProgramLocalParameters4fvEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramLocalParameters4fvEXT(program, target, index, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameterI4iEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glNamedProgramLocalParameterI4iEXTPROC glNamedProgramLocalParameterI4iEXT = (glNamedProgramLocalParameterI4iEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramLocalParameterI4iEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameterI4ivEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glNamedProgramLocalParameterI4ivEXTPROC glNamedProgramLocalParameterI4ivEXT = (glNamedProgramLocalParameterI4ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramLocalParameterI4ivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParametersI4ivEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint count, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glNamedProgramLocalParametersI4ivEXTPROC glNamedProgramLocalParametersI4ivEXT = (glNamedProgramLocalParametersI4ivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramLocalParametersI4ivEXT(program, target, index, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameterI4uiEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glNamedProgramLocalParameterI4uiEXTPROC glNamedProgramLocalParameterI4uiEXT = (glNamedProgramLocalParameterI4uiEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramLocalParameterI4uiEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameterI4uivEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *params = (const GLuint *)(intptr_t)paramsAddress;
	glNamedProgramLocalParameterI4uivEXTPROC glNamedProgramLocalParameterI4uivEXT = (glNamedProgramLocalParameterI4uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramLocalParameterI4uivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParametersI4uivEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint count, jlong paramsAddress, jlong __functionAddress) {
	const GLuint *params = (const GLuint *)(intptr_t)paramsAddress;
	glNamedProgramLocalParametersI4uivEXTPROC glNamedProgramLocalParametersI4uivEXT = (glNamedProgramLocalParametersI4uivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedProgramLocalParametersI4uivEXT(program, target, index, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterIivEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetNamedProgramLocalParameterIivEXTPROC glGetNamedProgramLocalParameterIivEXT = (glGetNamedProgramLocalParameterIivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedProgramLocalParameterIivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterIuivEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress, jlong __functionAddress) {
	GLuint *params = (GLuint *)(intptr_t)paramsAddress;
	glGetNamedProgramLocalParameterIuivEXTPROC glGetNamedProgramLocalParameterIuivEXT = (glGetNamedProgramLocalParameterIuivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedProgramLocalParameterIuivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedRenderbufferStorageEXT(JNIEnv *__env, jclass clazz, jint renderbuffer, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glNamedRenderbufferStorageEXTPROC glNamedRenderbufferStorageEXT = (glNamedRenderbufferStorageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedRenderbufferStorageEXT(renderbuffer, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedRenderbufferParameterivEXT(JNIEnv *__env, jclass clazz, jint renderbuffer, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetNamedRenderbufferParameterivEXTPROC glGetNamedRenderbufferParameterivEXT = (glGetNamedRenderbufferParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedRenderbufferParameterivEXT(renderbuffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedRenderbufferStorageMultisampleEXT(JNIEnv *__env, jclass clazz, jint renderbuffer, jint samples, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glNamedRenderbufferStorageMultisampleEXTPROC glNamedRenderbufferStorageMultisampleEXT = (glNamedRenderbufferStorageMultisampleEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedRenderbufferStorageMultisampleEXT(renderbuffer, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedRenderbufferStorageMultisampleCoverageEXT(JNIEnv *__env, jclass clazz, jint renderbuffer, jint coverageSamples, jint colorSamples, jint internalformat, jint width, jint height, jlong __functionAddress) {
	glNamedRenderbufferStorageMultisampleCoverageEXTPROC glNamedRenderbufferStorageMultisampleCoverageEXT = (glNamedRenderbufferStorageMultisampleCoverageEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedRenderbufferStorageMultisampleCoverageEXT(renderbuffer, coverageSamples, colorSamples, internalformat, width, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCheckNamedFramebufferStatusEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint target, jlong __functionAddress) {
	glCheckNamedFramebufferStatusEXTPROC glCheckNamedFramebufferStatusEXT = (glCheckNamedFramebufferStatusEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glCheckNamedFramebufferStatusEXT(framebuffer, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedFramebufferTexture1DEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint textarget, jint texture, jint level, jlong __functionAddress) {
	glNamedFramebufferTexture1DEXTPROC glNamedFramebufferTexture1DEXT = (glNamedFramebufferTexture1DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferTexture1DEXT(framebuffer, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedFramebufferTexture2DEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint textarget, jint texture, jint level, jlong __functionAddress) {
	glNamedFramebufferTexture2DEXTPROC glNamedFramebufferTexture2DEXT = (glNamedFramebufferTexture2DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferTexture2DEXT(framebuffer, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedFramebufferTexture3DEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint textarget, jint texture, jint level, jint zoffset, jlong __functionAddress) {
	glNamedFramebufferTexture3DEXTPROC glNamedFramebufferTexture3DEXT = (glNamedFramebufferTexture3DEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferTexture3DEXT(framebuffer, attachment, textarget, texture, level, zoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedFramebufferRenderbufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint renderbuffertarget, jint renderbuffer, jlong __functionAddress) {
	glNamedFramebufferRenderbufferEXTPROC glNamedFramebufferRenderbufferEXT = (glNamedFramebufferRenderbufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferRenderbufferEXT(framebuffer, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedFramebufferAttachmentParameterivEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetNamedFramebufferAttachmentParameterivEXTPROC glGetNamedFramebufferAttachmentParameterivEXT = (glGetNamedFramebufferAttachmentParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGenerateTextureMipmapEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jlong __functionAddress) {
	glGenerateTextureMipmapEXTPROC glGenerateTextureMipmapEXT = (glGenerateTextureMipmapEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenerateTextureMipmapEXT(texture, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGenerateMultiTexMipmapEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jlong __functionAddress) {
	glGenerateMultiTexMipmapEXTPROC glGenerateMultiTexMipmapEXT = (glGenerateMultiTexMipmapEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenerateMultiTexMipmapEXT(texunit, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglFramebufferDrawBufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint mode, jlong __functionAddress) {
	glFramebufferDrawBufferEXTPROC glFramebufferDrawBufferEXT = (glFramebufferDrawBufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferDrawBufferEXT(framebuffer, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglFramebufferDrawBuffersEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint n, jlong bufsAddress, jlong __functionAddress) {
	const GLenum *bufs = (const GLenum *)(intptr_t)bufsAddress;
	glFramebufferDrawBuffersEXTPROC glFramebufferDrawBuffersEXT = (glFramebufferDrawBuffersEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferDrawBuffersEXT(framebuffer, n, bufs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglFramebufferReadBufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint mode, jlong __functionAddress) {
	glFramebufferReadBufferEXTPROC glFramebufferReadBufferEXT = (glFramebufferReadBufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFramebufferReadBufferEXT(framebuffer, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetFramebufferParameterivEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jlong paramAddress, jlong __functionAddress) {
	GLint *param = (GLint *)(intptr_t)paramAddress;
	glGetFramebufferParameterivEXTPROC glGetFramebufferParameterivEXT = (glGetFramebufferParameterivEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFramebufferParameterivEXT(framebuffer, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedCopyBufferSubDataEXT(JNIEnv *__env, jclass clazz, jint readBuffer, jint writeBuffer, jlong readOffset, jlong writeOffset, jlong size, jlong __functionAddress) {
	glNamedCopyBufferSubDataEXTPROC glNamedCopyBufferSubDataEXT = (glNamedCopyBufferSubDataEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedCopyBufferSubDataEXT(readBuffer, writeBuffer, (GLintptr)readOffset, (GLintptr)writeOffset, (GLsizeiptr)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedFramebufferTextureEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level, jlong __functionAddress) {
	glNamedFramebufferTextureEXTPROC glNamedFramebufferTextureEXT = (glNamedFramebufferTextureEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferTextureEXT(framebuffer, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedFramebufferTextureLayerEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level, jint layer, jlong __functionAddress) {
	glNamedFramebufferTextureLayerEXTPROC glNamedFramebufferTextureLayerEXT = (glNamedFramebufferTextureLayerEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferTextureLayerEXT(framebuffer, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedFramebufferTextureFaceEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level, jint face, jlong __functionAddress) {
	glNamedFramebufferTextureFaceEXTPROC glNamedFramebufferTextureFaceEXT = (glNamedFramebufferTextureFaceEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNamedFramebufferTextureFaceEXT(framebuffer, attachment, texture, level, face);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureRenderbufferEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint renderbuffer, jlong __functionAddress) {
	glTextureRenderbufferEXTPROC glTextureRenderbufferEXT = (glTextureRenderbufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTextureRenderbufferEXT(texture, target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexRenderbufferEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint renderbuffer, jlong __functionAddress) {
	glMultiTexRenderbufferEXTPROC glMultiTexRenderbufferEXT = (glMultiTexRenderbufferEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultiTexRenderbufferEXT(texunit, target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglVertexArrayVertexOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayVertexOffsetEXTPROC glVertexArrayVertexOffsetEXT = (glVertexArrayVertexOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexOffsetEXT(vaobj, buffer, size, type, stride, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglVertexArrayColorOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayColorOffsetEXTPROC glVertexArrayColorOffsetEXT = (glVertexArrayColorOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayColorOffsetEXT(vaobj, buffer, size, type, stride, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglVertexArrayEdgeFlagOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayEdgeFlagOffsetEXTPROC glVertexArrayEdgeFlagOffsetEXT = (glVertexArrayEdgeFlagOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayEdgeFlagOffsetEXT(vaobj, buffer, stride, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglVertexArrayIndexOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint type, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayIndexOffsetEXTPROC glVertexArrayIndexOffsetEXT = (glVertexArrayIndexOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayIndexOffsetEXT(vaobj, buffer, type, stride, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglVertexArrayNormalOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint type, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayNormalOffsetEXTPROC glVertexArrayNormalOffsetEXT = (glVertexArrayNormalOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayNormalOffsetEXT(vaobj, buffer, type, stride, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglVertexArrayTexCoordOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayTexCoordOffsetEXTPROC glVertexArrayTexCoordOffsetEXT = (glVertexArrayTexCoordOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayTexCoordOffsetEXT(vaobj, buffer, size, type, stride, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglVertexArrayMultiTexCoordOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint texunit, jint size, jint type, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayMultiTexCoordOffsetEXTPROC glVertexArrayMultiTexCoordOffsetEXT = (glVertexArrayMultiTexCoordOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayMultiTexCoordOffsetEXT(vaobj, buffer, texunit, size, type, stride, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglVertexArrayFogCoordOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint type, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayFogCoordOffsetEXTPROC glVertexArrayFogCoordOffsetEXT = (glVertexArrayFogCoordOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayFogCoordOffsetEXT(vaobj, buffer, type, stride, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglVertexArraySecondaryColorOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArraySecondaryColorOffsetEXTPROC glVertexArraySecondaryColorOffsetEXT = (glVertexArraySecondaryColorOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArraySecondaryColorOffsetEXT(vaobj, buffer, size, type, stride, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglVertexArrayVertexAttribOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint index, jint size, jint type, jboolean normalized, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayVertexAttribOffsetEXTPROC glVertexArrayVertexAttribOffsetEXT = (glVertexArrayVertexAttribOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexAttribOffsetEXT(vaobj, buffer, index, size, type, normalized, stride, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglVertexArrayVertexAttribIOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint index, jint size, jint type, jint stride, jlong offset, jlong __functionAddress) {
	glVertexArrayVertexAttribIOffsetEXTPROC glVertexArrayVertexAttribIOffsetEXT = (glVertexArrayVertexAttribIOffsetEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexArrayVertexAttribIOffsetEXT(vaobj, buffer, index, size, type, stride, (GLintptr)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglEnableVertexArrayEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint array, jlong __functionAddress) {
	glEnableVertexArrayEXTPROC glEnableVertexArrayEXT = (glEnableVertexArrayEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableVertexArrayEXT(vaobj, array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglDisableVertexArrayEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint array, jlong __functionAddress) {
	glDisableVertexArrayEXTPROC glDisableVertexArrayEXT = (glDisableVertexArrayEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableVertexArrayEXT(vaobj, array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglEnableVertexArrayAttribEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jlong __functionAddress) {
	glEnableVertexArrayAttribEXTPROC glEnableVertexArrayAttribEXT = (glEnableVertexArrayAttribEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableVertexArrayAttribEXT(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglDisableVertexArrayAttribEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jlong __functionAddress) {
	glDisableVertexArrayAttribEXTPROC glDisableVertexArrayAttribEXT = (glDisableVertexArrayAttribEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableVertexArrayAttribEXT(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayIntegervEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint pname, jlong paramAddress, jlong __functionAddress) {
	GLint *param = (GLint *)(intptr_t)paramAddress;
	glGetVertexArrayIntegervEXTPROC glGetVertexArrayIntegervEXT = (glGetVertexArrayIntegervEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexArrayIntegervEXT(vaobj, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayPointervEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint pname, jlong paramAddress, jlong __functionAddress) {
	void **param = (void **)(intptr_t)paramAddress;
	glGetVertexArrayPointervEXTPROC glGetVertexArrayPointervEXT = (glGetVertexArrayPointervEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexArrayPointervEXT(vaobj, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayIntegeri_1vEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress, jlong __functionAddress) {
	GLint *param = (GLint *)(intptr_t)paramAddress;
	glGetVertexArrayIntegeri_vEXTPROC glGetVertexArrayIntegeri_vEXT = (glGetVertexArrayIntegeri_vEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexArrayIntegeri_vEXT(vaobj, index, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayPointeri_1vEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress, jlong __functionAddress) {
	void **param = (void **)(intptr_t)paramAddress;
	glGetVertexArrayPointeri_vEXTPROC glGetVertexArrayPointeri_vEXT = (glGetVertexArrayPointeri_vEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetVertexArrayPointeri_vEXT(vaobj, index, pname, param);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMapNamedBufferRangeEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length, jint access, jlong __functionAddress) {
	glMapNamedBufferRangeEXTPROC glMapNamedBufferRangeEXT = (glMapNamedBufferRangeEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glMapNamedBufferRangeEXT(buffer, (GLintptr)offset, (GLsizeiptr)length, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglFlushMappedNamedBufferRangeEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length, jlong __functionAddress) {
	glFlushMappedNamedBufferRangeEXTPROC glFlushMappedNamedBufferRangeEXT = (glFlushMappedNamedBufferRangeEXTPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFlushMappedNamedBufferRangeEXT(buffer, (GLintptr)offset, (GLsizeiptr)length);
}

EXTERN_C_EXIT
