/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Defines the capabilities of an OpenGL context. */
public final class GLCapabilities {

	public final long
		glAccum,
		glActiveProgramEXT,
		glActiveShaderProgram,
		glActiveStencilFaceEXT,
		glActiveTexture,
		glActiveTextureARB,
		glActiveVaryingNV,
		glAlphaFunc,
		glApplyFramebufferAttachmentCMAAINTEL,
		glAreTexturesResident,
		glArrayElement,
		glAttachObjectARB,
		glAttachShader,
		glBegin,
		glBeginConditionalRender,
		glBeginConditionalRenderNV,
		glBeginConditionalRenderNVX,
		glBeginPerfMonitorAMD,
		glBeginPerfQueryINTEL,
		glBeginQuery,
		glBeginQueryARB,
		glBeginQueryIndexed,
		glBeginTransformFeedback,
		glBeginTransformFeedbackEXT,
		glBeginTransformFeedbackNV,
		glBindAttribLocation,
		glBindAttribLocationARB,
		glBindBuffer,
		glBindBufferARB,
		glBindBufferBase,
		glBindBufferBaseEXT,
		glBindBufferBaseNV,
		glBindBufferOffsetEXT,
		glBindBufferOffsetNV,
		glBindBufferRange,
		glBindBufferRangeEXT,
		glBindBufferRangeNV,
		glBindBuffersBase,
		glBindBuffersRange,
		glBindFragDataLocation,
		glBindFragDataLocationEXT,
		glBindFragDataLocationIndexed,
		glBindFramebuffer,
		glBindFramebufferEXT,
		glBindImageTexture,
		glBindImageTextureEXT,
		glBindImageTextures,
		glBindMultiTextureEXT,
		glBindProgramARB,
		glBindProgramPipeline,
		glBindRenderbuffer,
		glBindRenderbufferEXT,
		glBindSampler,
		glBindSamplers,
		glBindTexture,
		glBindTextureUnit,
		glBindTextures,
		glBindTransformFeedback,
		glBindTransformFeedbackNV,
		glBindVertexArray,
		glBindVertexBuffer,
		glBindVertexBuffers,
		glBitmap,
		glBlendBarrierKHR,
		glBlendBarrierNV,
		glBlendColor,
		glBlendColorEXT,
		glBlendEquation,
		glBlendEquationEXT,
		glBlendEquationIndexedAMD,
		glBlendEquationSeparate,
		glBlendEquationSeparateEXT,
		glBlendEquationSeparateIndexedAMD,
		glBlendEquationSeparatei,
		glBlendEquationSeparateiARB,
		glBlendEquationi,
		glBlendEquationiARB,
		glBlendFunc,
		glBlendFuncIndexedAMD,
		glBlendFuncSeparate,
		glBlendFuncSeparateEXT,
		glBlendFuncSeparateIndexedAMD,
		glBlendFuncSeparatei,
		glBlendFuncSeparateiARB,
		glBlendFunci,
		glBlendFunciARB,
		glBlendParameteriNV,
		glBlitFramebuffer,
		glBlitFramebufferEXT,
		glBlitNamedFramebuffer,
		glBufferAddressRangeNV,
		glBufferData,
		glBufferDataARB,
		glBufferPageCommitmentARB,
		glBufferStorage,
		glBufferSubData,
		glBufferSubDataARB,
		glCallCommandListNV,
		glCallList,
		glCallLists,
		glCheckFramebufferStatus,
		glCheckFramebufferStatusEXT,
		glCheckNamedFramebufferStatus,
		glCheckNamedFramebufferStatusEXT,
		glClampColor,
		glClampColorARB,
		glClear,
		glClearAccum,
		glClearBufferData,
		glClearBufferSubData,
		glClearBufferfi,
		glClearBufferfv,
		glClearBufferiv,
		glClearBufferuiv,
		glClearColor,
		glClearColorIiEXT,
		glClearColorIuiEXT,
		glClearDepth,
		glClearDepthdNV,
		glClearDepthf,
		glClearIndex,
		glClearNamedBufferData,
		glClearNamedBufferDataEXT,
		glClearNamedBufferSubData,
		glClearNamedBufferSubDataEXT,
		glClearNamedFramebufferfi,
		glClearNamedFramebufferfv,
		glClearNamedFramebufferiv,
		glClearNamedFramebufferuiv,
		glClearStencil,
		glClearTexImage,
		glClearTexSubImage,
		glClientActiveTexture,
		glClientActiveTextureARB,
		glClientAttribDefaultEXT,
		glClientWaitSync,
		glClipControl,
		glClipPlane,
		glColor3b,
		glColor3bv,
		glColor3d,
		glColor3dv,
		glColor3f,
		glColor3fv,
		glColor3hNV,
		glColor3hvNV,
		glColor3i,
		glColor3iv,
		glColor3s,
		glColor3sv,
		glColor3ub,
		glColor3ubv,
		glColor3ui,
		glColor3uiv,
		glColor3us,
		glColor3usv,
		glColor4b,
		glColor4bv,
		glColor4d,
		glColor4dv,
		glColor4f,
		glColor4fv,
		glColor4hNV,
		glColor4hvNV,
		glColor4i,
		glColor4iv,
		glColor4s,
		glColor4sv,
		glColor4ub,
		glColor4ubv,
		glColor4ui,
		glColor4uiv,
		glColor4us,
		glColor4usv,
		glColorFormatNV,
		glColorMask,
		glColorMaskIndexedEXT,
		glColorMaski,
		glColorMaterial,
		glColorP3ui,
		glColorP3uiv,
		glColorP4ui,
		glColorP4uiv,
		glColorPointer,
		glColorSubTable,
		glColorTable,
		glColorTableParameterfv,
		glColorTableParameteriv,
		glCommandListSegmentsNV,
		glCompileCommandListNV,
		glCompileShader,
		glCompileShaderARB,
		glCompileShaderIncludeARB,
		glCompressedMultiTexImage1DEXT,
		glCompressedMultiTexImage2DEXT,
		glCompressedMultiTexImage3DEXT,
		glCompressedMultiTexSubImage1DEXT,
		glCompressedMultiTexSubImage2DEXT,
		glCompressedMultiTexSubImage3DEXT,
		glCompressedTexImage1D,
		glCompressedTexImage1DARB,
		glCompressedTexImage2D,
		glCompressedTexImage2DARB,
		glCompressedTexImage3D,
		glCompressedTexImage3DARB,
		glCompressedTexSubImage1D,
		glCompressedTexSubImage1DARB,
		glCompressedTexSubImage2D,
		glCompressedTexSubImage2DARB,
		glCompressedTexSubImage3D,
		glCompressedTexSubImage3DARB,
		glCompressedTextureImage1DEXT,
		glCompressedTextureImage2DEXT,
		glCompressedTextureImage3DEXT,
		glCompressedTextureSubImage1D,
		glCompressedTextureSubImage1DEXT,
		glCompressedTextureSubImage2D,
		glCompressedTextureSubImage2DEXT,
		glCompressedTextureSubImage3D,
		glCompressedTextureSubImage3DEXT,
		glConservativeRasterParameterfNV,
		glConservativeRasterParameteriNV,
		glConvolutionFilter1D,
		glConvolutionFilter2D,
		glConvolutionParameterf,
		glConvolutionParameterfv,
		glConvolutionParameteri,
		glConvolutionParameteriv,
		glCopyBufferSubData,
		glCopyColorSubTable,
		glCopyColorTable,
		glCopyConvolutionFilter1D,
		glCopyConvolutionFilter2D,
		glCopyImageSubData,
		glCopyImageSubDataNV,
		glCopyMultiTexImage1DEXT,
		glCopyMultiTexImage2DEXT,
		glCopyMultiTexSubImage1DEXT,
		glCopyMultiTexSubImage2DEXT,
		glCopyMultiTexSubImage3DEXT,
		glCopyNamedBufferSubData,
		glCopyPathNV,
		glCopyPixels,
		glCopyTexImage1D,
		glCopyTexImage2D,
		glCopyTexSubImage1D,
		glCopyTexSubImage2D,
		glCopyTexSubImage3D,
		glCopyTextureImage1DEXT,
		glCopyTextureImage2DEXT,
		glCopyTextureSubImage1D,
		glCopyTextureSubImage1DEXT,
		glCopyTextureSubImage2D,
		glCopyTextureSubImage2DEXT,
		glCopyTextureSubImage3D,
		glCopyTextureSubImage3DEXT,
		glCoverFillPathInstancedNV,
		glCoverFillPathNV,
		glCoverStrokePathInstancedNV,
		glCoverStrokePathNV,
		glCoverageModulationNV,
		glCoverageModulationTableNV,
		glCreateBuffers,
		glCreateCommandListsNV,
		glCreateFramebuffers,
		glCreatePerfQueryINTEL,
		glCreateProgram,
		glCreateProgramObjectARB,
		glCreateProgramPipelines,
		glCreateQueries,
		glCreateRenderbuffers,
		glCreateSamplers,
		glCreateShader,
		glCreateShaderObjectARB,
		glCreateShaderProgramEXT,
		glCreateShaderProgramv,
		glCreateStatesNV,
		glCreateSyncFromCLeventARB,
		glCreateTextures,
		glCreateTransformFeedbacks,
		glCreateVertexArrays,
		glCullFace,
		glCurrentPaletteMatrixARB,
		glDebugMessageCallback,
		glDebugMessageCallbackAMD,
		glDebugMessageCallbackARB,
		glDebugMessageControl,
		glDebugMessageControlARB,
		glDebugMessageEnableAMD,
		glDebugMessageInsert,
		glDebugMessageInsertAMD,
		glDebugMessageInsertARB,
		glDeleteBuffers,
		glDeleteBuffersARB,
		glDeleteCommandListsNV,
		glDeleteFencesNV,
		glDeleteFramebuffers,
		glDeleteFramebuffersEXT,
		glDeleteLists,
		glDeleteNamedStringARB,
		glDeleteObjectARB,
		glDeletePathsNV,
		glDeletePerfMonitorsAMD,
		glDeletePerfQueryINTEL,
		glDeleteProgram,
		glDeleteProgramPipelines,
		glDeleteProgramsARB,
		glDeleteQueries,
		glDeleteQueriesARB,
		glDeleteRenderbuffers,
		glDeleteRenderbuffersEXT,
		glDeleteSamplers,
		glDeleteShader,
		glDeleteStatesNV,
		glDeleteSync,
		glDeleteTextures,
		glDeleteTransformFeedbacks,
		glDeleteTransformFeedbacksNV,
		glDeleteVertexArrays,
		glDepthBoundsEXT,
		glDepthBoundsdNV,
		glDepthFunc,
		glDepthMask,
		glDepthRange,
		glDepthRangeArrayv,
		glDepthRangeIndexed,
		glDepthRangedNV,
		glDepthRangef,
		glDetachObjectARB,
		glDetachShader,
		glDisable,
		glDisableClientState,
		glDisableClientStateIndexedEXT,
		glDisableClientStateiEXT,
		glDisableIndexedEXT,
		glDisableVertexArrayAttrib,
		glDisableVertexArrayAttribEXT,
		glDisableVertexArrayEXT,
		glDisableVertexAttribArray,
		glDisableVertexAttribArrayARB,
		glDisablei,
		glDispatchCompute,
		glDispatchComputeGroupSizeARB,
		glDispatchComputeIndirect,
		glDrawArrays,
		glDrawArraysIndirect,
		glDrawArraysInstanced,
		glDrawArraysInstancedARB,
		glDrawArraysInstancedBaseInstance,
		glDrawArraysInstancedEXT,
		glDrawBuffer,
		glDrawBuffers,
		glDrawBuffersARB,
		glDrawCommandsAddressNV,
		glDrawCommandsNV,
		glDrawCommandsStatesAddressNV,
		glDrawCommandsStatesNV,
		glDrawElements,
		glDrawElementsBaseVertex,
		glDrawElementsIndirect,
		glDrawElementsInstanced,
		glDrawElementsInstancedARB,
		glDrawElementsInstancedBaseInstance,
		glDrawElementsInstancedBaseVertex,
		glDrawElementsInstancedBaseVertexBaseInstance,
		glDrawElementsInstancedEXT,
		glDrawPixels,
		glDrawRangeElements,
		glDrawRangeElementsBaseVertex,
		glDrawTextureNV,
		glDrawTransformFeedback,
		glDrawTransformFeedbackInstanced,
		glDrawTransformFeedbackNV,
		glDrawTransformFeedbackStream,
		glDrawTransformFeedbackStreamInstanced,
		glDrawVkImageNV,
		glEdgeFlag,
		glEdgeFlagFormatNV,
		glEdgeFlagPointer,
		glEdgeFlagv,
		glEnable,
		glEnableClientState,
		glEnableClientStateIndexedEXT,
		glEnableClientStateiEXT,
		glEnableIndexedEXT,
		glEnableVertexArrayAttrib,
		glEnableVertexArrayAttribEXT,
		glEnableVertexArrayEXT,
		glEnableVertexAttribArray,
		glEnableVertexAttribArrayARB,
		glEnablei,
		glEnd,
		glEndConditionalRender,
		glEndConditionalRenderNV,
		glEndConditionalRenderNVX,
		glEndList,
		glEndPerfMonitorAMD,
		glEndPerfQueryINTEL,
		glEndQuery,
		glEndQueryARB,
		glEndQueryIndexed,
		glEndTransformFeedback,
		glEndTransformFeedbackEXT,
		glEndTransformFeedbackNV,
		glEvalCoord1d,
		glEvalCoord1dv,
		glEvalCoord1f,
		glEvalCoord1fv,
		glEvalCoord2d,
		glEvalCoord2dv,
		glEvalCoord2f,
		glEvalCoord2fv,
		glEvalMesh1,
		glEvalMesh2,
		glEvalPoint1,
		glEvalPoint2,
		glEvaluateDepthValuesARB,
		glFeedbackBuffer,
		glFenceSync,
		glFinish,
		glFinishFenceNV,
		glFlush,
		glFlushMappedBufferRange,
		glFlushMappedNamedBufferRange,
		glFlushMappedNamedBufferRangeEXT,
		glFlushPixelDataRangeNV,
		glFlushVertexArrayRangeNV,
		glFogCoordFormatNV,
		glFogCoordPointer,
		glFogCoordd,
		glFogCoorddv,
		glFogCoordf,
		glFogCoordfv,
		glFogCoordhNV,
		glFogCoordhvNV,
		glFogf,
		glFogfv,
		glFogi,
		glFogiv,
		glFragmentCoverageColorNV,
		glFramebufferDrawBufferEXT,
		glFramebufferDrawBuffersEXT,
		glFramebufferParameteri,
		glFramebufferReadBufferEXT,
		glFramebufferRenderbuffer,
		glFramebufferRenderbufferEXT,
		glFramebufferSampleLocationsfvARB,
		glFramebufferSampleLocationsfvNV,
		glFramebufferTexture,
		glFramebufferTexture1D,
		glFramebufferTexture1DEXT,
		glFramebufferTexture2D,
		glFramebufferTexture2DEXT,
		glFramebufferTexture3D,
		glFramebufferTexture3DEXT,
		glFramebufferTextureARB,
		glFramebufferTextureEXT,
		glFramebufferTextureFaceARB,
		glFramebufferTextureFaceEXT,
		glFramebufferTextureLayer,
		glFramebufferTextureLayerARB,
		glFramebufferTextureLayerEXT,
		glFramebufferTextureMultiviewOVR,
		glFrontFace,
		glFrustum,
		glGenBuffers,
		glGenBuffersARB,
		glGenFencesNV,
		glGenFramebuffers,
		glGenFramebuffersEXT,
		glGenLists,
		glGenPathsNV,
		glGenPerfMonitorsAMD,
		glGenProgramPipelines,
		glGenProgramsARB,
		glGenQueries,
		glGenQueriesARB,
		glGenRenderbuffers,
		glGenRenderbuffersEXT,
		glGenSamplers,
		glGenTextures,
		glGenTransformFeedbacks,
		glGenTransformFeedbacksNV,
		glGenVertexArrays,
		glGenerateMipmap,
		glGenerateMipmapEXT,
		glGenerateMultiTexMipmapEXT,
		glGenerateTextureMipmap,
		glGenerateTextureMipmapEXT,
		glGetActiveAtomicCounterBufferiv,
		glGetActiveAttrib,
		glGetActiveAttribARB,
		glGetActiveSubroutineName,
		glGetActiveSubroutineUniformName,
		glGetActiveSubroutineUniformiv,
		glGetActiveUniform,
		glGetActiveUniformARB,
		glGetActiveUniformBlockName,
		glGetActiveUniformBlockiv,
		glGetActiveUniformName,
		glGetActiveUniformsiv,
		glGetActiveVaryingNV,
		glGetAttachedObjectsARB,
		glGetAttachedShaders,
		glGetAttribLocation,
		glGetAttribLocationARB,
		glGetBooleanIndexedvEXT,
		glGetBooleani_v,
		glGetBooleanv,
		glGetBufferParameteri64v,
		glGetBufferParameteriv,
		glGetBufferParameterivARB,
		glGetBufferParameterui64vNV,
		glGetBufferPointerv,
		glGetBufferPointervARB,
		glGetBufferSubData,
		glGetBufferSubDataARB,
		glGetClipPlane,
		glGetColorTable,
		glGetColorTableParameterfv,
		glGetColorTableParameteriv,
		glGetCommandHeaderNV,
		glGetCompressedMultiTexImageEXT,
		glGetCompressedTexImage,
		glGetCompressedTexImageARB,
		glGetCompressedTextureImage,
		glGetCompressedTextureImageEXT,
		glGetCompressedTextureSubImage,
		glGetConvolutionFilter,
		glGetConvolutionParameterfv,
		glGetConvolutionParameteriv,
		glGetCoverageModulationTableNV,
		glGetDebugMessageLog,
		glGetDebugMessageLogAMD,
		glGetDebugMessageLogARB,
		glGetDoubleIndexedvEXT,
		glGetDoublei_v,
		glGetDoublei_vEXT,
		glGetDoublev,
		glGetError,
		glGetFenceivNV,
		glGetFirstPerfQueryIdINTEL,
		glGetFloatIndexedvEXT,
		glGetFloati_v,
		glGetFloati_vEXT,
		glGetFloatv,
		glGetFragDataIndex,
		glGetFragDataLocation,
		glGetFragDataLocationEXT,
		glGetFramebufferAttachmentParameteriv,
		glGetFramebufferAttachmentParameterivEXT,
		glGetFramebufferParameteriv,
		glGetFramebufferParameterivEXT,
		glGetGraphicsResetStatus,
		glGetGraphicsResetStatusARB,
		glGetHandleARB,
		glGetHistogram,
		glGetHistogramParameterfv,
		glGetHistogramParameteriv,
		glGetImageHandleARB,
		glGetImageHandleNV,
		glGetInfoLogARB,
		glGetInteger64i_v,
		glGetInteger64v,
		glGetIntegerIndexedvEXT,
		glGetIntegeri_v,
		glGetIntegerui64i_vNV,
		glGetIntegerui64vNV,
		glGetIntegerv,
		glGetInternalformatSampleivNV,
		glGetInternalformati64v,
		glGetInternalformativ,
		glGetLightfv,
		glGetLightiv,
		glGetMapdv,
		glGetMapfv,
		glGetMapiv,
		glGetMaterialfv,
		glGetMaterialiv,
		glGetMinmax,
		glGetMinmaxParameterfv,
		glGetMinmaxParameteriv,
		glGetMultiTexEnvfvEXT,
		glGetMultiTexEnvivEXT,
		glGetMultiTexGendvEXT,
		glGetMultiTexGenfvEXT,
		glGetMultiTexGenivEXT,
		glGetMultiTexImageEXT,
		glGetMultiTexLevelParameterfvEXT,
		glGetMultiTexLevelParameterivEXT,
		glGetMultiTexParameterIivEXT,
		glGetMultiTexParameterIuivEXT,
		glGetMultiTexParameterfvEXT,
		glGetMultiTexParameterivEXT,
		glGetMultisamplefv,
		glGetMultisamplefvNV,
		glGetNamedBufferParameteri64v,
		glGetNamedBufferParameteriv,
		glGetNamedBufferParameterivEXT,
		glGetNamedBufferParameterui64vNV,
		glGetNamedBufferPointerv,
		glGetNamedBufferSubData,
		glGetNamedBufferSubDataEXT,
		glGetNamedFramebufferAttachmentParameteriv,
		glGetNamedFramebufferAttachmentParameterivEXT,
		glGetNamedFramebufferParameteriv,
		glGetNamedFramebufferParameterivEXT,
		glGetNamedProgramLocalParameterIivEXT,
		glGetNamedProgramLocalParameterIuivEXT,
		glGetNamedProgramLocalParameterdvEXT,
		glGetNamedProgramLocalParameterfvEXT,
		glGetNamedProgramStringEXT,
		glGetNamedProgramivEXT,
		glGetNamedRenderbufferParameteriv,
		glGetNamedRenderbufferParameterivEXT,
		glGetNamedStringARB,
		glGetNamedStringivARB,
		glGetNextPerfQueryIdINTEL,
		glGetObjectLabel,
		glGetObjectLabelEXT,
		glGetObjectParameterfvARB,
		glGetObjectParameterivARB,
		glGetObjectPtrLabel,
		glGetPathColorGenfvNV,
		glGetPathColorGenivNV,
		glGetPathCommandsNV,
		glGetPathCoordsNV,
		glGetPathDashArrayNV,
		glGetPathLengthNV,
		glGetPathMetricRangeNV,
		glGetPathMetricsNV,
		glGetPathParameterfvNV,
		glGetPathParameterivNV,
		glGetPathSpacingNV,
		glGetPathTexGenfvNV,
		glGetPathTexGenivNV,
		glGetPerfCounterInfoINTEL,
		glGetPerfMonitorCounterDataAMD,
		glGetPerfMonitorCounterInfoAMD,
		glGetPerfMonitorCounterStringAMD,
		glGetPerfMonitorCountersAMD,
		glGetPerfMonitorGroupStringAMD,
		glGetPerfMonitorGroupsAMD,
		glGetPerfQueryDataINTEL,
		glGetPerfQueryIdByNameINTEL,
		glGetPerfQueryInfoINTEL,
		glGetPixelMapfv,
		glGetPixelMapuiv,
		glGetPixelMapusv,
		glGetPointerIndexedvEXT,
		glGetPointeri_vEXT,
		glGetPointerv,
		glGetPolygonStipple,
		glGetProgramBinary,
		glGetProgramEnvParameterdvARB,
		glGetProgramEnvParameterfvARB,
		glGetProgramInfoLog,
		glGetProgramInterfaceiv,
		glGetProgramLocalParameterdvARB,
		glGetProgramLocalParameterfvARB,
		glGetProgramPipelineInfoLog,
		glGetProgramPipelineiv,
		glGetProgramResourceIndex,
		glGetProgramResourceLocation,
		glGetProgramResourceLocationIndex,
		glGetProgramResourceName,
		glGetProgramResourcefvNV,
		glGetProgramResourceiv,
		glGetProgramStageiv,
		glGetProgramStringARB,
		glGetProgramiv,
		glGetProgramivARB,
		glGetQueryBufferObjecti64v,
		glGetQueryBufferObjectiv,
		glGetQueryBufferObjectui64v,
		glGetQueryBufferObjectuiv,
		glGetQueryIndexediv,
		glGetQueryObjecti64v,
		glGetQueryObjecti64vEXT,
		glGetQueryObjectiv,
		glGetQueryObjectivARB,
		glGetQueryObjectui64v,
		glGetQueryObjectui64vEXT,
		glGetQueryObjectuiv,
		glGetQueryObjectuivARB,
		glGetQueryiv,
		glGetQueryivARB,
		glGetRenderbufferParameteriv,
		glGetRenderbufferParameterivEXT,
		glGetSamplerParameterIiv,
		glGetSamplerParameterIuiv,
		glGetSamplerParameterfv,
		glGetSamplerParameteriv,
		glGetSeparableFilter,
		glGetShaderInfoLog,
		glGetShaderPrecisionFormat,
		glGetShaderSource,
		glGetShaderSourceARB,
		glGetShaderiv,
		glGetStageIndexNV,
		glGetString,
		glGetStringi,
		glGetSubroutineIndex,
		glGetSubroutineUniformLocation,
		glGetSynciv,
		glGetTexEnvfv,
		glGetTexEnviv,
		glGetTexGendv,
		glGetTexGenfv,
		glGetTexGeniv,
		glGetTexImage,
		glGetTexLevelParameterfv,
		glGetTexLevelParameteriv,
		glGetTexParameterIiv,
		glGetTexParameterIivEXT,
		glGetTexParameterIuiv,
		glGetTexParameterIuivEXT,
		glGetTexParameterfv,
		glGetTexParameteriv,
		glGetTextureHandleARB,
		glGetTextureHandleNV,
		glGetTextureImage,
		glGetTextureImageEXT,
		glGetTextureLevelParameterfv,
		glGetTextureLevelParameterfvEXT,
		glGetTextureLevelParameteriv,
		glGetTextureLevelParameterivEXT,
		glGetTextureParameterIiv,
		glGetTextureParameterIivEXT,
		glGetTextureParameterIuiv,
		glGetTextureParameterIuivEXT,
		glGetTextureParameterfv,
		glGetTextureParameterfvEXT,
		glGetTextureParameteriv,
		glGetTextureParameterivEXT,
		glGetTextureSamplerHandleARB,
		glGetTextureSamplerHandleNV,
		glGetTextureSubImage,
		glGetTransformFeedbackVarying,
		glGetTransformFeedbackVaryingEXT,
		glGetTransformFeedbackVaryingNV,
		glGetTransformFeedbacki64_v,
		glGetTransformFeedbacki_v,
		glGetTransformFeedbackiv,
		glGetUniformBlockIndex,
		glGetUniformBufferSizeEXT,
		glGetUniformIndices,
		glGetUniformLocation,
		glGetUniformLocationARB,
		glGetUniformOffsetEXT,
		glGetUniformSubroutineuiv,
		glGetUniformdv,
		glGetUniformfv,
		glGetUniformfvARB,
		glGetUniformi64vARB,
		glGetUniformi64vNV,
		glGetUniformiv,
		glGetUniformivARB,
		glGetUniformui64vARB,
		glGetUniformui64vNV,
		glGetUniformuiv,
		glGetUniformuivEXT,
		glGetVaryingLocationNV,
		glGetVertexArrayIndexed64iv,
		glGetVertexArrayIndexediv,
		glGetVertexArrayIntegeri_vEXT,
		glGetVertexArrayIntegervEXT,
		glGetVertexArrayPointeri_vEXT,
		glGetVertexArrayPointervEXT,
		glGetVertexArrayiv,
		glGetVertexAttribIiv,
		glGetVertexAttribIivEXT,
		glGetVertexAttribIuiv,
		glGetVertexAttribIuivEXT,
		glGetVertexAttribLdv,
		glGetVertexAttribLdvEXT,
		glGetVertexAttribLi64vNV,
		glGetVertexAttribLui64vARB,
		glGetVertexAttribLui64vNV,
		glGetVertexAttribPointerv,
		glGetVertexAttribPointervARB,
		glGetVertexAttribdv,
		glGetVertexAttribdvARB,
		glGetVertexAttribfv,
		glGetVertexAttribfvARB,
		glGetVertexAttribiv,
		glGetVertexAttribivARB,
		glGetVkProcAddrNV,
		glGetnColorTable,
		glGetnColorTableARB,
		glGetnCompressedTexImage,
		glGetnCompressedTexImageARB,
		glGetnConvolutionFilter,
		glGetnConvolutionFilterARB,
		glGetnHistogram,
		glGetnHistogramARB,
		glGetnMapdv,
		glGetnMapdvARB,
		glGetnMapfv,
		glGetnMapfvARB,
		glGetnMapiv,
		glGetnMapivARB,
		glGetnMinmax,
		glGetnMinmaxARB,
		glGetnPixelMapfv,
		glGetnPixelMapfvARB,
		glGetnPixelMapuiv,
		glGetnPixelMapuivARB,
		glGetnPixelMapusv,
		glGetnPixelMapusvARB,
		glGetnPolygonStipple,
		glGetnPolygonStippleARB,
		glGetnSeparableFilter,
		glGetnSeparableFilterARB,
		glGetnTexImage,
		glGetnTexImageARB,
		glGetnUniformdv,
		glGetnUniformdvARB,
		glGetnUniformfv,
		glGetnUniformfvARB,
		glGetnUniformi64vARB,
		glGetnUniformiv,
		glGetnUniformivARB,
		glGetnUniformui64vARB,
		glGetnUniformuiv,
		glGetnUniformuivARB,
		glHint,
		glHistogram,
		glImportSyncEXT,
		glIndexFormatNV,
		glIndexMask,
		glIndexPointer,
		glIndexd,
		glIndexdv,
		glIndexf,
		glIndexfv,
		glIndexi,
		glIndexiv,
		glIndexs,
		glIndexsv,
		glIndexub,
		glIndexubv,
		glInitNames,
		glInsertEventMarkerEXT,
		glInterleavedArrays,
		glInterpolatePathsNV,
		glInvalidateBufferData,
		glInvalidateBufferSubData,
		glInvalidateFramebuffer,
		glInvalidateNamedFramebufferData,
		glInvalidateNamedFramebufferSubData,
		glInvalidateSubFramebuffer,
		glInvalidateTexImage,
		glInvalidateTexSubImage,
		glIsBuffer,
		glIsBufferARB,
		glIsBufferResidentNV,
		glIsCommandListNV,
		glIsEnabled,
		glIsEnabledIndexedEXT,
		glIsEnabledi,
		glIsFenceNV,
		glIsFramebuffer,
		glIsFramebufferEXT,
		glIsImageHandleResidentARB,
		glIsImageHandleResidentNV,
		glIsList,
		glIsNamedBufferResidentNV,
		glIsNamedStringARB,
		glIsPathNV,
		glIsPointInFillPathNV,
		glIsPointInStrokePathNV,
		glIsProgram,
		glIsProgramARB,
		glIsProgramPipeline,
		glIsQuery,
		glIsQueryARB,
		glIsRenderbuffer,
		glIsRenderbufferEXT,
		glIsSampler,
		glIsShader,
		glIsStateNV,
		glIsSync,
		glIsTexture,
		glIsTextureHandleResidentARB,
		glIsTextureHandleResidentNV,
		glIsTransformFeedback,
		glIsTransformFeedbackNV,
		glIsVertexArray,
		glLabelObjectEXT,
		glLightModelf,
		glLightModelfv,
		glLightModeli,
		glLightModeliv,
		glLightf,
		glLightfv,
		glLighti,
		glLightiv,
		glLineStipple,
		glLineWidth,
		glLinkProgram,
		glLinkProgramARB,
		glListBase,
		glListDrawCommandsStatesClientNV,
		glLoadIdentity,
		glLoadMatrixd,
		glLoadMatrixf,
		glLoadName,
		glLoadTransposeMatrixd,
		glLoadTransposeMatrixdARB,
		glLoadTransposeMatrixf,
		glLoadTransposeMatrixfARB,
		glLockArraysEXT,
		glLogicOp,
		glMakeBufferNonResidentNV,
		glMakeBufferResidentNV,
		glMakeImageHandleNonResidentARB,
		glMakeImageHandleNonResidentNV,
		glMakeImageHandleResidentARB,
		glMakeImageHandleResidentNV,
		glMakeNamedBufferNonResidentNV,
		glMakeNamedBufferResidentNV,
		glMakeTextureHandleNonResidentARB,
		glMakeTextureHandleNonResidentNV,
		glMakeTextureHandleResidentARB,
		glMakeTextureHandleResidentNV,
		glMap1d,
		glMap1f,
		glMap2d,
		glMap2f,
		glMapBuffer,
		glMapBufferARB,
		glMapBufferRange,
		glMapGrid1d,
		glMapGrid1f,
		glMapGrid2d,
		glMapGrid2f,
		glMapNamedBuffer,
		glMapNamedBufferEXT,
		glMapNamedBufferRange,
		glMapNamedBufferRangeEXT,
		glMapTexture2DINTEL,
		glMaterialf,
		glMaterialfv,
		glMateriali,
		glMaterialiv,
		glMatrixFrustumEXT,
		glMatrixIndexPointerARB,
		glMatrixIndexubvARB,
		glMatrixIndexuivARB,
		glMatrixIndexusvARB,
		glMatrixLoad3x2fNV,
		glMatrixLoad3x3fNV,
		glMatrixLoadIdentityEXT,
		glMatrixLoadTranspose3x3fNV,
		glMatrixLoadTransposedEXT,
		glMatrixLoadTransposefEXT,
		glMatrixLoaddEXT,
		glMatrixLoadfEXT,
		glMatrixMode,
		glMatrixMult3x2fNV,
		glMatrixMult3x3fNV,
		glMatrixMultTranspose3x3fNV,
		glMatrixMultTransposedEXT,
		glMatrixMultTransposefEXT,
		glMatrixMultdEXT,
		glMatrixMultfEXT,
		glMatrixOrthoEXT,
		glMatrixPopEXT,
		glMatrixPushEXT,
		glMatrixRotatedEXT,
		glMatrixRotatefEXT,
		glMatrixScaledEXT,
		glMatrixScalefEXT,
		glMatrixTranslatedEXT,
		glMatrixTranslatefEXT,
		glMaxShaderCompilerThreadsARB,
		glMemoryBarrier,
		glMemoryBarrierByRegion,
		glMemoryBarrierEXT,
		glMinSampleShading,
		glMinSampleShadingARB,
		glMinmax,
		glMultMatrixd,
		glMultMatrixf,
		glMultTransposeMatrixd,
		glMultTransposeMatrixdARB,
		glMultTransposeMatrixf,
		glMultTransposeMatrixfARB,
		glMultiDrawArrays,
		glMultiDrawArraysIndirect,
		glMultiDrawArraysIndirectBindlessCountNV,
		glMultiDrawArraysIndirectBindlessNV,
		glMultiDrawArraysIndirectCountARB,
		glMultiDrawElements,
		glMultiDrawElementsBaseVertex,
		glMultiDrawElementsIndirect,
		glMultiDrawElementsIndirectBindlessCountNV,
		glMultiDrawElementsIndirectBindlessNV,
		glMultiDrawElementsIndirectCountARB,
		glMultiTexBufferEXT,
		glMultiTexCoord1d,
		glMultiTexCoord1dARB,
		glMultiTexCoord1dv,
		glMultiTexCoord1dvARB,
		glMultiTexCoord1f,
		glMultiTexCoord1fARB,
		glMultiTexCoord1fv,
		glMultiTexCoord1fvARB,
		glMultiTexCoord1hNV,
		glMultiTexCoord1hvNV,
		glMultiTexCoord1i,
		glMultiTexCoord1iARB,
		glMultiTexCoord1iv,
		glMultiTexCoord1ivARB,
		glMultiTexCoord1s,
		glMultiTexCoord1sARB,
		glMultiTexCoord1sv,
		glMultiTexCoord1svARB,
		glMultiTexCoord2d,
		glMultiTexCoord2dARB,
		glMultiTexCoord2dv,
		glMultiTexCoord2dvARB,
		glMultiTexCoord2f,
		glMultiTexCoord2fARB,
		glMultiTexCoord2fv,
		glMultiTexCoord2fvARB,
		glMultiTexCoord2hNV,
		glMultiTexCoord2hvNV,
		glMultiTexCoord2i,
		glMultiTexCoord2iARB,
		glMultiTexCoord2iv,
		glMultiTexCoord2ivARB,
		glMultiTexCoord2s,
		glMultiTexCoord2sARB,
		glMultiTexCoord2sv,
		glMultiTexCoord2svARB,
		glMultiTexCoord3d,
		glMultiTexCoord3dARB,
		glMultiTexCoord3dv,
		glMultiTexCoord3dvARB,
		glMultiTexCoord3f,
		glMultiTexCoord3fARB,
		glMultiTexCoord3fv,
		glMultiTexCoord3fvARB,
		glMultiTexCoord3hNV,
		glMultiTexCoord3hvNV,
		glMultiTexCoord3i,
		glMultiTexCoord3iARB,
		glMultiTexCoord3iv,
		glMultiTexCoord3ivARB,
		glMultiTexCoord3s,
		glMultiTexCoord3sARB,
		glMultiTexCoord3sv,
		glMultiTexCoord3svARB,
		glMultiTexCoord4d,
		glMultiTexCoord4dARB,
		glMultiTexCoord4dv,
		glMultiTexCoord4dvARB,
		glMultiTexCoord4f,
		glMultiTexCoord4fARB,
		glMultiTexCoord4fv,
		glMultiTexCoord4fvARB,
		glMultiTexCoord4hNV,
		glMultiTexCoord4hvNV,
		glMultiTexCoord4i,
		glMultiTexCoord4iARB,
		glMultiTexCoord4iv,
		glMultiTexCoord4ivARB,
		glMultiTexCoord4s,
		glMultiTexCoord4sARB,
		glMultiTexCoord4sv,
		glMultiTexCoord4svARB,
		glMultiTexCoordP1ui,
		glMultiTexCoordP1uiv,
		glMultiTexCoordP2ui,
		glMultiTexCoordP2uiv,
		glMultiTexCoordP3ui,
		glMultiTexCoordP3uiv,
		glMultiTexCoordP4ui,
		glMultiTexCoordP4uiv,
		glMultiTexCoordPointerEXT,
		glMultiTexEnvfEXT,
		glMultiTexEnvfvEXT,
		glMultiTexEnviEXT,
		glMultiTexEnvivEXT,
		glMultiTexGendEXT,
		glMultiTexGendvEXT,
		glMultiTexGenfEXT,
		glMultiTexGenfvEXT,
		glMultiTexGeniEXT,
		glMultiTexGenivEXT,
		glMultiTexImage1DEXT,
		glMultiTexImage2DEXT,
		glMultiTexImage3DEXT,
		glMultiTexParameterIivEXT,
		glMultiTexParameterIuivEXT,
		glMultiTexParameterfEXT,
		glMultiTexParameterfvEXT,
		glMultiTexParameteriEXT,
		glMultiTexParameterivEXT,
		glMultiTexRenderbufferEXT,
		glMultiTexSubImage1DEXT,
		glMultiTexSubImage2DEXT,
		glMultiTexSubImage3DEXT,
		glNamedBufferData,
		glNamedBufferDataEXT,
		glNamedBufferPageCommitmentARB,
		glNamedBufferPageCommitmentEXT,
		glNamedBufferStorage,
		glNamedBufferStorageEXT,
		glNamedBufferSubData,
		glNamedBufferSubDataEXT,
		glNamedCopyBufferSubDataEXT,
		glNamedFramebufferDrawBuffer,
		glNamedFramebufferDrawBuffers,
		glNamedFramebufferParameteri,
		glNamedFramebufferParameteriEXT,
		glNamedFramebufferReadBuffer,
		glNamedFramebufferRenderbuffer,
		glNamedFramebufferRenderbufferEXT,
		glNamedFramebufferSampleLocationsfvARB,
		glNamedFramebufferSampleLocationsfvNV,
		glNamedFramebufferTexture,
		glNamedFramebufferTexture1DEXT,
		glNamedFramebufferTexture2DEXT,
		glNamedFramebufferTexture3DEXT,
		glNamedFramebufferTextureEXT,
		glNamedFramebufferTextureFaceEXT,
		glNamedFramebufferTextureLayer,
		glNamedFramebufferTextureLayerEXT,
		glNamedProgramLocalParameter4dEXT,
		glNamedProgramLocalParameter4dvEXT,
		glNamedProgramLocalParameter4fEXT,
		glNamedProgramLocalParameter4fvEXT,
		glNamedProgramLocalParameterI4iEXT,
		glNamedProgramLocalParameterI4ivEXT,
		glNamedProgramLocalParameterI4uiEXT,
		glNamedProgramLocalParameterI4uivEXT,
		glNamedProgramLocalParameters4fvEXT,
		glNamedProgramLocalParametersI4ivEXT,
		glNamedProgramLocalParametersI4uivEXT,
		glNamedProgramStringEXT,
		glNamedRenderbufferStorage,
		glNamedRenderbufferStorageEXT,
		glNamedRenderbufferStorageMultisample,
		glNamedRenderbufferStorageMultisampleCoverageEXT,
		glNamedRenderbufferStorageMultisampleEXT,
		glNamedStringARB,
		glNewList,
		glNormal3b,
		glNormal3bv,
		glNormal3d,
		glNormal3dv,
		glNormal3f,
		glNormal3fv,
		glNormal3hNV,
		glNormal3hvNV,
		glNormal3i,
		glNormal3iv,
		glNormal3s,
		glNormal3sv,
		glNormalFormatNV,
		glNormalP3ui,
		glNormalP3uiv,
		glNormalPointer,
		glObjectLabel,
		glObjectPtrLabel,
		glOrtho,
		glPassThrough,
		glPatchParameterfv,
		glPatchParameteri,
		glPathColorGenNV,
		glPathCommandsNV,
		glPathCoordsNV,
		glPathCoverDepthFuncNV,
		glPathDashArrayNV,
		glPathFogGenNV,
		glPathGlyphIndexArrayNV,
		glPathGlyphIndexRangeNV,
		glPathGlyphRangeNV,
		glPathGlyphsNV,
		glPathMemoryGlyphIndexArrayNV,
		glPathParameterfNV,
		glPathParameterfvNV,
		glPathParameteriNV,
		glPathParameterivNV,
		glPathStencilDepthOffsetNV,
		glPathStencilFuncNV,
		glPathStringNV,
		glPathSubCommandsNV,
		glPathSubCoordsNV,
		glPathTexGenNV,
		glPauseTransformFeedback,
		glPauseTransformFeedbackNV,
		glPixelDataRangeNV,
		glPixelMapfv,
		glPixelMapuiv,
		glPixelMapusv,
		glPixelStoref,
		glPixelStorei,
		glPixelTransferf,
		glPixelTransferi,
		glPixelZoom,
		glPointAlongPathNV,
		glPointParameterf,
		glPointParameterfARB,
		glPointParameterfEXT,
		glPointParameterfv,
		glPointParameterfvARB,
		glPointParameterfvEXT,
		glPointParameteri,
		glPointParameteriNV,
		glPointParameteriv,
		glPointParameterivNV,
		glPointSize,
		glPolygonMode,
		glPolygonOffset,
		glPolygonOffsetClampEXT,
		glPolygonStipple,
		glPopAttrib,
		glPopClientAttrib,
		glPopDebugGroup,
		glPopGroupMarkerEXT,
		glPopMatrix,
		glPopName,
		glPrimitiveBoundingBoxARB,
		glPrimitiveRestartIndex,
		glPrimitiveRestartIndexNV,
		glPrimitiveRestartNV,
		glPrioritizeTextures,
		glProgramBinary,
		glProgramEnvParameter4dARB,
		glProgramEnvParameter4dvARB,
		glProgramEnvParameter4fARB,
		glProgramEnvParameter4fvARB,
		glProgramEnvParameters4fvEXT,
		glProgramLocalParameter4dARB,
		glProgramLocalParameter4dvARB,
		glProgramLocalParameter4fARB,
		glProgramLocalParameter4fvARB,
		glProgramLocalParameters4fvEXT,
		glProgramParameteri,
		glProgramParameteriARB,
		glProgramParameteriEXT,
		glProgramPathFragmentInputGenNV,
		glProgramStringARB,
		glProgramUniform1d,
		glProgramUniform1dEXT,
		glProgramUniform1dv,
		glProgramUniform1dvEXT,
		glProgramUniform1f,
		glProgramUniform1fEXT,
		glProgramUniform1fv,
		glProgramUniform1fvEXT,
		glProgramUniform1i,
		glProgramUniform1i64ARB,
		glProgramUniform1i64NV,
		glProgramUniform1i64vARB,
		glProgramUniform1i64vNV,
		glProgramUniform1iEXT,
		glProgramUniform1iv,
		glProgramUniform1ivEXT,
		glProgramUniform1ui,
		glProgramUniform1ui64ARB,
		glProgramUniform1ui64NV,
		glProgramUniform1ui64vARB,
		glProgramUniform1ui64vNV,
		glProgramUniform1uiEXT,
		glProgramUniform1uiv,
		glProgramUniform1uivEXT,
		glProgramUniform2d,
		glProgramUniform2dEXT,
		glProgramUniform2dv,
		glProgramUniform2dvEXT,
		glProgramUniform2f,
		glProgramUniform2fEXT,
		glProgramUniform2fv,
		glProgramUniform2fvEXT,
		glProgramUniform2i,
		glProgramUniform2i64ARB,
		glProgramUniform2i64NV,
		glProgramUniform2i64vARB,
		glProgramUniform2i64vNV,
		glProgramUniform2iEXT,
		glProgramUniform2iv,
		glProgramUniform2ivEXT,
		glProgramUniform2ui,
		glProgramUniform2ui64ARB,
		glProgramUniform2ui64NV,
		glProgramUniform2ui64vARB,
		glProgramUniform2ui64vNV,
		glProgramUniform2uiEXT,
		glProgramUniform2uiv,
		glProgramUniform2uivEXT,
		glProgramUniform3d,
		glProgramUniform3dEXT,
		glProgramUniform3dv,
		glProgramUniform3dvEXT,
		glProgramUniform3f,
		glProgramUniform3fEXT,
		glProgramUniform3fv,
		glProgramUniform3fvEXT,
		glProgramUniform3i,
		glProgramUniform3i64ARB,
		glProgramUniform3i64NV,
		glProgramUniform3i64vARB,
		glProgramUniform3i64vNV,
		glProgramUniform3iEXT,
		glProgramUniform3iv,
		glProgramUniform3ivEXT,
		glProgramUniform3ui,
		glProgramUniform3ui64ARB,
		glProgramUniform3ui64NV,
		glProgramUniform3ui64vARB,
		glProgramUniform3ui64vNV,
		glProgramUniform3uiEXT,
		glProgramUniform3uiv,
		glProgramUniform3uivEXT,
		glProgramUniform4d,
		glProgramUniform4dEXT,
		glProgramUniform4dv,
		glProgramUniform4dvEXT,
		glProgramUniform4f,
		glProgramUniform4fEXT,
		glProgramUniform4fv,
		glProgramUniform4fvEXT,
		glProgramUniform4i,
		glProgramUniform4i64ARB,
		glProgramUniform4i64NV,
		glProgramUniform4i64vARB,
		glProgramUniform4i64vNV,
		glProgramUniform4iEXT,
		glProgramUniform4iv,
		glProgramUniform4ivEXT,
		glProgramUniform4ui,
		glProgramUniform4ui64ARB,
		glProgramUniform4ui64NV,
		glProgramUniform4ui64vARB,
		glProgramUniform4ui64vNV,
		glProgramUniform4uiEXT,
		glProgramUniform4uiv,
		glProgramUniform4uivEXT,
		glProgramUniformHandleui64ARB,
		glProgramUniformHandleui64NV,
		glProgramUniformHandleui64vARB,
		glProgramUniformHandleui64vNV,
		glProgramUniformMatrix2dv,
		glProgramUniformMatrix2dvEXT,
		glProgramUniformMatrix2fv,
		glProgramUniformMatrix2fvEXT,
		glProgramUniformMatrix2x3dv,
		glProgramUniformMatrix2x3dvEXT,
		glProgramUniformMatrix2x3fv,
		glProgramUniformMatrix2x3fvEXT,
		glProgramUniformMatrix2x4dv,
		glProgramUniformMatrix2x4dvEXT,
		glProgramUniformMatrix2x4fv,
		glProgramUniformMatrix2x4fvEXT,
		glProgramUniformMatrix3dv,
		glProgramUniformMatrix3dvEXT,
		glProgramUniformMatrix3fv,
		glProgramUniformMatrix3fvEXT,
		glProgramUniformMatrix3x2dv,
		glProgramUniformMatrix3x2dvEXT,
		glProgramUniformMatrix3x2fv,
		glProgramUniformMatrix3x2fvEXT,
		glProgramUniformMatrix3x4dv,
		glProgramUniformMatrix3x4dvEXT,
		glProgramUniformMatrix3x4fv,
		glProgramUniformMatrix3x4fvEXT,
		glProgramUniformMatrix4dv,
		glProgramUniformMatrix4dvEXT,
		glProgramUniformMatrix4fv,
		glProgramUniformMatrix4fvEXT,
		glProgramUniformMatrix4x2dv,
		glProgramUniformMatrix4x2dvEXT,
		glProgramUniformMatrix4x2fv,
		glProgramUniformMatrix4x2fvEXT,
		glProgramUniformMatrix4x3dv,
		glProgramUniformMatrix4x3dvEXT,
		glProgramUniformMatrix4x3fv,
		glProgramUniformMatrix4x3fvEXT,
		glProgramUniformui64NV,
		glProgramUniformui64vNV,
		glProvokingVertex,
		glProvokingVertexEXT,
		glPushAttrib,
		glPushClientAttrib,
		glPushClientAttribDefaultEXT,
		glPushDebugGroup,
		glPushGroupMarkerEXT,
		glPushMatrix,
		glPushName,
		glQueryCounter,
		glQueryObjectParameteruiAMD,
		glRasterPos2d,
		glRasterPos2dv,
		glRasterPos2f,
		glRasterPos2fv,
		glRasterPos2i,
		glRasterPos2iv,
		glRasterPos2s,
		glRasterPos2sv,
		glRasterPos3d,
		glRasterPos3dv,
		glRasterPos3f,
		glRasterPos3fv,
		glRasterPos3i,
		glRasterPos3iv,
		glRasterPos3s,
		glRasterPos3sv,
		glRasterPos4d,
		glRasterPos4dv,
		glRasterPos4f,
		glRasterPos4fv,
		glRasterPos4i,
		glRasterPos4iv,
		glRasterPos4s,
		glRasterPos4sv,
		glRasterSamplesEXT,
		glReadBuffer,
		glReadPixels,
		glReadnPixels,
		glReadnPixelsARB,
		glRectd,
		glRectdv,
		glRectf,
		glRectfv,
		glRecti,
		glRectiv,
		glRects,
		glRectsv,
		glReleaseShaderCompiler,
		glRenderMode,
		glRenderbufferStorage,
		glRenderbufferStorageEXT,
		glRenderbufferStorageMultisample,
		glRenderbufferStorageMultisampleCoverageNV,
		glRenderbufferStorageMultisampleEXT,
		glResetHistogram,
		glResetMinmax,
		glResolveDepthValuesNV,
		glResumeTransformFeedback,
		glResumeTransformFeedbackNV,
		glRotated,
		glRotatef,
		glSampleCoverage,
		glSampleCoverageARB,
		glSampleMaskIndexedNV,
		glSampleMaski,
		glSamplerParameterIiv,
		glSamplerParameterIuiv,
		glSamplerParameterf,
		glSamplerParameterfv,
		glSamplerParameteri,
		glSamplerParameteriv,
		glScaled,
		glScalef,
		glScissor,
		glScissorArrayv,
		glScissorIndexed,
		glScissorIndexedv,
		glSecondaryColor3b,
		glSecondaryColor3bEXT,
		glSecondaryColor3bv,
		glSecondaryColor3bvEXT,
		glSecondaryColor3d,
		glSecondaryColor3dEXT,
		glSecondaryColor3dv,
		glSecondaryColor3dvEXT,
		glSecondaryColor3f,
		glSecondaryColor3fEXT,
		glSecondaryColor3fv,
		glSecondaryColor3fvEXT,
		glSecondaryColor3hNV,
		glSecondaryColor3hvNV,
		glSecondaryColor3i,
		glSecondaryColor3iEXT,
		glSecondaryColor3iv,
		glSecondaryColor3ivEXT,
		glSecondaryColor3s,
		glSecondaryColor3sEXT,
		glSecondaryColor3sv,
		glSecondaryColor3svEXT,
		glSecondaryColor3ub,
		glSecondaryColor3ubEXT,
		glSecondaryColor3ubv,
		glSecondaryColor3ubvEXT,
		glSecondaryColor3ui,
		glSecondaryColor3uiEXT,
		glSecondaryColor3uiv,
		glSecondaryColor3uivEXT,
		glSecondaryColor3us,
		glSecondaryColor3usEXT,
		glSecondaryColor3usv,
		glSecondaryColor3usvEXT,
		glSecondaryColorFormatNV,
		glSecondaryColorP3ui,
		glSecondaryColorP3uiv,
		glSecondaryColorPointer,
		glSecondaryColorPointerEXT,
		glSelectBuffer,
		glSelectPerfMonitorCountersAMD,
		glSeparableFilter2D,
		glSetFenceNV,
		glSetMultisamplefvAMD,
		glShadeModel,
		glShaderBinary,
		glShaderSource,
		glShaderSourceARB,
		glShaderStorageBlockBinding,
		glSignalVkFenceNV,
		glSignalVkSemaphoreNV,
		glStateCaptureNV,
		glStencilClearTagEXT,
		glStencilFillPathInstancedNV,
		glStencilFillPathNV,
		glStencilFunc,
		glStencilFuncSeparate,
		glStencilMask,
		glStencilMaskSeparate,
		glStencilOp,
		glStencilOpSeparate,
		glStencilOpValueAMD,
		glStencilStrokePathInstancedNV,
		glStencilStrokePathNV,
		glStencilThenCoverFillPathInstancedNV,
		glStencilThenCoverFillPathNV,
		glStencilThenCoverStrokePathInstancedNV,
		glStencilThenCoverStrokePathNV,
		glSubpixelPrecisionBiasNV,
		glSyncTextureINTEL,
		glTessellationFactorAMD,
		glTessellationModeAMD,
		glTestFenceNV,
		glTexBuffer,
		glTexBufferARB,
		glTexBufferEXT,
		glTexBufferRange,
		glTexCoord1d,
		glTexCoord1dv,
		glTexCoord1f,
		glTexCoord1fv,
		glTexCoord1hNV,
		glTexCoord1hvNV,
		glTexCoord1i,
		glTexCoord1iv,
		glTexCoord1s,
		glTexCoord1sv,
		glTexCoord2d,
		glTexCoord2dv,
		glTexCoord2f,
		glTexCoord2fv,
		glTexCoord2hNV,
		glTexCoord2hvNV,
		glTexCoord2i,
		glTexCoord2iv,
		glTexCoord2s,
		glTexCoord2sv,
		glTexCoord3d,
		glTexCoord3dv,
		glTexCoord3f,
		glTexCoord3fv,
		glTexCoord3hNV,
		glTexCoord3hvNV,
		glTexCoord3i,
		glTexCoord3iv,
		glTexCoord3s,
		glTexCoord3sv,
		glTexCoord4d,
		glTexCoord4dv,
		glTexCoord4f,
		glTexCoord4fv,
		glTexCoord4hNV,
		glTexCoord4hvNV,
		glTexCoord4i,
		glTexCoord4iv,
		glTexCoord4s,
		glTexCoord4sv,
		glTexCoordFormatNV,
		glTexCoordP1ui,
		glTexCoordP1uiv,
		glTexCoordP2ui,
		glTexCoordP2uiv,
		glTexCoordP3ui,
		glTexCoordP3uiv,
		glTexCoordP4ui,
		glTexCoordP4uiv,
		glTexCoordPointer,
		glTexEnvf,
		glTexEnvfv,
		glTexEnvi,
		glTexEnviv,
		glTexGend,
		glTexGendv,
		glTexGenf,
		glTexGenfv,
		glTexGeni,
		glTexGeniv,
		glTexImage1D,
		glTexImage2D,
		glTexImage2DMultisample,
		glTexImage2DMultisampleCoverageNV,
		glTexImage3D,
		glTexImage3DMultisample,
		glTexImage3DMultisampleCoverageNV,
		glTexPageCommitmentARB,
		glTexParameterIiv,
		glTexParameterIivEXT,
		glTexParameterIuiv,
		glTexParameterIuivEXT,
		glTexParameterf,
		glTexParameterfv,
		glTexParameteri,
		glTexParameteriv,
		glTexRenderbufferNV,
		glTexStorage1D,
		glTexStorage2D,
		glTexStorage2DMultisample,
		glTexStorage3D,
		glTexStorage3DMultisample,
		glTexStorageSparseAMD,
		glTexSubImage1D,
		glTexSubImage2D,
		glTexSubImage3D,
		glTextureBarrier,
		glTextureBarrierNV,
		glTextureBuffer,
		glTextureBufferEXT,
		glTextureBufferRange,
		glTextureBufferRangeEXT,
		glTextureImage1DEXT,
		glTextureImage2DEXT,
		glTextureImage2DMultisampleCoverageNV,
		glTextureImage2DMultisampleNV,
		glTextureImage3DEXT,
		glTextureImage3DMultisampleCoverageNV,
		glTextureImage3DMultisampleNV,
		glTexturePageCommitmentEXT,
		glTextureParameterIiv,
		glTextureParameterIivEXT,
		glTextureParameterIuiv,
		glTextureParameterIuivEXT,
		glTextureParameterf,
		glTextureParameterfEXT,
		glTextureParameterfv,
		glTextureParameterfvEXT,
		glTextureParameteri,
		glTextureParameteriEXT,
		glTextureParameteriv,
		glTextureParameterivEXT,
		glTextureRenderbufferEXT,
		glTextureStorage1D,
		glTextureStorage1DEXT,
		glTextureStorage2D,
		glTextureStorage2DEXT,
		glTextureStorage2DMultisample,
		glTextureStorage2DMultisampleEXT,
		glTextureStorage3D,
		glTextureStorage3DEXT,
		glTextureStorage3DMultisample,
		glTextureStorage3DMultisampleEXT,
		glTextureStorageSparseAMD,
		glTextureSubImage1D,
		glTextureSubImage1DEXT,
		glTextureSubImage2D,
		glTextureSubImage2DEXT,
		glTextureSubImage3D,
		glTextureSubImage3DEXT,
		glTextureView,
		glTransformFeedbackAttribsNV,
		glTransformFeedbackBufferBase,
		glTransformFeedbackBufferRange,
		glTransformFeedbackStreamAttribsNV,
		glTransformFeedbackVaryings,
		glTransformFeedbackVaryingsEXT,
		glTransformFeedbackVaryingsNV,
		glTransformPathNV,
		glTranslated,
		glTranslatef,
		glUniform1d,
		glUniform1dv,
		glUniform1f,
		glUniform1fARB,
		glUniform1fv,
		glUniform1fvARB,
		glUniform1i,
		glUniform1i64ARB,
		glUniform1i64NV,
		glUniform1i64vARB,
		glUniform1i64vNV,
		glUniform1iARB,
		glUniform1iv,
		glUniform1ivARB,
		glUniform1ui,
		glUniform1ui64ARB,
		glUniform1ui64NV,
		glUniform1ui64vARB,
		glUniform1ui64vNV,
		glUniform1uiEXT,
		glUniform1uiv,
		glUniform1uivEXT,
		glUniform2d,
		glUniform2dv,
		glUniform2f,
		glUniform2fARB,
		glUniform2fv,
		glUniform2fvARB,
		glUniform2i,
		glUniform2i64ARB,
		glUniform2i64NV,
		glUniform2i64vARB,
		glUniform2i64vNV,
		glUniform2iARB,
		glUniform2iv,
		glUniform2ivARB,
		glUniform2ui,
		glUniform2ui64ARB,
		glUniform2ui64NV,
		glUniform2ui64vARB,
		glUniform2ui64vNV,
		glUniform2uiEXT,
		glUniform2uiv,
		glUniform2uivEXT,
		glUniform3d,
		glUniform3dv,
		glUniform3f,
		glUniform3fARB,
		glUniform3fv,
		glUniform3fvARB,
		glUniform3i,
		glUniform3i64ARB,
		glUniform3i64NV,
		glUniform3i64vARB,
		glUniform3i64vNV,
		glUniform3iARB,
		glUniform3iv,
		glUniform3ivARB,
		glUniform3ui,
		glUniform3ui64ARB,
		glUniform3ui64NV,
		glUniform3ui64vARB,
		glUniform3ui64vNV,
		glUniform3uiEXT,
		glUniform3uiv,
		glUniform3uivEXT,
		glUniform4d,
		glUniform4dv,
		glUniform4f,
		glUniform4fARB,
		glUniform4fv,
		glUniform4fvARB,
		glUniform4i,
		glUniform4i64ARB,
		glUniform4i64NV,
		glUniform4i64vARB,
		glUniform4i64vNV,
		glUniform4iARB,
		glUniform4iv,
		glUniform4ivARB,
		glUniform4ui,
		glUniform4ui64ARB,
		glUniform4ui64NV,
		glUniform4ui64vARB,
		glUniform4ui64vNV,
		glUniform4uiEXT,
		glUniform4uiv,
		glUniform4uivEXT,
		glUniformBlockBinding,
		glUniformBufferEXT,
		glUniformHandleui64ARB,
		glUniformHandleui64NV,
		glUniformHandleui64vARB,
		glUniformHandleui64vNV,
		glUniformMatrix2dv,
		glUniformMatrix2fv,
		glUniformMatrix2fvARB,
		glUniformMatrix2x3dv,
		glUniformMatrix2x3fv,
		glUniformMatrix2x4dv,
		glUniformMatrix2x4fv,
		glUniformMatrix3dv,
		glUniformMatrix3fv,
		glUniformMatrix3fvARB,
		glUniformMatrix3x2dv,
		glUniformMatrix3x2fv,
		glUniformMatrix3x4dv,
		glUniformMatrix3x4fv,
		glUniformMatrix4dv,
		glUniformMatrix4fv,
		glUniformMatrix4fvARB,
		glUniformMatrix4x2dv,
		glUniformMatrix4x2fv,
		glUniformMatrix4x3dv,
		glUniformMatrix4x3fv,
		glUniformSubroutinesuiv,
		glUniformui64NV,
		glUniformui64vNV,
		glUnlockArraysEXT,
		glUnmapBuffer,
		glUnmapBufferARB,
		glUnmapNamedBuffer,
		glUnmapNamedBufferEXT,
		glUnmapTexture2DINTEL,
		glUseProgram,
		glUseProgramObjectARB,
		glUseProgramStages,
		glUseShaderProgramEXT,
		glValidateProgram,
		glValidateProgramARB,
		glValidateProgramPipeline,
		glVertex2d,
		glVertex2dv,
		glVertex2f,
		glVertex2fv,
		glVertex2hNV,
		glVertex2hvNV,
		glVertex2i,
		glVertex2iv,
		glVertex2s,
		glVertex2sv,
		glVertex3d,
		glVertex3dv,
		glVertex3f,
		glVertex3fv,
		glVertex3hNV,
		glVertex3hvNV,
		glVertex3i,
		glVertex3iv,
		glVertex3s,
		glVertex3sv,
		glVertex4d,
		glVertex4dv,
		glVertex4f,
		glVertex4fv,
		glVertex4hNV,
		glVertex4hvNV,
		glVertex4i,
		glVertex4iv,
		glVertex4s,
		glVertex4sv,
		glVertexArrayAttribBinding,
		glVertexArrayAttribFormat,
		glVertexArrayAttribIFormat,
		glVertexArrayAttribLFormat,
		glVertexArrayBindVertexBufferEXT,
		glVertexArrayBindingDivisor,
		glVertexArrayColorOffsetEXT,
		glVertexArrayEdgeFlagOffsetEXT,
		glVertexArrayElementBuffer,
		glVertexArrayFogCoordOffsetEXT,
		glVertexArrayIndexOffsetEXT,
		glVertexArrayMultiTexCoordOffsetEXT,
		glVertexArrayNormalOffsetEXT,
		glVertexArrayRangeNV,
		glVertexArraySecondaryColorOffsetEXT,
		glVertexArrayTexCoordOffsetEXT,
		glVertexArrayVertexAttribBindingEXT,
		glVertexArrayVertexAttribDivisorEXT,
		glVertexArrayVertexAttribFormatEXT,
		glVertexArrayVertexAttribIFormatEXT,
		glVertexArrayVertexAttribIOffsetEXT,
		glVertexArrayVertexAttribLFormatEXT,
		glVertexArrayVertexAttribLOffsetEXT,
		glVertexArrayVertexAttribOffsetEXT,
		glVertexArrayVertexBindingDivisorEXT,
		glVertexArrayVertexBuffer,
		glVertexArrayVertexBuffers,
		glVertexArrayVertexOffsetEXT,
		glVertexAttrib1d,
		glVertexAttrib1dARB,
		glVertexAttrib1dv,
		glVertexAttrib1dvARB,
		glVertexAttrib1f,
		glVertexAttrib1fARB,
		glVertexAttrib1fv,
		glVertexAttrib1fvARB,
		glVertexAttrib1hNV,
		glVertexAttrib1hvNV,
		glVertexAttrib1s,
		glVertexAttrib1sARB,
		glVertexAttrib1sv,
		glVertexAttrib1svARB,
		glVertexAttrib2d,
		glVertexAttrib2dARB,
		glVertexAttrib2dv,
		glVertexAttrib2dvARB,
		glVertexAttrib2f,
		glVertexAttrib2fARB,
		glVertexAttrib2fv,
		glVertexAttrib2fvARB,
		glVertexAttrib2hNV,
		glVertexAttrib2hvNV,
		glVertexAttrib2s,
		glVertexAttrib2sARB,
		glVertexAttrib2sv,
		glVertexAttrib2svARB,
		glVertexAttrib3d,
		glVertexAttrib3dARB,
		glVertexAttrib3dv,
		glVertexAttrib3dvARB,
		glVertexAttrib3f,
		glVertexAttrib3fARB,
		glVertexAttrib3fv,
		glVertexAttrib3fvARB,
		glVertexAttrib3hNV,
		glVertexAttrib3hvNV,
		glVertexAttrib3s,
		glVertexAttrib3sARB,
		glVertexAttrib3sv,
		glVertexAttrib3svARB,
		glVertexAttrib4Nbv,
		glVertexAttrib4NbvARB,
		glVertexAttrib4Niv,
		glVertexAttrib4NivARB,
		glVertexAttrib4Nsv,
		glVertexAttrib4NsvARB,
		glVertexAttrib4Nub,
		glVertexAttrib4NubARB,
		glVertexAttrib4Nubv,
		glVertexAttrib4NubvARB,
		glVertexAttrib4Nuiv,
		glVertexAttrib4NuivARB,
		glVertexAttrib4Nusv,
		glVertexAttrib4NusvARB,
		glVertexAttrib4bv,
		glVertexAttrib4bvARB,
		glVertexAttrib4d,
		glVertexAttrib4dARB,
		glVertexAttrib4dv,
		glVertexAttrib4dvARB,
		glVertexAttrib4f,
		glVertexAttrib4fARB,
		glVertexAttrib4fv,
		glVertexAttrib4fvARB,
		glVertexAttrib4hNV,
		glVertexAttrib4hvNV,
		glVertexAttrib4iv,
		glVertexAttrib4ivARB,
		glVertexAttrib4s,
		glVertexAttrib4sARB,
		glVertexAttrib4sv,
		glVertexAttrib4svARB,
		glVertexAttrib4ubv,
		glVertexAttrib4ubvARB,
		glVertexAttrib4uiv,
		glVertexAttrib4uivARB,
		glVertexAttrib4usv,
		glVertexAttrib4usvARB,
		glVertexAttribBinding,
		glVertexAttribDivisor,
		glVertexAttribDivisorARB,
		glVertexAttribFormat,
		glVertexAttribFormatNV,
		glVertexAttribI1i,
		glVertexAttribI1iEXT,
		glVertexAttribI1iv,
		glVertexAttribI1ivEXT,
		glVertexAttribI1ui,
		glVertexAttribI1uiEXT,
		glVertexAttribI1uiv,
		glVertexAttribI1uivEXT,
		glVertexAttribI2i,
		glVertexAttribI2iEXT,
		glVertexAttribI2iv,
		glVertexAttribI2ivEXT,
		glVertexAttribI2ui,
		glVertexAttribI2uiEXT,
		glVertexAttribI2uiv,
		glVertexAttribI2uivEXT,
		glVertexAttribI3i,
		glVertexAttribI3iEXT,
		glVertexAttribI3iv,
		glVertexAttribI3ivEXT,
		glVertexAttribI3ui,
		glVertexAttribI3uiEXT,
		glVertexAttribI3uiv,
		glVertexAttribI3uivEXT,
		glVertexAttribI4bv,
		glVertexAttribI4bvEXT,
		glVertexAttribI4i,
		glVertexAttribI4iEXT,
		glVertexAttribI4iv,
		glVertexAttribI4ivEXT,
		glVertexAttribI4sv,
		glVertexAttribI4svEXT,
		glVertexAttribI4ubv,
		glVertexAttribI4ubvEXT,
		glVertexAttribI4ui,
		glVertexAttribI4uiEXT,
		glVertexAttribI4uiv,
		glVertexAttribI4uivEXT,
		glVertexAttribI4usv,
		glVertexAttribI4usvEXT,
		glVertexAttribIFormat,
		glVertexAttribIFormatNV,
		glVertexAttribIPointer,
		glVertexAttribIPointerEXT,
		glVertexAttribL1d,
		glVertexAttribL1dEXT,
		glVertexAttribL1dv,
		glVertexAttribL1dvEXT,
		glVertexAttribL1i64NV,
		glVertexAttribL1i64vNV,
		glVertexAttribL1ui64ARB,
		glVertexAttribL1ui64NV,
		glVertexAttribL1ui64vARB,
		glVertexAttribL1ui64vNV,
		glVertexAttribL2d,
		glVertexAttribL2dEXT,
		glVertexAttribL2dv,
		glVertexAttribL2dvEXT,
		glVertexAttribL2i64NV,
		glVertexAttribL2i64vNV,
		glVertexAttribL2ui64NV,
		glVertexAttribL2ui64vNV,
		glVertexAttribL3d,
		glVertexAttribL3dEXT,
		glVertexAttribL3dv,
		glVertexAttribL3dvEXT,
		glVertexAttribL3i64NV,
		glVertexAttribL3i64vNV,
		glVertexAttribL3ui64NV,
		glVertexAttribL3ui64vNV,
		glVertexAttribL4d,
		glVertexAttribL4dEXT,
		glVertexAttribL4dv,
		glVertexAttribL4dvEXT,
		glVertexAttribL4i64NV,
		glVertexAttribL4i64vNV,
		glVertexAttribL4ui64NV,
		glVertexAttribL4ui64vNV,
		glVertexAttribLFormat,
		glVertexAttribLFormatNV,
		glVertexAttribLPointer,
		glVertexAttribLPointerEXT,
		glVertexAttribP1ui,
		glVertexAttribP1uiv,
		glVertexAttribP2ui,
		glVertexAttribP2uiv,
		glVertexAttribP3ui,
		glVertexAttribP3uiv,
		glVertexAttribP4ui,
		glVertexAttribP4uiv,
		glVertexAttribParameteriAMD,
		glVertexAttribPointer,
		glVertexAttribPointerARB,
		glVertexAttribs1hvNV,
		glVertexAttribs2hvNV,
		glVertexAttribs3hvNV,
		glVertexAttribs4hvNV,
		glVertexBindingDivisor,
		glVertexBlendARB,
		glVertexFormatNV,
		glVertexP2ui,
		glVertexP2uiv,
		glVertexP3ui,
		glVertexP3uiv,
		glVertexP4ui,
		glVertexP4uiv,
		glVertexPointer,
		glVertexWeighthNV,
		glVertexWeighthvNV,
		glViewport,
		glViewportArrayv,
		glViewportIndexedf,
		glViewportIndexedfv,
		glViewportPositionWScaleNV,
		glViewportSwizzleNV,
		glWaitSync,
		glWaitVkSemaphoreNV,
		glWeightPathsNV,
		glWeightPointerARB,
		glWeightbvARB,
		glWeightdvARB,
		glWeightfvARB,
		glWeightivARB,
		glWeightsvARB,
		glWeightubvARB,
		glWeightuivARB,
		glWeightusvARB,
		glWindowPos2d,
		glWindowPos2dARB,
		glWindowPos2dv,
		glWindowPos2dvARB,
		glWindowPos2f,
		glWindowPos2fARB,
		glWindowPos2fv,
		glWindowPos2fvARB,
		glWindowPos2i,
		glWindowPos2iARB,
		glWindowPos2iv,
		glWindowPos2ivARB,
		glWindowPos2s,
		glWindowPos2sARB,
		glWindowPos2sv,
		glWindowPos2svARB,
		glWindowPos3d,
		glWindowPos3dARB,
		glWindowPos3dv,
		glWindowPos3dvARB,
		glWindowPos3f,
		glWindowPos3fARB,
		glWindowPos3fv,
		glWindowPos3fvARB,
		glWindowPos3i,
		glWindowPos3iARB,
		glWindowPos3iv,
		glWindowPos3ivARB,
		glWindowPos3s,
		glWindowPos3sARB,
		glWindowPos3sv,
		glWindowPos3svARB;

	/** When true, {@link GL11} is supported. */
	public final boolean OpenGL11;
	/** When true, {@link GL12} is supported. */
	public final boolean OpenGL12;
	/** When true, {@link GL13} is supported. */
	public final boolean OpenGL13;
	/** When true, {@link GL14} is supported. */
	public final boolean OpenGL14;
	/** When true, {@link GL15} is supported. */
	public final boolean OpenGL15;
	/** When true, {@link GL20} is supported. */
	public final boolean OpenGL20;
	/** When true, {@link GL21} is supported. */
	public final boolean OpenGL21;
	/** When true, {@link GL30} is supported. */
	public final boolean OpenGL30;
	/** When true, {@link GL31} is supported. */
	public final boolean OpenGL31;
	/** When true, {@link GL32} is supported. */
	public final boolean OpenGL32;
	/** When true, {@link GL33} is supported. */
	public final boolean OpenGL33;
	/** When true, {@link GL40} is supported. */
	public final boolean OpenGL40;
	/** When true, {@link GL41} is supported. */
	public final boolean OpenGL41;
	/** When true, {@link GL42} is supported. */
	public final boolean OpenGL42;
	/** When true, {@link GL43} is supported. */
	public final boolean OpenGL43;
	/** When true, {@link GL44} is supported. */
	public final boolean OpenGL44;
	/** When true, {@link GL45} is supported. */
	public final boolean OpenGL45;
	/** When true, {@link AMDBlendMinmaxFactor} is supported. */
	public final boolean GL_AMD_blend_minmax_factor;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/conservative_depth.txt">AMD_conservative_depth</a> extension is supported.
	 * 
	 * <p>There is a common optimization for hardware accelerated implementation of OpenGL which relies on an early depth test to be run before the fragment
	 * shader so that the shader evaluation can be skipped if the fragment ends up being discarded because it is occluded.</p>
	 * 
	 * <p>This optimization does not affect the final rendering, and is typically possible when the fragment does not change the depth programmatically. (i.e.: it
	 * does not write to the built-in {@code gl_FragDepth} output). There are, however a class of operations on the depth in the shader which could still be
	 * performed while allowing the early depth test to operate.</p>
	 * 
	 * <p>This extension allows the application to pass enough information to the GL implementation to activate such optimizations safely.</p>
	 * 
	 * <p>Requires {@link GL30 OpenGL 3.0}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
	 */
	public final boolean GL_AMD_conservative_depth;
	/** When true, {@link AMDDebugOutput} is supported. */
	public final boolean GL_AMD_debug_output;
	/** When true, {@link AMDDepthClampSeparate} is supported. */
	public final boolean GL_AMD_depth_clamp_separate;
	/** When true, {@link AMDDrawBuffersBlend} is supported. */
	public final boolean GL_AMD_draw_buffers_blend;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/gcn_shader.txt">AMD_gcn_shader</a> extension is supported.
	 * 
	 * <p>This extension exposes miscellaneous features of the AMD "Graphics Core Next" shader architecture that do not cleanly fit into other extensions
	 * and are not significant enough alone to warrant their own extensions. This includes cross-SIMD lane ballots, cube map query functions and a
	 * functionality to query the elapsed shader core time.</p>
	 * 
	 * <p>Requires {@link #GL_AMD_gpu_shader_int64 AMD_gpu_shader_int64} or {@link #GL_NV_gpu_shader5 NV_gpu_shader5}.</p>
	 */
	public final boolean GL_AMD_gcn_shader;
	/** When true, {@link AMDGPUShaderInt64} is supported. */
	public final boolean GL_AMD_gpu_shader_int64;
	/** When true, {@link AMDInterleavedElements} is supported. */
	public final boolean GL_AMD_interleaved_elements;
	/** When true, {@link AMDOcclusionQueryEvent} is supported. */
	public final boolean GL_AMD_occlusion_query_event;
	/** When true, {@link AMDPerformanceMonitor} is supported. */
	public final boolean GL_AMD_performance_monitor;
	/** When true, {@link AMDPinnedMemory} is supported. */
	public final boolean GL_AMD_pinned_memory;
	/** When true, {@link AMDQueryBufferObject} is supported. */
	public final boolean GL_AMD_query_buffer_object;
	/** When true, {@link AMDSamplePositions} is supported. */
	public final boolean GL_AMD_sample_positions;
	/** When true, {@link AMDSeamlessCubemapPerTexture} is supported. */
	public final boolean GL_AMD_seamless_cubemap_per_texture;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/shader_atomic_counter_ops.txt">AMD_shader_atomic_counter_ops</a> extension is supported.
	 * 
	 * <p>This extension is written against the OpenGL 4.3 (core) specification and the GLSL 4.30.7 specification.</p>
	 * 
	 * <p>Requires {@link GL42 OpenGL 4.2} or {@link #GL_ARB_shader_atomic_counters ARB_shader_atomic_counters}.</p>
	 */
	public final boolean GL_AMD_shader_atomic_counter_ops;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/shader_explicit_vertex_parameter.txt">AMD_shader_explicit_vertex_parameter</a> extension is supported.
	 * 
	 * <p>Unextended GLSL provides a set of fixed function interpolation modes and even those are limited to certain types of interpolants (for example,
	 * interpolation of integer and double isn't supported).</p>
	 * 
	 * <p>This extension introduces new built-in functions allowing access to vertex parameters explicitly in the fragment shader. It also exposes barycentric
	 * coordinates as new built-in variables, which can be used to implement custom interpolation algorithms using shader code.</p>
	 * 
	 * <p>Requires {@link GL20 OpenGL 2.0} or {@link ARBShaderObjects ARB_shader_objects}.</p>
	 */
	public final boolean GL_AMD_shader_explicit_vertex_parameter;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/shader_stencil_export.txt">AMD_shader_stencil_export</a> extension is supported.
	 * 
	 * <p>In OpenGL, the stencil test is a powerful mechanism to selectively discard fragments based on the content of the stencil buffer. However, facilites to
	 * update the content of the stencil buffer are limited to operations such as incrementing the existing value, or overwriting with a fixed reference value.</p>
	 * 
	 * <p>This extension provides a mechanism whereby a shader may generate the stencil reference value per invocation. When stencil testing is enabled, this
	 * allows the test to be performed against the value generated in the shader. When the stencil operation is set to {@link GL11#GL_REPLACE REPLACE}, this allows a value generated
	 * in the shader to be written to the stencil buffer directly.</p>
	 * 
	 * <p>Requires {@link #GL_ARB_fragment_shader ARB_fragment_shader}.</p>
	 */
	public final boolean GL_AMD_shader_stencil_export;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/shader_trinary_minmax.txt">AMD_shader_trinary_minmax</a> extension is supported.
	 * 
	 * <p>This extension introduces three new trinary built-in functions to the OpenGL Shading Languages. These functions allow the minimum, maximum or median of
	 * three inputs to be found with a single function call. These operations may be useful for sorting and filtering operations, for example. By explicitly
	 * performing a trinary operation with a single built-in function, shader compilers and optimizers may be able to generate better instruction sequences for
	 * perform sorting and other multi-input functions.</p>
	 * 
	 * <p>Requires {@link GL20 OpenGL 2.0} or {@link #GL_ARB_shader_objects ARB_shader_objects}.</p>
	 */
	public final boolean GL_AMD_shader_trinary_minmax;
	/** When true, {@link AMDSparseTexture} is supported. */
	public final boolean GL_AMD_sparse_texture;
	/** When true, {@link AMDStencilOperationExtended} is supported. */
	public final boolean GL_AMD_stencil_operation_extended;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/texture_texture4.txt">AMD_texture_texture4</a> extension is supported.
	 * 
	 * <p>This extension adds new shading language built-in texture functions to the shading language.</p>
	 * 
	 * <p>These texture functions may be used to access one component textures.</p>
	 * 
	 * <p>The {@code texture4} built-in function returns a texture value derived from a 2x2 set of texels in the image array of level levelbase is selected. These
	 * texels are selected in the same way as when the value of {@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER} is {@link GL11#GL_LINEAR LINEAR}, but instead of these texels being filtered to generate the
	 * texture value, the R, G, B and A texture values are derived directly from these four texels.</p>
	 */
	public final boolean GL_AMD_texture_texture4;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/transform_feedback3_lines_triangles.txt">AMD_transform_feedback3_lines_triangles</a> extension is supported.
	 * 
	 * <p>OpenGL 4.0 introduced the ability to record primitives into multiple output streams using transform feedback. However, the restriction that all streams
	 * must output {@link GL11#GL_POINT POINT} primitives when more than one output stream is active was also introduced. This extension simply removes that restriction, allowing
	 * the same set of primitives to be used with multiple transform feedback streams as with a single stream.</p>
	 * 
	 * <p>Requires {@link GL40 OpenGL 4.0} or {@link ARBTransformFeedback3 ARB_transform_feedback3}.</p>
	 */
	public final boolean GL_AMD_transform_feedback3_lines_triangles;
	/** When true, {@link AMDTransformFeedback4} is supported. */
	public final boolean GL_AMD_transform_feedback4;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/vertex_shader_layer.txt">AMD_vertex_shader_layer</a> extension is supported.
	 * 
	 * <p>The {@code gl_Layer} built-in shading language variable was introduced with the {@link #GL_ARB_geometry_shader4 ARB_geometry_shader4} extension and subsequently promoted to core
	 * OpenGL in version 3.2. This variable is an output from the geometry shader stage that allows rendering to be directed to a specific layer of an array
	 * texture, slice of a 3D texture or face of a cube map or cube map array attachment of the framebuffer. Thus, this extremely useful functionality is only
	 * available if a geometry shader is present - even if the geometry shader is not otherwise required by the application. This adds overhead to the graphics
	 * processing pipeline, and complexity to applications. It also precludes implementations that cannot support geometry shaders from supporting rendering to
	 * layered framebuffer attachments.</p>
	 * 
	 * <p>This extension exposes the {@code gl_Layer} built-in variable in the vertex shader, allowing rendering to be directed to layered framebuffer attachments
	 * with only a vertex and fragment shader present. Combined with features such as instancing, or static vertex attributes and so on, this allows a wide
	 * variety of techniques to be implemented without the requirement for a geometry shader to be present.</p>
	 * 
	 * <p>Requires {@link GL30 OpenGL 3.0} or {@link #GL_EXT_texture_array EXT_texture_array}.</p>
	 */
	public final boolean GL_AMD_vertex_shader_layer;
	/** When true, {@link AMDVertexShaderTessellator} is supported. */
	public final boolean GL_AMD_vertex_shader_tessellator;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/vertex_shader_viewport_index.txt">AMD_vertex_shader_viewport_index</a> extension is supported.
	 * 
	 * <p>The {@code gl_ViewportIndex} built-in variable was introduced by the {@link #GL_ARB_viewport_array ARB_viewport_array} extension and {@link GL41 OpenGL 4.1}. This variable is available
	 * in un-extended OpenGL only to the geometry shader. When written in the geometry shader, it causes geometry to be directed to one of an array of several
	 * independent viewport rectangles.</p>
	 * 
	 * <p>In order to use any viewport other than zero, a geometry shader must be present. Geometry shaders introduce processing overhead and potential
	 * performance issues. This extension exposes the {@code gl_ViewportIndex} built-in variable to the vertex shader, allowing the functionality introduced by
	 * ARB_viewport_array to be accessed without requiring a geometry shader to be present.</p>
	 * 
	 * <p>Requires {@link GL41 OpenGL 4.1} or {@link #GL_ARB_viewport_array ARB_viewport_array}.</p>
	 */
	public final boolean GL_AMD_vertex_shader_viewport_index;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/arrays_of_arrays.txt">ARB_arrays_of_arrays</a> extension is supported.
	 * 
	 * <p>This extension removes the restriction that arrays cannot be formed into arrays, allowing arrays of arrays to be declared.</p>
	 * 
	 * <p>Requires GLSL 1.2. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
	 */
	public final boolean GL_ARB_arrays_of_arrays;
	/** When true, {@link ARBBaseInstance} is supported. */
	public final boolean GL_ARB_base_instance;
	/** When true, {@link ARBBindlessTexture} is supported. */
	public final boolean GL_ARB_bindless_texture;
	/** When true, {@link ARBBlendFuncExtended} is supported. */
	public final boolean GL_ARB_blend_func_extended;
	/** When true, {@link ARBBufferStorage} is supported. */
	public final boolean GL_ARB_buffer_storage;
	/** When true, {@link ARBCLEvent} is supported. */
	public final boolean GL_ARB_cl_event;
	/** When true, {@link ARBClearBufferObject} is supported. */
	public final boolean GL_ARB_clear_buffer_object;
	/** When true, {@link ARBClearTexture} is supported. */
	public final boolean GL_ARB_clear_texture;
	/** When true, {@link ARBClipControl} is supported. */
	public final boolean GL_ARB_clip_control;
	/** When true, {@link ARBColorBufferFloat} is supported. */
	public final boolean GL_ARB_color_buffer_float;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/compatibility.txt">ARB_compatibility</a> extension is supported.
	 * 
	 * <p>This extension restores features deprecated by {@link GL30 OpenGL 3.0}.</p>
	 */
	public final boolean GL_ARB_compatibility;
	/** When true, {@link ARBCompressedTexturePixelStorage} is supported. */
	public final boolean GL_ARB_compressed_texture_pixel_storage;
	/** When true, {@link ARBComputeShader} is supported. */
	public final boolean GL_ARB_compute_shader;
	/** When true, {@link ARBComputeVariableGroupSize} is supported. */
	public final boolean GL_ARB_compute_variable_group_size;
	/** When true, {@link ARBConditionalRenderInverted} is supported. */
	public final boolean GL_ARB_conditional_render_inverted;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/conservative_depth.txt">ARB_conservative_depth</a> extension is supported.
	 * 
	 * <p>There is a common optimization for hardware accelerated implementation of OpenGL which relies on an early depth test to be run before the fragment
	 * shader so that the shader evaluation can be skipped if the fragment ends up being discarded because it is occluded.</p>
	 * 
	 * <p>This optimization does not affect the final rendering, and is typically possible when the fragment does not change the depth programmatically. (i.e.: it
	 * does not write to the built-in gl_FragDepth output). There are, however a class of operations on the depth in the shader which could still be performed
	 * while allowing the early depth test to operate.</p>
	 * 
	 * <p>This extension allows the application to pass enough information to the GL implementation to activate such optimizations safely.</p>
	 * 
	 * <p>Requires {@link GL30 OpenGL 3.0}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
	 */
	public final boolean GL_ARB_conservative_depth;
	/** When true, {@link ARBCopyBuffer} is supported. */
	public final boolean GL_ARB_copy_buffer;
	/** When true, {@link ARBCopyImage} is supported. */
	public final boolean GL_ARB_copy_image;
	/** When true, {@link ARBCullDistance} is supported. */
	public final boolean GL_ARB_cull_distance;
	/** When true, {@link ARBDebugOutput} is supported. */
	public final boolean GL_ARB_debug_output;
	/** When true, {@link ARBDepthBufferFloat} is supported. */
	public final boolean GL_ARB_depth_buffer_float;
	/** When true, {@link ARBDepthClamp} is supported. */
	public final boolean GL_ARB_depth_clamp;
	/** When true, {@link ARBDepthTexture} is supported. */
	public final boolean GL_ARB_depth_texture;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/derivative_control.txt">ARB_derivative_control</a> extension is supported.
	 * 
	 * <p>This extension provides control over the spacial granularity at which the underlying implementation computes derivatives.</p>
	 * 
	 * <p>For example, for the coarse-granularity derivative, a single x derivative could be computed for each 2x2 group of pixels, using that same derivative
	 * value for all 4 pixels. For the fine-granularity derivative, two derivatives could be computed for each 2x2 group of pixels; one for the top row and one
	 * for the bottom row. Implementations vary somewhat on how this is done.</p>
	 * 
	 * <p>To select the coarse derivative, use:</p>
	 * 
	 * <pre><code>dFdxCoarse(p)
dFdyCoarse(p)
fwidthCoarse(p)</code></pre>
	 * 
	 * <p>To select the fine derivative, use:</p>
	 * 
	 * <pre><code>dFdxFine(p)
dFdyFine(p)
fwidthFine(p)</code></pre>
	 * 
	 * <p>To select which ever is "better" (based on performance, API hints, or other factors), use:</p>
	 * 
	 * <pre><code>dFdx(p)
dFdy(p)
fwidth(p)</code></pre>
	 * 
	 * <p>This last set is the set of previously existing built-ins for derivatives, and continues to work in a backward compatible way.</p>
	 * 
	 * <p>Requires {@link GL40 OpenGL 4.0} and GLSL 4.00. Promoted to core in {@link GL45 OpenGL 4.5}.</p>
	 */
	public final boolean GL_ARB_derivative_control;
	/** When true, {@link ARBDirectStateAccess} is supported. */
	public final boolean GL_ARB_direct_state_access;
	/** When true, {@link ARBDrawBuffers} is supported. */
	public final boolean GL_ARB_draw_buffers;
	/** When true, {@link ARBDrawBuffersBlend} is supported. */
	public final boolean GL_ARB_draw_buffers_blend;
	/** When true, {@link ARBDrawElementsBaseVertex} is supported. */
	public final boolean GL_ARB_draw_elements_base_vertex;
	/** When true, {@link ARBDrawIndirect} is supported. */
	public final boolean GL_ARB_draw_indirect;
	/** When true, {@link ARBDrawInstanced} is supported. */
	public final boolean GL_ARB_draw_instanced;
	/** When true, {@link ARBEnhancedLayouts} is supported. */
	public final boolean GL_ARB_enhanced_layouts;
	/** When true, {@link ARBES2Compatibility} is supported. */
	public final boolean GL_ARB_ES2_compatibility;
	/** When true, {@link ARBES31Compatibility} is supported. */
	public final boolean GL_ARB_ES3_1_compatibility;
	/** When true, {@link ARBES32Compatibility} is supported. */
	public final boolean GL_ARB_ES3_2_compatibility;
	/** When true, {@link ARBES3Compatibility} is supported. */
	public final boolean GL_ARB_ES3_compatibility;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/explicit_attrib_location.txt">ARB_explicit_attrib_location</a> extension is supported.
	 * 
	 * <p>This extension provides a method to pre-assign attribute locations to named vertex shader inputs and color numbers to named fragment shader outputs.
	 * This allows applications to globally assign a particular semantic meaning, such as diffuse color or vertex normal, to a particular attribute location
	 * without knowing how that attribute will be named in any particular shader.</p>
	 * 
	 * <p>Requires {@link GL20 OpenGL 2.0} or {@link #GL_ARB_vertex_shader ARB_vertex_shader}. Promoted to core in {@link GL33 OpenGL 3.3}.</p>
	 */
	public final boolean GL_ARB_explicit_attrib_location;
	/** When true, {@link ARBExplicitUniformLocation} is supported. */
	public final boolean GL_ARB_explicit_uniform_location;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/fragment_coord_conventions.txt">ARB_fragment_coord_conventions</a> extension is supported.
	 * 
	 * <p>This extension provides alternative conventions for the fragment coordinate XY location available for programmable fragment processing.</p>
	 * 
	 * <p>The scope of this extension deals *only* with how the fragment coordinate XY location appears during programming fragment processing. Beyond the scope
	 * of this extension are coordinate conventions used for rasterization or transformation.</p>
	 * 
	 * <p>In the case of the coordinate conventions for rasterization and transformation, some combination of the viewport, depth range, culling state, and
	 * projection matrix state can be reconfigured to adopt other arbitrary clip-space and window-space coordinate space conventions. Adopting other clip-space
	 * and window-space conventions involves adjusting existing OpenGL state. However it is non-trivial to massage an arbitrary fragment shader or program to
	 * adopt a different window-space coordinate system because such shaders are encoded in various textual representations.</p>
	 * 
	 * <p>The dominant 2D and 3D rendering APIs make two basic choices of convention when locating fragments in window space. The two choices are:</p>
	 * 
	 * <ol>
	 * <li>Is the origin nearest the lower-left- or upper-left-most pixel of the window?</li>
	 * <li>Is the (x,y) location of the pixel nearest the origin at (0,0) or (0.5,0.5)?</li>
	 * </ol>
	 * 
	 * <p>OpenGL assumes a lower-left origin for window coordinates and assumes pixel centers are located at half-pixel coordinates. This means the XY location
	 * (0.5,0.5) corresponds to the lower-left-most pixel in a window.</p>
	 * 
	 * <p>Other window coordinate conventions exist for other rendering APIs. X11, GDI, and Direct3D version through DirectX 9 assume an upper-left window origin
	 * and locate pixel centers at integer XY values. By this alternative convention, the XY location (0,0) corresponds to the upper-left-most pixel in a window.</p>
	 * 
	 * <p>Direct3D for DirectX 10 assumes an upper-left origin (as do prior DirectX versions) yet assumes half-pixel coordinates (unlike prior DirectX versions).
	 * By the DirectX 10 convention, the XY location (0.5,0.5) corresponds to the upper-left-most pixel in a window.</p>
	 * 
	 * <p>Fragment shaders can directly access the location of a given processed fragment in window space. We call this location the "fragment coordinate".</p>
	 * 
	 * <p>This extension provides a means for fragment shaders written in GLSL or OpenGL assembly extensions to specify alternative conventions for determining
	 * the fragment coordinate value accessed during programmable fragment processing.</p>
	 * 
	 * <p>The motivation for this extension is to provide an easy, efficient means for fragment shaders accessing a fragment's window-space location to adopt the
	 * fragment coordinate convention for which the shader was originally written.</p>
	 * 
	 * <p>Promoted to core in {@link GL32 OpenGL 3.2}.</p>
	 */
	public final boolean GL_ARB_fragment_coord_conventions;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/fragment_layer_viewport.txt">ARB_fragment_layer_viewport</a> extension is supported.
	 * 
	 * <p>The geometry shader has the special built-in variables gl_Layer and gl_ViewportIndex that specify which layer and viewport primitives are rendered to.
	 * Currently the fragment shader does not know which layer or viewport the fragments are being written to without the application implementing their own
	 * interface variables between the geometry and fragment shaders.</p>
	 * 
	 * <p>This extension specifies that the gl_Layer and gl_ViewportIndex built-in variables are also available to the fragment shader so the application doesn't
	 * need to implement these manually.</p>
	 * 
	 * <p>Requires {@link GL30 OpenGL 3.0} and {@link #GL_ARB_geometry_shader4 ARB_geometry_shader4}, or {@link GL32 OpenGL 3.2}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
	 */
	public final boolean GL_ARB_fragment_layer_viewport;
	/** When true, {@link ARBFragmentProgram} is supported. */
	public final boolean GL_ARB_fragment_program;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/fragment_program_shadow.txt">ARB_fragment_program_shadow</a> extension is supported.
	 * 
	 * <p>This extension extends ARB_fragment_program to remove the interaction with ARB_shadow and defines the program option "ARB_fragment_program_shadow".</p>
	 * 
	 * <p>Requires {@link #GL_ARB_fragment_program ARB_fragment_program} and {@link #GL_ARB_shadow ARB_shadow}.</p>
	 */
	public final boolean GL_ARB_fragment_program_shadow;
	/** When true, {@link ARBFragmentShader} is supported. */
	public final boolean GL_ARB_fragment_shader;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/fragment_shader_interlock.txt">ARB_fragment_shader_interlock</a> extension is supported.
	 * 
	 * <p>In unextended OpenGL 4.5, applications may produce a large number of fragment shader invocations that perform loads and stores to memory using image
	 * uniforms, atomic counter uniforms, buffer variables, or pointers. The order in which loads and stores to common addresses are performed by different
	 * fragment shader invocations is largely undefined. For algorithms that use shader writes and touch the same pixels more than once, one or more of the
	 * following techniques may be required to ensure proper execution ordering:</p>
	 * 
	 * <ul>
	 * <li>inserting Finish or WaitSync commands to drain the pipeline between different "passes" or "layers";</li>
	 * <li>using only atomic memory operations to write to shader memory (which may be relatively slow and limits how memory may be updated); or</li>
	 * <li>injecting spin loops into shaders to prevent multiple shader invocations from touching the same memory concurrently.</li>
	 * </ul>
	 * 
	 * <p>This extension provides new GLSL built-in functions beginInvocationInterlockARB() and endInvocationInterlockARB() that delimit a critical section of
	 * fragment shader code. For pairs of shader invocations with "overlapping" coverage in a given pixel, the OpenGL implementation will guarantee that the
	 * critical section of the fragment shader will be executed for only one fragment at a time.</p>
	 * 
	 * <p>There are four different interlock modes supported by this extension, which are identified by layout qualifiers. The qualifiers
	 * "pixel_interlock_ordered" and "pixel_interlock_unordered" provides mutual exclusion in the critical section for any pair of fragments corresponding to
	 * the same pixel. When using multisampling, the qualifiers "sample_interlock_ordered" and "sample_interlock_unordered" only provide mutual exclusion for
	 * pairs of fragments that both cover at least one common sample in the same pixel; these are recommended for performance if shaders use per-sample data
	 * structures.</p>
	 * 
	 * <p>Additionally, when the "pixel_interlock_ordered" or "sample_interlock_ordered" layout qualifier is used, the interlock also guarantees that the
	 * critical section for multiple shader invocations with "overlapping" coverage will be executed in the order in which the primitives were processed by
	 * the GL. Such a guarantee is useful for applications like blending in the fragment shader, where an application requires that fragment values to be
	 * composited in the framebuffer in primitive order.</p>
	 * 
	 * <p>This extension can be useful for algorithms that need to access per-pixel data structures via shader loads and stores. Such algorithms using this
	 * extension can access such data structures in the critical section without worrying about other invocations for the same pixel accessing the data
	 * structures concurrently. Additionally, the ordering guarantees are useful for cases where the API ordering of fragments is meaningful. For example,
	 * applications may be able to execute programmable blending operations in the fragment shader, where the destination buffer is read via image loads and
	 * the final value is written via image stores.</p>
	 * 
	 * <p>Requires {@link GL42 OpenGL 4.2} or {@link ARBShaderImageLoadStore ARB_shader_image_load_store}.</p>
	 */
	public final boolean GL_ARB_fragment_shader_interlock;
	/** When true, {@link ARBFramebufferNoAttachments} is supported. */
	public final boolean GL_ARB_framebuffer_no_attachments;
	/** When true, {@link ARBFramebufferObject} is supported. */
	public final boolean GL_ARB_framebuffer_object;
	/** When true, {@link ARBFramebufferSRGB} is supported. */
	public final boolean GL_ARB_framebuffer_sRGB;
	/** When true, {@link ARBGeometryShader4} is supported. */
	public final boolean GL_ARB_geometry_shader4;
	/** When true, {@link ARBGetProgramBinary} is supported. */
	public final boolean GL_ARB_get_program_binary;
	/** When true, {@link ARBGetTextureSubImage} is supported. */
	public final boolean GL_ARB_get_texture_sub_image;
	/** When true, {@link ARBGPUShader5} is supported. */
	public final boolean GL_ARB_gpu_shader5;
	/** When true, {@link ARBGPUShaderFP64} is supported. */
	public final boolean GL_ARB_gpu_shader_fp64;
	/** When true, {@link ARBGPUShaderInt64} is supported. */
	public final boolean GL_ARB_gpu_shader_int64;
	/** When true, {@link ARBHalfFloatPixel} is supported. */
	public final boolean GL_ARB_half_float_pixel;
	/** When true, {@link ARBHalfFloatVertex} is supported. */
	public final boolean GL_ARB_half_float_vertex;
	/** When true, {@link ARBImaging} is supported. */
	public final boolean GL_ARB_imaging;
	/** When true, {@link ARBIndirectParameters} is supported. */
	public final boolean GL_ARB_indirect_parameters;
	/** When true, {@link ARBInstancedArrays} is supported. */
	public final boolean GL_ARB_instanced_arrays;
	/** When true, {@link ARBInternalformatQuery} is supported. */
	public final boolean GL_ARB_internalformat_query;
	/** When true, {@link ARBInternalformatQuery2} is supported. */
	public final boolean GL_ARB_internalformat_query2;
	/** When true, {@link ARBInvalidateSubdata} is supported. */
	public final boolean GL_ARB_invalidate_subdata;
	/** When true, {@link ARBMapBufferAlignment} is supported. */
	public final boolean GL_ARB_map_buffer_alignment;
	/** When true, {@link ARBMapBufferRange} is supported. */
	public final boolean GL_ARB_map_buffer_range;
	/** When true, {@link ARBMatrixPalette} is supported. */
	public final boolean GL_ARB_matrix_palette;
	/** When true, {@link ARBMultiBind} is supported. */
	public final boolean GL_ARB_multi_bind;
	/** When true, {@link ARBMultiDrawIndirect} is supported. */
	public final boolean GL_ARB_multi_draw_indirect;
	/** When true, {@link ARBMultisample} is supported. */
	public final boolean GL_ARB_multisample;
	/** When true, {@link ARBMultitexture} is supported. */
	public final boolean GL_ARB_multitexture;
	/** When true, {@link ARBOcclusionQuery} is supported. */
	public final boolean GL_ARB_occlusion_query;
	/** When true, {@link ARBOcclusionQuery2} is supported. */
	public final boolean GL_ARB_occlusion_query2;
	/** When true, {@link ARBParallelShaderCompile} is supported. */
	public final boolean GL_ARB_parallel_shader_compile;
	/** When true, {@link ARBPipelineStatisticsQuery} is supported. */
	public final boolean GL_ARB_pipeline_statistics_query;
	/** When true, {@link ARBPixelBufferObject} is supported. */
	public final boolean GL_ARB_pixel_buffer_object;
	/** When true, {@link ARBPointParameters} is supported. */
	public final boolean GL_ARB_point_parameters;
	/** When true, {@link ARBPointSprite} is supported. */
	public final boolean GL_ARB_point_sprite;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/post_depth_coverage.txt">ARB_post_depth_coverage</a> extension is supported.
	 * 
	 * <p>This extension allows the fragment shader to control whether values in {@code gl_SampleMaskIn[]} reflect the coverage after application of the early
	 * depth and stencil tests. This feature can be enabled with the following layout qualifier in the fragment shader:</p>
	 * 
	 * <pre><code>        layout(post_depth_coverage) in;</code></pre>
	 * 
	 * <p>Use of this feature implicitly enables early fragment tests.</p>
	 */
	public final boolean GL_ARB_post_depth_coverage;
	/** When true, {@link ARBProgramInterfaceQuery} is supported. */
	public final boolean GL_ARB_program_interface_query;
	/** When true, {@link ARBProvokingVertex} is supported. */
	public final boolean GL_ARB_provoking_vertex;
	/** When true, {@link ARBQueryBufferObject} is supported. */
	public final boolean GL_ARB_query_buffer_object;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/robust_buffer_access_behavior.txt">ARB_robust_buffer_access_behavior</a> extension is supported.
	 * 
	 * <p>This extension specifies the behavior of out-of-bounds buffer and array accesses. This is an improvement over the existing ARB_robustness extension
	 * which stated that the application should not crash, but the behavior is otherwise undefined. This extension specifies the access protection provided by
	 * the GL to ensure that out-of-bounds accesses cannot read from or write to data not owned by the application. All accesses are contained within the
	 * buffer object and program area they reference. These additional robustness guarantees apply to contexts created with the
	 * {@code CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB} feature enabled.</p>
	 * 
	 * <p>Requires {@link ARBRobustness ARB_robustness}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
	 */
	public final boolean GL_ARB_robust_buffer_access_behavior;
	/** When true, {@link ARBRobustness} is supported. */
	public final boolean GL_ARB_robustness;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/robustness_isolation.txt">ARB_robustness_isolation</a> extension is supported.
	 * 
	 * <p>{@link ARBRobustness ARB_robustness} and supporting window system extensions allow creating an OpenGL context supporting graphics reset notification behavior. This
	 * extension provides stronger guarantees about the possible side-effects of a graphics reset.</p>
	 * 
	 * <p>It is expected that there may be a performance cost associated with isolating an application or share group from other contexts on the GPU. For this
	 * reason, ARB_robustness_isolation is phrased as an opt-in mechanism, with a new context creation bit defined in the window system bindings. It is
	 * expected that implementations might only advertise the strings in this extension if both the implementation supports the desired isolation properties,
	 * and the context was created with the appropriate reset isolation bit.</p>
	 * 
	 * <p>Requires {@link ARBRobustness ARB_robustness}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
	 */
	public final boolean GL_ARB_robustness_isolation;
	/** When true, {@link ARBSampleLocations} is supported. */
	public final boolean GL_ARB_sample_locations;
	/** When true, {@link ARBSampleShading} is supported. */
	public final boolean GL_ARB_sample_shading;
	/** When true, {@link ARBSamplerObjects} is supported. */
	public final boolean GL_ARB_sampler_objects;
	/** When true, {@link ARBSeamlessCubeMap} is supported. */
	public final boolean GL_ARB_seamless_cube_map;
	/** When true, {@link ARBSeamlessCubemapPerTexture} is supported. */
	public final boolean GL_ARB_seamless_cubemap_per_texture;
	/** When true, {@link ARBSeparateShaderObjects} is supported. */
	public final boolean GL_ARB_separate_shader_objects;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_atomic_counter_ops.txt">ARB_shader_atomic_counter_ops</a> extension is supported.
	 * 
	 * <p>The {@link ARBShaderAtomicCounters ARB_shader_atomic_counters} extension introduced atomic counters, but it limits list of potential operations that can be performed on them
	 * to increment, decrement, and query. This extension extends the list of GLSL built-in functions that can operate on atomic counters. The list of new
	 * operations include:</p>
	 * 
	 * <ul>
	 * <li>Addition and subtraction</li>
	 * <li>Minimum and maximum</li>
	 * <li>Bitwise operators (AND, OR, XOR, etc.)</li>
	 * <li>Exchange, and compare and exchange operators</li>
	 * </ul>
	 * 
	 * <p>Requires {@link GL42 OpenGL 4.2} or {@link ARBShaderAtomicCounters ARB_shader_atomic_counters}.</p>
	 */
	public final boolean GL_ARB_shader_atomic_counter_ops;
	/** When true, {@link ARBShaderAtomicCounters} is supported. */
	public final boolean GL_ARB_shader_atomic_counters;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_ballot.txt">ARB_shader_ballot</a> extension is supported.
	 * 
	 * <p>This extension provides the ability for a group of invocations which execute in lockstep to do limited forms of cross-invocation communication via a
	 * group broadcast of a invocation value, or broadcast of a bitarray representing a predicate value from each invocation in the group.</p>
	 * 
	 * <p>Requires {@link ARBGPUShaderInt64 ARB_gpu_shader_int64}.</p>
	 */
	public final boolean GL_ARB_shader_ballot;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_bit_encoding.txt">ARB_shader_bit_encoding</a> extension is supported.
	 * 
	 * <p>This extension trivially adds built-in functions for getting/setting the bit encoding for floating-point values in the OpenGL Shading Language.</p>
	 * 
	 * <p>Promoted to core in {@link GL33 OpenGL 3.3}.</p>
	 */
	public final boolean GL_ARB_shader_bit_encoding;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_clock.txt">ARB_shader_clock</a> extension is supported.
	 * 
	 * <p>This extension exposes a 64-bit monotonically incrementing shader counter which may be used to derive local timing information within a single shader
	 * invocation.</p>
	 */
	public final boolean GL_ARB_shader_clock;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_draw_parameters.txt">ARB_shader_draw_parameters</a> extension is supported.
	 * 
	 * <p>In unextended GL, vertex shaders have inputs named {@code gl_VertexID} and {@code gl_InstanceID}, which contain, respectively the index of the vertex
	 * and instance. The value of {@code gl_VertexID} is the implicitly passed index of the vertex being processed, which includes the value of baseVertex, for
	 * those commands that accept it. Meanwhile, {@code gl_InstanceID} is the integer index of the current instance being processed, but, even for commands
	 * that accept a baseInstance parameter, it does not include the value of this argument. Furthermore, the equivalents to these variables in other graphics
	 * APIs do not necessarily follow these conventions. The reason for this inconsistency is that there are legitimate use cases for both inclusion and
	 * exclusion of the baseVertex or baseInstance parameters in {@code gl_VertexID} and {@code gl_InstanceID}, respectively.</p>
	 * 
	 * <p>Rather than change the semantics of either built-in variable, this extension adds two new built-in variables to the GL shading language,
	 * {@code gl_BaseVertexARB} and {@code gl_BaseInstanceARB}, which contain the values passed in the baseVertex and baseInstance parameters, respectively.
	 * Shaders provided by the application may use these variables to offset {@code gl_VertexID} or {@code gl_InstanceID} if desired, or use them for any other
	 * purpose.</p>
	 * 
	 * <p>Additionally, this extension adds a further built-in variable, {@code gl_DrawID} to the shading language. This variable contains the index of the draw
	 * currently being processed by a Multi* variant of a drawing command (such as {@link GL14#glMultiDrawElements MultiDrawElements} or {@link GL43#glMultiDrawArraysIndirect MultiDrawArraysIndirect}).</p>
	 * 
	 * <p>Requires {@link GL31 OpenGL 3.1}. Promoted to core in {@link GL33 OpenGL 3.3}.</p>
	 */
	public final boolean GL_ARB_shader_draw_parameters;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_group_vote.txt">ARB_shader_group_vote</a> extension is supported.
	 * 
	 * <p>This extension provides new built-in functions to compute the composite of a set of boolean conditions across a group of shader invocations. These
	 * composite results may be used to execute shaders more efficiently on a single-instruction multiple-data (SIMD) processor. The set of shader invocations
	 * across which boolean conditions are evaluated is implementation-dependent, and this extension provides no guarantee over how individual shader
	 * invocations are assigned to such sets. In particular, the set of shader invocations has no necessary relationship with the compute shader local work
	 * group -- a pair of shader invocations in a single compute shader work group may end up in different sets used by these built-ins.</p>
	 * 
	 * <p>Compute shaders operate on an explicitly specified group of threads (a local work group), but many implementations of OpenGL 4.3 will even group
	 * non-compute shader invocations and execute them in a SIMD fashion. When executing code like</p>
	 * 
	 * <pre><code>if (condition) {
    result = do_fast_path();
} else {
    result = do_general_path();
}</code></pre>
	 * 
	 * <p>where {@code condition} diverges between invocations, a SIMD implementation might first call do_fast_path() for the invocations where {@code condition}
	 * is true and leave the other invocations dormant. Once do_fast_path() returns, it might call do_general_path() for invocations where {@code condition} is
	 * false and leave the other invocations dormant. In this case, the shader executes *both* the fast and the general path and might be better off just using
	 * the general path for all invocations.</p>
	 * 
	 * <p>This extension provides the ability to avoid divergent execution by evaluting a condition across an entire SIMD invocation group using code like:</p>
	 * 
	 * <pre><code>if (allInvocationsARB(condition)) {
    result = do_fast_path();
} else {
    result = do_general_path();
}</code></pre>
	 * 
	 * <p>The built-in function allInvocationsARB() will return the same value for all invocations in the group, so the group will either execute do_fast_path()
	 * or do_general_path(), but never both. For example, shader code might want to evaluate a complex function iteratively by starting with an approximation
	 * of the result and then refining the approximation. Some input values may require a small number of iterations to generate an accurate result
	 * (do_fast_path) while others require a larger number (do_general_path). In another example, shader code might want to evaluate a complex function
	 * (do_general_path) that can be greatly simplified when assuming a specific value for one of its inputs (do_fast_path).</p>
	 * 
	 * <p>Requires {@link GL43 OpenGL 4.3} or {@link ARBComputeShader ARB_compute_shader}.</p>
	 */
	public final boolean GL_ARB_shader_group_vote;
	/** When true, {@link ARBShaderImageLoadStore} is supported. */
	public final boolean GL_ARB_shader_image_load_store;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_image_size.txt">ARB_shader_image_size</a> extension is supported.
	 * 
	 * <p>This extension provides GLSL built-in functions allowing shaders to query the size of an image.</p>
	 * 
	 * <p>Requires {@link GL42 OpenGL 4.2} and GLSL 4.20. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
	 */
	public final boolean GL_ARB_shader_image_size;
	/** When true, {@link ARBShaderObjects} is supported. */
	public final boolean GL_ARB_shader_objects;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_precision.txt">ARB_shader_precision</a> extension is supported.
	 * 
	 * <p>This extension more clearly restricts the precision requirements of implementations of the GLSL specification. These include precision of arithmetic
	 * operations (operators '+', '/', ...), transcendentals (log, exp, pow, reciprocal sqrt, ...), when NaNs (not a number) and INFs (infinities) will be
	 * supported and generated, and denorm flushing behavior.  Trigonometric built-ins and some other categories of built-ins are not addressed.</p>
	 * 
	 * <p>Requires {@link GL40 OpenGL 4.0}. Promoted to core in {@link GL41 OpenGL 4.1}.</p>
	 */
	public final boolean GL_ARB_shader_precision;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_stencil_export.txt">ARB_shader_stencil_export</a> extension is supported.
	 * 
	 * <p>In OpenGL, the stencil test is a powerful mechanism to selectively discard fragments based on the content of the stencil buffer. However, facilites to
	 * update the content of the stencil buffer are limited to operations such as incrementing the existing value, or overwriting with a fixed reference value.</p>
	 * 
	 * <p>This extension provides a mechanism whereby a shader may generate the stencil reference value per invocation. When stencil testing is enabled, this
	 * allows the test to be performed against the value generated in the shader. When the stencil operation is set to {@link GL11#GL_REPLACE REPLACE}, this allows a value generated
	 * in the shader to be written to the stencil buffer directly.</p>
	 * 
	 * <p>Requires {@link #GL_ARB_fragment_shader ARB_fragment_shader}.</p>
	 */
	public final boolean GL_ARB_shader_stencil_export;
	/** When true, {@link ARBShaderStorageBufferObject} is supported. */
	public final boolean GL_ARB_shader_storage_buffer_object;
	/** When true, {@link ARBShaderSubroutine} is supported. */
	public final boolean GL_ARB_shader_subroutine;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_texture_image_samples.txt">ARB_shader_texture_image_samples</a> extension is supported.
	 * 
	 * <p>This extension provides GLSL built-in functions allowing shaders to query the number of samples of a texture.</p>
	 * 
	 * <p>Requires GLSL 1.50 or {@link ARBTextureMultisample ARB_texture_multisample}.</p>
	 */
	public final boolean GL_ARB_shader_texture_image_samples;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_texture_lod.txt">ARB_shader_texture_lod</a> extension is supported.
	 * 
	 * <p>This extension adds additional texture functions to the OpenGL Shading Language which provide the shader writer with explicit control of LOD.</p>
	 * 
	 * <p>Mipmap texture fetches and anisotropic texture fetches require an implicit derivatives to calculate rho, lambda and/or the line of anisotropy. These
	 * implicit derivatives will be undefined for texture fetches occurring inside non-uniform control flow or for vertex shader texture fetches, resulting in
	 * undefined texels.</p>
	 * 
	 * <p>The additional texture functions introduced with this extension provide explict control of LOD (isotropic texture functions) or provide explicit
	 * derivatives (anisotropic texture functions).</p>
	 * 
	 * <p>Anisotropic texture functions return defined texels for mipmap texture fetches or anisotropic texture fetches, even inside non-uniform control flow.
	 * Isotropic texture functions return defined texels for mipmap texture fetches, even inside non-uniform control flow. However, isotropic texture functions
	 * return undefined texels for anisotropic texture fetches.</p>
	 * 
	 * <p>The existing isotropic vertex texture functions:</p>
	 * 
	 * <pre><code>texture1DLod,   texture1DProjLod,
texture2DLod,   texture2DProjLod,
texture3DLod,   texture3DProjLod,
textureCubeLod,
shadow1DLod,    shadow1DProjLod,
shadow2DLod,    shadow2DProjLod</code></pre>
	 * 
	 * <p>are added to the built-in functions for fragment shaders.</p>
	 * 
	 * <p>New anisotropic texture functions, providing explicit derivatives:</p>
	 * 
	 * <pre><code>texture1DGradARB(
    sampler1D sampler,
    float P, float dPdx, float dPdy);
texture1DProjGradARB(
    sampler1D sampler,
    vec2 P, float dPdx, float dPdy);
texture1DProjGradARB(
    sampler1D sampler,
    vec4 P, float dPdx, float dPdy);
texture2DGradARB(
    sampler2D sampler,
    vec2 P, vec2 dPdx, vec2 dPdy);
texture2DProjGradARB(
    sampler2D sampler,
    vec3 P, vec2 dPdx, vec2 dPdy);
texture2DProjGradARB(
    sampler2D sampler,
    vec4 P, vec2 dPdx, vec2 dPdy);
texture3DGradARB(
    sampler3D sampler,
    vec3 P, vec3 dPdx, vec3 dPdy);
texture3DProjGradARB(
    sampler3D sampler,
    vec4 P, vec3 dPdx, vec3 dPdy);
textureCubeGradARB(
    samplerCube sampler,
    vec3 P, vec3 dPdx, vec3 dPdy);

shadow1DGradARB(
    sampler1DShadow sampler,
    vec3 P, float dPdx, float dPdy);
shadow1DProjGradARB(
    sampler1DShadow sampler,
    vec4 P, float dPdx, float dPdy);
shadow2DGradARB(
    sampler2DShadow sampler,
    vec3 P, vec2 dPdx, vec2 dPdy);
shadow2DProjGradARB(
    sampler2DShadow sampler,
    vec4 P, vec2 dPdx, vec2 dPdy);

texture2DRectGradARB(
    sampler2DRect sampler,
    vec2 P, vec2 dPdx, vec2 dPdy);
texture2DRectProjGradARB(
    sampler2DRect sampler,
    vec3 P, vec2 dPdx, vec2 dPdy);
texture2DRectProjGradARB(
    sampler2DRect sampler,
    vec4 P, vec2 dPdx, vec2 dPdy);

shadow2DRectGradARB(
    sampler2DRectShadow sampler,
    vec3 P, vec2 dPdx, vec2 dPdy);
shadow2DRectProjGradARB(
    sampler2DRectShadow sampler,
    vec4 P, vec2 dPdx, vec2 dPdy);</code></pre>
	 * 
	 * <p>are added to the built-in functions for vertex shaders and fragment shaders.</p>
	 * 
	 * <p>Requires {@link #GL_ARB_shader_objects ARB_shader_objects}. Promoted to core in {@link GL30 OpenGL 3.0}.</p>
	 */
	public final boolean GL_ARB_shader_texture_lod;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_viewport_layer_array.txt">ARB_shader_viewport_layer_array</a> extension is supported.
	 * 
	 * <p>The gl_ViewportIndex and gl_Layer built-in variables were introduced by the in OpenGL 4.1. These variables are available in un-extended OpenGL only to
	 * the geometry shader. When written in the geometry shader, they cause geometry to be directed to one of an array of several independent viewport
	 * rectangles or framebuffer attachment layers, respectively.</p>
	 * 
	 * <p>In order to use any viewport or attachment layer other than zero, a geometry shader must be present. Geometry shaders introduce processing overhead and
	 * potential performance issues. The AMD_vertex_shader_layer and AMD_vertex_shader_viewport_index extensions allowed the gl_Layer and gl_ViewportIndex
	 * outputs to be written directly from the vertex shader with no geometry shader present.</p>
	 * 
	 * <p>This extension effectively merges the AMD_vertex_shader_layer and AMD_vertex_shader_viewport_index extensions together and extends them further to
	 * allow both outputs to be written from tessellation evaluation shaders.</p>
	 * 
	 * <p>Requires {@link GL41 OpenGL 4.1}.</p>
	 */
	public final boolean GL_ARB_shader_viewport_layer_array;
	/** When true, {@link ARBShadingLanguage100} is supported. */
	public final boolean GL_ARB_shading_language_100;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shading_language_420pack.txt">ARB_shading_language_420pack</a> extension is supported.
	 * 
	 * <p>This is a language feature only extension formed from changes made to version 4.20 of GLSL. It includes:</p>
	 * 
	 * <ul>
	 * <li>Add line-continuation using '', as in C++.</li>
	 * <li>Change from ASCII to UTF-8 for the language character set and also allow any characters inside comments.</li>
	 * <li>Allow implicit conversions of return values to the declared type of the function.</li>
	 * <li>The *const* keyword can be used to declare variables within a function body with initializer expressions that are not constant expressions.</li>
	 * <li>Qualifiers on variable declarations no longer have to follow a strict order. The layout qualifier can be used multiple times, and multiple parameter
	 * qualifiers can be used. However, this is not as straightforward as saying declarations have arbitrary lists of initializers. Typically, one
	 * qualifier from each class of qualifiers is allowed, so care is now taken to classify them and say so. Then, of these, order restrictions are removed.</li>
	 * <li>Add layout qualifier identifier "binding" to bind the location of a uniform block. This requires version 1.4 of GLSL. If this extension is used with
	 * an earlier version than 1.4, this feature is not present.</li>
	 * <li>Add layout qualifier identifier "binding" to bind units to sampler and image variable declarations.</li>
	 * <li>Add C-style curly brace initializer lists syntax for initializers. Full initialization of aggregates is required when these are used.</li>
	 * <li>Allow ".length()" to be applied to vectors and matrices, returning the number of components or columns.</li>
	 * <li>Allow swizzle operations on scalars.</li>
	 * <li>Built-in constants for {@code gl_MinProgramTexelOffset} and {@code gl_MaxProgramTexelOffset}.</li>
	 * </ul>
	 * 
	 * <p>Requires GLSL 1.30. Requires GLSL 1.40 for uniform block bindings. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
	 */
	public final boolean GL_ARB_shading_language_420pack;
	/** When true, {@link ARBShadingLanguageInclude} is supported. */
	public final boolean GL_ARB_shading_language_include;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shading_language_packing.txt">ARB_shading_language_packing</a> extension is supported.
	 * 
	 * <p>This extension provides the GLSL built-in functions to convert a 32-bit unsigned integer holding a pair of 16-bit floating-point values to or from a
	 * two-component floating-point vector (vec2).</p>
	 * 
	 * <p>This mechanism allows GLSL shaders to read and write 16-bit floating-point encodings (via 32-bit unsigned integers) without introducing a full set of
	 * 16-bit floating-point data types.</p>
	 * 
	 * <p>This extension also adds the GLSL built-in packing functions included in GLSL version 4.00 and the ARB_gpu_shader5 extension which pack and unpack
	 * vectors of small fixed-point data types into a larger scalar. By putting these packing functions in this separate extension it allows implementations to
	 * provide these functions in hardware that supports them independent of the other {@link #GL_ARB_gpu_shader5 ARB_gpu_shader5} features.</p>
	 * 
	 * <p>In addition to the packing functions from ARB_gpu_shader5 this extension also adds the missing {@code [un]packSnorm2x16} for completeness.</p>
	 * 
	 * <p>Promoted to core in {@link GL42 OpenGL 4.2}.</p>
	 */
	public final boolean GL_ARB_shading_language_packing;
	/** When true, {@link ARBShadow} is supported. */
	public final boolean GL_ARB_shadow;
	/** When true, {@link ARBShadowAmbient} is supported. */
	public final boolean GL_ARB_shadow_ambient;
	/** When true, {@link ARBSparseBuffer} is supported. */
	public final boolean GL_ARB_sparse_buffer;
	/** When true, {@link ARBSparseTexture} is supported. */
	public final boolean GL_ARB_sparse_texture;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/sparse_texture2.txt">ARB_sparse_texture2</a> extension is supported.
	 * 
	 * <p>This extension builds on the {@link ARBSparseTexture ARB_sparse_texture} extension, providing the following new functionality:</p>
	 * 
	 * <ul>
	 * <li>New built-in GLSL texture lookup and image load functions are provided that return information on whether the texels accessed for the texture
	 * lookup accessed uncommitted texture memory.</li>
	 * <li>New built-in GLSL texture lookup functions are provided that specify a minimum level of detail to use for lookups where the level of detail is
	 * computed automatically. This allows shaders to avoid accessing unpopulated portions of high-resolution levels of detail when it knows that the
	 * memory accessed is unpopulated, either from a priori knowledge or from feedback provided by the return value of previously executed "sparse"
	 * texture lookup functions.</li>
	 * <li>Reads of uncommitted texture memory will act as though such memory were filled with zeroes; previously, the values returned by reads were
	 * undefined.</li>
	 * <li>Standard implementation-independent virtual page sizes for internal formats required to be supported with sparse textures. These standard sizes can
	 * be requested by leaving {@link ARBSparseTexture#GL_VIRTUAL_PAGE_SIZE_INDEX_ARB VIRTUAL_PAGE_SIZE_INDEX_ARB} at its initial value (0).</li>
	 * <li>Support for creating sparse multisample and multisample array textures is added. However, the virtual page sizes for such textures remain fully
	 * implementation-dependent.</li>
	 * </ul>
	 * 
	 * <p>Requires {@link ARBSparseTexture ARB_sparse_texture}</p>
	 */
	public final boolean GL_ARB_sparse_texture2;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/sparse_texture_clamp.txt">ARB_sparse_texture_clamp</a> extension is supported.
	 * 
	 * <p>This extension builds on the {@link #GL_ARB_sparse_texture2 ARB_sparse_texture2} extension, providing the following new functionality:</p>
	 * 
	 * <p>New built-in GLSL texture lookup functions are provided that specify a minimum level of detail to use for lookups where the level of detail is
	 * computed automatically. This allows shaders to avoid accessing unpopulated portions of high-resolution levels of detail when it knows that the memory
	 * accessed is unpopulated, either from a priori knowledge or from feedback provided by the return value of previously executed "sparse" texture lookup
	 * functions.</p>
	 * 
	 * <p>Requires {@link #GL_ARB_sparse_texture2 ARB_sparse_texture2}</p>
	 */
	public final boolean GL_ARB_sparse_texture_clamp;
	/** When true, {@link ARBStencilTexturing} is supported. */
	public final boolean GL_ARB_stencil_texturing;
	/** When true, {@link ARBSync} is supported. */
	public final boolean GL_ARB_sync;
	/** When true, {@link ARBTessellationShader} is supported. */
	public final boolean GL_ARB_tessellation_shader;
	/** When true, {@link ARBTextureBarrier} is supported. */
	public final boolean GL_ARB_texture_barrier;
	/** When true, {@link ARBTextureBorderClamp} is supported. */
	public final boolean GL_ARB_texture_border_clamp;
	/** When true, {@link ARBTextureBufferObject} is supported. */
	public final boolean GL_ARB_texture_buffer_object;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_buffer_object_rgb32.txt">ARB_texture_buffer_object_rgb32</a> extension is supported.
	 * 
	 * <p>This extension adds three new buffer texture formats - RGB32F, RGB32I, and RGB32UI. This partially addresses one of the limitations of buffer textures
	 * in the original {@link #GL_EXT_texture_buffer_object EXT_texture_buffer_object} extension and in {@link GL31 OpenGL 3.1}, which provide no support for three-component formats.</p>
	 * 
	 * <p>Promoted to core in {@link GL40 OpenGL 4.0}.</p>
	 */
	public final boolean GL_ARB_texture_buffer_object_rgb32;
	/** When true, {@link ARBTextureBufferRange} is supported. */
	public final boolean GL_ARB_texture_buffer_range;
	/** When true, {@link ARBTextureCompression} is supported. */
	public final boolean GL_ARB_texture_compression;
	/** When true, {@link ARBTextureCompressionBPTC} is supported. */
	public final boolean GL_ARB_texture_compression_bptc;
	/** When true, {@link ARBTextureCompressionRGTC} is supported. */
	public final boolean GL_ARB_texture_compression_rgtc;
	/** When true, {@link ARBTextureCubeMap} is supported. */
	public final boolean GL_ARB_texture_cube_map;
	/** When true, {@link ARBTextureCubeMapArray} is supported. */
	public final boolean GL_ARB_texture_cube_map_array;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_env_add.txt">ARB_texture_env_add</a> extension is supported.
	 * 
	 * <p>This extension adds a new texture environment function: ADD.</p>
	 * 
	 * <p>Promoted to core in {@link GL13 OpenGL 1.3}.</p>
	 */
	public final boolean GL_ARB_texture_env_add;
	/** When true, {@link ARBTextureEnvCombine} is supported. */
	public final boolean GL_ARB_texture_env_combine;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_env_crossbar.txt">ARB_texture_env_crossbar</a> extension is supported.
	 * 
	 * <p>This extension adds the capability to use the texture color from other texture units as sources to the {@link ARBTextureEnvCombine#GL_COMBINE_ARB COMBINE_ARB} environment
	 * function. The {@link ARBTextureEnvCombine ARB_texture_env_combine} extension defined texture environment functions which could use the color from the current texture unit
	 * as a source. This extension adds the ability to use the color from any texture unit as a source.</p>
	 * 
	 * <p>Requires {@link #GL_ARB_multitexture ARB_multitexture} and {@link ARBTextureEnvCombine ARB_texture_env_combine}. Promoted to core in {@link GL14 OpenGL 1.4}.</p>
	 */
	public final boolean GL_ARB_texture_env_crossbar;
	/** When true, {@link ARBTextureEnvDot3} is supported. */
	public final boolean GL_ARB_texture_env_dot3;
	/** When true, {@link ARBTextureFilterMinmax} is supported. */
	public final boolean GL_ARB_texture_filter_minmax;
	/** When true, {@link ARBTextureFloat} is supported. */
	public final boolean GL_ARB_texture_float;
	/** When true, {@link ARBTextureGather} is supported. */
	public final boolean GL_ARB_texture_gather;
	/** When true, {@link ARBTextureMirrorClampToEdge} is supported. */
	public final boolean GL_ARB_texture_mirror_clamp_to_edge;
	/** When true, {@link ARBTextureMirroredRepeat} is supported. */
	public final boolean GL_ARB_texture_mirrored_repeat;
	/** When true, {@link ARBTextureMultisample} is supported. */
	public final boolean GL_ARB_texture_multisample;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_non_power_of_two.txt">ARB_texture_non_power_of_two</a> extension is supported.
	 * 
	 * <p>Conventional OpenGL texturing is limited to images with power-of-two dimensions and an optional 1-texel border. This extension relaxes the size
	 * restrictions for the 1D, 2D, cube map, and 3D texture targets.</p>
	 * 
	 * <p>Promoted to core in {@link GL20 OpenGL 2.0}.</p>
	 */
	public final boolean GL_ARB_texture_non_power_of_two;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_query_levels.txt">ARB_texture_query_levels</a> extension is supported.
	 * 
	 * <p>This extension provides a new set of texture functions ({@code textureQueryLevels}) in the OpenGL Shading Language that exposes the number of accessible
	 * mipmap levels in the texture associated with a GLSL sampler variable. The set of accessible levels includes all the levels of the texture defined either
	 * through TexImage*, TexStorage*, or TextureView* ({@link ARBTextureView ARB_texture_view}) APIs that are not below the {@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL} or above the
	 * {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL} parameters. For textures defined with TexImage*, the set of resident levels is somewhat implementation-dependent. For fully
	 * defined results, applications should use TexStorage*&#47;TextureView unless the texture has a full mipmap chain and is used with a mipmapped minification
	 * filter.</p>
	 * 
	 * <p>These functions means that shaders are not required to manually recompute, approximate, or maintain a uniform holding a pre-computed level count, since
	 * the true level count is already available to the implementation. This value can be used to avoid black or leaking pixel artifacts for rendering methods
	 * which are using texture images as memory pages (eg: virtual textures); methods that can't only rely on the fixed pipeline texture functions which take
	 * advantage of {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL} for their sampling.</p>
	 * 
	 * <p>Requires {@link GL30 OpenGL 3.0} and GLSL 1.30. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
	 */
	public final boolean GL_ARB_texture_query_levels;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_query_lod.txt">ARB_texture_query_lod</a> extension is supported.
	 * 
	 * <p>This extension provides a new set of fragment shader texture functions ({@code textureLOD}) that return the results of automatic level-of-detail
	 * computations that would be performed if a texture lookup were performed.</p>
	 * 
	 * <p>Requires {@link GL20 OpenGL 2.0}, {@link #GL_EXT_gpu_shader4 EXT_gpu_shader4}, {@link #GL_EXT_texture_array EXT_texture_array} and GLSL 1.30. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
	 */
	public final boolean GL_ARB_texture_query_lod;
	/** When true, {@link ARBTextureRectangle} is supported. */
	public final boolean GL_ARB_texture_rectangle;
	/** When true, {@link ARBTextureRG} is supported. */
	public final boolean GL_ARB_texture_rg;
	/** When true, {@link ARBTextureRGB10_A2UI} is supported. */
	public final boolean GL_ARB_texture_rgb10_a2ui;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/texture_stencil8.txt">ARB_texture_stencil8</a> extension is supported.
	 * 
	 * <p>This extension accepts {@link GL30#GL_STENCIL_INDEX8 STENCIL_INDEX8} as a texture internal format, and adds STENCIL_INDEX8 to the required internal format list. This removes the
	 * need to use renderbuffers if a stencil-only format is desired.</p>
	 * 
	 * <p>Promoted to core in {@link GL44 OpenGL 4.4}.</p>
	 */
	public final boolean GL_ARB_texture_stencil8;
	/** When true, {@link ARBTextureStorage} is supported. */
	public final boolean GL_ARB_texture_storage;
	/** When true, {@link ARBTextureStorageMultisample} is supported. */
	public final boolean GL_ARB_texture_storage_multisample;
	/** When true, {@link ARBTextureSwizzle} is supported. */
	public final boolean GL_ARB_texture_swizzle;
	/** When true, {@link ARBTextureView} is supported. */
	public final boolean GL_ARB_texture_view;
	/** When true, {@link ARBTimerQuery} is supported. */
	public final boolean GL_ARB_timer_query;
	/** When true, {@link ARBTransformFeedback2} is supported. */
	public final boolean GL_ARB_transform_feedback2;
	/** When true, {@link ARBTransformFeedback3} is supported. */
	public final boolean GL_ARB_transform_feedback3;
	/** When true, {@link ARBTransformFeedbackInstanced} is supported. */
	public final boolean GL_ARB_transform_feedback_instanced;
	/** When true, {@link ARBTransformFeedbackOverflowQuery} is supported. */
	public final boolean GL_ARB_transform_feedback_overflow_query;
	/** When true, {@link ARBTransposeMatrix} is supported. */
	public final boolean GL_ARB_transpose_matrix;
	/** When true, {@link ARBUniformBufferObject} is supported. */
	public final boolean GL_ARB_uniform_buffer_object;
	/** When true, {@link ARBVertexArrayBGRA} is supported. */
	public final boolean GL_ARB_vertex_array_bgra;
	/** When true, {@link ARBVertexArrayObject} is supported. */
	public final boolean GL_ARB_vertex_array_object;
	/** When true, {@link ARBVertexAttrib64Bit} is supported. */
	public final boolean GL_ARB_vertex_attrib_64bit;
	/** When true, {@link ARBVertexAttribBinding} is supported. */
	public final boolean GL_ARB_vertex_attrib_binding;
	/** When true, {@link ARBVertexBlend} is supported. */
	public final boolean GL_ARB_vertex_blend;
	/** When true, {@link ARBVertexBufferObject} is supported. */
	public final boolean GL_ARB_vertex_buffer_object;
	/** When true, {@link ARBVertexProgram} is supported. */
	public final boolean GL_ARB_vertex_program;
	/** When true, {@link ARBVertexShader} is supported. */
	public final boolean GL_ARB_vertex_shader;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/vertex_type_10f_11f_11f_rev.txt">ARB_vertex_type_10f_11f_11f_rev</a> extension is supported.
	 * 
	 * <p>This extension a new vertex attribute data format: a packed 11.11.10 unsigned float vertex data format. This vertex data format can be used to describe
	 * a compressed 3 component stream of values that can be represented by 10- or 11-bit unsigned floating point values.</p>
	 * 
	 * <p>The {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV} vertex attribute type is equivalent to the {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F} texture internal format.</p>
	 * 
	 * <p>Requires {@link GL30 OpenGL 3.0} and {@link ARBVertexType2_10_10_10_REV ARB_vertex_type_2_10_10_10_rev}. Promoted to core in {@link GL44 OpenGL 4.4}.</p>
	 */
	public final boolean GL_ARB_vertex_type_10f_11f_11f_rev;
	/** When true, {@link ARBVertexType2_10_10_10_REV} is supported. */
	public final boolean GL_ARB_vertex_type_2_10_10_10_rev;
	/** When true, {@link ARBViewportArray} is supported. */
	public final boolean GL_ARB_viewport_array;
	/** When true, {@link ARBWindowPos} is supported. */
	public final boolean GL_ARB_window_pos;
	/** When true, {@link ATIMeminfo} is supported. */
	public final boolean GL_ATI_meminfo;
	/** When true, the <a href="http://www.opengl.org/registry/specs/ATI/shader_texture_lod.txt">ATI_shader_texture_lod</a> extension is supported. */
	public final boolean GL_ATI_shader_texture_lod;
	/** When true, {@link ATITextureCompression3DC} is supported. */
	public final boolean GL_ATI_texture_compression_3dc;
	/** When true, {@link EXT422Pixels} is supported. */
	public final boolean GL_EXT_422_pixels;
	/** When true, {@link EXTABGR} is supported. */
	public final boolean GL_EXT_abgr;
	/** When true, {@link EXTBGRA} is supported. */
	public final boolean GL_EXT_bgra;
	/** When true, {@link EXTBindableUniform} is supported. */
	public final boolean GL_EXT_bindable_uniform;
	/** When true, {@link EXTBlendColor} is supported. */
	public final boolean GL_EXT_blend_color;
	/** When true, {@link EXTBlendEquationSeparate} is supported. */
	public final boolean GL_EXT_blend_equation_separate;
	/** When true, {@link EXTBlendFuncSeparate} is supported. */
	public final boolean GL_EXT_blend_func_separate;
	/** When true, {@link EXTBlendMinmax} is supported. */
	public final boolean GL_EXT_blend_minmax;
	/** When true, {@link EXTBlendSubtract} is supported. */
	public final boolean GL_EXT_blend_subtract;
	/** When true, {@link EXTClipVolumeHint} is supported. */
	public final boolean GL_EXT_clip_volume_hint;
	/** When true, {@link EXTCompiledVertexArray} is supported. */
	public final boolean GL_EXT_compiled_vertex_array;
	/** When true, {@link EXTDebugLabel} is supported. */
	public final boolean GL_EXT_debug_label;
	/** When true, {@link EXTDebugMarker} is supported. */
	public final boolean GL_EXT_debug_marker;
	/** When true, {@link EXTDepthBoundsTest} is supported. */
	public final boolean GL_EXT_depth_bounds_test;
	/** When true, {@link EXTDirectStateAccess} is supported. */
	public final boolean GL_EXT_direct_state_access;
	/** When true, {@link EXTDrawBuffers2} is supported. */
	public final boolean GL_EXT_draw_buffers2;
	/** When true, {@link EXTDrawInstanced} is supported. */
	public final boolean GL_EXT_draw_instanced;
	/** When true, {@link EXTFramebufferBlit} is supported. */
	public final boolean GL_EXT_framebuffer_blit;
	/** When true, {@link EXTFramebufferMultisample} is supported. */
	public final boolean GL_EXT_framebuffer_multisample;
	/** When true, {@link EXTFramebufferMultisampleBlitScaled} is supported. */
	public final boolean GL_EXT_framebuffer_multisample_blit_scaled;
	/** When true, {@link EXTFramebufferObject} is supported. */
	public final boolean GL_EXT_framebuffer_object;
	/** When true, {@link EXTFramebufferSRGB} is supported. */
	public final boolean GL_EXT_framebuffer_sRGB;
	/** When true, {@link EXTGeometryShader4} is supported. */
	public final boolean GL_EXT_geometry_shader4;
	/** When true, {@link EXTGPUProgramParameters} is supported. */
	public final boolean GL_EXT_gpu_program_parameters;
	/** When true, {@link EXTGPUShader4} is supported. */
	public final boolean GL_EXT_gpu_shader4;
	/** When true, {@link EXTPackedDepthStencil} is supported. */
	public final boolean GL_EXT_packed_depth_stencil;
	/** When true, {@link EXTPackedFloat} is supported. */
	public final boolean GL_EXT_packed_float;
	/** When true, {@link EXTPixelBufferObject} is supported. */
	public final boolean GL_EXT_pixel_buffer_object;
	/** When true, {@link EXTPointParameters} is supported. */
	public final boolean GL_EXT_point_parameters;
	/** When true, {@link EXTPolygonOffsetClamp} is supported. */
	public final boolean GL_EXT_polygon_offset_clamp;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/EXT/post_depth_coverage.txt">EXT_post_depth_coverage</a> extension is supported.
	 * 
	 * <p>This extension allows the fragment shader to control whether values in {@code gl_SampleMaskIn[]} reflect the coverage after application of the early
	 * depth and stencil tests.  This feature can be enabled with the following layout qualifier in the fragment shader:</p>
	 * 
	 * <pre><code>layout(post_depth_coverage) in;</code></pre>
	 * 
	 * <p>To use this feature, early fragment tests must also be enabled in the fragment shader via:</p>
	 * 
	 * <pre><code>layout(early_fragment_tests) in;</code></pre>
	 */
	public final boolean GL_EXT_post_depth_coverage;
	/** When true, {@link EXTProvokingVertex} is supported. */
	public final boolean GL_EXT_provoking_vertex;
	/** When true, {@link EXTRasterMultisample} is supported. */
	public final boolean GL_EXT_raster_multisample;
	/** When true, {@link EXTSecondaryColor} is supported. */
	public final boolean GL_EXT_secondary_color;
	/** When true, {@link EXTSeparateShaderObjects} is supported. */
	public final boolean GL_EXT_separate_shader_objects;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/EXT/shader_image_load_formatted.txt">EXT_shader_image_load_formatted</a> extension is supported.
	 * 
	 * <p>{@link ARBShaderImageLoadStore ARB_shader_image_load_store} (and OpenGL 4.2) added support for random access load and store from/to texture images, but due to hardware
	 * limitations, loads were required to declare the image format in the shader source. This extension relaxes that requirement, and the return values from
	 * {@code imageLoad} can be format-converted based on the format of the image binding.</p>
	 */
	public final boolean GL_EXT_shader_image_load_formatted;
	/** When true, {@link EXTShaderImageLoadStore} is supported. */
	public final boolean GL_EXT_shader_image_load_store;
	/**
	 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/shader_integer_mix.txt">EXT_shader_integer_mix</a> extension.
	 * 
	 * <p>GLSL 1.30 (and GLSL ES 3.00) expanded the mix() built-in function to operate on a boolean third argument that does not interpolate but selects. This
	 * extension extends mix() to select between int, uint, and bool components.</p>
	 * 
	 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
	 */
	public final boolean GL_EXT_shader_integer_mix;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/EXT/shadow_funcs.txt">EXT_shadow_funcs</a> extension is supported.
	 * 
	 * <p>This extension generalizes the {@link #GL_ARB_shadow ARB_shadow} extension to support all eight binary texture comparison functions rather than just {@link GL11#GL_LEQUAL LEQUAL} and
	 * {@link GL11#GL_GEQUAL GEQUAL}.</p>
	 * 
	 * <p>Requires {@link #GL_ARB_depth_texture ARB_depth_texture} and {@link #GL_ARB_shadow ARB_shadow}.</p>
	 */
	public final boolean GL_EXT_shadow_funcs;
	/** When true, {@link EXTSharedTexturePalette} is supported. */
	public final boolean GL_EXT_shared_texture_palette;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/EXT/sparse_texture2.txt">EXT_sparse_texture2</a> extension is supported.
	 * 
	 * <p>This extension builds on the {@link ARBSparseTexture ARB_sparse_texture} extension, providing the following new functionality:</p>
	 * 
	 * <ul>
	 * <li>New built-in GLSL texture lookup and image load functions are provided that return information on whether the texels accessed for the texture
	 * lookup accessed uncommitted texture memory.
	 * 
	 * <p>New built-in GLSL texture lookup functions are provided that specify a minimum level of detail to use for lookups where the level of detail is
	 * computed automatically. This allows shaders to avoid accessing unpopulated portions of high-resolution levels of detail when it knows that the
	 * memory accessed is unpopulated, either from a priori knowledge or from feedback provided by the return value of previously executed "sparse"
	 * texture lookup functions.</p>
	 * 
	 * <p>Reads of uncommitted texture memory will act as though such memory were filled with zeroes; previously, the values returned by reads were undefined.</p>
	 * 
	 * <p>Standard implementation-independent virtual page sizes for internal formats required to be supported with sparse textures. These standard sizes can
	 * be requested by leaving {@link ARBSparseTexture#GL_VIRTUAL_PAGE_SIZE_INDEX_ARB VIRTUAL_PAGE_SIZE_INDEX_ARB} at its initial value (0).</p>
	 * 
	 * <p>Support for creating sparse multisample and multisample array textures is added. However, the virtual page sizes for such textures remain fully
	 * implementation-dependent.</p></li>
	 * </ul>
	 * 
	 * <p>Requires {@link ARBSparseTexture ARB_sparse_texture}.</p>
	 */
	public final boolean GL_EXT_sparse_texture2;
	/** When true, {@link EXTStencilClearTag} is supported. */
	public final boolean GL_EXT_stencil_clear_tag;
	/** When true, {@link EXTStencilTwoSide} is supported. */
	public final boolean GL_EXT_stencil_two_side;
	/** When true, {@link EXTStencilWrap} is supported. */
	public final boolean GL_EXT_stencil_wrap;
	/** When true, {@link EXTTextureArray} is supported. */
	public final boolean GL_EXT_texture_array;
	/** When true, {@link EXTTextureBufferObject} is supported. */
	public final boolean GL_EXT_texture_buffer_object;
	/** When true, {@link EXTTextureCompressionLATC} is supported. */
	public final boolean GL_EXT_texture_compression_latc;
	/** When true, {@link EXTTextureCompressionRGTC} is supported. */
	public final boolean GL_EXT_texture_compression_rgtc;
	/** When true, {@link EXTTextureCompressionS3TC} is supported. */
	public final boolean GL_EXT_texture_compression_s3tc;
	/** When true, {@link EXTTextureFilterAnisotropic} is supported. */
	public final boolean GL_EXT_texture_filter_anisotropic;
	/** When true, {@link EXTTextureFilterMinmax} is supported. */
	public final boolean GL_EXT_texture_filter_minmax;
	/** When true, {@link EXTTextureInteger} is supported. */
	public final boolean GL_EXT_texture_integer;
	/** When true, {@link EXTTextureMirrorClamp} is supported. */
	public final boolean GL_EXT_texture_mirror_clamp;
	/** When true, {@link EXTTextureSharedExponent} is supported. */
	public final boolean GL_EXT_texture_shared_exponent;
	/** When true, {@link EXTTextureSnorm} is supported. */
	public final boolean GL_EXT_texture_snorm;
	/** When true, {@link EXTTextureSRGB} is supported. */
	public final boolean GL_EXT_texture_sRGB;
	/** When true, {@link EXTTextureSRGBDecode} is supported. */
	public final boolean GL_EXT_texture_sRGB_decode;
	/** When true, {@link EXTTextureSwizzle} is supported. */
	public final boolean GL_EXT_texture_swizzle;
	/** When true, {@link EXTTimerQuery} is supported. */
	public final boolean GL_EXT_timer_query;
	/** When true, {@link EXTTransformFeedback} is supported. */
	public final boolean GL_EXT_transform_feedback;
	/**
	 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/vertex_array_bgra.txt">EXT_vertex_array_bgra</a> extension.
	 * 
	 * <p>This extension provides a single new component format for vertex arrays to read 4-component unsigned byte vertex attributes with a BGRA component
	 * ordering.</p>
	 * 
	 * <p>OpenGL expects vertex arrays containing 4 unsigned bytes per element to be in the RGBA, STRQ, or XYZW order (reading components left-to-right in their
	 * lower address to higher address order). Essentially the order the components appear in memory is the order the components appear in the resulting
	 * vertex attribute vector.</p>
	 * 
	 * <p>However Direct3D has color (diffuse and specular) vertex arrays containing 4 unsigned bytes per element that are in a BGRA order (again reading
	 * components left-to-right in their lower address to higher address order). Direct3D calls this "ARGB" reading the components in the opposite order
	 * (reading components left-to-right in their higher address to lower address order). This ordering is generalized in the DirectX 10 by the
	 * DXGI_FORMAT_B8G8R8A8_UNORM format.</p>
	 * 
	 * <p>For an OpenGL application to source color data from a vertex buffer formatted for Direct3D's color array format conventions, the application is forced
	 * to either:</p>
	 * 
	 * <ol>
	 * <li>Rely on a vertex program or shader to swizzle the color components from the BGRA to conventional RGBA order.</li>
	 * <li>Re-order the color data components in the vertex buffer from Direct3D's native BGRA order to OpenGL's native RGBA order.</li>
	 * </ol>
	 * 
	 * <p>Neither option is entirely satisfactory.</p>
	 * 
	 * <p>Option 1 means vertex shaders have to be re-written to source colors differently. If the same vertex shader is used with vertex arrays configured to
	 * source the color as 4 floating-point color components, the swizzle for BGRA colors stored as 4 unsigned bytes is no longer appropriate. The shader's
	 * swizzling of colors becomes dependent on the type and number of color components. Ideally the vertex shader should be independent from the format and
	 * component ordering of the data it sources.</p>
	 * 
	 * <p>Option 2 is expensive because vertex buffers may have to be reformatted prior to use. OpenGL treats the memory for vertex arrays (whether client-side
	 * memory or buffer objects) as essentially untyped memory and vertex arrays can be stored separately, interleaved, or even interwoven (where multiple
	 * arrays overlap with differing strides and formats).</p>
	 * 
	 * <p>Rather than force a re-ordering of either vertex array components in memory or a vertex array format-dependent re-ordering of vertex shader inputs,
	 * OpenGL can simply provide a vertex array format that matches the Direct3D color component ordering.</p>
	 * 
	 * <p>This approach mimics that of the EXT_bgra extension for pixel and texel formats except for vertex instead of image data.</p>
	 */
	public final boolean GL_EXT_vertex_array_bgra;
	/** When true, {@link EXTVertexAttrib64bit} is supported. */
	public final boolean GL_EXT_vertex_attrib_64bit;
	/** When true, {@link EXTX11SyncObject} is supported. */
	public final boolean GL_EXT_x11_sync_object;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/INTEL/fragment_shader_ordering.txt">INTEL_fragment_shader_ordering</a> extension is supported.
	 * 
	 * <p>Graphics devices may execute in parallel fragment shaders referring to the same window xy coordinates. Framebuffer writes are guaranteed to be
	 * processed in primitive rasterization order, but there is no order guarantee for other instructions and image or buffer object accesses in particular.</p>
	 * 
	 * <p>The extension introduces a new GLSL built-in function, beginFragmentShaderOrderingINTEL(), which blocks execution of a fragment shader invocation until
	 * invocations from previous primitives that map to the same xy window coordinates (and same sample when per-sample shading is active) complete their
	 * execution. All memory transactions from previous fragment shader invocations are made visible to the fragment shader invocation that called
	 * beginFragmentShaderOrderingINTEL() when the function returns.</p>
	 */
	public final boolean GL_INTEL_fragment_shader_ordering;
	/** When true, {@link INTELFramebufferCMAA} is supported. */
	public final boolean GL_INTEL_framebuffer_CMAA;
	/** When true, {@link INTELMapTexture} is supported. */
	public final boolean GL_INTEL_map_texture;
	/** When true, {@link INTELPerformanceQuery} is supported. */
	public final boolean GL_INTEL_performance_query;
	/** When true, {@link KHRBlendEquationAdvanced} is supported. */
	public final boolean GL_KHR_blend_equation_advanced;
	/** When true, {@link KHRBlendEquationAdvancedCoherent} is supported. */
	public final boolean GL_KHR_blend_equation_advanced_coherent;
	/** When true, {@link KHRContextFlushControl} is supported. */
	public final boolean GL_KHR_context_flush_control;
	/** When true, {@link KHRDebug} is supported. */
	public final boolean GL_KHR_debug;
	/** When true, {@link KHRNoError} is supported. */
	public final boolean GL_KHR_no_error;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/KHR/robust_buffer_access_behavior.txt">KHR_robust_buffer_access_behavior</a> extension is supported.
	 * 
	 * <p>This extension specifies the behavior of out-of-bounds buffer and array accesses. This is an improvement over the existing {@link #GL_KHR_robustness KHR_robustness}
	 * extension which states that the application should not crash, but that behavior is otherwise undefined. This extension specifies the access protection
	 * provided by the GL to ensure that out-of-bounds accesses cannot read from or write to data not owned by the application. All accesses are contained
	 * within the buffer object and program area they reference. These additional robustness guarantees apply to contexts created with the robust access flag
	 * set.</p>
	 * 
	 * <p>Requires {@link GL32 OpenGL 3.2} and {@link #GL_KHR_robustness KHR_robustness}.</p>
	 */
	public final boolean GL_KHR_robust_buffer_access_behavior;
	/** When true, {@link KHRRobustness} is supported. */
	public final boolean GL_KHR_robustness;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/KHR/texture_compression_astc_hdr.txt">KHR_texture_compression_astc_hdr</a> extension is supported.
	 * 
	 * <p>This extension corresponds to the ASTC HDR Profile, see {@link KHRTextureCompressionASTCLDR KHR_texture_compression_astc_ldr} for details.</p>
	 */
	public final boolean GL_KHR_texture_compression_astc_hdr;
	/** When true, {@link KHRTextureCompressionASTCLDR} is supported. */
	public final boolean GL_KHR_texture_compression_astc_ldr;
	/**
	 * Native bindings to the <a href="http://www.opengl.org/registry/specs/KHR/texture_compression_astc_sliced_3d.txt">KHR_texture_compression_astc_sliced_3d</a> extension.
	 * 
	 * <p>Adaptive Scalable Texture Compression (ASTC) is a new texture compression technology that offers unprecendented flexibility, while producing better or
	 * comparable results than existing texture compressions at all bit rates. It includes support for 2D and slice-based 3D textures, with low and high
	 * dynamic range, at bitrates from below 1 bit/pixel up to 8 bits/pixel in fine steps.</p>
	 * 
	 * <p>This extension extends the functionality of {@link KHRTextureCompressionASTCLDR KHR_texture_compression_astc_ldr} to include slice-based 3D textures for textures using the LDR
	 * profile in the same way as the HDR profile allows slice-based 3D textures.</p>
	 * 
	 * <p>Requires {@link KHRTextureCompressionASTCLDR KHR_texture_compression_astc_ldr}.</p>
	 */
	public final boolean GL_KHR_texture_compression_astc_sliced_3d;
	/** When true, {@link NVBindlessMultiDrawIndirect} is supported. */
	public final boolean GL_NV_bindless_multi_draw_indirect;
	/** When true, {@link NVBindlessMultiDrawIndirectCount} is supported. */
	public final boolean GL_NV_bindless_multi_draw_indirect_count;
	/** When true, {@link NVBindlessTexture} is supported. */
	public final boolean GL_NV_bindless_texture;
	/** When true, {@link NVBlendEquationAdvanced} is supported. */
	public final boolean GL_NV_blend_equation_advanced;
	/** When true, {@link NVBlendEquationAdvancedCoherent} is supported. */
	public final boolean GL_NV_blend_equation_advanced_coherent;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/blend_square.txt">NV_blend_square</a> extension is supported. */
	public final boolean GL_NV_blend_square;
	/** When true, {@link NVClipSpaceWScaling} is supported. */
	public final boolean GL_NV_clip_space_w_scaling;
	/** When true, {@link NVCommandList} is supported. */
	public final boolean GL_NV_command_list;
	/** When true, {@link NVConditionalRender} is supported. */
	public final boolean GL_NV_conditional_render;
	/** When true, {@link NVConservativeRaster} is supported. */
	public final boolean GL_NV_conservative_raster;
	/** When true, {@link NVConservativeRasterDilate} is supported. */
	public final boolean GL_NV_conservative_raster_dilate;
	/** When true, {@link NVConservativeRasterPreSnapTriangles} is supported. */
	public final boolean GL_NV_conservative_raster_pre_snap_triangles;
	/** When true, {@link NVCopyDepthToColor} is supported. */
	public final boolean GL_NV_copy_depth_to_color;
	/** When true, {@link NVCopyImage} is supported. */
	public final boolean GL_NV_copy_image;
	/** When true, {@link NVDeepTexture3D} is supported. */
	public final boolean GL_NV_deep_texture3D;
	/** When true, {@link NVDepthBufferFloat} is supported. */
	public final boolean GL_NV_depth_buffer_float;
	/** When true, {@link NVDepthClamp} is supported. */
	public final boolean GL_NV_depth_clamp;
	/** When true, {@link NVDrawTexture} is supported. */
	public final boolean GL_NV_draw_texture;
	/** When true, {@link NVDrawVulkanImage} is supported. */
	public final boolean GL_NV_draw_vulkan_image;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/ES3_1_compatibility.txt">NV_ES3_1_compatibility</a> extension is supported. */
	public final boolean GL_NV_ES3_1_compatibility;
	/** When true, {@link NVExplicitMultisample} is supported. */
	public final boolean GL_NV_explicit_multisample;
	/** When true, {@link NVFence} is supported. */
	public final boolean GL_NV_fence;
	/** When true, {@link NVFillRectangle} is supported. */
	public final boolean GL_NV_fill_rectangle;
	/** When true, {@link NVFloatBuffer} is supported. */
	public final boolean GL_NV_float_buffer;
	/** When true, {@link NVFogDistance} is supported. */
	public final boolean GL_NV_fog_distance;
	/** When true, {@link NVFragmentCoverageToColor} is supported. */
	public final boolean GL_NV_fragment_coverage_to_color;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/fragment_program4.txt">NV_fragment_program4</a> extension is supported. */
	public final boolean GL_NV_fragment_program4;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/fragment_program_option.txt">NV_fragment_program_option</a> extension is supported. */
	public final boolean GL_NV_fragment_program_option;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/fragment_shader_interlock.txt">NV_fragment_shader_interlock</a> extension is supported.
	 * 
	 * <p>In unextended OpenGL 4.3, applications may produce a large number of fragment shader invocations that perform loads and stores to memory using image
	 * uniforms, atomic counter uniforms, buffer variables, or pointers. The order in which loads and stores to common addresses are performed by different
	 * fragment shader invocations is largely undefined. For algorithms that use shader writes and touch the same pixels more than once, one or more of the
	 * following techniques may be required to ensure proper execution ordering:</p>
	 * 
	 * <ul>
	 * <li>inserting Finish or WaitSync commands to drain the pipeline between different "passes" or "layers";</li>
	 * <li>using only atomic memory operations to write to shader memory (which may be relatively slow and limits how memory may be updated); or</li>
	 * <li>injecting spin loops into shaders to prevent multiple shader invocations from touching the same memory concurrently.</li>
	 * </ul>
	 * 
	 * <p>This extension provides new GLSL built-in functions beginInvocationInterlockNV() and endInvocationInterlockNV() that delimit a critical section of
	 * fragment shader code. For pairs of shader invocations with "overlapping" coverage in a given pixel, the OpenGL implementation will guarantee that the
	 * critical section of the fragment shader will be executed for only one fragment at a time.</p>
	 * 
	 * <p>There are four different interlock modes supported by this extension, which are identified by layout qualifiers. The qualifiers
	 * "pixel_interlock_ordered" and "pixel_interlock_unordered" provides mutual exclusion in the critical section for any pair of fragments corresponding to
	 * the same pixel. When using multisampling, the qualifiers "sample_interlock_ordered" and "sample_interlock_unordered" only provide mutual exclusion for
	 * pairs of fragments that both cover at least one common sample in the same pixel; these are recommended for performance if shaders use per-sample data
	 * structures.</p>
	 * 
	 * <p>Additionally, when the "pixel_interlock_ordered" or "sample_interlock_ordered" layout qualifier is used, the interlock also guarantees that the
	 * critical section for multiple shader invocations with "overlapping" coverage will be executed in the order in which the primitives were processed by
	 * the GL. Such a guarantee is useful for applications like blending in the fragment shader, where an application requires that fragment values to be
	 * composited in the framebuffer in primitive order.</p>
	 * 
	 * <p>This extension can be useful for algorithms that need to access per-pixel data structures via shader loads and stores. Such algorithms using this
	 * extension can access such data structures in the critical section without worrying about other invocations for the same pixel accessing the data
	 * structures concurrently. Additionally, the ordering guarantees are useful for cases where the API ordering of fragments is meaningful. For example,
	 * applications may be able to execute programmable blending operations in the fragment shader, where the destination buffer is read via image loads and
	 * the final value is written via image stores.</p>
	 * 
	 * <p>Requires {@link GL43 OpenGL 4.3} and GLSL 4.30.</p>
	 */
	public final boolean GL_NV_fragment_shader_interlock;
	/** When true, {@link NVFramebufferMixedSamples} is supported. */
	public final boolean GL_NV_framebuffer_mixed_samples;
	/** When true, {@link NVFramebufferMultisampleCoverage} is supported. */
	public final boolean GL_NV_framebuffer_multisample_coverage;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/geometry_shader4.txt">NV_geometry_shader4</a> extension is supported.
	 * 
	 * <p>This extension builds upon the {@link #GL_EXT_geometry_shader4 EXT_geometry_shader4} specification to provide two additional capabilities:</p>
	 * 
	 * <ul>
	 * <li>Support for QUADS, QUAD_STRIP, and POLYGON primitive types when geometry shaders are enabled.  Such primitives will be tessellated into individual
	 * triangles.</li>
	 * <li>Setting the value of GEOMETRY_VERTICES_OUT_EXT will take effect immediately. It is not necessary to link the program object in order for this change
	 * to take effect, as is the case in the EXT version of this extension.</li>
	 * </ul>
	 * 
	 * <p>Requires {@link #GL_EXT_geometry_shader4 EXT_geometry_shader4}.</p>
	 */
	public final boolean GL_NV_geometry_shader4;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/geometry_shader_passthrough.txt">NV_geometry_shader_passthrough</a> extension is supported.
	 * 
	 * <p>This extension provides a shading language abstraction to express such shaders without requiring explicit logic to manually copy attributes from input
	 * vertices to output vertices.</p>
	 */
	public final boolean GL_NV_geometry_shader_passthrough;
	/** When true, {@link NVGPUShader5} is supported. */
	public final boolean GL_NV_gpu_shader5;
	/** When true, {@link NVHalfFloat} is supported. */
	public final boolean GL_NV_half_float;
	/** When true, {@link NVInternalformatSampleQuery} is supported. */
	public final boolean GL_NV_internalformat_sample_query;
	/** When true, {@link NVLightMaxExponent} is supported. */
	public final boolean GL_NV_light_max_exponent;
	/** When true, {@link NVMultisampleCoverage} is supported. */
	public final boolean GL_NV_multisample_coverage;
	/** When true, {@link NVMultisampleFilterHint} is supported. */
	public final boolean GL_NV_multisample_filter_hint;
	/** When true, {@link NVPackedDepthStencil} is supported. */
	public final boolean GL_NV_packed_depth_stencil;
	/** When true, {@link NVPathRendering} is supported. */
	public final boolean GL_NV_path_rendering;
	/** When true, {@link NVPathRenderingSharedEdge} is supported. */
	public final boolean GL_NV_path_rendering_shared_edge;
	/** When true, {@link NVPixelDataRange} is supported. */
	public final boolean GL_NV_pixel_data_range;
	/** When true, {@link NVPointSprite} is supported. */
	public final boolean GL_NV_point_sprite;
	/** When true, {@link NVPrimitiveRestart} is supported. */
	public final boolean GL_NV_primitive_restart;
	/** When true, {@link NVRobustnessVideoMemoryPurge} is supported. */
	public final boolean GL_NV_robustness_video_memory_purge;
	/** When true, {@link NVSampleLocations} is supported. */
	public final boolean GL_NV_sample_locations;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/sample_mask_override_coverage.txt">NV_sample_mask_override_coverage</a> extension is supported.
	 * 
	 * <p>This extension allows the fragment shader to control whether the gl_SampleMask output can enable samples that were not covered by the original
	 * primitive, or that failed the early depth/stencil tests.</p>
	 */
	public final boolean GL_NV_sample_mask_override_coverage;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/shader_atomic_float.txt">NV_shader_atomic_float</a> extension is supported.
	 * 
	 * <p>This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform atomic read-modify-write operations to buffer or
	 * texture memory with floating-point components.  The set of atomic operations provided by this extension is limited to adds and exchanges. Providing
	 * atomic add support allows shaders to atomically accumulate the sum of floating-point values into buffer or texture memory across multiple (possibly
	 * concurrent) shader invocations.</p>
	 * 
	 * <p>This extension provides GLSL support for atomics targeting image uniforms (if GLSL 4.20, {@link #GL_ARB_shader_image_load_store ARB_shader_image_load_store}, or
	 * {@link #GL_EXT_shader_image_load_store EXT_shader_image_load_store} is supported) or floating-point pointers (if {@link #GL_NV_gpu_shader5 NV_gpu_shader5} is supported). Additionally, assembly opcodes
	 * for these operations is also provided if <a href="http://www.opengl.org/registry/specs/NV/gpu_program5.txt">NV_shader_atomic_float</a> is supported.</p>
	 */
	public final boolean GL_NV_shader_atomic_float;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/shader_atomic_float64.txt">NV_shader_atomic_float64</a> extension is supported.
	 * 
	 * <p>This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform atomic read-modify-write operations to buffer or
	 * shared memory with double-precision floating-point components.  The set of atomic operations provided by this extension is limited to adds and
	 * exchanges. Providing atomic add support allows shaders to atomically accumulate the sum of double-precision floating-point values into buffer memory
	 * across multiple (possibly concurrent) shader invocations.</p>
	 * 
	 * <p>This extension provides GLSL support for atomics targeting double-precision floating-point pointers (if {@link NVGPUShader5 NV_gpu_shader5} is supported).
	 * Additionally, assembly opcodes for these operations are also provided if {@code NV_gpu_program5} is supported.</p>
	 * 
	 * <p>Requires {@link ARBGPUShaderFP64 ARB_gpu_shader_fp64} or {@code NV_gpu_program_fp64}.</p>
	 */
	public final boolean GL_NV_shader_atomic_float64;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/shader_atomic_fp16_vector.txt">NV_shader_atomic_fp16_vector</a> extension is supported.
	 * 
	 * <p>This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform a limited set of atomic read-modify-write operations
	 * to buffer or texture memory with 16-bit floating point vector surface formats.</p>
	 * 
	 * <p>Requires {@link #GL_NV_gpu_shader5 NV_gpu_shader5}.</p>
	 */
	public final boolean GL_NV_shader_atomic_fp16_vector;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/shader_atomic_int64.txt">NV_shader_atomic_int64</a> extension is supported.
	 * 
	 * <p>This extension provides additional GLSL built-in functions and assembly opcodes allowing shaders to perform additional atomic read-modify-write
	 * operations on 64-bit signed and unsigned integers stored in buffer object memory.</p>
	 */
	public final boolean GL_NV_shader_atomic_int64;
	/** When true, {@link NVShaderBufferLoad} is supported. */
	public final boolean GL_NV_shader_buffer_load;
	/** When true, {@link NVShaderBufferStore} is supported. */
	public final boolean GL_NV_shader_buffer_store;
	/** When true, {@link NVShaderThreadGroup} is supported. */
	public final boolean GL_NV_shader_thread_group;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/shader_thread_shuffle.txt">NV_shader_thread_shuffle</a> extension is supported.
	 * 
	 * <p>Implementations of the OpenGL Shading Language may, but are not required, to run multiple shader threads for a single stage as a SIMD thread group,
	 * where individual execution threads are assigned to thread groups in an undefined, implementation-dependent order.  This extension provides a set of
	 * new features to the OpenGL Shading Language to share data between multiple threads within a thread group.</p>
	 * 
	 * <p>Requires {@link GL43 OpenGL 4.3} and GLSL 4.3.</p>
	 */
	public final boolean GL_NV_shader_thread_shuffle;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/stereo_view_rendering.txt">NV_stereo_view_rendering</a> extension is supported.
	 * 
	 * <p>Virtual reality (VR) applications often render a single logical scene from multiple views corresponding to a pair of eyes. The views (eyes) are
	 * separated by a fixed offset in the X direction.</p>
	 * 
	 * <p>Traditionally, multiple views are rendered via multiple rendering passes. This is expensive for the GPU because the objects in the scene must be
	 * transformed, rasterized, shaded, and fragment processed redundantly. This is expensive for the CPU because the scene graph needs to be visited multiple
	 * times and driver validation happens for each view. Rendering N passes tends to take N times longer than a single pass.</p>
	 * 
	 * <p>This extension provides a mechanism to render binocular (stereo) views from a single stream of OpenGL rendering commands. Vertex, tessellation, and
	 * geometry (VTG) shaders can output two positions for each vertex corresponding to the two eye views. A built-in "gl_SecondaryPositionNV" is added to
	 * specify the second position. The positions from each view may be sent to different viewports and/or layers. A built-in "gl_SecondaryViewportMaskNV[]"
	 * is also added to specify the viewport mask for the second view. A new layout-qualifier "secondary_view_offset" is added for built-in output "gl_Layer"
	 * which allows for the geometry from each view to be sent to different layers for rendering.</p>
	 * 
	 * <p>Requires {@link \#GL_NV_viewport_array2 NV_viewport_array2}.</p>
	 */
	public final boolean GL_NV_stereo_view_rendering;
	/** When true, {@link NVTexgenReflection} is supported. */
	public final boolean GL_NV_texgen_reflection;
	/** When true, {@link NVTextureBarrier} is supported. */
	public final boolean GL_NV_texture_barrier;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/texture_compression_vtc.txt">NV_texture_compression_vtc</a> extension is supported.
	 * 
	 * <p>This extension adds support for the VTC 3D texture compression formats, which are analogous to the S3TC texture compression formats, with the addition
	 * of some retiling in the Z direction. VTC has the same compression ratio as S3TC and uses 4x4x1, 4x4x2, (4x4x3 when non-power-of-two textures are
	 * supported), or 4x4x4 blocks.</p>
	 */
	public final boolean GL_NV_texture_compression_vtc;
	/** When true, {@link NVTextureMultisample} is supported. */
	public final boolean GL_NV_texture_multisample;
	/** When true, {@link NVTransformFeedback} is supported. */
	public final boolean GL_NV_transform_feedback;
	/** When true, {@link NVTransformFeedback2} is supported. */
	public final boolean GL_NV_transform_feedback2;
	/** When true, {@link NVUniformBufferUnifiedMemory} is supported. */
	public final boolean GL_NV_uniform_buffer_unified_memory;
	/** When true, {@link NVVertexArrayRange} is supported. */
	public final boolean GL_NV_vertex_array_range;
	/** When true, {@link NVVertexArrayRange2} is supported. */
	public final boolean GL_NV_vertex_array_range2;
	/** When true, {@link NVVertexAttribInteger64bit} is supported. */
	public final boolean GL_NV_vertex_attrib_integer_64bit;
	/** When true, {@link NVVertexBufferUnifiedMemory} is supported. */
	public final boolean GL_NV_vertex_buffer_unified_memory;
	/**
	 * This extension provides new support allowing a single primitive to be broadcast to multiple viewports and/or multiple layers. A shader output
	 * gl_ViewportMask[] is provided, allowing a single primitive to be output to multiple viewports simultaneously. Also, a new shader option is provided to
	 * control whether the effective viewport index is added into gl_Layer. These capabilities allow a single primitive to be output to multiple layers
	 * simultaneously.
	 * 
	 * <p>The gl_ViewportMask[] output is available in vertex, tessellation control, tessellation evaluation, and geometry shaders. gl_ViewportIndex and gl_Layer
	 * are also made available in all these shader stages. The actual viewport index or mask and render target layer values are taken from the last active
	 * shader stage from this set of stages.</p>
	 * 
	 * <p>This extension is a superset of the GL_AMD_vertex_shader_layer and GL_AMD_vertex_shader_viewport_index extensions, and thus those extension strings are
	 * expected to be exported if GL_NV_viewport_array2 is supported.</p>
	 */
	public final boolean GL_NV_viewport_array2;
	/** When true, {@link NVViewportSwizzle} is supported. */
	public final boolean GL_NV_viewport_swizzle;
	/** When true, {@link NVXConditionalRender} is supported. */
	public final boolean GL_NVX_conditional_render;
	/** When true, {@link NVXGPUMemoryInfo} is supported. */
	public final boolean GL_NVX_gpu_memory_info;
	/** When true, {@link OVRMultiview} is supported. */
	public final boolean GL_OVR_multiview;
	/**
	 * Native bindings to the <a href="http://www.opengl.org/registry/specs/OVR/multiview2.txt">OVR_multiview2</a> extension.
	 * 
	 * <p>This extension relaxes the restriction in OVR_multiview that only {@code gl_Position} can depend on {@code ViewID} in the vertex shader.  With this
	 * change, view-dependent outputs like reflection vectors and similar are allowed.</p>
	 * 
	 * <p>Requires {@link GL30 OpenGL 3.0} and {@link OVRMultiview OVR_multiview}.</p>
	 */
	public final boolean GL_OVR_multiview2;

	/** When true, deprecated functions are not available. */
	public final boolean forwardCompatible;

	GLCapabilities(FunctionProvider provider, Set<String> ext, boolean fc) {
		forwardCompatible = fc;

		glAccum = getFunctionAddress(fc, provider, "glAccum");
		glActiveProgramEXT = provider.getFunctionAddress("glActiveProgramEXT");
		glActiveShaderProgram = provider.getFunctionAddress("glActiveShaderProgram");
		glActiveStencilFaceEXT = provider.getFunctionAddress("glActiveStencilFaceEXT");
		glActiveTexture = provider.getFunctionAddress("glActiveTexture");
		glActiveTextureARB = provider.getFunctionAddress("glActiveTextureARB");
		glActiveVaryingNV = provider.getFunctionAddress("glActiveVaryingNV");
		glAlphaFunc = getFunctionAddress(fc, provider, "glAlphaFunc");
		glApplyFramebufferAttachmentCMAAINTEL = provider.getFunctionAddress("glApplyFramebufferAttachmentCMAAINTEL");
		glAreTexturesResident = getFunctionAddress(fc, provider, "glAreTexturesResident");
		glArrayElement = provider.getFunctionAddress("glArrayElement");
		glAttachObjectARB = provider.getFunctionAddress("glAttachObjectARB");
		glAttachShader = provider.getFunctionAddress("glAttachShader");
		glBegin = getFunctionAddress(fc, provider, "glBegin");
		glBeginConditionalRender = provider.getFunctionAddress("glBeginConditionalRender");
		glBeginConditionalRenderNV = provider.getFunctionAddress("glBeginConditionalRenderNV");
		glBeginConditionalRenderNVX = provider.getFunctionAddress("glBeginConditionalRenderNVX");
		glBeginPerfMonitorAMD = provider.getFunctionAddress("glBeginPerfMonitorAMD");
		glBeginPerfQueryINTEL = provider.getFunctionAddress("glBeginPerfQueryINTEL");
		glBeginQuery = provider.getFunctionAddress("glBeginQuery");
		glBeginQueryARB = provider.getFunctionAddress("glBeginQueryARB");
		glBeginQueryIndexed = provider.getFunctionAddress("glBeginQueryIndexed");
		glBeginTransformFeedback = provider.getFunctionAddress("glBeginTransformFeedback");
		glBeginTransformFeedbackEXT = provider.getFunctionAddress("glBeginTransformFeedbackEXT");
		glBeginTransformFeedbackNV = provider.getFunctionAddress("glBeginTransformFeedbackNV");
		glBindAttribLocation = provider.getFunctionAddress("glBindAttribLocation");
		glBindAttribLocationARB = provider.getFunctionAddress("glBindAttribLocationARB");
		glBindBuffer = provider.getFunctionAddress("glBindBuffer");
		glBindBufferARB = provider.getFunctionAddress("glBindBufferARB");
		glBindBufferBase = provider.getFunctionAddress("glBindBufferBase");
		glBindBufferBaseEXT = provider.getFunctionAddress("glBindBufferBaseEXT");
		glBindBufferBaseNV = provider.getFunctionAddress("glBindBufferBaseNV");
		glBindBufferOffsetEXT = provider.getFunctionAddress("glBindBufferOffsetEXT");
		glBindBufferOffsetNV = provider.getFunctionAddress("glBindBufferOffsetNV");
		glBindBufferRange = provider.getFunctionAddress("glBindBufferRange");
		glBindBufferRangeEXT = provider.getFunctionAddress("glBindBufferRangeEXT");
		glBindBufferRangeNV = provider.getFunctionAddress("glBindBufferRangeNV");
		glBindBuffersBase = provider.getFunctionAddress("glBindBuffersBase");
		glBindBuffersRange = provider.getFunctionAddress("glBindBuffersRange");
		glBindFragDataLocation = provider.getFunctionAddress("glBindFragDataLocation");
		glBindFragDataLocationEXT = provider.getFunctionAddress("glBindFragDataLocationEXT");
		glBindFragDataLocationIndexed = provider.getFunctionAddress("glBindFragDataLocationIndexed");
		glBindFramebuffer = provider.getFunctionAddress("glBindFramebuffer");
		glBindFramebufferEXT = provider.getFunctionAddress("glBindFramebufferEXT");
		glBindImageTexture = provider.getFunctionAddress("glBindImageTexture");
		glBindImageTextureEXT = provider.getFunctionAddress("glBindImageTextureEXT");
		glBindImageTextures = provider.getFunctionAddress("glBindImageTextures");
		glBindMultiTextureEXT = provider.getFunctionAddress("glBindMultiTextureEXT");
		glBindProgramARB = provider.getFunctionAddress("glBindProgramARB");
		glBindProgramPipeline = provider.getFunctionAddress("glBindProgramPipeline");
		glBindRenderbuffer = provider.getFunctionAddress("glBindRenderbuffer");
		glBindRenderbufferEXT = provider.getFunctionAddress("glBindRenderbufferEXT");
		glBindSampler = provider.getFunctionAddress("glBindSampler");
		glBindSamplers = provider.getFunctionAddress("glBindSamplers");
		glBindTexture = provider.getFunctionAddress("glBindTexture");
		glBindTextureUnit = provider.getFunctionAddress("glBindTextureUnit");
		glBindTextures = provider.getFunctionAddress("glBindTextures");
		glBindTransformFeedback = provider.getFunctionAddress("glBindTransformFeedback");
		glBindTransformFeedbackNV = provider.getFunctionAddress("glBindTransformFeedbackNV");
		glBindVertexArray = provider.getFunctionAddress("glBindVertexArray");
		glBindVertexBuffer = provider.getFunctionAddress("glBindVertexBuffer");
		glBindVertexBuffers = provider.getFunctionAddress("glBindVertexBuffers");
		glBitmap = getFunctionAddress(fc, provider, "glBitmap");
		glBlendBarrierKHR = provider.getFunctionAddress("glBlendBarrierKHR");
		glBlendBarrierNV = provider.getFunctionAddress("glBlendBarrierNV");
		glBlendColor = provider.getFunctionAddress("glBlendColor");
		glBlendColorEXT = provider.getFunctionAddress("glBlendColorEXT");
		glBlendEquation = provider.getFunctionAddress("glBlendEquation");
		glBlendEquationEXT = provider.getFunctionAddress("glBlendEquationEXT");
		glBlendEquationIndexedAMD = provider.getFunctionAddress("glBlendEquationIndexedAMD");
		glBlendEquationSeparate = provider.getFunctionAddress("glBlendEquationSeparate");
		glBlendEquationSeparateEXT = provider.getFunctionAddress("glBlendEquationSeparateEXT");
		glBlendEquationSeparateIndexedAMD = provider.getFunctionAddress("glBlendEquationSeparateIndexedAMD");
		glBlendEquationSeparatei = provider.getFunctionAddress("glBlendEquationSeparatei");
		glBlendEquationSeparateiARB = provider.getFunctionAddress("glBlendEquationSeparateiARB");
		glBlendEquationi = provider.getFunctionAddress("glBlendEquationi");
		glBlendEquationiARB = provider.getFunctionAddress("glBlendEquationiARB");
		glBlendFunc = provider.getFunctionAddress("glBlendFunc");
		glBlendFuncIndexedAMD = provider.getFunctionAddress("glBlendFuncIndexedAMD");
		glBlendFuncSeparate = provider.getFunctionAddress("glBlendFuncSeparate");
		glBlendFuncSeparateEXT = provider.getFunctionAddress("glBlendFuncSeparateEXT");
		glBlendFuncSeparateIndexedAMD = provider.getFunctionAddress("glBlendFuncSeparateIndexedAMD");
		glBlendFuncSeparatei = provider.getFunctionAddress("glBlendFuncSeparatei");
		glBlendFuncSeparateiARB = provider.getFunctionAddress("glBlendFuncSeparateiARB");
		glBlendFunci = provider.getFunctionAddress("glBlendFunci");
		glBlendFunciARB = provider.getFunctionAddress("glBlendFunciARB");
		glBlendParameteriNV = provider.getFunctionAddress("glBlendParameteriNV");
		glBlitFramebuffer = provider.getFunctionAddress("glBlitFramebuffer");
		glBlitFramebufferEXT = provider.getFunctionAddress("glBlitFramebufferEXT");
		glBlitNamedFramebuffer = provider.getFunctionAddress("glBlitNamedFramebuffer");
		glBufferAddressRangeNV = provider.getFunctionAddress("glBufferAddressRangeNV");
		glBufferData = provider.getFunctionAddress("glBufferData");
		glBufferDataARB = provider.getFunctionAddress("glBufferDataARB");
		glBufferPageCommitmentARB = provider.getFunctionAddress("glBufferPageCommitmentARB");
		glBufferStorage = provider.getFunctionAddress("glBufferStorage");
		glBufferSubData = provider.getFunctionAddress("glBufferSubData");
		glBufferSubDataARB = provider.getFunctionAddress("glBufferSubDataARB");
		glCallCommandListNV = provider.getFunctionAddress("glCallCommandListNV");
		glCallList = getFunctionAddress(fc, provider, "glCallList");
		glCallLists = getFunctionAddress(fc, provider, "glCallLists");
		glCheckFramebufferStatus = provider.getFunctionAddress("glCheckFramebufferStatus");
		glCheckFramebufferStatusEXT = provider.getFunctionAddress("glCheckFramebufferStatusEXT");
		glCheckNamedFramebufferStatus = provider.getFunctionAddress("glCheckNamedFramebufferStatus");
		glCheckNamedFramebufferStatusEXT = provider.getFunctionAddress("glCheckNamedFramebufferStatusEXT");
		glClampColor = provider.getFunctionAddress("glClampColor");
		glClampColorARB = provider.getFunctionAddress("glClampColorARB");
		glClear = provider.getFunctionAddress("glClear");
		glClearAccum = getFunctionAddress(fc, provider, "glClearAccum");
		glClearBufferData = provider.getFunctionAddress("glClearBufferData");
		glClearBufferSubData = provider.getFunctionAddress("glClearBufferSubData");
		glClearBufferfi = provider.getFunctionAddress("glClearBufferfi");
		glClearBufferfv = provider.getFunctionAddress("glClearBufferfv");
		glClearBufferiv = provider.getFunctionAddress("glClearBufferiv");
		glClearBufferuiv = provider.getFunctionAddress("glClearBufferuiv");
		glClearColor = provider.getFunctionAddress("glClearColor");
		glClearColorIiEXT = provider.getFunctionAddress("glClearColorIiEXT");
		glClearColorIuiEXT = provider.getFunctionAddress("glClearColorIuiEXT");
		glClearDepth = provider.getFunctionAddress("glClearDepth");
		glClearDepthdNV = provider.getFunctionAddress("glClearDepthdNV");
		glClearDepthf = provider.getFunctionAddress("glClearDepthf");
		glClearIndex = getFunctionAddress(fc, provider, "glClearIndex");
		glClearNamedBufferData = provider.getFunctionAddress("glClearNamedBufferData");
		glClearNamedBufferDataEXT = provider.getFunctionAddress("glClearNamedBufferDataEXT");
		glClearNamedBufferSubData = provider.getFunctionAddress("glClearNamedBufferSubData");
		glClearNamedBufferSubDataEXT = provider.getFunctionAddress("glClearNamedBufferSubDataEXT");
		glClearNamedFramebufferfi = provider.getFunctionAddress("glClearNamedFramebufferfi");
		glClearNamedFramebufferfv = provider.getFunctionAddress("glClearNamedFramebufferfv");
		glClearNamedFramebufferiv = provider.getFunctionAddress("glClearNamedFramebufferiv");
		glClearNamedFramebufferuiv = provider.getFunctionAddress("glClearNamedFramebufferuiv");
		glClearStencil = provider.getFunctionAddress("glClearStencil");
		glClearTexImage = provider.getFunctionAddress("glClearTexImage");
		glClearTexSubImage = provider.getFunctionAddress("glClearTexSubImage");
		glClientActiveTexture = getFunctionAddress(fc, provider, "glClientActiveTexture");
		glClientActiveTextureARB = provider.getFunctionAddress("glClientActiveTextureARB");
		glClientAttribDefaultEXT = provider.getFunctionAddress("glClientAttribDefaultEXT");
		glClientWaitSync = provider.getFunctionAddress("glClientWaitSync");
		glClipControl = provider.getFunctionAddress("glClipControl");
		glClipPlane = provider.getFunctionAddress("glClipPlane");
		glColor3b = getFunctionAddress(fc, provider, "glColor3b");
		glColor3bv = getFunctionAddress(fc, provider, "glColor3bv");
		glColor3d = getFunctionAddress(fc, provider, "glColor3d");
		glColor3dv = getFunctionAddress(fc, provider, "glColor3dv");
		glColor3f = getFunctionAddress(fc, provider, "glColor3f");
		glColor3fv = getFunctionAddress(fc, provider, "glColor3fv");
		glColor3hNV = provider.getFunctionAddress("glColor3hNV");
		glColor3hvNV = provider.getFunctionAddress("glColor3hvNV");
		glColor3i = getFunctionAddress(fc, provider, "glColor3i");
		glColor3iv = getFunctionAddress(fc, provider, "glColor3iv");
		glColor3s = getFunctionAddress(fc, provider, "glColor3s");
		glColor3sv = getFunctionAddress(fc, provider, "glColor3sv");
		glColor3ub = getFunctionAddress(fc, provider, "glColor3ub");
		glColor3ubv = getFunctionAddress(fc, provider, "glColor3ubv");
		glColor3ui = getFunctionAddress(fc, provider, "glColor3ui");
		glColor3uiv = getFunctionAddress(fc, provider, "glColor3uiv");
		glColor3us = getFunctionAddress(fc, provider, "glColor3us");
		glColor3usv = getFunctionAddress(fc, provider, "glColor3usv");
		glColor4b = getFunctionAddress(fc, provider, "glColor4b");
		glColor4bv = getFunctionAddress(fc, provider, "glColor4bv");
		glColor4d = getFunctionAddress(fc, provider, "glColor4d");
		glColor4dv = getFunctionAddress(fc, provider, "glColor4dv");
		glColor4f = getFunctionAddress(fc, provider, "glColor4f");
		glColor4fv = getFunctionAddress(fc, provider, "glColor4fv");
		glColor4hNV = provider.getFunctionAddress("glColor4hNV");
		glColor4hvNV = provider.getFunctionAddress("glColor4hvNV");
		glColor4i = getFunctionAddress(fc, provider, "glColor4i");
		glColor4iv = getFunctionAddress(fc, provider, "glColor4iv");
		glColor4s = getFunctionAddress(fc, provider, "glColor4s");
		glColor4sv = getFunctionAddress(fc, provider, "glColor4sv");
		glColor4ub = getFunctionAddress(fc, provider, "glColor4ub");
		glColor4ubv = getFunctionAddress(fc, provider, "glColor4ubv");
		glColor4ui = getFunctionAddress(fc, provider, "glColor4ui");
		glColor4uiv = getFunctionAddress(fc, provider, "glColor4uiv");
		glColor4us = getFunctionAddress(fc, provider, "glColor4us");
		glColor4usv = getFunctionAddress(fc, provider, "glColor4usv");
		glColorFormatNV = provider.getFunctionAddress("glColorFormatNV");
		glColorMask = provider.getFunctionAddress("glColorMask");
		glColorMaskIndexedEXT = provider.getFunctionAddress("glColorMaskIndexedEXT");
		glColorMaski = provider.getFunctionAddress("glColorMaski");
		glColorMaterial = getFunctionAddress(fc, provider, "glColorMaterial");
		glColorP3ui = getFunctionAddress(fc, provider, "glColorP3ui");
		glColorP3uiv = getFunctionAddress(fc, provider, "glColorP3uiv");
		glColorP4ui = getFunctionAddress(fc, provider, "glColorP4ui");
		glColorP4uiv = getFunctionAddress(fc, provider, "glColorP4uiv");
		glColorPointer = getFunctionAddress(fc, provider, "glColorPointer");
		glColorSubTable = getFunctionAddress(fc, provider, "glColorSubTable");
		glColorTable = getFunctionAddress(fc, provider, "glColorTable");
		glColorTableParameterfv = getFunctionAddress(fc, provider, "glColorTableParameterfv");
		glColorTableParameteriv = getFunctionAddress(fc, provider, "glColorTableParameteriv");
		glCommandListSegmentsNV = provider.getFunctionAddress("glCommandListSegmentsNV");
		glCompileCommandListNV = provider.getFunctionAddress("glCompileCommandListNV");
		glCompileShader = provider.getFunctionAddress("glCompileShader");
		glCompileShaderARB = provider.getFunctionAddress("glCompileShaderARB");
		glCompileShaderIncludeARB = provider.getFunctionAddress("glCompileShaderIncludeARB");
		glCompressedMultiTexImage1DEXT = provider.getFunctionAddress("glCompressedMultiTexImage1DEXT");
		glCompressedMultiTexImage2DEXT = provider.getFunctionAddress("glCompressedMultiTexImage2DEXT");
		glCompressedMultiTexImage3DEXT = provider.getFunctionAddress("glCompressedMultiTexImage3DEXT");
		glCompressedMultiTexSubImage1DEXT = provider.getFunctionAddress("glCompressedMultiTexSubImage1DEXT");
		glCompressedMultiTexSubImage2DEXT = provider.getFunctionAddress("glCompressedMultiTexSubImage2DEXT");
		glCompressedMultiTexSubImage3DEXT = provider.getFunctionAddress("glCompressedMultiTexSubImage3DEXT");
		glCompressedTexImage1D = provider.getFunctionAddress("glCompressedTexImage1D");
		glCompressedTexImage1DARB = provider.getFunctionAddress("glCompressedTexImage1DARB");
		glCompressedTexImage2D = provider.getFunctionAddress("glCompressedTexImage2D");
		glCompressedTexImage2DARB = provider.getFunctionAddress("glCompressedTexImage2DARB");
		glCompressedTexImage3D = provider.getFunctionAddress("glCompressedTexImage3D");
		glCompressedTexImage3DARB = provider.getFunctionAddress("glCompressedTexImage3DARB");
		glCompressedTexSubImage1D = provider.getFunctionAddress("glCompressedTexSubImage1D");
		glCompressedTexSubImage1DARB = provider.getFunctionAddress("glCompressedTexSubImage1DARB");
		glCompressedTexSubImage2D = provider.getFunctionAddress("glCompressedTexSubImage2D");
		glCompressedTexSubImage2DARB = provider.getFunctionAddress("glCompressedTexSubImage2DARB");
		glCompressedTexSubImage3D = provider.getFunctionAddress("glCompressedTexSubImage3D");
		glCompressedTexSubImage3DARB = provider.getFunctionAddress("glCompressedTexSubImage3DARB");
		glCompressedTextureImage1DEXT = provider.getFunctionAddress("glCompressedTextureImage1DEXT");
		glCompressedTextureImage2DEXT = provider.getFunctionAddress("glCompressedTextureImage2DEXT");
		glCompressedTextureImage3DEXT = provider.getFunctionAddress("glCompressedTextureImage3DEXT");
		glCompressedTextureSubImage1D = provider.getFunctionAddress("glCompressedTextureSubImage1D");
		glCompressedTextureSubImage1DEXT = provider.getFunctionAddress("glCompressedTextureSubImage1DEXT");
		glCompressedTextureSubImage2D = provider.getFunctionAddress("glCompressedTextureSubImage2D");
		glCompressedTextureSubImage2DEXT = provider.getFunctionAddress("glCompressedTextureSubImage2DEXT");
		glCompressedTextureSubImage3D = provider.getFunctionAddress("glCompressedTextureSubImage3D");
		glCompressedTextureSubImage3DEXT = provider.getFunctionAddress("glCompressedTextureSubImage3DEXT");
		glConservativeRasterParameterfNV = provider.getFunctionAddress("glConservativeRasterParameterfNV");
		glConservativeRasterParameteriNV = provider.getFunctionAddress("glConservativeRasterParameteriNV");
		glConvolutionFilter1D = getFunctionAddress(fc, provider, "glConvolutionFilter1D");
		glConvolutionFilter2D = getFunctionAddress(fc, provider, "glConvolutionFilter2D");
		glConvolutionParameterf = getFunctionAddress(fc, provider, "glConvolutionParameterf");
		glConvolutionParameterfv = getFunctionAddress(fc, provider, "glConvolutionParameterfv");
		glConvolutionParameteri = getFunctionAddress(fc, provider, "glConvolutionParameteri");
		glConvolutionParameteriv = getFunctionAddress(fc, provider, "glConvolutionParameteriv");
		glCopyBufferSubData = provider.getFunctionAddress("glCopyBufferSubData");
		glCopyColorSubTable = getFunctionAddress(fc, provider, "glCopyColorSubTable");
		glCopyColorTable = getFunctionAddress(fc, provider, "glCopyColorTable");
		glCopyConvolutionFilter1D = getFunctionAddress(fc, provider, "glCopyConvolutionFilter1D");
		glCopyConvolutionFilter2D = getFunctionAddress(fc, provider, "glCopyConvolutionFilter2D");
		glCopyImageSubData = provider.getFunctionAddress("glCopyImageSubData");
		glCopyImageSubDataNV = provider.getFunctionAddress("glCopyImageSubDataNV");
		glCopyMultiTexImage1DEXT = provider.getFunctionAddress("glCopyMultiTexImage1DEXT");
		glCopyMultiTexImage2DEXT = provider.getFunctionAddress("glCopyMultiTexImage2DEXT");
		glCopyMultiTexSubImage1DEXT = provider.getFunctionAddress("glCopyMultiTexSubImage1DEXT");
		glCopyMultiTexSubImage2DEXT = provider.getFunctionAddress("glCopyMultiTexSubImage2DEXT");
		glCopyMultiTexSubImage3DEXT = provider.getFunctionAddress("glCopyMultiTexSubImage3DEXT");
		glCopyNamedBufferSubData = provider.getFunctionAddress("glCopyNamedBufferSubData");
		glCopyPathNV = provider.getFunctionAddress("glCopyPathNV");
		glCopyPixels = provider.getFunctionAddress("glCopyPixels");
		glCopyTexImage1D = provider.getFunctionAddress("glCopyTexImage1D");
		glCopyTexImage2D = provider.getFunctionAddress("glCopyTexImage2D");
		glCopyTexSubImage1D = provider.getFunctionAddress("glCopyTexSubImage1D");
		glCopyTexSubImage2D = provider.getFunctionAddress("glCopyTexSubImage2D");
		glCopyTexSubImage3D = provider.getFunctionAddress("glCopyTexSubImage3D");
		glCopyTextureImage1DEXT = provider.getFunctionAddress("glCopyTextureImage1DEXT");
		glCopyTextureImage2DEXT = provider.getFunctionAddress("glCopyTextureImage2DEXT");
		glCopyTextureSubImage1D = provider.getFunctionAddress("glCopyTextureSubImage1D");
		glCopyTextureSubImage1DEXT = provider.getFunctionAddress("glCopyTextureSubImage1DEXT");
		glCopyTextureSubImage2D = provider.getFunctionAddress("glCopyTextureSubImage2D");
		glCopyTextureSubImage2DEXT = provider.getFunctionAddress("glCopyTextureSubImage2DEXT");
		glCopyTextureSubImage3D = provider.getFunctionAddress("glCopyTextureSubImage3D");
		glCopyTextureSubImage3DEXT = provider.getFunctionAddress("glCopyTextureSubImage3DEXT");
		glCoverFillPathInstancedNV = provider.getFunctionAddress("glCoverFillPathInstancedNV");
		glCoverFillPathNV = provider.getFunctionAddress("glCoverFillPathNV");
		glCoverStrokePathInstancedNV = provider.getFunctionAddress("glCoverStrokePathInstancedNV");
		glCoverStrokePathNV = provider.getFunctionAddress("glCoverStrokePathNV");
		glCoverageModulationNV = provider.getFunctionAddress("glCoverageModulationNV");
		glCoverageModulationTableNV = provider.getFunctionAddress("glCoverageModulationTableNV");
		glCreateBuffers = provider.getFunctionAddress("glCreateBuffers");
		glCreateCommandListsNV = provider.getFunctionAddress("glCreateCommandListsNV");
		glCreateFramebuffers = provider.getFunctionAddress("glCreateFramebuffers");
		glCreatePerfQueryINTEL = provider.getFunctionAddress("glCreatePerfQueryINTEL");
		glCreateProgram = provider.getFunctionAddress("glCreateProgram");
		glCreateProgramObjectARB = provider.getFunctionAddress("glCreateProgramObjectARB");
		glCreateProgramPipelines = provider.getFunctionAddress("glCreateProgramPipelines");
		glCreateQueries = provider.getFunctionAddress("glCreateQueries");
		glCreateRenderbuffers = provider.getFunctionAddress("glCreateRenderbuffers");
		glCreateSamplers = provider.getFunctionAddress("glCreateSamplers");
		glCreateShader = provider.getFunctionAddress("glCreateShader");
		glCreateShaderObjectARB = provider.getFunctionAddress("glCreateShaderObjectARB");
		glCreateShaderProgramEXT = provider.getFunctionAddress("glCreateShaderProgramEXT");
		glCreateShaderProgramv = provider.getFunctionAddress("glCreateShaderProgramv");
		glCreateStatesNV = provider.getFunctionAddress("glCreateStatesNV");
		glCreateSyncFromCLeventARB = provider.getFunctionAddress("glCreateSyncFromCLeventARB");
		glCreateTextures = provider.getFunctionAddress("glCreateTextures");
		glCreateTransformFeedbacks = provider.getFunctionAddress("glCreateTransformFeedbacks");
		glCreateVertexArrays = provider.getFunctionAddress("glCreateVertexArrays");
		glCullFace = provider.getFunctionAddress("glCullFace");
		glCurrentPaletteMatrixARB = provider.getFunctionAddress("glCurrentPaletteMatrixARB");
		glDebugMessageCallback = provider.getFunctionAddress("glDebugMessageCallback");
		glDebugMessageCallbackAMD = provider.getFunctionAddress("glDebugMessageCallbackAMD");
		glDebugMessageCallbackARB = provider.getFunctionAddress("glDebugMessageCallbackARB");
		glDebugMessageControl = provider.getFunctionAddress("glDebugMessageControl");
		glDebugMessageControlARB = provider.getFunctionAddress("glDebugMessageControlARB");
		glDebugMessageEnableAMD = provider.getFunctionAddress("glDebugMessageEnableAMD");
		glDebugMessageInsert = provider.getFunctionAddress("glDebugMessageInsert");
		glDebugMessageInsertAMD = provider.getFunctionAddress("glDebugMessageInsertAMD");
		glDebugMessageInsertARB = provider.getFunctionAddress("glDebugMessageInsertARB");
		glDeleteBuffers = provider.getFunctionAddress("glDeleteBuffers");
		glDeleteBuffersARB = provider.getFunctionAddress("glDeleteBuffersARB");
		glDeleteCommandListsNV = provider.getFunctionAddress("glDeleteCommandListsNV");
		glDeleteFencesNV = provider.getFunctionAddress("glDeleteFencesNV");
		glDeleteFramebuffers = provider.getFunctionAddress("glDeleteFramebuffers");
		glDeleteFramebuffersEXT = provider.getFunctionAddress("glDeleteFramebuffersEXT");
		glDeleteLists = getFunctionAddress(fc, provider, "glDeleteLists");
		glDeleteNamedStringARB = provider.getFunctionAddress("glDeleteNamedStringARB");
		glDeleteObjectARB = provider.getFunctionAddress("glDeleteObjectARB");
		glDeletePathsNV = provider.getFunctionAddress("glDeletePathsNV");
		glDeletePerfMonitorsAMD = provider.getFunctionAddress("glDeletePerfMonitorsAMD");
		glDeletePerfQueryINTEL = provider.getFunctionAddress("glDeletePerfQueryINTEL");
		glDeleteProgram = provider.getFunctionAddress("glDeleteProgram");
		glDeleteProgramPipelines = provider.getFunctionAddress("glDeleteProgramPipelines");
		glDeleteProgramsARB = provider.getFunctionAddress("glDeleteProgramsARB");
		glDeleteQueries = provider.getFunctionAddress("glDeleteQueries");
		glDeleteQueriesARB = provider.getFunctionAddress("glDeleteQueriesARB");
		glDeleteRenderbuffers = provider.getFunctionAddress("glDeleteRenderbuffers");
		glDeleteRenderbuffersEXT = provider.getFunctionAddress("glDeleteRenderbuffersEXT");
		glDeleteSamplers = provider.getFunctionAddress("glDeleteSamplers");
		glDeleteShader = provider.getFunctionAddress("glDeleteShader");
		glDeleteStatesNV = provider.getFunctionAddress("glDeleteStatesNV");
		glDeleteSync = provider.getFunctionAddress("glDeleteSync");
		glDeleteTextures = provider.getFunctionAddress("glDeleteTextures");
		glDeleteTransformFeedbacks = provider.getFunctionAddress("glDeleteTransformFeedbacks");
		glDeleteTransformFeedbacksNV = provider.getFunctionAddress("glDeleteTransformFeedbacksNV");
		glDeleteVertexArrays = provider.getFunctionAddress("glDeleteVertexArrays");
		glDepthBoundsEXT = provider.getFunctionAddress("glDepthBoundsEXT");
		glDepthBoundsdNV = provider.getFunctionAddress("glDepthBoundsdNV");
		glDepthFunc = provider.getFunctionAddress("glDepthFunc");
		glDepthMask = provider.getFunctionAddress("glDepthMask");
		glDepthRange = provider.getFunctionAddress("glDepthRange");
		glDepthRangeArrayv = provider.getFunctionAddress("glDepthRangeArrayv");
		glDepthRangeIndexed = provider.getFunctionAddress("glDepthRangeIndexed");
		glDepthRangedNV = provider.getFunctionAddress("glDepthRangedNV");
		glDepthRangef = provider.getFunctionAddress("glDepthRangef");
		glDetachObjectARB = provider.getFunctionAddress("glDetachObjectARB");
		glDetachShader = provider.getFunctionAddress("glDetachShader");
		glDisable = provider.getFunctionAddress("glDisable");
		glDisableClientState = getFunctionAddress(fc, provider, "glDisableClientState");
		glDisableClientStateIndexedEXT = provider.getFunctionAddress("glDisableClientStateIndexedEXT");
		glDisableClientStateiEXT = provider.getFunctionAddress("glDisableClientStateiEXT");
		glDisableIndexedEXT = provider.getFunctionAddress("glDisableIndexedEXT");
		glDisableVertexArrayAttrib = provider.getFunctionAddress("glDisableVertexArrayAttrib");
		glDisableVertexArrayAttribEXT = provider.getFunctionAddress("glDisableVertexArrayAttribEXT");
		glDisableVertexArrayEXT = provider.getFunctionAddress("glDisableVertexArrayEXT");
		glDisableVertexAttribArray = provider.getFunctionAddress("glDisableVertexAttribArray");
		glDisableVertexAttribArrayARB = provider.getFunctionAddress("glDisableVertexAttribArrayARB");
		glDisablei = provider.getFunctionAddress("glDisablei");
		glDispatchCompute = provider.getFunctionAddress("glDispatchCompute");
		glDispatchComputeGroupSizeARB = provider.getFunctionAddress("glDispatchComputeGroupSizeARB");
		glDispatchComputeIndirect = provider.getFunctionAddress("glDispatchComputeIndirect");
		glDrawArrays = provider.getFunctionAddress("glDrawArrays");
		glDrawArraysIndirect = provider.getFunctionAddress("glDrawArraysIndirect");
		glDrawArraysInstanced = provider.getFunctionAddress("glDrawArraysInstanced");
		glDrawArraysInstancedARB = provider.getFunctionAddress("glDrawArraysInstancedARB");
		glDrawArraysInstancedBaseInstance = provider.getFunctionAddress("glDrawArraysInstancedBaseInstance");
		glDrawArraysInstancedEXT = provider.getFunctionAddress("glDrawArraysInstancedEXT");
		glDrawBuffer = provider.getFunctionAddress("glDrawBuffer");
		glDrawBuffers = provider.getFunctionAddress("glDrawBuffers");
		glDrawBuffersARB = provider.getFunctionAddress("glDrawBuffersARB");
		glDrawCommandsAddressNV = provider.getFunctionAddress("glDrawCommandsAddressNV");
		glDrawCommandsNV = provider.getFunctionAddress("glDrawCommandsNV");
		glDrawCommandsStatesAddressNV = provider.getFunctionAddress("glDrawCommandsStatesAddressNV");
		glDrawCommandsStatesNV = provider.getFunctionAddress("glDrawCommandsStatesNV");
		glDrawElements = provider.getFunctionAddress("glDrawElements");
		glDrawElementsBaseVertex = provider.getFunctionAddress("glDrawElementsBaseVertex");
		glDrawElementsIndirect = provider.getFunctionAddress("glDrawElementsIndirect");
		glDrawElementsInstanced = provider.getFunctionAddress("glDrawElementsInstanced");
		glDrawElementsInstancedARB = provider.getFunctionAddress("glDrawElementsInstancedARB");
		glDrawElementsInstancedBaseInstance = provider.getFunctionAddress("glDrawElementsInstancedBaseInstance");
		glDrawElementsInstancedBaseVertex = provider.getFunctionAddress("glDrawElementsInstancedBaseVertex");
		glDrawElementsInstancedBaseVertexBaseInstance = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexBaseInstance");
		glDrawElementsInstancedEXT = provider.getFunctionAddress("glDrawElementsInstancedEXT");
		glDrawPixels = getFunctionAddress(fc, provider, "glDrawPixels");
		glDrawRangeElements = provider.getFunctionAddress("glDrawRangeElements");
		glDrawRangeElementsBaseVertex = provider.getFunctionAddress("glDrawRangeElementsBaseVertex");
		glDrawTextureNV = provider.getFunctionAddress("glDrawTextureNV");
		glDrawTransformFeedback = provider.getFunctionAddress("glDrawTransformFeedback");
		glDrawTransformFeedbackInstanced = provider.getFunctionAddress("glDrawTransformFeedbackInstanced");
		glDrawTransformFeedbackNV = provider.getFunctionAddress("glDrawTransformFeedbackNV");
		glDrawTransformFeedbackStream = provider.getFunctionAddress("glDrawTransformFeedbackStream");
		glDrawTransformFeedbackStreamInstanced = provider.getFunctionAddress("glDrawTransformFeedbackStreamInstanced");
		glDrawVkImageNV = provider.getFunctionAddress("glDrawVkImageNV");
		glEdgeFlag = getFunctionAddress(fc, provider, "glEdgeFlag");
		glEdgeFlagFormatNV = provider.getFunctionAddress("glEdgeFlagFormatNV");
		glEdgeFlagPointer = getFunctionAddress(fc, provider, "glEdgeFlagPointer");
		glEdgeFlagv = getFunctionAddress(fc, provider, "glEdgeFlagv");
		glEnable = provider.getFunctionAddress("glEnable");
		glEnableClientState = getFunctionAddress(fc, provider, "glEnableClientState");
		glEnableClientStateIndexedEXT = provider.getFunctionAddress("glEnableClientStateIndexedEXT");
		glEnableClientStateiEXT = provider.getFunctionAddress("glEnableClientStateiEXT");
		glEnableIndexedEXT = provider.getFunctionAddress("glEnableIndexedEXT");
		glEnableVertexArrayAttrib = provider.getFunctionAddress("glEnableVertexArrayAttrib");
		glEnableVertexArrayAttribEXT = provider.getFunctionAddress("glEnableVertexArrayAttribEXT");
		glEnableVertexArrayEXT = provider.getFunctionAddress("glEnableVertexArrayEXT");
		glEnableVertexAttribArray = provider.getFunctionAddress("glEnableVertexAttribArray");
		glEnableVertexAttribArrayARB = provider.getFunctionAddress("glEnableVertexAttribArrayARB");
		glEnablei = provider.getFunctionAddress("glEnablei");
		glEnd = getFunctionAddress(fc, provider, "glEnd");
		glEndConditionalRender = provider.getFunctionAddress("glEndConditionalRender");
		glEndConditionalRenderNV = provider.getFunctionAddress("glEndConditionalRenderNV");
		glEndConditionalRenderNVX = provider.getFunctionAddress("glEndConditionalRenderNVX");
		glEndList = getFunctionAddress(fc, provider, "glEndList");
		glEndPerfMonitorAMD = provider.getFunctionAddress("glEndPerfMonitorAMD");
		glEndPerfQueryINTEL = provider.getFunctionAddress("glEndPerfQueryINTEL");
		glEndQuery = provider.getFunctionAddress("glEndQuery");
		glEndQueryARB = provider.getFunctionAddress("glEndQueryARB");
		glEndQueryIndexed = provider.getFunctionAddress("glEndQueryIndexed");
		glEndTransformFeedback = provider.getFunctionAddress("glEndTransformFeedback");
		glEndTransformFeedbackEXT = provider.getFunctionAddress("glEndTransformFeedbackEXT");
		glEndTransformFeedbackNV = provider.getFunctionAddress("glEndTransformFeedbackNV");
		glEvalCoord1d = getFunctionAddress(fc, provider, "glEvalCoord1d");
		glEvalCoord1dv = getFunctionAddress(fc, provider, "glEvalCoord1dv");
		glEvalCoord1f = getFunctionAddress(fc, provider, "glEvalCoord1f");
		glEvalCoord1fv = getFunctionAddress(fc, provider, "glEvalCoord1fv");
		glEvalCoord2d = getFunctionAddress(fc, provider, "glEvalCoord2d");
		glEvalCoord2dv = getFunctionAddress(fc, provider, "glEvalCoord2dv");
		glEvalCoord2f = getFunctionAddress(fc, provider, "glEvalCoord2f");
		glEvalCoord2fv = getFunctionAddress(fc, provider, "glEvalCoord2fv");
		glEvalMesh1 = getFunctionAddress(fc, provider, "glEvalMesh1");
		glEvalMesh2 = getFunctionAddress(fc, provider, "glEvalMesh2");
		glEvalPoint1 = getFunctionAddress(fc, provider, "glEvalPoint1");
		glEvalPoint2 = getFunctionAddress(fc, provider, "glEvalPoint2");
		glEvaluateDepthValuesARB = provider.getFunctionAddress("glEvaluateDepthValuesARB");
		glFeedbackBuffer = getFunctionAddress(fc, provider, "glFeedbackBuffer");
		glFenceSync = provider.getFunctionAddress("glFenceSync");
		glFinish = provider.getFunctionAddress("glFinish");
		glFinishFenceNV = provider.getFunctionAddress("glFinishFenceNV");
		glFlush = provider.getFunctionAddress("glFlush");
		glFlushMappedBufferRange = provider.getFunctionAddress("glFlushMappedBufferRange");
		glFlushMappedNamedBufferRange = provider.getFunctionAddress("glFlushMappedNamedBufferRange");
		glFlushMappedNamedBufferRangeEXT = provider.getFunctionAddress("glFlushMappedNamedBufferRangeEXT");
		glFlushPixelDataRangeNV = provider.getFunctionAddress("glFlushPixelDataRangeNV");
		glFlushVertexArrayRangeNV = provider.getFunctionAddress("glFlushVertexArrayRangeNV");
		glFogCoordFormatNV = provider.getFunctionAddress("glFogCoordFormatNV");
		glFogCoordPointer = getFunctionAddress(fc, provider, "glFogCoordPointer");
		glFogCoordd = getFunctionAddress(fc, provider, "glFogCoordd");
		glFogCoorddv = getFunctionAddress(fc, provider, "glFogCoorddv");
		glFogCoordf = getFunctionAddress(fc, provider, "glFogCoordf");
		glFogCoordfv = getFunctionAddress(fc, provider, "glFogCoordfv");
		glFogCoordhNV = provider.getFunctionAddress("glFogCoordhNV");
		glFogCoordhvNV = provider.getFunctionAddress("glFogCoordhvNV");
		glFogf = getFunctionAddress(fc, provider, "glFogf");
		glFogfv = getFunctionAddress(fc, provider, "glFogfv");
		glFogi = getFunctionAddress(fc, provider, "glFogi");
		glFogiv = getFunctionAddress(fc, provider, "glFogiv");
		glFragmentCoverageColorNV = provider.getFunctionAddress("glFragmentCoverageColorNV");
		glFramebufferDrawBufferEXT = provider.getFunctionAddress("glFramebufferDrawBufferEXT");
		glFramebufferDrawBuffersEXT = provider.getFunctionAddress("glFramebufferDrawBuffersEXT");
		glFramebufferParameteri = provider.getFunctionAddress("glFramebufferParameteri");
		glFramebufferReadBufferEXT = provider.getFunctionAddress("glFramebufferReadBufferEXT");
		glFramebufferRenderbuffer = provider.getFunctionAddress("glFramebufferRenderbuffer");
		glFramebufferRenderbufferEXT = provider.getFunctionAddress("glFramebufferRenderbufferEXT");
		glFramebufferSampleLocationsfvARB = provider.getFunctionAddress("glFramebufferSampleLocationsfvARB");
		glFramebufferSampleLocationsfvNV = provider.getFunctionAddress("glFramebufferSampleLocationsfvNV");
		glFramebufferTexture = provider.getFunctionAddress("glFramebufferTexture");
		glFramebufferTexture1D = provider.getFunctionAddress("glFramebufferTexture1D");
		glFramebufferTexture1DEXT = provider.getFunctionAddress("glFramebufferTexture1DEXT");
		glFramebufferTexture2D = provider.getFunctionAddress("glFramebufferTexture2D");
		glFramebufferTexture2DEXT = provider.getFunctionAddress("glFramebufferTexture2DEXT");
		glFramebufferTexture3D = provider.getFunctionAddress("glFramebufferTexture3D");
		glFramebufferTexture3DEXT = provider.getFunctionAddress("glFramebufferTexture3DEXT");
		glFramebufferTextureARB = provider.getFunctionAddress("glFramebufferTextureARB");
		glFramebufferTextureEXT = provider.getFunctionAddress("glFramebufferTextureEXT");
		glFramebufferTextureFaceARB = provider.getFunctionAddress("glFramebufferTextureFaceARB");
		glFramebufferTextureFaceEXT = provider.getFunctionAddress("glFramebufferTextureFaceEXT");
		glFramebufferTextureLayer = provider.getFunctionAddress("glFramebufferTextureLayer");
		glFramebufferTextureLayerARB = provider.getFunctionAddress("glFramebufferTextureLayerARB");
		glFramebufferTextureLayerEXT = provider.getFunctionAddress("glFramebufferTextureLayerEXT");
		glFramebufferTextureMultiviewOVR = provider.getFunctionAddress("glFramebufferTextureMultiviewOVR");
		glFrontFace = provider.getFunctionAddress("glFrontFace");
		glFrustum = getFunctionAddress(fc, provider, "glFrustum");
		glGenBuffers = provider.getFunctionAddress("glGenBuffers");
		glGenBuffersARB = provider.getFunctionAddress("glGenBuffersARB");
		glGenFencesNV = provider.getFunctionAddress("glGenFencesNV");
		glGenFramebuffers = provider.getFunctionAddress("glGenFramebuffers");
		glGenFramebuffersEXT = provider.getFunctionAddress("glGenFramebuffersEXT");
		glGenLists = getFunctionAddress(fc, provider, "glGenLists");
		glGenPathsNV = provider.getFunctionAddress("glGenPathsNV");
		glGenPerfMonitorsAMD = provider.getFunctionAddress("glGenPerfMonitorsAMD");
		glGenProgramPipelines = provider.getFunctionAddress("glGenProgramPipelines");
		glGenProgramsARB = provider.getFunctionAddress("glGenProgramsARB");
		glGenQueries = provider.getFunctionAddress("glGenQueries");
		glGenQueriesARB = provider.getFunctionAddress("glGenQueriesARB");
		glGenRenderbuffers = provider.getFunctionAddress("glGenRenderbuffers");
		glGenRenderbuffersEXT = provider.getFunctionAddress("glGenRenderbuffersEXT");
		glGenSamplers = provider.getFunctionAddress("glGenSamplers");
		glGenTextures = provider.getFunctionAddress("glGenTextures");
		glGenTransformFeedbacks = provider.getFunctionAddress("glGenTransformFeedbacks");
		glGenTransformFeedbacksNV = provider.getFunctionAddress("glGenTransformFeedbacksNV");
		glGenVertexArrays = provider.getFunctionAddress("glGenVertexArrays");
		glGenerateMipmap = provider.getFunctionAddress("glGenerateMipmap");
		glGenerateMipmapEXT = provider.getFunctionAddress("glGenerateMipmapEXT");
		glGenerateMultiTexMipmapEXT = provider.getFunctionAddress("glGenerateMultiTexMipmapEXT");
		glGenerateTextureMipmap = provider.getFunctionAddress("glGenerateTextureMipmap");
		glGenerateTextureMipmapEXT = provider.getFunctionAddress("glGenerateTextureMipmapEXT");
		glGetActiveAtomicCounterBufferiv = provider.getFunctionAddress("glGetActiveAtomicCounterBufferiv");
		glGetActiveAttrib = provider.getFunctionAddress("glGetActiveAttrib");
		glGetActiveAttribARB = provider.getFunctionAddress("glGetActiveAttribARB");
		glGetActiveSubroutineName = provider.getFunctionAddress("glGetActiveSubroutineName");
		glGetActiveSubroutineUniformName = provider.getFunctionAddress("glGetActiveSubroutineUniformName");
		glGetActiveSubroutineUniformiv = provider.getFunctionAddress("glGetActiveSubroutineUniformiv");
		glGetActiveUniform = provider.getFunctionAddress("glGetActiveUniform");
		glGetActiveUniformARB = provider.getFunctionAddress("glGetActiveUniformARB");
		glGetActiveUniformBlockName = provider.getFunctionAddress("glGetActiveUniformBlockName");
		glGetActiveUniformBlockiv = provider.getFunctionAddress("glGetActiveUniformBlockiv");
		glGetActiveUniformName = provider.getFunctionAddress("glGetActiveUniformName");
		glGetActiveUniformsiv = provider.getFunctionAddress("glGetActiveUniformsiv");
		glGetActiveVaryingNV = provider.getFunctionAddress("glGetActiveVaryingNV");
		glGetAttachedObjectsARB = provider.getFunctionAddress("glGetAttachedObjectsARB");
		glGetAttachedShaders = provider.getFunctionAddress("glGetAttachedShaders");
		glGetAttribLocation = provider.getFunctionAddress("glGetAttribLocation");
		glGetAttribLocationARB = provider.getFunctionAddress("glGetAttribLocationARB");
		glGetBooleanIndexedvEXT = provider.getFunctionAddress("glGetBooleanIndexedvEXT");
		glGetBooleani_v = provider.getFunctionAddress("glGetBooleani_v");
		glGetBooleanv = provider.getFunctionAddress("glGetBooleanv");
		glGetBufferParameteri64v = provider.getFunctionAddress("glGetBufferParameteri64v");
		glGetBufferParameteriv = provider.getFunctionAddress("glGetBufferParameteriv");
		glGetBufferParameterivARB = provider.getFunctionAddress("glGetBufferParameterivARB");
		glGetBufferParameterui64vNV = provider.getFunctionAddress("glGetBufferParameterui64vNV");
		glGetBufferPointerv = provider.getFunctionAddress("glGetBufferPointerv");
		glGetBufferPointervARB = provider.getFunctionAddress("glGetBufferPointervARB");
		glGetBufferSubData = provider.getFunctionAddress("glGetBufferSubData");
		glGetBufferSubDataARB = provider.getFunctionAddress("glGetBufferSubDataARB");
		glGetClipPlane = provider.getFunctionAddress("glGetClipPlane");
		glGetColorTable = getFunctionAddress(fc, provider, "glGetColorTable");
		glGetColorTableParameterfv = getFunctionAddress(fc, provider, "glGetColorTableParameterfv");
		glGetColorTableParameteriv = getFunctionAddress(fc, provider, "glGetColorTableParameteriv");
		glGetCommandHeaderNV = provider.getFunctionAddress("glGetCommandHeaderNV");
		glGetCompressedMultiTexImageEXT = provider.getFunctionAddress("glGetCompressedMultiTexImageEXT");
		glGetCompressedTexImage = provider.getFunctionAddress("glGetCompressedTexImage");
		glGetCompressedTexImageARB = provider.getFunctionAddress("glGetCompressedTexImageARB");
		glGetCompressedTextureImage = provider.getFunctionAddress("glGetCompressedTextureImage");
		glGetCompressedTextureImageEXT = provider.getFunctionAddress("glGetCompressedTextureImageEXT");
		glGetCompressedTextureSubImage = provider.getFunctionAddress("glGetCompressedTextureSubImage");
		glGetConvolutionFilter = getFunctionAddress(fc, provider, "glGetConvolutionFilter");
		glGetConvolutionParameterfv = getFunctionAddress(fc, provider, "glGetConvolutionParameterfv");
		glGetConvolutionParameteriv = getFunctionAddress(fc, provider, "glGetConvolutionParameteriv");
		glGetCoverageModulationTableNV = provider.getFunctionAddress("glGetCoverageModulationTableNV");
		glGetDebugMessageLog = provider.getFunctionAddress("glGetDebugMessageLog");
		glGetDebugMessageLogAMD = provider.getFunctionAddress("glGetDebugMessageLogAMD");
		glGetDebugMessageLogARB = provider.getFunctionAddress("glGetDebugMessageLogARB");
		glGetDoubleIndexedvEXT = provider.getFunctionAddress("glGetDoubleIndexedvEXT");
		glGetDoublei_v = provider.getFunctionAddress("glGetDoublei_v");
		glGetDoublei_vEXT = provider.getFunctionAddress("glGetDoublei_vEXT");
		glGetDoublev = provider.getFunctionAddress("glGetDoublev");
		glGetError = provider.getFunctionAddress("glGetError");
		glGetFenceivNV = provider.getFunctionAddress("glGetFenceivNV");
		glGetFirstPerfQueryIdINTEL = provider.getFunctionAddress("glGetFirstPerfQueryIdINTEL");
		glGetFloatIndexedvEXT = provider.getFunctionAddress("glGetFloatIndexedvEXT");
		glGetFloati_v = provider.getFunctionAddress("glGetFloati_v");
		glGetFloati_vEXT = provider.getFunctionAddress("glGetFloati_vEXT");
		glGetFloatv = provider.getFunctionAddress("glGetFloatv");
		glGetFragDataIndex = provider.getFunctionAddress("glGetFragDataIndex");
		glGetFragDataLocation = provider.getFunctionAddress("glGetFragDataLocation");
		glGetFragDataLocationEXT = provider.getFunctionAddress("glGetFragDataLocationEXT");
		glGetFramebufferAttachmentParameteriv = provider.getFunctionAddress("glGetFramebufferAttachmentParameteriv");
		glGetFramebufferAttachmentParameterivEXT = provider.getFunctionAddress("glGetFramebufferAttachmentParameterivEXT");
		glGetFramebufferParameteriv = provider.getFunctionAddress("glGetFramebufferParameteriv");
		glGetFramebufferParameterivEXT = provider.getFunctionAddress("glGetFramebufferParameterivEXT");
		glGetGraphicsResetStatus = provider.getFunctionAddress("glGetGraphicsResetStatus");
		glGetGraphicsResetStatusARB = provider.getFunctionAddress("glGetGraphicsResetStatusARB");
		glGetHandleARB = provider.getFunctionAddress("glGetHandleARB");
		glGetHistogram = getFunctionAddress(fc, provider, "glGetHistogram");
		glGetHistogramParameterfv = getFunctionAddress(fc, provider, "glGetHistogramParameterfv");
		glGetHistogramParameteriv = getFunctionAddress(fc, provider, "glGetHistogramParameteriv");
		glGetImageHandleARB = provider.getFunctionAddress("glGetImageHandleARB");
		glGetImageHandleNV = provider.getFunctionAddress("glGetImageHandleNV");
		glGetInfoLogARB = provider.getFunctionAddress("glGetInfoLogARB");
		glGetInteger64i_v = provider.getFunctionAddress("glGetInteger64i_v");
		glGetInteger64v = provider.getFunctionAddress("glGetInteger64v");
		glGetIntegerIndexedvEXT = provider.getFunctionAddress("glGetIntegerIndexedvEXT");
		glGetIntegeri_v = provider.getFunctionAddress("glGetIntegeri_v");
		glGetIntegerui64i_vNV = provider.getFunctionAddress("glGetIntegerui64i_vNV");
		glGetIntegerui64vNV = provider.getFunctionAddress("glGetIntegerui64vNV");
		glGetIntegerv = provider.getFunctionAddress("glGetIntegerv");
		glGetInternalformatSampleivNV = provider.getFunctionAddress("glGetInternalformatSampleivNV");
		glGetInternalformati64v = provider.getFunctionAddress("glGetInternalformati64v");
		glGetInternalformativ = provider.getFunctionAddress("glGetInternalformativ");
		glGetLightfv = getFunctionAddress(fc, provider, "glGetLightfv");
		glGetLightiv = getFunctionAddress(fc, provider, "glGetLightiv");
		glGetMapdv = getFunctionAddress(fc, provider, "glGetMapdv");
		glGetMapfv = getFunctionAddress(fc, provider, "glGetMapfv");
		glGetMapiv = getFunctionAddress(fc, provider, "glGetMapiv");
		glGetMaterialfv = getFunctionAddress(fc, provider, "glGetMaterialfv");
		glGetMaterialiv = getFunctionAddress(fc, provider, "glGetMaterialiv");
		glGetMinmax = getFunctionAddress(fc, provider, "glGetMinmax");
		glGetMinmaxParameterfv = getFunctionAddress(fc, provider, "glGetMinmaxParameterfv");
		glGetMinmaxParameteriv = getFunctionAddress(fc, provider, "glGetMinmaxParameteriv");
		glGetMultiTexEnvfvEXT = provider.getFunctionAddress("glGetMultiTexEnvfvEXT");
		glGetMultiTexEnvivEXT = provider.getFunctionAddress("glGetMultiTexEnvivEXT");
		glGetMultiTexGendvEXT = provider.getFunctionAddress("glGetMultiTexGendvEXT");
		glGetMultiTexGenfvEXT = provider.getFunctionAddress("glGetMultiTexGenfvEXT");
		glGetMultiTexGenivEXT = provider.getFunctionAddress("glGetMultiTexGenivEXT");
		glGetMultiTexImageEXT = provider.getFunctionAddress("glGetMultiTexImageEXT");
		glGetMultiTexLevelParameterfvEXT = provider.getFunctionAddress("glGetMultiTexLevelParameterfvEXT");
		glGetMultiTexLevelParameterivEXT = provider.getFunctionAddress("glGetMultiTexLevelParameterivEXT");
		glGetMultiTexParameterIivEXT = provider.getFunctionAddress("glGetMultiTexParameterIivEXT");
		glGetMultiTexParameterIuivEXT = provider.getFunctionAddress("glGetMultiTexParameterIuivEXT");
		glGetMultiTexParameterfvEXT = provider.getFunctionAddress("glGetMultiTexParameterfvEXT");
		glGetMultiTexParameterivEXT = provider.getFunctionAddress("glGetMultiTexParameterivEXT");
		glGetMultisamplefv = provider.getFunctionAddress("glGetMultisamplefv");
		glGetMultisamplefvNV = provider.getFunctionAddress("glGetMultisamplefvNV");
		glGetNamedBufferParameteri64v = provider.getFunctionAddress("glGetNamedBufferParameteri64v");
		glGetNamedBufferParameteriv = provider.getFunctionAddress("glGetNamedBufferParameteriv");
		glGetNamedBufferParameterivEXT = provider.getFunctionAddress("glGetNamedBufferParameterivEXT");
		glGetNamedBufferParameterui64vNV = provider.getFunctionAddress("glGetNamedBufferParameterui64vNV");
		glGetNamedBufferPointerv = provider.getFunctionAddress("glGetNamedBufferPointerv");
		glGetNamedBufferSubData = provider.getFunctionAddress("glGetNamedBufferSubData");
		glGetNamedBufferSubDataEXT = provider.getFunctionAddress("glGetNamedBufferSubDataEXT");
		glGetNamedFramebufferAttachmentParameteriv = provider.getFunctionAddress("glGetNamedFramebufferAttachmentParameteriv");
		glGetNamedFramebufferAttachmentParameterivEXT = provider.getFunctionAddress("glGetNamedFramebufferAttachmentParameterivEXT");
		glGetNamedFramebufferParameteriv = provider.getFunctionAddress("glGetNamedFramebufferParameteriv");
		glGetNamedFramebufferParameterivEXT = provider.getFunctionAddress("glGetNamedFramebufferParameterivEXT");
		glGetNamedProgramLocalParameterIivEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterIivEXT");
		glGetNamedProgramLocalParameterIuivEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterIuivEXT");
		glGetNamedProgramLocalParameterdvEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterdvEXT");
		glGetNamedProgramLocalParameterfvEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterfvEXT");
		glGetNamedProgramStringEXT = provider.getFunctionAddress("glGetNamedProgramStringEXT");
		glGetNamedProgramivEXT = provider.getFunctionAddress("glGetNamedProgramivEXT");
		glGetNamedRenderbufferParameteriv = provider.getFunctionAddress("glGetNamedRenderbufferParameteriv");
		glGetNamedRenderbufferParameterivEXT = provider.getFunctionAddress("glGetNamedRenderbufferParameterivEXT");
		glGetNamedStringARB = provider.getFunctionAddress("glGetNamedStringARB");
		glGetNamedStringivARB = provider.getFunctionAddress("glGetNamedStringivARB");
		glGetNextPerfQueryIdINTEL = provider.getFunctionAddress("glGetNextPerfQueryIdINTEL");
		glGetObjectLabel = provider.getFunctionAddress("glGetObjectLabel");
		glGetObjectLabelEXT = provider.getFunctionAddress("glGetObjectLabelEXT");
		glGetObjectParameterfvARB = provider.getFunctionAddress("glGetObjectParameterfvARB");
		glGetObjectParameterivARB = provider.getFunctionAddress("glGetObjectParameterivARB");
		glGetObjectPtrLabel = provider.getFunctionAddress("glGetObjectPtrLabel");
		glGetPathColorGenfvNV = provider.getFunctionAddress("glGetPathColorGenfvNV");
		glGetPathColorGenivNV = provider.getFunctionAddress("glGetPathColorGenivNV");
		glGetPathCommandsNV = provider.getFunctionAddress("glGetPathCommandsNV");
		glGetPathCoordsNV = provider.getFunctionAddress("glGetPathCoordsNV");
		glGetPathDashArrayNV = provider.getFunctionAddress("glGetPathDashArrayNV");
		glGetPathLengthNV = provider.getFunctionAddress("glGetPathLengthNV");
		glGetPathMetricRangeNV = provider.getFunctionAddress("glGetPathMetricRangeNV");
		glGetPathMetricsNV = provider.getFunctionAddress("glGetPathMetricsNV");
		glGetPathParameterfvNV = provider.getFunctionAddress("glGetPathParameterfvNV");
		glGetPathParameterivNV = provider.getFunctionAddress("glGetPathParameterivNV");
		glGetPathSpacingNV = provider.getFunctionAddress("glGetPathSpacingNV");
		glGetPathTexGenfvNV = provider.getFunctionAddress("glGetPathTexGenfvNV");
		glGetPathTexGenivNV = provider.getFunctionAddress("glGetPathTexGenivNV");
		glGetPerfCounterInfoINTEL = provider.getFunctionAddress("glGetPerfCounterInfoINTEL");
		glGetPerfMonitorCounterDataAMD = provider.getFunctionAddress("glGetPerfMonitorCounterDataAMD");
		glGetPerfMonitorCounterInfoAMD = provider.getFunctionAddress("glGetPerfMonitorCounterInfoAMD");
		glGetPerfMonitorCounterStringAMD = provider.getFunctionAddress("glGetPerfMonitorCounterStringAMD");
		glGetPerfMonitorCountersAMD = provider.getFunctionAddress("glGetPerfMonitorCountersAMD");
		glGetPerfMonitorGroupStringAMD = provider.getFunctionAddress("glGetPerfMonitorGroupStringAMD");
		glGetPerfMonitorGroupsAMD = provider.getFunctionAddress("glGetPerfMonitorGroupsAMD");
		glGetPerfQueryDataINTEL = provider.getFunctionAddress("glGetPerfQueryDataINTEL");
		glGetPerfQueryIdByNameINTEL = provider.getFunctionAddress("glGetPerfQueryIdByNameINTEL");
		glGetPerfQueryInfoINTEL = provider.getFunctionAddress("glGetPerfQueryInfoINTEL");
		glGetPixelMapfv = getFunctionAddress(fc, provider, "glGetPixelMapfv");
		glGetPixelMapuiv = getFunctionAddress(fc, provider, "glGetPixelMapuiv");
		glGetPixelMapusv = getFunctionAddress(fc, provider, "glGetPixelMapusv");
		glGetPointerIndexedvEXT = provider.getFunctionAddress("glGetPointerIndexedvEXT");
		glGetPointeri_vEXT = provider.getFunctionAddress("glGetPointeri_vEXT");
		glGetPointerv = provider.getFunctionAddress("glGetPointerv");
		glGetPolygonStipple = getFunctionAddress(fc, provider, "glGetPolygonStipple");
		glGetProgramBinary = provider.getFunctionAddress("glGetProgramBinary");
		glGetProgramEnvParameterdvARB = provider.getFunctionAddress("glGetProgramEnvParameterdvARB");
		glGetProgramEnvParameterfvARB = provider.getFunctionAddress("glGetProgramEnvParameterfvARB");
		glGetProgramInfoLog = provider.getFunctionAddress("glGetProgramInfoLog");
		glGetProgramInterfaceiv = provider.getFunctionAddress("glGetProgramInterfaceiv");
		glGetProgramLocalParameterdvARB = provider.getFunctionAddress("glGetProgramLocalParameterdvARB");
		glGetProgramLocalParameterfvARB = provider.getFunctionAddress("glGetProgramLocalParameterfvARB");
		glGetProgramPipelineInfoLog = provider.getFunctionAddress("glGetProgramPipelineInfoLog");
		glGetProgramPipelineiv = provider.getFunctionAddress("glGetProgramPipelineiv");
		glGetProgramResourceIndex = provider.getFunctionAddress("glGetProgramResourceIndex");
		glGetProgramResourceLocation = provider.getFunctionAddress("glGetProgramResourceLocation");
		glGetProgramResourceLocationIndex = provider.getFunctionAddress("glGetProgramResourceLocationIndex");
		glGetProgramResourceName = provider.getFunctionAddress("glGetProgramResourceName");
		glGetProgramResourcefvNV = provider.getFunctionAddress("glGetProgramResourcefvNV");
		glGetProgramResourceiv = provider.getFunctionAddress("glGetProgramResourceiv");
		glGetProgramStageiv = provider.getFunctionAddress("glGetProgramStageiv");
		glGetProgramStringARB = provider.getFunctionAddress("glGetProgramStringARB");
		glGetProgramiv = provider.getFunctionAddress("glGetProgramiv");
		glGetProgramivARB = provider.getFunctionAddress("glGetProgramivARB");
		glGetQueryBufferObjecti64v = provider.getFunctionAddress("glGetQueryBufferObjecti64v");
		glGetQueryBufferObjectiv = provider.getFunctionAddress("glGetQueryBufferObjectiv");
		glGetQueryBufferObjectui64v = provider.getFunctionAddress("glGetQueryBufferObjectui64v");
		glGetQueryBufferObjectuiv = provider.getFunctionAddress("glGetQueryBufferObjectuiv");
		glGetQueryIndexediv = provider.getFunctionAddress("glGetQueryIndexediv");
		glGetQueryObjecti64v = provider.getFunctionAddress("glGetQueryObjecti64v");
		glGetQueryObjecti64vEXT = provider.getFunctionAddress("glGetQueryObjecti64vEXT");
		glGetQueryObjectiv = provider.getFunctionAddress("glGetQueryObjectiv");
		glGetQueryObjectivARB = provider.getFunctionAddress("glGetQueryObjectivARB");
		glGetQueryObjectui64v = provider.getFunctionAddress("glGetQueryObjectui64v");
		glGetQueryObjectui64vEXT = provider.getFunctionAddress("glGetQueryObjectui64vEXT");
		glGetQueryObjectuiv = provider.getFunctionAddress("glGetQueryObjectuiv");
		glGetQueryObjectuivARB = provider.getFunctionAddress("glGetQueryObjectuivARB");
		glGetQueryiv = provider.getFunctionAddress("glGetQueryiv");
		glGetQueryivARB = provider.getFunctionAddress("glGetQueryivARB");
		glGetRenderbufferParameteriv = provider.getFunctionAddress("glGetRenderbufferParameteriv");
		glGetRenderbufferParameterivEXT = provider.getFunctionAddress("glGetRenderbufferParameterivEXT");
		glGetSamplerParameterIiv = provider.getFunctionAddress("glGetSamplerParameterIiv");
		glGetSamplerParameterIuiv = provider.getFunctionAddress("glGetSamplerParameterIuiv");
		glGetSamplerParameterfv = provider.getFunctionAddress("glGetSamplerParameterfv");
		glGetSamplerParameteriv = provider.getFunctionAddress("glGetSamplerParameteriv");
		glGetSeparableFilter = getFunctionAddress(fc, provider, "glGetSeparableFilter");
		glGetShaderInfoLog = provider.getFunctionAddress("glGetShaderInfoLog");
		glGetShaderPrecisionFormat = provider.getFunctionAddress("glGetShaderPrecisionFormat");
		glGetShaderSource = provider.getFunctionAddress("glGetShaderSource");
		glGetShaderSourceARB = provider.getFunctionAddress("glGetShaderSourceARB");
		glGetShaderiv = provider.getFunctionAddress("glGetShaderiv");
		glGetStageIndexNV = provider.getFunctionAddress("glGetStageIndexNV");
		glGetString = provider.getFunctionAddress("glGetString");
		glGetStringi = provider.getFunctionAddress("glGetStringi");
		glGetSubroutineIndex = provider.getFunctionAddress("glGetSubroutineIndex");
		glGetSubroutineUniformLocation = provider.getFunctionAddress("glGetSubroutineUniformLocation");
		glGetSynciv = provider.getFunctionAddress("glGetSynciv");
		glGetTexEnvfv = provider.getFunctionAddress("glGetTexEnvfv");
		glGetTexEnviv = provider.getFunctionAddress("glGetTexEnviv");
		glGetTexGendv = getFunctionAddress(fc, provider, "glGetTexGendv");
		glGetTexGenfv = getFunctionAddress(fc, provider, "glGetTexGenfv");
		glGetTexGeniv = getFunctionAddress(fc, provider, "glGetTexGeniv");
		glGetTexImage = provider.getFunctionAddress("glGetTexImage");
		glGetTexLevelParameterfv = provider.getFunctionAddress("glGetTexLevelParameterfv");
		glGetTexLevelParameteriv = provider.getFunctionAddress("glGetTexLevelParameteriv");
		glGetTexParameterIiv = provider.getFunctionAddress("glGetTexParameterIiv");
		glGetTexParameterIivEXT = provider.getFunctionAddress("glGetTexParameterIivEXT");
		glGetTexParameterIuiv = provider.getFunctionAddress("glGetTexParameterIuiv");
		glGetTexParameterIuivEXT = provider.getFunctionAddress("glGetTexParameterIuivEXT");
		glGetTexParameterfv = provider.getFunctionAddress("glGetTexParameterfv");
		glGetTexParameteriv = provider.getFunctionAddress("glGetTexParameteriv");
		glGetTextureHandleARB = provider.getFunctionAddress("glGetTextureHandleARB");
		glGetTextureHandleNV = provider.getFunctionAddress("glGetTextureHandleNV");
		glGetTextureImage = provider.getFunctionAddress("glGetTextureImage");
		glGetTextureImageEXT = provider.getFunctionAddress("glGetTextureImageEXT");
		glGetTextureLevelParameterfv = provider.getFunctionAddress("glGetTextureLevelParameterfv");
		glGetTextureLevelParameterfvEXT = provider.getFunctionAddress("glGetTextureLevelParameterfvEXT");
		glGetTextureLevelParameteriv = provider.getFunctionAddress("glGetTextureLevelParameteriv");
		glGetTextureLevelParameterivEXT = provider.getFunctionAddress("glGetTextureLevelParameterivEXT");
		glGetTextureParameterIiv = provider.getFunctionAddress("glGetTextureParameterIiv");
		glGetTextureParameterIivEXT = provider.getFunctionAddress("glGetTextureParameterIivEXT");
		glGetTextureParameterIuiv = provider.getFunctionAddress("glGetTextureParameterIuiv");
		glGetTextureParameterIuivEXT = provider.getFunctionAddress("glGetTextureParameterIuivEXT");
		glGetTextureParameterfv = provider.getFunctionAddress("glGetTextureParameterfv");
		glGetTextureParameterfvEXT = provider.getFunctionAddress("glGetTextureParameterfvEXT");
		glGetTextureParameteriv = provider.getFunctionAddress("glGetTextureParameteriv");
		glGetTextureParameterivEXT = provider.getFunctionAddress("glGetTextureParameterivEXT");
		glGetTextureSamplerHandleARB = provider.getFunctionAddress("glGetTextureSamplerHandleARB");
		glGetTextureSamplerHandleNV = provider.getFunctionAddress("glGetTextureSamplerHandleNV");
		glGetTextureSubImage = provider.getFunctionAddress("glGetTextureSubImage");
		glGetTransformFeedbackVarying = provider.getFunctionAddress("glGetTransformFeedbackVarying");
		glGetTransformFeedbackVaryingEXT = provider.getFunctionAddress("glGetTransformFeedbackVaryingEXT");
		glGetTransformFeedbackVaryingNV = provider.getFunctionAddress("glGetTransformFeedbackVaryingNV");
		glGetTransformFeedbacki64_v = provider.getFunctionAddress("glGetTransformFeedbacki64_v");
		glGetTransformFeedbacki_v = provider.getFunctionAddress("glGetTransformFeedbacki_v");
		glGetTransformFeedbackiv = provider.getFunctionAddress("glGetTransformFeedbackiv");
		glGetUniformBlockIndex = provider.getFunctionAddress("glGetUniformBlockIndex");
		glGetUniformBufferSizeEXT = provider.getFunctionAddress("glGetUniformBufferSizeEXT");
		glGetUniformIndices = provider.getFunctionAddress("glGetUniformIndices");
		glGetUniformLocation = provider.getFunctionAddress("glGetUniformLocation");
		glGetUniformLocationARB = provider.getFunctionAddress("glGetUniformLocationARB");
		glGetUniformOffsetEXT = provider.getFunctionAddress("glGetUniformOffsetEXT");
		glGetUniformSubroutineuiv = provider.getFunctionAddress("glGetUniformSubroutineuiv");
		glGetUniformdv = provider.getFunctionAddress("glGetUniformdv");
		glGetUniformfv = provider.getFunctionAddress("glGetUniformfv");
		glGetUniformfvARB = provider.getFunctionAddress("glGetUniformfvARB");
		glGetUniformi64vARB = provider.getFunctionAddress("glGetUniformi64vARB");
		glGetUniformi64vNV = provider.getFunctionAddress("glGetUniformi64vNV");
		glGetUniformiv = provider.getFunctionAddress("glGetUniformiv");
		glGetUniformivARB = provider.getFunctionAddress("glGetUniformivARB");
		glGetUniformui64vARB = provider.getFunctionAddress("glGetUniformui64vARB");
		glGetUniformui64vNV = provider.getFunctionAddress("glGetUniformui64vNV");
		glGetUniformuiv = provider.getFunctionAddress("glGetUniformuiv");
		glGetUniformuivEXT = provider.getFunctionAddress("glGetUniformuivEXT");
		glGetVaryingLocationNV = provider.getFunctionAddress("glGetVaryingLocationNV");
		glGetVertexArrayIndexed64iv = provider.getFunctionAddress("glGetVertexArrayIndexed64iv");
		glGetVertexArrayIndexediv = provider.getFunctionAddress("glGetVertexArrayIndexediv");
		glGetVertexArrayIntegeri_vEXT = provider.getFunctionAddress("glGetVertexArrayIntegeri_vEXT");
		glGetVertexArrayIntegervEXT = provider.getFunctionAddress("glGetVertexArrayIntegervEXT");
		glGetVertexArrayPointeri_vEXT = provider.getFunctionAddress("glGetVertexArrayPointeri_vEXT");
		glGetVertexArrayPointervEXT = provider.getFunctionAddress("glGetVertexArrayPointervEXT");
		glGetVertexArrayiv = provider.getFunctionAddress("glGetVertexArrayiv");
		glGetVertexAttribIiv = provider.getFunctionAddress("glGetVertexAttribIiv");
		glGetVertexAttribIivEXT = provider.getFunctionAddress("glGetVertexAttribIivEXT");
		glGetVertexAttribIuiv = provider.getFunctionAddress("glGetVertexAttribIuiv");
		glGetVertexAttribIuivEXT = provider.getFunctionAddress("glGetVertexAttribIuivEXT");
		glGetVertexAttribLdv = provider.getFunctionAddress("glGetVertexAttribLdv");
		glGetVertexAttribLdvEXT = provider.getFunctionAddress("glGetVertexAttribLdvEXT");
		glGetVertexAttribLi64vNV = provider.getFunctionAddress("glGetVertexAttribLi64vNV");
		glGetVertexAttribLui64vARB = provider.getFunctionAddress("glGetVertexAttribLui64vARB");
		glGetVertexAttribLui64vNV = provider.getFunctionAddress("glGetVertexAttribLui64vNV");
		glGetVertexAttribPointerv = provider.getFunctionAddress("glGetVertexAttribPointerv");
		glGetVertexAttribPointervARB = provider.getFunctionAddress("glGetVertexAttribPointervARB");
		glGetVertexAttribdv = provider.getFunctionAddress("glGetVertexAttribdv");
		glGetVertexAttribdvARB = provider.getFunctionAddress("glGetVertexAttribdvARB");
		glGetVertexAttribfv = provider.getFunctionAddress("glGetVertexAttribfv");
		glGetVertexAttribfvARB = provider.getFunctionAddress("glGetVertexAttribfvARB");
		glGetVertexAttribiv = provider.getFunctionAddress("glGetVertexAttribiv");
		glGetVertexAttribivARB = provider.getFunctionAddress("glGetVertexAttribivARB");
		glGetVkProcAddrNV = provider.getFunctionAddress("glGetVkProcAddrNV");
		glGetnColorTable = provider.getFunctionAddress("glGetnColorTable");
		glGetnColorTableARB = provider.getFunctionAddress("glGetnColorTableARB");
		glGetnCompressedTexImage = provider.getFunctionAddress("glGetnCompressedTexImage");
		glGetnCompressedTexImageARB = provider.getFunctionAddress("glGetnCompressedTexImageARB");
		glGetnConvolutionFilter = provider.getFunctionAddress("glGetnConvolutionFilter");
		glGetnConvolutionFilterARB = provider.getFunctionAddress("glGetnConvolutionFilterARB");
		glGetnHistogram = provider.getFunctionAddress("glGetnHistogram");
		glGetnHistogramARB = provider.getFunctionAddress("glGetnHistogramARB");
		glGetnMapdv = provider.getFunctionAddress("glGetnMapdv");
		glGetnMapdvARB = provider.getFunctionAddress("glGetnMapdvARB");
		glGetnMapfv = provider.getFunctionAddress("glGetnMapfv");
		glGetnMapfvARB = provider.getFunctionAddress("glGetnMapfvARB");
		glGetnMapiv = provider.getFunctionAddress("glGetnMapiv");
		glGetnMapivARB = provider.getFunctionAddress("glGetnMapivARB");
		glGetnMinmax = provider.getFunctionAddress("glGetnMinmax");
		glGetnMinmaxARB = provider.getFunctionAddress("glGetnMinmaxARB");
		glGetnPixelMapfv = provider.getFunctionAddress("glGetnPixelMapfv");
		glGetnPixelMapfvARB = provider.getFunctionAddress("glGetnPixelMapfvARB");
		glGetnPixelMapuiv = provider.getFunctionAddress("glGetnPixelMapuiv");
		glGetnPixelMapuivARB = provider.getFunctionAddress("glGetnPixelMapuivARB");
		glGetnPixelMapusv = provider.getFunctionAddress("glGetnPixelMapusv");
		glGetnPixelMapusvARB = provider.getFunctionAddress("glGetnPixelMapusvARB");
		glGetnPolygonStipple = provider.getFunctionAddress("glGetnPolygonStipple");
		glGetnPolygonStippleARB = provider.getFunctionAddress("glGetnPolygonStippleARB");
		glGetnSeparableFilter = provider.getFunctionAddress("glGetnSeparableFilter");
		glGetnSeparableFilterARB = provider.getFunctionAddress("glGetnSeparableFilterARB");
		glGetnTexImage = provider.getFunctionAddress("glGetnTexImage");
		glGetnTexImageARB = provider.getFunctionAddress("glGetnTexImageARB");
		glGetnUniformdv = provider.getFunctionAddress("glGetnUniformdv");
		glGetnUniformdvARB = provider.getFunctionAddress("glGetnUniformdvARB");
		glGetnUniformfv = provider.getFunctionAddress("glGetnUniformfv");
		glGetnUniformfvARB = provider.getFunctionAddress("glGetnUniformfvARB");
		glGetnUniformi64vARB = provider.getFunctionAddress("glGetnUniformi64vARB");
		glGetnUniformiv = provider.getFunctionAddress("glGetnUniformiv");
		glGetnUniformivARB = provider.getFunctionAddress("glGetnUniformivARB");
		glGetnUniformui64vARB = provider.getFunctionAddress("glGetnUniformui64vARB");
		glGetnUniformuiv = provider.getFunctionAddress("glGetnUniformuiv");
		glGetnUniformuivARB = provider.getFunctionAddress("glGetnUniformuivARB");
		glHint = provider.getFunctionAddress("glHint");
		glHistogram = getFunctionAddress(fc, provider, "glHistogram");
		glImportSyncEXT = provider.getFunctionAddress("glImportSyncEXT");
		glIndexFormatNV = provider.getFunctionAddress("glIndexFormatNV");
		glIndexMask = getFunctionAddress(fc, provider, "glIndexMask");
		glIndexPointer = getFunctionAddress(fc, provider, "glIndexPointer");
		glIndexd = getFunctionAddress(fc, provider, "glIndexd");
		glIndexdv = getFunctionAddress(fc, provider, "glIndexdv");
		glIndexf = getFunctionAddress(fc, provider, "glIndexf");
		glIndexfv = getFunctionAddress(fc, provider, "glIndexfv");
		glIndexi = getFunctionAddress(fc, provider, "glIndexi");
		glIndexiv = getFunctionAddress(fc, provider, "glIndexiv");
		glIndexs = getFunctionAddress(fc, provider, "glIndexs");
		glIndexsv = getFunctionAddress(fc, provider, "glIndexsv");
		glIndexub = getFunctionAddress(fc, provider, "glIndexub");
		glIndexubv = getFunctionAddress(fc, provider, "glIndexubv");
		glInitNames = getFunctionAddress(fc, provider, "glInitNames");
		glInsertEventMarkerEXT = provider.getFunctionAddress("glInsertEventMarkerEXT");
		glInterleavedArrays = provider.getFunctionAddress("glInterleavedArrays");
		glInterpolatePathsNV = provider.getFunctionAddress("glInterpolatePathsNV");
		glInvalidateBufferData = provider.getFunctionAddress("glInvalidateBufferData");
		glInvalidateBufferSubData = provider.getFunctionAddress("glInvalidateBufferSubData");
		glInvalidateFramebuffer = provider.getFunctionAddress("glInvalidateFramebuffer");
		glInvalidateNamedFramebufferData = provider.getFunctionAddress("glInvalidateNamedFramebufferData");
		glInvalidateNamedFramebufferSubData = provider.getFunctionAddress("glInvalidateNamedFramebufferSubData");
		glInvalidateSubFramebuffer = provider.getFunctionAddress("glInvalidateSubFramebuffer");
		glInvalidateTexImage = provider.getFunctionAddress("glInvalidateTexImage");
		glInvalidateTexSubImage = provider.getFunctionAddress("glInvalidateTexSubImage");
		glIsBuffer = provider.getFunctionAddress("glIsBuffer");
		glIsBufferARB = provider.getFunctionAddress("glIsBufferARB");
		glIsBufferResidentNV = provider.getFunctionAddress("glIsBufferResidentNV");
		glIsCommandListNV = provider.getFunctionAddress("glIsCommandListNV");
		glIsEnabled = provider.getFunctionAddress("glIsEnabled");
		glIsEnabledIndexedEXT = provider.getFunctionAddress("glIsEnabledIndexedEXT");
		glIsEnabledi = provider.getFunctionAddress("glIsEnabledi");
		glIsFenceNV = provider.getFunctionAddress("glIsFenceNV");
		glIsFramebuffer = provider.getFunctionAddress("glIsFramebuffer");
		glIsFramebufferEXT = provider.getFunctionAddress("glIsFramebufferEXT");
		glIsImageHandleResidentARB = provider.getFunctionAddress("glIsImageHandleResidentARB");
		glIsImageHandleResidentNV = provider.getFunctionAddress("glIsImageHandleResidentNV");
		glIsList = getFunctionAddress(fc, provider, "glIsList");
		glIsNamedBufferResidentNV = provider.getFunctionAddress("glIsNamedBufferResidentNV");
		glIsNamedStringARB = provider.getFunctionAddress("glIsNamedStringARB");
		glIsPathNV = provider.getFunctionAddress("glIsPathNV");
		glIsPointInFillPathNV = provider.getFunctionAddress("glIsPointInFillPathNV");
		glIsPointInStrokePathNV = provider.getFunctionAddress("glIsPointInStrokePathNV");
		glIsProgram = provider.getFunctionAddress("glIsProgram");
		glIsProgramARB = provider.getFunctionAddress("glIsProgramARB");
		glIsProgramPipeline = provider.getFunctionAddress("glIsProgramPipeline");
		glIsQuery = provider.getFunctionAddress("glIsQuery");
		glIsQueryARB = provider.getFunctionAddress("glIsQueryARB");
		glIsRenderbuffer = provider.getFunctionAddress("glIsRenderbuffer");
		glIsRenderbufferEXT = provider.getFunctionAddress("glIsRenderbufferEXT");
		glIsSampler = provider.getFunctionAddress("glIsSampler");
		glIsShader = provider.getFunctionAddress("glIsShader");
		glIsStateNV = provider.getFunctionAddress("glIsStateNV");
		glIsSync = provider.getFunctionAddress("glIsSync");
		glIsTexture = provider.getFunctionAddress("glIsTexture");
		glIsTextureHandleResidentARB = provider.getFunctionAddress("glIsTextureHandleResidentARB");
		glIsTextureHandleResidentNV = provider.getFunctionAddress("glIsTextureHandleResidentNV");
		glIsTransformFeedback = provider.getFunctionAddress("glIsTransformFeedback");
		glIsTransformFeedbackNV = provider.getFunctionAddress("glIsTransformFeedbackNV");
		glIsVertexArray = provider.getFunctionAddress("glIsVertexArray");
		glLabelObjectEXT = provider.getFunctionAddress("glLabelObjectEXT");
		glLightModelf = getFunctionAddress(fc, provider, "glLightModelf");
		glLightModelfv = getFunctionAddress(fc, provider, "glLightModelfv");
		glLightModeli = getFunctionAddress(fc, provider, "glLightModeli");
		glLightModeliv = getFunctionAddress(fc, provider, "glLightModeliv");
		glLightf = getFunctionAddress(fc, provider, "glLightf");
		glLightfv = getFunctionAddress(fc, provider, "glLightfv");
		glLighti = getFunctionAddress(fc, provider, "glLighti");
		glLightiv = getFunctionAddress(fc, provider, "glLightiv");
		glLineStipple = getFunctionAddress(fc, provider, "glLineStipple");
		glLineWidth = provider.getFunctionAddress("glLineWidth");
		glLinkProgram = provider.getFunctionAddress("glLinkProgram");
		glLinkProgramARB = provider.getFunctionAddress("glLinkProgramARB");
		glListBase = getFunctionAddress(fc, provider, "glListBase");
		glListDrawCommandsStatesClientNV = provider.getFunctionAddress("glListDrawCommandsStatesClientNV");
		glLoadIdentity = getFunctionAddress(fc, provider, "glLoadIdentity");
		glLoadMatrixd = getFunctionAddress(fc, provider, "glLoadMatrixd");
		glLoadMatrixf = getFunctionAddress(fc, provider, "glLoadMatrixf");
		glLoadName = getFunctionAddress(fc, provider, "glLoadName");
		glLoadTransposeMatrixd = getFunctionAddress(fc, provider, "glLoadTransposeMatrixd");
		glLoadTransposeMatrixdARB = provider.getFunctionAddress("glLoadTransposeMatrixdARB");
		glLoadTransposeMatrixf = getFunctionAddress(fc, provider, "glLoadTransposeMatrixf");
		glLoadTransposeMatrixfARB = provider.getFunctionAddress("glLoadTransposeMatrixfARB");
		glLockArraysEXT = provider.getFunctionAddress("glLockArraysEXT");
		glLogicOp = provider.getFunctionAddress("glLogicOp");
		glMakeBufferNonResidentNV = provider.getFunctionAddress("glMakeBufferNonResidentNV");
		glMakeBufferResidentNV = provider.getFunctionAddress("glMakeBufferResidentNV");
		glMakeImageHandleNonResidentARB = provider.getFunctionAddress("glMakeImageHandleNonResidentARB");
		glMakeImageHandleNonResidentNV = provider.getFunctionAddress("glMakeImageHandleNonResidentNV");
		glMakeImageHandleResidentARB = provider.getFunctionAddress("glMakeImageHandleResidentARB");
		glMakeImageHandleResidentNV = provider.getFunctionAddress("glMakeImageHandleResidentNV");
		glMakeNamedBufferNonResidentNV = provider.getFunctionAddress("glMakeNamedBufferNonResidentNV");
		glMakeNamedBufferResidentNV = provider.getFunctionAddress("glMakeNamedBufferResidentNV");
		glMakeTextureHandleNonResidentARB = provider.getFunctionAddress("glMakeTextureHandleNonResidentARB");
		glMakeTextureHandleNonResidentNV = provider.getFunctionAddress("glMakeTextureHandleNonResidentNV");
		glMakeTextureHandleResidentARB = provider.getFunctionAddress("glMakeTextureHandleResidentARB");
		glMakeTextureHandleResidentNV = provider.getFunctionAddress("glMakeTextureHandleResidentNV");
		glMap1d = getFunctionAddress(fc, provider, "glMap1d");
		glMap1f = getFunctionAddress(fc, provider, "glMap1f");
		glMap2d = getFunctionAddress(fc, provider, "glMap2d");
		glMap2f = getFunctionAddress(fc, provider, "glMap2f");
		glMapBuffer = provider.getFunctionAddress("glMapBuffer");
		glMapBufferARB = provider.getFunctionAddress("glMapBufferARB");
		glMapBufferRange = provider.getFunctionAddress("glMapBufferRange");
		glMapGrid1d = getFunctionAddress(fc, provider, "glMapGrid1d");
		glMapGrid1f = getFunctionAddress(fc, provider, "glMapGrid1f");
		glMapGrid2d = getFunctionAddress(fc, provider, "glMapGrid2d");
		glMapGrid2f = getFunctionAddress(fc, provider, "glMapGrid2f");
		glMapNamedBuffer = provider.getFunctionAddress("glMapNamedBuffer");
		glMapNamedBufferEXT = provider.getFunctionAddress("glMapNamedBufferEXT");
		glMapNamedBufferRange = provider.getFunctionAddress("glMapNamedBufferRange");
		glMapNamedBufferRangeEXT = provider.getFunctionAddress("glMapNamedBufferRangeEXT");
		glMapTexture2DINTEL = provider.getFunctionAddress("glMapTexture2DINTEL");
		glMaterialf = getFunctionAddress(fc, provider, "glMaterialf");
		glMaterialfv = getFunctionAddress(fc, provider, "glMaterialfv");
		glMateriali = getFunctionAddress(fc, provider, "glMateriali");
		glMaterialiv = getFunctionAddress(fc, provider, "glMaterialiv");
		glMatrixFrustumEXT = provider.getFunctionAddress("glMatrixFrustumEXT");
		glMatrixIndexPointerARB = provider.getFunctionAddress("glMatrixIndexPointerARB");
		glMatrixIndexubvARB = provider.getFunctionAddress("glMatrixIndexubvARB");
		glMatrixIndexuivARB = provider.getFunctionAddress("glMatrixIndexuivARB");
		glMatrixIndexusvARB = provider.getFunctionAddress("glMatrixIndexusvARB");
		glMatrixLoad3x2fNV = provider.getFunctionAddress("glMatrixLoad3x2fNV");
		glMatrixLoad3x3fNV = provider.getFunctionAddress("glMatrixLoad3x3fNV");
		glMatrixLoadIdentityEXT = provider.getFunctionAddress("glMatrixLoadIdentityEXT");
		glMatrixLoadTranspose3x3fNV = provider.getFunctionAddress("glMatrixLoadTranspose3x3fNV");
		glMatrixLoadTransposedEXT = provider.getFunctionAddress("glMatrixLoadTransposedEXT");
		glMatrixLoadTransposefEXT = provider.getFunctionAddress("glMatrixLoadTransposefEXT");
		glMatrixLoaddEXT = provider.getFunctionAddress("glMatrixLoaddEXT");
		glMatrixLoadfEXT = provider.getFunctionAddress("glMatrixLoadfEXT");
		glMatrixMode = getFunctionAddress(fc, provider, "glMatrixMode");
		glMatrixMult3x2fNV = provider.getFunctionAddress("glMatrixMult3x2fNV");
		glMatrixMult3x3fNV = provider.getFunctionAddress("glMatrixMult3x3fNV");
		glMatrixMultTranspose3x3fNV = provider.getFunctionAddress("glMatrixMultTranspose3x3fNV");
		glMatrixMultTransposedEXT = provider.getFunctionAddress("glMatrixMultTransposedEXT");
		glMatrixMultTransposefEXT = provider.getFunctionAddress("glMatrixMultTransposefEXT");
		glMatrixMultdEXT = provider.getFunctionAddress("glMatrixMultdEXT");
		glMatrixMultfEXT = provider.getFunctionAddress("glMatrixMultfEXT");
		glMatrixOrthoEXT = provider.getFunctionAddress("glMatrixOrthoEXT");
		glMatrixPopEXT = provider.getFunctionAddress("glMatrixPopEXT");
		glMatrixPushEXT = provider.getFunctionAddress("glMatrixPushEXT");
		glMatrixRotatedEXT = provider.getFunctionAddress("glMatrixRotatedEXT");
		glMatrixRotatefEXT = provider.getFunctionAddress("glMatrixRotatefEXT");
		glMatrixScaledEXT = provider.getFunctionAddress("glMatrixScaledEXT");
		glMatrixScalefEXT = provider.getFunctionAddress("glMatrixScalefEXT");
		glMatrixTranslatedEXT = provider.getFunctionAddress("glMatrixTranslatedEXT");
		glMatrixTranslatefEXT = provider.getFunctionAddress("glMatrixTranslatefEXT");
		glMaxShaderCompilerThreadsARB = provider.getFunctionAddress("glMaxShaderCompilerThreadsARB");
		glMemoryBarrier = provider.getFunctionAddress("glMemoryBarrier");
		glMemoryBarrierByRegion = provider.getFunctionAddress("glMemoryBarrierByRegion");
		glMemoryBarrierEXT = provider.getFunctionAddress("glMemoryBarrierEXT");
		glMinSampleShading = provider.getFunctionAddress("glMinSampleShading");
		glMinSampleShadingARB = provider.getFunctionAddress("glMinSampleShadingARB");
		glMinmax = getFunctionAddress(fc, provider, "glMinmax");
		glMultMatrixd = getFunctionAddress(fc, provider, "glMultMatrixd");
		glMultMatrixf = getFunctionAddress(fc, provider, "glMultMatrixf");
		glMultTransposeMatrixd = getFunctionAddress(fc, provider, "glMultTransposeMatrixd");
		glMultTransposeMatrixdARB = provider.getFunctionAddress("glMultTransposeMatrixdARB");
		glMultTransposeMatrixf = getFunctionAddress(fc, provider, "glMultTransposeMatrixf");
		glMultTransposeMatrixfARB = provider.getFunctionAddress("glMultTransposeMatrixfARB");
		glMultiDrawArrays = provider.getFunctionAddress("glMultiDrawArrays");
		glMultiDrawArraysIndirect = provider.getFunctionAddress("glMultiDrawArraysIndirect");
		glMultiDrawArraysIndirectBindlessCountNV = provider.getFunctionAddress("glMultiDrawArraysIndirectBindlessCountNV");
		glMultiDrawArraysIndirectBindlessNV = provider.getFunctionAddress("glMultiDrawArraysIndirectBindlessNV");
		glMultiDrawArraysIndirectCountARB = provider.getFunctionAddress("glMultiDrawArraysIndirectCountARB");
		glMultiDrawElements = provider.getFunctionAddress("glMultiDrawElements");
		glMultiDrawElementsBaseVertex = provider.getFunctionAddress("glMultiDrawElementsBaseVertex");
		glMultiDrawElementsIndirect = provider.getFunctionAddress("glMultiDrawElementsIndirect");
		glMultiDrawElementsIndirectBindlessCountNV = provider.getFunctionAddress("glMultiDrawElementsIndirectBindlessCountNV");
		glMultiDrawElementsIndirectBindlessNV = provider.getFunctionAddress("glMultiDrawElementsIndirectBindlessNV");
		glMultiDrawElementsIndirectCountARB = provider.getFunctionAddress("glMultiDrawElementsIndirectCountARB");
		glMultiTexBufferEXT = provider.getFunctionAddress("glMultiTexBufferEXT");
		glMultiTexCoord1d = getFunctionAddress(fc, provider, "glMultiTexCoord1d");
		glMultiTexCoord1dARB = provider.getFunctionAddress("glMultiTexCoord1dARB");
		glMultiTexCoord1dv = getFunctionAddress(fc, provider, "glMultiTexCoord1dv");
		glMultiTexCoord1dvARB = provider.getFunctionAddress("glMultiTexCoord1dvARB");
		glMultiTexCoord1f = getFunctionAddress(fc, provider, "glMultiTexCoord1f");
		glMultiTexCoord1fARB = provider.getFunctionAddress("glMultiTexCoord1fARB");
		glMultiTexCoord1fv = getFunctionAddress(fc, provider, "glMultiTexCoord1fv");
		glMultiTexCoord1fvARB = provider.getFunctionAddress("glMultiTexCoord1fvARB");
		glMultiTexCoord1hNV = provider.getFunctionAddress("glMultiTexCoord1hNV");
		glMultiTexCoord1hvNV = provider.getFunctionAddress("glMultiTexCoord1hvNV");
		glMultiTexCoord1i = getFunctionAddress(fc, provider, "glMultiTexCoord1i");
		glMultiTexCoord1iARB = provider.getFunctionAddress("glMultiTexCoord1iARB");
		glMultiTexCoord1iv = getFunctionAddress(fc, provider, "glMultiTexCoord1iv");
		glMultiTexCoord1ivARB = provider.getFunctionAddress("glMultiTexCoord1ivARB");
		glMultiTexCoord1s = getFunctionAddress(fc, provider, "glMultiTexCoord1s");
		glMultiTexCoord1sARB = provider.getFunctionAddress("glMultiTexCoord1sARB");
		glMultiTexCoord1sv = getFunctionAddress(fc, provider, "glMultiTexCoord1sv");
		glMultiTexCoord1svARB = provider.getFunctionAddress("glMultiTexCoord1svARB");
		glMultiTexCoord2d = getFunctionAddress(fc, provider, "glMultiTexCoord2d");
		glMultiTexCoord2dARB = provider.getFunctionAddress("glMultiTexCoord2dARB");
		glMultiTexCoord2dv = getFunctionAddress(fc, provider, "glMultiTexCoord2dv");
		glMultiTexCoord2dvARB = provider.getFunctionAddress("glMultiTexCoord2dvARB");
		glMultiTexCoord2f = getFunctionAddress(fc, provider, "glMultiTexCoord2f");
		glMultiTexCoord2fARB = provider.getFunctionAddress("glMultiTexCoord2fARB");
		glMultiTexCoord2fv = getFunctionAddress(fc, provider, "glMultiTexCoord2fv");
		glMultiTexCoord2fvARB = provider.getFunctionAddress("glMultiTexCoord2fvARB");
		glMultiTexCoord2hNV = provider.getFunctionAddress("glMultiTexCoord2hNV");
		glMultiTexCoord2hvNV = provider.getFunctionAddress("glMultiTexCoord2hvNV");
		glMultiTexCoord2i = getFunctionAddress(fc, provider, "glMultiTexCoord2i");
		glMultiTexCoord2iARB = provider.getFunctionAddress("glMultiTexCoord2iARB");
		glMultiTexCoord2iv = getFunctionAddress(fc, provider, "glMultiTexCoord2iv");
		glMultiTexCoord2ivARB = provider.getFunctionAddress("glMultiTexCoord2ivARB");
		glMultiTexCoord2s = getFunctionAddress(fc, provider, "glMultiTexCoord2s");
		glMultiTexCoord2sARB = provider.getFunctionAddress("glMultiTexCoord2sARB");
		glMultiTexCoord2sv = getFunctionAddress(fc, provider, "glMultiTexCoord2sv");
		glMultiTexCoord2svARB = provider.getFunctionAddress("glMultiTexCoord2svARB");
		glMultiTexCoord3d = getFunctionAddress(fc, provider, "glMultiTexCoord3d");
		glMultiTexCoord3dARB = provider.getFunctionAddress("glMultiTexCoord3dARB");
		glMultiTexCoord3dv = getFunctionAddress(fc, provider, "glMultiTexCoord3dv");
		glMultiTexCoord3dvARB = provider.getFunctionAddress("glMultiTexCoord3dvARB");
		glMultiTexCoord3f = getFunctionAddress(fc, provider, "glMultiTexCoord3f");
		glMultiTexCoord3fARB = provider.getFunctionAddress("glMultiTexCoord3fARB");
		glMultiTexCoord3fv = getFunctionAddress(fc, provider, "glMultiTexCoord3fv");
		glMultiTexCoord3fvARB = provider.getFunctionAddress("glMultiTexCoord3fvARB");
		glMultiTexCoord3hNV = provider.getFunctionAddress("glMultiTexCoord3hNV");
		glMultiTexCoord3hvNV = provider.getFunctionAddress("glMultiTexCoord3hvNV");
		glMultiTexCoord3i = getFunctionAddress(fc, provider, "glMultiTexCoord3i");
		glMultiTexCoord3iARB = provider.getFunctionAddress("glMultiTexCoord3iARB");
		glMultiTexCoord3iv = getFunctionAddress(fc, provider, "glMultiTexCoord3iv");
		glMultiTexCoord3ivARB = provider.getFunctionAddress("glMultiTexCoord3ivARB");
		glMultiTexCoord3s = getFunctionAddress(fc, provider, "glMultiTexCoord3s");
		glMultiTexCoord3sARB = provider.getFunctionAddress("glMultiTexCoord3sARB");
		glMultiTexCoord3sv = getFunctionAddress(fc, provider, "glMultiTexCoord3sv");
		glMultiTexCoord3svARB = provider.getFunctionAddress("glMultiTexCoord3svARB");
		glMultiTexCoord4d = getFunctionAddress(fc, provider, "glMultiTexCoord4d");
		glMultiTexCoord4dARB = provider.getFunctionAddress("glMultiTexCoord4dARB");
		glMultiTexCoord4dv = getFunctionAddress(fc, provider, "glMultiTexCoord4dv");
		glMultiTexCoord4dvARB = provider.getFunctionAddress("glMultiTexCoord4dvARB");
		glMultiTexCoord4f = getFunctionAddress(fc, provider, "glMultiTexCoord4f");
		glMultiTexCoord4fARB = provider.getFunctionAddress("glMultiTexCoord4fARB");
		glMultiTexCoord4fv = getFunctionAddress(fc, provider, "glMultiTexCoord4fv");
		glMultiTexCoord4fvARB = provider.getFunctionAddress("glMultiTexCoord4fvARB");
		glMultiTexCoord4hNV = provider.getFunctionAddress("glMultiTexCoord4hNV");
		glMultiTexCoord4hvNV = provider.getFunctionAddress("glMultiTexCoord4hvNV");
		glMultiTexCoord4i = getFunctionAddress(fc, provider, "glMultiTexCoord4i");
		glMultiTexCoord4iARB = provider.getFunctionAddress("glMultiTexCoord4iARB");
		glMultiTexCoord4iv = getFunctionAddress(fc, provider, "glMultiTexCoord4iv");
		glMultiTexCoord4ivARB = provider.getFunctionAddress("glMultiTexCoord4ivARB");
		glMultiTexCoord4s = getFunctionAddress(fc, provider, "glMultiTexCoord4s");
		glMultiTexCoord4sARB = provider.getFunctionAddress("glMultiTexCoord4sARB");
		glMultiTexCoord4sv = getFunctionAddress(fc, provider, "glMultiTexCoord4sv");
		glMultiTexCoord4svARB = provider.getFunctionAddress("glMultiTexCoord4svARB");
		glMultiTexCoordP1ui = getFunctionAddress(fc, provider, "glMultiTexCoordP1ui");
		glMultiTexCoordP1uiv = getFunctionAddress(fc, provider, "glMultiTexCoordP1uiv");
		glMultiTexCoordP2ui = getFunctionAddress(fc, provider, "glMultiTexCoordP2ui");
		glMultiTexCoordP2uiv = getFunctionAddress(fc, provider, "glMultiTexCoordP2uiv");
		glMultiTexCoordP3ui = getFunctionAddress(fc, provider, "glMultiTexCoordP3ui");
		glMultiTexCoordP3uiv = getFunctionAddress(fc, provider, "glMultiTexCoordP3uiv");
		glMultiTexCoordP4ui = getFunctionAddress(fc, provider, "glMultiTexCoordP4ui");
		glMultiTexCoordP4uiv = getFunctionAddress(fc, provider, "glMultiTexCoordP4uiv");
		glMultiTexCoordPointerEXT = provider.getFunctionAddress("glMultiTexCoordPointerEXT");
		glMultiTexEnvfEXT = provider.getFunctionAddress("glMultiTexEnvfEXT");
		glMultiTexEnvfvEXT = provider.getFunctionAddress("glMultiTexEnvfvEXT");
		glMultiTexEnviEXT = provider.getFunctionAddress("glMultiTexEnviEXT");
		glMultiTexEnvivEXT = provider.getFunctionAddress("glMultiTexEnvivEXT");
		glMultiTexGendEXT = provider.getFunctionAddress("glMultiTexGendEXT");
		glMultiTexGendvEXT = provider.getFunctionAddress("glMultiTexGendvEXT");
		glMultiTexGenfEXT = provider.getFunctionAddress("glMultiTexGenfEXT");
		glMultiTexGenfvEXT = provider.getFunctionAddress("glMultiTexGenfvEXT");
		glMultiTexGeniEXT = provider.getFunctionAddress("glMultiTexGeniEXT");
		glMultiTexGenivEXT = provider.getFunctionAddress("glMultiTexGenivEXT");
		glMultiTexImage1DEXT = provider.getFunctionAddress("glMultiTexImage1DEXT");
		glMultiTexImage2DEXT = provider.getFunctionAddress("glMultiTexImage2DEXT");
		glMultiTexImage3DEXT = provider.getFunctionAddress("glMultiTexImage3DEXT");
		glMultiTexParameterIivEXT = provider.getFunctionAddress("glMultiTexParameterIivEXT");
		glMultiTexParameterIuivEXT = provider.getFunctionAddress("glMultiTexParameterIuivEXT");
		glMultiTexParameterfEXT = provider.getFunctionAddress("glMultiTexParameterfEXT");
		glMultiTexParameterfvEXT = provider.getFunctionAddress("glMultiTexParameterfvEXT");
		glMultiTexParameteriEXT = provider.getFunctionAddress("glMultiTexParameteriEXT");
		glMultiTexParameterivEXT = provider.getFunctionAddress("glMultiTexParameterivEXT");
		glMultiTexRenderbufferEXT = provider.getFunctionAddress("glMultiTexRenderbufferEXT");
		glMultiTexSubImage1DEXT = provider.getFunctionAddress("glMultiTexSubImage1DEXT");
		glMultiTexSubImage2DEXT = provider.getFunctionAddress("glMultiTexSubImage2DEXT");
		glMultiTexSubImage3DEXT = provider.getFunctionAddress("glMultiTexSubImage3DEXT");
		glNamedBufferData = provider.getFunctionAddress("glNamedBufferData");
		glNamedBufferDataEXT = provider.getFunctionAddress("glNamedBufferDataEXT");
		glNamedBufferPageCommitmentARB = provider.getFunctionAddress("glNamedBufferPageCommitmentARB");
		glNamedBufferPageCommitmentEXT = provider.getFunctionAddress("glNamedBufferPageCommitmentEXT");
		glNamedBufferStorage = provider.getFunctionAddress("glNamedBufferStorage");
		glNamedBufferStorageEXT = provider.getFunctionAddress("glNamedBufferStorageEXT");
		glNamedBufferSubData = provider.getFunctionAddress("glNamedBufferSubData");
		glNamedBufferSubDataEXT = provider.getFunctionAddress("glNamedBufferSubDataEXT");
		glNamedCopyBufferSubDataEXT = provider.getFunctionAddress("glNamedCopyBufferSubDataEXT");
		glNamedFramebufferDrawBuffer = provider.getFunctionAddress("glNamedFramebufferDrawBuffer");
		glNamedFramebufferDrawBuffers = provider.getFunctionAddress("glNamedFramebufferDrawBuffers");
		glNamedFramebufferParameteri = provider.getFunctionAddress("glNamedFramebufferParameteri");
		glNamedFramebufferParameteriEXT = provider.getFunctionAddress("glNamedFramebufferParameteriEXT");
		glNamedFramebufferReadBuffer = provider.getFunctionAddress("glNamedFramebufferReadBuffer");
		glNamedFramebufferRenderbuffer = provider.getFunctionAddress("glNamedFramebufferRenderbuffer");
		glNamedFramebufferRenderbufferEXT = provider.getFunctionAddress("glNamedFramebufferRenderbufferEXT");
		glNamedFramebufferSampleLocationsfvARB = provider.getFunctionAddress("glNamedFramebufferSampleLocationsfvARB");
		glNamedFramebufferSampleLocationsfvNV = provider.getFunctionAddress("glNamedFramebufferSampleLocationsfvNV");
		glNamedFramebufferTexture = provider.getFunctionAddress("glNamedFramebufferTexture");
		glNamedFramebufferTexture1DEXT = provider.getFunctionAddress("glNamedFramebufferTexture1DEXT");
		glNamedFramebufferTexture2DEXT = provider.getFunctionAddress("glNamedFramebufferTexture2DEXT");
		glNamedFramebufferTexture3DEXT = provider.getFunctionAddress("glNamedFramebufferTexture3DEXT");
		glNamedFramebufferTextureEXT = provider.getFunctionAddress("glNamedFramebufferTextureEXT");
		glNamedFramebufferTextureFaceEXT = provider.getFunctionAddress("glNamedFramebufferTextureFaceEXT");
		glNamedFramebufferTextureLayer = provider.getFunctionAddress("glNamedFramebufferTextureLayer");
		glNamedFramebufferTextureLayerEXT = provider.getFunctionAddress("glNamedFramebufferTextureLayerEXT");
		glNamedProgramLocalParameter4dEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4dEXT");
		glNamedProgramLocalParameter4dvEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4dvEXT");
		glNamedProgramLocalParameter4fEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4fEXT");
		glNamedProgramLocalParameter4fvEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4fvEXT");
		glNamedProgramLocalParameterI4iEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4iEXT");
		glNamedProgramLocalParameterI4ivEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4ivEXT");
		glNamedProgramLocalParameterI4uiEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4uiEXT");
		glNamedProgramLocalParameterI4uivEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4uivEXT");
		glNamedProgramLocalParameters4fvEXT = provider.getFunctionAddress("glNamedProgramLocalParameters4fvEXT");
		glNamedProgramLocalParametersI4ivEXT = provider.getFunctionAddress("glNamedProgramLocalParametersI4ivEXT");
		glNamedProgramLocalParametersI4uivEXT = provider.getFunctionAddress("glNamedProgramLocalParametersI4uivEXT");
		glNamedProgramStringEXT = provider.getFunctionAddress("glNamedProgramStringEXT");
		glNamedRenderbufferStorage = provider.getFunctionAddress("glNamedRenderbufferStorage");
		glNamedRenderbufferStorageEXT = provider.getFunctionAddress("glNamedRenderbufferStorageEXT");
		glNamedRenderbufferStorageMultisample = provider.getFunctionAddress("glNamedRenderbufferStorageMultisample");
		glNamedRenderbufferStorageMultisampleCoverageEXT = provider.getFunctionAddress("glNamedRenderbufferStorageMultisampleCoverageEXT");
		glNamedRenderbufferStorageMultisampleEXT = provider.getFunctionAddress("glNamedRenderbufferStorageMultisampleEXT");
		glNamedStringARB = provider.getFunctionAddress("glNamedStringARB");
		glNewList = getFunctionAddress(fc, provider, "glNewList");
		glNormal3b = getFunctionAddress(fc, provider, "glNormal3b");
		glNormal3bv = getFunctionAddress(fc, provider, "glNormal3bv");
		glNormal3d = getFunctionAddress(fc, provider, "glNormal3d");
		glNormal3dv = getFunctionAddress(fc, provider, "glNormal3dv");
		glNormal3f = getFunctionAddress(fc, provider, "glNormal3f");
		glNormal3fv = getFunctionAddress(fc, provider, "glNormal3fv");
		glNormal3hNV = provider.getFunctionAddress("glNormal3hNV");
		glNormal3hvNV = provider.getFunctionAddress("glNormal3hvNV");
		glNormal3i = getFunctionAddress(fc, provider, "glNormal3i");
		glNormal3iv = getFunctionAddress(fc, provider, "glNormal3iv");
		glNormal3s = getFunctionAddress(fc, provider, "glNormal3s");
		glNormal3sv = getFunctionAddress(fc, provider, "glNormal3sv");
		glNormalFormatNV = provider.getFunctionAddress("glNormalFormatNV");
		glNormalP3ui = getFunctionAddress(fc, provider, "glNormalP3ui");
		glNormalP3uiv = getFunctionAddress(fc, provider, "glNormalP3uiv");
		glNormalPointer = getFunctionAddress(fc, provider, "glNormalPointer");
		glObjectLabel = provider.getFunctionAddress("glObjectLabel");
		glObjectPtrLabel = provider.getFunctionAddress("glObjectPtrLabel");
		glOrtho = getFunctionAddress(fc, provider, "glOrtho");
		glPassThrough = getFunctionAddress(fc, provider, "glPassThrough");
		glPatchParameterfv = provider.getFunctionAddress("glPatchParameterfv");
		glPatchParameteri = provider.getFunctionAddress("glPatchParameteri");
		glPathColorGenNV = provider.getFunctionAddress("glPathColorGenNV");
		glPathCommandsNV = provider.getFunctionAddress("glPathCommandsNV");
		glPathCoordsNV = provider.getFunctionAddress("glPathCoordsNV");
		glPathCoverDepthFuncNV = provider.getFunctionAddress("glPathCoverDepthFuncNV");
		glPathDashArrayNV = provider.getFunctionAddress("glPathDashArrayNV");
		glPathFogGenNV = provider.getFunctionAddress("glPathFogGenNV");
		glPathGlyphIndexArrayNV = provider.getFunctionAddress("glPathGlyphIndexArrayNV");
		glPathGlyphIndexRangeNV = provider.getFunctionAddress("glPathGlyphIndexRangeNV");
		glPathGlyphRangeNV = provider.getFunctionAddress("glPathGlyphRangeNV");
		glPathGlyphsNV = provider.getFunctionAddress("glPathGlyphsNV");
		glPathMemoryGlyphIndexArrayNV = provider.getFunctionAddress("glPathMemoryGlyphIndexArrayNV");
		glPathParameterfNV = provider.getFunctionAddress("glPathParameterfNV");
		glPathParameterfvNV = provider.getFunctionAddress("glPathParameterfvNV");
		glPathParameteriNV = provider.getFunctionAddress("glPathParameteriNV");
		glPathParameterivNV = provider.getFunctionAddress("glPathParameterivNV");
		glPathStencilDepthOffsetNV = provider.getFunctionAddress("glPathStencilDepthOffsetNV");
		glPathStencilFuncNV = provider.getFunctionAddress("glPathStencilFuncNV");
		glPathStringNV = provider.getFunctionAddress("glPathStringNV");
		glPathSubCommandsNV = provider.getFunctionAddress("glPathSubCommandsNV");
		glPathSubCoordsNV = provider.getFunctionAddress("glPathSubCoordsNV");
		glPathTexGenNV = provider.getFunctionAddress("glPathTexGenNV");
		glPauseTransformFeedback = provider.getFunctionAddress("glPauseTransformFeedback");
		glPauseTransformFeedbackNV = provider.getFunctionAddress("glPauseTransformFeedbackNV");
		glPixelDataRangeNV = provider.getFunctionAddress("glPixelDataRangeNV");
		glPixelMapfv = getFunctionAddress(fc, provider, "glPixelMapfv");
		glPixelMapuiv = getFunctionAddress(fc, provider, "glPixelMapuiv");
		glPixelMapusv = getFunctionAddress(fc, provider, "glPixelMapusv");
		glPixelStoref = provider.getFunctionAddress("glPixelStoref");
		glPixelStorei = provider.getFunctionAddress("glPixelStorei");
		glPixelTransferf = getFunctionAddress(fc, provider, "glPixelTransferf");
		glPixelTransferi = getFunctionAddress(fc, provider, "glPixelTransferi");
		glPixelZoom = getFunctionAddress(fc, provider, "glPixelZoom");
		glPointAlongPathNV = provider.getFunctionAddress("glPointAlongPathNV");
		glPointParameterf = provider.getFunctionAddress("glPointParameterf");
		glPointParameterfARB = provider.getFunctionAddress("glPointParameterfARB");
		glPointParameterfEXT = provider.getFunctionAddress("glPointParameterfEXT");
		glPointParameterfv = provider.getFunctionAddress("glPointParameterfv");
		glPointParameterfvARB = provider.getFunctionAddress("glPointParameterfvARB");
		glPointParameterfvEXT = provider.getFunctionAddress("glPointParameterfvEXT");
		glPointParameteri = provider.getFunctionAddress("glPointParameteri");
		glPointParameteriNV = provider.getFunctionAddress("glPointParameteriNV");
		glPointParameteriv = provider.getFunctionAddress("glPointParameteriv");
		glPointParameterivNV = provider.getFunctionAddress("glPointParameterivNV");
		glPointSize = provider.getFunctionAddress("glPointSize");
		glPolygonMode = provider.getFunctionAddress("glPolygonMode");
		glPolygonOffset = provider.getFunctionAddress("glPolygonOffset");
		glPolygonOffsetClampEXT = provider.getFunctionAddress("glPolygonOffsetClampEXT");
		glPolygonStipple = getFunctionAddress(fc, provider, "glPolygonStipple");
		glPopAttrib = getFunctionAddress(fc, provider, "glPopAttrib");
		glPopClientAttrib = getFunctionAddress(fc, provider, "glPopClientAttrib");
		glPopDebugGroup = provider.getFunctionAddress("glPopDebugGroup");
		glPopGroupMarkerEXT = provider.getFunctionAddress("glPopGroupMarkerEXT");
		glPopMatrix = getFunctionAddress(fc, provider, "glPopMatrix");
		glPopName = getFunctionAddress(fc, provider, "glPopName");
		glPrimitiveBoundingBoxARB = provider.getFunctionAddress("glPrimitiveBoundingBoxARB");
		glPrimitiveRestartIndex = provider.getFunctionAddress("glPrimitiveRestartIndex");
		glPrimitiveRestartIndexNV = provider.getFunctionAddress("glPrimitiveRestartIndexNV");
		glPrimitiveRestartNV = provider.getFunctionAddress("glPrimitiveRestartNV");
		glPrioritizeTextures = getFunctionAddress(fc, provider, "glPrioritizeTextures");
		glProgramBinary = provider.getFunctionAddress("glProgramBinary");
		glProgramEnvParameter4dARB = provider.getFunctionAddress("glProgramEnvParameter4dARB");
		glProgramEnvParameter4dvARB = provider.getFunctionAddress("glProgramEnvParameter4dvARB");
		glProgramEnvParameter4fARB = provider.getFunctionAddress("glProgramEnvParameter4fARB");
		glProgramEnvParameter4fvARB = provider.getFunctionAddress("glProgramEnvParameter4fvARB");
		glProgramEnvParameters4fvEXT = provider.getFunctionAddress("glProgramEnvParameters4fvEXT");
		glProgramLocalParameter4dARB = provider.getFunctionAddress("glProgramLocalParameter4dARB");
		glProgramLocalParameter4dvARB = provider.getFunctionAddress("glProgramLocalParameter4dvARB");
		glProgramLocalParameter4fARB = provider.getFunctionAddress("glProgramLocalParameter4fARB");
		glProgramLocalParameter4fvARB = provider.getFunctionAddress("glProgramLocalParameter4fvARB");
		glProgramLocalParameters4fvEXT = provider.getFunctionAddress("glProgramLocalParameters4fvEXT");
		glProgramParameteri = provider.getFunctionAddress("glProgramParameteri");
		glProgramParameteriARB = provider.getFunctionAddress("glProgramParameteriARB");
		glProgramParameteriEXT = provider.getFunctionAddress("glProgramParameteriEXT");
		glProgramPathFragmentInputGenNV = provider.getFunctionAddress("glProgramPathFragmentInputGenNV");
		glProgramStringARB = provider.getFunctionAddress("glProgramStringARB");
		glProgramUniform1d = provider.getFunctionAddress("glProgramUniform1d");
		glProgramUniform1dEXT = provider.getFunctionAddress("glProgramUniform1dEXT");
		glProgramUniform1dv = provider.getFunctionAddress("glProgramUniform1dv");
		glProgramUniform1dvEXT = provider.getFunctionAddress("glProgramUniform1dvEXT");
		glProgramUniform1f = provider.getFunctionAddress("glProgramUniform1f");
		glProgramUniform1fEXT = provider.getFunctionAddress("glProgramUniform1fEXT");
		glProgramUniform1fv = provider.getFunctionAddress("glProgramUniform1fv");
		glProgramUniform1fvEXT = provider.getFunctionAddress("glProgramUniform1fvEXT");
		glProgramUniform1i = provider.getFunctionAddress("glProgramUniform1i");
		glProgramUniform1i64ARB = provider.getFunctionAddress("glProgramUniform1i64ARB");
		glProgramUniform1i64NV = provider.getFunctionAddress("glProgramUniform1i64NV");
		glProgramUniform1i64vARB = provider.getFunctionAddress("glProgramUniform1i64vARB");
		glProgramUniform1i64vNV = provider.getFunctionAddress("glProgramUniform1i64vNV");
		glProgramUniform1iEXT = provider.getFunctionAddress("glProgramUniform1iEXT");
		glProgramUniform1iv = provider.getFunctionAddress("glProgramUniform1iv");
		glProgramUniform1ivEXT = provider.getFunctionAddress("glProgramUniform1ivEXT");
		glProgramUniform1ui = provider.getFunctionAddress("glProgramUniform1ui");
		glProgramUniform1ui64ARB = provider.getFunctionAddress("glProgramUniform1ui64ARB");
		glProgramUniform1ui64NV = provider.getFunctionAddress("glProgramUniform1ui64NV");
		glProgramUniform1ui64vARB = provider.getFunctionAddress("glProgramUniform1ui64vARB");
		glProgramUniform1ui64vNV = provider.getFunctionAddress("glProgramUniform1ui64vNV");
		glProgramUniform1uiEXT = provider.getFunctionAddress("glProgramUniform1uiEXT");
		glProgramUniform1uiv = provider.getFunctionAddress("glProgramUniform1uiv");
		glProgramUniform1uivEXT = provider.getFunctionAddress("glProgramUniform1uivEXT");
		glProgramUniform2d = provider.getFunctionAddress("glProgramUniform2d");
		glProgramUniform2dEXT = provider.getFunctionAddress("glProgramUniform2dEXT");
		glProgramUniform2dv = provider.getFunctionAddress("glProgramUniform2dv");
		glProgramUniform2dvEXT = provider.getFunctionAddress("glProgramUniform2dvEXT");
		glProgramUniform2f = provider.getFunctionAddress("glProgramUniform2f");
		glProgramUniform2fEXT = provider.getFunctionAddress("glProgramUniform2fEXT");
		glProgramUniform2fv = provider.getFunctionAddress("glProgramUniform2fv");
		glProgramUniform2fvEXT = provider.getFunctionAddress("glProgramUniform2fvEXT");
		glProgramUniform2i = provider.getFunctionAddress("glProgramUniform2i");
		glProgramUniform2i64ARB = provider.getFunctionAddress("glProgramUniform2i64ARB");
		glProgramUniform2i64NV = provider.getFunctionAddress("glProgramUniform2i64NV");
		glProgramUniform2i64vARB = provider.getFunctionAddress("glProgramUniform2i64vARB");
		glProgramUniform2i64vNV = provider.getFunctionAddress("glProgramUniform2i64vNV");
		glProgramUniform2iEXT = provider.getFunctionAddress("glProgramUniform2iEXT");
		glProgramUniform2iv = provider.getFunctionAddress("glProgramUniform2iv");
		glProgramUniform2ivEXT = provider.getFunctionAddress("glProgramUniform2ivEXT");
		glProgramUniform2ui = provider.getFunctionAddress("glProgramUniform2ui");
		glProgramUniform2ui64ARB = provider.getFunctionAddress("glProgramUniform2ui64ARB");
		glProgramUniform2ui64NV = provider.getFunctionAddress("glProgramUniform2ui64NV");
		glProgramUniform2ui64vARB = provider.getFunctionAddress("glProgramUniform2ui64vARB");
		glProgramUniform2ui64vNV = provider.getFunctionAddress("glProgramUniform2ui64vNV");
		glProgramUniform2uiEXT = provider.getFunctionAddress("glProgramUniform2uiEXT");
		glProgramUniform2uiv = provider.getFunctionAddress("glProgramUniform2uiv");
		glProgramUniform2uivEXT = provider.getFunctionAddress("glProgramUniform2uivEXT");
		glProgramUniform3d = provider.getFunctionAddress("glProgramUniform3d");
		glProgramUniform3dEXT = provider.getFunctionAddress("glProgramUniform3dEXT");
		glProgramUniform3dv = provider.getFunctionAddress("glProgramUniform3dv");
		glProgramUniform3dvEXT = provider.getFunctionAddress("glProgramUniform3dvEXT");
		glProgramUniform3f = provider.getFunctionAddress("glProgramUniform3f");
		glProgramUniform3fEXT = provider.getFunctionAddress("glProgramUniform3fEXT");
		glProgramUniform3fv = provider.getFunctionAddress("glProgramUniform3fv");
		glProgramUniform3fvEXT = provider.getFunctionAddress("glProgramUniform3fvEXT");
		glProgramUniform3i = provider.getFunctionAddress("glProgramUniform3i");
		glProgramUniform3i64ARB = provider.getFunctionAddress("glProgramUniform3i64ARB");
		glProgramUniform3i64NV = provider.getFunctionAddress("glProgramUniform3i64NV");
		glProgramUniform3i64vARB = provider.getFunctionAddress("glProgramUniform3i64vARB");
		glProgramUniform3i64vNV = provider.getFunctionAddress("glProgramUniform3i64vNV");
		glProgramUniform3iEXT = provider.getFunctionAddress("glProgramUniform3iEXT");
		glProgramUniform3iv = provider.getFunctionAddress("glProgramUniform3iv");
		glProgramUniform3ivEXT = provider.getFunctionAddress("glProgramUniform3ivEXT");
		glProgramUniform3ui = provider.getFunctionAddress("glProgramUniform3ui");
		glProgramUniform3ui64ARB = provider.getFunctionAddress("glProgramUniform3ui64ARB");
		glProgramUniform3ui64NV = provider.getFunctionAddress("glProgramUniform3ui64NV");
		glProgramUniform3ui64vARB = provider.getFunctionAddress("glProgramUniform3ui64vARB");
		glProgramUniform3ui64vNV = provider.getFunctionAddress("glProgramUniform3ui64vNV");
		glProgramUniform3uiEXT = provider.getFunctionAddress("glProgramUniform3uiEXT");
		glProgramUniform3uiv = provider.getFunctionAddress("glProgramUniform3uiv");
		glProgramUniform3uivEXT = provider.getFunctionAddress("glProgramUniform3uivEXT");
		glProgramUniform4d = provider.getFunctionAddress("glProgramUniform4d");
		glProgramUniform4dEXT = provider.getFunctionAddress("glProgramUniform4dEXT");
		glProgramUniform4dv = provider.getFunctionAddress("glProgramUniform4dv");
		glProgramUniform4dvEXT = provider.getFunctionAddress("glProgramUniform4dvEXT");
		glProgramUniform4f = provider.getFunctionAddress("glProgramUniform4f");
		glProgramUniform4fEXT = provider.getFunctionAddress("glProgramUniform4fEXT");
		glProgramUniform4fv = provider.getFunctionAddress("glProgramUniform4fv");
		glProgramUniform4fvEXT = provider.getFunctionAddress("glProgramUniform4fvEXT");
		glProgramUniform4i = provider.getFunctionAddress("glProgramUniform4i");
		glProgramUniform4i64ARB = provider.getFunctionAddress("glProgramUniform4i64ARB");
		glProgramUniform4i64NV = provider.getFunctionAddress("glProgramUniform4i64NV");
		glProgramUniform4i64vARB = provider.getFunctionAddress("glProgramUniform4i64vARB");
		glProgramUniform4i64vNV = provider.getFunctionAddress("glProgramUniform4i64vNV");
		glProgramUniform4iEXT = provider.getFunctionAddress("glProgramUniform4iEXT");
		glProgramUniform4iv = provider.getFunctionAddress("glProgramUniform4iv");
		glProgramUniform4ivEXT = provider.getFunctionAddress("glProgramUniform4ivEXT");
		glProgramUniform4ui = provider.getFunctionAddress("glProgramUniform4ui");
		glProgramUniform4ui64ARB = provider.getFunctionAddress("glProgramUniform4ui64ARB");
		glProgramUniform4ui64NV = provider.getFunctionAddress("glProgramUniform4ui64NV");
		glProgramUniform4ui64vARB = provider.getFunctionAddress("glProgramUniform4ui64vARB");
		glProgramUniform4ui64vNV = provider.getFunctionAddress("glProgramUniform4ui64vNV");
		glProgramUniform4uiEXT = provider.getFunctionAddress("glProgramUniform4uiEXT");
		glProgramUniform4uiv = provider.getFunctionAddress("glProgramUniform4uiv");
		glProgramUniform4uivEXT = provider.getFunctionAddress("glProgramUniform4uivEXT");
		glProgramUniformHandleui64ARB = provider.getFunctionAddress("glProgramUniformHandleui64ARB");
		glProgramUniformHandleui64NV = provider.getFunctionAddress("glProgramUniformHandleui64NV");
		glProgramUniformHandleui64vARB = provider.getFunctionAddress("glProgramUniformHandleui64vARB");
		glProgramUniformHandleui64vNV = provider.getFunctionAddress("glProgramUniformHandleui64vNV");
		glProgramUniformMatrix2dv = provider.getFunctionAddress("glProgramUniformMatrix2dv");
		glProgramUniformMatrix2dvEXT = provider.getFunctionAddress("glProgramUniformMatrix2dvEXT");
		glProgramUniformMatrix2fv = provider.getFunctionAddress("glProgramUniformMatrix2fv");
		glProgramUniformMatrix2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2fvEXT");
		glProgramUniformMatrix2x3dv = provider.getFunctionAddress("glProgramUniformMatrix2x3dv");
		glProgramUniformMatrix2x3dvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x3dvEXT");
		glProgramUniformMatrix2x3fv = provider.getFunctionAddress("glProgramUniformMatrix2x3fv");
		glProgramUniformMatrix2x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x3fvEXT");
		glProgramUniformMatrix2x4dv = provider.getFunctionAddress("glProgramUniformMatrix2x4dv");
		glProgramUniformMatrix2x4dvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x4dvEXT");
		glProgramUniformMatrix2x4fv = provider.getFunctionAddress("glProgramUniformMatrix2x4fv");
		glProgramUniformMatrix2x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x4fvEXT");
		glProgramUniformMatrix3dv = provider.getFunctionAddress("glProgramUniformMatrix3dv");
		glProgramUniformMatrix3dvEXT = provider.getFunctionAddress("glProgramUniformMatrix3dvEXT");
		glProgramUniformMatrix3fv = provider.getFunctionAddress("glProgramUniformMatrix3fv");
		glProgramUniformMatrix3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3fvEXT");
		glProgramUniformMatrix3x2dv = provider.getFunctionAddress("glProgramUniformMatrix3x2dv");
		glProgramUniformMatrix3x2dvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x2dvEXT");
		glProgramUniformMatrix3x2fv = provider.getFunctionAddress("glProgramUniformMatrix3x2fv");
		glProgramUniformMatrix3x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x2fvEXT");
		glProgramUniformMatrix3x4dv = provider.getFunctionAddress("glProgramUniformMatrix3x4dv");
		glProgramUniformMatrix3x4dvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x4dvEXT");
		glProgramUniformMatrix3x4fv = provider.getFunctionAddress("glProgramUniformMatrix3x4fv");
		glProgramUniformMatrix3x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x4fvEXT");
		glProgramUniformMatrix4dv = provider.getFunctionAddress("glProgramUniformMatrix4dv");
		glProgramUniformMatrix4dvEXT = provider.getFunctionAddress("glProgramUniformMatrix4dvEXT");
		glProgramUniformMatrix4fv = provider.getFunctionAddress("glProgramUniformMatrix4fv");
		glProgramUniformMatrix4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4fvEXT");
		glProgramUniformMatrix4x2dv = provider.getFunctionAddress("glProgramUniformMatrix4x2dv");
		glProgramUniformMatrix4x2dvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x2dvEXT");
		glProgramUniformMatrix4x2fv = provider.getFunctionAddress("glProgramUniformMatrix4x2fv");
		glProgramUniformMatrix4x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x2fvEXT");
		glProgramUniformMatrix4x3dv = provider.getFunctionAddress("glProgramUniformMatrix4x3dv");
		glProgramUniformMatrix4x3dvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x3dvEXT");
		glProgramUniformMatrix4x3fv = provider.getFunctionAddress("glProgramUniformMatrix4x3fv");
		glProgramUniformMatrix4x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x3fvEXT");
		glProgramUniformui64NV = provider.getFunctionAddress("glProgramUniformui64NV");
		glProgramUniformui64vNV = provider.getFunctionAddress("glProgramUniformui64vNV");
		glProvokingVertex = provider.getFunctionAddress("glProvokingVertex");
		glProvokingVertexEXT = provider.getFunctionAddress("glProvokingVertexEXT");
		glPushAttrib = getFunctionAddress(fc, provider, "glPushAttrib");
		glPushClientAttrib = getFunctionAddress(fc, provider, "glPushClientAttrib");
		glPushClientAttribDefaultEXT = provider.getFunctionAddress("glPushClientAttribDefaultEXT");
		glPushDebugGroup = provider.getFunctionAddress("glPushDebugGroup");
		glPushGroupMarkerEXT = provider.getFunctionAddress("glPushGroupMarkerEXT");
		glPushMatrix = getFunctionAddress(fc, provider, "glPushMatrix");
		glPushName = getFunctionAddress(fc, provider, "glPushName");
		glQueryCounter = provider.getFunctionAddress("glQueryCounter");
		glQueryObjectParameteruiAMD = provider.getFunctionAddress("glQueryObjectParameteruiAMD");
		glRasterPos2d = getFunctionAddress(fc, provider, "glRasterPos2d");
		glRasterPos2dv = getFunctionAddress(fc, provider, "glRasterPos2dv");
		glRasterPos2f = getFunctionAddress(fc, provider, "glRasterPos2f");
		glRasterPos2fv = getFunctionAddress(fc, provider, "glRasterPos2fv");
		glRasterPos2i = getFunctionAddress(fc, provider, "glRasterPos2i");
		glRasterPos2iv = getFunctionAddress(fc, provider, "glRasterPos2iv");
		glRasterPos2s = getFunctionAddress(fc, provider, "glRasterPos2s");
		glRasterPos2sv = getFunctionAddress(fc, provider, "glRasterPos2sv");
		glRasterPos3d = getFunctionAddress(fc, provider, "glRasterPos3d");
		glRasterPos3dv = getFunctionAddress(fc, provider, "glRasterPos3dv");
		glRasterPos3f = getFunctionAddress(fc, provider, "glRasterPos3f");
		glRasterPos3fv = getFunctionAddress(fc, provider, "glRasterPos3fv");
		glRasterPos3i = getFunctionAddress(fc, provider, "glRasterPos3i");
		glRasterPos3iv = getFunctionAddress(fc, provider, "glRasterPos3iv");
		glRasterPos3s = getFunctionAddress(fc, provider, "glRasterPos3s");
		glRasterPos3sv = getFunctionAddress(fc, provider, "glRasterPos3sv");
		glRasterPos4d = getFunctionAddress(fc, provider, "glRasterPos4d");
		glRasterPos4dv = getFunctionAddress(fc, provider, "glRasterPos4dv");
		glRasterPos4f = getFunctionAddress(fc, provider, "glRasterPos4f");
		glRasterPos4fv = getFunctionAddress(fc, provider, "glRasterPos4fv");
		glRasterPos4i = getFunctionAddress(fc, provider, "glRasterPos4i");
		glRasterPos4iv = getFunctionAddress(fc, provider, "glRasterPos4iv");
		glRasterPos4s = getFunctionAddress(fc, provider, "glRasterPos4s");
		glRasterPos4sv = getFunctionAddress(fc, provider, "glRasterPos4sv");
		glRasterSamplesEXT = provider.getFunctionAddress("glRasterSamplesEXT");
		glReadBuffer = provider.getFunctionAddress("glReadBuffer");
		glReadPixels = provider.getFunctionAddress("glReadPixels");
		glReadnPixels = provider.getFunctionAddress("glReadnPixels");
		glReadnPixelsARB = provider.getFunctionAddress("glReadnPixelsARB");
		glRectd = getFunctionAddress(fc, provider, "glRectd");
		glRectdv = getFunctionAddress(fc, provider, "glRectdv");
		glRectf = getFunctionAddress(fc, provider, "glRectf");
		glRectfv = getFunctionAddress(fc, provider, "glRectfv");
		glRecti = getFunctionAddress(fc, provider, "glRecti");
		glRectiv = getFunctionAddress(fc, provider, "glRectiv");
		glRects = getFunctionAddress(fc, provider, "glRects");
		glRectsv = getFunctionAddress(fc, provider, "glRectsv");
		glReleaseShaderCompiler = provider.getFunctionAddress("glReleaseShaderCompiler");
		glRenderMode = getFunctionAddress(fc, provider, "glRenderMode");
		glRenderbufferStorage = provider.getFunctionAddress("glRenderbufferStorage");
		glRenderbufferStorageEXT = provider.getFunctionAddress("glRenderbufferStorageEXT");
		glRenderbufferStorageMultisample = provider.getFunctionAddress("glRenderbufferStorageMultisample");
		glRenderbufferStorageMultisampleCoverageNV = provider.getFunctionAddress("glRenderbufferStorageMultisampleCoverageNV");
		glRenderbufferStorageMultisampleEXT = provider.getFunctionAddress("glRenderbufferStorageMultisampleEXT");
		glResetHistogram = getFunctionAddress(fc, provider, "glResetHistogram");
		glResetMinmax = getFunctionAddress(fc, provider, "glResetMinmax");
		glResolveDepthValuesNV = provider.getFunctionAddress("glResolveDepthValuesNV");
		glResumeTransformFeedback = provider.getFunctionAddress("glResumeTransformFeedback");
		glResumeTransformFeedbackNV = provider.getFunctionAddress("glResumeTransformFeedbackNV");
		glRotated = getFunctionAddress(fc, provider, "glRotated");
		glRotatef = getFunctionAddress(fc, provider, "glRotatef");
		glSampleCoverage = provider.getFunctionAddress("glSampleCoverage");
		glSampleCoverageARB = provider.getFunctionAddress("glSampleCoverageARB");
		glSampleMaskIndexedNV = provider.getFunctionAddress("glSampleMaskIndexedNV");
		glSampleMaski = provider.getFunctionAddress("glSampleMaski");
		glSamplerParameterIiv = provider.getFunctionAddress("glSamplerParameterIiv");
		glSamplerParameterIuiv = provider.getFunctionAddress("glSamplerParameterIuiv");
		glSamplerParameterf = provider.getFunctionAddress("glSamplerParameterf");
		glSamplerParameterfv = provider.getFunctionAddress("glSamplerParameterfv");
		glSamplerParameteri = provider.getFunctionAddress("glSamplerParameteri");
		glSamplerParameteriv = provider.getFunctionAddress("glSamplerParameteriv");
		glScaled = getFunctionAddress(fc, provider, "glScaled");
		glScalef = getFunctionAddress(fc, provider, "glScalef");
		glScissor = provider.getFunctionAddress("glScissor");
		glScissorArrayv = provider.getFunctionAddress("glScissorArrayv");
		glScissorIndexed = provider.getFunctionAddress("glScissorIndexed");
		glScissorIndexedv = provider.getFunctionAddress("glScissorIndexedv");
		glSecondaryColor3b = getFunctionAddress(fc, provider, "glSecondaryColor3b");
		glSecondaryColor3bEXT = provider.getFunctionAddress("glSecondaryColor3bEXT");
		glSecondaryColor3bv = getFunctionAddress(fc, provider, "glSecondaryColor3bv");
		glSecondaryColor3bvEXT = provider.getFunctionAddress("glSecondaryColor3bvEXT");
		glSecondaryColor3d = getFunctionAddress(fc, provider, "glSecondaryColor3d");
		glSecondaryColor3dEXT = provider.getFunctionAddress("glSecondaryColor3dEXT");
		glSecondaryColor3dv = getFunctionAddress(fc, provider, "glSecondaryColor3dv");
		glSecondaryColor3dvEXT = provider.getFunctionAddress("glSecondaryColor3dvEXT");
		glSecondaryColor3f = getFunctionAddress(fc, provider, "glSecondaryColor3f");
		glSecondaryColor3fEXT = provider.getFunctionAddress("glSecondaryColor3fEXT");
		glSecondaryColor3fv = getFunctionAddress(fc, provider, "glSecondaryColor3fv");
		glSecondaryColor3fvEXT = provider.getFunctionAddress("glSecondaryColor3fvEXT");
		glSecondaryColor3hNV = provider.getFunctionAddress("glSecondaryColor3hNV");
		glSecondaryColor3hvNV = provider.getFunctionAddress("glSecondaryColor3hvNV");
		glSecondaryColor3i = getFunctionAddress(fc, provider, "glSecondaryColor3i");
		glSecondaryColor3iEXT = provider.getFunctionAddress("glSecondaryColor3iEXT");
		glSecondaryColor3iv = getFunctionAddress(fc, provider, "glSecondaryColor3iv");
		glSecondaryColor3ivEXT = provider.getFunctionAddress("glSecondaryColor3ivEXT");
		glSecondaryColor3s = getFunctionAddress(fc, provider, "glSecondaryColor3s");
		glSecondaryColor3sEXT = provider.getFunctionAddress("glSecondaryColor3sEXT");
		glSecondaryColor3sv = getFunctionAddress(fc, provider, "glSecondaryColor3sv");
		glSecondaryColor3svEXT = provider.getFunctionAddress("glSecondaryColor3svEXT");
		glSecondaryColor3ub = getFunctionAddress(fc, provider, "glSecondaryColor3ub");
		glSecondaryColor3ubEXT = provider.getFunctionAddress("glSecondaryColor3ubEXT");
		glSecondaryColor3ubv = getFunctionAddress(fc, provider, "glSecondaryColor3ubv");
		glSecondaryColor3ubvEXT = provider.getFunctionAddress("glSecondaryColor3ubvEXT");
		glSecondaryColor3ui = getFunctionAddress(fc, provider, "glSecondaryColor3ui");
		glSecondaryColor3uiEXT = provider.getFunctionAddress("glSecondaryColor3uiEXT");
		glSecondaryColor3uiv = getFunctionAddress(fc, provider, "glSecondaryColor3uiv");
		glSecondaryColor3uivEXT = provider.getFunctionAddress("glSecondaryColor3uivEXT");
		glSecondaryColor3us = getFunctionAddress(fc, provider, "glSecondaryColor3us");
		glSecondaryColor3usEXT = provider.getFunctionAddress("glSecondaryColor3usEXT");
		glSecondaryColor3usv = getFunctionAddress(fc, provider, "glSecondaryColor3usv");
		glSecondaryColor3usvEXT = provider.getFunctionAddress("glSecondaryColor3usvEXT");
		glSecondaryColorFormatNV = provider.getFunctionAddress("glSecondaryColorFormatNV");
		glSecondaryColorP3ui = getFunctionAddress(fc, provider, "glSecondaryColorP3ui");
		glSecondaryColorP3uiv = getFunctionAddress(fc, provider, "glSecondaryColorP3uiv");
		glSecondaryColorPointer = getFunctionAddress(fc, provider, "glSecondaryColorPointer");
		glSecondaryColorPointerEXT = provider.getFunctionAddress("glSecondaryColorPointerEXT");
		glSelectBuffer = getFunctionAddress(fc, provider, "glSelectBuffer");
		glSelectPerfMonitorCountersAMD = provider.getFunctionAddress("glSelectPerfMonitorCountersAMD");
		glSeparableFilter2D = getFunctionAddress(fc, provider, "glSeparableFilter2D");
		glSetFenceNV = provider.getFunctionAddress("glSetFenceNV");
		glSetMultisamplefvAMD = provider.getFunctionAddress("glSetMultisamplefvAMD");
		glShadeModel = getFunctionAddress(fc, provider, "glShadeModel");
		glShaderBinary = provider.getFunctionAddress("glShaderBinary");
		glShaderSource = provider.getFunctionAddress("glShaderSource");
		glShaderSourceARB = provider.getFunctionAddress("glShaderSourceARB");
		glShaderStorageBlockBinding = provider.getFunctionAddress("glShaderStorageBlockBinding");
		glSignalVkFenceNV = provider.getFunctionAddress("glSignalVkFenceNV");
		glSignalVkSemaphoreNV = provider.getFunctionAddress("glSignalVkSemaphoreNV");
		glStateCaptureNV = provider.getFunctionAddress("glStateCaptureNV");
		glStencilClearTagEXT = provider.getFunctionAddress("glStencilClearTagEXT");
		glStencilFillPathInstancedNV = provider.getFunctionAddress("glStencilFillPathInstancedNV");
		glStencilFillPathNV = provider.getFunctionAddress("glStencilFillPathNV");
		glStencilFunc = provider.getFunctionAddress("glStencilFunc");
		glStencilFuncSeparate = provider.getFunctionAddress("glStencilFuncSeparate");
		glStencilMask = provider.getFunctionAddress("glStencilMask");
		glStencilMaskSeparate = provider.getFunctionAddress("glStencilMaskSeparate");
		glStencilOp = provider.getFunctionAddress("glStencilOp");
		glStencilOpSeparate = provider.getFunctionAddress("glStencilOpSeparate");
		glStencilOpValueAMD = provider.getFunctionAddress("glStencilOpValueAMD");
		glStencilStrokePathInstancedNV = provider.getFunctionAddress("glStencilStrokePathInstancedNV");
		glStencilStrokePathNV = provider.getFunctionAddress("glStencilStrokePathNV");
		glStencilThenCoverFillPathInstancedNV = provider.getFunctionAddress("glStencilThenCoverFillPathInstancedNV");
		glStencilThenCoverFillPathNV = provider.getFunctionAddress("glStencilThenCoverFillPathNV");
		glStencilThenCoverStrokePathInstancedNV = provider.getFunctionAddress("glStencilThenCoverStrokePathInstancedNV");
		glStencilThenCoverStrokePathNV = provider.getFunctionAddress("glStencilThenCoverStrokePathNV");
		glSubpixelPrecisionBiasNV = provider.getFunctionAddress("glSubpixelPrecisionBiasNV");
		glSyncTextureINTEL = provider.getFunctionAddress("glSyncTextureINTEL");
		glTessellationFactorAMD = provider.getFunctionAddress("glTessellationFactorAMD");
		glTessellationModeAMD = provider.getFunctionAddress("glTessellationModeAMD");
		glTestFenceNV = provider.getFunctionAddress("glTestFenceNV");
		glTexBuffer = provider.getFunctionAddress("glTexBuffer");
		glTexBufferARB = provider.getFunctionAddress("glTexBufferARB");
		glTexBufferEXT = provider.getFunctionAddress("glTexBufferEXT");
		glTexBufferRange = provider.getFunctionAddress("glTexBufferRange");
		glTexCoord1d = getFunctionAddress(fc, provider, "glTexCoord1d");
		glTexCoord1dv = getFunctionAddress(fc, provider, "glTexCoord1dv");
		glTexCoord1f = getFunctionAddress(fc, provider, "glTexCoord1f");
		glTexCoord1fv = getFunctionAddress(fc, provider, "glTexCoord1fv");
		glTexCoord1hNV = provider.getFunctionAddress("glTexCoord1hNV");
		glTexCoord1hvNV = provider.getFunctionAddress("glTexCoord1hvNV");
		glTexCoord1i = getFunctionAddress(fc, provider, "glTexCoord1i");
		glTexCoord1iv = getFunctionAddress(fc, provider, "glTexCoord1iv");
		glTexCoord1s = getFunctionAddress(fc, provider, "glTexCoord1s");
		glTexCoord1sv = getFunctionAddress(fc, provider, "glTexCoord1sv");
		glTexCoord2d = getFunctionAddress(fc, provider, "glTexCoord2d");
		glTexCoord2dv = getFunctionAddress(fc, provider, "glTexCoord2dv");
		glTexCoord2f = getFunctionAddress(fc, provider, "glTexCoord2f");
		glTexCoord2fv = getFunctionAddress(fc, provider, "glTexCoord2fv");
		glTexCoord2hNV = provider.getFunctionAddress("glTexCoord2hNV");
		glTexCoord2hvNV = provider.getFunctionAddress("glTexCoord2hvNV");
		glTexCoord2i = getFunctionAddress(fc, provider, "glTexCoord2i");
		glTexCoord2iv = getFunctionAddress(fc, provider, "glTexCoord2iv");
		glTexCoord2s = getFunctionAddress(fc, provider, "glTexCoord2s");
		glTexCoord2sv = getFunctionAddress(fc, provider, "glTexCoord2sv");
		glTexCoord3d = getFunctionAddress(fc, provider, "glTexCoord3d");
		glTexCoord3dv = getFunctionAddress(fc, provider, "glTexCoord3dv");
		glTexCoord3f = getFunctionAddress(fc, provider, "glTexCoord3f");
		glTexCoord3fv = getFunctionAddress(fc, provider, "glTexCoord3fv");
		glTexCoord3hNV = provider.getFunctionAddress("glTexCoord3hNV");
		glTexCoord3hvNV = provider.getFunctionAddress("glTexCoord3hvNV");
		glTexCoord3i = getFunctionAddress(fc, provider, "glTexCoord3i");
		glTexCoord3iv = getFunctionAddress(fc, provider, "glTexCoord3iv");
		glTexCoord3s = getFunctionAddress(fc, provider, "glTexCoord3s");
		glTexCoord3sv = getFunctionAddress(fc, provider, "glTexCoord3sv");
		glTexCoord4d = getFunctionAddress(fc, provider, "glTexCoord4d");
		glTexCoord4dv = getFunctionAddress(fc, provider, "glTexCoord4dv");
		glTexCoord4f = getFunctionAddress(fc, provider, "glTexCoord4f");
		glTexCoord4fv = getFunctionAddress(fc, provider, "glTexCoord4fv");
		glTexCoord4hNV = provider.getFunctionAddress("glTexCoord4hNV");
		glTexCoord4hvNV = provider.getFunctionAddress("glTexCoord4hvNV");
		glTexCoord4i = getFunctionAddress(fc, provider, "glTexCoord4i");
		glTexCoord4iv = getFunctionAddress(fc, provider, "glTexCoord4iv");
		glTexCoord4s = getFunctionAddress(fc, provider, "glTexCoord4s");
		glTexCoord4sv = getFunctionAddress(fc, provider, "glTexCoord4sv");
		glTexCoordFormatNV = provider.getFunctionAddress("glTexCoordFormatNV");
		glTexCoordP1ui = getFunctionAddress(fc, provider, "glTexCoordP1ui");
		glTexCoordP1uiv = getFunctionAddress(fc, provider, "glTexCoordP1uiv");
		glTexCoordP2ui = getFunctionAddress(fc, provider, "glTexCoordP2ui");
		glTexCoordP2uiv = getFunctionAddress(fc, provider, "glTexCoordP2uiv");
		glTexCoordP3ui = getFunctionAddress(fc, provider, "glTexCoordP3ui");
		glTexCoordP3uiv = getFunctionAddress(fc, provider, "glTexCoordP3uiv");
		glTexCoordP4ui = getFunctionAddress(fc, provider, "glTexCoordP4ui");
		glTexCoordP4uiv = getFunctionAddress(fc, provider, "glTexCoordP4uiv");
		glTexCoordPointer = getFunctionAddress(fc, provider, "glTexCoordPointer");
		glTexEnvf = provider.getFunctionAddress("glTexEnvf");
		glTexEnvfv = provider.getFunctionAddress("glTexEnvfv");
		glTexEnvi = provider.getFunctionAddress("glTexEnvi");
		glTexEnviv = provider.getFunctionAddress("glTexEnviv");
		glTexGend = getFunctionAddress(fc, provider, "glTexGend");
		glTexGendv = getFunctionAddress(fc, provider, "glTexGendv");
		glTexGenf = getFunctionAddress(fc, provider, "glTexGenf");
		glTexGenfv = getFunctionAddress(fc, provider, "glTexGenfv");
		glTexGeni = getFunctionAddress(fc, provider, "glTexGeni");
		glTexGeniv = getFunctionAddress(fc, provider, "glTexGeniv");
		glTexImage1D = provider.getFunctionAddress("glTexImage1D");
		glTexImage2D = provider.getFunctionAddress("glTexImage2D");
		glTexImage2DMultisample = provider.getFunctionAddress("glTexImage2DMultisample");
		glTexImage2DMultisampleCoverageNV = provider.getFunctionAddress("glTexImage2DMultisampleCoverageNV");
		glTexImage3D = provider.getFunctionAddress("glTexImage3D");
		glTexImage3DMultisample = provider.getFunctionAddress("glTexImage3DMultisample");
		glTexImage3DMultisampleCoverageNV = provider.getFunctionAddress("glTexImage3DMultisampleCoverageNV");
		glTexPageCommitmentARB = provider.getFunctionAddress("glTexPageCommitmentARB");
		glTexParameterIiv = provider.getFunctionAddress("glTexParameterIiv");
		glTexParameterIivEXT = provider.getFunctionAddress("glTexParameterIivEXT");
		glTexParameterIuiv = provider.getFunctionAddress("glTexParameterIuiv");
		glTexParameterIuivEXT = provider.getFunctionAddress("glTexParameterIuivEXT");
		glTexParameterf = provider.getFunctionAddress("glTexParameterf");
		glTexParameterfv = provider.getFunctionAddress("glTexParameterfv");
		glTexParameteri = provider.getFunctionAddress("glTexParameteri");
		glTexParameteriv = provider.getFunctionAddress("glTexParameteriv");
		glTexRenderbufferNV = provider.getFunctionAddress("glTexRenderbufferNV");
		glTexStorage1D = provider.getFunctionAddress("glTexStorage1D");
		glTexStorage2D = provider.getFunctionAddress("glTexStorage2D");
		glTexStorage2DMultisample = provider.getFunctionAddress("glTexStorage2DMultisample");
		glTexStorage3D = provider.getFunctionAddress("glTexStorage3D");
		glTexStorage3DMultisample = provider.getFunctionAddress("glTexStorage3DMultisample");
		glTexStorageSparseAMD = provider.getFunctionAddress("glTexStorageSparseAMD");
		glTexSubImage1D = provider.getFunctionAddress("glTexSubImage1D");
		glTexSubImage2D = provider.getFunctionAddress("glTexSubImage2D");
		glTexSubImage3D = provider.getFunctionAddress("glTexSubImage3D");
		glTextureBarrier = provider.getFunctionAddress("glTextureBarrier");
		glTextureBarrierNV = provider.getFunctionAddress("glTextureBarrierNV");
		glTextureBuffer = provider.getFunctionAddress("glTextureBuffer");
		glTextureBufferEXT = provider.getFunctionAddress("glTextureBufferEXT");
		glTextureBufferRange = provider.getFunctionAddress("glTextureBufferRange");
		glTextureBufferRangeEXT = provider.getFunctionAddress("glTextureBufferRangeEXT");
		glTextureImage1DEXT = provider.getFunctionAddress("glTextureImage1DEXT");
		glTextureImage2DEXT = provider.getFunctionAddress("glTextureImage2DEXT");
		glTextureImage2DMultisampleCoverageNV = provider.getFunctionAddress("glTextureImage2DMultisampleCoverageNV");
		glTextureImage2DMultisampleNV = provider.getFunctionAddress("glTextureImage2DMultisampleNV");
		glTextureImage3DEXT = provider.getFunctionAddress("glTextureImage3DEXT");
		glTextureImage3DMultisampleCoverageNV = provider.getFunctionAddress("glTextureImage3DMultisampleCoverageNV");
		glTextureImage3DMultisampleNV = provider.getFunctionAddress("glTextureImage3DMultisampleNV");
		glTexturePageCommitmentEXT = provider.getFunctionAddress("glTexturePageCommitmentEXT");
		glTextureParameterIiv = provider.getFunctionAddress("glTextureParameterIiv");
		glTextureParameterIivEXT = provider.getFunctionAddress("glTextureParameterIivEXT");
		glTextureParameterIuiv = provider.getFunctionAddress("glTextureParameterIuiv");
		glTextureParameterIuivEXT = provider.getFunctionAddress("glTextureParameterIuivEXT");
		glTextureParameterf = provider.getFunctionAddress("glTextureParameterf");
		glTextureParameterfEXT = provider.getFunctionAddress("glTextureParameterfEXT");
		glTextureParameterfv = provider.getFunctionAddress("glTextureParameterfv");
		glTextureParameterfvEXT = provider.getFunctionAddress("glTextureParameterfvEXT");
		glTextureParameteri = provider.getFunctionAddress("glTextureParameteri");
		glTextureParameteriEXT = provider.getFunctionAddress("glTextureParameteriEXT");
		glTextureParameteriv = provider.getFunctionAddress("glTextureParameteriv");
		glTextureParameterivEXT = provider.getFunctionAddress("glTextureParameterivEXT");
		glTextureRenderbufferEXT = provider.getFunctionAddress("glTextureRenderbufferEXT");
		glTextureStorage1D = provider.getFunctionAddress("glTextureStorage1D");
		glTextureStorage1DEXT = provider.getFunctionAddress("glTextureStorage1DEXT");
		glTextureStorage2D = provider.getFunctionAddress("glTextureStorage2D");
		glTextureStorage2DEXT = provider.getFunctionAddress("glTextureStorage2DEXT");
		glTextureStorage2DMultisample = provider.getFunctionAddress("glTextureStorage2DMultisample");
		glTextureStorage2DMultisampleEXT = provider.getFunctionAddress("glTextureStorage2DMultisampleEXT");
		glTextureStorage3D = provider.getFunctionAddress("glTextureStorage3D");
		glTextureStorage3DEXT = provider.getFunctionAddress("glTextureStorage3DEXT");
		glTextureStorage3DMultisample = provider.getFunctionAddress("glTextureStorage3DMultisample");
		glTextureStorage3DMultisampleEXT = provider.getFunctionAddress("glTextureStorage3DMultisampleEXT");
		glTextureStorageSparseAMD = provider.getFunctionAddress("glTextureStorageSparseAMD");
		glTextureSubImage1D = provider.getFunctionAddress("glTextureSubImage1D");
		glTextureSubImage1DEXT = provider.getFunctionAddress("glTextureSubImage1DEXT");
		glTextureSubImage2D = provider.getFunctionAddress("glTextureSubImage2D");
		glTextureSubImage2DEXT = provider.getFunctionAddress("glTextureSubImage2DEXT");
		glTextureSubImage3D = provider.getFunctionAddress("glTextureSubImage3D");
		glTextureSubImage3DEXT = provider.getFunctionAddress("glTextureSubImage3DEXT");
		glTextureView = provider.getFunctionAddress("glTextureView");
		glTransformFeedbackAttribsNV = provider.getFunctionAddress("glTransformFeedbackAttribsNV");
		glTransformFeedbackBufferBase = provider.getFunctionAddress("glTransformFeedbackBufferBase");
		glTransformFeedbackBufferRange = provider.getFunctionAddress("glTransformFeedbackBufferRange");
		glTransformFeedbackStreamAttribsNV = provider.getFunctionAddress("glTransformFeedbackStreamAttribsNV");
		glTransformFeedbackVaryings = provider.getFunctionAddress("glTransformFeedbackVaryings");
		glTransformFeedbackVaryingsEXT = provider.getFunctionAddress("glTransformFeedbackVaryingsEXT");
		glTransformFeedbackVaryingsNV = provider.getFunctionAddress("glTransformFeedbackVaryingsNV");
		glTransformPathNV = provider.getFunctionAddress("glTransformPathNV");
		glTranslated = getFunctionAddress(fc, provider, "glTranslated");
		glTranslatef = getFunctionAddress(fc, provider, "glTranslatef");
		glUniform1d = provider.getFunctionAddress("glUniform1d");
		glUniform1dv = provider.getFunctionAddress("glUniform1dv");
		glUniform1f = provider.getFunctionAddress("glUniform1f");
		glUniform1fARB = provider.getFunctionAddress("glUniform1fARB");
		glUniform1fv = provider.getFunctionAddress("glUniform1fv");
		glUniform1fvARB = provider.getFunctionAddress("glUniform1fvARB");
		glUniform1i = provider.getFunctionAddress("glUniform1i");
		glUniform1i64ARB = provider.getFunctionAddress("glUniform1i64ARB");
		glUniform1i64NV = provider.getFunctionAddress("glUniform1i64NV");
		glUniform1i64vARB = provider.getFunctionAddress("glUniform1i64vARB");
		glUniform1i64vNV = provider.getFunctionAddress("glUniform1i64vNV");
		glUniform1iARB = provider.getFunctionAddress("glUniform1iARB");
		glUniform1iv = provider.getFunctionAddress("glUniform1iv");
		glUniform1ivARB = provider.getFunctionAddress("glUniform1ivARB");
		glUniform1ui = provider.getFunctionAddress("glUniform1ui");
		glUniform1ui64ARB = provider.getFunctionAddress("glUniform1ui64ARB");
		glUniform1ui64NV = provider.getFunctionAddress("glUniform1ui64NV");
		glUniform1ui64vARB = provider.getFunctionAddress("glUniform1ui64vARB");
		glUniform1ui64vNV = provider.getFunctionAddress("glUniform1ui64vNV");
		glUniform1uiEXT = provider.getFunctionAddress("glUniform1uiEXT");
		glUniform1uiv = provider.getFunctionAddress("glUniform1uiv");
		glUniform1uivEXT = provider.getFunctionAddress("glUniform1uivEXT");
		glUniform2d = provider.getFunctionAddress("glUniform2d");
		glUniform2dv = provider.getFunctionAddress("glUniform2dv");
		glUniform2f = provider.getFunctionAddress("glUniform2f");
		glUniform2fARB = provider.getFunctionAddress("glUniform2fARB");
		glUniform2fv = provider.getFunctionAddress("glUniform2fv");
		glUniform2fvARB = provider.getFunctionAddress("glUniform2fvARB");
		glUniform2i = provider.getFunctionAddress("glUniform2i");
		glUniform2i64ARB = provider.getFunctionAddress("glUniform2i64ARB");
		glUniform2i64NV = provider.getFunctionAddress("glUniform2i64NV");
		glUniform2i64vARB = provider.getFunctionAddress("glUniform2i64vARB");
		glUniform2i64vNV = provider.getFunctionAddress("glUniform2i64vNV");
		glUniform2iARB = provider.getFunctionAddress("glUniform2iARB");
		glUniform2iv = provider.getFunctionAddress("glUniform2iv");
		glUniform2ivARB = provider.getFunctionAddress("glUniform2ivARB");
		glUniform2ui = provider.getFunctionAddress("glUniform2ui");
		glUniform2ui64ARB = provider.getFunctionAddress("glUniform2ui64ARB");
		glUniform2ui64NV = provider.getFunctionAddress("glUniform2ui64NV");
		glUniform2ui64vARB = provider.getFunctionAddress("glUniform2ui64vARB");
		glUniform2ui64vNV = provider.getFunctionAddress("glUniform2ui64vNV");
		glUniform2uiEXT = provider.getFunctionAddress("glUniform2uiEXT");
		glUniform2uiv = provider.getFunctionAddress("glUniform2uiv");
		glUniform2uivEXT = provider.getFunctionAddress("glUniform2uivEXT");
		glUniform3d = provider.getFunctionAddress("glUniform3d");
		glUniform3dv = provider.getFunctionAddress("glUniform3dv");
		glUniform3f = provider.getFunctionAddress("glUniform3f");
		glUniform3fARB = provider.getFunctionAddress("glUniform3fARB");
		glUniform3fv = provider.getFunctionAddress("glUniform3fv");
		glUniform3fvARB = provider.getFunctionAddress("glUniform3fvARB");
		glUniform3i = provider.getFunctionAddress("glUniform3i");
		glUniform3i64ARB = provider.getFunctionAddress("glUniform3i64ARB");
		glUniform3i64NV = provider.getFunctionAddress("glUniform3i64NV");
		glUniform3i64vARB = provider.getFunctionAddress("glUniform3i64vARB");
		glUniform3i64vNV = provider.getFunctionAddress("glUniform3i64vNV");
		glUniform3iARB = provider.getFunctionAddress("glUniform3iARB");
		glUniform3iv = provider.getFunctionAddress("glUniform3iv");
		glUniform3ivARB = provider.getFunctionAddress("glUniform3ivARB");
		glUniform3ui = provider.getFunctionAddress("glUniform3ui");
		glUniform3ui64ARB = provider.getFunctionAddress("glUniform3ui64ARB");
		glUniform3ui64NV = provider.getFunctionAddress("glUniform3ui64NV");
		glUniform3ui64vARB = provider.getFunctionAddress("glUniform3ui64vARB");
		glUniform3ui64vNV = provider.getFunctionAddress("glUniform3ui64vNV");
		glUniform3uiEXT = provider.getFunctionAddress("glUniform3uiEXT");
		glUniform3uiv = provider.getFunctionAddress("glUniform3uiv");
		glUniform3uivEXT = provider.getFunctionAddress("glUniform3uivEXT");
		glUniform4d = provider.getFunctionAddress("glUniform4d");
		glUniform4dv = provider.getFunctionAddress("glUniform4dv");
		glUniform4f = provider.getFunctionAddress("glUniform4f");
		glUniform4fARB = provider.getFunctionAddress("glUniform4fARB");
		glUniform4fv = provider.getFunctionAddress("glUniform4fv");
		glUniform4fvARB = provider.getFunctionAddress("glUniform4fvARB");
		glUniform4i = provider.getFunctionAddress("glUniform4i");
		glUniform4i64ARB = provider.getFunctionAddress("glUniform4i64ARB");
		glUniform4i64NV = provider.getFunctionAddress("glUniform4i64NV");
		glUniform4i64vARB = provider.getFunctionAddress("glUniform4i64vARB");
		glUniform4i64vNV = provider.getFunctionAddress("glUniform4i64vNV");
		glUniform4iARB = provider.getFunctionAddress("glUniform4iARB");
		glUniform4iv = provider.getFunctionAddress("glUniform4iv");
		glUniform4ivARB = provider.getFunctionAddress("glUniform4ivARB");
		glUniform4ui = provider.getFunctionAddress("glUniform4ui");
		glUniform4ui64ARB = provider.getFunctionAddress("glUniform4ui64ARB");
		glUniform4ui64NV = provider.getFunctionAddress("glUniform4ui64NV");
		glUniform4ui64vARB = provider.getFunctionAddress("glUniform4ui64vARB");
		glUniform4ui64vNV = provider.getFunctionAddress("glUniform4ui64vNV");
		glUniform4uiEXT = provider.getFunctionAddress("glUniform4uiEXT");
		glUniform4uiv = provider.getFunctionAddress("glUniform4uiv");
		glUniform4uivEXT = provider.getFunctionAddress("glUniform4uivEXT");
		glUniformBlockBinding = provider.getFunctionAddress("glUniformBlockBinding");
		glUniformBufferEXT = provider.getFunctionAddress("glUniformBufferEXT");
		glUniformHandleui64ARB = provider.getFunctionAddress("glUniformHandleui64ARB");
		glUniformHandleui64NV = provider.getFunctionAddress("glUniformHandleui64NV");
		glUniformHandleui64vARB = provider.getFunctionAddress("glUniformHandleui64vARB");
		glUniformHandleui64vNV = provider.getFunctionAddress("glUniformHandleui64vNV");
		glUniformMatrix2dv = provider.getFunctionAddress("glUniformMatrix2dv");
		glUniformMatrix2fv = provider.getFunctionAddress("glUniformMatrix2fv");
		glUniformMatrix2fvARB = provider.getFunctionAddress("glUniformMatrix2fvARB");
		glUniformMatrix2x3dv = provider.getFunctionAddress("glUniformMatrix2x3dv");
		glUniformMatrix2x3fv = provider.getFunctionAddress("glUniformMatrix2x3fv");
		glUniformMatrix2x4dv = provider.getFunctionAddress("glUniformMatrix2x4dv");
		glUniformMatrix2x4fv = provider.getFunctionAddress("glUniformMatrix2x4fv");
		glUniformMatrix3dv = provider.getFunctionAddress("glUniformMatrix3dv");
		glUniformMatrix3fv = provider.getFunctionAddress("glUniformMatrix3fv");
		glUniformMatrix3fvARB = provider.getFunctionAddress("glUniformMatrix3fvARB");
		glUniformMatrix3x2dv = provider.getFunctionAddress("glUniformMatrix3x2dv");
		glUniformMatrix3x2fv = provider.getFunctionAddress("glUniformMatrix3x2fv");
		glUniformMatrix3x4dv = provider.getFunctionAddress("glUniformMatrix3x4dv");
		glUniformMatrix3x4fv = provider.getFunctionAddress("glUniformMatrix3x4fv");
		glUniformMatrix4dv = provider.getFunctionAddress("glUniformMatrix4dv");
		glUniformMatrix4fv = provider.getFunctionAddress("glUniformMatrix4fv");
		glUniformMatrix4fvARB = provider.getFunctionAddress("glUniformMatrix4fvARB");
		glUniformMatrix4x2dv = provider.getFunctionAddress("glUniformMatrix4x2dv");
		glUniformMatrix4x2fv = provider.getFunctionAddress("glUniformMatrix4x2fv");
		glUniformMatrix4x3dv = provider.getFunctionAddress("glUniformMatrix4x3dv");
		glUniformMatrix4x3fv = provider.getFunctionAddress("glUniformMatrix4x3fv");
		glUniformSubroutinesuiv = provider.getFunctionAddress("glUniformSubroutinesuiv");
		glUniformui64NV = provider.getFunctionAddress("glUniformui64NV");
		glUniformui64vNV = provider.getFunctionAddress("glUniformui64vNV");
		glUnlockArraysEXT = provider.getFunctionAddress("glUnlockArraysEXT");
		glUnmapBuffer = provider.getFunctionAddress("glUnmapBuffer");
		glUnmapBufferARB = provider.getFunctionAddress("glUnmapBufferARB");
		glUnmapNamedBuffer = provider.getFunctionAddress("glUnmapNamedBuffer");
		glUnmapNamedBufferEXT = provider.getFunctionAddress("glUnmapNamedBufferEXT");
		glUnmapTexture2DINTEL = provider.getFunctionAddress("glUnmapTexture2DINTEL");
		glUseProgram = provider.getFunctionAddress("glUseProgram");
		glUseProgramObjectARB = provider.getFunctionAddress("glUseProgramObjectARB");
		glUseProgramStages = provider.getFunctionAddress("glUseProgramStages");
		glUseShaderProgramEXT = provider.getFunctionAddress("glUseShaderProgramEXT");
		glValidateProgram = provider.getFunctionAddress("glValidateProgram");
		glValidateProgramARB = provider.getFunctionAddress("glValidateProgramARB");
		glValidateProgramPipeline = provider.getFunctionAddress("glValidateProgramPipeline");
		glVertex2d = getFunctionAddress(fc, provider, "glVertex2d");
		glVertex2dv = getFunctionAddress(fc, provider, "glVertex2dv");
		glVertex2f = getFunctionAddress(fc, provider, "glVertex2f");
		glVertex2fv = getFunctionAddress(fc, provider, "glVertex2fv");
		glVertex2hNV = provider.getFunctionAddress("glVertex2hNV");
		glVertex2hvNV = provider.getFunctionAddress("glVertex2hvNV");
		glVertex2i = getFunctionAddress(fc, provider, "glVertex2i");
		glVertex2iv = getFunctionAddress(fc, provider, "glVertex2iv");
		glVertex2s = getFunctionAddress(fc, provider, "glVertex2s");
		glVertex2sv = getFunctionAddress(fc, provider, "glVertex2sv");
		glVertex3d = getFunctionAddress(fc, provider, "glVertex3d");
		glVertex3dv = getFunctionAddress(fc, provider, "glVertex3dv");
		glVertex3f = getFunctionAddress(fc, provider, "glVertex3f");
		glVertex3fv = getFunctionAddress(fc, provider, "glVertex3fv");
		glVertex3hNV = provider.getFunctionAddress("glVertex3hNV");
		glVertex3hvNV = provider.getFunctionAddress("glVertex3hvNV");
		glVertex3i = getFunctionAddress(fc, provider, "glVertex3i");
		glVertex3iv = getFunctionAddress(fc, provider, "glVertex3iv");
		glVertex3s = getFunctionAddress(fc, provider, "glVertex3s");
		glVertex3sv = getFunctionAddress(fc, provider, "glVertex3sv");
		glVertex4d = getFunctionAddress(fc, provider, "glVertex4d");
		glVertex4dv = getFunctionAddress(fc, provider, "glVertex4dv");
		glVertex4f = getFunctionAddress(fc, provider, "glVertex4f");
		glVertex4fv = getFunctionAddress(fc, provider, "glVertex4fv");
		glVertex4hNV = provider.getFunctionAddress("glVertex4hNV");
		glVertex4hvNV = provider.getFunctionAddress("glVertex4hvNV");
		glVertex4i = getFunctionAddress(fc, provider, "glVertex4i");
		glVertex4iv = getFunctionAddress(fc, provider, "glVertex4iv");
		glVertex4s = getFunctionAddress(fc, provider, "glVertex4s");
		glVertex4sv = getFunctionAddress(fc, provider, "glVertex4sv");
		glVertexArrayAttribBinding = provider.getFunctionAddress("glVertexArrayAttribBinding");
		glVertexArrayAttribFormat = provider.getFunctionAddress("glVertexArrayAttribFormat");
		glVertexArrayAttribIFormat = provider.getFunctionAddress("glVertexArrayAttribIFormat");
		glVertexArrayAttribLFormat = provider.getFunctionAddress("glVertexArrayAttribLFormat");
		glVertexArrayBindVertexBufferEXT = provider.getFunctionAddress("glVertexArrayBindVertexBufferEXT");
		glVertexArrayBindingDivisor = provider.getFunctionAddress("glVertexArrayBindingDivisor");
		glVertexArrayColorOffsetEXT = provider.getFunctionAddress("glVertexArrayColorOffsetEXT");
		glVertexArrayEdgeFlagOffsetEXT = provider.getFunctionAddress("glVertexArrayEdgeFlagOffsetEXT");
		glVertexArrayElementBuffer = provider.getFunctionAddress("glVertexArrayElementBuffer");
		glVertexArrayFogCoordOffsetEXT = provider.getFunctionAddress("glVertexArrayFogCoordOffsetEXT");
		glVertexArrayIndexOffsetEXT = provider.getFunctionAddress("glVertexArrayIndexOffsetEXT");
		glVertexArrayMultiTexCoordOffsetEXT = provider.getFunctionAddress("glVertexArrayMultiTexCoordOffsetEXT");
		glVertexArrayNormalOffsetEXT = provider.getFunctionAddress("glVertexArrayNormalOffsetEXT");
		glVertexArrayRangeNV = provider.getFunctionAddress("glVertexArrayRangeNV");
		glVertexArraySecondaryColorOffsetEXT = provider.getFunctionAddress("glVertexArraySecondaryColorOffsetEXT");
		glVertexArrayTexCoordOffsetEXT = provider.getFunctionAddress("glVertexArrayTexCoordOffsetEXT");
		glVertexArrayVertexAttribBindingEXT = provider.getFunctionAddress("glVertexArrayVertexAttribBindingEXT");
		glVertexArrayVertexAttribDivisorEXT = provider.getFunctionAddress("glVertexArrayVertexAttribDivisorEXT");
		glVertexArrayVertexAttribFormatEXT = provider.getFunctionAddress("glVertexArrayVertexAttribFormatEXT");
		glVertexArrayVertexAttribIFormatEXT = provider.getFunctionAddress("glVertexArrayVertexAttribIFormatEXT");
		glVertexArrayVertexAttribIOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexAttribIOffsetEXT");
		glVertexArrayVertexAttribLFormatEXT = provider.getFunctionAddress("glVertexArrayVertexAttribLFormatEXT");
		glVertexArrayVertexAttribLOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexAttribLOffsetEXT");
		glVertexArrayVertexAttribOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexAttribOffsetEXT");
		glVertexArrayVertexBindingDivisorEXT = provider.getFunctionAddress("glVertexArrayVertexBindingDivisorEXT");
		glVertexArrayVertexBuffer = provider.getFunctionAddress("glVertexArrayVertexBuffer");
		glVertexArrayVertexBuffers = provider.getFunctionAddress("glVertexArrayVertexBuffers");
		glVertexArrayVertexOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexOffsetEXT");
		glVertexAttrib1d = provider.getFunctionAddress("glVertexAttrib1d");
		glVertexAttrib1dARB = provider.getFunctionAddress("glVertexAttrib1dARB");
		glVertexAttrib1dv = provider.getFunctionAddress("glVertexAttrib1dv");
		glVertexAttrib1dvARB = provider.getFunctionAddress("glVertexAttrib1dvARB");
		glVertexAttrib1f = provider.getFunctionAddress("glVertexAttrib1f");
		glVertexAttrib1fARB = provider.getFunctionAddress("glVertexAttrib1fARB");
		glVertexAttrib1fv = provider.getFunctionAddress("glVertexAttrib1fv");
		glVertexAttrib1fvARB = provider.getFunctionAddress("glVertexAttrib1fvARB");
		glVertexAttrib1hNV = provider.getFunctionAddress("glVertexAttrib1hNV");
		glVertexAttrib1hvNV = provider.getFunctionAddress("glVertexAttrib1hvNV");
		glVertexAttrib1s = provider.getFunctionAddress("glVertexAttrib1s");
		glVertexAttrib1sARB = provider.getFunctionAddress("glVertexAttrib1sARB");
		glVertexAttrib1sv = provider.getFunctionAddress("glVertexAttrib1sv");
		glVertexAttrib1svARB = provider.getFunctionAddress("glVertexAttrib1svARB");
		glVertexAttrib2d = provider.getFunctionAddress("glVertexAttrib2d");
		glVertexAttrib2dARB = provider.getFunctionAddress("glVertexAttrib2dARB");
		glVertexAttrib2dv = provider.getFunctionAddress("glVertexAttrib2dv");
		glVertexAttrib2dvARB = provider.getFunctionAddress("glVertexAttrib2dvARB");
		glVertexAttrib2f = provider.getFunctionAddress("glVertexAttrib2f");
		glVertexAttrib2fARB = provider.getFunctionAddress("glVertexAttrib2fARB");
		glVertexAttrib2fv = provider.getFunctionAddress("glVertexAttrib2fv");
		glVertexAttrib2fvARB = provider.getFunctionAddress("glVertexAttrib2fvARB");
		glVertexAttrib2hNV = provider.getFunctionAddress("glVertexAttrib2hNV");
		glVertexAttrib2hvNV = provider.getFunctionAddress("glVertexAttrib2hvNV");
		glVertexAttrib2s = provider.getFunctionAddress("glVertexAttrib2s");
		glVertexAttrib2sARB = provider.getFunctionAddress("glVertexAttrib2sARB");
		glVertexAttrib2sv = provider.getFunctionAddress("glVertexAttrib2sv");
		glVertexAttrib2svARB = provider.getFunctionAddress("glVertexAttrib2svARB");
		glVertexAttrib3d = provider.getFunctionAddress("glVertexAttrib3d");
		glVertexAttrib3dARB = provider.getFunctionAddress("glVertexAttrib3dARB");
		glVertexAttrib3dv = provider.getFunctionAddress("glVertexAttrib3dv");
		glVertexAttrib3dvARB = provider.getFunctionAddress("glVertexAttrib3dvARB");
		glVertexAttrib3f = provider.getFunctionAddress("glVertexAttrib3f");
		glVertexAttrib3fARB = provider.getFunctionAddress("glVertexAttrib3fARB");
		glVertexAttrib3fv = provider.getFunctionAddress("glVertexAttrib3fv");
		glVertexAttrib3fvARB = provider.getFunctionAddress("glVertexAttrib3fvARB");
		glVertexAttrib3hNV = provider.getFunctionAddress("glVertexAttrib3hNV");
		glVertexAttrib3hvNV = provider.getFunctionAddress("glVertexAttrib3hvNV");
		glVertexAttrib3s = provider.getFunctionAddress("glVertexAttrib3s");
		glVertexAttrib3sARB = provider.getFunctionAddress("glVertexAttrib3sARB");
		glVertexAttrib3sv = provider.getFunctionAddress("glVertexAttrib3sv");
		glVertexAttrib3svARB = provider.getFunctionAddress("glVertexAttrib3svARB");
		glVertexAttrib4Nbv = provider.getFunctionAddress("glVertexAttrib4Nbv");
		glVertexAttrib4NbvARB = provider.getFunctionAddress("glVertexAttrib4NbvARB");
		glVertexAttrib4Niv = provider.getFunctionAddress("glVertexAttrib4Niv");
		glVertexAttrib4NivARB = provider.getFunctionAddress("glVertexAttrib4NivARB");
		glVertexAttrib4Nsv = provider.getFunctionAddress("glVertexAttrib4Nsv");
		glVertexAttrib4NsvARB = provider.getFunctionAddress("glVertexAttrib4NsvARB");
		glVertexAttrib4Nub = provider.getFunctionAddress("glVertexAttrib4Nub");
		glVertexAttrib4NubARB = provider.getFunctionAddress("glVertexAttrib4NubARB");
		glVertexAttrib4Nubv = provider.getFunctionAddress("glVertexAttrib4Nubv");
		glVertexAttrib4NubvARB = provider.getFunctionAddress("glVertexAttrib4NubvARB");
		glVertexAttrib4Nuiv = provider.getFunctionAddress("glVertexAttrib4Nuiv");
		glVertexAttrib4NuivARB = provider.getFunctionAddress("glVertexAttrib4NuivARB");
		glVertexAttrib4Nusv = provider.getFunctionAddress("glVertexAttrib4Nusv");
		glVertexAttrib4NusvARB = provider.getFunctionAddress("glVertexAttrib4NusvARB");
		glVertexAttrib4bv = provider.getFunctionAddress("glVertexAttrib4bv");
		glVertexAttrib4bvARB = provider.getFunctionAddress("glVertexAttrib4bvARB");
		glVertexAttrib4d = provider.getFunctionAddress("glVertexAttrib4d");
		glVertexAttrib4dARB = provider.getFunctionAddress("glVertexAttrib4dARB");
		glVertexAttrib4dv = provider.getFunctionAddress("glVertexAttrib4dv");
		glVertexAttrib4dvARB = provider.getFunctionAddress("glVertexAttrib4dvARB");
		glVertexAttrib4f = provider.getFunctionAddress("glVertexAttrib4f");
		glVertexAttrib4fARB = provider.getFunctionAddress("glVertexAttrib4fARB");
		glVertexAttrib4fv = provider.getFunctionAddress("glVertexAttrib4fv");
		glVertexAttrib4fvARB = provider.getFunctionAddress("glVertexAttrib4fvARB");
		glVertexAttrib4hNV = provider.getFunctionAddress("glVertexAttrib4hNV");
		glVertexAttrib4hvNV = provider.getFunctionAddress("glVertexAttrib4hvNV");
		glVertexAttrib4iv = provider.getFunctionAddress("glVertexAttrib4iv");
		glVertexAttrib4ivARB = provider.getFunctionAddress("glVertexAttrib4ivARB");
		glVertexAttrib4s = provider.getFunctionAddress("glVertexAttrib4s");
		glVertexAttrib4sARB = provider.getFunctionAddress("glVertexAttrib4sARB");
		glVertexAttrib4sv = provider.getFunctionAddress("glVertexAttrib4sv");
		glVertexAttrib4svARB = provider.getFunctionAddress("glVertexAttrib4svARB");
		glVertexAttrib4ubv = provider.getFunctionAddress("glVertexAttrib4ubv");
		glVertexAttrib4ubvARB = provider.getFunctionAddress("glVertexAttrib4ubvARB");
		glVertexAttrib4uiv = provider.getFunctionAddress("glVertexAttrib4uiv");
		glVertexAttrib4uivARB = provider.getFunctionAddress("glVertexAttrib4uivARB");
		glVertexAttrib4usv = provider.getFunctionAddress("glVertexAttrib4usv");
		glVertexAttrib4usvARB = provider.getFunctionAddress("glVertexAttrib4usvARB");
		glVertexAttribBinding = provider.getFunctionAddress("glVertexAttribBinding");
		glVertexAttribDivisor = provider.getFunctionAddress("glVertexAttribDivisor");
		glVertexAttribDivisorARB = provider.getFunctionAddress("glVertexAttribDivisorARB");
		glVertexAttribFormat = provider.getFunctionAddress("glVertexAttribFormat");
		glVertexAttribFormatNV = provider.getFunctionAddress("glVertexAttribFormatNV");
		glVertexAttribI1i = provider.getFunctionAddress("glVertexAttribI1i");
		glVertexAttribI1iEXT = provider.getFunctionAddress("glVertexAttribI1iEXT");
		glVertexAttribI1iv = provider.getFunctionAddress("glVertexAttribI1iv");
		glVertexAttribI1ivEXT = provider.getFunctionAddress("glVertexAttribI1ivEXT");
		glVertexAttribI1ui = provider.getFunctionAddress("glVertexAttribI1ui");
		glVertexAttribI1uiEXT = provider.getFunctionAddress("glVertexAttribI1uiEXT");
		glVertexAttribI1uiv = provider.getFunctionAddress("glVertexAttribI1uiv");
		glVertexAttribI1uivEXT = provider.getFunctionAddress("glVertexAttribI1uivEXT");
		glVertexAttribI2i = provider.getFunctionAddress("glVertexAttribI2i");
		glVertexAttribI2iEXT = provider.getFunctionAddress("glVertexAttribI2iEXT");
		glVertexAttribI2iv = provider.getFunctionAddress("glVertexAttribI2iv");
		glVertexAttribI2ivEXT = provider.getFunctionAddress("glVertexAttribI2ivEXT");
		glVertexAttribI2ui = provider.getFunctionAddress("glVertexAttribI2ui");
		glVertexAttribI2uiEXT = provider.getFunctionAddress("glVertexAttribI2uiEXT");
		glVertexAttribI2uiv = provider.getFunctionAddress("glVertexAttribI2uiv");
		glVertexAttribI2uivEXT = provider.getFunctionAddress("glVertexAttribI2uivEXT");
		glVertexAttribI3i = provider.getFunctionAddress("glVertexAttribI3i");
		glVertexAttribI3iEXT = provider.getFunctionAddress("glVertexAttribI3iEXT");
		glVertexAttribI3iv = provider.getFunctionAddress("glVertexAttribI3iv");
		glVertexAttribI3ivEXT = provider.getFunctionAddress("glVertexAttribI3ivEXT");
		glVertexAttribI3ui = provider.getFunctionAddress("glVertexAttribI3ui");
		glVertexAttribI3uiEXT = provider.getFunctionAddress("glVertexAttribI3uiEXT");
		glVertexAttribI3uiv = provider.getFunctionAddress("glVertexAttribI3uiv");
		glVertexAttribI3uivEXT = provider.getFunctionAddress("glVertexAttribI3uivEXT");
		glVertexAttribI4bv = provider.getFunctionAddress("glVertexAttribI4bv");
		glVertexAttribI4bvEXT = provider.getFunctionAddress("glVertexAttribI4bvEXT");
		glVertexAttribI4i = provider.getFunctionAddress("glVertexAttribI4i");
		glVertexAttribI4iEXT = provider.getFunctionAddress("glVertexAttribI4iEXT");
		glVertexAttribI4iv = provider.getFunctionAddress("glVertexAttribI4iv");
		glVertexAttribI4ivEXT = provider.getFunctionAddress("glVertexAttribI4ivEXT");
		glVertexAttribI4sv = provider.getFunctionAddress("glVertexAttribI4sv");
		glVertexAttribI4svEXT = provider.getFunctionAddress("glVertexAttribI4svEXT");
		glVertexAttribI4ubv = provider.getFunctionAddress("glVertexAttribI4ubv");
		glVertexAttribI4ubvEXT = provider.getFunctionAddress("glVertexAttribI4ubvEXT");
		glVertexAttribI4ui = provider.getFunctionAddress("glVertexAttribI4ui");
		glVertexAttribI4uiEXT = provider.getFunctionAddress("glVertexAttribI4uiEXT");
		glVertexAttribI4uiv = provider.getFunctionAddress("glVertexAttribI4uiv");
		glVertexAttribI4uivEXT = provider.getFunctionAddress("glVertexAttribI4uivEXT");
		glVertexAttribI4usv = provider.getFunctionAddress("glVertexAttribI4usv");
		glVertexAttribI4usvEXT = provider.getFunctionAddress("glVertexAttribI4usvEXT");
		glVertexAttribIFormat = provider.getFunctionAddress("glVertexAttribIFormat");
		glVertexAttribIFormatNV = provider.getFunctionAddress("glVertexAttribIFormatNV");
		glVertexAttribIPointer = provider.getFunctionAddress("glVertexAttribIPointer");
		glVertexAttribIPointerEXT = provider.getFunctionAddress("glVertexAttribIPointerEXT");
		glVertexAttribL1d = provider.getFunctionAddress("glVertexAttribL1d");
		glVertexAttribL1dEXT = provider.getFunctionAddress("glVertexAttribL1dEXT");
		glVertexAttribL1dv = provider.getFunctionAddress("glVertexAttribL1dv");
		glVertexAttribL1dvEXT = provider.getFunctionAddress("glVertexAttribL1dvEXT");
		glVertexAttribL1i64NV = provider.getFunctionAddress("glVertexAttribL1i64NV");
		glVertexAttribL1i64vNV = provider.getFunctionAddress("glVertexAttribL1i64vNV");
		glVertexAttribL1ui64ARB = provider.getFunctionAddress("glVertexAttribL1ui64ARB");
		glVertexAttribL1ui64NV = provider.getFunctionAddress("glVertexAttribL1ui64NV");
		glVertexAttribL1ui64vARB = provider.getFunctionAddress("glVertexAttribL1ui64vARB");
		glVertexAttribL1ui64vNV = provider.getFunctionAddress("glVertexAttribL1ui64vNV");
		glVertexAttribL2d = provider.getFunctionAddress("glVertexAttribL2d");
		glVertexAttribL2dEXT = provider.getFunctionAddress("glVertexAttribL2dEXT");
		glVertexAttribL2dv = provider.getFunctionAddress("glVertexAttribL2dv");
		glVertexAttribL2dvEXT = provider.getFunctionAddress("glVertexAttribL2dvEXT");
		glVertexAttribL2i64NV = provider.getFunctionAddress("glVertexAttribL2i64NV");
		glVertexAttribL2i64vNV = provider.getFunctionAddress("glVertexAttribL2i64vNV");
		glVertexAttribL2ui64NV = provider.getFunctionAddress("glVertexAttribL2ui64NV");
		glVertexAttribL2ui64vNV = provider.getFunctionAddress("glVertexAttribL2ui64vNV");
		glVertexAttribL3d = provider.getFunctionAddress("glVertexAttribL3d");
		glVertexAttribL3dEXT = provider.getFunctionAddress("glVertexAttribL3dEXT");
		glVertexAttribL3dv = provider.getFunctionAddress("glVertexAttribL3dv");
		glVertexAttribL3dvEXT = provider.getFunctionAddress("glVertexAttribL3dvEXT");
		glVertexAttribL3i64NV = provider.getFunctionAddress("glVertexAttribL3i64NV");
		glVertexAttribL3i64vNV = provider.getFunctionAddress("glVertexAttribL3i64vNV");
		glVertexAttribL3ui64NV = provider.getFunctionAddress("glVertexAttribL3ui64NV");
		glVertexAttribL3ui64vNV = provider.getFunctionAddress("glVertexAttribL3ui64vNV");
		glVertexAttribL4d = provider.getFunctionAddress("glVertexAttribL4d");
		glVertexAttribL4dEXT = provider.getFunctionAddress("glVertexAttribL4dEXT");
		glVertexAttribL4dv = provider.getFunctionAddress("glVertexAttribL4dv");
		glVertexAttribL4dvEXT = provider.getFunctionAddress("glVertexAttribL4dvEXT");
		glVertexAttribL4i64NV = provider.getFunctionAddress("glVertexAttribL4i64NV");
		glVertexAttribL4i64vNV = provider.getFunctionAddress("glVertexAttribL4i64vNV");
		glVertexAttribL4ui64NV = provider.getFunctionAddress("glVertexAttribL4ui64NV");
		glVertexAttribL4ui64vNV = provider.getFunctionAddress("glVertexAttribL4ui64vNV");
		glVertexAttribLFormat = provider.getFunctionAddress("glVertexAttribLFormat");
		glVertexAttribLFormatNV = provider.getFunctionAddress("glVertexAttribLFormatNV");
		glVertexAttribLPointer = provider.getFunctionAddress("glVertexAttribLPointer");
		glVertexAttribLPointerEXT = provider.getFunctionAddress("glVertexAttribLPointerEXT");
		glVertexAttribP1ui = provider.getFunctionAddress("glVertexAttribP1ui");
		glVertexAttribP1uiv = provider.getFunctionAddress("glVertexAttribP1uiv");
		glVertexAttribP2ui = provider.getFunctionAddress("glVertexAttribP2ui");
		glVertexAttribP2uiv = provider.getFunctionAddress("glVertexAttribP2uiv");
		glVertexAttribP3ui = provider.getFunctionAddress("glVertexAttribP3ui");
		glVertexAttribP3uiv = provider.getFunctionAddress("glVertexAttribP3uiv");
		glVertexAttribP4ui = provider.getFunctionAddress("glVertexAttribP4ui");
		glVertexAttribP4uiv = provider.getFunctionAddress("glVertexAttribP4uiv");
		glVertexAttribParameteriAMD = provider.getFunctionAddress("glVertexAttribParameteriAMD");
		glVertexAttribPointer = provider.getFunctionAddress("glVertexAttribPointer");
		glVertexAttribPointerARB = provider.getFunctionAddress("glVertexAttribPointerARB");
		glVertexAttribs1hvNV = provider.getFunctionAddress("glVertexAttribs1hvNV");
		glVertexAttribs2hvNV = provider.getFunctionAddress("glVertexAttribs2hvNV");
		glVertexAttribs3hvNV = provider.getFunctionAddress("glVertexAttribs3hvNV");
		glVertexAttribs4hvNV = provider.getFunctionAddress("glVertexAttribs4hvNV");
		glVertexBindingDivisor = provider.getFunctionAddress("glVertexBindingDivisor");
		glVertexBlendARB = provider.getFunctionAddress("glVertexBlendARB");
		glVertexFormatNV = provider.getFunctionAddress("glVertexFormatNV");
		glVertexP2ui = getFunctionAddress(fc, provider, "glVertexP2ui");
		glVertexP2uiv = getFunctionAddress(fc, provider, "glVertexP2uiv");
		glVertexP3ui = getFunctionAddress(fc, provider, "glVertexP3ui");
		glVertexP3uiv = getFunctionAddress(fc, provider, "glVertexP3uiv");
		glVertexP4ui = getFunctionAddress(fc, provider, "glVertexP4ui");
		glVertexP4uiv = getFunctionAddress(fc, provider, "glVertexP4uiv");
		glVertexPointer = getFunctionAddress(fc, provider, "glVertexPointer");
		glVertexWeighthNV = provider.getFunctionAddress("glVertexWeighthNV");
		glVertexWeighthvNV = provider.getFunctionAddress("glVertexWeighthvNV");
		glViewport = provider.getFunctionAddress("glViewport");
		glViewportArrayv = provider.getFunctionAddress("glViewportArrayv");
		glViewportIndexedf = provider.getFunctionAddress("glViewportIndexedf");
		glViewportIndexedfv = provider.getFunctionAddress("glViewportIndexedfv");
		glViewportPositionWScaleNV = provider.getFunctionAddress("glViewportPositionWScaleNV");
		glViewportSwizzleNV = provider.getFunctionAddress("glViewportSwizzleNV");
		glWaitSync = provider.getFunctionAddress("glWaitSync");
		glWaitVkSemaphoreNV = provider.getFunctionAddress("glWaitVkSemaphoreNV");
		glWeightPathsNV = provider.getFunctionAddress("glWeightPathsNV");
		glWeightPointerARB = provider.getFunctionAddress("glWeightPointerARB");
		glWeightbvARB = provider.getFunctionAddress("glWeightbvARB");
		glWeightdvARB = provider.getFunctionAddress("glWeightdvARB");
		glWeightfvARB = provider.getFunctionAddress("glWeightfvARB");
		glWeightivARB = provider.getFunctionAddress("glWeightivARB");
		glWeightsvARB = provider.getFunctionAddress("glWeightsvARB");
		glWeightubvARB = provider.getFunctionAddress("glWeightubvARB");
		glWeightuivARB = provider.getFunctionAddress("glWeightuivARB");
		glWeightusvARB = provider.getFunctionAddress("glWeightusvARB");
		glWindowPos2d = getFunctionAddress(fc, provider, "glWindowPos2d");
		glWindowPos2dARB = provider.getFunctionAddress("glWindowPos2dARB");
		glWindowPos2dv = getFunctionAddress(fc, provider, "glWindowPos2dv");
		glWindowPos2dvARB = provider.getFunctionAddress("glWindowPos2dvARB");
		glWindowPos2f = getFunctionAddress(fc, provider, "glWindowPos2f");
		glWindowPos2fARB = provider.getFunctionAddress("glWindowPos2fARB");
		glWindowPos2fv = getFunctionAddress(fc, provider, "glWindowPos2fv");
		glWindowPos2fvARB = provider.getFunctionAddress("glWindowPos2fvARB");
		glWindowPos2i = getFunctionAddress(fc, provider, "glWindowPos2i");
		glWindowPos2iARB = provider.getFunctionAddress("glWindowPos2iARB");
		glWindowPos2iv = getFunctionAddress(fc, provider, "glWindowPos2iv");
		glWindowPos2ivARB = provider.getFunctionAddress("glWindowPos2ivARB");
		glWindowPos2s = getFunctionAddress(fc, provider, "glWindowPos2s");
		glWindowPos2sARB = provider.getFunctionAddress("glWindowPos2sARB");
		glWindowPos2sv = getFunctionAddress(fc, provider, "glWindowPos2sv");
		glWindowPos2svARB = provider.getFunctionAddress("glWindowPos2svARB");
		glWindowPos3d = getFunctionAddress(fc, provider, "glWindowPos3d");
		glWindowPos3dARB = provider.getFunctionAddress("glWindowPos3dARB");
		glWindowPos3dv = getFunctionAddress(fc, provider, "glWindowPos3dv");
		glWindowPos3dvARB = provider.getFunctionAddress("glWindowPos3dvARB");
		glWindowPos3f = getFunctionAddress(fc, provider, "glWindowPos3f");
		glWindowPos3fARB = provider.getFunctionAddress("glWindowPos3fARB");
		glWindowPos3fv = getFunctionAddress(fc, provider, "glWindowPos3fv");
		glWindowPos3fvARB = provider.getFunctionAddress("glWindowPos3fvARB");
		glWindowPos3i = getFunctionAddress(fc, provider, "glWindowPos3i");
		glWindowPos3iARB = provider.getFunctionAddress("glWindowPos3iARB");
		glWindowPos3iv = getFunctionAddress(fc, provider, "glWindowPos3iv");
		glWindowPos3ivARB = provider.getFunctionAddress("glWindowPos3ivARB");
		glWindowPos3s = getFunctionAddress(fc, provider, "glWindowPos3s");
		glWindowPos3sARB = provider.getFunctionAddress("glWindowPos3sARB");
		glWindowPos3sv = getFunctionAddress(fc, provider, "glWindowPos3sv");
		glWindowPos3svARB = provider.getFunctionAddress("glWindowPos3svARB");

		OpenGL11 = ext.contains("OpenGL11") && checkExtension("OpenGL11", GL11.isAvailable(this, fc));
		OpenGL12 = ext.contains("OpenGL12") && checkExtension("OpenGL12", GL12.isAvailable(this));
		OpenGL13 = ext.contains("OpenGL13") && checkExtension("OpenGL13", GL13.isAvailable(this, fc));
		OpenGL14 = ext.contains("OpenGL14") && checkExtension("OpenGL14", GL14.isAvailable(this, fc));
		OpenGL15 = ext.contains("OpenGL15") && checkExtension("OpenGL15", GL15.isAvailable(this));
		OpenGL20 = ext.contains("OpenGL20") && checkExtension("OpenGL20", GL20.isAvailable(this));
		OpenGL21 = ext.contains("OpenGL21") && checkExtension("OpenGL21", GL21.isAvailable(this));
		OpenGL30 = ext.contains("OpenGL30") && checkExtension("OpenGL30", GL30.isAvailable(this));
		OpenGL31 = ext.contains("OpenGL31") && checkExtension("OpenGL31", GL31.isAvailable(this));
		OpenGL32 = ext.contains("OpenGL32") && checkExtension("OpenGL32", GL32.isAvailable(this));
		OpenGL33 = ext.contains("OpenGL33") && checkExtension("OpenGL33", GL33.isAvailable(this, fc));
		OpenGL40 = ext.contains("OpenGL40") && checkExtension("OpenGL40", GL40.isAvailable(this));
		OpenGL41 = ext.contains("OpenGL41") && checkExtension("OpenGL41", GL41.isAvailable(this));
		OpenGL42 = ext.contains("OpenGL42") && checkExtension("OpenGL42", GL42.isAvailable(this));
		OpenGL43 = ext.contains("OpenGL43") && checkExtension("OpenGL43", GL43.isAvailable(this));
		OpenGL44 = ext.contains("OpenGL44") && checkExtension("OpenGL44", GL44.isAvailable(this));
		OpenGL45 = ext.contains("OpenGL45") && checkExtension("OpenGL45", GL45.isAvailable(this, ext));
		GL_AMD_blend_minmax_factor = ext.contains("GL_AMD_blend_minmax_factor");
		GL_AMD_conservative_depth = ext.contains("GL_AMD_conservative_depth");
		GL_AMD_debug_output = ext.contains("GL_AMD_debug_output") && checkExtension("GL_AMD_debug_output", AMDDebugOutput.isAvailable(this));
		GL_AMD_depth_clamp_separate = ext.contains("GL_AMD_depth_clamp_separate");
		GL_AMD_draw_buffers_blend = ext.contains("GL_AMD_draw_buffers_blend") && checkExtension("GL_AMD_draw_buffers_blend", AMDDrawBuffersBlend.isAvailable(this));
		GL_AMD_gcn_shader = ext.contains("GL_AMD_gcn_shader");
		GL_AMD_gpu_shader_int64 = ext.contains("GL_AMD_gpu_shader_int64") && checkExtension("GL_AMD_gpu_shader_int64", AMDGPUShaderInt64.isAvailable(this, ext));
		GL_AMD_interleaved_elements = ext.contains("GL_AMD_interleaved_elements") && checkExtension("GL_AMD_interleaved_elements", AMDInterleavedElements.isAvailable(this));
		GL_AMD_occlusion_query_event = ext.contains("GL_AMD_occlusion_query_event") && checkExtension("GL_AMD_occlusion_query_event", AMDOcclusionQueryEvent.isAvailable(this));
		GL_AMD_performance_monitor = ext.contains("GL_AMD_performance_monitor") && checkExtension("GL_AMD_performance_monitor", AMDPerformanceMonitor.isAvailable(this));
		GL_AMD_pinned_memory = ext.contains("GL_AMD_pinned_memory");
		GL_AMD_query_buffer_object = ext.contains("GL_AMD_query_buffer_object");
		GL_AMD_sample_positions = ext.contains("GL_AMD_sample_positions") && checkExtension("GL_AMD_sample_positions", AMDSamplePositions.isAvailable(this));
		GL_AMD_seamless_cubemap_per_texture = ext.contains("GL_AMD_seamless_cubemap_per_texture");
		GL_AMD_shader_atomic_counter_ops = ext.contains("GL_AMD_shader_atomic_counter_ops");
		GL_AMD_shader_explicit_vertex_parameter = ext.contains("GL_AMD_shader_explicit_vertex_parameter");
		GL_AMD_shader_stencil_export = ext.contains("GL_AMD_shader_stencil_export");
		GL_AMD_shader_trinary_minmax = ext.contains("GL_AMD_shader_trinary_minmax");
		GL_AMD_sparse_texture = ext.contains("GL_AMD_sparse_texture") && checkExtension("GL_AMD_sparse_texture", AMDSparseTexture.isAvailable(this));
		GL_AMD_stencil_operation_extended = ext.contains("GL_AMD_stencil_operation_extended") && checkExtension("GL_AMD_stencil_operation_extended", AMDStencilOperationExtended.isAvailable(this));
		GL_AMD_texture_texture4 = ext.contains("GL_AMD_texture_texture4");
		GL_AMD_transform_feedback3_lines_triangles = ext.contains("GL_AMD_transform_feedback3_lines_triangles");
		GL_AMD_transform_feedback4 = ext.contains("GL_AMD_transform_feedback4");
		GL_AMD_vertex_shader_layer = ext.contains("GL_AMD_vertex_shader_layer");
		GL_AMD_vertex_shader_tessellator = ext.contains("GL_AMD_vertex_shader_tessellator") && checkExtension("GL_AMD_vertex_shader_tessellator", AMDVertexShaderTessellator.isAvailable(this));
		GL_AMD_vertex_shader_viewport_index = ext.contains("GL_AMD_vertex_shader_viewport_index");
		GL_ARB_arrays_of_arrays = ext.contains("GL_ARB_arrays_of_arrays");
		GL_ARB_base_instance = ext.contains("GL_ARB_base_instance") && checkExtension("GL_ARB_base_instance", ARBBaseInstance.isAvailable(this));
		GL_ARB_bindless_texture = ext.contains("GL_ARB_bindless_texture") && checkExtension("GL_ARB_bindless_texture", ARBBindlessTexture.isAvailable(this));
		GL_ARB_blend_func_extended = ext.contains("GL_ARB_blend_func_extended") && checkExtension("GL_ARB_blend_func_extended", ARBBlendFuncExtended.isAvailable(this));
		GL_ARB_buffer_storage = ext.contains("GL_ARB_buffer_storage") && checkExtension("GL_ARB_buffer_storage", ARBBufferStorage.isAvailable(this, ext));
		GL_ARB_cl_event = ext.contains("GL_ARB_cl_event") && checkExtension("GL_ARB_cl_event", ARBCLEvent.isAvailable(this));
		GL_ARB_clear_buffer_object = ext.contains("GL_ARB_clear_buffer_object") && checkExtension("GL_ARB_clear_buffer_object", ARBClearBufferObject.isAvailable(this, ext));
		GL_ARB_clear_texture = ext.contains("GL_ARB_clear_texture") && checkExtension("GL_ARB_clear_texture", ARBClearTexture.isAvailable(this));
		GL_ARB_clip_control = ext.contains("GL_ARB_clip_control") && checkExtension("GL_ARB_clip_control", ARBClipControl.isAvailable(this));
		GL_ARB_color_buffer_float = ext.contains("GL_ARB_color_buffer_float") && checkExtension("GL_ARB_color_buffer_float", ARBColorBufferFloat.isAvailable(this));
		GL_ARB_compatibility = ext.contains("GL_ARB_compatibility");
		GL_ARB_compressed_texture_pixel_storage = ext.contains("GL_ARB_compressed_texture_pixel_storage");
		GL_ARB_compute_shader = ext.contains("GL_ARB_compute_shader") && checkExtension("GL_ARB_compute_shader", ARBComputeShader.isAvailable(this));
		GL_ARB_compute_variable_group_size = ext.contains("GL_ARB_compute_variable_group_size") && checkExtension("GL_ARB_compute_variable_group_size", ARBComputeVariableGroupSize.isAvailable(this));
		GL_ARB_conditional_render_inverted = ext.contains("GL_ARB_conditional_render_inverted");
		GL_ARB_conservative_depth = ext.contains("GL_ARB_conservative_depth");
		GL_ARB_copy_buffer = ext.contains("GL_ARB_copy_buffer") && checkExtension("GL_ARB_copy_buffer", ARBCopyBuffer.isAvailable(this));
		GL_ARB_copy_image = ext.contains("GL_ARB_copy_image") && checkExtension("GL_ARB_copy_image", ARBCopyImage.isAvailable(this));
		GL_ARB_cull_distance = ext.contains("GL_ARB_cull_distance");
		GL_ARB_debug_output = ext.contains("GL_ARB_debug_output") && checkExtension("GL_ARB_debug_output", ARBDebugOutput.isAvailable(this));
		GL_ARB_depth_buffer_float = ext.contains("GL_ARB_depth_buffer_float");
		GL_ARB_depth_clamp = ext.contains("GL_ARB_depth_clamp");
		GL_ARB_depth_texture = ext.contains("GL_ARB_depth_texture");
		GL_ARB_derivative_control = ext.contains("GL_ARB_derivative_control");
		GL_ARB_direct_state_access = ext.contains("GL_ARB_direct_state_access") && checkExtension("GL_ARB_direct_state_access", ARBDirectStateAccess.isAvailable(this));
		GL_ARB_draw_buffers = ext.contains("GL_ARB_draw_buffers") && checkExtension("GL_ARB_draw_buffers", ARBDrawBuffers.isAvailable(this));
		GL_ARB_draw_buffers_blend = ext.contains("GL_ARB_draw_buffers_blend") && checkExtension("GL_ARB_draw_buffers_blend", ARBDrawBuffersBlend.isAvailable(this));
		GL_ARB_draw_elements_base_vertex = ext.contains("GL_ARB_draw_elements_base_vertex") && checkExtension("GL_ARB_draw_elements_base_vertex", ARBDrawElementsBaseVertex.isAvailable(this));
		GL_ARB_draw_indirect = ext.contains("GL_ARB_draw_indirect") && checkExtension("GL_ARB_draw_indirect", ARBDrawIndirect.isAvailable(this));
		GL_ARB_draw_instanced = ext.contains("GL_ARB_draw_instanced") && checkExtension("GL_ARB_draw_instanced", ARBDrawInstanced.isAvailable(this));
		GL_ARB_enhanced_layouts = ext.contains("GL_ARB_enhanced_layouts");
		GL_ARB_ES2_compatibility = ext.contains("GL_ARB_ES2_compatibility") && checkExtension("GL_ARB_ES2_compatibility", ARBES2Compatibility.isAvailable(this));
		GL_ARB_ES3_1_compatibility = ext.contains("GL_ARB_ES3_1_compatibility") && checkExtension("GL_ARB_ES3_1_compatibility", ARBES31Compatibility.isAvailable(this));
		GL_ARB_ES3_2_compatibility = ext.contains("GL_ARB_ES3_2_compatibility") && checkExtension("GL_ARB_ES3_2_compatibility", ARBES32Compatibility.isAvailable(this));
		GL_ARB_ES3_compatibility = ext.contains("GL_ARB_ES3_compatibility");
		GL_ARB_explicit_attrib_location = ext.contains("GL_ARB_explicit_attrib_location");
		GL_ARB_explicit_uniform_location = ext.contains("GL_ARB_explicit_uniform_location");
		GL_ARB_fragment_coord_conventions = ext.contains("GL_ARB_fragment_coord_conventions");
		GL_ARB_fragment_layer_viewport = ext.contains("GL_ARB_fragment_layer_viewport");
		GL_ARB_fragment_program = ext.contains("GL_ARB_fragment_program");
		GL_ARB_fragment_program_shadow = ext.contains("GL_ARB_fragment_program_shadow");
		GL_ARB_fragment_shader = ext.contains("GL_ARB_fragment_shader");
		GL_ARB_fragment_shader_interlock = ext.contains("GL_ARB_fragment_shader_interlock");
		GL_ARB_framebuffer_no_attachments = ext.contains("GL_ARB_framebuffer_no_attachments") && checkExtension("GL_ARB_framebuffer_no_attachments", ARBFramebufferNoAttachments.isAvailable(this, ext));
		GL_ARB_framebuffer_object = ext.contains("GL_ARB_framebuffer_object") && checkExtension("GL_ARB_framebuffer_object", ARBFramebufferObject.isAvailable(this));
		GL_ARB_framebuffer_sRGB = ext.contains("GL_ARB_framebuffer_sRGB");
		GL_ARB_geometry_shader4 = ext.contains("GL_ARB_geometry_shader4") && checkExtension("GL_ARB_geometry_shader4", ARBGeometryShader4.isAvailable(this));
		GL_ARB_get_program_binary = ext.contains("GL_ARB_get_program_binary") && checkExtension("GL_ARB_get_program_binary", ARBGetProgramBinary.isAvailable(this));
		GL_ARB_get_texture_sub_image = ext.contains("GL_ARB_get_texture_sub_image") && checkExtension("GL_ARB_get_texture_sub_image", ARBGetTextureSubImage.isAvailable(this));
		GL_ARB_gpu_shader5 = ext.contains("GL_ARB_gpu_shader5");
		GL_ARB_gpu_shader_fp64 = ext.contains("GL_ARB_gpu_shader_fp64") && checkExtension("GL_ARB_gpu_shader_fp64", ARBGPUShaderFP64.isAvailable(this, ext));
		GL_ARB_gpu_shader_int64 = ext.contains("GL_ARB_gpu_shader_int64") && checkExtension("GL_ARB_gpu_shader_int64", ARBGPUShaderInt64.isAvailable(this));
		GL_ARB_half_float_pixel = ext.contains("GL_ARB_half_float_pixel");
		GL_ARB_half_float_vertex = ext.contains("GL_ARB_half_float_vertex");
		GL_ARB_imaging = ext.contains("GL_ARB_imaging") && checkExtension("GL_ARB_imaging", ARBImaging.isAvailable(this, fc));
		GL_ARB_indirect_parameters = ext.contains("GL_ARB_indirect_parameters") && checkExtension("GL_ARB_indirect_parameters", ARBIndirectParameters.isAvailable(this));
		GL_ARB_instanced_arrays = ext.contains("GL_ARB_instanced_arrays") && checkExtension("GL_ARB_instanced_arrays", ARBInstancedArrays.isAvailable(this, ext));
		GL_ARB_internalformat_query = ext.contains("GL_ARB_internalformat_query") && checkExtension("GL_ARB_internalformat_query", ARBInternalformatQuery.isAvailable(this));
		GL_ARB_internalformat_query2 = ext.contains("GL_ARB_internalformat_query2") && checkExtension("GL_ARB_internalformat_query2", ARBInternalformatQuery2.isAvailable(this));
		GL_ARB_invalidate_subdata = ext.contains("GL_ARB_invalidate_subdata") && checkExtension("GL_ARB_invalidate_subdata", ARBInvalidateSubdata.isAvailable(this));
		GL_ARB_map_buffer_alignment = ext.contains("GL_ARB_map_buffer_alignment");
		GL_ARB_map_buffer_range = ext.contains("GL_ARB_map_buffer_range") && checkExtension("GL_ARB_map_buffer_range", ARBMapBufferRange.isAvailable(this));
		GL_ARB_matrix_palette = ext.contains("GL_ARB_matrix_palette") && checkExtension("GL_ARB_matrix_palette", ARBMatrixPalette.isAvailable(this));
		GL_ARB_multi_bind = ext.contains("GL_ARB_multi_bind") && checkExtension("GL_ARB_multi_bind", ARBMultiBind.isAvailable(this));
		GL_ARB_multi_draw_indirect = ext.contains("GL_ARB_multi_draw_indirect") && checkExtension("GL_ARB_multi_draw_indirect", ARBMultiDrawIndirect.isAvailable(this));
		GL_ARB_multisample = ext.contains("GL_ARB_multisample") && checkExtension("GL_ARB_multisample", ARBMultisample.isAvailable(this));
		GL_ARB_multitexture = ext.contains("GL_ARB_multitexture") && checkExtension("GL_ARB_multitexture", ARBMultitexture.isAvailable(this));
		GL_ARB_occlusion_query = ext.contains("GL_ARB_occlusion_query") && checkExtension("GL_ARB_occlusion_query", ARBOcclusionQuery.isAvailable(this));
		GL_ARB_occlusion_query2 = ext.contains("GL_ARB_occlusion_query2");
		GL_ARB_parallel_shader_compile = ext.contains("GL_ARB_parallel_shader_compile") && checkExtension("GL_ARB_parallel_shader_compile", ARBParallelShaderCompile.isAvailable(this));
		GL_ARB_pipeline_statistics_query = ext.contains("GL_ARB_pipeline_statistics_query");
		GL_ARB_pixel_buffer_object = ext.contains("GL_ARB_pixel_buffer_object");
		GL_ARB_point_parameters = ext.contains("GL_ARB_point_parameters") && checkExtension("GL_ARB_point_parameters", ARBPointParameters.isAvailable(this));
		GL_ARB_point_sprite = ext.contains("GL_ARB_point_sprite");
		GL_ARB_post_depth_coverage = ext.contains("GL_ARB_post_depth_coverage");
		GL_ARB_program_interface_query = ext.contains("GL_ARB_program_interface_query") && checkExtension("GL_ARB_program_interface_query", ARBProgramInterfaceQuery.isAvailable(this));
		GL_ARB_provoking_vertex = ext.contains("GL_ARB_provoking_vertex") && checkExtension("GL_ARB_provoking_vertex", ARBProvokingVertex.isAvailable(this));
		GL_ARB_query_buffer_object = ext.contains("GL_ARB_query_buffer_object");
		GL_ARB_robust_buffer_access_behavior = ext.contains("GL_ARB_robust_buffer_access_behavior");
		GL_ARB_robustness = ext.contains("GL_ARB_robustness") && checkExtension("GL_ARB_robustness", ARBRobustness.isAvailable(this, ext));
		GL_ARB_robustness_isolation = ext.contains("GL_ARB_robustness_isolation");
		GL_ARB_sample_locations = ext.contains("GL_ARB_sample_locations") && checkExtension("GL_ARB_sample_locations", ARBSampleLocations.isAvailable(this));
		GL_ARB_sample_shading = ext.contains("GL_ARB_sample_shading") && checkExtension("GL_ARB_sample_shading", ARBSampleShading.isAvailable(this));
		GL_ARB_sampler_objects = ext.contains("GL_ARB_sampler_objects") && checkExtension("GL_ARB_sampler_objects", ARBSamplerObjects.isAvailable(this));
		GL_ARB_seamless_cube_map = ext.contains("GL_ARB_seamless_cube_map");
		GL_ARB_seamless_cubemap_per_texture = ext.contains("GL_ARB_seamless_cubemap_per_texture");
		GL_ARB_separate_shader_objects = ext.contains("GL_ARB_separate_shader_objects") && checkExtension("GL_ARB_separate_shader_objects", ARBSeparateShaderObjects.isAvailable(this));
		GL_ARB_shader_atomic_counter_ops = ext.contains("GL_ARB_shader_atomic_counter_ops");
		GL_ARB_shader_atomic_counters = ext.contains("GL_ARB_shader_atomic_counters") && checkExtension("GL_ARB_shader_atomic_counters", ARBShaderAtomicCounters.isAvailable(this));
		GL_ARB_shader_ballot = ext.contains("GL_ARB_shader_ballot");
		GL_ARB_shader_bit_encoding = ext.contains("GL_ARB_shader_bit_encoding");
		GL_ARB_shader_clock = ext.contains("GL_ARB_shader_clock");
		GL_ARB_shader_draw_parameters = ext.contains("GL_ARB_shader_draw_parameters");
		GL_ARB_shader_group_vote = ext.contains("GL_ARB_shader_group_vote");
		GL_ARB_shader_image_load_store = ext.contains("GL_ARB_shader_image_load_store") && checkExtension("GL_ARB_shader_image_load_store", ARBShaderImageLoadStore.isAvailable(this));
		GL_ARB_shader_image_size = ext.contains("GL_ARB_shader_image_size");
		GL_ARB_shader_objects = ext.contains("GL_ARB_shader_objects") && checkExtension("GL_ARB_shader_objects", ARBShaderObjects.isAvailable(this));
		GL_ARB_shader_precision = ext.contains("GL_ARB_shader_precision");
		GL_ARB_shader_stencil_export = ext.contains("GL_ARB_shader_stencil_export");
		GL_ARB_shader_storage_buffer_object = ext.contains("GL_ARB_shader_storage_buffer_object") && checkExtension("GL_ARB_shader_storage_buffer_object", ARBShaderStorageBufferObject.isAvailable(this));
		GL_ARB_shader_subroutine = ext.contains("GL_ARB_shader_subroutine") && checkExtension("GL_ARB_shader_subroutine", ARBShaderSubroutine.isAvailable(this));
		GL_ARB_shader_texture_image_samples = ext.contains("GL_ARB_shader_texture_image_samples");
		GL_ARB_shader_texture_lod = ext.contains("GL_ARB_shader_texture_lod");
		GL_ARB_shader_viewport_layer_array = ext.contains("GL_ARB_shader_viewport_layer_array");
		GL_ARB_shading_language_100 = ext.contains("GL_ARB_shading_language_100");
		GL_ARB_shading_language_420pack = ext.contains("GL_ARB_shading_language_420pack");
		GL_ARB_shading_language_include = ext.contains("GL_ARB_shading_language_include") && checkExtension("GL_ARB_shading_language_include", ARBShadingLanguageInclude.isAvailable(this));
		GL_ARB_shading_language_packing = ext.contains("GL_ARB_shading_language_packing");
		GL_ARB_shadow = ext.contains("GL_ARB_shadow");
		GL_ARB_shadow_ambient = ext.contains("GL_ARB_shadow_ambient");
		GL_ARB_sparse_buffer = ext.contains("GL_ARB_sparse_buffer") && checkExtension("GL_ARB_sparse_buffer", ARBSparseBuffer.isAvailable(this, ext));
		GL_ARB_sparse_texture = ext.contains("GL_ARB_sparse_texture") && checkExtension("GL_ARB_sparse_texture", ARBSparseTexture.isAvailable(this, ext));
		GL_ARB_sparse_texture2 = ext.contains("GL_ARB_sparse_texture2");
		GL_ARB_sparse_texture_clamp = ext.contains("GL_ARB_sparse_texture_clamp");
		GL_ARB_stencil_texturing = ext.contains("GL_ARB_stencil_texturing");
		GL_ARB_sync = ext.contains("GL_ARB_sync") && checkExtension("GL_ARB_sync", ARBSync.isAvailable(this));
		GL_ARB_tessellation_shader = ext.contains("GL_ARB_tessellation_shader") && checkExtension("GL_ARB_tessellation_shader", ARBTessellationShader.isAvailable(this));
		GL_ARB_texture_barrier = ext.contains("GL_ARB_texture_barrier") && checkExtension("GL_ARB_texture_barrier", ARBTextureBarrier.isAvailable(this));
		GL_ARB_texture_border_clamp = ext.contains("GL_ARB_texture_border_clamp");
		GL_ARB_texture_buffer_object = ext.contains("GL_ARB_texture_buffer_object") && checkExtension("GL_ARB_texture_buffer_object", ARBTextureBufferObject.isAvailable(this));
		GL_ARB_texture_buffer_object_rgb32 = ext.contains("GL_ARB_texture_buffer_object_rgb32");
		GL_ARB_texture_buffer_range = ext.contains("GL_ARB_texture_buffer_range") && checkExtension("GL_ARB_texture_buffer_range", ARBTextureBufferRange.isAvailable(this, ext));
		GL_ARB_texture_compression = ext.contains("GL_ARB_texture_compression") && checkExtension("GL_ARB_texture_compression", ARBTextureCompression.isAvailable(this));
		GL_ARB_texture_compression_bptc = ext.contains("GL_ARB_texture_compression_bptc");
		GL_ARB_texture_compression_rgtc = ext.contains("GL_ARB_texture_compression_rgtc");
		GL_ARB_texture_cube_map = ext.contains("GL_ARB_texture_cube_map");
		GL_ARB_texture_cube_map_array = ext.contains("GL_ARB_texture_cube_map_array");
		GL_ARB_texture_env_add = ext.contains("GL_ARB_texture_env_add");
		GL_ARB_texture_env_combine = ext.contains("GL_ARB_texture_env_combine");
		GL_ARB_texture_env_crossbar = ext.contains("GL_ARB_texture_env_crossbar");
		GL_ARB_texture_env_dot3 = ext.contains("GL_ARB_texture_env_dot3");
		GL_ARB_texture_filter_minmax = ext.contains("GL_ARB_texture_filter_minmax");
		GL_ARB_texture_float = ext.contains("GL_ARB_texture_float");
		GL_ARB_texture_gather = ext.contains("GL_ARB_texture_gather");
		GL_ARB_texture_mirror_clamp_to_edge = ext.contains("GL_ARB_texture_mirror_clamp_to_edge");
		GL_ARB_texture_mirrored_repeat = ext.contains("GL_ARB_texture_mirrored_repeat");
		GL_ARB_texture_multisample = ext.contains("GL_ARB_texture_multisample") && checkExtension("GL_ARB_texture_multisample", ARBTextureMultisample.isAvailable(this));
		GL_ARB_texture_non_power_of_two = ext.contains("GL_ARB_texture_non_power_of_two");
		GL_ARB_texture_query_levels = ext.contains("GL_ARB_texture_query_levels");
		GL_ARB_texture_query_lod = ext.contains("GL_ARB_texture_query_lod");
		GL_ARB_texture_rectangle = ext.contains("GL_ARB_texture_rectangle");
		GL_ARB_texture_rg = ext.contains("GL_ARB_texture_rg");
		GL_ARB_texture_rgb10_a2ui = ext.contains("GL_ARB_texture_rgb10_a2ui");
		GL_ARB_texture_stencil8 = ext.contains("GL_ARB_texture_stencil8");
		GL_ARB_texture_storage = ext.contains("GL_ARB_texture_storage") && checkExtension("GL_ARB_texture_storage", ARBTextureStorage.isAvailable(this, ext));
		GL_ARB_texture_storage_multisample = ext.contains("GL_ARB_texture_storage_multisample") && checkExtension("GL_ARB_texture_storage_multisample", ARBTextureStorageMultisample.isAvailable(this, ext));
		GL_ARB_texture_swizzle = ext.contains("GL_ARB_texture_swizzle");
		GL_ARB_texture_view = ext.contains("GL_ARB_texture_view") && checkExtension("GL_ARB_texture_view", ARBTextureView.isAvailable(this));
		GL_ARB_timer_query = ext.contains("GL_ARB_timer_query") && checkExtension("GL_ARB_timer_query", ARBTimerQuery.isAvailable(this));
		GL_ARB_transform_feedback2 = ext.contains("GL_ARB_transform_feedback2") && checkExtension("GL_ARB_transform_feedback2", ARBTransformFeedback2.isAvailable(this));
		GL_ARB_transform_feedback3 = ext.contains("GL_ARB_transform_feedback3") && checkExtension("GL_ARB_transform_feedback3", ARBTransformFeedback3.isAvailable(this));
		GL_ARB_transform_feedback_instanced = ext.contains("GL_ARB_transform_feedback_instanced") && checkExtension("GL_ARB_transform_feedback_instanced", ARBTransformFeedbackInstanced.isAvailable(this));
		GL_ARB_transform_feedback_overflow_query = ext.contains("GL_ARB_transform_feedback_overflow_query");
		GL_ARB_transpose_matrix = ext.contains("GL_ARB_transpose_matrix") && checkExtension("GL_ARB_transpose_matrix", ARBTransposeMatrix.isAvailable(this));
		GL_ARB_uniform_buffer_object = ext.contains("GL_ARB_uniform_buffer_object") && checkExtension("GL_ARB_uniform_buffer_object", ARBUniformBufferObject.isAvailable(this));
		GL_ARB_vertex_array_bgra = ext.contains("GL_ARB_vertex_array_bgra");
		GL_ARB_vertex_array_object = ext.contains("GL_ARB_vertex_array_object") && checkExtension("GL_ARB_vertex_array_object", ARBVertexArrayObject.isAvailable(this));
		GL_ARB_vertex_attrib_64bit = ext.contains("GL_ARB_vertex_attrib_64bit") && checkExtension("GL_ARB_vertex_attrib_64bit", ARBVertexAttrib64Bit.isAvailable(this, ext));
		GL_ARB_vertex_attrib_binding = ext.contains("GL_ARB_vertex_attrib_binding") && checkExtension("GL_ARB_vertex_attrib_binding", ARBVertexAttribBinding.isAvailable(this, ext));
		GL_ARB_vertex_blend = ext.contains("GL_ARB_vertex_blend") && checkExtension("GL_ARB_vertex_blend", ARBVertexBlend.isAvailable(this));
		GL_ARB_vertex_buffer_object = ext.contains("GL_ARB_vertex_buffer_object") && checkExtension("GL_ARB_vertex_buffer_object", ARBVertexBufferObject.isAvailable(this));
		GL_ARB_vertex_program = ext.contains("GL_ARB_vertex_program") && checkExtension("GL_ARB_vertex_program", ARBVertexProgram.isAvailable(this));
		GL_ARB_vertex_shader = ext.contains("GL_ARB_vertex_shader") && checkExtension("GL_ARB_vertex_shader", ARBVertexShader.isAvailable(this));
		GL_ARB_vertex_type_10f_11f_11f_rev = ext.contains("GL_ARB_vertex_type_10f_11f_11f_rev");
		GL_ARB_vertex_type_2_10_10_10_rev = ext.contains("GL_ARB_vertex_type_2_10_10_10_rev") && checkExtension("GL_ARB_vertex_type_2_10_10_10_rev", ARBVertexType2_10_10_10_REV.isAvailable(this, fc));
		GL_ARB_viewport_array = ext.contains("GL_ARB_viewport_array") && checkExtension("GL_ARB_viewport_array", ARBViewportArray.isAvailable(this));
		GL_ARB_window_pos = ext.contains("GL_ARB_window_pos") && checkExtension("GL_ARB_window_pos", ARBWindowPos.isAvailable(this));
		GL_ATI_meminfo = ext.contains("GL_ATI_meminfo");
		GL_ATI_shader_texture_lod = ext.contains("GL_ATI_shader_texture_lod");
		GL_ATI_texture_compression_3dc = ext.contains("GL_ATI_texture_compression_3dc");
		GL_EXT_422_pixels = ext.contains("GL_EXT_422_pixels");
		GL_EXT_abgr = ext.contains("GL_EXT_abgr");
		GL_EXT_bgra = ext.contains("GL_EXT_bgra");
		GL_EXT_bindable_uniform = ext.contains("GL_EXT_bindable_uniform") && checkExtension("GL_EXT_bindable_uniform", EXTBindableUniform.isAvailable(this));
		GL_EXT_blend_color = ext.contains("GL_EXT_blend_color") && checkExtension("GL_EXT_blend_color", EXTBlendColor.isAvailable(this));
		GL_EXT_blend_equation_separate = ext.contains("GL_EXT_blend_equation_separate") && checkExtension("GL_EXT_blend_equation_separate", EXTBlendEquationSeparate.isAvailable(this));
		GL_EXT_blend_func_separate = ext.contains("GL_EXT_blend_func_separate") && checkExtension("GL_EXT_blend_func_separate", EXTBlendFuncSeparate.isAvailable(this));
		GL_EXT_blend_minmax = ext.contains("GL_EXT_blend_minmax") && checkExtension("GL_EXT_blend_minmax", EXTBlendMinmax.isAvailable(this));
		GL_EXT_blend_subtract = ext.contains("GL_EXT_blend_subtract");
		GL_EXT_clip_volume_hint = ext.contains("GL_EXT_clip_volume_hint");
		GL_EXT_compiled_vertex_array = ext.contains("GL_EXT_compiled_vertex_array") && checkExtension("GL_EXT_compiled_vertex_array", EXTCompiledVertexArray.isAvailable(this));
		GL_EXT_debug_label = ext.contains("GL_EXT_debug_label") && checkExtension("GL_EXT_debug_label", EXTDebugLabel.isAvailable(this));
		GL_EXT_debug_marker = ext.contains("GL_EXT_debug_marker") && checkExtension("GL_EXT_debug_marker", EXTDebugMarker.isAvailable(this));
		GL_EXT_depth_bounds_test = ext.contains("GL_EXT_depth_bounds_test") && checkExtension("GL_EXT_depth_bounds_test", EXTDepthBoundsTest.isAvailable(this));
		GL_EXT_direct_state_access = ext.contains("GL_EXT_direct_state_access") && checkExtension("GL_EXT_direct_state_access", EXTDirectStateAccess.isAvailable(this, ext));
		GL_EXT_draw_buffers2 = ext.contains("GL_EXT_draw_buffers2") && checkExtension("GL_EXT_draw_buffers2", EXTDrawBuffers2.isAvailable(this));
		GL_EXT_draw_instanced = ext.contains("GL_EXT_draw_instanced") && checkExtension("GL_EXT_draw_instanced", EXTDrawInstanced.isAvailable(this));
		GL_EXT_framebuffer_blit = ext.contains("GL_EXT_framebuffer_blit") && checkExtension("GL_EXT_framebuffer_blit", EXTFramebufferBlit.isAvailable(this));
		GL_EXT_framebuffer_multisample = ext.contains("GL_EXT_framebuffer_multisample") && checkExtension("GL_EXT_framebuffer_multisample", EXTFramebufferMultisample.isAvailable(this));
		GL_EXT_framebuffer_multisample_blit_scaled = ext.contains("GL_EXT_framebuffer_multisample_blit_scaled");
		GL_EXT_framebuffer_object = ext.contains("GL_EXT_framebuffer_object") && checkExtension("GL_EXT_framebuffer_object", EXTFramebufferObject.isAvailable(this));
		GL_EXT_framebuffer_sRGB = ext.contains("GL_EXT_framebuffer_sRGB");
		GL_EXT_geometry_shader4 = ext.contains("GL_EXT_geometry_shader4") && checkExtension("GL_EXT_geometry_shader4", EXTGeometryShader4.isAvailable(this));
		GL_EXT_gpu_program_parameters = ext.contains("GL_EXT_gpu_program_parameters") && checkExtension("GL_EXT_gpu_program_parameters", EXTGPUProgramParameters.isAvailable(this));
		GL_EXT_gpu_shader4 = ext.contains("GL_EXT_gpu_shader4") && checkExtension("GL_EXT_gpu_shader4", EXTGPUShader4.isAvailable(this));
		GL_EXT_packed_depth_stencil = ext.contains("GL_EXT_packed_depth_stencil");
		GL_EXT_packed_float = ext.contains("GL_EXT_packed_float");
		GL_EXT_pixel_buffer_object = ext.contains("GL_EXT_pixel_buffer_object");
		GL_EXT_point_parameters = ext.contains("GL_EXT_point_parameters") && checkExtension("GL_EXT_point_parameters", EXTPointParameters.isAvailable(this));
		GL_EXT_polygon_offset_clamp = ext.contains("GL_EXT_polygon_offset_clamp") && checkExtension("GL_EXT_polygon_offset_clamp", EXTPolygonOffsetClamp.isAvailable(this));
		GL_EXT_post_depth_coverage = ext.contains("GL_EXT_post_depth_coverage");
		GL_EXT_provoking_vertex = ext.contains("GL_EXT_provoking_vertex") && checkExtension("GL_EXT_provoking_vertex", EXTProvokingVertex.isAvailable(this));
		GL_EXT_raster_multisample = ext.contains("GL_EXT_raster_multisample") && checkExtension("GL_EXT_raster_multisample", EXTRasterMultisample.isAvailable(this));
		GL_EXT_secondary_color = ext.contains("GL_EXT_secondary_color") && checkExtension("GL_EXT_secondary_color", EXTSecondaryColor.isAvailable(this));
		GL_EXT_separate_shader_objects = ext.contains("GL_EXT_separate_shader_objects") && checkExtension("GL_EXT_separate_shader_objects", EXTSeparateShaderObjects.isAvailable(this));
		GL_EXT_shader_image_load_formatted = ext.contains("GL_EXT_shader_image_load_formatted");
		GL_EXT_shader_image_load_store = ext.contains("GL_EXT_shader_image_load_store") && checkExtension("GL_EXT_shader_image_load_store", EXTShaderImageLoadStore.isAvailable(this));
		GL_EXT_shader_integer_mix = ext.contains("GL_EXT_shader_integer_mix");
		GL_EXT_shadow_funcs = ext.contains("GL_EXT_shadow_funcs");
		GL_EXT_shared_texture_palette = ext.contains("GL_EXT_shared_texture_palette");
		GL_EXT_sparse_texture2 = ext.contains("GL_EXT_sparse_texture2");
		GL_EXT_stencil_clear_tag = ext.contains("GL_EXT_stencil_clear_tag") && checkExtension("GL_EXT_stencil_clear_tag", EXTStencilClearTag.isAvailable(this));
		GL_EXT_stencil_two_side = ext.contains("GL_EXT_stencil_two_side") && checkExtension("GL_EXT_stencil_two_side", EXTStencilTwoSide.isAvailable(this));
		GL_EXT_stencil_wrap = ext.contains("GL_EXT_stencil_wrap");
		GL_EXT_texture_array = ext.contains("GL_EXT_texture_array") && checkExtension("GL_EXT_texture_array", EXTTextureArray.isAvailable(this));
		GL_EXT_texture_buffer_object = ext.contains("GL_EXT_texture_buffer_object") && checkExtension("GL_EXT_texture_buffer_object", EXTTextureBufferObject.isAvailable(this));
		GL_EXT_texture_compression_latc = ext.contains("GL_EXT_texture_compression_latc");
		GL_EXT_texture_compression_rgtc = ext.contains("GL_EXT_texture_compression_rgtc");
		GL_EXT_texture_compression_s3tc = ext.contains("GL_EXT_texture_compression_s3tc");
		GL_EXT_texture_filter_anisotropic = ext.contains("GL_EXT_texture_filter_anisotropic");
		GL_EXT_texture_filter_minmax = ext.contains("GL_EXT_texture_filter_minmax");
		GL_EXT_texture_integer = ext.contains("GL_EXT_texture_integer") && checkExtension("GL_EXT_texture_integer", EXTTextureInteger.isAvailable(this));
		GL_EXT_texture_mirror_clamp = ext.contains("GL_EXT_texture_mirror_clamp");
		GL_EXT_texture_shared_exponent = ext.contains("GL_EXT_texture_shared_exponent");
		GL_EXT_texture_snorm = ext.contains("GL_EXT_texture_snorm");
		GL_EXT_texture_sRGB = ext.contains("GL_EXT_texture_sRGB");
		GL_EXT_texture_sRGB_decode = ext.contains("GL_EXT_texture_sRGB_decode");
		GL_EXT_texture_swizzle = ext.contains("GL_EXT_texture_swizzle");
		GL_EXT_timer_query = ext.contains("GL_EXT_timer_query") && checkExtension("GL_EXT_timer_query", EXTTimerQuery.isAvailable(this));
		GL_EXT_transform_feedback = ext.contains("GL_EXT_transform_feedback") && checkExtension("GL_EXT_transform_feedback", EXTTransformFeedback.isAvailable(this));
		GL_EXT_vertex_array_bgra = ext.contains("GL_EXT_vertex_array_bgra");
		GL_EXT_vertex_attrib_64bit = ext.contains("GL_EXT_vertex_attrib_64bit") && checkExtension("GL_EXT_vertex_attrib_64bit", EXTVertexAttrib64bit.isAvailable(this, ext));
		GL_EXT_x11_sync_object = ext.contains("GL_EXT_x11_sync_object") && checkExtension("GL_EXT_x11_sync_object", EXTX11SyncObject.isAvailable(this));
		GL_INTEL_fragment_shader_ordering = ext.contains("GL_INTEL_fragment_shader_ordering");
		GL_INTEL_framebuffer_CMAA = ext.contains("GL_INTEL_framebuffer_CMAA") && checkExtension("GL_INTEL_framebuffer_CMAA", INTELFramebufferCMAA.isAvailable(this));
		GL_INTEL_map_texture = ext.contains("GL_INTEL_map_texture") && checkExtension("GL_INTEL_map_texture", INTELMapTexture.isAvailable(this));
		GL_INTEL_performance_query = ext.contains("GL_INTEL_performance_query") && checkExtension("GL_INTEL_performance_query", INTELPerformanceQuery.isAvailable(this));
		GL_KHR_blend_equation_advanced = ext.contains("GL_KHR_blend_equation_advanced") && checkExtension("GL_KHR_blend_equation_advanced", KHRBlendEquationAdvanced.isAvailable(this));
		GL_KHR_blend_equation_advanced_coherent = ext.contains("GL_KHR_blend_equation_advanced_coherent");
		GL_KHR_context_flush_control = ext.contains("GL_KHR_context_flush_control");
		GL_KHR_debug = ext.contains("GL_KHR_debug") && checkExtension("GL_KHR_debug", KHRDebug.isAvailable(this));
		GL_KHR_no_error = ext.contains("GL_KHR_no_error");
		GL_KHR_robust_buffer_access_behavior = ext.contains("GL_KHR_robust_buffer_access_behavior");
		GL_KHR_robustness = ext.contains("GL_KHR_robustness") && checkExtension("GL_KHR_robustness", KHRRobustness.isAvailable(this));
		GL_KHR_texture_compression_astc_hdr = ext.contains("GL_KHR_texture_compression_astc_hdr");
		GL_KHR_texture_compression_astc_ldr = ext.contains("GL_KHR_texture_compression_astc_ldr");
		GL_KHR_texture_compression_astc_sliced_3d = ext.contains("GL_KHR_texture_compression_astc_sliced_3d");
		GL_NV_bindless_multi_draw_indirect = ext.contains("GL_NV_bindless_multi_draw_indirect") && checkExtension("GL_NV_bindless_multi_draw_indirect", NVBindlessMultiDrawIndirect.isAvailable(this));
		GL_NV_bindless_multi_draw_indirect_count = ext.contains("GL_NV_bindless_multi_draw_indirect_count") && checkExtension("GL_NV_bindless_multi_draw_indirect_count", NVBindlessMultiDrawIndirectCount.isAvailable(this));
		GL_NV_bindless_texture = ext.contains("GL_NV_bindless_texture") && checkExtension("GL_NV_bindless_texture", NVBindlessTexture.isAvailable(this));
		GL_NV_blend_equation_advanced = ext.contains("GL_NV_blend_equation_advanced") && checkExtension("GL_NV_blend_equation_advanced", NVBlendEquationAdvanced.isAvailable(this));
		GL_NV_blend_equation_advanced_coherent = ext.contains("GL_NV_blend_equation_advanced_coherent");
		GL_NV_blend_square = ext.contains("GL_NV_blend_square");
		GL_NV_clip_space_w_scaling = ext.contains("GL_NV_clip_space_w_scaling") && checkExtension("GL_NV_clip_space_w_scaling", NVClipSpaceWScaling.isAvailable(this));
		GL_NV_command_list = ext.contains("GL_NV_command_list") && checkExtension("GL_NV_command_list", NVCommandList.isAvailable(this));
		GL_NV_conditional_render = ext.contains("GL_NV_conditional_render") && checkExtension("GL_NV_conditional_render", NVConditionalRender.isAvailable(this));
		GL_NV_conservative_raster = ext.contains("GL_NV_conservative_raster") && checkExtension("GL_NV_conservative_raster", NVConservativeRaster.isAvailable(this));
		GL_NV_conservative_raster_dilate = ext.contains("GL_NV_conservative_raster_dilate") && checkExtension("GL_NV_conservative_raster_dilate", NVConservativeRasterDilate.isAvailable(this));
		GL_NV_conservative_raster_pre_snap_triangles = ext.contains("GL_NV_conservative_raster_pre_snap_triangles") && checkExtension("GL_NV_conservative_raster_pre_snap_triangles", NVConservativeRasterPreSnapTriangles.isAvailable(this));
		GL_NV_copy_depth_to_color = ext.contains("GL_NV_copy_depth_to_color");
		GL_NV_copy_image = ext.contains("GL_NV_copy_image") && checkExtension("GL_NV_copy_image", NVCopyImage.isAvailable(this));
		GL_NV_deep_texture3D = ext.contains("GL_NV_deep_texture3D");
		GL_NV_depth_buffer_float = ext.contains("GL_NV_depth_buffer_float") && checkExtension("GL_NV_depth_buffer_float", NVDepthBufferFloat.isAvailable(this));
		GL_NV_depth_clamp = ext.contains("GL_NV_depth_clamp");
		GL_NV_draw_texture = ext.contains("GL_NV_draw_texture") && checkExtension("GL_NV_draw_texture", NVDrawTexture.isAvailable(this));
		GL_NV_draw_vulkan_image = ext.contains("GL_NV_draw_vulkan_image") && checkExtension("GL_NV_draw_vulkan_image", NVDrawVulkanImage.isAvailable(this));
		GL_NV_ES3_1_compatibility = ext.contains("GL_NV_ES3_1_compatibility");
		GL_NV_explicit_multisample = ext.contains("GL_NV_explicit_multisample") && checkExtension("GL_NV_explicit_multisample", NVExplicitMultisample.isAvailable(this));
		GL_NV_fence = ext.contains("GL_NV_fence") && checkExtension("GL_NV_fence", NVFence.isAvailable(this));
		GL_NV_fill_rectangle = ext.contains("GL_NV_fill_rectangle");
		GL_NV_float_buffer = ext.contains("GL_NV_float_buffer");
		GL_NV_fog_distance = ext.contains("GL_NV_fog_distance");
		GL_NV_fragment_coverage_to_color = ext.contains("GL_NV_fragment_coverage_to_color") && checkExtension("GL_NV_fragment_coverage_to_color", NVFragmentCoverageToColor.isAvailable(this));
		GL_NV_fragment_program4 = ext.contains("GL_NV_fragment_program4");
		GL_NV_fragment_program_option = ext.contains("GL_NV_fragment_program_option");
		GL_NV_fragment_shader_interlock = ext.contains("GL_NV_fragment_shader_interlock");
		GL_NV_framebuffer_mixed_samples = ext.contains("GL_NV_framebuffer_mixed_samples") && checkExtension("GL_NV_framebuffer_mixed_samples", NVFramebufferMixedSamples.isAvailable(this));
		GL_NV_framebuffer_multisample_coverage = ext.contains("GL_NV_framebuffer_multisample_coverage") && checkExtension("GL_NV_framebuffer_multisample_coverage", NVFramebufferMultisampleCoverage.isAvailable(this));
		GL_NV_geometry_shader4 = ext.contains("GL_NV_geometry_shader4");
		GL_NV_geometry_shader_passthrough = ext.contains("GL_NV_geometry_shader_passthrough");
		GL_NV_gpu_shader5 = ext.contains("GL_NV_gpu_shader5") && checkExtension("GL_NV_gpu_shader5", NVGPUShader5.isAvailable(this, ext));
		GL_NV_half_float = ext.contains("GL_NV_half_float") && checkExtension("GL_NV_half_float", NVHalfFloat.isAvailable(this, ext));
		GL_NV_internalformat_sample_query = ext.contains("GL_NV_internalformat_sample_query") && checkExtension("GL_NV_internalformat_sample_query", NVInternalformatSampleQuery.isAvailable(this));
		GL_NV_light_max_exponent = ext.contains("GL_NV_light_max_exponent");
		GL_NV_multisample_coverage = ext.contains("GL_NV_multisample_coverage");
		GL_NV_multisample_filter_hint = ext.contains("GL_NV_multisample_filter_hint");
		GL_NV_packed_depth_stencil = ext.contains("GL_NV_packed_depth_stencil");
		GL_NV_path_rendering = ext.contains("GL_NV_path_rendering") && checkExtension("GL_NV_path_rendering", NVPathRendering.isAvailable(this));
		GL_NV_path_rendering_shared_edge = ext.contains("GL_NV_path_rendering_shared_edge");
		GL_NV_pixel_data_range = ext.contains("GL_NV_pixel_data_range") && checkExtension("GL_NV_pixel_data_range", NVPixelDataRange.isAvailable(this));
		GL_NV_point_sprite = ext.contains("GL_NV_point_sprite") && checkExtension("GL_NV_point_sprite", NVPointSprite.isAvailable(this));
		GL_NV_primitive_restart = ext.contains("GL_NV_primitive_restart") && checkExtension("GL_NV_primitive_restart", NVPrimitiveRestart.isAvailable(this));
		GL_NV_robustness_video_memory_purge = ext.contains("GL_NV_robustness_video_memory_purge");
		GL_NV_sample_locations = ext.contains("GL_NV_sample_locations") && checkExtension("GL_NV_sample_locations", NVSampleLocations.isAvailable(this));
		GL_NV_sample_mask_override_coverage = ext.contains("GL_NV_sample_mask_override_coverage");
		GL_NV_shader_atomic_float = ext.contains("GL_NV_shader_atomic_float");
		GL_NV_shader_atomic_float64 = ext.contains("GL_NV_shader_atomic_float64");
		GL_NV_shader_atomic_fp16_vector = ext.contains("GL_NV_shader_atomic_fp16_vector");
		GL_NV_shader_atomic_int64 = ext.contains("GL_NV_shader_atomic_int64");
		GL_NV_shader_buffer_load = ext.contains("GL_NV_shader_buffer_load") && checkExtension("GL_NV_shader_buffer_load", NVShaderBufferLoad.isAvailable(this));
		GL_NV_shader_buffer_store = ext.contains("GL_NV_shader_buffer_store");
		GL_NV_shader_thread_group = ext.contains("GL_NV_shader_thread_group");
		GL_NV_shader_thread_shuffle = ext.contains("GL_NV_shader_thread_shuffle");
		GL_NV_stereo_view_rendering = ext.contains("GL_NV_stereo_view_rendering");
		GL_NV_texgen_reflection = ext.contains("GL_NV_texgen_reflection");
		GL_NV_texture_barrier = ext.contains("GL_NV_texture_barrier") && checkExtension("GL_NV_texture_barrier", NVTextureBarrier.isAvailable(this));
		GL_NV_texture_compression_vtc = ext.contains("GL_NV_texture_compression_vtc");
		GL_NV_texture_multisample = ext.contains("GL_NV_texture_multisample") && checkExtension("GL_NV_texture_multisample", NVTextureMultisample.isAvailable(this));
		GL_NV_transform_feedback = ext.contains("GL_NV_transform_feedback") && checkExtension("GL_NV_transform_feedback", NVTransformFeedback.isAvailable(this));
		GL_NV_transform_feedback2 = ext.contains("GL_NV_transform_feedback2") && checkExtension("GL_NV_transform_feedback2", NVTransformFeedback2.isAvailable(this));
		GL_NV_uniform_buffer_unified_memory = ext.contains("GL_NV_uniform_buffer_unified_memory");
		GL_NV_vertex_array_range = ext.contains("GL_NV_vertex_array_range") && checkExtension("GL_NV_vertex_array_range", NVVertexArrayRange.isAvailable(this));
		GL_NV_vertex_array_range2 = ext.contains("GL_NV_vertex_array_range2");
		GL_NV_vertex_attrib_integer_64bit = ext.contains("GL_NV_vertex_attrib_integer_64bit") && checkExtension("GL_NV_vertex_attrib_integer_64bit", NVVertexAttribInteger64bit.isAvailable(this, ext));
		GL_NV_vertex_buffer_unified_memory = ext.contains("GL_NV_vertex_buffer_unified_memory") && checkExtension("GL_NV_vertex_buffer_unified_memory", NVVertexBufferUnifiedMemory.isAvailable(this));
		GL_NV_viewport_array2 = ext.contains("GL_NV_viewport_array2");
		GL_NV_viewport_swizzle = ext.contains("GL_NV_viewport_swizzle") && checkExtension("GL_NV_viewport_swizzle", NVViewportSwizzle.isAvailable(this));
		GL_NVX_conditional_render = ext.contains("GL_NVX_conditional_render") && checkExtension("GL_NVX_conditional_render", NVXConditionalRender.isAvailable(this));
		GL_NVX_gpu_memory_info = ext.contains("GL_NVX_gpu_memory_info");
		GL_OVR_multiview = ext.contains("GL_OVR_multiview") && checkExtension("GL_OVR_multiview", OVRMultiview.isAvailable(this));
		GL_OVR_multiview2 = ext.contains("GL_OVR_multiview2");
	}

	private static long getFunctionAddress(boolean fc, FunctionProvider provider, String functionName) {
		return fc ? NULL : provider.getFunctionAddress(functionName);
	}

	private static boolean checkExtension(String extension, boolean supported) {
		if ( supported )
			return true;

		apiLog("[GL] " + extension + " was reported as available but an entry point is missing.");
		return false;
	}

}