/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glEnablePROC) (jint);
typedef void (APIENTRY *glDisablePROC) (jint);
typedef void (APIENTRY *glAccumPROC) (jint, jfloat);
typedef void (APIENTRY *glAlphaFuncPROC) (jint, jfloat);
typedef jboolean (APIENTRY *glAreTexturesResidentPROC) (jint, const intptr_t, intptr_t);
typedef void (APIENTRY *glArrayElementPROC) (jint);
typedef void (APIENTRY *glBeginPROC) (jint);
typedef void (APIENTRY *glBindTexturePROC) (jint, jint);
typedef void (APIENTRY *glBitmapPROC) (jint, jint, jfloat, jfloat, jfloat, jfloat, const intptr_t);
typedef void (APIENTRY *glBlendFuncPROC) (jint, jint);
typedef void (APIENTRY *glCallListPROC) (jint);
typedef void (APIENTRY *glCallListsPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glClearPROC) (jint);
typedef void (APIENTRY *glClearAccumPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glClearColorPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glClearDepthPROC) (jdouble);
typedef void (APIENTRY *glClearIndexPROC) (jfloat);
typedef void (APIENTRY *glClearStencilPROC) (jint);
typedef void (APIENTRY *glClipPlanePROC) (jint, const intptr_t);
typedef void (APIENTRY *glColor3bPROC) (jbyte, jbyte, jbyte);
typedef void (APIENTRY *glColor3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glColor3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glColor3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glColor3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glColor3ubPROC) (jbyte, jbyte, jbyte);
typedef void (APIENTRY *glColor3usPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glColor3uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glColor3bvPROC) (const intptr_t);
typedef void (APIENTRY *glColor3svPROC) (const intptr_t);
typedef void (APIENTRY *glColor3ivPROC) (const intptr_t);
typedef void (APIENTRY *glColor3fvPROC) (const intptr_t);
typedef void (APIENTRY *glColor3dvPROC) (const intptr_t);
typedef void (APIENTRY *glColor3ubvPROC) (const intptr_t);
typedef void (APIENTRY *glColor3usvPROC) (const intptr_t);
typedef void (APIENTRY *glColor3uivPROC) (const intptr_t);
typedef void (APIENTRY *glColor4bPROC) (jbyte, jbyte, jbyte, jbyte);
typedef void (APIENTRY *glColor4sPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glColor4iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glColor4fPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glColor4dPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glColor4ubPROC) (jbyte, jbyte, jbyte, jbyte);
typedef void (APIENTRY *glColor4usPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glColor4uiPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glColor4bvPROC) (const intptr_t);
typedef void (APIENTRY *glColor4svPROC) (const intptr_t);
typedef void (APIENTRY *glColor4ivPROC) (const intptr_t);
typedef void (APIENTRY *glColor4fvPROC) (const intptr_t);
typedef void (APIENTRY *glColor4dvPROC) (const intptr_t);
typedef void (APIENTRY *glColor4ubvPROC) (const intptr_t);
typedef void (APIENTRY *glColor4usvPROC) (const intptr_t);
typedef void (APIENTRY *glColor4uivPROC) (const intptr_t);
typedef void (APIENTRY *glColorMaskPROC) (jboolean, jboolean, jboolean, jboolean);
typedef void (APIENTRY *glColorMaterialPROC) (jint, jint);
typedef void (APIENTRY *glColorPointerPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCopyPixelsPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCullFacePROC) (jint);
typedef void (APIENTRY *glDeleteListsPROC) (jint, jint);
typedef void (APIENTRY *glDepthFuncPROC) (jint);
typedef void (APIENTRY *glDepthMaskPROC) (jboolean);
typedef void (APIENTRY *glDepthRangePROC) (jdouble, jdouble);
typedef void (APIENTRY *glDisableClientStatePROC) (jint);
typedef void (APIENTRY *glDrawArraysPROC) (jint, jint, jint);
typedef void (APIENTRY *glDrawBufferPROC) (jint);
typedef void (APIENTRY *glDrawElementsPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glDrawPixelsPROC) (jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glEdgeFlagPROC) (jboolean);
typedef void (APIENTRY *glEdgeFlagvPROC) (const intptr_t);
typedef void (APIENTRY *glEdgeFlagPointerPROC) (jint, const intptr_t);
typedef void (APIENTRY *glEnableClientStatePROC) (jint);
typedef void (APIENTRY *glEndPROC) (void);
typedef void (APIENTRY *glEvalCoord1fPROC) (jfloat);
typedef void (APIENTRY *glEvalCoord1fvPROC) (const intptr_t);
typedef void (APIENTRY *glEvalCoord1dPROC) (jdouble);
typedef void (APIENTRY *glEvalCoord1dvPROC) (const intptr_t);
typedef void (APIENTRY *glEvalCoord2fPROC) (jfloat, jfloat);
typedef void (APIENTRY *glEvalCoord2fvPROC) (const intptr_t);
typedef void (APIENTRY *glEvalCoord2dPROC) (jdouble, jdouble);
typedef void (APIENTRY *glEvalCoord2dvPROC) (const intptr_t);
typedef void (APIENTRY *glEvalMesh1PROC) (jint, jint, jint);
typedef void (APIENTRY *glEvalMesh2PROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glEvalPoint1PROC) (jint);
typedef void (APIENTRY *glEvalPoint2PROC) (jint, jint);
typedef void (APIENTRY *glFeedbackBufferPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glFinishPROC) (void);
typedef void (APIENTRY *glFlushPROC) (void);
typedef void (APIENTRY *glFogiPROC) (jint, jint);
typedef void (APIENTRY *glFogivPROC) (jint, const intptr_t);
typedef void (APIENTRY *glFogfPROC) (jint, jfloat);
typedef void (APIENTRY *glFogfvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glFrontFacePROC) (jint);
typedef jint (APIENTRY *glGenListsPROC) (jint);
typedef void (APIENTRY *glGenTexturesPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteTexturesPROC) (jint, const intptr_t);
typedef void (APIENTRY *glGetClipPlanePROC) (jint, intptr_t);
typedef void (APIENTRY *glGetBooleanvPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetFloatvPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetIntegervPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetDoublevPROC) (jint, intptr_t);
typedef jint (APIENTRY *glGetErrorPROC) (void);
typedef void (APIENTRY *glGetLightivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetLightfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetMapivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetMapfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetMapdvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetMaterialivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetMaterialfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetPixelMapfvPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetPixelMapusvPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetPixelMapuivPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetPointervPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetPolygonStipplePROC) (intptr_t);
typedef intptr_t (APIENTRY *glGetStringPROC) (jint);
typedef void (APIENTRY *glGetTexEnvivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexEnvfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexGenivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexGenfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexGendvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexImagePROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexLevelParameterivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexLevelParameterfvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexParameterfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glHintPROC) (jint, jint);
typedef void (APIENTRY *glIndexiPROC) (jint);
typedef void (APIENTRY *glIndexubPROC) (jbyte);
typedef void (APIENTRY *glIndexsPROC) (jshort);
typedef void (APIENTRY *glIndexfPROC) (jfloat);
typedef void (APIENTRY *glIndexdPROC) (jdouble);
typedef void (APIENTRY *glIndexivPROC) (const intptr_t);
typedef void (APIENTRY *glIndexubvPROC) (const intptr_t);
typedef void (APIENTRY *glIndexsvPROC) (const intptr_t);
typedef void (APIENTRY *glIndexfvPROC) (const intptr_t);
typedef void (APIENTRY *glIndexdvPROC) (const intptr_t);
typedef void (APIENTRY *glIndexMaskPROC) (jint);
typedef void (APIENTRY *glIndexPointerPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glInitNamesPROC) (void);
typedef void (APIENTRY *glInterleavedArraysPROC) (jint, jint, const intptr_t);
typedef jboolean (APIENTRY *glIsEnabledPROC) (jint);
typedef jboolean (APIENTRY *glIsListPROC) (jint);
typedef jboolean (APIENTRY *glIsTexturePROC) (jint);
typedef void (APIENTRY *glLightModeliPROC) (jint, jint);
typedef void (APIENTRY *glLightModelfPROC) (jint, jfloat);
typedef void (APIENTRY *glLightModelivPROC) (jint, const intptr_t);
typedef void (APIENTRY *glLightModelfvPROC) (jint, const intptr_t);
typedef void (APIENTRY *glLightiPROC) (jint, jint, jint);
typedef void (APIENTRY *glLightfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glLightivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glLightfvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glLineStipplePROC) (jint, jshort);
typedef void (APIENTRY *glLineWidthPROC) (jfloat);
typedef void (APIENTRY *glListBasePROC) (jint);
typedef void (APIENTRY *glLoadMatrixfPROC) (const intptr_t);
typedef void (APIENTRY *glLoadMatrixdPROC) (const intptr_t);
typedef void (APIENTRY *glLoadIdentityPROC) (void);
typedef void (APIENTRY *glLoadNamePROC) (jint);
typedef void (APIENTRY *glLogicOpPROC) (jint);
typedef void (APIENTRY *glMap1fPROC) (jint, jfloat, jfloat, jint, jint, const intptr_t);
typedef void (APIENTRY *glMap1dPROC) (jint, jdouble, jdouble, jint, jint, const intptr_t);
typedef void (APIENTRY *glMap2fPROC) (jint, jfloat, jfloat, jint, jint, jfloat, jfloat, jint, jint, const intptr_t);
typedef void (APIENTRY *glMap2dPROC) (jint, jdouble, jdouble, jint, jint, jdouble, jdouble, jint, jint, const intptr_t);
typedef void (APIENTRY *glMapGrid1fPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glMapGrid1dPROC) (jint, jdouble, jdouble);
typedef void (APIENTRY *glMapGrid2fPROC) (jint, jfloat, jfloat, jint, jfloat, jfloat);
typedef void (APIENTRY *glMapGrid2dPROC) (jint, jdouble, jdouble, jint, jdouble, jdouble);
typedef void (APIENTRY *glMaterialiPROC) (jint, jint, jint);
typedef void (APIENTRY *glMaterialfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glMaterialivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glMaterialfvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glMatrixModePROC) (jint);
typedef void (APIENTRY *glMultMatrixfPROC) (const intptr_t);
typedef void (APIENTRY *glMultMatrixdPROC) (const intptr_t);
typedef void (APIENTRY *glFrustumPROC) (jdouble, jdouble, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glNewListPROC) (jint, jint);
typedef void (APIENTRY *glEndListPROC) (void);
typedef void (APIENTRY *glNormal3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glNormal3bPROC) (jbyte, jbyte, jbyte);
typedef void (APIENTRY *glNormal3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glNormal3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glNormal3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glNormal3fvPROC) (const intptr_t);
typedef void (APIENTRY *glNormal3bvPROC) (const intptr_t);
typedef void (APIENTRY *glNormal3svPROC) (const intptr_t);
typedef void (APIENTRY *glNormal3ivPROC) (const intptr_t);
typedef void (APIENTRY *glNormal3dvPROC) (const intptr_t);
typedef void (APIENTRY *glNormalPointerPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glOrthoPROC) (jdouble, jdouble, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glPassThroughPROC) (jfloat);
typedef void (APIENTRY *glPixelMapfvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glPixelMapusvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glPixelMapuivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glPixelStoreiPROC) (jint, jint);
typedef void (APIENTRY *glPixelStorefPROC) (jint, jfloat);
typedef void (APIENTRY *glPixelTransferiPROC) (jint, jint);
typedef void (APIENTRY *glPixelTransferfPROC) (jint, jfloat);
typedef void (APIENTRY *glPixelZoomPROC) (jfloat, jfloat);
typedef void (APIENTRY *glPointSizePROC) (jfloat);
typedef void (APIENTRY *glPolygonModePROC) (jint, jint);
typedef void (APIENTRY *glPolygonOffsetPROC) (jfloat, jfloat);
typedef void (APIENTRY *glPolygonStipplePROC) (const intptr_t);
typedef void (APIENTRY *glPushAttribPROC) (jint);
typedef void (APIENTRY *glPushClientAttribPROC) (jint);
typedef void (APIENTRY *glPopAttribPROC) (void);
typedef void (APIENTRY *glPopClientAttribPROC) (void);
typedef void (APIENTRY *glPopMatrixPROC) (void);
typedef void (APIENTRY *glPopNamePROC) (void);
typedef void (APIENTRY *glPrioritizeTexturesPROC) (jint, const intptr_t, const intptr_t);
typedef void (APIENTRY *glPushMatrixPROC) (void);
typedef void (APIENTRY *glPushNamePROC) (jint);
typedef void (APIENTRY *glRasterPos2iPROC) (jint, jint);
typedef void (APIENTRY *glRasterPos2sPROC) (jshort, jshort);
typedef void (APIENTRY *glRasterPos2fPROC) (jfloat, jfloat);
typedef void (APIENTRY *glRasterPos2dPROC) (jdouble, jdouble);
typedef void (APIENTRY *glRasterPos2ivPROC) (const intptr_t);
typedef void (APIENTRY *glRasterPos2svPROC) (const intptr_t);
typedef void (APIENTRY *glRasterPos2fvPROC) (const intptr_t);
typedef void (APIENTRY *glRasterPos2dvPROC) (const intptr_t);
typedef void (APIENTRY *glRasterPos3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glRasterPos3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glRasterPos3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glRasterPos3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glRasterPos3ivPROC) (const intptr_t);
typedef void (APIENTRY *glRasterPos3svPROC) (const intptr_t);
typedef void (APIENTRY *glRasterPos3fvPROC) (const intptr_t);
typedef void (APIENTRY *glRasterPos3dvPROC) (const intptr_t);
typedef void (APIENTRY *glRasterPos4iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glRasterPos4sPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glRasterPos4fPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glRasterPos4dPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glRasterPos4ivPROC) (const intptr_t);
typedef void (APIENTRY *glRasterPos4svPROC) (const intptr_t);
typedef void (APIENTRY *glRasterPos4fvPROC) (const intptr_t);
typedef void (APIENTRY *glRasterPos4dvPROC) (const intptr_t);
typedef void (APIENTRY *glReadBufferPROC) (jint);
typedef void (APIENTRY *glReadPixelsPROC) (jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glRectiPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glRectsPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glRectfPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glRectdPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glRectivPROC) (const intptr_t, const intptr_t);
typedef void (APIENTRY *glRectsvPROC) (const intptr_t, const intptr_t);
typedef void (APIENTRY *glRectfvPROC) (const intptr_t, const intptr_t);
typedef void (APIENTRY *glRectdvPROC) (const intptr_t, const intptr_t);
typedef jint (APIENTRY *glRenderModePROC) (jint);
typedef void (APIENTRY *glRotatefPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glRotatedPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glScalefPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glScaledPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glScissorPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glSelectBufferPROC) (jint, intptr_t);
typedef void (APIENTRY *glShadeModelPROC) (jint);
typedef void (APIENTRY *glStencilFuncPROC) (jint, jint, jint);
typedef void (APIENTRY *glStencilMaskPROC) (jint);
typedef void (APIENTRY *glStencilOpPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexCoord1fPROC) (jfloat);
typedef void (APIENTRY *glTexCoord1sPROC) (jshort);
typedef void (APIENTRY *glTexCoord1iPROC) (jint);
typedef void (APIENTRY *glTexCoord1dPROC) (jdouble);
typedef void (APIENTRY *glTexCoord1fvPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord1svPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord1ivPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord1dvPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord2fPROC) (jfloat, jfloat);
typedef void (APIENTRY *glTexCoord2sPROC) (jshort, jshort);
typedef void (APIENTRY *glTexCoord2iPROC) (jint, jint);
typedef void (APIENTRY *glTexCoord2dPROC) (jdouble, jdouble);
typedef void (APIENTRY *glTexCoord2fvPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord2svPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord2ivPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord2dvPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glTexCoord3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glTexCoord3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexCoord3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glTexCoord3fvPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord3svPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord3ivPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord3dvPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord4fPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glTexCoord4sPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glTexCoord4iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTexCoord4dPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glTexCoord4fvPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord4svPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord4ivPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoord4dvPROC) (const intptr_t);
typedef void (APIENTRY *glTexCoordPointerPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTexEnviPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexEnvivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glTexEnvfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glTexEnvfvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glTexGeniPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexGenivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glTexGenfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glTexGenfvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glTexGendPROC) (jint, jint, jdouble);
typedef void (APIENTRY *glTexGendvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glTexImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTexImage1DPROC) (jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glCopyTexImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTexImage1DPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTexSubImage1DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTexSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTexParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexParameterivPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glTexParameterfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glTexParameterfvPROC) (jint, jint, const intptr_t);
typedef void (APIENTRY *glTexSubImage1DPROC) (jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTexSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glTranslatefPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glTranslatedPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertex2fPROC) (jfloat, jfloat);
typedef void (APIENTRY *glVertex2sPROC) (jshort, jshort);
typedef void (APIENTRY *glVertex2iPROC) (jint, jint);
typedef void (APIENTRY *glVertex2dPROC) (jdouble, jdouble);
typedef void (APIENTRY *glVertex2fvPROC) (const intptr_t);
typedef void (APIENTRY *glVertex2svPROC) (const intptr_t);
typedef void (APIENTRY *glVertex2ivPROC) (const intptr_t);
typedef void (APIENTRY *glVertex2dvPROC) (const intptr_t);
typedef void (APIENTRY *glVertex3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertex3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glVertex3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertex3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertex3fvPROC) (const intptr_t);
typedef void (APIENTRY *glVertex3svPROC) (const intptr_t);
typedef void (APIENTRY *glVertex3ivPROC) (const intptr_t);
typedef void (APIENTRY *glVertex3dvPROC) (const intptr_t);
typedef void (APIENTRY *glVertex4fPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertex4sPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glVertex4iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glVertex4dPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertex4fvPROC) (const intptr_t);
typedef void (APIENTRY *glVertex4svPROC) (const intptr_t);
typedef void (APIENTRY *glVertex4ivPROC) (const intptr_t);
typedef void (APIENTRY *glVertex4dvPROC) (const intptr_t);
typedef void (APIENTRY *glVertexPointerPROC) (jint, jint, jint, const intptr_t);
typedef void (APIENTRY *glViewportPROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEnable(JNIEnv *__env, jclass clazz, jint target) {
    glEnablePROC glEnable = (glEnablePROC)tlsGetFunction(388);
    UNUSED_PARAM(clazz)
    glEnable(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glDisable(JNIEnv *__env, jclass clazz, jint target) {
    glDisablePROC glDisable = (glDisablePROC)tlsGetFunction(338);
    UNUSED_PARAM(clazz)
    glDisable(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glAccum(JNIEnv *__env, jclass clazz, jint op, jfloat value) {
    glAccumPROC glAccum = (glAccumPROC)tlsGetFunction(0);
    UNUSED_PARAM(clazz)
    glAccum(op, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glAlphaFunc(JNIEnv *__env, jclass clazz, jint func, jfloat ref) {
    glAlphaFuncPROC glAlphaFunc = (glAlphaFuncPROC)tlsGetFunction(8);
    UNUSED_PARAM(clazz)
    glAlphaFunc(func, ref);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11_nglAreTexturesResident__IJJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress, jlong residencesAddress) {
    glAreTexturesResidentPROC glAreTexturesResident = (glAreTexturesResidentPROC)tlsGetFunction(11);
    const intptr_t textures = (const intptr_t)texturesAddress;
    intptr_t residences = (intptr_t)residencesAddress;
    UNUSED_PARAM(clazz)
    return (jboolean)glAreTexturesResident(n, textures, residences);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glArrayElement(JNIEnv *__env, jclass clazz, jint i) {
    glArrayElementPROC glArrayElement = (glArrayElementPROC)tlsGetFunction(12);
    UNUSED_PARAM(clazz)
    glArrayElement(i);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glBegin(JNIEnv *__env, jclass clazz, jint mode) {
    glBeginPROC glBegin = (glBeginPROC)tlsGetFunction(15);
    UNUSED_PARAM(clazz)
    glBegin(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glBindTexture(JNIEnv *__env, jclass clazz, jint target, jint texture) {
    glBindTexturePROC glBindTexture = (glBindTexturePROC)tlsGetFunction(56);
    UNUSED_PARAM(clazz)
    glBindTexture(target, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglBitmap(JNIEnv *__env, jclass clazz, jint w, jint h, jfloat xOrig, jfloat yOrig, jfloat xInc, jfloat yInc, jlong dataAddress) {
    glBitmapPROC glBitmap = (glBitmapPROC)tlsGetFunction(64);
    const intptr_t data = (const intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glBlendFunc(JNIEnv *__env, jclass clazz, jint sfactor, jint dfactor) {
    glBlendFuncPROC glBlendFunc = (glBlendFuncPROC)tlsGetFunction(79);
    UNUSED_PARAM(clazz)
    glBlendFunc(sfactor, dfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glCallList(JNIEnv *__env, jclass clazz, jint list) {
    glCallListPROC glCallList = (glCallListPROC)tlsGetFunction(102);
    UNUSED_PARAM(clazz)
    glCallList(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglCallLists(JNIEnv *__env, jclass clazz, jint n, jint type, jlong listsAddress) {
    glCallListsPROC glCallLists = (glCallListsPROC)tlsGetFunction(103);
    const intptr_t lists = (const intptr_t)listsAddress;
    UNUSED_PARAM(clazz)
    glCallLists(n, type, lists);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glClear(JNIEnv *__env, jclass clazz, jint mask) {
    glClearPROC glClear = (glClearPROC)tlsGetFunction(110);
    UNUSED_PARAM(clazz)
    glClear(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glClearAccum(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    glClearAccumPROC glClearAccum = (glClearAccumPROC)tlsGetFunction(111);
    UNUSED_PARAM(clazz)
    glClearAccum(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glClearColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    glClearColorPROC glClearColor = (glClearColorPROC)tlsGetFunction(118);
    UNUSED_PARAM(clazz)
    glClearColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glClearDepth(JNIEnv *__env, jclass clazz, jdouble depth) {
    glClearDepthPROC glClearDepth = (glClearDepthPROC)tlsGetFunction(121);
    UNUSED_PARAM(clazz)
    glClearDepth(depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glClearIndex(JNIEnv *__env, jclass clazz, jfloat index) {
    glClearIndexPROC glClearIndex = (glClearIndexPROC)tlsGetFunction(124);
    UNUSED_PARAM(clazz)
    glClearIndex(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glClearStencil(JNIEnv *__env, jclass clazz, jint s) {
    glClearStencilPROC glClearStencil = (glClearStencilPROC)tlsGetFunction(133);
    UNUSED_PARAM(clazz)
    glClearStencil(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglClipPlane__IJ(JNIEnv *__env, jclass clazz, jint plane, jlong equationAddress) {
    glClipPlanePROC glClipPlane = (glClipPlanePROC)tlsGetFunction(141);
    const intptr_t equation = (const intptr_t)equationAddress;
    UNUSED_PARAM(clazz)
    glClipPlane(plane, equation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3b(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue) {
    glColor3bPROC glColor3b = (glColor3bPROC)tlsGetFunction(142);
    UNUSED_PARAM(clazz)
    glColor3b(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3s(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue) {
    glColor3sPROC glColor3s = (glColor3sPROC)tlsGetFunction(152);
    UNUSED_PARAM(clazz)
    glColor3s(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3i(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue) {
    glColor3iPROC glColor3i = (glColor3iPROC)tlsGetFunction(150);
    UNUSED_PARAM(clazz)
    glColor3i(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3f(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue) {
    glColor3fPROC glColor3f = (glColor3fPROC)tlsGetFunction(146);
    UNUSED_PARAM(clazz)
    glColor3f(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3d(JNIEnv *__env, jclass clazz, jdouble red, jdouble green, jdouble blue) {
    glColor3dPROC glColor3d = (glColor3dPROC)tlsGetFunction(144);
    UNUSED_PARAM(clazz)
    glColor3d(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3ub(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue) {
    glColor3ubPROC glColor3ub = (glColor3ubPROC)tlsGetFunction(154);
    UNUSED_PARAM(clazz)
    glColor3ub(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3us(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue) {
    glColor3usPROC glColor3us = (glColor3usPROC)tlsGetFunction(158);
    UNUSED_PARAM(clazz)
    glColor3us(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3ui(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue) {
    glColor3uiPROC glColor3ui = (glColor3uiPROC)tlsGetFunction(156);
    UNUSED_PARAM(clazz)
    glColor3ui(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3bv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3bvPROC glColor3bv = (glColor3bvPROC)tlsGetFunction(143);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3bv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3svPROC glColor3sv = (glColor3svPROC)tlsGetFunction(153);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3ivPROC glColor3iv = (glColor3ivPROC)tlsGetFunction(151);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3fvPROC glColor3fv = (glColor3fvPROC)tlsGetFunction(147);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3dvPROC glColor3dv = (glColor3dvPROC)tlsGetFunction(145);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3ubv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3ubvPROC glColor3ubv = (glColor3ubvPROC)tlsGetFunction(155);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3ubv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3usv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3usvPROC glColor3usv = (glColor3usvPROC)tlsGetFunction(159);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3usv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3uiv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3uivPROC glColor3uiv = (glColor3uivPROC)tlsGetFunction(157);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3uiv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4b(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {
    glColor4bPROC glColor4b = (glColor4bPROC)tlsGetFunction(160);
    UNUSED_PARAM(clazz)
    glColor4b(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4s(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha) {
    glColor4sPROC glColor4s = (glColor4sPROC)tlsGetFunction(170);
    UNUSED_PARAM(clazz)
    glColor4s(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4i(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jint alpha) {
    glColor4iPROC glColor4i = (glColor4iPROC)tlsGetFunction(168);
    UNUSED_PARAM(clazz)
    glColor4i(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4f(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    glColor4fPROC glColor4f = (glColor4fPROC)tlsGetFunction(164);
    UNUSED_PARAM(clazz)
    glColor4f(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4d(JNIEnv *__env, jclass clazz, jdouble red, jdouble green, jdouble blue, jdouble alpha) {
    glColor4dPROC glColor4d = (glColor4dPROC)tlsGetFunction(162);
    UNUSED_PARAM(clazz)
    glColor4d(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4ub(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {
    glColor4ubPROC glColor4ub = (glColor4ubPROC)tlsGetFunction(172);
    UNUSED_PARAM(clazz)
    glColor4ub(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4us(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha) {
    glColor4usPROC glColor4us = (glColor4usPROC)tlsGetFunction(176);
    UNUSED_PARAM(clazz)
    glColor4us(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4ui(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jint alpha) {
    glColor4uiPROC glColor4ui = (glColor4uiPROC)tlsGetFunction(174);
    UNUSED_PARAM(clazz)
    glColor4ui(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4bv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4bvPROC glColor4bv = (glColor4bvPROC)tlsGetFunction(161);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4bv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4svPROC glColor4sv = (glColor4svPROC)tlsGetFunction(171);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4ivPROC glColor4iv = (glColor4ivPROC)tlsGetFunction(169);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4fvPROC glColor4fv = (glColor4fvPROC)tlsGetFunction(165);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4dvPROC glColor4dv = (glColor4dvPROC)tlsGetFunction(163);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4ubv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4ubvPROC glColor4ubv = (glColor4ubvPROC)tlsGetFunction(173);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4ubv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4usv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4usvPROC glColor4usv = (glColor4usvPROC)tlsGetFunction(177);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4usv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4uiv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4uivPROC glColor4uiv = (glColor4uivPROC)tlsGetFunction(175);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4uiv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColorMask(JNIEnv *__env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {
    glColorMaskPROC glColorMask = (glColorMaskPROC)tlsGetFunction(179);
    UNUSED_PARAM(clazz)
    glColorMask(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColorMaterial(JNIEnv *__env, jclass clazz, jint face, jint mode) {
    glColorMaterialPROC glColorMaterial = (glColorMaterialPROC)tlsGetFunction(182);
    UNUSED_PARAM(clazz)
    glColorMaterial(face, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColorPointer(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress) {
    glColorPointerPROC glColorPointer = (glColorPointerPROC)tlsGetFunction(187);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glColorPointer(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glCopyPixels(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint type) {
    glCopyPixelsPROC glCopyPixels = (glCopyPixelsPROC)tlsGetFunction(246);
    UNUSED_PARAM(clazz)
    glCopyPixels(x, y, width, height, type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glCullFace(JNIEnv *__env, jclass clazz, jint mode) {
    glCullFacePROC glCullFace = (glCullFacePROC)tlsGetFunction(286);
    UNUSED_PARAM(clazz)
    glCullFace(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glDeleteLists(JNIEnv *__env, jclass clazz, jint list, jint range) {
    glDeleteListsPROC glDeleteLists = (glDeleteListsPROC)tlsGetFunction(303);
    UNUSED_PARAM(clazz)
    glDeleteLists(list, range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glDepthFunc(JNIEnv *__env, jclass clazz, jint func) {
    glDepthFuncPROC glDepthFunc = (glDepthFuncPROC)tlsGetFunction(329);
    UNUSED_PARAM(clazz)
    glDepthFunc(func);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glDepthMask(JNIEnv *__env, jclass clazz, jboolean flag) {
    glDepthMaskPROC glDepthMask = (glDepthMaskPROC)tlsGetFunction(330);
    UNUSED_PARAM(clazz)
    glDepthMask(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glDepthRange(JNIEnv *__env, jclass clazz, jdouble zNear, jdouble zFar) {
    glDepthRangePROC glDepthRange = (glDepthRangePROC)tlsGetFunction(331);
    UNUSED_PARAM(clazz)
    glDepthRange(zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glDisableClientState(JNIEnv *__env, jclass clazz, jint cap) {
    glDisableClientStatePROC glDisableClientState = (glDisableClientStatePROC)tlsGetFunction(339);
    UNUSED_PARAM(clazz)
    glDisableClientState(cap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glDrawArrays(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count) {
    glDrawArraysPROC glDrawArrays = (glDrawArraysPROC)tlsGetFunction(352);
    UNUSED_PARAM(clazz)
    glDrawArrays(mode, first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glDrawBuffer(JNIEnv *__env, jclass clazz, jint buf) {
    glDrawBufferPROC glDrawBuffer = (glDrawBufferPROC)tlsGetFunction(358);
    UNUSED_PARAM(clazz)
    glDrawBuffer(buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDrawElements(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress) {
    glDrawElementsPROC glDrawElements = (glDrawElementsPROC)tlsGetFunction(365);
    const intptr_t indices = (const intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElements(mode, count, type, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDrawPixels__IIIIJ(JNIEnv *__env, jclass clazz, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glDrawPixelsPROC glDrawPixels = (glDrawPixelsPROC)tlsGetFunction(374);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glDrawPixels(width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEdgeFlag(JNIEnv *__env, jclass clazz, jboolean flag) {
    glEdgeFlagPROC glEdgeFlag = (glEdgeFlagPROC)tlsGetFunction(384);
    UNUSED_PARAM(clazz)
    glEdgeFlag(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEdgeFlagv(JNIEnv *__env, jclass clazz, jlong flagAddress) {
    glEdgeFlagvPROC glEdgeFlagv = (glEdgeFlagvPROC)tlsGetFunction(387);
    const intptr_t flag = (const intptr_t)flagAddress;
    UNUSED_PARAM(clazz)
    glEdgeFlagv(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEdgeFlagPointer(JNIEnv *__env, jclass clazz, jint stride, jlong pointerAddress) {
    glEdgeFlagPointerPROC glEdgeFlagPointer = (glEdgeFlagPointerPROC)tlsGetFunction(386);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glEdgeFlagPointer(stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEnableClientState(JNIEnv *__env, jclass clazz, jint cap) {
    glEnableClientStatePROC glEnableClientState = (glEnableClientStatePROC)tlsGetFunction(389);
    UNUSED_PARAM(clazz)
    glEnableClientState(cap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEnd(JNIEnv *__env, jclass clazz) {
    glEndPROC glEnd = (glEndPROC)tlsGetFunction(399);
    UNUSED_PARAM(clazz)
    glEnd();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalCoord1f(JNIEnv *__env, jclass clazz, jfloat u) {
    glEvalCoord1fPROC glEvalCoord1f = (glEvalCoord1fPROC)tlsGetFunction(414);
    UNUSED_PARAM(clazz)
    glEvalCoord1f(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord1fv__J(JNIEnv *__env, jclass clazz, jlong uAddress) {
    glEvalCoord1fvPROC glEvalCoord1fv = (glEvalCoord1fvPROC)tlsGetFunction(415);
    const intptr_t u = (const intptr_t)uAddress;
    UNUSED_PARAM(clazz)
    glEvalCoord1fv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalCoord1d(JNIEnv *__env, jclass clazz, jdouble u) {
    glEvalCoord1dPROC glEvalCoord1d = (glEvalCoord1dPROC)tlsGetFunction(412);
    UNUSED_PARAM(clazz)
    glEvalCoord1d(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord1dv__J(JNIEnv *__env, jclass clazz, jlong uAddress) {
    glEvalCoord1dvPROC glEvalCoord1dv = (glEvalCoord1dvPROC)tlsGetFunction(413);
    const intptr_t u = (const intptr_t)uAddress;
    UNUSED_PARAM(clazz)
    glEvalCoord1dv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalCoord2f(JNIEnv *__env, jclass clazz, jfloat u, jfloat v) {
    glEvalCoord2fPROC glEvalCoord2f = (glEvalCoord2fPROC)tlsGetFunction(418);
    UNUSED_PARAM(clazz)
    glEvalCoord2f(u, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord2fv__J(JNIEnv *__env, jclass clazz, jlong uAddress) {
    glEvalCoord2fvPROC glEvalCoord2fv = (glEvalCoord2fvPROC)tlsGetFunction(419);
    const intptr_t u = (const intptr_t)uAddress;
    UNUSED_PARAM(clazz)
    glEvalCoord2fv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalCoord2d(JNIEnv *__env, jclass clazz, jdouble u, jdouble v) {
    glEvalCoord2dPROC glEvalCoord2d = (glEvalCoord2dPROC)tlsGetFunction(416);
    UNUSED_PARAM(clazz)
    glEvalCoord2d(u, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord2dv__J(JNIEnv *__env, jclass clazz, jlong uAddress) {
    glEvalCoord2dvPROC glEvalCoord2dv = (glEvalCoord2dvPROC)tlsGetFunction(417);
    const intptr_t u = (const intptr_t)uAddress;
    UNUSED_PARAM(clazz)
    glEvalCoord2dv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalMesh1(JNIEnv *__env, jclass clazz, jint mode, jint i1, jint i2) {
    glEvalMesh1PROC glEvalMesh1 = (glEvalMesh1PROC)tlsGetFunction(420);
    UNUSED_PARAM(clazz)
    glEvalMesh1(mode, i1, i2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalMesh2(JNIEnv *__env, jclass clazz, jint mode, jint i1, jint i2, jint j1, jint j2) {
    glEvalMesh2PROC glEvalMesh2 = (glEvalMesh2PROC)tlsGetFunction(421);
    UNUSED_PARAM(clazz)
    glEvalMesh2(mode, i1, i2, j1, j2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalPoint1(JNIEnv *__env, jclass clazz, jint i) {
    glEvalPoint1PROC glEvalPoint1 = (glEvalPoint1PROC)tlsGetFunction(422);
    UNUSED_PARAM(clazz)
    glEvalPoint1(i);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalPoint2(JNIEnv *__env, jclass clazz, jint i, jint j) {
    glEvalPoint2PROC glEvalPoint2 = (glEvalPoint2PROC)tlsGetFunction(423);
    UNUSED_PARAM(clazz)
    glEvalPoint2(i, j);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFeedbackBuffer__IIJ(JNIEnv *__env, jclass clazz, jint size, jint type, jlong bufferAddress) {
    glFeedbackBufferPROC glFeedbackBuffer = (glFeedbackBufferPROC)tlsGetFunction(425);
    intptr_t buffer = (intptr_t)bufferAddress;
    UNUSED_PARAM(clazz)
    glFeedbackBuffer(size, type, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glFinish(JNIEnv *__env, jclass clazz) {
    glFinishPROC glFinish = (glFinishPROC)tlsGetFunction(427);
    UNUSED_PARAM(clazz)
    glFinish();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glFlush(JNIEnv *__env, jclass clazz) {
    glFlushPROC glFlush = (glFlushPROC)tlsGetFunction(429);
    UNUSED_PARAM(clazz)
    glFlush();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glFogi(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glFogiPROC glFogi = (glFogiPROC)tlsGetFunction(445);
    UNUSED_PARAM(clazz)
    glFogi(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFogiv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glFogivPROC glFogiv = (glFogivPROC)tlsGetFunction(446);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glFogiv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glFogf(JNIEnv *__env, jclass clazz, jint pname, jfloat param) {
    glFogfPROC glFogf = (glFogfPROC)tlsGetFunction(443);
    UNUSED_PARAM(clazz)
    glFogf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFogfv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glFogfvPROC glFogfv = (glFogfvPROC)tlsGetFunction(444);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glFogfv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glFrontFace(JNIEnv *__env, jclass clazz, jint dir) {
    glFrontFacePROC glFrontFace = (glFrontFacePROC)tlsGetFunction(472);
    UNUSED_PARAM(clazz)
    glFrontFace(dir);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL11_glGenLists(JNIEnv *__env, jclass clazz, jint s) {
    glGenListsPROC glGenLists = (glGenListsPROC)tlsGetFunction(479);
    UNUSED_PARAM(clazz)
    return (jint)glGenLists(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGenTextures__IJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress) {
    glGenTexturesPROC glGenTextures = (glGenTexturesPROC)tlsGetFunction(491);
    intptr_t textures = (intptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glGenTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDeleteTextures__IJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress) {
    glDeleteTexturesPROC glDeleteTextures = (glDeleteTexturesPROC)tlsGetFunction(323);
    const intptr_t textures = (const intptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glDeleteTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetClipPlane__IJ(JNIEnv *__env, jclass clazz, jint plane, jlong equationAddress) {
    glGetClipPlanePROC glGetClipPlane = (glGetClipPlanePROC)tlsGetFunction(528);
    intptr_t equation = (intptr_t)equationAddress;
    UNUSED_PARAM(clazz)
    glGetClipPlane(plane, equation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetBooleanv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetBooleanvPROC glGetBooleanv = (glGetBooleanvPROC)tlsGetFunction(519);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetBooleanv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetFloatv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetFloatvPROC glGetFloatv = (glGetFloatvPROC)tlsGetFunction(556);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFloatv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetIntegerv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetIntegervPROC glGetIntegerv = (glGetIntegervPROC)tlsGetFunction(579);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetIntegerv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetDoublev__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetDoublevPROC glGetDoublev = (glGetDoublevPROC)tlsGetFunction(549);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetDoublev(pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL11_glGetError(JNIEnv *__env, jclass clazz) {
    glGetErrorPROC glGetError = (glGetErrorPROC)tlsGetFunction(550);
    UNUSED_PARAM(clazz)
    return (jint)glGetError();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetLightiv__IIJ(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong dataAddress) {
    glGetLightivPROC glGetLightiv = (glGetLightivPROC)tlsGetFunction(584);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetLightiv(light, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetLightfv__IIJ(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong dataAddress) {
    glGetLightfvPROC glGetLightfv = (glGetLightfvPROC)tlsGetFunction(583);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetLightfv(light, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMapiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jlong dataAddress) {
    glGetMapivPROC glGetMapiv = (glGetMapivPROC)tlsGetFunction(587);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetMapiv(target, query, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMapfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jlong dataAddress) {
    glGetMapfvPROC glGetMapfv = (glGetMapfvPROC)tlsGetFunction(586);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetMapfv(target, query, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMapdv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jlong dataAddress) {
    glGetMapdvPROC glGetMapdv = (glGetMapdvPROC)tlsGetFunction(585);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetMapdv(target, query, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMaterialiv__IIJ(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong dataAddress) {
    glGetMaterialivPROC glGetMaterialiv = (glGetMaterialivPROC)tlsGetFunction(589);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetMaterialiv(face, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMaterialfv__IIJ(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong dataAddress) {
    glGetMaterialfvPROC glGetMaterialfv = (glGetMaterialfvPROC)tlsGetFunction(588);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetMaterialfv(face, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPixelMapfv__IJ(JNIEnv *__env, jclass clazz, jint map, jlong dataAddress) {
    glGetPixelMapfvPROC glGetPixelMapfv = (glGetPixelMapfvPROC)tlsGetFunction(658);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetPixelMapfv(map, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPixelMapusv__IJ(JNIEnv *__env, jclass clazz, jint map, jlong dataAddress) {
    glGetPixelMapusvPROC glGetPixelMapusv = (glGetPixelMapusvPROC)tlsGetFunction(660);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetPixelMapusv(map, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPixelMapuiv__IJ(JNIEnv *__env, jclass clazz, jint map, jlong dataAddress) {
    glGetPixelMapuivPROC glGetPixelMapuiv = (glGetPixelMapuivPROC)tlsGetFunction(659);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetPixelMapuiv(map, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPointerv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetPointervPROC glGetPointerv = (glGetPointervPROC)tlsGetFunction(663);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetPointerv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPolygonStipple(JNIEnv *__env, jclass clazz, jlong patternAddress) {
    glGetPolygonStipplePROC glGetPolygonStipple = (glGetPolygonStipplePROC)tlsGetFunction(664);
    intptr_t pattern = (intptr_t)patternAddress;
    UNUSED_PARAM(clazz)
    glGetPolygonStipple(pattern);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL11_nglGetString(JNIEnv *__env, jclass clazz, jint name) {
    glGetStringPROC glGetString = (glGetStringPROC)tlsGetFunction(713);
    UNUSED_PARAM(clazz)
    return (jlong)glGetString(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexEnviv__IIJ(JNIEnv *__env, jclass clazz, jint env, jint pname, jlong dataAddress) {
    glGetTexEnvivPROC glGetTexEnviv = (glGetTexEnvivPROC)tlsGetFunction(719);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetTexEnviv(env, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexEnvfv__IIJ(JNIEnv *__env, jclass clazz, jint env, jint pname, jlong dataAddress) {
    glGetTexEnvfvPROC glGetTexEnvfv = (glGetTexEnvfvPROC)tlsGetFunction(718);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetTexEnvfv(env, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexGeniv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong dataAddress) {
    glGetTexGenivPROC glGetTexGeniv = (glGetTexGenivPROC)tlsGetFunction(722);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetTexGeniv(coord, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexGenfv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong dataAddress) {
    glGetTexGenfvPROC glGetTexGenfv = (glGetTexGenfvPROC)tlsGetFunction(721);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetTexGenfv(coord, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexGendv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong dataAddress) {
    glGetTexGendvPROC glGetTexGendv = (glGetTexGendvPROC)tlsGetFunction(720);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetTexGendv(coord, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexImage__IIIIJ(JNIEnv *__env, jclass clazz, jint tex, jint level, jint format, jint type, jlong pixelsAddress) {
    glGetTexImagePROC glGetTexImage = (glGetTexImagePROC)tlsGetFunction(723);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetTexImage(tex, level, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexLevelParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetTexLevelParameterivPROC glGetTexLevelParameteriv = (glGetTexLevelParameterivPROC)tlsGetFunction(725);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexLevelParameteriv(target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexLevelParameterfv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetTexLevelParameterfvPROC glGetTexLevelParameterfv = (glGetTexLevelParameterfvPROC)tlsGetFunction(724);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexLevelParameterfv(target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterivPROC glGetTexParameteriv = (glGetTexParameterivPROC)tlsGetFunction(731);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterfvPROC glGetTexParameterfv = (glGetTexParameterfvPROC)tlsGetFunction(730);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glHint(JNIEnv *__env, jclass clazz, jint target, jint hint) {
    glHintPROC glHint = (glHintPROC)tlsGetFunction(841);
    UNUSED_PARAM(clazz)
    glHint(target, hint);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexi(JNIEnv *__env, jclass clazz, jint index) {
    glIndexiPROC glIndexi = (glIndexiPROC)tlsGetFunction(857);
    UNUSED_PARAM(clazz)
    glIndexi(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexub(JNIEnv *__env, jclass clazz, jbyte index) {
    glIndexubPROC glIndexub = (glIndexubPROC)tlsGetFunction(861);
    UNUSED_PARAM(clazz)
    glIndexub(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexs(JNIEnv *__env, jclass clazz, jshort index) {
    glIndexsPROC glIndexs = (glIndexsPROC)tlsGetFunction(859);
    UNUSED_PARAM(clazz)
    glIndexs(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexf(JNIEnv *__env, jclass clazz, jfloat index) {
    glIndexfPROC glIndexf = (glIndexfPROC)tlsGetFunction(855);
    UNUSED_PARAM(clazz)
    glIndexf(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexd(JNIEnv *__env, jclass clazz, jdouble index) {
    glIndexdPROC glIndexd = (glIndexdPROC)tlsGetFunction(853);
    UNUSED_PARAM(clazz)
    glIndexd(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexiv__J(JNIEnv *__env, jclass clazz, jlong indexAddress) {
    glIndexivPROC glIndexiv = (glIndexivPROC)tlsGetFunction(858);
    const intptr_t index = (const intptr_t)indexAddress;
    UNUSED_PARAM(clazz)
    glIndexiv(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexubv(JNIEnv *__env, jclass clazz, jlong indexAddress) {
    glIndexubvPROC glIndexubv = (glIndexubvPROC)tlsGetFunction(862);
    const intptr_t index = (const intptr_t)indexAddress;
    UNUSED_PARAM(clazz)
    glIndexubv(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexsv__J(JNIEnv *__env, jclass clazz, jlong indexAddress) {
    glIndexsvPROC glIndexsv = (glIndexsvPROC)tlsGetFunction(860);
    const intptr_t index = (const intptr_t)indexAddress;
    UNUSED_PARAM(clazz)
    glIndexsv(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexfv__J(JNIEnv *__env, jclass clazz, jlong indexAddress) {
    glIndexfvPROC glIndexfv = (glIndexfvPROC)tlsGetFunction(856);
    const intptr_t index = (const intptr_t)indexAddress;
    UNUSED_PARAM(clazz)
    glIndexfv(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexdv__J(JNIEnv *__env, jclass clazz, jlong indexAddress) {
    glIndexdvPROC glIndexdv = (glIndexdvPROC)tlsGetFunction(854);
    const intptr_t index = (const intptr_t)indexAddress;
    UNUSED_PARAM(clazz)
    glIndexdv(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexMask(JNIEnv *__env, jclass clazz, jint mask) {
    glIndexMaskPROC glIndexMask = (glIndexMaskPROC)tlsGetFunction(851);
    UNUSED_PARAM(clazz)
    glIndexMask(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexPointer(JNIEnv *__env, jclass clazz, jint type, jint stride, jlong pointerAddress) {
    glIndexPointerPROC glIndexPointer = (glIndexPointerPROC)tlsGetFunction(852);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glIndexPointer(type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glInitNames(JNIEnv *__env, jclass clazz) {
    glInitNamesPROC glInitNames = (glInitNamesPROC)tlsGetFunction(863);
    UNUSED_PARAM(clazz)
    glInitNames();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglInterleavedArrays__IIJ(JNIEnv *__env, jclass clazz, jint format, jint stride, jlong pointerAddress) {
    glInterleavedArraysPROC glInterleavedArrays = (glInterleavedArraysPROC)tlsGetFunction(865);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glInterleavedArrays(format, stride, pointer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11_glIsEnabled(JNIEnv *__env, jclass clazz, jint cap) {
    glIsEnabledPROC glIsEnabled = (glIsEnabledPROC)tlsGetFunction(879);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsEnabled(cap);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11_glIsList(JNIEnv *__env, jclass clazz, jint list) {
    glIsListPROC glIsList = (glIsListPROC)tlsGetFunction(887);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsList(list);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11_glIsTexture(JNIEnv *__env, jclass clazz, jint texture) {
    glIsTexturePROC glIsTexture = (glIsTexturePROC)tlsGetFunction(906);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsTexture(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLightModeli(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glLightModeliPROC glLightModeli = (glLightModeliPROC)tlsGetFunction(915);
    UNUSED_PARAM(clazz)
    glLightModeli(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLightModelf(JNIEnv *__env, jclass clazz, jint pname, jfloat param) {
    glLightModelfPROC glLightModelf = (glLightModelfPROC)tlsGetFunction(913);
    UNUSED_PARAM(clazz)
    glLightModelf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightModeliv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glLightModelivPROC glLightModeliv = (glLightModelivPROC)tlsGetFunction(916);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glLightModeliv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightModelfv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glLightModelfvPROC glLightModelfv = (glLightModelfvPROC)tlsGetFunction(914);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glLightModelfv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLighti(JNIEnv *__env, jclass clazz, jint light, jint pname, jint param) {
    glLightiPROC glLighti = (glLightiPROC)tlsGetFunction(919);
    UNUSED_PARAM(clazz)
    glLighti(light, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLightf(JNIEnv *__env, jclass clazz, jint light, jint pname, jfloat param) {
    glLightfPROC glLightf = (glLightfPROC)tlsGetFunction(917);
    UNUSED_PARAM(clazz)
    glLightf(light, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightiv__IIJ(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong paramsAddress) {
    glLightivPROC glLightiv = (glLightivPROC)tlsGetFunction(920);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glLightiv(light, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightfv__IIJ(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong paramsAddress) {
    glLightfvPROC glLightfv = (glLightfvPROC)tlsGetFunction(918);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glLightfv(light, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLineStipple(JNIEnv *__env, jclass clazz, jint factor, jshort pattern) {
    glLineStipplePROC glLineStipple = (glLineStipplePROC)tlsGetFunction(921);
    UNUSED_PARAM(clazz)
    glLineStipple(factor, pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLineWidth(JNIEnv *__env, jclass clazz, jfloat width) {
    glLineWidthPROC glLineWidth = (glLineWidthPROC)tlsGetFunction(922);
    UNUSED_PARAM(clazz)
    glLineWidth(width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glListBase(JNIEnv *__env, jclass clazz, jint base) {
    glListBasePROC glListBase = (glListBasePROC)tlsGetFunction(925);
    UNUSED_PARAM(clazz)
    glListBase(base);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLoadMatrixf__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glLoadMatrixfPROC glLoadMatrixf = (glLoadMatrixfPROC)tlsGetFunction(929);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glLoadMatrixf(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLoadMatrixd__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glLoadMatrixdPROC glLoadMatrixd = (glLoadMatrixdPROC)tlsGetFunction(928);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glLoadMatrixd(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLoadIdentity(JNIEnv *__env, jclass clazz) {
    glLoadIdentityPROC glLoadIdentity = (glLoadIdentityPROC)tlsGetFunction(927);
    UNUSED_PARAM(clazz)
    glLoadIdentity();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLoadName(JNIEnv *__env, jclass clazz, jint name) {
    glLoadNamePROC glLoadName = (glLoadNamePROC)tlsGetFunction(930);
    UNUSED_PARAM(clazz)
    glLoadName(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLogicOp(JNIEnv *__env, jclass clazz, jint op) {
    glLogicOpPROC glLogicOp = (glLogicOpPROC)tlsGetFunction(936);
    UNUSED_PARAM(clazz)
    glLogicOp(op);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap1f__IFFIIJ(JNIEnv *__env, jclass clazz, jint target, jfloat u1, jfloat u2, jint stride, jint order, jlong pointsAddress) {
    glMap1fPROC glMap1f = (glMap1fPROC)tlsGetFunction(950);
    const intptr_t points = (const intptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMap1f(target, u1, u2, stride, order, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap1d__IDDIIJ(JNIEnv *__env, jclass clazz, jint target, jdouble u1, jdouble u2, jint stride, jint order, jlong pointsAddress) {
    glMap1dPROC glMap1d = (glMap1dPROC)tlsGetFunction(949);
    const intptr_t points = (const intptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMap1d(target, u1, u2, stride, order, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap2f__IFFIIFFIIJ(JNIEnv *__env, jclass clazz, jint target, jfloat u1, jfloat u2, jint ustride, jint uorder, jfloat v1, jfloat v2, jint vstride, jint vorder, jlong pointsAddress) {
    glMap2fPROC glMap2f = (glMap2fPROC)tlsGetFunction(952);
    const intptr_t points = (const intptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap2d__IDDIIDDIIJ(JNIEnv *__env, jclass clazz, jint target, jdouble u1, jdouble u2, jint ustride, jint uorder, jdouble v1, jdouble v2, jint vstride, jint vorder, jlong pointsAddress) {
    glMap2dPROC glMap2d = (glMap2dPROC)tlsGetFunction(951);
    const intptr_t points = (const intptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMapGrid1f(JNIEnv *__env, jclass clazz, jint n, jfloat u1, jfloat u2) {
    glMapGrid1fPROC glMapGrid1f = (glMapGrid1fPROC)tlsGetFunction(957);
    UNUSED_PARAM(clazz)
    glMapGrid1f(n, u1, u2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMapGrid1d(JNIEnv *__env, jclass clazz, jint n, jdouble u1, jdouble u2) {
    glMapGrid1dPROC glMapGrid1d = (glMapGrid1dPROC)tlsGetFunction(956);
    UNUSED_PARAM(clazz)
    glMapGrid1d(n, u1, u2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMapGrid2f(JNIEnv *__env, jclass clazz, jint un, jfloat u1, jfloat u2, jint vn, jfloat v1, jfloat v2) {
    glMapGrid2fPROC glMapGrid2f = (glMapGrid2fPROC)tlsGetFunction(959);
    UNUSED_PARAM(clazz)
    glMapGrid2f(un, u1, u2, vn, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMapGrid2d(JNIEnv *__env, jclass clazz, jint un, jdouble u1, jdouble u2, jint vn, jdouble v1, jdouble v2) {
    glMapGrid2dPROC glMapGrid2d = (glMapGrid2dPROC)tlsGetFunction(958);
    UNUSED_PARAM(clazz)
    glMapGrid2d(un, u1, u2, vn, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMateriali(JNIEnv *__env, jclass clazz, jint face, jint pname, jint param) {
    glMaterialiPROC glMateriali = (glMaterialiPROC)tlsGetFunction(967);
    UNUSED_PARAM(clazz)
    glMateriali(face, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMaterialf(JNIEnv *__env, jclass clazz, jint face, jint pname, jfloat param) {
    glMaterialfPROC glMaterialf = (glMaterialfPROC)tlsGetFunction(965);
    UNUSED_PARAM(clazz)
    glMaterialf(face, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMaterialiv__IIJ(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong paramsAddress) {
    glMaterialivPROC glMaterialiv = (glMaterialivPROC)tlsGetFunction(968);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMaterialiv(face, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMaterialfv__IIJ(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong paramsAddress) {
    glMaterialfvPROC glMaterialfv = (glMaterialfvPROC)tlsGetFunction(966);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMaterialfv(face, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMatrixMode(JNIEnv *__env, jclass clazz, jint mode) {
    glMatrixModePROC glMatrixMode = (glMatrixModePROC)tlsGetFunction(982);
    UNUSED_PARAM(clazz)
    glMatrixMode(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMultMatrixf__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glMultMatrixfPROC glMultMatrixf = (glMultMatrixfPROC)tlsGetFunction(1009);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMultMatrixf(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMultMatrixd__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glMultMatrixdPROC glMultMatrixd = (glMultMatrixdPROC)tlsGetFunction(1008);
    const intptr_t m = (const intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMultMatrixd(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glFrustum(JNIEnv *__env, jclass clazz, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f) {
    glFrustumPROC glFrustum = (glFrustumPROC)tlsGetFunction(473);
    UNUSED_PARAM(clazz)
    glFrustum(l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNewList(JNIEnv *__env, jclass clazz, jint n, jint mode) {
    glNewListPROC glNewList = (glNewListPROC)tlsGetFunction(1190);
    UNUSED_PARAM(clazz)
    glNewList(n, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEndList(JNIEnv *__env, jclass clazz) {
    glEndListPROC glEndList = (glEndListPROC)tlsGetFunction(403);
    UNUSED_PARAM(clazz)
    glEndList();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNormal3f(JNIEnv *__env, jclass clazz, jfloat nx, jfloat ny, jfloat nz) {
    glNormal3fPROC glNormal3f = (glNormal3fPROC)tlsGetFunction(1195);
    UNUSED_PARAM(clazz)
    glNormal3f(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNormal3b(JNIEnv *__env, jclass clazz, jbyte nx, jbyte ny, jbyte nz) {
    glNormal3bPROC glNormal3b = (glNormal3bPROC)tlsGetFunction(1191);
    UNUSED_PARAM(clazz)
    glNormal3b(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNormal3s(JNIEnv *__env, jclass clazz, jshort nx, jshort ny, jshort nz) {
    glNormal3sPROC glNormal3s = (glNormal3sPROC)tlsGetFunction(1201);
    UNUSED_PARAM(clazz)
    glNormal3s(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNormal3i(JNIEnv *__env, jclass clazz, jint nx, jint ny, jint nz) {
    glNormal3iPROC glNormal3i = (glNormal3iPROC)tlsGetFunction(1199);
    UNUSED_PARAM(clazz)
    glNormal3i(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNormal3d(JNIEnv *__env, jclass clazz, jdouble nx, jdouble ny, jdouble nz) {
    glNormal3dPROC glNormal3d = (glNormal3dPROC)tlsGetFunction(1193);
    UNUSED_PARAM(clazz)
    glNormal3d(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glNormal3fvPROC glNormal3fv = (glNormal3fvPROC)tlsGetFunction(1196);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNormal3fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3bv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glNormal3bvPROC glNormal3bv = (glNormal3bvPROC)tlsGetFunction(1192);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNormal3bv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glNormal3svPROC glNormal3sv = (glNormal3svPROC)tlsGetFunction(1202);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNormal3sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glNormal3ivPROC glNormal3iv = (glNormal3ivPROC)tlsGetFunction(1200);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNormal3iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glNormal3dvPROC glNormal3dv = (glNormal3dvPROC)tlsGetFunction(1194);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNormal3dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormalPointer(JNIEnv *__env, jclass clazz, jint type, jint stride, jlong pointerAddress) {
    glNormalPointerPROC glNormalPointer = (glNormalPointerPROC)tlsGetFunction(1206);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glNormalPointer(type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glOrtho(JNIEnv *__env, jclass clazz, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f) {
    glOrthoPROC glOrtho = (glOrthoPROC)tlsGetFunction(1209);
    UNUSED_PARAM(clazz)
    glOrtho(l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPassThrough(JNIEnv *__env, jclass clazz, jfloat token) {
    glPassThroughPROC glPassThrough = (glPassThroughPROC)tlsGetFunction(1210);
    UNUSED_PARAM(clazz)
    glPassThrough(token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelMapfv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint size, jlong valuesAddress) {
    glPixelMapfvPROC glPixelMapfv = (glPixelMapfvPROC)tlsGetFunction(1237);
    const intptr_t values = (const intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glPixelMapfv(map, size, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelMapusv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint size, jlong valuesAddress) {
    glPixelMapusvPROC glPixelMapusv = (glPixelMapusvPROC)tlsGetFunction(1239);
    const intptr_t values = (const intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glPixelMapusv(map, size, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelMapuiv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint size, jlong valuesAddress) {
    glPixelMapuivPROC glPixelMapuiv = (glPixelMapuivPROC)tlsGetFunction(1238);
    const intptr_t values = (const intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glPixelMapuiv(map, size, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPixelStorei(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glPixelStoreiPROC glPixelStorei = (glPixelStoreiPROC)tlsGetFunction(1241);
    UNUSED_PARAM(clazz)
    glPixelStorei(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPixelStoref(JNIEnv *__env, jclass clazz, jint pname, jfloat param) {
    glPixelStorefPROC glPixelStoref = (glPixelStorefPROC)tlsGetFunction(1240);
    UNUSED_PARAM(clazz)
    glPixelStoref(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPixelTransferi(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glPixelTransferiPROC glPixelTransferi = (glPixelTransferiPROC)tlsGetFunction(1243);
    UNUSED_PARAM(clazz)
    glPixelTransferi(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPixelTransferf(JNIEnv *__env, jclass clazz, jint pname, jfloat param) {
    glPixelTransferfPROC glPixelTransferf = (glPixelTransferfPROC)tlsGetFunction(1242);
    UNUSED_PARAM(clazz)
    glPixelTransferf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPixelZoom(JNIEnv *__env, jclass clazz, jfloat xfactor, jfloat yfactor) {
    glPixelZoomPROC glPixelZoom = (glPixelZoomPROC)tlsGetFunction(1244);
    UNUSED_PARAM(clazz)
    glPixelZoom(xfactor, yfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPointSize(JNIEnv *__env, jclass clazz, jfloat size) {
    glPointSizePROC glPointSize = (glPointSizePROC)tlsGetFunction(1256);
    UNUSED_PARAM(clazz)
    glPointSize(size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPolygonMode(JNIEnv *__env, jclass clazz, jint face, jint mode) {
    glPolygonModePROC glPolygonMode = (glPolygonModePROC)tlsGetFunction(1257);
    UNUSED_PARAM(clazz)
    glPolygonMode(face, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPolygonOffset(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units) {
    glPolygonOffsetPROC glPolygonOffset = (glPolygonOffsetPROC)tlsGetFunction(1258);
    UNUSED_PARAM(clazz)
    glPolygonOffset(factor, units);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPolygonStipple(JNIEnv *__env, jclass clazz, jlong patternAddress) {
    glPolygonStipplePROC glPolygonStipple = (glPolygonStipplePROC)tlsGetFunction(1261);
    const intptr_t pattern = (const intptr_t)patternAddress;
    UNUSED_PARAM(clazz)
    glPolygonStipple(pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPushAttrib(JNIEnv *__env, jclass clazz, jint mask) {
    glPushAttribPROC glPushAttrib = (glPushAttribPROC)tlsGetFunction(1429);
    UNUSED_PARAM(clazz)
    glPushAttrib(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPushClientAttrib(JNIEnv *__env, jclass clazz, jint mask) {
    glPushClientAttribPROC glPushClientAttrib = (glPushClientAttribPROC)tlsGetFunction(1430);
    UNUSED_PARAM(clazz)
    glPushClientAttrib(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPopAttrib(JNIEnv *__env, jclass clazz) {
    glPopAttribPROC glPopAttrib = (glPopAttribPROC)tlsGetFunction(1262);
    UNUSED_PARAM(clazz)
    glPopAttrib();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPopClientAttrib(JNIEnv *__env, jclass clazz) {
    glPopClientAttribPROC glPopClientAttrib = (glPopClientAttribPROC)tlsGetFunction(1263);
    UNUSED_PARAM(clazz)
    glPopClientAttrib();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPopMatrix(JNIEnv *__env, jclass clazz) {
    glPopMatrixPROC glPopMatrix = (glPopMatrixPROC)tlsGetFunction(1266);
    UNUSED_PARAM(clazz)
    glPopMatrix();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPopName(JNIEnv *__env, jclass clazz) {
    glPopNamePROC glPopName = (glPopNamePROC)tlsGetFunction(1267);
    UNUSED_PARAM(clazz)
    glPopName();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPrioritizeTextures__IJJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress, jlong prioritiesAddress) {
    glPrioritizeTexturesPROC glPrioritizeTextures = (glPrioritizeTexturesPROC)tlsGetFunction(1272);
    const intptr_t textures = (const intptr_t)texturesAddress;
    const intptr_t priorities = (const intptr_t)prioritiesAddress;
    UNUSED_PARAM(clazz)
    glPrioritizeTextures(n, textures, priorities);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPushMatrix(JNIEnv *__env, jclass clazz) {
    glPushMatrixPROC glPushMatrix = (glPushMatrixPROC)tlsGetFunction(1434);
    UNUSED_PARAM(clazz)
    glPushMatrix();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPushName(JNIEnv *__env, jclass clazz, jint name) {
    glPushNamePROC glPushName = (glPushNamePROC)tlsGetFunction(1435);
    UNUSED_PARAM(clazz)
    glPushName(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos2i(JNIEnv *__env, jclass clazz, jint x, jint y) {
    glRasterPos2iPROC glRasterPos2i = (glRasterPos2iPROC)tlsGetFunction(1444);
    UNUSED_PARAM(clazz)
    glRasterPos2i(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos2s(JNIEnv *__env, jclass clazz, jshort x, jshort y) {
    glRasterPos2sPROC glRasterPos2s = (glRasterPos2sPROC)tlsGetFunction(1446);
    UNUSED_PARAM(clazz)
    glRasterPos2s(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos2f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y) {
    glRasterPos2fPROC glRasterPos2f = (glRasterPos2fPROC)tlsGetFunction(1442);
    UNUSED_PARAM(clazz)
    glRasterPos2f(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos2d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y) {
    glRasterPos2dPROC glRasterPos2d = (glRasterPos2dPROC)tlsGetFunction(1440);
    UNUSED_PARAM(clazz)
    glRasterPos2d(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos2ivPROC glRasterPos2iv = (glRasterPos2ivPROC)tlsGetFunction(1445);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos2iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos2svPROC glRasterPos2sv = (glRasterPos2svPROC)tlsGetFunction(1447);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos2sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos2fvPROC glRasterPos2fv = (glRasterPos2fvPROC)tlsGetFunction(1443);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos2fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos2dvPROC glRasterPos2dv = (glRasterPos2dvPROC)tlsGetFunction(1441);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos2dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos3i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z) {
    glRasterPos3iPROC glRasterPos3i = (glRasterPos3iPROC)tlsGetFunction(1452);
    UNUSED_PARAM(clazz)
    glRasterPos3i(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos3s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z) {
    glRasterPos3sPROC glRasterPos3s = (glRasterPos3sPROC)tlsGetFunction(1454);
    UNUSED_PARAM(clazz)
    glRasterPos3s(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos3f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z) {
    glRasterPos3fPROC glRasterPos3f = (glRasterPos3fPROC)tlsGetFunction(1450);
    UNUSED_PARAM(clazz)
    glRasterPos3f(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos3d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z) {
    glRasterPos3dPROC glRasterPos3d = (glRasterPos3dPROC)tlsGetFunction(1448);
    UNUSED_PARAM(clazz)
    glRasterPos3d(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos3ivPROC glRasterPos3iv = (glRasterPos3ivPROC)tlsGetFunction(1453);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos3iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos3svPROC glRasterPos3sv = (glRasterPos3svPROC)tlsGetFunction(1455);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos3sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos3fvPROC glRasterPos3fv = (glRasterPos3fvPROC)tlsGetFunction(1451);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos3fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos3dvPROC glRasterPos3dv = (glRasterPos3dvPROC)tlsGetFunction(1449);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos3dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos4i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z, jint w) {
    glRasterPos4iPROC glRasterPos4i = (glRasterPos4iPROC)tlsGetFunction(1460);
    UNUSED_PARAM(clazz)
    glRasterPos4i(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos4s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jshort w) {
    glRasterPos4sPROC glRasterPos4s = (glRasterPos4sPROC)tlsGetFunction(1462);
    UNUSED_PARAM(clazz)
    glRasterPos4s(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos4f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat w) {
    glRasterPos4fPROC glRasterPos4f = (glRasterPos4fPROC)tlsGetFunction(1458);
    UNUSED_PARAM(clazz)
    glRasterPos4f(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos4d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jdouble w) {
    glRasterPos4dPROC glRasterPos4d = (glRasterPos4dPROC)tlsGetFunction(1456);
    UNUSED_PARAM(clazz)
    glRasterPos4d(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos4ivPROC glRasterPos4iv = (glRasterPos4ivPROC)tlsGetFunction(1461);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos4iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos4svPROC glRasterPos4sv = (glRasterPos4svPROC)tlsGetFunction(1463);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos4sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos4fvPROC glRasterPos4fv = (glRasterPos4fvPROC)tlsGetFunction(1459);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos4fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos4dvPROC glRasterPos4dv = (glRasterPos4dvPROC)tlsGetFunction(1457);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos4dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glReadBuffer(JNIEnv *__env, jclass clazz, jint src) {
    glReadBufferPROC glReadBuffer = (glReadBufferPROC)tlsGetFunction(1465);
    UNUSED_PARAM(clazz)
    glReadBuffer(src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglReadPixels__IIIIIIJ(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glReadPixelsPROC glReadPixels = (glReadPixelsPROC)tlsGetFunction(1466);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glReadPixels(x, y, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRecti(JNIEnv *__env, jclass clazz, jint x1, jint y1, jint x2, jint y2) {
    glRectiPROC glRecti = (glRectiPROC)tlsGetFunction(1473);
    UNUSED_PARAM(clazz)
    glRecti(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRects(JNIEnv *__env, jclass clazz, jshort x1, jshort y1, jshort x2, jshort y2) {
    glRectsPROC glRects = (glRectsPROC)tlsGetFunction(1475);
    UNUSED_PARAM(clazz)
    glRects(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRectf(JNIEnv *__env, jclass clazz, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {
    glRectfPROC glRectf = (glRectfPROC)tlsGetFunction(1471);
    UNUSED_PARAM(clazz)
    glRectf(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRectd(JNIEnv *__env, jclass clazz, jdouble x1, jdouble y1, jdouble x2, jdouble y2) {
    glRectdPROC glRectd = (glRectdPROC)tlsGetFunction(1469);
    UNUSED_PARAM(clazz)
    glRectd(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectiv__JJ(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address) {
    glRectivPROC glRectiv = (glRectivPROC)tlsGetFunction(1474);
    const intptr_t v1 = (const intptr_t)v1Address;
    const intptr_t v2 = (const intptr_t)v2Address;
    UNUSED_PARAM(clazz)
    glRectiv(v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectsv__JJ(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address) {
    glRectsvPROC glRectsv = (glRectsvPROC)tlsGetFunction(1476);
    const intptr_t v1 = (const intptr_t)v1Address;
    const intptr_t v2 = (const intptr_t)v2Address;
    UNUSED_PARAM(clazz)
    glRectsv(v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectfv__JJ(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address) {
    glRectfvPROC glRectfv = (glRectfvPROC)tlsGetFunction(1472);
    const intptr_t v1 = (const intptr_t)v1Address;
    const intptr_t v2 = (const intptr_t)v2Address;
    UNUSED_PARAM(clazz)
    glRectfv(v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectdv__JJ(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address) {
    glRectdvPROC glRectdv = (glRectdvPROC)tlsGetFunction(1470);
    const intptr_t v1 = (const intptr_t)v1Address;
    const intptr_t v2 = (const intptr_t)v2Address;
    UNUSED_PARAM(clazz)
    glRectdv(v1, v2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL11_glRenderMode(JNIEnv *__env, jclass clazz, jint mode) {
    glRenderModePROC glRenderMode = (glRenderModePROC)tlsGetFunction(1480);
    UNUSED_PARAM(clazz)
    return (jint)glRenderMode(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRotatef(JNIEnv *__env, jclass clazz, jfloat angle, jfloat x, jfloat y, jfloat z) {
    glRotatefPROC glRotatef = (glRotatefPROC)tlsGetFunction(1492);
    UNUSED_PARAM(clazz)
    glRotatef(angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRotated(JNIEnv *__env, jclass clazz, jdouble angle, jdouble x, jdouble y, jdouble z) {
    glRotatedPROC glRotated = (glRotatedPROC)tlsGetFunction(1491);
    UNUSED_PARAM(clazz)
    glRotated(angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glScalef(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z) {
    glScalefPROC glScalef = (glScalefPROC)tlsGetFunction(1504);
    UNUSED_PARAM(clazz)
    glScalef(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glScaled(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z) {
    glScaledPROC glScaled = (glScaledPROC)tlsGetFunction(1503);
    UNUSED_PARAM(clazz)
    glScaled(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glScissor(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height) {
    glScissorPROC glScissor = (glScissorPROC)tlsGetFunction(1505);
    UNUSED_PARAM(clazz)
    glScissor(x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglSelectBuffer__IJ(JNIEnv *__env, jclass clazz, jint size, jlong bufferAddress) {
    glSelectBufferPROC glSelectBuffer = (glSelectBufferPROC)tlsGetFunction(1548);
    intptr_t buffer = (intptr_t)bufferAddress;
    UNUSED_PARAM(clazz)
    glSelectBuffer(size, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glShadeModel(JNIEnv *__env, jclass clazz, jint mode) {
    glShadeModelPROC glShadeModel = (glShadeModelPROC)tlsGetFunction(1554);
    UNUSED_PARAM(clazz)
    glShadeModel(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glStencilFunc(JNIEnv *__env, jclass clazz, jint func, jint ref, jint mask) {
    glStencilFuncPROC glStencilFunc = (glStencilFuncPROC)tlsGetFunction(1568);
    UNUSED_PARAM(clazz)
    glStencilFunc(func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glStencilMask(JNIEnv *__env, jclass clazz, jint mask) {
    glStencilMaskPROC glStencilMask = (glStencilMaskPROC)tlsGetFunction(1570);
    UNUSED_PARAM(clazz)
    glStencilMask(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glStencilOp(JNIEnv *__env, jclass clazz, jint sfail, jint dpfail, jint dppass) {
    glStencilOpPROC glStencilOp = (glStencilOpPROC)tlsGetFunction(1572);
    UNUSED_PARAM(clazz)
    glStencilOp(sfail, dpfail, dppass);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord1f(JNIEnv *__env, jclass clazz, jfloat s) {
    glTexCoord1fPROC glTexCoord1f = (glTexCoord1fPROC)tlsGetFunction(1593);
    UNUSED_PARAM(clazz)
    glTexCoord1f(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord1s(JNIEnv *__env, jclass clazz, jshort s) {
    glTexCoord1sPROC glTexCoord1s = (glTexCoord1sPROC)tlsGetFunction(1599);
    UNUSED_PARAM(clazz)
    glTexCoord1s(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord1i(JNIEnv *__env, jclass clazz, jint s) {
    glTexCoord1iPROC glTexCoord1i = (glTexCoord1iPROC)tlsGetFunction(1597);
    UNUSED_PARAM(clazz)
    glTexCoord1i(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord1d(JNIEnv *__env, jclass clazz, jdouble s) {
    glTexCoord1dPROC glTexCoord1d = (glTexCoord1dPROC)tlsGetFunction(1591);
    UNUSED_PARAM(clazz)
    glTexCoord1d(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord1fvPROC glTexCoord1fv = (glTexCoord1fvPROC)tlsGetFunction(1594);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord1fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord1svPROC glTexCoord1sv = (glTexCoord1svPROC)tlsGetFunction(1600);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord1sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord1ivPROC glTexCoord1iv = (glTexCoord1ivPROC)tlsGetFunction(1598);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord1iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord1dvPROC glTexCoord1dv = (glTexCoord1dvPROC)tlsGetFunction(1592);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord1dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord2f(JNIEnv *__env, jclass clazz, jfloat s, jfloat t) {
    glTexCoord2fPROC glTexCoord2f = (glTexCoord2fPROC)tlsGetFunction(1603);
    UNUSED_PARAM(clazz)
    glTexCoord2f(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord2s(JNIEnv *__env, jclass clazz, jshort s, jshort t) {
    glTexCoord2sPROC glTexCoord2s = (glTexCoord2sPROC)tlsGetFunction(1609);
    UNUSED_PARAM(clazz)
    glTexCoord2s(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord2i(JNIEnv *__env, jclass clazz, jint s, jint t) {
    glTexCoord2iPROC glTexCoord2i = (glTexCoord2iPROC)tlsGetFunction(1607);
    UNUSED_PARAM(clazz)
    glTexCoord2i(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord2d(JNIEnv *__env, jclass clazz, jdouble s, jdouble t) {
    glTexCoord2dPROC glTexCoord2d = (glTexCoord2dPROC)tlsGetFunction(1601);
    UNUSED_PARAM(clazz)
    glTexCoord2d(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord2fvPROC glTexCoord2fv = (glTexCoord2fvPROC)tlsGetFunction(1604);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord2fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord2svPROC glTexCoord2sv = (glTexCoord2svPROC)tlsGetFunction(1610);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord2sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord2ivPROC glTexCoord2iv = (glTexCoord2ivPROC)tlsGetFunction(1608);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord2iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord2dvPROC glTexCoord2dv = (glTexCoord2dvPROC)tlsGetFunction(1602);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord2dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord3f(JNIEnv *__env, jclass clazz, jfloat s, jfloat t, jfloat r) {
    glTexCoord3fPROC glTexCoord3f = (glTexCoord3fPROC)tlsGetFunction(1613);
    UNUSED_PARAM(clazz)
    glTexCoord3f(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord3s(JNIEnv *__env, jclass clazz, jshort s, jshort t, jshort r) {
    glTexCoord3sPROC glTexCoord3s = (glTexCoord3sPROC)tlsGetFunction(1619);
    UNUSED_PARAM(clazz)
    glTexCoord3s(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord3i(JNIEnv *__env, jclass clazz, jint s, jint t, jint r) {
    glTexCoord3iPROC glTexCoord3i = (glTexCoord3iPROC)tlsGetFunction(1617);
    UNUSED_PARAM(clazz)
    glTexCoord3i(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord3d(JNIEnv *__env, jclass clazz, jdouble s, jdouble t, jdouble r) {
    glTexCoord3dPROC glTexCoord3d = (glTexCoord3dPROC)tlsGetFunction(1611);
    UNUSED_PARAM(clazz)
    glTexCoord3d(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord3fvPROC glTexCoord3fv = (glTexCoord3fvPROC)tlsGetFunction(1614);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord3fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord3svPROC glTexCoord3sv = (glTexCoord3svPROC)tlsGetFunction(1620);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord3sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord3ivPROC glTexCoord3iv = (glTexCoord3ivPROC)tlsGetFunction(1618);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord3iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord3dvPROC glTexCoord3dv = (glTexCoord3dvPROC)tlsGetFunction(1612);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord3dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord4f(JNIEnv *__env, jclass clazz, jfloat s, jfloat t, jfloat r, jfloat q) {
    glTexCoord4fPROC glTexCoord4f = (glTexCoord4fPROC)tlsGetFunction(1623);
    UNUSED_PARAM(clazz)
    glTexCoord4f(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord4s(JNIEnv *__env, jclass clazz, jshort s, jshort t, jshort r, jshort q) {
    glTexCoord4sPROC glTexCoord4s = (glTexCoord4sPROC)tlsGetFunction(1629);
    UNUSED_PARAM(clazz)
    glTexCoord4s(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord4i(JNIEnv *__env, jclass clazz, jint s, jint t, jint r, jint q) {
    glTexCoord4iPROC glTexCoord4i = (glTexCoord4iPROC)tlsGetFunction(1627);
    UNUSED_PARAM(clazz)
    glTexCoord4i(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord4d(JNIEnv *__env, jclass clazz, jdouble s, jdouble t, jdouble r, jdouble q) {
    glTexCoord4dPROC glTexCoord4d = (glTexCoord4dPROC)tlsGetFunction(1621);
    UNUSED_PARAM(clazz)
    glTexCoord4d(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord4fvPROC glTexCoord4fv = (glTexCoord4fvPROC)tlsGetFunction(1624);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord4fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord4svPROC glTexCoord4sv = (glTexCoord4svPROC)tlsGetFunction(1630);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord4sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord4ivPROC glTexCoord4iv = (glTexCoord4ivPROC)tlsGetFunction(1628);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord4iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord4dvPROC glTexCoord4dv = (glTexCoord4dvPROC)tlsGetFunction(1622);
    const intptr_t v = (const intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord4dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoordPointer(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress) {
    glTexCoordPointerPROC glTexCoordPointer = (glTexCoordPointerPROC)tlsGetFunction(1640);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glTexCoordPointer(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexEnvi(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glTexEnviPROC glTexEnvi = (glTexEnviPROC)tlsGetFunction(1643);
    UNUSED_PARAM(clazz)
    glTexEnvi(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexEnviv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexEnvivPROC glTexEnviv = (glTexEnvivPROC)tlsGetFunction(1644);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexEnviv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexEnvf(JNIEnv *__env, jclass clazz, jint target, jint pname, jfloat param) {
    glTexEnvfPROC glTexEnvf = (glTexEnvfPROC)tlsGetFunction(1641);
    UNUSED_PARAM(clazz)
    glTexEnvf(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexEnvfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexEnvfvPROC glTexEnvfv = (glTexEnvfvPROC)tlsGetFunction(1642);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexEnvfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexGeni(JNIEnv *__env, jclass clazz, jint coord, jint pname, jint param) {
    glTexGeniPROC glTexGeni = (glTexGeniPROC)tlsGetFunction(1649);
    UNUSED_PARAM(clazz)
    glTexGeni(coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGeniv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong paramsAddress) {
    glTexGenivPROC glTexGeniv = (glTexGenivPROC)tlsGetFunction(1650);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexGeniv(coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexGenf(JNIEnv *__env, jclass clazz, jint coord, jint pname, jfloat param) {
    glTexGenfPROC glTexGenf = (glTexGenfPROC)tlsGetFunction(1647);
    UNUSED_PARAM(clazz)
    glTexGenf(coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGenfv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong paramsAddress) {
    glTexGenfvPROC glTexGenfv = (glTexGenfvPROC)tlsGetFunction(1648);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexGenfv(coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexGend(JNIEnv *__env, jclass clazz, jint coord, jint pname, jdouble param) {
    glTexGendPROC glTexGend = (glTexGendPROC)tlsGetFunction(1645);
    UNUSED_PARAM(clazz)
    glTexGend(coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGendv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong paramsAddress) {
    glTexGendvPROC glTexGendv = (glTexGendvPROC)tlsGetFunction(1646);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexGendv(coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexImage2D__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress) {
    glTexImage2DPROC glTexImage2D = (glTexImage2DPROC)tlsGetFunction(1652);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexImage1D__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint border, jint format, jint type, jlong pixelsAddress) {
    glTexImage1DPROC glTexImage1D = (glTexImage1DPROC)tlsGetFunction(1651);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glCopyTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalFormat, jint x, jint y, jint width, jint height, jint border) {
    glCopyTexImage2DPROC glCopyTexImage2D = (glCopyTexImage2DPROC)tlsGetFunction(248);
    UNUSED_PARAM(clazz)
    glCopyTexImage2D(target, level, internalFormat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glCopyTexImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalFormat, jint x, jint y, jint width, jint border) {
    glCopyTexImage1DPROC glCopyTexImage1D = (glCopyTexImage1DPROC)tlsGetFunction(247);
    UNUSED_PARAM(clazz)
    glCopyTexImage1D(target, level, internalFormat, x, y, width, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glCopyTexSubImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint x, jint y, jint width) {
    glCopyTexSubImage1DPROC glCopyTexSubImage1D = (glCopyTexSubImage1DPROC)tlsGetFunction(249);
    UNUSED_PARAM(clazz)
    glCopyTexSubImage1D(target, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glCopyTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
    glCopyTexSubImage2DPROC glCopyTexSubImage2D = (glCopyTexSubImage2DPROC)tlsGetFunction(250);
    UNUSED_PARAM(clazz)
    glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glTexParameteriPROC glTexParameteri = (glTexParameteriPROC)tlsGetFunction(1665);
    UNUSED_PARAM(clazz)
    glTexParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterivPROC glTexParameteriv = (glTexParameterivPROC)tlsGetFunction(1666);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexParameterf(JNIEnv *__env, jclass clazz, jint target, jint pname, jfloat param) {
    glTexParameterfPROC glTexParameterf = (glTexParameterfPROC)tlsGetFunction(1663);
    UNUSED_PARAM(clazz)
    glTexParameterf(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterfvPROC glTexParameterfv = (glTexParameterfvPROC)tlsGetFunction(1664);
    const intptr_t params = (const intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexSubImage1D__IIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress) {
    glTexSubImage1DPROC glTexSubImage1D = (glTexSubImage1DPROC)tlsGetFunction(1679);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexSubImage2D__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glTexSubImage2DPROC glTexSubImage2D = (glTexSubImage2DPROC)tlsGetFunction(1680);
    const intptr_t pixels = (const intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTranslatef(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z) {
    glTranslatefPROC glTranslatef = (glTranslatefPROC)tlsGetFunction(1741);
    UNUSED_PARAM(clazz)
    glTranslatef(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTranslated(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z) {
    glTranslatedPROC glTranslated = (glTranslatedPROC)tlsGetFunction(1740);
    UNUSED_PARAM(clazz)
    glTranslated(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex2f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y) {
    glVertex2fPROC glVertex2f = (glVertex2fPROC)tlsGetFunction(1875);
    UNUSED_PARAM(clazz)
    glVertex2f(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex2s(JNIEnv *__env, jclass clazz, jshort x, jshort y) {
    glVertex2sPROC glVertex2s = (glVertex2sPROC)tlsGetFunction(1881);
    UNUSED_PARAM(clazz)
    glVertex2s(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex2i(JNIEnv *__env, jclass clazz, jint x, jint y) {
    glVertex2iPROC glVertex2i = (glVertex2iPROC)tlsGetFunction(1879);
    UNUSED_PARAM(clazz)
    glVertex2i(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex2d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y) {
    glVertex2dPROC glVertex2d = (glVertex2dPROC)tlsGetFunction(1873);
    UNUSED_PARAM(clazz)
    glVertex2d(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex2fvPROC glVertex2fv = (glVertex2fvPROC)tlsGetFunction(1876);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex2fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex2svPROC glVertex2sv = (glVertex2svPROC)tlsGetFunction(1882);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex2sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex2ivPROC glVertex2iv = (glVertex2ivPROC)tlsGetFunction(1880);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex2iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex2dvPROC glVertex2dv = (glVertex2dvPROC)tlsGetFunction(1874);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex2dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex3f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z) {
    glVertex3fPROC glVertex3f = (glVertex3fPROC)tlsGetFunction(1885);
    UNUSED_PARAM(clazz)
    glVertex3f(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex3s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z) {
    glVertex3sPROC glVertex3s = (glVertex3sPROC)tlsGetFunction(1891);
    UNUSED_PARAM(clazz)
    glVertex3s(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex3i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z) {
    glVertex3iPROC glVertex3i = (glVertex3iPROC)tlsGetFunction(1889);
    UNUSED_PARAM(clazz)
    glVertex3i(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex3d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z) {
    glVertex3dPROC glVertex3d = (glVertex3dPROC)tlsGetFunction(1883);
    UNUSED_PARAM(clazz)
    glVertex3d(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex3fvPROC glVertex3fv = (glVertex3fvPROC)tlsGetFunction(1886);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex3fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex3svPROC glVertex3sv = (glVertex3svPROC)tlsGetFunction(1892);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex3sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex3ivPROC glVertex3iv = (glVertex3ivPROC)tlsGetFunction(1890);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex3iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex3dvPROC glVertex3dv = (glVertex3dvPROC)tlsGetFunction(1884);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex3dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex4f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat w) {
    glVertex4fPROC glVertex4f = (glVertex4fPROC)tlsGetFunction(1895);
    UNUSED_PARAM(clazz)
    glVertex4f(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex4s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jshort w) {
    glVertex4sPROC glVertex4s = (glVertex4sPROC)tlsGetFunction(1901);
    UNUSED_PARAM(clazz)
    glVertex4s(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex4i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z, jint w) {
    glVertex4iPROC glVertex4i = (glVertex4iPROC)tlsGetFunction(1899);
    UNUSED_PARAM(clazz)
    glVertex4i(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex4d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jdouble w) {
    glVertex4dPROC glVertex4d = (glVertex4dPROC)tlsGetFunction(1893);
    UNUSED_PARAM(clazz)
    glVertex4d(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex4fvPROC glVertex4fv = (glVertex4fvPROC)tlsGetFunction(1896);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex4fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex4svPROC glVertex4sv = (glVertex4svPROC)tlsGetFunction(1902);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex4sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex4ivPROC glVertex4iv = (glVertex4ivPROC)tlsGetFunction(1900);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex4iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex4dvPROC glVertex4dv = (glVertex4dvPROC)tlsGetFunction(1894);
    const intptr_t coords = (const intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex4dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertexPointer(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress) {
    glVertexPointerPROC glVertexPointer = (glVertexPointerPROC)tlsGetFunction(2122);
    const intptr_t pointer = (const intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glVertexPointer(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glViewport(JNIEnv *__env, jclass clazz, jint x, jint y, jint w, jint h) {
    glViewportPROC glViewport = (glViewportPROC)tlsGetFunction(2125);
    UNUSED_PARAM(clazz)
    glViewport(x, y, w, h);
}

EXTERN_C_EXIT
