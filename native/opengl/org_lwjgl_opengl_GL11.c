/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "OpenGL.h"

typedef GLvoid (APIENTRY *glEnablePROC) (GLenum);
typedef GLvoid (APIENTRY *glDisablePROC) (GLenum);
typedef GLvoid (APIENTRY *glAccumPROC) (GLenum, GLfloat);
typedef GLvoid (APIENTRY *glAlphaFuncPROC) (GLenum, GLfloat);
typedef GLboolean (APIENTRY *glAreTexturesResidentPROC) (GLsizei, const GLuint *, GLboolean *);
typedef GLvoid (APIENTRY *glArrayElementPROC) (GLint);
typedef GLvoid (APIENTRY *glBeginPROC) (GLenum);
typedef GLvoid (APIENTRY *glBindTexturePROC) (GLenum, GLuint);
typedef GLvoid (APIENTRY *glBitmapPROC) (GLsizei, GLsizei, GLfloat, GLfloat, GLfloat, GLfloat, const GLubyte *);
typedef GLvoid (APIENTRY *glBlendFuncPROC) (GLenum, GLenum);
typedef GLvoid (APIENTRY *glCallListPROC) (GLuint);
typedef GLvoid (APIENTRY *glCallListsPROC) (GLsizei, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glClearPROC) (GLbitfield);
typedef GLvoid (APIENTRY *glClearAccumPROC) (GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glClearColorPROC) (GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glClearDepthPROC) (GLdouble);
typedef GLvoid (APIENTRY *glClearStencilPROC) (GLint);
typedef GLvoid (APIENTRY *glClipPlanePROC) (GLenum, const GLdouble *);
typedef GLvoid (APIENTRY *glColor3bPROC) (GLbyte, GLbyte, GLbyte);
typedef GLvoid (APIENTRY *glColor3sPROC) (GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glColor3iPROC) (GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glColor3fPROC) (GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glColor3dPROC) (GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glColor3ubPROC) (GLubyte, GLubyte, GLubyte);
typedef GLvoid (APIENTRY *glColor3usPROC) (GLushort, GLushort, GLushort);
typedef GLvoid (APIENTRY *glColor3uiPROC) (GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glColor3bvPROC) (const GLbyte *);
typedef GLvoid (APIENTRY *glColor3svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glColor3ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glColor3fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glColor3dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glColor3ubvPROC) (const GLubyte *);
typedef GLvoid (APIENTRY *glColor3usvPROC) (const GLushort *);
typedef GLvoid (APIENTRY *glColor3uivPROC) (const GLuint *);
typedef GLvoid (APIENTRY *glColor4bPROC) (GLbyte, GLbyte, GLbyte, GLbyte);
typedef GLvoid (APIENTRY *glColor4sPROC) (GLshort, GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glColor4iPROC) (GLint, GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glColor4fPROC) (GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glColor4dPROC) (GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glColor4ubPROC) (GLubyte, GLubyte, GLubyte, GLubyte);
typedef GLvoid (APIENTRY *glColor4usPROC) (GLushort, GLushort, GLushort, GLushort);
typedef GLvoid (APIENTRY *glColor4uiPROC) (GLint, GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glColor4bvPROC) (const GLbyte *);
typedef GLvoid (APIENTRY *glColor4svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glColor4ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glColor4fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glColor4dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glColor4ubvPROC) (const GLubyte *);
typedef GLvoid (APIENTRY *glColor4usvPROC) (const GLushort *);
typedef GLvoid (APIENTRY *glColor4uivPROC) (const GLuint *);
typedef GLvoid (APIENTRY *glColorMaskPROC) (GLboolean, GLboolean, GLboolean, GLboolean);
typedef GLvoid (APIENTRY *glColorMaterialPROC) (GLenum, GLenum);
typedef GLvoid (APIENTRY *glColorPointerPROC) (GLint, GLenum, GLsizei, const GLvoid *);
typedef GLvoid (APIENTRY *glCopyPixelsPROC) (GLint, GLint, GLsizei, GLsizei, GLenum);
typedef GLvoid (APIENTRY *glCullFacePROC) (GLenum);
typedef GLvoid (APIENTRY *glDeleteListsPROC) (GLuint, GLsizei);
typedef GLvoid (APIENTRY *glDepthFuncPROC) (GLenum);
typedef GLvoid (APIENTRY *glDepthMaskPROC) (GLboolean);
typedef GLvoid (APIENTRY *glDepthRangePROC) (GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glDisableClientStatePROC) (GLenum);
typedef GLvoid (APIENTRY *glDrawArraysPROC) (GLenum, GLint, GLsizei);
typedef GLvoid (APIENTRY *glDrawBufferPROC) (GLenum);
typedef GLvoid (APIENTRY *glDrawElementsPROC) (GLenum, GLsizei, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glDrawPixelsPROC) (GLsizei, GLsizei, GLenum, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glEdgeFlagPROC) (GLboolean);
typedef GLvoid (APIENTRY *glEdgeFlagvPROC) (const GLboolean *);
typedef GLvoid (APIENTRY *glEdgeFlagPointerPROC) (GLsizei, const GLboolean *);
typedef GLvoid (APIENTRY *glEnableClientStatePROC) (GLenum);
typedef GLvoid (APIENTRY *glEndPROC) (void);
typedef GLvoid (APIENTRY *glEvalCoord1fPROC) (GLfloat);
typedef GLvoid (APIENTRY *glEvalCoord1fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glEvalCoord1dPROC) (GLdouble);
typedef GLvoid (APIENTRY *glEvalCoord1dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glEvalCoord2fPROC) (GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glEvalCoord2fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glEvalCoord2dPROC) (GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glEvalCoord2dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glEvalMesh1PROC) (GLenum, GLint, GLint);
typedef GLvoid (APIENTRY *glEvalMesh2PROC) (GLenum, GLint, GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glEvalPoint1PROC) (GLint);
typedef GLvoid (APIENTRY *glEvalPoint2PROC) (GLint, GLint);
typedef GLvoid (APIENTRY *glFeedbackBufferPROC) (GLsizei, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glFinishPROC) (void);
typedef GLvoid (APIENTRY *glFlushPROC) (void);
typedef GLvoid (APIENTRY *glFogiPROC) (GLenum, GLint);
typedef GLvoid (APIENTRY *glFogivPROC) (GLenum, const GLint *);
typedef GLvoid (APIENTRY *glFogfPROC) (GLenum, GLfloat);
typedef GLvoid (APIENTRY *glFogfvPROC) (GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glFrontFacePROC) (GLenum);
typedef GLuint (APIENTRY *glGenListsPROC) (GLsizei);
typedef GLvoid (APIENTRY *glGenTexturesPROC) (GLsizei, GLuint *);
typedef GLvoid (APIENTRY *glDeleteTexturesPROC) (GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glGetClipPlanePROC) (GLenum, GLdouble *);
typedef GLvoid (APIENTRY *glGetBooleanvPROC) (GLenum, GLboolean *);
typedef GLvoid (APIENTRY *glGetFloatvPROC) (GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetIntegervPROC) (GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetDoublevPROC) (GLenum, GLdouble *);
typedef GLenum (APIENTRY *glGetErrorPROC) (void);
typedef GLvoid (APIENTRY *glGetLightivPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetLightfvPROC) (GLenum, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetMapivPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetMapfvPROC) (GLenum, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetMapdvPROC) (GLenum, GLenum, GLdouble *);
typedef GLvoid (APIENTRY *glGetMaterialivPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetMaterialfvPROC) (GLenum, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetPixelMapfvPROC) (GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetPixelMapusvPROC) (GLenum, GLushort *);
typedef GLvoid (APIENTRY *glGetPixelMapuivPROC) (GLenum, GLuint *);
typedef GLvoid (APIENTRY *glGetPointervPROC) (GLenum, GLvoid **);
typedef GLvoid (APIENTRY *glGetPolygonStipplePROC) (GLvoid *);
typedef const GLubyte * (APIENTRY *glGetStringPROC) (GLenum);
typedef GLvoid (APIENTRY *glGetTexEnvivPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetTexEnvfvPROC) (GLenum, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetTexGenivPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetTexGenfvPROC) (GLenum, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetTexGendvPROC) (GLenum, GLenum, GLdouble *);
typedef GLvoid (APIENTRY *glGetTexImagePROC) (GLenum, GLint, GLenum, GLenum, GLvoid *);
typedef GLvoid (APIENTRY *glGetTexLevelParameterivPROC) (GLenum, GLint, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetTexLevelParameterfvPROC) (GLenum, GLint, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glGetTexParameterivPROC) (GLenum, GLenum, GLint *);
typedef GLvoid (APIENTRY *glGetTexParameterfvPROC) (GLenum, GLenum, GLfloat *);
typedef GLvoid (APIENTRY *glHintPROC) (GLenum, GLenum);
typedef GLvoid (APIENTRY *glInitNamesPROC) (void);
typedef GLvoid (APIENTRY *glInterleavedArraysPROC) (GLenum, GLsizei, const GLvoid *);
typedef GLboolean (APIENTRY *glIsEnabledPROC) (GLenum);
typedef GLboolean (APIENTRY *glIsListPROC) (GLuint);
typedef GLboolean (APIENTRY *glIsTexturePROC) (GLuint);
typedef GLvoid (APIENTRY *glLightModeliPROC) (GLenum, GLint);
typedef GLvoid (APIENTRY *glLightModelfPROC) (GLenum, GLfloat);
typedef GLvoid (APIENTRY *glLightModelivPROC) (GLenum, const GLint *);
typedef GLvoid (APIENTRY *glLightModelfvPROC) (GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glLightiPROC) (GLenum, GLenum, GLint);
typedef GLvoid (APIENTRY *glLightfPROC) (GLenum, GLenum, GLfloat);
typedef GLvoid (APIENTRY *glLightivPROC) (GLenum, GLenum, const GLint *);
typedef GLvoid (APIENTRY *glLightfvPROC) (GLenum, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glLineStipplePROC) (GLint, GLushort);
typedef GLvoid (APIENTRY *glLineWidthPROC) (GLfloat);
typedef GLvoid (APIENTRY *glListBasePROC) (GLuint);
typedef GLvoid (APIENTRY *glLoadMatrixfPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glLoadMatrixdPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glLoadIdentityPROC) (void);
typedef GLvoid (APIENTRY *glLoadNamePROC) (GLuint);
typedef GLvoid (APIENTRY *glLogicOpPROC) (GLenum);
typedef GLvoid (APIENTRY *glMap1fPROC) (GLenum, GLfloat, GLfloat, GLint, GLint, const GLfloat *);
typedef GLvoid (APIENTRY *glMap1dPROC) (GLenum, GLdouble, GLdouble, GLint, GLint, const GLdouble *);
typedef GLvoid (APIENTRY *glMap2fPROC) (GLenum, GLfloat, GLfloat, GLint, GLint, GLfloat, GLfloat, GLint, GLint, const GLfloat *);
typedef GLvoid (APIENTRY *glMap2dPROC) (GLenum, GLdouble, GLdouble, GLint, GLint, GLdouble, GLdouble, GLint, GLint, const GLdouble *);
typedef GLvoid (APIENTRY *glMapGrid1fPROC) (GLint, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glMapGrid1dPROC) (GLint, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glMapGrid2fPROC) (GLint, GLfloat, GLfloat, GLint, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glMapGrid2dPROC) (GLint, GLdouble, GLdouble, GLint, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glMaterialiPROC) (GLenum, GLenum, GLint);
typedef GLvoid (APIENTRY *glMaterialfPROC) (GLenum, GLenum, GLfloat);
typedef GLvoid (APIENTRY *glMaterialivPROC) (GLenum, GLenum, const GLint *);
typedef GLvoid (APIENTRY *glMaterialfvPROC) (GLenum, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glMatrixModePROC) (GLenum);
typedef GLvoid (APIENTRY *glMultMatrixfPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glMultMatrixdPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glFrustumPROC) (GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glNewListPROC) (GLuint, GLenum);
typedef GLvoid (APIENTRY *glEndListPROC) (void);
typedef GLvoid (APIENTRY *glNormal3fPROC) (GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glNormal3bPROC) (GLbyte, GLbyte, GLbyte);
typedef GLvoid (APIENTRY *glNormal3sPROC) (GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glNormal3iPROC) (GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glNormal3dPROC) (GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glNormal3fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glNormal3bvPROC) (const GLbyte *);
typedef GLvoid (APIENTRY *glNormal3svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glNormal3ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glNormal3dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glNormalPointerPROC) (GLenum, GLsizei, const GLvoid *);
typedef GLvoid (APIENTRY *glOrthoPROC) (GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glPassThroughPROC) (GLfloat);
typedef GLvoid (APIENTRY *glPixelMapfvPROC) (GLenum, GLsizei, const GLfloat *);
typedef GLvoid (APIENTRY *glPixelMapusvPROC) (GLenum, GLsizei, const GLushort *);
typedef GLvoid (APIENTRY *glPixelMapuivPROC) (GLenum, GLsizei, const GLuint *);
typedef GLvoid (APIENTRY *glPixelStoreiPROC) (GLenum, GLint);
typedef GLvoid (APIENTRY *glPixelStorefPROC) (GLenum, GLint);
typedef GLvoid (APIENTRY *glPixelTransferiPROC) (GLenum, GLint);
typedef GLvoid (APIENTRY *glPixelTransferfPROC) (GLenum, GLfloat);
typedef GLvoid (APIENTRY *glPixelZoomPROC) (GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glPointSizePROC) (GLfloat);
typedef GLvoid (APIENTRY *glPolygonModePROC) (GLenum, GLenum);
typedef GLvoid (APIENTRY *glPolygonOffsetPROC) (GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glPolygonStipplePROC) (const GLubyte *);
typedef GLvoid (APIENTRY *glPushAttribPROC) (GLbitfield);
typedef GLvoid (APIENTRY *glPushClientAttribPROC) (GLbitfield);
typedef GLvoid (APIENTRY *glPopAttribPROC) (void);
typedef GLvoid (APIENTRY *glPopClientAttribPROC) (void);
typedef GLvoid (APIENTRY *glPopMatrixPROC) (void);
typedef GLvoid (APIENTRY *glPopNamePROC) (void);
typedef GLvoid (APIENTRY *glPrioritizeTexturesPROC) (GLsizei, const GLuint *, const GLfloat *);
typedef GLvoid (APIENTRY *glPushMatrixPROC) (void);
typedef GLvoid (APIENTRY *glPushNamePROC) (GLuint);
typedef GLvoid (APIENTRY *glRasterPos2iPROC) (GLint, GLint);
typedef GLvoid (APIENTRY *glRasterPos2sPROC) (GLshort, GLshort);
typedef GLvoid (APIENTRY *glRasterPos2fPROC) (GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glRasterPos2dPROC) (GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glRasterPos2ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glRasterPos2svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glRasterPos2fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glRasterPos2dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glRasterPos3iPROC) (GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glRasterPos3sPROC) (GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glRasterPos3fPROC) (GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glRasterPos3dPROC) (GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glRasterPos3ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glRasterPos3svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glRasterPos3fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glRasterPos3dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glRasterPos4iPROC) (GLint, GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glRasterPos4sPROC) (GLshort, GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glRasterPos4fPROC) (GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glRasterPos4dPROC) (GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glRasterPos4ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glRasterPos4svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glRasterPos4fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glRasterPos4dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glReadBufferPROC) (GLenum);
typedef GLvoid (APIENTRY *glReadPixelsPROC) (GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLvoid *);
typedef GLvoid (APIENTRY *glRectiPROC) (GLint, GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glRectsPROC) (GLshort, GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glRectfPROC) (GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glRectdPROC) (GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glRectivPROC) (const GLint *, const GLint *);
typedef GLvoid (APIENTRY *glRectsvPROC) (const GLshort *, const GLshort *);
typedef GLvoid (APIENTRY *glRectfvPROC) (const GLfloat *, const GLfloat *);
typedef GLvoid (APIENTRY *glRectdvPROC) (const GLdouble *, const GLdouble *);
typedef GLint (APIENTRY *glRenderModePROC) (GLenum);
typedef GLvoid (APIENTRY *glRotatefPROC) (GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glRotatedPROC) (GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glScalefPROC) (GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glScaledPROC) (GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glScissorPROC) (GLint, GLint, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glSelectBufferPROC) (GLsizei, GLuint *);
typedef GLvoid (APIENTRY *glShadeModelPROC) (GLenum);
typedef GLvoid (APIENTRY *glStencilFuncPROC) (GLenum, GLint, GLuint);
typedef GLvoid (APIENTRY *glStencilMaskPROC) (GLuint);
typedef GLvoid (APIENTRY *glStencilOpPROC) (GLenum, GLenum, GLenum);
typedef GLvoid (APIENTRY *glTexCoord1fPROC) (GLfloat);
typedef GLvoid (APIENTRY *glTexCoord1sPROC) (GLshort);
typedef GLvoid (APIENTRY *glTexCoord1iPROC) (GLint);
typedef GLvoid (APIENTRY *glTexCoord1dPROC) (GLdouble);
typedef GLvoid (APIENTRY *glTexCoord1fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glTexCoord1svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glTexCoord1ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glTexCoord1dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glTexCoord2fPROC) (GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glTexCoord2sPROC) (GLshort, GLshort);
typedef GLvoid (APIENTRY *glTexCoord2iPROC) (GLint, GLint);
typedef GLvoid (APIENTRY *glTexCoord2dPROC) (GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glTexCoord2fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glTexCoord2svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glTexCoord2ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glTexCoord2dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glTexCoord3fPROC) (GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glTexCoord3sPROC) (GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glTexCoord3iPROC) (GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glTexCoord3dPROC) (GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glTexCoord3fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glTexCoord3svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glTexCoord3ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glTexCoord3dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glTexCoord4fPROC) (GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glTexCoord4sPROC) (GLshort, GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glTexCoord4iPROC) (GLint, GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glTexCoord4dPROC) (GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glTexCoord4fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glTexCoord4svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glTexCoord4ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glTexCoord4dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glTexCoordPointerPROC) (GLint, GLenum, GLsizei, const GLvoid *);
typedef GLvoid (APIENTRY *glTexEnviPROC) (GLenum, GLenum, GLint);
typedef GLvoid (APIENTRY *glTexEnvivPROC) (GLenum, GLenum, const GLint *);
typedef GLvoid (APIENTRY *glTexEnvfPROC) (GLenum, GLenum, GLfloat);
typedef GLvoid (APIENTRY *glTexEnvfvPROC) (GLenum, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glTexGeniPROC) (GLenum, GLenum, GLint);
typedef GLvoid (APIENTRY *glTexGenivPROC) (GLenum, GLenum, const GLint *);
typedef GLvoid (APIENTRY *glTexGenfPROC) (GLenum, GLenum, GLfloat);
typedef GLvoid (APIENTRY *glTexGenfvPROC) (GLenum, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glTexGendPROC) (GLenum, GLenum, GLdouble);
typedef GLvoid (APIENTRY *glTexGendvPROC) (GLenum, GLenum, const GLdouble *);
typedef GLvoid (APIENTRY *glTexImage2DPROC) (GLenum, GLint, GLint, GLsizei, GLsizei, GLint, GLenum, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glTexImage1DPROC) (GLenum, GLint, GLint, GLsizei, GLint, GLenum, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glCopyTexImage2DPROC) (GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint);
typedef GLvoid (APIENTRY *glCopyTexImage1DPROC) (GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLint);
typedef GLvoid (APIENTRY *glCopyTexSubImage1DPROC) (GLenum, GLint, GLint, GLint, GLint, GLsizei);
typedef GLvoid (APIENTRY *glCopyTexSubImage2DPROC) (GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei);
typedef GLvoid (APIENTRY *glTexParameteriPROC) (GLenum, GLenum, GLint);
typedef GLvoid (APIENTRY *glTexParameterivPROC) (GLenum, GLenum, const GLint *);
typedef GLvoid (APIENTRY *glTexParameterfPROC) (GLenum, GLenum, GLfloat);
typedef GLvoid (APIENTRY *glTexParameterfvPROC) (GLenum, GLenum, const GLfloat *);
typedef GLvoid (APIENTRY *glTexSubImage1DPROC) (GLenum, GLint, GLint, GLsizei, GLenum, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glTexSubImage2DPROC) (GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, const GLvoid *);
typedef GLvoid (APIENTRY *glTranslatefPROC) (GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glTranslatedPROC) (GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glVertex2fPROC) (GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glVertex2sPROC) (GLshort, GLshort);
typedef GLvoid (APIENTRY *glVertex2iPROC) (GLint, GLint);
typedef GLvoid (APIENTRY *glVertex2dPROC) (GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glVertex2fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glVertex2svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glVertex2ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glVertex2dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glVertex3fPROC) (GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glVertex3sPROC) (GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glVertex3iPROC) (GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glVertex3dPROC) (GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glVertex3fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glVertex3svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glVertex3ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glVertex3dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glVertex4fPROC) (GLfloat, GLfloat, GLfloat, GLfloat);
typedef GLvoid (APIENTRY *glVertex4sPROC) (GLshort, GLshort, GLshort, GLshort);
typedef GLvoid (APIENTRY *glVertex4iPROC) (GLint, GLint, GLint, GLint);
typedef GLvoid (APIENTRY *glVertex4dPROC) (GLdouble, GLdouble, GLdouble, GLdouble);
typedef GLvoid (APIENTRY *glVertex4fvPROC) (const GLfloat *);
typedef GLvoid (APIENTRY *glVertex4svPROC) (const GLshort *);
typedef GLvoid (APIENTRY *glVertex4ivPROC) (const GLint *);
typedef GLvoid (APIENTRY *glVertex4dvPROC) (const GLdouble *);
typedef GLvoid (APIENTRY *glVertexPointerPROC) (GLint, GLenum, GLsizei, const GLvoid *);
typedef GLvoid (APIENTRY *glViewportPROC) (GLint, GLint, GLsizei, GLsizei);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEnable(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glEnablePROC glEnable = (glEnablePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnable(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDisable(JNIEnv *__env, jclass clazz, jint target, jlong __functionAddress) {
	glDisablePROC glDisable = (glDisablePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisable(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglAccum(JNIEnv *__env, jclass clazz, jint op, jfloat value, jlong __functionAddress) {
	glAccumPROC glAccum = (glAccumPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glAccum(op, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglAlphaFunc(JNIEnv *__env, jclass clazz, jint func, jfloat ref, jlong __functionAddress) {
	glAlphaFuncPROC glAlphaFunc = (glAlphaFuncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glAlphaFunc(func, ref);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11_nglAreTexturesResident(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress, jlong residencesAddress, jlong __functionAddress) {
	const GLuint *textures = (const GLuint *)(intptr_t)texturesAddress;
	GLboolean *residences = (GLboolean *)(intptr_t)residencesAddress;
	glAreTexturesResidentPROC glAreTexturesResident = (glAreTexturesResidentPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glAreTexturesResident(n, textures, residences);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglArrayElement(JNIEnv *__env, jclass clazz, jint i, jlong __functionAddress) {
	glArrayElementPROC glArrayElement = (glArrayElementPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glArrayElement(i);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglBegin(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glBeginPROC glBegin = (glBeginPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBegin(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglBindTexture(JNIEnv *__env, jclass clazz, jint target, jint texture, jlong __functionAddress) {
	glBindTexturePROC glBindTexture = (glBindTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBindTexture(target, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglBitmap(JNIEnv *__env, jclass clazz, jint w, jint h, jfloat xOrig, jfloat yOrig, jfloat xInc, jfloat yInc, jlong dataAddress, jlong __functionAddress) {
	const GLubyte *data = (const GLubyte *)(intptr_t)dataAddress;
	glBitmapPROC glBitmap = (glBitmapPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglBlendFunc(JNIEnv *__env, jclass clazz, jint sfactor, jint dfactor, jlong __functionAddress) {
	glBlendFuncPROC glBlendFunc = (glBlendFuncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glBlendFunc(sfactor, dfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglCallList(JNIEnv *__env, jclass clazz, jint list, jlong __functionAddress) {
	glCallListPROC glCallList = (glCallListPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCallList(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglCallLists(JNIEnv *__env, jclass clazz, jint n, jint type, jlong listsAddress, jlong __functionAddress) {
	const GLvoid *lists = (const GLvoid *)(intptr_t)listsAddress;
	glCallListsPROC glCallLists = (glCallListsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCallLists(n, type, lists);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglClear(JNIEnv *__env, jclass clazz, jint mask, jlong __functionAddress) {
	glClearPROC glClear = (glClearPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClear(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglClearAccum(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha, jlong __functionAddress) {
	glClearAccumPROC glClearAccum = (glClearAccumPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearAccum(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglClearColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha, jlong __functionAddress) {
	glClearColorPROC glClearColor = (glClearColorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglClearDepth(JNIEnv *__env, jclass clazz, jdouble depth, jlong __functionAddress) {
	glClearDepthPROC glClearDepth = (glClearDepthPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearDepth(depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglClearStencil(JNIEnv *__env, jclass clazz, jint s, jlong __functionAddress) {
	glClearStencilPROC glClearStencil = (glClearStencilPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClearStencil(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglClipPlane(JNIEnv *__env, jclass clazz, jint plane, jlong equationAddress, jlong __functionAddress) {
	const GLdouble *equation = (const GLdouble *)(intptr_t)equationAddress;
	glClipPlanePROC glClipPlane = (glClipPlanePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glClipPlane(plane, equation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3b(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jlong __functionAddress) {
	glColor3bPROC glColor3b = (glColor3bPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3b(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3s(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jlong __functionAddress) {
	glColor3sPROC glColor3s = (glColor3sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3s(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3i(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jlong __functionAddress) {
	glColor3iPROC glColor3i = (glColor3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3i(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3f(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jlong __functionAddress) {
	glColor3fPROC glColor3f = (glColor3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3f(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3d(JNIEnv *__env, jclass clazz, jdouble red, jdouble green, jdouble blue, jlong __functionAddress) {
	glColor3dPROC glColor3d = (glColor3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3d(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3ub(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jlong __functionAddress) {
	glColor3ubPROC glColor3ub = (glColor3ubPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3ub(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3us(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jlong __functionAddress) {
	glColor3usPROC glColor3us = (glColor3usPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3us(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3ui(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jlong __functionAddress) {
	glColor3uiPROC glColor3ui = (glColor3uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3ui(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3bv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glColor3bvPROC glColor3bv = (glColor3bvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3bv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3sv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glColor3svPROC glColor3sv = (glColor3svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3iv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glColor3ivPROC glColor3iv = (glColor3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3fv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glColor3fvPROC glColor3fv = (glColor3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3dv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glColor3dvPROC glColor3dv = (glColor3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3ubv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLubyte *v = (const GLubyte *)(intptr_t)vAddress;
	glColor3ubvPROC glColor3ubv = (glColor3ubvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3ubv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3usv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLushort *v = (const GLushort *)(intptr_t)vAddress;
	glColor3usvPROC glColor3usv = (glColor3usvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3usv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3uiv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glColor3uivPROC glColor3uiv = (glColor3uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor3uiv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4b(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha, jlong __functionAddress) {
	glColor4bPROC glColor4b = (glColor4bPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4b(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4s(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha, jlong __functionAddress) {
	glColor4sPROC glColor4s = (glColor4sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4s(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4i(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jint alpha, jlong __functionAddress) {
	glColor4iPROC glColor4i = (glColor4iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4i(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4f(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha, jlong __functionAddress) {
	glColor4fPROC glColor4f = (glColor4fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4f(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4d(JNIEnv *__env, jclass clazz, jdouble red, jdouble green, jdouble blue, jdouble alpha, jlong __functionAddress) {
	glColor4dPROC glColor4d = (glColor4dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4d(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4ub(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha, jlong __functionAddress) {
	glColor4ubPROC glColor4ub = (glColor4ubPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4ub(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4us(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha, jlong __functionAddress) {
	glColor4usPROC glColor4us = (glColor4usPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4us(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4ui(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jint alpha, jlong __functionAddress) {
	glColor4uiPROC glColor4ui = (glColor4uiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4ui(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4bv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glColor4bvPROC glColor4bv = (glColor4bvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4bv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4sv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glColor4svPROC glColor4sv = (glColor4svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4iv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glColor4ivPROC glColor4iv = (glColor4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4fv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glColor4fvPROC glColor4fv = (glColor4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4dv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glColor4dvPROC glColor4dv = (glColor4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4ubv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLubyte *v = (const GLubyte *)(intptr_t)vAddress;
	glColor4ubvPROC glColor4ubv = (glColor4ubvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4ubv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4usv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLushort *v = (const GLushort *)(intptr_t)vAddress;
	glColor4usvPROC glColor4usv = (glColor4usvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4usv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4uiv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLuint *v = (const GLuint *)(intptr_t)vAddress;
	glColor4uivPROC glColor4uiv = (glColor4uivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColor4uiv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColorMask(JNIEnv *__env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha, jlong __functionAddress) {
	glColorMaskPROC glColorMask = (glColorMaskPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorMask(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColorMaterial(JNIEnv *__env, jclass clazz, jint face, jint mode, jlong __functionAddress) {
	glColorMaterialPROC glColorMaterial = (glColorMaterialPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorMaterial(face, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColorPointer(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const GLvoid *pointer = (const GLvoid *)(intptr_t)pointerAddress;
	glColorPointerPROC glColorPointer = (glColorPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glColorPointer(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglCopyPixels(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint type, jlong __functionAddress) {
	glCopyPixelsPROC glCopyPixels = (glCopyPixelsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyPixels(x, y, width, height, type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglCullFace(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glCullFacePROC glCullFace = (glCullFacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCullFace(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDeleteLists(JNIEnv *__env, jclass clazz, jint list, jint range, jlong __functionAddress) {
	glDeleteListsPROC glDeleteLists = (glDeleteListsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteLists(list, range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDepthFunc(JNIEnv *__env, jclass clazz, jint func, jlong __functionAddress) {
	glDepthFuncPROC glDepthFunc = (glDepthFuncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthFunc(func);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDepthMask(JNIEnv *__env, jclass clazz, jboolean flag, jlong __functionAddress) {
	glDepthMaskPROC glDepthMask = (glDepthMaskPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthMask(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDepthRange(JNIEnv *__env, jclass clazz, jdouble zNear, jdouble zFar, jlong __functionAddress) {
	glDepthRangePROC glDepthRange = (glDepthRangePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDepthRange(zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDisableClientState(JNIEnv *__env, jclass clazz, jint array, jlong __functionAddress) {
	glDisableClientStatePROC glDisableClientState = (glDisableClientStatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDisableClientState(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDrawArrays(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jlong __functionAddress) {
	glDrawArraysPROC glDrawArrays = (glDrawArraysPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawArrays(mode, first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDrawBuffer(JNIEnv *__env, jclass clazz, jint buf, jlong __functionAddress) {
	glDrawBufferPROC glDrawBuffer = (glDrawBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawBuffer(buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDrawElements(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jlong __functionAddress) {
	const GLvoid *indices = (const GLvoid *)(intptr_t)indicesAddress;
	glDrawElementsPROC glDrawElements = (glDrawElementsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawElements(mode, count, type, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDrawPixels(JNIEnv *__env, jclass clazz, jint width, jint height, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const GLvoid *pixels = (const GLvoid *)(intptr_t)pixelsAddress;
	glDrawPixelsPROC glDrawPixels = (glDrawPixelsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDrawPixels(width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEdgeFlag(JNIEnv *__env, jclass clazz, jboolean flag, jlong __functionAddress) {
	glEdgeFlagPROC glEdgeFlag = (glEdgeFlagPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEdgeFlag(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEdgeFlagv(JNIEnv *__env, jclass clazz, jlong flagAddress, jlong __functionAddress) {
	const GLboolean *flag = (const GLboolean *)(intptr_t)flagAddress;
	glEdgeFlagvPROC glEdgeFlagv = (glEdgeFlagvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEdgeFlagv(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEdgeFlagPointer(JNIEnv *__env, jclass clazz, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const GLboolean *pointer = (const GLboolean *)(intptr_t)pointerAddress;
	glEdgeFlagPointerPROC glEdgeFlagPointer = (glEdgeFlagPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEdgeFlagPointer(stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEnableClientState(JNIEnv *__env, jclass clazz, jint array, jlong __functionAddress) {
	glEnableClientStatePROC glEnableClientState = (glEnableClientStatePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnableClientState(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEnd(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glEndPROC glEnd = (glEndPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEnd();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord1f(JNIEnv *__env, jclass clazz, jfloat u, jlong __functionAddress) {
	glEvalCoord1fPROC glEvalCoord1f = (glEvalCoord1fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalCoord1f(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord1fv(JNIEnv *__env, jclass clazz, jlong uAddress, jlong __functionAddress) {
	const GLfloat *u = (const GLfloat *)(intptr_t)uAddress;
	glEvalCoord1fvPROC glEvalCoord1fv = (glEvalCoord1fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalCoord1fv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord1d(JNIEnv *__env, jclass clazz, jdouble u, jlong __functionAddress) {
	glEvalCoord1dPROC glEvalCoord1d = (glEvalCoord1dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalCoord1d(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord1dv(JNIEnv *__env, jclass clazz, jlong uAddress, jlong __functionAddress) {
	const GLdouble *u = (const GLdouble *)(intptr_t)uAddress;
	glEvalCoord1dvPROC glEvalCoord1dv = (glEvalCoord1dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalCoord1dv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord2f(JNIEnv *__env, jclass clazz, jfloat u, jfloat v, jlong __functionAddress) {
	glEvalCoord2fPROC glEvalCoord2f = (glEvalCoord2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalCoord2f(u, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord2fv(JNIEnv *__env, jclass clazz, jlong uAddress, jlong __functionAddress) {
	const GLfloat *u = (const GLfloat *)(intptr_t)uAddress;
	glEvalCoord2fvPROC glEvalCoord2fv = (glEvalCoord2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalCoord2fv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord2d(JNIEnv *__env, jclass clazz, jdouble u, jdouble v, jlong __functionAddress) {
	glEvalCoord2dPROC glEvalCoord2d = (glEvalCoord2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalCoord2d(u, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord2dv(JNIEnv *__env, jclass clazz, jlong uAddress, jlong __functionAddress) {
	const GLdouble *u = (const GLdouble *)(intptr_t)uAddress;
	glEvalCoord2dvPROC glEvalCoord2dv = (glEvalCoord2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalCoord2dv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalMesh1(JNIEnv *__env, jclass clazz, jint mode, jint i1, jint i2, jlong __functionAddress) {
	glEvalMesh1PROC glEvalMesh1 = (glEvalMesh1PROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalMesh1(mode, i1, i2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalMesh2(JNIEnv *__env, jclass clazz, jint mode, jint i1, jint i2, jint j1, jint j2, jlong __functionAddress) {
	glEvalMesh2PROC glEvalMesh2 = (glEvalMesh2PROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalMesh2(mode, i1, i2, j1, j2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalPoint1(JNIEnv *__env, jclass clazz, jint i, jlong __functionAddress) {
	glEvalPoint1PROC glEvalPoint1 = (glEvalPoint1PROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalPoint1(i);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalPoint2(JNIEnv *__env, jclass clazz, jint i, jint j, jlong __functionAddress) {
	glEvalPoint2PROC glEvalPoint2 = (glEvalPoint2PROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEvalPoint2(i, j);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFeedbackBuffer(JNIEnv *__env, jclass clazz, jint size, jint type, jlong bufferAddress, jlong __functionAddress) {
	GLfloat *buffer = (GLfloat *)(intptr_t)bufferAddress;
	glFeedbackBufferPROC glFeedbackBuffer = (glFeedbackBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFeedbackBuffer(size, type, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFinish(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glFinishPROC glFinish = (glFinishPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFinish();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFlush(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glFlushPROC glFlush = (glFlushPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFlush();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFogi(JNIEnv *__env, jclass clazz, jint pname, jint param, jlong __functionAddress) {
	glFogiPROC glFogi = (glFogiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogi(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFogiv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glFogivPROC glFogiv = (glFogivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogiv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFogf(JNIEnv *__env, jclass clazz, jint pname, jfloat param, jlong __functionAddress) {
	glFogfPROC glFogf = (glFogfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFogfv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glFogfvPROC glFogfv = (glFogfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFogfv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFrontFace(JNIEnv *__env, jclass clazz, jint dir, jlong __functionAddress) {
	glFrontFacePROC glFrontFace = (glFrontFacePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFrontFace(dir);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL11_nglGenLists(JNIEnv *__env, jclass clazz, jint s, jlong __functionAddress) {
	glGenListsPROC glGenLists = (glGenListsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGenLists(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGenTextures(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress, jlong __functionAddress) {
	GLuint *textures = (GLuint *)(intptr_t)texturesAddress;
	glGenTexturesPROC glGenTextures = (glGenTexturesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGenTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDeleteTextures(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress, jlong __functionAddress) {
	const GLuint *textures = (const GLuint *)(intptr_t)texturesAddress;
	glDeleteTexturesPROC glDeleteTextures = (glDeleteTexturesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glDeleteTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetClipPlane(JNIEnv *__env, jclass clazz, jint plane, jlong equationAddress, jlong __functionAddress) {
	GLdouble *equation = (GLdouble *)(intptr_t)equationAddress;
	glGetClipPlanePROC glGetClipPlane = (glGetClipPlanePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetClipPlane(plane, equation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetBooleanv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLboolean *params = (GLboolean *)(intptr_t)paramsAddress;
	glGetBooleanvPROC glGetBooleanv = (glGetBooleanvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetBooleanv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetFloatv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetFloatvPROC glGetFloatv = (glGetFloatvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetFloatv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetIntegerv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetIntegervPROC glGetIntegerv = (glGetIntegervPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetIntegerv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetDoublev(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLdouble *params = (GLdouble *)(intptr_t)paramsAddress;
	glGetDoublevPROC glGetDoublev = (glGetDoublevPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetDoublev(pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL11_nglGetError(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glGetErrorPROC glGetError = (glGetErrorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glGetError();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetLightiv(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetLightivPROC glGetLightiv = (glGetLightivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetLightiv(light, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetLightfv(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetLightfvPROC glGetLightfv = (glGetLightfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetLightfv(light, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMapiv(JNIEnv *__env, jclass clazz, jint target, jint query, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetMapivPROC glGetMapiv = (glGetMapivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMapiv(target, query, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMapfv(JNIEnv *__env, jclass clazz, jint target, jint query, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetMapfvPROC glGetMapfv = (glGetMapfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMapfv(target, query, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMapdv(JNIEnv *__env, jclass clazz, jint target, jint query, jlong dataAddress, jlong __functionAddress) {
	GLdouble *data = (GLdouble *)(intptr_t)dataAddress;
	glGetMapdvPROC glGetMapdv = (glGetMapdvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMapdv(target, query, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMaterialiv(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetMaterialivPROC glGetMaterialiv = (glGetMaterialivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMaterialiv(face, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMaterialfv(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetMaterialfvPROC glGetMaterialfv = (glGetMaterialfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetMaterialfv(face, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPixelMapfv(JNIEnv *__env, jclass clazz, jint map, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetPixelMapfvPROC glGetPixelMapfv = (glGetPixelMapfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPixelMapfv(map, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPixelMapusv(JNIEnv *__env, jclass clazz, jint map, jlong dataAddress, jlong __functionAddress) {
	GLushort *data = (GLushort *)(intptr_t)dataAddress;
	glGetPixelMapusvPROC glGetPixelMapusv = (glGetPixelMapusvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPixelMapusv(map, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPixelMapuiv(JNIEnv *__env, jclass clazz, jint map, jlong dataAddress, jlong __functionAddress) {
	GLuint *data = (GLuint *)(intptr_t)dataAddress;
	glGetPixelMapuivPROC glGetPixelMapuiv = (glGetPixelMapuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPixelMapuiv(map, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPointerv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLvoid **params = (GLvoid **)(intptr_t)paramsAddress;
	glGetPointervPROC glGetPointerv = (glGetPointervPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPointerv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPolygonStipple(JNIEnv *__env, jclass clazz, jlong patternAddress, jlong __functionAddress) {
	GLvoid *pattern = (GLvoid *)(intptr_t)patternAddress;
	glGetPolygonStipplePROC glGetPolygonStipple = (glGetPolygonStipplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetPolygonStipple(pattern);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL11_nglGetString(JNIEnv *__env, jclass clazz, jint name, jlong __functionAddress) {
	glGetStringPROC glGetString = (glGetStringPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)glGetString(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexEnviv(JNIEnv *__env, jclass clazz, jint env, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetTexEnvivPROC glGetTexEnviv = (glGetTexEnvivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexEnviv(env, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexEnvfv(JNIEnv *__env, jclass clazz, jint env, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetTexEnvfvPROC glGetTexEnvfv = (glGetTexEnvfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexEnvfv(env, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexGeniv(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLint *data = (GLint *)(intptr_t)dataAddress;
	glGetTexGenivPROC glGetTexGeniv = (glGetTexGenivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexGeniv(coord, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexGenfv(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLfloat *data = (GLfloat *)(intptr_t)dataAddress;
	glGetTexGenfvPROC glGetTexGenfv = (glGetTexGenfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexGenfv(coord, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexGendv(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong dataAddress, jlong __functionAddress) {
	GLdouble *data = (GLdouble *)(intptr_t)dataAddress;
	glGetTexGendvPROC glGetTexGendv = (glGetTexGendvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexGendv(coord, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexImage(JNIEnv *__env, jclass clazz, jint tex, jint level, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	GLvoid *pixels = (GLvoid *)(intptr_t)pixelsAddress;
	glGetTexImagePROC glGetTexImage = (glGetTexImagePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexImage(tex, level, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexLevelParameteriv(JNIEnv *__env, jclass clazz, jint target, jint level, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTexLevelParameterivPROC glGetTexLevelParameteriv = (glGetTexLevelParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexLevelParameteriv(target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexLevelParameterfv(JNIEnv *__env, jclass clazz, jint target, jint level, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetTexLevelParameterfvPROC glGetTexLevelParameterfv = (glGetTexLevelParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexLevelParameterfv(target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLint *params = (GLint *)(intptr_t)paramsAddress;
	glGetTexParameterivPROC glGetTexParameteriv = (glGetTexParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexParameterfv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	GLfloat *params = (GLfloat *)(intptr_t)paramsAddress;
	glGetTexParameterfvPROC glGetTexParameterfv = (glGetTexParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glGetTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglHint(JNIEnv *__env, jclass clazz, jint target, jint hint, jlong __functionAddress) {
	glHintPROC glHint = (glHintPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glHint(target, hint);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglInitNames(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glInitNamesPROC glInitNames = (glInitNamesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glInitNames();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglInterleavedArrays(JNIEnv *__env, jclass clazz, jint format, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const GLvoid *pointer = (const GLvoid *)(intptr_t)pointerAddress;
	glInterleavedArraysPROC glInterleavedArrays = (glInterleavedArraysPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glInterleavedArrays(format, stride, pointer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11_nglIsEnabled(JNIEnv *__env, jclass clazz, jint cap, jlong __functionAddress) {
	glIsEnabledPROC glIsEnabled = (glIsEnabledPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsEnabled(cap);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11_nglIsList(JNIEnv *__env, jclass clazz, jint list, jlong __functionAddress) {
	glIsListPROC glIsList = (glIsListPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsList(list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11_nglIsTexture(JNIEnv *__env, jclass clazz, jint texture, jlong __functionAddress) {
	glIsTexturePROC glIsTexture = (glIsTexturePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jboolean)glIsTexture(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightModeli(JNIEnv *__env, jclass clazz, jint pname, jint param, jlong __functionAddress) {
	glLightModeliPROC glLightModeli = (glLightModeliPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLightModeli(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightModelf(JNIEnv *__env, jclass clazz, jint pname, jfloat param, jlong __functionAddress) {
	glLightModelfPROC glLightModelf = (glLightModelfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLightModelf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightModeliv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glLightModelivPROC glLightModeliv = (glLightModelivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLightModeliv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightModelfv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glLightModelfvPROC glLightModelfv = (glLightModelfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLightModelfv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLighti(JNIEnv *__env, jclass clazz, jint light, jint pname, jint param, jlong __functionAddress) {
	glLightiPROC glLighti = (glLightiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLighti(light, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightf(JNIEnv *__env, jclass clazz, jint light, jint pname, jfloat param, jlong __functionAddress) {
	glLightfPROC glLightf = (glLightfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLightf(light, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightiv(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glLightivPROC glLightiv = (glLightivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLightiv(light, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightfv(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glLightfvPROC glLightfv = (glLightfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLightfv(light, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLineStipple(JNIEnv *__env, jclass clazz, jint factor, jshort pattern, jlong __functionAddress) {
	glLineStipplePROC glLineStipple = (glLineStipplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLineStipple(factor, pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLineWidth(JNIEnv *__env, jclass clazz, jfloat width, jlong __functionAddress) {
	glLineWidthPROC glLineWidth = (glLineWidthPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLineWidth(width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglListBase(JNIEnv *__env, jclass clazz, jint base, jlong __functionAddress) {
	glListBasePROC glListBase = (glListBasePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glListBase(base);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLoadMatrixf(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glLoadMatrixfPROC glLoadMatrixf = (glLoadMatrixfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLoadMatrixf(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLoadMatrixd(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLdouble *m = (const GLdouble *)(intptr_t)mAddress;
	glLoadMatrixdPROC glLoadMatrixd = (glLoadMatrixdPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLoadMatrixd(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLoadIdentity(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glLoadIdentityPROC glLoadIdentity = (glLoadIdentityPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLoadIdentity();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLoadName(JNIEnv *__env, jclass clazz, jint name, jlong __functionAddress) {
	glLoadNamePROC glLoadName = (glLoadNamePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLoadName(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLogicOp(JNIEnv *__env, jclass clazz, jint op, jlong __functionAddress) {
	glLogicOpPROC glLogicOp = (glLogicOpPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glLogicOp(op);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap1f(JNIEnv *__env, jclass clazz, jint target, jfloat u1, jfloat u2, jint stride, jint order, jlong pointsAddress, jlong __functionAddress) {
	const GLfloat *points = (const GLfloat *)(intptr_t)pointsAddress;
	glMap1fPROC glMap1f = (glMap1fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMap1f(target, u1, u2, stride, order, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap1d(JNIEnv *__env, jclass clazz, jint target, jdouble u1, jdouble u2, jint stride, jint order, jlong pointsAddress, jlong __functionAddress) {
	const GLdouble *points = (const GLdouble *)(intptr_t)pointsAddress;
	glMap1dPROC glMap1d = (glMap1dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMap1d(target, u1, u2, stride, order, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap2f(JNIEnv *__env, jclass clazz, jint target, jfloat u1, jfloat u2, jint ustride, jint uorder, jfloat v1, jfloat v2, jint vstride, jint vorder, jlong pointsAddress, jlong __functionAddress) {
	const GLfloat *points = (const GLfloat *)(intptr_t)pointsAddress;
	glMap2fPROC glMap2f = (glMap2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap2d(JNIEnv *__env, jclass clazz, jint target, jdouble u1, jdouble u2, jint ustride, jint uorder, jdouble v1, jdouble v2, jint vstride, jint vorder, jlong pointsAddress, jlong __functionAddress) {
	const GLdouble *points = (const GLdouble *)(intptr_t)pointsAddress;
	glMap2dPROC glMap2d = (glMap2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMapGrid1f(JNIEnv *__env, jclass clazz, jint n, jfloat u1, jfloat u2, jlong __functionAddress) {
	glMapGrid1fPROC glMapGrid1f = (glMapGrid1fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMapGrid1f(n, u1, u2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMapGrid1d(JNIEnv *__env, jclass clazz, jint n, jdouble u1, jdouble u2, jlong __functionAddress) {
	glMapGrid1dPROC glMapGrid1d = (glMapGrid1dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMapGrid1d(n, u1, u2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMapGrid2f(JNIEnv *__env, jclass clazz, jint un, jfloat u1, jfloat u2, jint vn, jfloat v1, jfloat v2, jlong __functionAddress) {
	glMapGrid2fPROC glMapGrid2f = (glMapGrid2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMapGrid2f(un, u1, u2, vn, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMapGrid2d(JNIEnv *__env, jclass clazz, jint un, jdouble u1, jdouble u2, jint vn, jdouble v1, jdouble v2, jlong __functionAddress) {
	glMapGrid2dPROC glMapGrid2d = (glMapGrid2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMapGrid2d(un, u1, u2, vn, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMateriali(JNIEnv *__env, jclass clazz, jint face, jint pname, jint param, jlong __functionAddress) {
	glMaterialiPROC glMateriali = (glMaterialiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMateriali(face, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMaterialf(JNIEnv *__env, jclass clazz, jint face, jint pname, jfloat param, jlong __functionAddress) {
	glMaterialfPROC glMaterialf = (glMaterialfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMaterialf(face, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMaterialiv(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glMaterialivPROC glMaterialiv = (glMaterialivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMaterialiv(face, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMaterialfv(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glMaterialfvPROC glMaterialfv = (glMaterialfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMaterialfv(face, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMatrixMode(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glMatrixModePROC glMatrixMode = (glMatrixModePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMatrixMode(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMultMatrixf(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLfloat *m = (const GLfloat *)(intptr_t)mAddress;
	glMultMatrixfPROC glMultMatrixf = (glMultMatrixfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultMatrixf(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMultMatrixd(JNIEnv *__env, jclass clazz, jlong mAddress, jlong __functionAddress) {
	const GLdouble *m = (const GLdouble *)(intptr_t)mAddress;
	glMultMatrixdPROC glMultMatrixd = (glMultMatrixdPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glMultMatrixd(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFrustum(JNIEnv *__env, jclass clazz, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f, jlong __functionAddress) {
	glFrustumPROC glFrustum = (glFrustumPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glFrustum(l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNewList(JNIEnv *__env, jclass clazz, jint n, jint mode, jlong __functionAddress) {
	glNewListPROC glNewList = (glNewListPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNewList(n, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEndList(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glEndListPROC glEndList = (glEndListPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glEndList();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3f(JNIEnv *__env, jclass clazz, jfloat nx, jfloat ny, jfloat nz, jlong __functionAddress) {
	glNormal3fPROC glNormal3f = (glNormal3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3f(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3b(JNIEnv *__env, jclass clazz, jbyte nx, jbyte ny, jbyte nz, jlong __functionAddress) {
	glNormal3bPROC glNormal3b = (glNormal3bPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3b(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3s(JNIEnv *__env, jclass clazz, jshort nx, jshort ny, jshort nz, jlong __functionAddress) {
	glNormal3sPROC glNormal3s = (glNormal3sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3s(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3i(JNIEnv *__env, jclass clazz, jint nx, jint ny, jint nz, jlong __functionAddress) {
	glNormal3iPROC glNormal3i = (glNormal3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3i(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3d(JNIEnv *__env, jclass clazz, jdouble nx, jdouble ny, jdouble nz, jlong __functionAddress) {
	glNormal3dPROC glNormal3d = (glNormal3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3d(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3fv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glNormal3fvPROC glNormal3fv = (glNormal3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3bv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLbyte *v = (const GLbyte *)(intptr_t)vAddress;
	glNormal3bvPROC glNormal3bv = (glNormal3bvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3bv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3sv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glNormal3svPROC glNormal3sv = (glNormal3svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3iv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glNormal3ivPROC glNormal3iv = (glNormal3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3dv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glNormal3dvPROC glNormal3dv = (glNormal3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormal3dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormalPointer(JNIEnv *__env, jclass clazz, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const GLvoid *pointer = (const GLvoid *)(intptr_t)pointerAddress;
	glNormalPointerPROC glNormalPointer = (glNormalPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glNormalPointer(type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglOrtho(JNIEnv *__env, jclass clazz, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f, jlong __functionAddress) {
	glOrthoPROC glOrtho = (glOrthoPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glOrtho(l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPassThrough(JNIEnv *__env, jclass clazz, jfloat token, jlong __functionAddress) {
	glPassThroughPROC glPassThrough = (glPassThroughPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPassThrough(token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelMapfv(JNIEnv *__env, jclass clazz, jint map, jint size, jlong valuesAddress, jlong __functionAddress) {
	const GLfloat *values = (const GLfloat *)(intptr_t)valuesAddress;
	glPixelMapfvPROC glPixelMapfv = (glPixelMapfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPixelMapfv(map, size, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelMapusv(JNIEnv *__env, jclass clazz, jint map, jint size, jlong valuesAddress, jlong __functionAddress) {
	const GLushort *values = (const GLushort *)(intptr_t)valuesAddress;
	glPixelMapusvPROC glPixelMapusv = (glPixelMapusvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPixelMapusv(map, size, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelMapuiv(JNIEnv *__env, jclass clazz, jint map, jint size, jlong valuesAddress, jlong __functionAddress) {
	const GLuint *values = (const GLuint *)(intptr_t)valuesAddress;
	glPixelMapuivPROC glPixelMapuiv = (glPixelMapuivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPixelMapuiv(map, size, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelStorei(JNIEnv *__env, jclass clazz, jint pname, jint param, jlong __functionAddress) {
	glPixelStoreiPROC glPixelStorei = (glPixelStoreiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPixelStorei(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelStoref(JNIEnv *__env, jclass clazz, jint pname, jint param, jlong __functionAddress) {
	glPixelStorefPROC glPixelStoref = (glPixelStorefPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPixelStoref(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelTransferi(JNIEnv *__env, jclass clazz, jint pname, jint param, jlong __functionAddress) {
	glPixelTransferiPROC glPixelTransferi = (glPixelTransferiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPixelTransferi(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelTransferf(JNIEnv *__env, jclass clazz, jint pname, jfloat param, jlong __functionAddress) {
	glPixelTransferfPROC glPixelTransferf = (glPixelTransferfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPixelTransferf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelZoom(JNIEnv *__env, jclass clazz, jfloat xfactor, jfloat yfactor, jlong __functionAddress) {
	glPixelZoomPROC glPixelZoom = (glPixelZoomPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPixelZoom(xfactor, yfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPointSize(JNIEnv *__env, jclass clazz, jfloat size, jlong __functionAddress) {
	glPointSizePROC glPointSize = (glPointSizePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPointSize(size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPolygonMode(JNIEnv *__env, jclass clazz, jint face, jint mode, jlong __functionAddress) {
	glPolygonModePROC glPolygonMode = (glPolygonModePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPolygonMode(face, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPolygonOffset(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units, jlong __functionAddress) {
	glPolygonOffsetPROC glPolygonOffset = (glPolygonOffsetPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPolygonOffset(factor, units);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPolygonStipple(JNIEnv *__env, jclass clazz, jlong patternAddress, jlong __functionAddress) {
	const GLubyte *pattern = (const GLubyte *)(intptr_t)patternAddress;
	glPolygonStipplePROC glPolygonStipple = (glPolygonStipplePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPolygonStipple(pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPushAttrib(JNIEnv *__env, jclass clazz, jint mask, jlong __functionAddress) {
	glPushAttribPROC glPushAttrib = (glPushAttribPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPushAttrib(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPushClientAttrib(JNIEnv *__env, jclass clazz, jint mask, jlong __functionAddress) {
	glPushClientAttribPROC glPushClientAttrib = (glPushClientAttribPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPushClientAttrib(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPopAttrib(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPopAttribPROC glPopAttrib = (glPopAttribPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPopAttrib();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPopClientAttrib(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPopClientAttribPROC glPopClientAttrib = (glPopClientAttribPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPopClientAttrib();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPopMatrix(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPopMatrixPROC glPopMatrix = (glPopMatrixPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPopMatrix();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPopName(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPopNamePROC glPopName = (glPopNamePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPopName();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPrioritizeTextures(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress, jlong prioritiesAddress, jlong __functionAddress) {
	const GLuint *textures = (const GLuint *)(intptr_t)texturesAddress;
	const GLfloat *priorities = (const GLfloat *)(intptr_t)prioritiesAddress;
	glPrioritizeTexturesPROC glPrioritizeTextures = (glPrioritizeTexturesPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPrioritizeTextures(n, textures, priorities);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPushMatrix(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
	glPushMatrixPROC glPushMatrix = (glPushMatrixPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPushMatrix();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPushName(JNIEnv *__env, jclass clazz, jint name, jlong __functionAddress) {
	glPushNamePROC glPushName = (glPushNamePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glPushName(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2i(JNIEnv *__env, jclass clazz, jint x, jint y, jlong __functionAddress) {
	glRasterPos2iPROC glRasterPos2i = (glRasterPos2iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos2i(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jlong __functionAddress) {
	glRasterPos2sPROC glRasterPos2s = (glRasterPos2sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos2s(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jlong __functionAddress) {
	glRasterPos2fPROC glRasterPos2f = (glRasterPos2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos2f(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jlong __functionAddress) {
	glRasterPos2dPROC glRasterPos2d = (glRasterPos2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos2d(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2iv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLint *coords = (const GLint *)(intptr_t)coordsAddress;
	glRasterPos2ivPROC glRasterPos2iv = (glRasterPos2ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos2iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2sv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLshort *coords = (const GLshort *)(intptr_t)coordsAddress;
	glRasterPos2svPROC glRasterPos2sv = (glRasterPos2svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos2sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2fv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLfloat *coords = (const GLfloat *)(intptr_t)coordsAddress;
	glRasterPos2fvPROC glRasterPos2fv = (glRasterPos2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos2fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2dv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLdouble *coords = (const GLdouble *)(intptr_t)coordsAddress;
	glRasterPos2dvPROC glRasterPos2dv = (glRasterPos2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos2dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z, jlong __functionAddress) {
	glRasterPos3iPROC glRasterPos3i = (glRasterPos3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos3i(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jlong __functionAddress) {
	glRasterPos3sPROC glRasterPos3s = (glRasterPos3sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos3s(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glRasterPos3fPROC glRasterPos3f = (glRasterPos3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos3f(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glRasterPos3dPROC glRasterPos3d = (glRasterPos3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos3d(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3iv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLint *coords = (const GLint *)(intptr_t)coordsAddress;
	glRasterPos3ivPROC glRasterPos3iv = (glRasterPos3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos3iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3sv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLshort *coords = (const GLshort *)(intptr_t)coordsAddress;
	glRasterPos3svPROC glRasterPos3sv = (glRasterPos3svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos3sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3fv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLfloat *coords = (const GLfloat *)(intptr_t)coordsAddress;
	glRasterPos3fvPROC glRasterPos3fv = (glRasterPos3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos3fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3dv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLdouble *coords = (const GLdouble *)(intptr_t)coordsAddress;
	glRasterPos3dvPROC glRasterPos3dv = (glRasterPos3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos3dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glRasterPos4iPROC glRasterPos4i = (glRasterPos4iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos4i(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jshort w, jlong __functionAddress) {
	glRasterPos4sPROC glRasterPos4s = (glRasterPos4sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos4s(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat w, jlong __functionAddress) {
	glRasterPos4fPROC glRasterPos4f = (glRasterPos4fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos4f(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glRasterPos4dPROC glRasterPos4d = (glRasterPos4dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos4d(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4iv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLint *coords = (const GLint *)(intptr_t)coordsAddress;
	glRasterPos4ivPROC glRasterPos4iv = (glRasterPos4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos4iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4sv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLshort *coords = (const GLshort *)(intptr_t)coordsAddress;
	glRasterPos4svPROC glRasterPos4sv = (glRasterPos4svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos4sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4fv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLfloat *coords = (const GLfloat *)(intptr_t)coordsAddress;
	glRasterPos4fvPROC glRasterPos4fv = (glRasterPos4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos4fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4dv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLdouble *coords = (const GLdouble *)(intptr_t)coordsAddress;
	glRasterPos4dvPROC glRasterPos4dv = (glRasterPos4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRasterPos4dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglReadBuffer(JNIEnv *__env, jclass clazz, jint src, jlong __functionAddress) {
	glReadBufferPROC glReadBuffer = (glReadBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReadBuffer(src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglReadPixels(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	GLvoid *pixels = (GLvoid *)(intptr_t)pixelsAddress;
	glReadPixelsPROC glReadPixels = (glReadPixelsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glReadPixels(x, y, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRecti(JNIEnv *__env, jclass clazz, jint x1, jint y1, jint x2, jint y2, jlong __functionAddress) {
	glRectiPROC glRecti = (glRectiPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRecti(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRects(JNIEnv *__env, jclass clazz, jshort x1, jshort y1, jshort x2, jshort y2, jlong __functionAddress) {
	glRectsPROC glRects = (glRectsPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRects(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectf(JNIEnv *__env, jclass clazz, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jlong __functionAddress) {
	glRectfPROC glRectf = (glRectfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRectf(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectd(JNIEnv *__env, jclass clazz, jdouble x1, jdouble y1, jdouble x2, jdouble y2, jlong __functionAddress) {
	glRectdPROC glRectd = (glRectdPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRectd(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectiv(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address, jlong __functionAddress) {
	const GLint *v1 = (const GLint *)(intptr_t)v1Address;
	const GLint *v2 = (const GLint *)(intptr_t)v2Address;
	glRectivPROC glRectiv = (glRectivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRectiv(v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectsv(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address, jlong __functionAddress) {
	const GLshort *v1 = (const GLshort *)(intptr_t)v1Address;
	const GLshort *v2 = (const GLshort *)(intptr_t)v2Address;
	glRectsvPROC glRectsv = (glRectsvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRectsv(v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectfv(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address, jlong __functionAddress) {
	const GLfloat *v1 = (const GLfloat *)(intptr_t)v1Address;
	const GLfloat *v2 = (const GLfloat *)(intptr_t)v2Address;
	glRectfvPROC glRectfv = (glRectfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRectfv(v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectdv(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address, jlong __functionAddress) {
	const GLdouble *v1 = (const GLdouble *)(intptr_t)v1Address;
	const GLdouble *v2 = (const GLdouble *)(intptr_t)v2Address;
	glRectdvPROC glRectdv = (glRectdvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRectdv(v1, v2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL11_nglRenderMode(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glRenderModePROC glRenderMode = (glRenderModePROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)glRenderMode(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRotatef(JNIEnv *__env, jclass clazz, jfloat angle, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glRotatefPROC glRotatef = (glRotatefPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRotatef(angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRotated(JNIEnv *__env, jclass clazz, jdouble angle, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glRotatedPROC glRotated = (glRotatedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glRotated(angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglScalef(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glScalefPROC glScalef = (glScalefPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glScalef(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglScaled(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glScaledPROC glScaled = (glScaledPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glScaled(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglScissor(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glScissorPROC glScissor = (glScissorPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glScissor(x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglSelectBuffer(JNIEnv *__env, jclass clazz, jint size, jlong bufferAddress, jlong __functionAddress) {
	GLuint *buffer = (GLuint *)(intptr_t)bufferAddress;
	glSelectBufferPROC glSelectBuffer = (glSelectBufferPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glSelectBuffer(size, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglShadeModel(JNIEnv *__env, jclass clazz, jint mode, jlong __functionAddress) {
	glShadeModelPROC glShadeModel = (glShadeModelPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glShadeModel(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglStencilFunc(JNIEnv *__env, jclass clazz, jint func, jint ref, jint mask, jlong __functionAddress) {
	glStencilFuncPROC glStencilFunc = (glStencilFuncPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilFunc(func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglStencilMask(JNIEnv *__env, jclass clazz, jint mask, jlong __functionAddress) {
	glStencilMaskPROC glStencilMask = (glStencilMaskPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilMask(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglStencilOp(JNIEnv *__env, jclass clazz, jint sfail, jint dpfail, jint dppass, jlong __functionAddress) {
	glStencilOpPROC glStencilOp = (glStencilOpPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glStencilOp(sfail, dpfail, dppass);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1f(JNIEnv *__env, jclass clazz, jfloat s, jlong __functionAddress) {
	glTexCoord1fPROC glTexCoord1f = (glTexCoord1fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord1f(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1s(JNIEnv *__env, jclass clazz, jshort s, jlong __functionAddress) {
	glTexCoord1sPROC glTexCoord1s = (glTexCoord1sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord1s(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1i(JNIEnv *__env, jclass clazz, jint s, jlong __functionAddress) {
	glTexCoord1iPROC glTexCoord1i = (glTexCoord1iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord1i(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1d(JNIEnv *__env, jclass clazz, jdouble s, jlong __functionAddress) {
	glTexCoord1dPROC glTexCoord1d = (glTexCoord1dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord1d(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1fv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glTexCoord1fvPROC glTexCoord1fv = (glTexCoord1fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord1fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1sv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glTexCoord1svPROC glTexCoord1sv = (glTexCoord1svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord1sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1iv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glTexCoord1ivPROC glTexCoord1iv = (glTexCoord1ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord1iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1dv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glTexCoord1dvPROC glTexCoord1dv = (glTexCoord1dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord1dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2f(JNIEnv *__env, jclass clazz, jfloat s, jfloat t, jlong __functionAddress) {
	glTexCoord2fPROC glTexCoord2f = (glTexCoord2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord2f(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2s(JNIEnv *__env, jclass clazz, jshort s, jshort t, jlong __functionAddress) {
	glTexCoord2sPROC glTexCoord2s = (glTexCoord2sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord2s(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2i(JNIEnv *__env, jclass clazz, jint s, jint t, jlong __functionAddress) {
	glTexCoord2iPROC glTexCoord2i = (glTexCoord2iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord2i(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2d(JNIEnv *__env, jclass clazz, jdouble s, jdouble t, jlong __functionAddress) {
	glTexCoord2dPROC glTexCoord2d = (glTexCoord2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord2d(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2fv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glTexCoord2fvPROC glTexCoord2fv = (glTexCoord2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord2fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2sv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glTexCoord2svPROC glTexCoord2sv = (glTexCoord2svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord2sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2iv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glTexCoord2ivPROC glTexCoord2iv = (glTexCoord2ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord2iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2dv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glTexCoord2dvPROC glTexCoord2dv = (glTexCoord2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord2dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3f(JNIEnv *__env, jclass clazz, jfloat s, jfloat t, jfloat r, jlong __functionAddress) {
	glTexCoord3fPROC glTexCoord3f = (glTexCoord3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord3f(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3s(JNIEnv *__env, jclass clazz, jshort s, jshort t, jshort r, jlong __functionAddress) {
	glTexCoord3sPROC glTexCoord3s = (glTexCoord3sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord3s(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3i(JNIEnv *__env, jclass clazz, jint s, jint t, jint r, jlong __functionAddress) {
	glTexCoord3iPROC glTexCoord3i = (glTexCoord3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord3i(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3d(JNIEnv *__env, jclass clazz, jdouble s, jdouble t, jdouble r, jlong __functionAddress) {
	glTexCoord3dPROC glTexCoord3d = (glTexCoord3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord3d(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3fv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glTexCoord3fvPROC glTexCoord3fv = (glTexCoord3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord3fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3sv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glTexCoord3svPROC glTexCoord3sv = (glTexCoord3svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord3sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3iv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glTexCoord3ivPROC glTexCoord3iv = (glTexCoord3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord3iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3dv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glTexCoord3dvPROC glTexCoord3dv = (glTexCoord3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord3dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4f(JNIEnv *__env, jclass clazz, jfloat s, jfloat t, jfloat r, jfloat q, jlong __functionAddress) {
	glTexCoord4fPROC glTexCoord4f = (glTexCoord4fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord4f(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4s(JNIEnv *__env, jclass clazz, jshort s, jshort t, jshort r, jshort q, jlong __functionAddress) {
	glTexCoord4sPROC glTexCoord4s = (glTexCoord4sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord4s(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4i(JNIEnv *__env, jclass clazz, jint s, jint t, jint r, jint q, jlong __functionAddress) {
	glTexCoord4iPROC glTexCoord4i = (glTexCoord4iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord4i(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4d(JNIEnv *__env, jclass clazz, jdouble s, jdouble t, jdouble r, jdouble q, jlong __functionAddress) {
	glTexCoord4dPROC glTexCoord4d = (glTexCoord4dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord4d(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4fv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLfloat *v = (const GLfloat *)(intptr_t)vAddress;
	glTexCoord4fvPROC glTexCoord4fv = (glTexCoord4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord4fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4sv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLshort *v = (const GLshort *)(intptr_t)vAddress;
	glTexCoord4svPROC glTexCoord4sv = (glTexCoord4svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord4sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4iv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLint *v = (const GLint *)(intptr_t)vAddress;
	glTexCoord4ivPROC glTexCoord4iv = (glTexCoord4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord4iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4dv(JNIEnv *__env, jclass clazz, jlong vAddress, jlong __functionAddress) {
	const GLdouble *v = (const GLdouble *)(intptr_t)vAddress;
	glTexCoord4dvPROC glTexCoord4dv = (glTexCoord4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoord4dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoordPointer(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const GLvoid *pointer = (const GLvoid *)(intptr_t)pointerAddress;
	glTexCoordPointerPROC glTexCoordPointer = (glTexCoordPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexCoordPointer(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexEnvi(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param, jlong __functionAddress) {
	glTexEnviPROC glTexEnvi = (glTexEnviPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexEnvi(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexEnviv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glTexEnvivPROC glTexEnviv = (glTexEnvivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexEnviv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexEnvf(JNIEnv *__env, jclass clazz, jint target, jint pname, jfloat param, jlong __functionAddress) {
	glTexEnvfPROC glTexEnvf = (glTexEnvfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexEnvf(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexEnvfv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glTexEnvfvPROC glTexEnvfv = (glTexEnvfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexEnvfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGeni(JNIEnv *__env, jclass clazz, jint coord, jint pname, jint param, jlong __functionAddress) {
	glTexGeniPROC glTexGeni = (glTexGeniPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexGeni(coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGeniv(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glTexGenivPROC glTexGeniv = (glTexGenivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexGeniv(coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGenf(JNIEnv *__env, jclass clazz, jint coord, jint pname, jfloat param, jlong __functionAddress) {
	glTexGenfPROC glTexGenf = (glTexGenfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexGenf(coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGenfv(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glTexGenfvPROC glTexGenfv = (glTexGenfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexGenfv(coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGend(JNIEnv *__env, jclass clazz, jint coord, jint pname, jdouble param, jlong __functionAddress) {
	glTexGendPROC glTexGend = (glTexGendPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexGend(coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGendv(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLdouble *params = (const GLdouble *)(intptr_t)paramsAddress;
	glTexGendvPROC glTexGendv = (glTexGendvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexGendv(coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const GLvoid *pixels = (const GLvoid *)(intptr_t)pixelsAddress;
	glTexImage2DPROC glTexImage2D = (glTexImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint border, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const GLvoid *pixels = (const GLvoid *)(intptr_t)pixelsAddress;
	glTexImage1DPROC glTexImage1D = (glTexImage1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglCopyTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalFormat, jint x, jint y, jint width, jint height, jint border, jlong __functionAddress) {
	glCopyTexImage2DPROC glCopyTexImage2D = (glCopyTexImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTexImage2D(target, level, internalFormat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglCopyTexImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalFormat, jint x, jint y, jint width, jint border, jlong __functionAddress) {
	glCopyTexImage1DPROC glCopyTexImage1D = (glCopyTexImage1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTexImage1D(target, level, internalFormat, x, y, width, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglCopyTexSubImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint x, jint y, jint width, jlong __functionAddress) {
	glCopyTexSubImage1DPROC glCopyTexSubImage1D = (glCopyTexSubImage1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTexSubImage1D(target, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglCopyTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height, jlong __functionAddress) {
	glCopyTexSubImage2DPROC glCopyTexSubImage2D = (glCopyTexSubImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param, jlong __functionAddress) {
	glTexParameteriPROC glTexParameteri = (glTexParameteriPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexParameteriv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLint *params = (const GLint *)(intptr_t)paramsAddress;
	glTexParameterivPROC glTexParameteriv = (glTexParameterivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexParameterf(JNIEnv *__env, jclass clazz, jint target, jint pname, jfloat param, jlong __functionAddress) {
	glTexParameterfPROC glTexParameterf = (glTexParameterfPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterf(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexParameterfv(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress, jlong __functionAddress) {
	const GLfloat *params = (const GLfloat *)(intptr_t)paramsAddress;
	glTexParameterfvPROC glTexParameterfv = (glTexParameterfvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexSubImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const GLvoid *pixels = (const GLvoid *)(intptr_t)pixelsAddress;
	glTexSubImage1DPROC glTexSubImage1D = (glTexSubImage1DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress, jlong __functionAddress) {
	const GLvoid *pixels = (const GLvoid *)(intptr_t)pixelsAddress;
	glTexSubImage2DPROC glTexSubImage2D = (glTexSubImage2DPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTranslatef(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glTranslatefPROC glTranslatef = (glTranslatefPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTranslatef(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTranslated(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glTranslatedPROC glTranslated = (glTranslatedPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glTranslated(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jlong __functionAddress) {
	glVertex2fPROC glVertex2f = (glVertex2fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex2f(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jlong __functionAddress) {
	glVertex2sPROC glVertex2s = (glVertex2sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex2s(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2i(JNIEnv *__env, jclass clazz, jint x, jint y, jlong __functionAddress) {
	glVertex2iPROC glVertex2i = (glVertex2iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex2i(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jlong __functionAddress) {
	glVertex2dPROC glVertex2d = (glVertex2dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex2d(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2fv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLfloat *coords = (const GLfloat *)(intptr_t)coordsAddress;
	glVertex2fvPROC glVertex2fv = (glVertex2fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex2fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2sv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLshort *coords = (const GLshort *)(intptr_t)coordsAddress;
	glVertex2svPROC glVertex2sv = (glVertex2svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex2sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2iv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLint *coords = (const GLint *)(intptr_t)coordsAddress;
	glVertex2ivPROC glVertex2iv = (glVertex2ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex2iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2dv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLdouble *coords = (const GLdouble *)(intptr_t)coordsAddress;
	glVertex2dvPROC glVertex2dv = (glVertex2dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex2dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jlong __functionAddress) {
	glVertex3fPROC glVertex3f = (glVertex3fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex3f(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jlong __functionAddress) {
	glVertex3sPROC glVertex3s = (glVertex3sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex3s(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z, jlong __functionAddress) {
	glVertex3iPROC glVertex3i = (glVertex3iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex3i(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jlong __functionAddress) {
	glVertex3dPROC glVertex3d = (glVertex3dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex3d(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3fv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLfloat *coords = (const GLfloat *)(intptr_t)coordsAddress;
	glVertex3fvPROC glVertex3fv = (glVertex3fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex3fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3sv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLshort *coords = (const GLshort *)(intptr_t)coordsAddress;
	glVertex3svPROC glVertex3sv = (glVertex3svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex3sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3iv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLint *coords = (const GLint *)(intptr_t)coordsAddress;
	glVertex3ivPROC glVertex3iv = (glVertex3ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex3iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3dv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLdouble *coords = (const GLdouble *)(intptr_t)coordsAddress;
	glVertex3dvPROC glVertex3dv = (glVertex3dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex3dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat w, jlong __functionAddress) {
	glVertex4fPROC glVertex4f = (glVertex4fPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex4f(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jshort w, jlong __functionAddress) {
	glVertex4sPROC glVertex4s = (glVertex4sPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex4s(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z, jint w, jlong __functionAddress) {
	glVertex4iPROC glVertex4i = (glVertex4iPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex4i(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jdouble w, jlong __functionAddress) {
	glVertex4dPROC glVertex4d = (glVertex4dPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex4d(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4fv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLfloat *coords = (const GLfloat *)(intptr_t)coordsAddress;
	glVertex4fvPROC glVertex4fv = (glVertex4fvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex4fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4sv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLshort *coords = (const GLshort *)(intptr_t)coordsAddress;
	glVertex4svPROC glVertex4sv = (glVertex4svPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex4sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4iv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLint *coords = (const GLint *)(intptr_t)coordsAddress;
	glVertex4ivPROC glVertex4iv = (glVertex4ivPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex4iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4dv(JNIEnv *__env, jclass clazz, jlong coordsAddress, jlong __functionAddress) {
	const GLdouble *coords = (const GLdouble *)(intptr_t)coordsAddress;
	glVertex4dvPROC glVertex4dv = (glVertex4dvPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertex4dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertexPointer(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress, jlong __functionAddress) {
	const GLvoid *pointer = (const GLvoid *)(intptr_t)pointerAddress;
	glVertexPointerPROC glVertexPointer = (glVertexPointerPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glVertexPointer(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglViewport(JNIEnv *__env, jclass clazz, jint x, jint y, jint w, jint h, jlong __functionAddress) {
	glViewportPROC glViewport = (glViewportPROC)(intptr_t)__functionAddress;
	UNUSED_PARAMS(__env, clazz)
	glViewport(x, y, w, h);
}

EXTERN_C_EXIT
