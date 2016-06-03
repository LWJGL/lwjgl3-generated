/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.MemoryUtil.*;

/** Defines the capabilities of an OpenGL ES context. */
public final class GLESCapabilities {

	public final long
		glActiveShaderProgram,
		glActiveShaderProgramEXT,
		glActiveTexture,
		glAlphaFuncQCOM,
		glApplyFramebufferAttachmentCMAAINTEL,
		glAttachShader,
		glBeginConditionalRenderNV,
		glBeginPerfMonitorAMD,
		glBeginPerfQueryINTEL,
		glBeginQuery,
		glBeginQueryEXT,
		glBeginTransformFeedback,
		glBindAttribLocation,
		glBindBuffer,
		glBindBufferBase,
		glBindBufferRange,
		glBindFragDataLocationEXT,
		glBindFragDataLocationIndexedEXT,
		glBindFramebuffer,
		glBindImageTexture,
		glBindProgramPipeline,
		glBindProgramPipelineEXT,
		glBindRenderbuffer,
		glBindSampler,
		glBindTexture,
		glBindTransformFeedback,
		glBindVertexArray,
		glBindVertexArrayOES,
		glBindVertexBuffer,
		glBlendBarrier,
		glBlendBarrierKHR,
		glBlendBarrierNV,
		glBlendColor,
		glBlendEquation,
		glBlendEquationSeparate,
		glBlendEquationSeparatei,
		glBlendEquationSeparateiEXT,
		glBlendEquationSeparateiOES,
		glBlendEquationi,
		glBlendEquationiEXT,
		glBlendEquationiOES,
		glBlendFunc,
		glBlendFuncSeparate,
		glBlendFuncSeparatei,
		glBlendFuncSeparateiEXT,
		glBlendFuncSeparateiOES,
		glBlendFunci,
		glBlendFunciEXT,
		glBlendFunciOES,
		glBlendParameteriNV,
		glBlitFramebuffer,
		glBlitFramebufferANGLE,
		glBlitFramebufferNV,
		glBufferData,
		glBufferStorageEXT,
		glBufferSubData,
		glCheckFramebufferStatus,
		glClear,
		glClearBufferfi,
		glClearBufferfv,
		glClearBufferiv,
		glClearBufferuiv,
		glClearColor,
		glClearDepthf,
		glClearPixelLocalStorageuiEXT,
		glClearStencil,
		glClientWaitSync,
		glClientWaitSyncAPPLE,
		glColorMask,
		glColorMaski,
		glColorMaskiEXT,
		glColorMaskiOES,
		glCompileShader,
		glCompressedTexImage2D,
		glCompressedTexImage3D,
		glCompressedTexImage3DNV,
		glCompressedTexImage3DOES,
		glCompressedTexSubImage2D,
		glCompressedTexSubImage3D,
		glCompressedTexSubImage3DNV,
		glCompressedTexSubImage3DOES,
		glConservativeRasterParameteriNV,
		glCopyBufferSubData,
		glCopyBufferSubDataNV,
		glCopyImageSubData,
		glCopyImageSubDataEXT,
		glCopyImageSubDataOES,
		glCopyPathNV,
		glCopyTexImage2D,
		glCopyTexSubImage2D,
		glCopyTexSubImage3D,
		glCopyTexSubImage3DNV,
		glCopyTexSubImage3DOES,
		glCopyTextureLevelsAPPLE,
		glCoverFillPathInstancedNV,
		glCoverFillPathNV,
		glCoverStrokePathInstancedNV,
		glCoverStrokePathNV,
		glCoverageMaskNV,
		glCoverageModulationNV,
		glCoverageModulationTableNV,
		glCoverageOperationNV,
		glCreatePerfQueryINTEL,
		glCreateProgram,
		glCreateShader,
		glCreateShaderProgramv,
		glCreateShaderProgramvEXT,
		glCullFace,
		glDebugMessageCallback,
		glDebugMessageCallbackKHR,
		glDebugMessageControl,
		glDebugMessageControlKHR,
		glDebugMessageInsert,
		glDebugMessageInsertKHR,
		glDeleteBuffers,
		glDeleteFencesNV,
		glDeleteFramebuffers,
		glDeletePathsNV,
		glDeletePerfMonitorsAMD,
		glDeletePerfQueryINTEL,
		glDeleteProgram,
		glDeleteProgramPipelines,
		glDeleteProgramPipelinesEXT,
		glDeleteQueries,
		glDeleteQueriesEXT,
		glDeleteRenderbuffers,
		glDeleteSamplers,
		glDeleteShader,
		glDeleteSync,
		glDeleteSyncAPPLE,
		glDeleteTextures,
		glDeleteTransformFeedbacks,
		glDeleteVertexArrays,
		glDeleteVertexArraysOES,
		glDepthFunc,
		glDepthMask,
		glDepthRangeArrayfvNV,
		glDepthRangeIndexedfNV,
		glDepthRangef,
		glDetachShader,
		glDisable,
		glDisableDriverControlQCOM,
		glDisableVertexAttribArray,
		glDisablei,
		glDisableiEXT,
		glDisableiNV,
		glDisableiOES,
		glDiscardFramebufferEXT,
		glDispatchCompute,
		glDispatchComputeIndirect,
		glDrawArrays,
		glDrawArraysIndirect,
		glDrawArraysInstanced,
		glDrawArraysInstancedANGLE,
		glDrawArraysInstancedBaseInstanceEXT,
		glDrawArraysInstancedEXT,
		glDrawArraysInstancedNV,
		glDrawBuffers,
		glDrawBuffersEXT,
		glDrawBuffersIndexedEXT,
		glDrawBuffersNV,
		glDrawElements,
		glDrawElementsBaseVertex,
		glDrawElementsBaseVertexEXT,
		glDrawElementsBaseVertexOES,
		glDrawElementsIndirect,
		glDrawElementsInstanced,
		glDrawElementsInstancedANGLE,
		glDrawElementsInstancedBaseInstanceEXT,
		glDrawElementsInstancedBaseVertex,
		glDrawElementsInstancedBaseVertexBaseInstanceEXT,
		glDrawElementsInstancedBaseVertexEXT,
		glDrawElementsInstancedBaseVertexOES,
		glDrawElementsInstancedEXT,
		glDrawElementsInstancedNV,
		glDrawRangeElements,
		glDrawRangeElementsBaseVertex,
		glDrawRangeElementsBaseVertexEXT,
		glDrawRangeElementsBaseVertexOES,
		glEGLImageTargetRenderbufferStorageOES,
		glEGLImageTargetTexture2DOES,
		glEnable,
		glEnableDriverControlQCOM,
		glEnableVertexAttribArray,
		glEnablei,
		glEnableiEXT,
		glEnableiNV,
		glEnableiOES,
		glEndConditionalRenderNV,
		glEndPerfMonitorAMD,
		glEndPerfQueryINTEL,
		glEndQuery,
		glEndQueryEXT,
		glEndTilingQCOM,
		glEndTransformFeedback,
		glExtGetBufferPointervQCOM,
		glExtGetBuffersQCOM,
		glExtGetFramebuffersQCOM,
		glExtGetProgramBinarySourceQCOM,
		glExtGetProgramsQCOM,
		glExtGetRenderbuffersQCOM,
		glExtGetShadersQCOM,
		glExtGetTexLevelParameterivQCOM,
		glExtGetTexSubImageQCOM,
		glExtGetTexturesQCOM,
		glExtIsProgramBinaryQCOM,
		glExtTexObjectStateOverrideiQCOM,
		glFenceSync,
		glFenceSyncAPPLE,
		glFinish,
		glFinishFenceNV,
		glFlush,
		glFlushMappedBufferRange,
		glFlushMappedBufferRangeEXT,
		glFragmentCoverageColorNV,
		glFramebufferParameteri,
		glFramebufferPixelLocalStorageSizeEXT,
		glFramebufferRenderbuffer,
		glFramebufferSampleLocationsfvNV,
		glFramebufferTexture,
		glFramebufferTexture2D,
		glFramebufferTexture2DDownsampleIMG,
		glFramebufferTexture2DMultisampleEXT,
		glFramebufferTexture2DMultisampleIMG,
		glFramebufferTexture3DOES,
		glFramebufferTextureEXT,
		glFramebufferTextureLayer,
		glFramebufferTextureLayerDownsampleIMG,
		glFramebufferTextureLayerNV,
		glFramebufferTextureMultisampleMultiviewOVR,
		glFramebufferTextureMultiviewOVR,
		glFramebufferTextureOES,
		glFrontFace,
		glGenBuffers,
		glGenFencesNV,
		glGenFramebuffers,
		glGenPathsNV,
		glGenPerfMonitorsAMD,
		glGenProgramPipelines,
		glGenProgramPipelinesEXT,
		glGenQueries,
		glGenQueriesEXT,
		glGenRenderbuffers,
		glGenSamplers,
		glGenTextures,
		glGenTransformFeedbacks,
		glGenVertexArrays,
		glGenVertexArraysOES,
		glGenerateMipmap,
		glGetActiveAttrib,
		glGetActiveUniform,
		glGetActiveUniformBlockName,
		glGetActiveUniformBlockiv,
		glGetActiveUniformsiv,
		glGetAttachedShaders,
		glGetAttribLocation,
		glGetBooleani_v,
		glGetBooleanv,
		glGetBufferParameteri64v,
		glGetBufferParameteriv,
		glGetBufferPointerv,
		glGetBufferPointervOES,
		glGetCoverageModulationTableNV,
		glGetDebugMessageLog,
		glGetDebugMessageLogKHR,
		glGetDriverControlStringQCOM,
		glGetDriverControlsQCOM,
		glGetError,
		glGetFenceivNV,
		glGetFirstPerfQueryIdINTEL,
		glGetFloati_vNV,
		glGetFloatv,
		glGetFragDataIndexEXT,
		glGetFragDataLocation,
		glGetFramebufferAttachmentParameteriv,
		glGetFramebufferParameteriv,
		glGetFramebufferPixelLocalStorageSizeEXT,
		glGetGraphicsResetStatus,
		glGetGraphicsResetStatusEXT,
		glGetGraphicsResetStatusKHR,
		glGetImageHandleNV,
		glGetInteger64i_v,
		glGetInteger64v,
		glGetInteger64vAPPLE,
		glGetIntegeri_v,
		glGetIntegeri_vEXT,
		glGetIntegerv,
		glGetInternalformatSampleivNV,
		glGetInternalformativ,
		glGetMultisamplefv,
		glGetNextPerfQueryIdINTEL,
		glGetObjectLabel,
		glGetObjectLabelEXT,
		glGetObjectLabelKHR,
		glGetObjectPtrLabel,
		glGetObjectPtrLabelKHR,
		glGetPathCommandsNV,
		glGetPathCoordsNV,
		glGetPathDashArrayNV,
		glGetPathLengthNV,
		glGetPathMetricRangeNV,
		glGetPathMetricsNV,
		glGetPathParameterfvNV,
		glGetPathParameterivNV,
		glGetPathSpacingNV,
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
		glGetPointerv,
		glGetPointervKHR,
		glGetProgramBinary,
		glGetProgramBinaryOES,
		glGetProgramInfoLog,
		glGetProgramInterfaceiv,
		glGetProgramPipelineInfoLog,
		glGetProgramPipelineInfoLogEXT,
		glGetProgramPipelineiv,
		glGetProgramPipelineivEXT,
		glGetProgramResourceIndex,
		glGetProgramResourceLocation,
		glGetProgramResourceLocationIndexEXT,
		glGetProgramResourceName,
		glGetProgramResourcefvNV,
		glGetProgramResourceiv,
		glGetProgramiv,
		glGetQueryObjecti64vEXT,
		glGetQueryObjectivEXT,
		glGetQueryObjectui64vEXT,
		glGetQueryObjectuiv,
		glGetQueryObjectuivEXT,
		glGetQueryiv,
		glGetQueryivEXT,
		glGetRenderbufferParameteriv,
		glGetSamplerParameterIiv,
		glGetSamplerParameterIivEXT,
		glGetSamplerParameterIivOES,
		glGetSamplerParameterIuiv,
		glGetSamplerParameterIuivEXT,
		glGetSamplerParameterIuivOES,
		glGetSamplerParameterfv,
		glGetSamplerParameteriv,
		glGetShaderInfoLog,
		glGetShaderPrecisionFormat,
		glGetShaderSource,
		glGetShaderiv,
		glGetString,
		glGetStringi,
		glGetSynciv,
		glGetSyncivAPPLE,
		glGetTexLevelParameterfv,
		glGetTexLevelParameteriv,
		glGetTexParameterIiv,
		glGetTexParameterIivEXT,
		glGetTexParameterIivOES,
		glGetTexParameterIuiv,
		glGetTexParameterIuivEXT,
		glGetTexParameterIuivOES,
		glGetTexParameterfv,
		glGetTexParameteriv,
		glGetTextureHandleNV,
		glGetTextureSamplerHandleNV,
		glGetTransformFeedbackVarying,
		glGetTranslatedShaderSourceANGLE,
		glGetUniformBlockIndex,
		glGetUniformIndices,
		glGetUniformLocation,
		glGetUniformfv,
		glGetUniformi64vNV,
		glGetUniformiv,
		glGetUniformui64vNV,
		glGetUniformuiv,
		glGetVertexAttribIiv,
		glGetVertexAttribIuiv,
		glGetVertexAttribPointerv,
		glGetVertexAttribfv,
		glGetVertexAttribiv,
		glGetnUniformfv,
		glGetnUniformfvEXT,
		glGetnUniformfvKHR,
		glGetnUniformiv,
		glGetnUniformivEXT,
		glGetnUniformivKHR,
		glGetnUniformuiv,
		glGetnUniformuivKHR,
		glHint,
		glInsertEventMarkerEXT,
		glInterpolatePathsNV,
		glInvalidateFramebuffer,
		glInvalidateSubFramebuffer,
		glIsBuffer,
		glIsEnabled,
		glIsEnabledi,
		glIsEnablediEXT,
		glIsEnablediNV,
		glIsEnablediOES,
		glIsFenceNV,
		glIsFramebuffer,
		glIsImageHandleResidentNV,
		glIsPathNV,
		glIsPointInFillPathNV,
		glIsPointInStrokePathNV,
		glIsProgram,
		glIsProgramPipeline,
		glIsProgramPipelineEXT,
		glIsQuery,
		glIsQueryEXT,
		glIsRenderbuffer,
		glIsSampler,
		glIsShader,
		glIsSync,
		glIsSyncAPPLE,
		glIsTexture,
		glIsTextureHandleResidentNV,
		glIsTransformFeedback,
		glIsVertexArray,
		glIsVertexArrayOES,
		glLabelObjectEXT,
		glLineWidth,
		glLinkProgram,
		glMakeImageHandleNonResidentNV,
		glMakeImageHandleResidentNV,
		glMakeTextureHandleNonResidentNV,
		glMakeTextureHandleResidentNV,
		glMapBufferOES,
		glMapBufferRange,
		glMapBufferRangeEXT,
		glMatrixLoad3x2fNV,
		glMatrixLoad3x3fNV,
		glMatrixLoadTranspose3x3fNV,
		glMatrixMult3x2fNV,
		glMatrixMult3x3fNV,
		glMatrixMultTranspose3x3fNV,
		glMemoryBarrier,
		glMemoryBarrierByRegion,
		glMinSampleShading,
		glMinSampleShadingOES,
		glMultiDrawArraysEXT,
		glMultiDrawArraysIndirectEXT,
		glMultiDrawElementsBaseVertexEXT,
		glMultiDrawElementsBaseVertexOES,
		glMultiDrawElementsEXT,
		glMultiDrawElementsIndirectEXT,
		glNamedFramebufferSampleLocationsfvNV,
		glObjectLabel,
		glObjectLabelKHR,
		glObjectPtrLabel,
		glObjectPtrLabelKHR,
		glPatchParameteri,
		glPatchParameteriEXT,
		glPatchParameteriOES,
		glPathCommandsNV,
		glPathCoordsNV,
		glPathCoverDepthFuncNV,
		glPathDashArrayNV,
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
		glPauseTransformFeedback,
		glPixelStorei,
		glPointAlongPathNV,
		glPolygonModeNV,
		glPolygonOffset,
		glPolygonOffsetClampEXT,
		glPopDebugGroup,
		glPopDebugGroupKHR,
		glPopGroupMarkerEXT,
		glPrimitiveBoundingBox,
		glPrimitiveBoundingBoxEXT,
		glPrimitiveBoundingBoxOES,
		glProgramBinary,
		glProgramBinaryOES,
		glProgramParameteri,
		glProgramParameteriEXT,
		glProgramPathFragmentInputGenNV,
		glProgramUniform1f,
		glProgramUniform1fEXT,
		glProgramUniform1fv,
		glProgramUniform1fvEXT,
		glProgramUniform1i,
		glProgramUniform1i64NV,
		glProgramUniform1i64vNV,
		glProgramUniform1iEXT,
		glProgramUniform1iv,
		glProgramUniform1ivEXT,
		glProgramUniform1ui,
		glProgramUniform1ui64NV,
		glProgramUniform1ui64vNV,
		glProgramUniform1uiEXT,
		glProgramUniform1uiv,
		glProgramUniform1uivEXT,
		glProgramUniform2f,
		glProgramUniform2fEXT,
		glProgramUniform2fv,
		glProgramUniform2fvEXT,
		glProgramUniform2i,
		glProgramUniform2i64NV,
		glProgramUniform2i64vNV,
		glProgramUniform2iEXT,
		glProgramUniform2iv,
		glProgramUniform2ivEXT,
		glProgramUniform2ui,
		glProgramUniform2ui64NV,
		glProgramUniform2ui64vNV,
		glProgramUniform2uiEXT,
		glProgramUniform2uiv,
		glProgramUniform2uivEXT,
		glProgramUniform3f,
		glProgramUniform3fEXT,
		glProgramUniform3fv,
		glProgramUniform3fvEXT,
		glProgramUniform3i,
		glProgramUniform3i64NV,
		glProgramUniform3i64vNV,
		glProgramUniform3iEXT,
		glProgramUniform3iv,
		glProgramUniform3ivEXT,
		glProgramUniform3ui,
		glProgramUniform3ui64NV,
		glProgramUniform3ui64vNV,
		glProgramUniform3uiEXT,
		glProgramUniform3uiv,
		glProgramUniform3uivEXT,
		glProgramUniform4f,
		glProgramUniform4fEXT,
		glProgramUniform4fv,
		glProgramUniform4fvEXT,
		glProgramUniform4i,
		glProgramUniform4i64NV,
		glProgramUniform4i64vNV,
		glProgramUniform4iEXT,
		glProgramUniform4iv,
		glProgramUniform4ivEXT,
		glProgramUniform4ui,
		glProgramUniform4ui64NV,
		glProgramUniform4ui64vNV,
		glProgramUniform4uiEXT,
		glProgramUniform4uiv,
		glProgramUniform4uivEXT,
		glProgramUniformHandleui64NV,
		glProgramUniformHandleui64vNV,
		glProgramUniformMatrix2fv,
		glProgramUniformMatrix2fvEXT,
		glProgramUniformMatrix2x3fv,
		glProgramUniformMatrix2x3fvEXT,
		glProgramUniformMatrix2x4fv,
		glProgramUniformMatrix2x4fvEXT,
		glProgramUniformMatrix3fv,
		glProgramUniformMatrix3fvEXT,
		glProgramUniformMatrix3x2fv,
		glProgramUniformMatrix3x2fvEXT,
		glProgramUniformMatrix3x4fv,
		glProgramUniformMatrix3x4fvEXT,
		glProgramUniformMatrix4fv,
		glProgramUniformMatrix4fvEXT,
		glProgramUniformMatrix4x2fv,
		glProgramUniformMatrix4x2fvEXT,
		glProgramUniformMatrix4x3fv,
		glProgramUniformMatrix4x3fvEXT,
		glPushDebugGroup,
		glPushDebugGroupKHR,
		glPushGroupMarkerEXT,
		glQueryCounterEXT,
		glRasterSamplesEXT,
		glReadBuffer,
		glReadBufferIndexedEXT,
		glReadBufferNV,
		glReadPixels,
		glReadnPixels,
		glReadnPixelsEXT,
		glReadnPixelsKHR,
		glReleaseShaderCompiler,
		glRenderbufferStorage,
		glRenderbufferStorageMultisample,
		glRenderbufferStorageMultisampleANGLE,
		glRenderbufferStorageMultisampleAPPLE,
		glRenderbufferStorageMultisampleEXT,
		glRenderbufferStorageMultisampleIMG,
		glRenderbufferStorageMultisampleNV,
		glResolveDepthValuesNV,
		glResolveMultisampleFramebufferAPPLE,
		glResumeTransformFeedback,
		glSampleCoverage,
		glSampleMaski,
		glSamplerParameterIiv,
		glSamplerParameterIivEXT,
		glSamplerParameterIivOES,
		glSamplerParameterIuiv,
		glSamplerParameterIuivEXT,
		glSamplerParameterIuivOES,
		glSamplerParameterf,
		glSamplerParameterfv,
		glSamplerParameteri,
		glSamplerParameteriv,
		glScissor,
		glScissorArrayvNV,
		glScissorIndexedNV,
		glScissorIndexedvNV,
		glSelectPerfMonitorCountersAMD,
		glSetFenceNV,
		glShaderBinary,
		glShaderSource,
		glStartTilingQCOM,
		glStencilFillPathInstancedNV,
		glStencilFillPathNV,
		glStencilFunc,
		glStencilFuncSeparate,
		glStencilMask,
		glStencilMaskSeparate,
		glStencilOp,
		glStencilOpSeparate,
		glStencilStrokePathInstancedNV,
		glStencilStrokePathNV,
		glStencilThenCoverFillPathInstancedNV,
		glStencilThenCoverFillPathNV,
		glStencilThenCoverStrokePathInstancedNV,
		glStencilThenCoverStrokePathNV,
		glSubpixelPrecisionBiasNV,
		glTestFenceNV,
		glTexBuffer,
		glTexBufferEXT,
		glTexBufferOES,
		glTexBufferRange,
		glTexBufferRangeEXT,
		glTexBufferRangeOES,
		glTexImage2D,
		glTexImage3D,
		glTexImage3DNV,
		glTexImage3DOES,
		glTexPageCommitmentARB,
		glTexParameterIiv,
		glTexParameterIivEXT,
		glTexParameterIivOES,
		glTexParameterIuiv,
		glTexParameterIuivEXT,
		glTexParameterIuivOES,
		glTexParameterf,
		glTexParameterfv,
		glTexParameteri,
		glTexParameteriv,
		glTexStorage1DEXT,
		glTexStorage2D,
		glTexStorage2DEXT,
		glTexStorage2DMultisample,
		glTexStorage3D,
		glTexStorage3DEXT,
		glTexStorage3DMultisample,
		glTexStorage3DMultisampleOES,
		glTexSubImage2D,
		glTexSubImage3D,
		glTexSubImage3DNV,
		glTexSubImage3DOES,
		glTextureStorage1DEXT,
		glTextureStorage2DEXT,
		glTextureStorage3DEXT,
		glTextureViewEXT,
		glTextureViewOES,
		glTransformFeedbackVaryings,
		glTransformPathNV,
		glUniform1f,
		glUniform1fv,
		glUniform1i,
		glUniform1i64NV,
		glUniform1i64vNV,
		glUniform1iv,
		glUniform1ui,
		glUniform1ui64NV,
		glUniform1ui64vNV,
		glUniform1uiv,
		glUniform2f,
		glUniform2fv,
		glUniform2i,
		glUniform2i64NV,
		glUniform2i64vNV,
		glUniform2iv,
		glUniform2ui,
		glUniform2ui64NV,
		glUniform2ui64vNV,
		glUniform2uiv,
		glUniform3f,
		glUniform3fv,
		glUniform3i,
		glUniform3i64NV,
		glUniform3i64vNV,
		glUniform3iv,
		glUniform3ui,
		glUniform3ui64NV,
		glUniform3ui64vNV,
		glUniform3uiv,
		glUniform4f,
		glUniform4fv,
		glUniform4i,
		glUniform4i64NV,
		glUniform4i64vNV,
		glUniform4iv,
		glUniform4ui,
		glUniform4ui64NV,
		glUniform4ui64vNV,
		glUniform4uiv,
		glUniformBlockBinding,
		glUniformHandleui64NV,
		glUniformHandleui64vNV,
		glUniformMatrix2fv,
		glUniformMatrix2x3fv,
		glUniformMatrix2x3fvNV,
		glUniformMatrix2x4fv,
		glUniformMatrix2x4fvNV,
		glUniformMatrix3fv,
		glUniformMatrix3x2fv,
		glUniformMatrix3x2fvNV,
		glUniformMatrix3x4fv,
		glUniformMatrix3x4fvNV,
		glUniformMatrix4fv,
		glUniformMatrix4x2fv,
		glUniformMatrix4x2fvNV,
		glUniformMatrix4x3fv,
		glUniformMatrix4x3fvNV,
		glUnmapBuffer,
		glUnmapBufferOES,
		glUseProgram,
		glUseProgramStages,
		glUseProgramStagesEXT,
		glValidateProgram,
		glValidateProgramPipeline,
		glValidateProgramPipelineEXT,
		glVertexAttrib1f,
		glVertexAttrib1fv,
		glVertexAttrib2f,
		glVertexAttrib2fv,
		glVertexAttrib3f,
		glVertexAttrib3fv,
		glVertexAttrib4f,
		glVertexAttrib4fv,
		glVertexAttribBinding,
		glVertexAttribDivisor,
		glVertexAttribDivisorANGLE,
		glVertexAttribDivisorEXT,
		glVertexAttribDivisorNV,
		glVertexAttribFormat,
		glVertexAttribI4i,
		glVertexAttribI4iv,
		glVertexAttribI4ui,
		glVertexAttribI4uiv,
		glVertexAttribIFormat,
		glVertexAttribIPointer,
		glVertexAttribPointer,
		glVertexBindingDivisor,
		glViewport,
		glViewportArrayvNV,
		glViewportIndexedfNV,
		glViewportIndexedfvNV,
		glViewportSwizzleNV,
		glWaitSync,
		glWaitSyncAPPLE,
		glWeightPathsNV;

	/** When true, {@link GLES20} is supported. */
	public final boolean GLES20;
	/** When true, {@link GLES30} is supported. */
	public final boolean GLES30;
	/** When true, {@link GLES31} is supported. */
	public final boolean GLES31;
	/** When true, {@link GLES32} is supported. */
	public final boolean GLES32;
	/** When true, {@link AMDCompressed3DCTexture} is supported. */
	public final boolean GL_AMD_compressed_3DC_texture;
	/** When true, {@link AMDCompressedATCTexture} is supported. */
	public final boolean GL_AMD_compressed_ATC_texture;
	/** When true, {@link AMDPerformanceMonitor} is supported. */
	public final boolean GL_AMD_performance_monitor;
	/** When true, {@link AMDProgramBinaryZ400} is supported. */
	public final boolean GL_AMD_program_binary_Z400;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/ANDROID/ANDROID_extension_pack_es31a.txt">ANDROID_extension_pack_es31a</a> extension is supported.
	 * 
	 * <p>This extension changes little functionality directly. Instead it serves to roll up the 20 extensions it requires, allowing applications to check for
	 * all of them at once, and enable all of their shading language features with a single #extension statement. The Android platform provides special
	 * support outside of OpenGL ES to help applications target this set of extensions.</p>
	 * 
	 * <p>In addition, this extension ensures support for images, shader storage buffers, and atomic counters in fragment shaders. In unextended OpenGL ES the
	 * minimum value of the relevant implementation-defined limits is zero; this extension raises these minimums to match the minimums for compute shaders.</p>
	 * 
	 * <p>Requires {@link GLES31 GLES 3.1}.</p>
	 */
	public final boolean GL_ANDROID_extension_pack_es31a;
	/** When true, {@link ANGLEDepthTexture} is supported. */
	public final boolean GL_ANGLE_depth_texture;
	/** When true, {@link ANGLEFramebufferBlit} is supported. */
	public final boolean GL_ANGLE_framebuffer_blit;
	/** When true, {@link ANGLEFramebufferMultisample} is supported. */
	public final boolean GL_ANGLE_framebuffer_multisample;
	/** When true, {@link ANGLEInstancedArrays} is supported. */
	public final boolean GL_ANGLE_instanced_arrays;
	/** When true, {@link ANGLEPackReverseRowOrder} is supported. */
	public final boolean GL_ANGLE_pack_reverse_row_order;
	/** When true, {@link ANGLEProgramBinary} is supported. */
	public final boolean GL_ANGLE_program_binary;
	/** When true, {@link ANGLETextureCompressionDXT1} is supported. */
	public final boolean GL_ANGLE_texture_compression_dxt1;
	/** When true, {@link ANGLETextureCompressionDXT3} is supported. */
	public final boolean GL_ANGLE_texture_compression_dxt3;
	/** When true, {@link ANGLETextureCompressionDXT5} is supported. */
	public final boolean GL_ANGLE_texture_compression_dxt5;
	/** When true, {@link ANGLETextureUsage} is supported. */
	public final boolean GL_ANGLE_texture_usage;
	/** When true, {@link ANGLETranslatedShaderSource} is supported. */
	public final boolean GL_ANGLE_translated_shader_source;
	/** When true, {@link APPLEClipDistance} is supported. */
	public final boolean GL_APPLE_clip_distance;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/APPLE/APPLE_color_buffer_packed_float.txt">APPLE_color_buffer_packed_float</a> extension is supported.
	 * 
	 * <p>This extension allows two packed floating point formats R11F_G11F_B10F and as RGB9_E5 defined in APPLE_texture_packed_float or OpenGL ES 3.0 or to be
	 * rendered to via framebuffer objects.</p>
	 * 
	 * <p>Requires {@link EXTColorBufferHalfFloat EXT_color_buffer_half_float} and {@link GLES30 GLES 3.0} or {@link APPLETexturePackedFloat APPLE_texture_packed_float}.</p>
	 */
	public final boolean GL_APPLE_color_buffer_packed_float;
	/** When true, {@link APPLECopyTextureLevels} is supported. */
	public final boolean GL_APPLE_copy_texture_levels;
	/** When true, {@link APPLEFramebufferMultisample} is supported. */
	public final boolean GL_APPLE_framebuffer_multisample;
	/** When true, {@link APPLERGB422} is supported. */
	public final boolean GL_APPLE_rgb_422;
	/** When true, {@link APPLESync} is supported. */
	public final boolean GL_APPLE_sync;
	/** When true, {@link APPLETextureFormatBGRA8888} is supported. */
	public final boolean GL_APPLE_texture_format_BGRA8888;
	/** When true, {@link APPLETextureMaxLevel} is supported. */
	public final boolean GL_APPLE_texture_max_level;
	/** When true, {@link APPLETexturePackedFloat} is supported. */
	public final boolean GL_APPLE_texture_packed_float;
	/** When true, {@link ARMMaliProgramBinary} is supported. */
	public final boolean GL_ARM_mali_program_binary;
	/** When true, {@link ARMMaliShaderBinary} is supported. */
	public final boolean GL_ARM_mali_shader_binary;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/ARM/ARM_rgba8.txt">ARM_rgba8</a> extension is supported.
	 * 
	 * <p>This extension enables a RGBA8 renderbuffer storage format. It is similar to OES_rgb8_rgba8, but only exposes RGBA8.</p>
	 * 
	 * <p>Requires {@link GLES20 GLES 2.0}.</p>
	 */
	public final boolean GL_ARM_rgba8;
	/** When true, {@link ARMShaderFramebufferFetch} is supported. */
	public final boolean GL_ARM_shader_framebuffer_fetch;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/ARM/ARM_shader_framebuffer_fetch_depth_stencil.txt">ARM_shader_framebuffer_fetch_depth_stencil</a> extension is supported.
	 * 
	 * <p>Existing extensions, such as EXT_shader_framebuffer_fetch, allow fragment shaders to read existing framebuffer color data as input. This enables
	 * use-cases such as programmable blending, and other operations that may not be possible to implement with fixed-function blending.</p>
	 * 
	 * <p>This extension adds similar capabilities for depth and stencil values.</p>
	 * 
	 * <p>One use-case for this is soft depth-blending of particles. Normally, this would require two render passes: one that writes out the depth values of the
	 * background geometry to a depth texture, and one that renders the particles while reading from the depth texture to do the blending. This extension
	 * allows this to be done in a single pass.</p>
	 * 
	 * <p>Requires {@link GLES20 GLES 2.0}.</p>
	 */
	public final boolean GL_ARM_shader_framebuffer_fetch_depth_stencil;
	/** When true, {@link DMPProgramBinary} is supported. */
	public final boolean GL_DMP_program_binary;
	/** When true, {@link DMPShaderBinary} is supported. */
	public final boolean GL_DMP_shader_binary;
	/** When true, {@link EXTBaseInstance} is supported. */
	public final boolean GL_EXT_base_instance;
	/** When true, {@link EXTBlendFuncExtended} is supported. */
	public final boolean GL_EXT_blend_func_extended;
	/** When true, {@link EXTBlendMinmax} is supported. */
	public final boolean GL_EXT_blend_minmax;
	/** When true, {@link EXTBufferStorage} is supported. */
	public final boolean GL_EXT_buffer_storage;
	/** When true, {@link EXTClipCullDistance} is supported. */
	public final boolean GL_EXT_clip_cull_distance;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_color_buffer_float.txt">EXT_color_buffer_float</a> extension is supported.
	 * 
	 * <p>This extension allows a variety of floating point formats to be rendered to via framebuffer objects.</p>
	 * 
	 * <p>Requires {@link GLES30 GLES 3.0}.</p>
	 */
	public final boolean GL_EXT_color_buffer_float;
	/** When true, {@link EXTColorBufferHalfFloat} is supported. */
	public final boolean GL_EXT_color_buffer_half_float;
	/** When true, {@link EXTCopyImage} is supported. */
	public final boolean GL_EXT_copy_image;
	/** When true, {@link EXTDebugLabel} is supported. */
	public final boolean GL_EXT_debug_label;
	/** When true, {@link EXTDebugMarker} is supported. */
	public final boolean GL_EXT_debug_marker;
	/** When true, {@link EXTDiscardFramebuffer} is supported. */
	public final boolean GL_EXT_discard_framebuffer;
	/** When true, {@link EXTDisjointTimerQuery} is supported. */
	public final boolean GL_EXT_disjoint_timer_query;
	/** When true, {@link EXTDrawBuffers} is supported. */
	public final boolean GL_EXT_draw_buffers;
	/** When true, {@link EXTDrawBuffersIndexed} is supported. */
	public final boolean GL_EXT_draw_buffers_indexed;
	/** When true, {@link EXTDrawElementsBaseVertex} is supported. */
	public final boolean GL_EXT_draw_elements_base_vertex;
	/** When true, {@link EXTDrawInstanced} is supported. */
	public final boolean GL_EXT_draw_instanced;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_float_blend.txt">EXT_float_blend</a> extension is supported.
	 * 
	 * <p>This extension expands upon the EXT_color_buffer_float extension to allow support for blending with 32-bit floating-point color buffers.</p>
	 * 
	 * <p>Requires {@link #GL_EXT_color_buffer_float EXT_color_buffer_float}.</p>
	 */
	public final boolean GL_EXT_float_blend;
	/** When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_geometry_shader.txt">EXT_geometry_point_size</a> extension is supported. */
	public final boolean GL_EXT_geometry_point_size;
	/** When true, {@link EXTGeometryShader} is supported. */
	public final boolean GL_EXT_geometry_shader;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_gpu_shader5.txt">EXT_gpu_shader5</a> extension is supported.
	 * 
	 * <p>This extension provides a set of new features to the OpenGL ES Shading Language and related APIs to support capabilities of new GPUs, extending the
	 * capabilities of version 3.10 of the OpenGL ES Shading Language. Shaders using the new functionality provided by this extension should enable this
	 * functionality via the construct</p>
	 * 
	 * <pre><code>    #extension GL_EXT_gpu_shader5 : require (or enable)</code></pre>
	 * 
	 * <p>This extension provides a variety of new features for all shader types, including:</p>
	 * 
	 * <ul>
	 * <li>support for indexing into arrays of opaque types (samplers, and atomic counters) using dynamically uniform integer expressions;</li>
	 * <li>support for indexing into arrays of images and shader storage blocks using only constant integral expressions;</li>
	 * <li>extending the uniform block capability to allow shaders to index into an array of uniform blocks;</li>
	 * <li>a "precise" qualifier allowing computations to be carried out exactly as specified in the shader source to avoid optimization-induced invariance
	 * issues (which might cause cracking in tessellation);</li>
	 * <li>new built-in functions supporting:
	 * 
	 * <ul>
	 * <li>fused floating-point multiply-add operations;</li>
	 * </ul></li>
	 * <li>extending the textureGather() built-in functions provided by OpenGL ES Shading Language 3.10:
	 * 
	 * <ul>
	 * <li>allowing shaders to use arbitrary offsets computed at run-time to select a 2x2 footprint to gather from; and</li>
	 * <li>allowing shaders to use separate independent offsets for each of the four texels returned, instead of requiring a fixed 2x2 footprint.</li>
	 * </ul></li>
	 * </ul>
	 * 
	 * <p>Requires {@link GLES31 GLES 3.1}.</p>
	 */
	public final boolean GL_EXT_gpu_shader5;
	/** When true, {@link EXTInstancedArrays} is supported. */
	public final boolean GL_EXT_instanced_arrays;
	/** When true, {@link EXTMapBufferRange} is supported. */
	public final boolean GL_EXT_map_buffer_range;
	/** When true, {@link EXTMultiDrawArrays} is supported. */
	public final boolean GL_EXT_multi_draw_arrays;
	/** When true, {@link EXTMultiDrawIndirect} is supported. */
	public final boolean GL_EXT_multi_draw_indirect;
	/** When true, {@link EXTMultisampleCompatibility} is supported. */
	public final boolean GL_EXT_multisample_compatibility;
	/** When true, {@link EXTMultisampledRenderToTexture} is supported. */
	public final boolean GL_EXT_multisampled_render_to_texture;
	/** When true, {@link EXTMultiviewDrawBuffers} is supported. */
	public final boolean GL_EXT_multiview_draw_buffers;
	/** When true, {@link EXTOcclusionQueryBoolean} is supported. */
	public final boolean GL_EXT_occlusion_query_boolean;
	/** When true, {@link EXTPolygonOffsetClamp} is supported. */
	public final boolean GL_EXT_polygon_offset_clamp;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/post_depth_coverage.txt">EXT_post_depth_coverage</a> extension is supported.
	 * 
	 * <p>This extension allows the fragment shader to control whether values in gl_SampleMaskIn[] reflect the coverage after application of the early depth and
	 * stencil tests. This feature can be enabled with the following layout qualifier in the fragment shader:</p>
	 * 
	 * <pre><code>    layout(post_depth_coverage) in;</code></pre>
	 * 
	 * <p>To use this feature, early fragment tests must also be enabled in the fragment shader via:</p>
	 * 
	 * <pre><code>    layout(early_fragment_tests) in;</code></pre>
	 * 
	 * <p>Requires {@link #GL_OES_sample_variables OES_sample_variables}.</p>
	 */
	public final boolean GL_EXT_post_depth_coverage;
	/** When true, {@link EXTPrimitiveBoundingBox} is supported. */
	public final boolean GL_EXT_primitive_bounding_box;
	/** When true, {@link EXTProtectedTextures} is supported. */
	public final boolean GL_EXT_protected_textures;
	/** When true, {@link EXTPVRTCSRGB} is supported. */
	public final boolean GL_EXT_pvrtc_sRGB;
	/** When true, {@link EXTRasterMultisample} is supported. */
	public final boolean GL_EXT_raster_multisample;
	/** When true, {@link EXTReadFormatBGRA} is supported. */
	public final boolean GL_EXT_read_format_bgra;
	/** When true, {@link EXTRenderSnorm} is supported. */
	public final boolean GL_EXT_render_snorm;
	/** When true, {@link EXTRobustness} is supported. */
	public final boolean GL_EXT_robustness;
	/** When true, {@link EXTSeparateShaderObjects} is supported. */
	public final boolean GL_EXT_separate_shader_objects;
	/** When true, {@link EXTShaderFramebufferFetch} is supported. */
	public final boolean GL_EXT_shader_framebuffer_fetch;
	/**
	 * This extension provides new built-in functions to compute the composite of a set of boolean conditions across a group of shader invocations. These
	 * composite results may be used to execute shaders more efficiently on a single-instruction multiple-data (SIMD) processor. The set of shader invocations
	 * across which boolean conditions are evaluated is implementation-dependent, and this extension provides no guarantee over how individual shader
	 * invocations are assigned to such sets. In particular, the set of shader invocations has no necessary relationship with the compute shader local work
	 * group -- a pair of shader invocations in a single compute shader work group may end up in different sets used by these built-ins.
	 * 
	 * <p>Compute shaders operate on an explicitly specified group of threads (a local work group), but many implementations of OpenGL ES 3.0 will even group
	 * non-compute shader invocations and execute them in a SIMD fashion. When executing code like</p>
	 * 
	 * <pre><code>if (condition) {
    result = do_fast_path();
} else {
    result = do_general_path();
}</code></pre>
	 * 
	 * <p>where {@code condition} diverges between invocations, a SIMD implementation might first call do_fast_path() for the invocations where {@code condition}
	 * is true and leave the other invocations dormant. Once do_fast_path() returns, it might call do_general_path() for invocations where {@code condition}
	 * is false and leave the other invocations dormant. In this case, the shader executes *both* the fast and the general path and might be better off just
	 * using the general path for all invocations.</p>
	 * 
	 * <p>This extension provides the ability to avoid divergent execution by evaluting a condition across an entire SIMD invocation group using code like:</p>
	 * 
	 * <pre><code>if (allInvocationsEXT(condition)) {
    result = do_fast_path();
} else {
    result = do_general_path();
}</code></pre>
	 * 
	 * <p>The built-in function allInvocationsEXT() will return the same value for all invocations in the group, so the group will either execute do_fast_path()
	 * or do_general_path(), but never both. For example, shader code might want to evaluate a complex function iteratively by starting with an approximation
	 * of the result and then refining the approximation. Some input values may require a small number of iterations to generate an accurate result
	 * (do_fast_path) while others require a larger number (do_general_path). In another example, shader code might want to evaluate a complex function
	 * (do_general_path) that can be greatly simplified when assuming a specific value for one of its inputs (do_fast_path).</p>
	 */
	public final boolean GL_EXT_shader_group_vote;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_shader_implicit_conversions.txt">EXT_shader_implicit_conversions</a> extension is supported.
	 * 
	 * <p>This extension provides support for implicitly converting signed integer types to unsigned types, as well as more general implicit conversion and
	 * function overloading infrastructure to support new data types introduced by other extensions.</p>
	 * 
	 * <p>Requires {@link GLES31 GLES 3.1}.</p>
	 */
	public final boolean GL_EXT_shader_implicit_conversions;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/shader_integer_mix.txt">EXT_shader_integer_mix</a> extension is supported.
	 * 
	 * <p>GLSL 1.30 (and GLSL ES 3.00) expanded the mix() built-in function to operate on a boolean third argument that does not interpolate but selects. This
	 * extension extends mix() to select between int, uint, and bool components.</p>
	 * 
	 * <p>Requires {@link GLES30 GLES 3.0}.</p>
	 */
	public final boolean GL_EXT_shader_integer_mix;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_shader_io_blocks.txt">EXT_shader_io_blocks</a> extension is supported.
	 * 
	 * <p>This extension extends the functionality of interface blocks to support input and output interfaces in the OpenGL ES Shading Language.</p>
	 * 
	 * <p>Input and output interface blocks are used for forming the interfaces between vertex, tessellation control, tessellation evaluation, geometry and
	 * fragment shaders. This accommodates passing arrays between stages, which otherwise would require multi-dimensional array support for tessellation
	 * control outputs and for tessellation control, tessellation evaluation, and geometry shader inputs.</p>
	 * 
	 * <p>This extension provides support for application defined interface blocks which are used for passing application-specific information between shader
	 * stages.</p>
	 * 
	 * <p>This extension moves the built-in "per-vertex" in/out variables to a new built-in gl_PerVertex block. This is necessary for tessellation and geometry
	 * shaders which require a separate instance for each vertex, but it can also be useful for vertex shaders.</p>
	 * 
	 * <p>Finally, this extension allows the redeclaration of the gl_PerVertex block in order to reduce the set of variables that must be passed between shaders.</p>
	 * 
	 * <p>Requires {@link GLES31 GLES 3.1}.</p>
	 */
	public final boolean GL_EXT_shader_io_blocks;
	/** When true, {@link EXTShaderPixelLocalStorage} is supported. */
	public final boolean GL_EXT_shader_pixel_local_storage;
	/** When true, {@link EXTShaderPixelLocalStorage2} is supported. */
	public final boolean GL_EXT_shader_pixel_local_storage2;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_shader_texture_lod.txt">EXT_shader_texture_lod</a> extension is supported.
	 * 
	 * <p>This extension adds additional texture functions to the OpenGL ES Shading Language which provide the shader writer with explicit control of LOD.</p>
	 * 
	 * <p>Mipmap texture fetches and anisotropic texture fetches require implicit derivatives to calculate rho, lambda and/or the line of anisotropy. These
	 * implicit derivatives will be undefined for texture fetches occurring inside non-uniform control flow or for vertex shader texture fetches, resulting in
	 * undefined texels.</p>
	 * 
	 * <p>The additional texture functions introduced with this extension provide explicit control of LOD (isotropic texture functions) or provide explicit
	 * derivatives (anisotropic texture functions).</p>
	 * 
	 * <p>Anisotropic texture functions return defined texels for mipmap texture fetches or anisotropic texture fetches, even inside non-uniform control flow.
	 * Isotropic texture functions return defined texels for mipmap texture fetches, even inside non-uniform control flow. However, isotropic texture
	 * functions return undefined texels for anisotropic texture fetches.</p>
	 * 
	 * <p>The existing isotropic vertex texture functions:</p>
	 * 
	 * <pre><code>    vec4 texture2DLodEXT(sampler2D sampler,
                         vec2 coord,
                         float lod);
    vec4 texture2DProjLodEXT(sampler2D sampler,
                             vec3 coord,
                             float lod);
    vec4 texture2DProjLodEXT(sampler2D sampler,
                             vec4 coord,
                             float lod);

    vec4 textureCubeLodEXT(samplerCube sampler,
                           vec3 coord,
                           float lod);</code></pre>
	 * 
	 * <p>are added to the built-in functions for fragment shaders with "EXT" suffix appended.</p>
	 * 
	 * <p>New anisotropic texture functions, providing explicit derivatives:</p>
	 * 
	 * <pre><code>    vec4 texture2DGradEXT(sampler2D sampler,
                          vec2 P,
                          vec2 dPdx,
                          vec2  dPdy);
    vec4 texture2DProjGradEXT(sampler2D sampler,
                              vec3 P,
                              vec2 dPdx,
                              vec2 dPdy);
    vec4 texture2DProjGradEXT(sampler2D sampler,
                              vec4 P,
                              vec2 dPdx,
                              vec2 dPdy);

    vec4 textureCubeGradEXT(samplerCube sampler,
                            vec3 P,
                            vec3 dPdx,
                            vec3 dPdy);</code></pre>
	 * 
	 * <p>are added to the built-in functions for vertex shaders and fragment shaders.</p>
	 */
	public final boolean GL_EXT_shader_texture_lod;
	/** When true, {@link EXTShadowSamplers} is supported. */
	public final boolean GL_EXT_shadow_samplers;
	/** When true, {@link EXTSparseTexture} is supported. */
	public final boolean GL_EXT_sparse_texture;
	/**
	 * This extension builds on the EXT_sparse_texture extension, providing the following new functionality:
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
	 * be requested by leaving {@link EXTSparseTexture#GL_VIRTUAL_PAGE_SIZE_INDEX_EXT VIRTUAL_PAGE_SIZE_INDEX_EXT} at its initial value (0).</li>
	 * <li>Support for creating sparse multisample and multisample array textures is added. However, the virtual page sizes for such textures remain fully
	 * implementation-dependent.</li>
	 * </ul>
	 * 
	 * <p>Requires {@link EXTSparseTexture EXT_sparse_texture}.</p>
	 */
	public final boolean GL_EXT_sparse_texture2;
	/** When true, {@link EXTSRGB} is supported. */
	public final boolean GL_EXT_sRGB;
	/** When true, {@link EXTSRGBWriteControl} is supported. */
	public final boolean GL_EXT_sRGB_write_control;
	/** When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_tessellation_shader.txt">EXT_tessellation_point_size</a> extension is supported. */
	public final boolean GL_EXT_tessellation_point_size;
	/** When true, {@link EXTTessellationShader} is supported. */
	public final boolean GL_EXT_tessellation_shader;
	/** When true, {@link EXTTextureBorderClamp} is supported. */
	public final boolean GL_EXT_texture_border_clamp;
	/** When true, {@link EXTTextureBuffer} is supported. */
	public final boolean GL_EXT_texture_buffer;
	/** When true, {@link EXTTextureCompressionDXT1} is supported. */
	public final boolean GL_EXT_texture_compression_dxt1;
	/** When true, {@link EXTTextureCompressionS3TC} is supported. */
	public final boolean GL_EXT_texture_compression_s3tc;
	/** When true, {@link EXTTextureCubeMapArray} is supported. */
	public final boolean GL_EXT_texture_cube_map_array;
	/** When true, {@link EXTTextureFilterAnisotropic} is supported. */
	public final boolean GL_EXT_texture_filter_anisotropic;
	/** When true, {@link EXTTextureFilterMinmax} is supported. */
	public final boolean GL_EXT_texture_filter_minmax;
	/** When true, {@link EXTTextureFormatBGRA8888} is supported. */
	public final boolean GL_EXT_texture_format_BGRA8888;
	/** When true, {@link EXTTextureNorm16} is supported. */
	public final boolean GL_EXT_texture_norm16;
	/** When true, {@link EXTTextureRG} is supported. */
	public final boolean GL_EXT_texture_rg;
	/** When true, {@link EXTTextureSRGBDecode} is supported. */
	public final boolean GL_EXT_texture_sRGB_decode;
	/** When true, {@link EXTTextureSRGBR8} is supported. */
	public final boolean GL_EXT_texture_sRGB_R8;
	/** When true, {@link EXTTextureSRGBRG8} is supported. */
	public final boolean GL_EXT_texture_sRGB_RG8;
	/** When true, {@link EXTTextureStorage} is supported. */
	public final boolean GL_EXT_texture_storage;
	/** When true, {@link EXTTextureType2101010REV} is supported. */
	public final boolean GL_EXT_texture_type_2_10_10_10_REV;
	/** When true, {@link EXTTextureView} is supported. */
	public final boolean GL_EXT_texture_view;
	/** When true, {@link EXTUnpackSubimage} is supported. */
	public final boolean GL_EXT_unpack_subimage;
	/** When true, {@link EXTYUVTarget} is supported. */
	public final boolean GL_EXT_YUV_target;
	/** When true, {@link FJShaderBinaryGCCSO} is supported. */
	public final boolean GL_FJ_shader_binary_GCCSO;
	/** When true, {@link IMGFramebufferDownsample} is supported. */
	public final boolean GL_IMG_framebuffer_downsample;
	/** When true, {@link IMGMultisampledRenderToTexture} is supported. */
	public final boolean GL_IMG_multisampled_render_to_texture;
	/** When true, {@link IMGProgramBinary} is supported. */
	public final boolean GL_IMG_program_binary;
	/** When true, {@link IMGReadFormat} is supported. */
	public final boolean GL_IMG_read_format;
	/** When true, {@link IMGShaderBinary} is supported. */
	public final boolean GL_IMG_shader_binary;
	/** When true, {@link IMGTextureCompressionPVRTC} is supported. */
	public final boolean GL_IMG_texture_compression_pvrtc;
	/** When true, {@link IMGTextureCompressionPVRTC2} is supported. */
	public final boolean GL_IMG_texture_compression_pvrtc2;
	/** When true, {@link IMGTextureFilterCubic} is supported. */
	public final boolean GL_IMG_texture_filter_cubic;
	/** When true, {@link INTELFramebufferCMAA} is supported. */
	public final boolean GL_INTEL_framebuffer_CMAA;
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
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/KHR/robust_buffer_access_behavior.txt">KHR_robust_buffer_access_behavior</a> extension is supported.
	 * 
	 * <p>This extension specifies the behavior of out-of-bounds buffer and array accesses. This is an improvement over the existing KHR_robustness extension
	 * which states that the application should not crash, but that behavior is otherwise undefined. This extension specifies the access protection provided
	 * by the GL to ensure that out-of-bounds accesses cannot read from or write to data not owned by the application. All accesses are contained within the
	 * buffer object and program area they reference. These additional robustness guarantees apply to contexts created with the robust access flag set.</p>
	 * 
	 * <p>Requires {@link GLES20 GLES 2.0} and {@link KHRRobustness KHR_robustness}.</p>
	 */
	public final boolean GL_KHR_robust_buffer_access_behavior;
	/** When true, {@link KHRRobustness} is supported. */
	public final boolean GL_KHR_robustness;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/KHR/texture_compression_astc_hdr.txt">KHR_texture_compression_astc_hdr</a> extension is supported.
	 * 
	 * <p>This extension corresponds to the ASTC HDR Profile, see {@link KHRTextureCompressionASTCLDR KHR_texture_compression_astc_ldr} for details.</p>
	 */
	public final boolean GL_KHR_texture_compression_astc_hdr;
	/** When true, {@link KHRTextureCompressionASTCLDR} is supported. */
	public final boolean GL_KHR_texture_compression_astc_ldr;
	/**
	 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/KHR/texture_compression_astc_sliced_3d.txt">KHR_texture_compression_astc_sliced_3d</a> extension.
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
	/** When true, {@link NVBindlessTexture} is supported. */
	public final boolean GL_NV_bindless_texture;
	/** When true, {@link NVBlendEquationAdvanced} is supported. */
	public final boolean GL_NV_blend_equation_advanced;
	/** When true, {@link NVBlendEquationAdvancedCoherent} is supported. */
	public final boolean GL_NV_blend_equation_advanced_coherent;
	/** When true, {@link NVConditionalRender} is supported. */
	public final boolean GL_NV_conditional_render;
	/** When true, {@link NVConservativeRaster} is supported. */
	public final boolean GL_NV_conservative_raster;
	/** When true, {@link NVConservativeRasterPreSnapTriangles} is supported. */
	public final boolean GL_NV_conservative_raster_pre_snap_triangles;
	/** When true, {@link NVCopyBuffer} is supported. */
	public final boolean GL_NV_copy_buffer;
	/** When true, {@link NVCoverageSample} is supported. */
	public final boolean GL_NV_coverage_sample;
	/** When true, {@link NVDepthNonlinear} is supported. */
	public final boolean GL_NV_depth_nonlinear;
	/** When true, {@link NVDrawBuffers} is supported. */
	public final boolean GL_NV_draw_buffers;
	/** When true, {@link NVDrawInstanced} is supported. */
	public final boolean GL_NV_draw_instanced;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_explicit_attrib_location.txt">NV_explicit_attrib_location</a> extension is supported.
	 * 
	 * <p>This extension provides a method to pre-assign attribute locations to named vertex shader inputs. This allows applications to globally assign a
	 * particular semantic meaning, such as diffuse color or vertex normal, to a particular attribute location without knowing how that attribute will be
	 * named in any particular shader.</p>
	 * 
	 * <p>Requires {@link GLES20 GLES 2.0}.</p>
	 */
	public final boolean GL_NV_explicit_attrib_location;
	/** When true, {@link NVFboColorAttachments} is supported. */
	public final boolean GL_NV_fbo_color_attachments;
	/** When true, {@link NVFence} is supported. */
	public final boolean GL_NV_fence;
	/** When true, {@link NVFillRectangle} is supported. */
	public final boolean GL_NV_fill_rectangle;
	/** When true, {@link NVFragmentCoverageToColor} is supported. */
	public final boolean GL_NV_fragment_coverage_to_color;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/fragment_shader_interlock.txt">NV_fragment_shader_interlock</a> extension is supported.
	 * 
	 * <p>In unextended OpenGL 4.3 or OpenGL ES 3.1, applications may produce a large number of fragment shader invocations that perform loads and stores to
	 * memory using image uniforms, atomic counter uniforms, buffer variables, or pointers. The order in which loads and stores to common addresses are
	 * performed by different fragment shader invocations is largely undefined. For algorithms that use shader writes and touch the same pixels more than
	 * once, one or more of the following techniques may be required to ensure proper execution ordering:</p>
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
	 * <p>Requires {@link GLES31 GLES 3.1}.</p>
	 */
	public final boolean GL_NV_fragment_shader_interlock;
	/** When true, {@link NVFramebufferBlit} is supported. */
	public final boolean GL_NV_framebuffer_blit;
	/** When true, {@link NVFramebufferMixedSamples} is supported. */
	public final boolean GL_NV_framebuffer_mixed_samples;
	/** When true, {@link NVFramebufferMultisample} is supported. */
	public final boolean GL_NV_framebuffer_multisample;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_generate_mipmap_sRGB.txt">NV_generate_mipmap_sRGB</a> extension is supported.
	 * 
	 * <p>EXT_sRGB requires GenerateMipmap() to throw INVALID_OPERATION on textures with sRGB encoding. NV_generate_mipmap_sRGB lifts this restriction.</p>
	 * 
	 * <p>Requires {@link EXTSRGB EXT_sRGB}.</p>
	 */
	public final boolean GL_NV_generate_mipmap_sRGB;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/geometry_shader_passthrough.txt">NV_geometry_shader_passthrough</a> extension is supported.
	 * 
	 * <p>Geometry shaders provide the ability for applications to process each primitive sent through the GL using a programmable shader. While geometry shaders
	 * can be used to perform a number of different operations, including subdividing primitives and changing primitive type, one common use case treats
	 * geometry shaders as largely "passthrough". In this use case, the bulk of the geometry shader code simply copies inputs from each vertex of the input
	 * primitive to corresponding outputs in the vertices of the output primitive. Such shaders might also compute values for additional built-in or
	 * user-defined per-primitive attributes (e.g., gl_Layer) to be assigned to all the vertices of the output primitive.</p>
	 * 
	 * <p>This extension provides a shading language abstraction to express such shaders without requiring explicit logic to manually copy attributes from input
	 * vertices to output vertices. For example, consider the following simple geometry shader in unextended OpenGL:</p>
	 * 
	 * <pre><code>      layout(triangles) in;
      layout(triangle_strip) out;
      layout(max_vertices=3) out;

      in Inputs {
        vec2 texcoord;
        vec4 baseColor;
      } v_in[];
      out Outputs {
        vec2 texcoord;
        vec4 baseColor;
      };

      void main()
      {
        int layer = compute_layer();
        for (int i = 0; i < 3; i++) {
          gl_Position = gl_in[i].gl_Position;
          texcoord = v_in[i].texcoord;
          baseColor = v_in[i].baseColor;
          gl_Layer = layer;
          EmitVertex();
        }
      }</code></pre>
	 * 
	 * <p>In this shader, the inputs "gl_Position", "Inputs.texcoord", and "Inputs.baseColor" are simply copied from the input vertex to the corresponding output
	 * vertex. The only "interesting" work done by the geometry shader is computing and emitting a gl_Layer value for the primitive.</p>
	 * 
	 * <p>The following geometry shader, using this extension, is equivalent:</p>
	 * 
	 * <pre><code>      #extension GL_NV_geometry_shader_passthrough : require

      layout(triangles) in;
      // No output primitive layout qualifiers required.

      // Redeclare gl_PerVertex to pass through "gl_Position".
      layout(passthrough) in gl_PerVertex {
        vec4 gl_Position;
      };

      // Declare "Inputs" with "passthrough" to automatically copy members.
      layout(passthrough) in Inputs {
        vec2 texcoord;
        vec4 baseColor;
      };

      // No output block declaration required.

      void main()
      {
        // The shader simply computes and writes gl_Layer.  We don't
        // loop over three vertices or call EmitVertex().
        gl_Layer = compute_layer();
      }</code></pre>
	 * 
	 * <p>Requires {@link GLES31 GLES 3.1}.</p>
	 */
	public final boolean GL_NV_geometry_shader_passthrough;
	/** When true, {@link NVGPUShader5} is supported. */
	public final boolean GL_NV_gpu_shader5;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_image_formats.txt">NV_image_formats</a> extension is supported.
	 * 
	 * <p>OpenGL ES 3.1 specifies a variety of formats required to be usable with texture images. This extension introduces the texture image formats missing for
	 * parity with OpenGL 4.4.</p>
	 * 
	 * <p>Requires {@link GLES31 GLES 3.1}.</p>
	 */
	public final boolean GL_NV_image_formats;
	/** When true, {@link NVInstancedArrays} is supported. */
	public final boolean GL_NV_instanced_arrays;
	/** When true, {@link NVInternalformatSampleQuery} is supported. */
	public final boolean GL_NV_internalformat_sample_query;
	/** When true, {@link NVNonSquareMatrices} is supported. */
	public final boolean GL_NV_non_square_matrices;
	/** When true, {@link NVPathRendering} is supported. */
	public final boolean GL_NV_path_rendering;
	/** When true, {@link NVPathRenderingSharedEdge} is supported. */
	public final boolean GL_NV_path_rendering_shared_edge;
	/** When true, {@link NVPolygonMode} is supported. */
	public final boolean GL_NV_polygon_mode;
	/** When true, {@link NVReadBuffer} is supported. */
	public final boolean GL_NV_read_buffer;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_read_buffer.txt">NV_read_buffer_front</a> extension is supported.
	 * 
	 * <p>Adds the ability to select the system-provided FRONT color buffer as the source for read operations when the system-provided framebuffer is bound and
	 * contains both a front and back buffer.</p>
	 * 
	 * <p>Requires {@link NVReadBuffer NV_read_buffer}.</p>
	 */
	public final boolean GL_NV_read_buffer_front;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_read_depth_stencil.txt">NV_read_depth</a> extension is supported.
	 * 
	 * <p>Unextended OpenGL-ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
	 * for debugging to be able to read from depth and stencil buffers. This extension re-introduces these features into OpenGL-ES 2.0.</p>
	 * 
	 * <p>The NV_read_depth extension allows reading from the depth buffer using ReadPixels.</p>
	 */
	public final boolean GL_NV_read_depth;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_read_depth_stencil.txt">NV_read_depth_stencil</a> extension is supported.
	 * 
	 * <p>Unextended OpenGL-ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
	 * for debugging to be able to read from depth and stencil buffers. This extension re-introduces these features into OpenGL-ES 2.0.</p>
	 * 
	 * <p>The NV_read_depth_stencil extension allows reading from packed depth-stencil buffers using ReadPixels.</p>
	 */
	public final boolean GL_NV_read_depth_stencil;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_read_depth_stencil.txt">NV_read_stencil</a> extension is supported.
	 * 
	 * <p>Unextended OpenGL-ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
	 * for debugging to be able to read from depth and stencil buffers. This extension re-introduces these features into OpenGL-ES 2.0.</p>
	 * 
	 * <p>The NV_read_stencil extension allows reading from the stencil buffer using ReadPixels.</p>
	 */
	public final boolean GL_NV_read_stencil;
	/** When true, {@link NVSampleLocations} is supported. */
	public final boolean GL_NV_sample_locations;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/sample_mask_override_coverage.txt">NV_sample_mask_override_coverage</a> extension is supported.
	 * 
	 * <p>This extension allows the fragment shader to control whether the gl_SampleMask output can enable samples that were not covered by the original
	 * primitive, or that failed the early depth/stencil tests. This can be enabled by redeclaring the gl_SampleMask output with the "override_coverage"
	 * layout qualifier:</p>
	 * 
	 * <pre><code>    layout(override_coverage) out int gl_SampleMask[];</code></pre>
	 * 
	 * <p>Requires {@link #GL_OES_sample_variables OES_sample_variables}.</p>
	 */
	public final boolean GL_NV_sample_mask_override_coverage;
	/**
	 * This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform a limited set of atomic read-modify-write operations
	 * to buffer or texture memory with 16-bit floating point vector surface formats.
	 * 
	 * <p>Requires {@link NVGPUShader5 NV_gpu_shader5}.</p>
	 */
	public final boolean GL_NV_shader_atomic_fp16_vector;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_shader_noperspective_interpolation.txt">NV_shader_noperspective_interpolation</a> extension is supported.
	 * 
	 * <p>In OpenGL 3.0 and later, and in other APIs, there are three types of interpolation qualifiers that are available for fragment shader inputs: flat,
	 * smooth, and noperspective. The 'flat' qualifier indicates that no interpolation should be used. This is mandatory for integer-type variables. The
	 * 'smooth' qualifier indicates that interpolation should be performed in a perspective0correct manner. This is the default for floating-point type
	 * variables. The 'noperspective' qualifier indicates that interpolation should be performed linearly in screen space.</p>
	 * 
	 * <p>While perspective-correct (smooth) and non-interpolated (flat) are the two types of interpolation that most commonly used, there are important use
	 * cases for linear (noperspective) interpolation. In particular, in some work loads where screen-space aligned geometry is common, the use of linear
	 * interpolation can result in performance and/or power improvements.</p>
	 * 
	 * <p>The smooth and flat interpolation qualifiers are already supported in OpenGL ES 3.0 and later. This extension adds support for noperspective
	 * interpolation to OpenGL ES.</p>
	 * 
	 * <p>Requires {@link GLES30 GLES 3.0}.</p>
	 */
	public final boolean GL_NV_shader_noperspective_interpolation;
	/** When true, {@link NVShadowSamplersArray} is supported. */
	public final boolean GL_NV_shadow_samplers_array;
	/** When true, {@link NVShadowSamplersCube} is supported. */
	public final boolean GL_NV_shadow_samplers_cube;
	/** When true, {@link NVSRGBFormats} is supported. */
	public final boolean GL_NV_sRGB_formats;
	/** When true, {@link NVTextureArray} is supported. */
	public final boolean GL_NV_texture_array;
	/** When true, {@link NVTextureBorderClamp} is supported. */
	public final boolean GL_NV_texture_border_clamp;
	/** When true, {@link NVTextureCompressionS3TC} is supported. */
	public final boolean GL_NV_texture_compression_s3tc;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_texture_compression_s3tc_update.txt">NV_texture_compression_s3tc_update</a> extension is supported.
	 * 
	 * <p>This extension allows for full or partial image updates to a compressed 2D texture from an uncompressed texel data buffer using TexImage2D and
	 * TexSubImage2D. Consquently, if a compressed internal format is used, all the restrictions associated with compressed textures will apply. These include
	 * sub-image updates aligned to 4x4 pixel blocks and the restriction on usage as render targets.</p>
	 * 
	 * <p>Requires {@link NVTextureCompressionS3TC NV_texture_compression_s3tc}.</p>
	 */
	public final boolean GL_NV_texture_compression_s3tc_update;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_texture_npot_2D_mipmap.txt">NV_texture_npot_2D_mipmap</a> extension is supported.
	 * 
	 * <p>Conventional OpenGL ES 2.0 allows the use of non-power-of-two (NPOT) textures with the limitation that mipmap minification filters can not be used.
	 * This extension relaxes this restriction and adds limited mipmap support for 2D NPOT textures.</p>
	 * 
	 * <p>With this extension, NPOT textures are specified and applied identically to mipmapped power-of-two 2D textures with the following limitations:</p>
	 * 
	 * <ul>
	 * <li>The texture wrap modes must be CLAMP_TO_EDGE.</li>
	 * <li>Coordinates used for texture sampling on an NPOT texture using a mipmapped minification filter must lie within the range [0,1]. Coordinate clamping
	 * is not performed by the GL in this case, causing values outside this range to produce undefined results.</li>
	 * </ul>
	 */
	public final boolean GL_NV_texture_npot_2D_mipmap;
	/** When true, {@link NVViewportArray} is supported. */
	public final boolean GL_NV_viewport_array;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/viewport_array2.txt">NV_viewport_array2</a> extension is supported.
	 * 
	 * <p>This extension provides new support allowing a single primitive to be broadcast to multiple viewports and/or multiple layers. A shader output
	 * gl_ViewportMask[] is provided, allowing a single primitive to be output to multiple viewports simultaneously. Also, a new shader option is provided to
	 * control whether the effective viewport index is added into gl_Layer. These capabilities allow a single primitive to be output to multiple layers
	 * simultaneously.</p>
	 * 
	 * <p>The gl_ViewportMask[] output is available in vertex, tessellation control, tessellation evaluation, and geometry shaders. gl_ViewportIndex and gl_Layer
	 * are also made available in all these shader stages. The actual viewport index or mask and render target layer values are taken from the last active
	 * shader stage from this set of stages.</p>
	 * 
	 * <p>This extension is a superset of the GL_AMD_vertex_shader_layer and GL_AMD_vertex_shader_viewport_index extensions, and thus those extension strings are
	 * expected to be exported if GL_NV_viewport_array2 is supported. This extension includes the edits for those extensions, recast against the reorganized
	 * OpenGL 4.3 specification.</p>
	 * 
	 * <p>Requires {@link NVViewportArray NV_viewport_array}, {@link EXTGeometryShader EXT_geometry_shader} and {@link #GL_EXT_shader_io_blocks EXT_shader_io_blocks}.</p>
	 */
	public final boolean GL_NV_viewport_array2;
	/** When true, {@link NVViewportSwizzle} is supported. */
	public final boolean GL_NV_viewport_swizzle;
	/** When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_compressed_ETC1_RGB8_sub_texture.txt">OES_compressed_ETC1_RGB8_sub_texture</a> extension is supported. */
	public final boolean GL_OES_compressed_ETC1_RGB8_sub_texture;
	/** When true, {@link OESCompressedETC1RGB8Texture} is supported. */
	public final boolean GL_OES_compressed_ETC1_RGB8_texture;
	/** When true, {@link OESCompressedPalettedTexture} is supported. */
	public final boolean GL_OES_compressed_paletted_texture;
	/** When true, {@link OESCopyImage} is supported. */
	public final boolean GL_OES_copy_image;
	/** When true, {@link OESDepth24} is supported. */
	public final boolean GL_OES_depth24;
	/** When true, {@link OESDepth32} is supported. */
	public final boolean GL_OES_depth32;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_depth_texture.txt">OES_depth_texture</a> extension is supported.
	 * 
	 * <p>This extension defines a new texture format that stores depth values in the texture. Depth texture images are widely used for shadow casting but can
	 * also be used for other effects such as image based rendering, displacement mapping etc.</p>
	 * 
	 * <p>Requires {@link GLES20 GLES 2.0}.</p>
	 */
	public final boolean GL_OES_depth_texture;
	/** When true, {@link OESDepthTextureCubeMap} is supported. */
	public final boolean GL_OES_depth_texture_cube_map;
	/** When true, {@link OESDrawBuffersIndexed} is supported. */
	public final boolean GL_OES_draw_buffers_indexed;
	/** When true, {@link OESDrawElementsBaseVertex} is supported. */
	public final boolean GL_OES_draw_elements_base_vertex;
	/** When true, {@link OESEGLImage} is supported. */
	public final boolean GL_OES_EGL_image;
	/** When true, {@link OESEGLImageExternal} is supported. */
	public final boolean GL_OES_EGL_image_external;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_EGL_image_external_essl3.txt">OES_EGL_image_external_essl3</a> extension is supported.
	 * 
	 * <p>OES_EGL_image_external provides a mechanism for creating EGLImage texture targets from EGLImages, but only specified language interactions for the
	 * OpenGL ES Shading Language version 1.0. This extension adds support for versions 3.x of the OpenGL ES Shading Language.</p>
	 * 
	 * <p>Requires {@link GLES30 GLES30} and {@link OESEGLImageExternal OES_EGL_image_external}.</p>
	 */
	public final boolean GL_OES_EGL_image_external_essl3;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_element_index_uint.txt">OES_element_index_uint</a> extension is supported.
	 * 
	 * <p>OpenGL ES 1.0 supports DrawElements with {@code type} value of UNSIGNED_BYTE and UNSIGNED_SHORT. This extension adds support for UNSIGNED_INT <type> values.</p>
	 */
	public final boolean GL_OES_element_index_uint;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_fbo_render_mipmap.txt">OES_fbo_render_mipmap</a> extension is supported.
	 * 
	 * <p>OES_framebuffer_object allows rendering to the base level of a texture only. This extension removes this limitation by allowing implementations to
	 * support rendering to any mip-level of a texture(s) that is attached to a framebuffer object(s).</p>
	 * 
	 * <p>If this extension is supported, FramebufferTexture2DOES, and FramebufferTexture3DOES can be used to render directly into any mip level of a texture
	 * image</p>
	 */
	public final boolean GL_OES_fbo_render_mipmap;
	/** When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_geometry_point_size.txt">OES_geometry_point_size</a> extension is supported. */
	public final boolean GL_OES_geometry_point_size;
	/** When true, {@link OESGeometryShader} is supported. */
	public final boolean GL_OES_geometry_shader;
	/** When true, {@link OESGetProgramBinary} is supported. */
	public final boolean GL_OES_get_program_binary;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_gpu_shader5.txt">OES_gpu_shader5</a> extension is supported.
	 * 
	 * <p>This extension provides a set of new features to the OpenGL ES Shading Language and related APIs to support capabilities of new GPUs, extending the
	 * capabilities of version 3.10 of the OpenGL ES Shading Language. Shaders using the new functionality provided by this extension should enable this
	 * functionality via the construct</p>
	 * 
	 * <pre><code>    #extension GL_OES_gpu_shader5 : require (or enable)</code></pre>
	 * 
	 * <p>This extension provides a variety of new features for all shader types, including:</p>
	 * 
	 * <ul>
	 * <li>support for indexing into arrays of opaque types (samplers, and atomic counters) using dynamically uniform integer expressions;</li>
	 * <li>support for indexing into arrays of images and shader storage blocks using only constant integral expressions;</li>
	 * <li>extending the uniform block capability to allow shaders to index into an array of uniform blocks;</li>
	 * <li>a "precise" qualifier allowing computations to be carried out exactly as specified in the shader source to avoid optimization-induced invariance
	 * issues (which might cause cracking in tessellation);</li>
	 * <li>new built-in functions supporting:
	 * 
	 * <ul>
	 * <li>fused floating-point multiply-add operations;</li>
	 * </ul></li>
	 * <li>extending the textureGather() built-in functions provided by OpenGL ES Shading Language 3.10:
	 * 
	 * <ul>
	 * <li>allowing shaders to use arbitrary offsets computed at run-time to select a 2x2 footprint to gather from; and</li>
	 * <li>allowing shaders to use separate independent offsets for each of the four texels returned, instead of requiring a fixed 2x2 footprint.</li>
	 * </ul></li>
	 * </ul>
	 * 
	 * <p>Requires {@link GLES31 GLES 3.1}.</p>
	 */
	public final boolean GL_OES_gpu_shader5;
	/** When true, {@link OESMapbuffer} is supported. */
	public final boolean GL_OES_mapbuffer;
	/** When true, {@link OESPackedDepthStencil} is supported. */
	public final boolean GL_OES_packed_depth_stencil;
	/** When true, {@link OESPrimitiveBoundingBox} is supported. */
	public final boolean GL_OES_primitive_bounding_box;
	/** When true, {@link OESRequiredInternalformat} is supported. */
	public final boolean GL_OES_required_internalformat;
	/** When true, {@link OESRGB8RGBA8} is supported. */
	public final boolean GL_OES_rgb8_rgba8;
	/** When true, {@link OESSampleShading} is supported. */
	public final boolean GL_OES_sample_shading;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_sample_variables.txt">OES_sample_variables</a> extension is supported.
	 * 
	 * <p>This extension allows fragment shaders more control over multisample rendering. The mask of samples covered by a fragment can be read by the shader and
	 * individual samples can be masked out. Additionally fragment shaders can be run on individual samples and the sample's ID and position read to allow
	 * better interaction with multisample resources such as textures.</p>
	 * 
	 * <p>In multisample rendering, an implementation is allowed to assign the same sets of fragment shader input values to each sample, which then allows the
	 * optimization where the shader is only evaluated once and then distributed to the samples that have been determined to be covered by the primitive
	 * currently being rasterized. This extension does not change how values are interpolated, but it makes some details of the current sample available. This
	 * means that where these features are used (gl_SampleID and gl_SamplePosition), implementations must run the fragment shader for each sample.</p>
	 * 
	 * <p>In order to obtain per-sample interpolation on fragment inputs, either OES_sample_shading or OES_shader_multisample_interpolation must be used in
	 * conjunction with the features from this extension.</p>
	 * 
	 * <p>Requires {@link GLES30 GLES 3.0}.</p>
	 */
	public final boolean GL_OES_sample_variables;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_shader_image_atomic.txt">OES_shader_image_atomic</a> extension is supported.
	 * 
	 * <p>This extension provides built-in functions allowing shaders to perform atomic read-modify-write operations to a single level of a texture object from
	 * any shader stage. These built-in functions are named imageAtomic*(), and accept integer texel coordinates to identify the texel accessed. These
	 * built-in functions extend the Images in ESSL 3.10.</p>
	 * 
	 * <p>Requires {@link GLES31 GLES 3.1}.</p>
	 */
	public final boolean GL_OES_shader_image_atomic;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_shader_io_blocks.txt">OES_shader_io_blocks</a> extension is supported.
	 * 
	 * <p>This extension extends the functionality of interface blocks to support input and output interfaces in the OpenGL ES Shading Language.</p>
	 * 
	 * <p>Input and output interface blocks are used for forming the interfaces between vertex, tessellation control, tessellation evaluation, geometry and
	 * fragment shaders. This accommodates passing arrays between stages, which otherwise would require multi-dimensional array support for tessellation
	 * control outputs and for tessellation control, tessellation evaluation, and geometry shader inputs.</p>
	 * 
	 * <p>This extension provides support for application defined interface blocks which are used for passing application-specific information between shader
	 * stages.</p>
	 * 
	 * <p>This extension moves the built-in "per-vertex" in/out variables to a new built-in gl_PerVertex block. This is necessary for tessellation and geometry
	 * shaders which require a separate instance for each vertex, but it can also be useful for vertex shaders.</p>
	 * 
	 * <p>Finally, this extension allows the redeclaration of the gl_PerVertex block in order to reduce the set of variables that must be passed between shaders.</p>
	 * 
	 * <p>Requires {@link GLES31 GLES 3.1}.</p>
	 */
	public final boolean GL_OES_shader_io_blocks;
	/** When true, {@link OESShaderMultisampleInterpolation} is supported. */
	public final boolean GL_OES_shader_multisample_interpolation;
	/** When true, {@link OESStandardDerivatives} is supported. */
	public final boolean GL_OES_standard_derivatives;
	/** When true, {@link OESStencil1} is supported. */
	public final boolean GL_OES_stencil1;
	/** When true, {@link OESStencil4} is supported. */
	public final boolean GL_OES_stencil4;
	/** When true, {@link OESStencil8} is supported. */
	public final boolean GL_OES_stencil8;
	/** When true, {@link OESSurfacelessContext} is supported. */
	public final boolean GL_OES_surfaceless_context;
	/** When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_tessellation_point_size.txt">OES_tessellation_point_size</a> extension is supported. */
	public final boolean GL_OES_tessellation_point_size;
	/** When true, {@link OESTessellationShader} is supported. */
	public final boolean GL_OES_tessellation_shader;
	/** When true, {@link OESTexture3D} is supported. */
	public final boolean GL_OES_texture_3D;
	/** When true, {@link OESTextureBorderClamp} is supported. */
	public final boolean GL_OES_texture_border_clamp;
	/** When true, {@link OESTextureBuffer} is supported. */
	public final boolean GL_OES_texture_buffer;
	/** When true, {@link OESTextureCompressionASTC} is supported. */
	public final boolean GL_OES_texture_compression_astc;
	/** When true, {@link OESTextureCubeMapArray} is supported. */
	public final boolean GL_OES_texture_cube_map_array;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_float.txt">OES_texture_float</a> extension is supported.
	 * 
	 * <p>These extensions add texture formats with 16- (aka half float) and 32-bit floating-point components. The 32-bit floating-point components are in the
	 * standard IEEE float format. The 16-bit floating-point components have 1 sign bit, 5 exponent bits, and 10 mantissa bits. Floating-point components are
	 * clamped to the limits of the range representable by their format.</p>
	 * 
	 * <p>The OES_texture_float extension string indicates that the implementation supports 32-bit floating pt texture formats.</p>
	 * 
	 * <p>Both these extensions only require NEAREST magnification filter and NEAREST, and NEAREST_MIPMAP_NEAREST minification filters to be supported.</p>
	 */
	public final boolean GL_OES_texture_float;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_float_linear.txt">OES_texture_float_linear</a> extension is supported.
	 * 
	 * <p>These extensions expand upon the OES_texture_half_float and OES_texture_float extensions by allowing support for LINEAR magnification filter and
	 * LINEAR, NEAREST_MIPMAP_LINEAR, LINEAR_MIPMAP_NEAREST and LINEAR_MIPMAP_NEAREST minification filters.</p>
	 * 
	 * <p>When implemented against OpenGL ES 3.0 or later versions, sized 32-bit floating-point formats become texture-filterable. This should be noted by, for
	 * example, checking the ``TF'' column of table 8.13 in the ES 3.1 Specification (``Correspondence of sized internal formats to base internal formats ...
	 * and use cases ...'') for the R32F, RG32F, RGB32F, and RGBA32F formats.</p>
	 * 
	 * <p>Requires {@link #GL_OES_texture_float OES_texture_float}.</p>
	 */
	public final boolean GL_OES_texture_float_linear;
	/** When true, {@link OESTextureHalfFloat} is supported. */
	public final boolean GL_OES_texture_half_float;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_float_linear.txt">OES_texture_half_float_linear</a> extension is supported.
	 * 
	 * <p>These extensions expand upon the OES_texture_half_float and OES_texture_float extensions by allowing support for LINEAR magnification filter and
	 * LINEAR, NEAREST_MIPMAP_LINEAR, LINEAR_MIPMAP_NEAREST and LINEAR_MIPMAP_NEAREST minification filters.</p>
	 * 
	 * <p>When implemented against OpenGL ES 3.0 or later versions, sized 32-bit floating-point formats become texture-filterable. This should be noted by, for
	 * example, checking the ``TF'' column of table 8.13 in the ES 3.1 Specification (``Correspondence of sized internal formats to base internal formats ...
	 * and use cases ...'') for the R32F, RG32F, RGB32F, and RGBA32F formats.</p>
	 * 
	 * <p>Requires {@link OESTextureHalfFloat OES_texture_half_float}.</p>
	 */
	public final boolean GL_OES_texture_half_float_linear;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_npot.txt">OES_texture_npot</a> extension is supported.
	 * 
	 * <p>This extension adds support for the REPEAT and MIRRORED_REPEAT texture wrap modes and the minification filters supported for non-power of two 2D
	 * textures, cubemaps and for 3D textures, if the OES_texture_3D extension is supported.</p>
	 * 
	 * <p>Section 3.8.2 of the OpenGL ES 2.0 specification describes rules for sampling from an incomplete texture. There were specific rules added for non-power
	 * of two textures i.e. if the texture wrap mode is not CLAMP_TO_EDGE or minification filter is not NEAREST or LINEAR and the texture is a
	 * non-power-of-two texture, then sampling the texture will return (0, 0, 0, 1).</p>
	 * 
	 * <p>These rules are no longer applied by an implementation that supports this extension.</p>
	 */
	public final boolean GL_OES_texture_npot;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_stencil8.txt">OES_texture_stencil8</a> extension is supported.
	 * 
	 * <p>This extension accepts STENCIL_INDEX8 as a texture internal format, and adds STENCIL_INDEX8 to the required internal format list. This removes the need
	 * to use renderbuffers if a stencil-only format is desired.</p>
	 */
	public final boolean GL_OES_texture_stencil8;
	/** When true, {@link OESTextureStorageMultisample2DArray} is supported. */
	public final boolean GL_OES_texture_storage_multisample_2d_array;
	/** When true, {@link OESTextureView} is supported. */
	public final boolean GL_OES_texture_view;
	/** When true, {@link OESVertexArrayObject} is supported. */
	public final boolean GL_OES_vertex_array_object;
	/** When true, {@link OESVertexHalfFloat} is supported. */
	public final boolean GL_OES_vertex_half_float;
	/** When true, {@link OESVertexType1010102} is supported. */
	public final boolean GL_OES_vertex_type_10_10_10_2;
	/** When true, {@link OVRMultiview} is supported. */
	public final boolean GL_OVR_multiview;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OVR/multiview2.txt">OVR_multiview2</a> extension is supported.
	 * 
	 * <p>This extension relaxes the restriction in OVR_multiview that only gl_Position can depend on ViewID in the vertex shader. With this change,
	 * view-dependent outputs like reflection vectors and similar are allowed.</p>
	 * 
	 * <p>Requires {@link GLES30 GLES 3.0} and {@link OVRMultiview OVR_multiview}.</p>
	 */
	public final boolean GL_OVR_multiview2;
	/** When true, {@link OVRMultiviewMultisampledRenderToTexture} is supported. */
	public final boolean GL_OVR_multiview_multisampled_render_to_texture;
	/** When true, {@link QCOMAlphaTest} is supported. */
	public final boolean GL_QCOM_alpha_test;
	/** When true, {@link QCOMBinningControl} is supported. */
	public final boolean GL_QCOM_binning_control;
	/** When true, {@link QCOMDriverControl} is supported. */
	public final boolean GL_QCOM_driver_control;
	/** When true, {@link QCOMExtendedGet} is supported. */
	public final boolean GL_QCOM_extended_get;
	/** When true, {@link QCOMExtendedGet2} is supported. */
	public final boolean GL_QCOM_extended_get2;
	/** When true, {@link QCOMPerfmonGlobalMode} is supported. */
	public final boolean GL_QCOM_perfmon_global_mode;
	/** When true, {@link QCOMTiledRendering} is supported. */
	public final boolean GL_QCOM_tiled_rendering;
	/** When true, {@link QCOMWriteonlyRendering} is supported. */
	public final boolean GL_QCOM_writeonly_rendering;
	/** When true, {@link VIVShaderBinary} is supported. */
	public final boolean GL_VIV_shader_binary;

	GLESCapabilities(FunctionProvider provider, Set<String> ext) {
		glActiveShaderProgram = provider.getFunctionAddress("glActiveShaderProgram");
		glActiveShaderProgramEXT = provider.getFunctionAddress("glActiveShaderProgramEXT");
		glActiveTexture = provider.getFunctionAddress("glActiveTexture");
		glAlphaFuncQCOM = provider.getFunctionAddress("glAlphaFuncQCOM");
		glApplyFramebufferAttachmentCMAAINTEL = provider.getFunctionAddress("glApplyFramebufferAttachmentCMAAINTEL");
		glAttachShader = provider.getFunctionAddress("glAttachShader");
		glBeginConditionalRenderNV = provider.getFunctionAddress("glBeginConditionalRenderNV");
		glBeginPerfMonitorAMD = provider.getFunctionAddress("glBeginPerfMonitorAMD");
		glBeginPerfQueryINTEL = provider.getFunctionAddress("glBeginPerfQueryINTEL");
		glBeginQuery = provider.getFunctionAddress("glBeginQuery");
		glBeginQueryEXT = provider.getFunctionAddress("glBeginQueryEXT");
		glBeginTransformFeedback = provider.getFunctionAddress("glBeginTransformFeedback");
		glBindAttribLocation = provider.getFunctionAddress("glBindAttribLocation");
		glBindBuffer = provider.getFunctionAddress("glBindBuffer");
		glBindBufferBase = provider.getFunctionAddress("glBindBufferBase");
		glBindBufferRange = provider.getFunctionAddress("glBindBufferRange");
		glBindFragDataLocationEXT = provider.getFunctionAddress("glBindFragDataLocationEXT");
		glBindFragDataLocationIndexedEXT = provider.getFunctionAddress("glBindFragDataLocationIndexedEXT");
		glBindFramebuffer = provider.getFunctionAddress("glBindFramebuffer");
		glBindImageTexture = provider.getFunctionAddress("glBindImageTexture");
		glBindProgramPipeline = provider.getFunctionAddress("glBindProgramPipeline");
		glBindProgramPipelineEXT = provider.getFunctionAddress("glBindProgramPipelineEXT");
		glBindRenderbuffer = provider.getFunctionAddress("glBindRenderbuffer");
		glBindSampler = provider.getFunctionAddress("glBindSampler");
		glBindTexture = provider.getFunctionAddress("glBindTexture");
		glBindTransformFeedback = provider.getFunctionAddress("glBindTransformFeedback");
		glBindVertexArray = provider.getFunctionAddress("glBindVertexArray");
		glBindVertexArrayOES = provider.getFunctionAddress("glBindVertexArrayOES");
		glBindVertexBuffer = provider.getFunctionAddress("glBindVertexBuffer");
		glBlendBarrier = provider.getFunctionAddress("glBlendBarrier");
		glBlendBarrierKHR = provider.getFunctionAddress("glBlendBarrierKHR");
		glBlendBarrierNV = provider.getFunctionAddress("glBlendBarrierNV");
		glBlendColor = provider.getFunctionAddress("glBlendColor");
		glBlendEquation = provider.getFunctionAddress("glBlendEquation");
		glBlendEquationSeparate = provider.getFunctionAddress("glBlendEquationSeparate");
		glBlendEquationSeparatei = provider.getFunctionAddress("glBlendEquationSeparatei");
		glBlendEquationSeparateiEXT = provider.getFunctionAddress("glBlendEquationSeparateiEXT");
		glBlendEquationSeparateiOES = provider.getFunctionAddress("glBlendEquationSeparateiOES");
		glBlendEquationi = provider.getFunctionAddress("glBlendEquationi");
		glBlendEquationiEXT = provider.getFunctionAddress("glBlendEquationiEXT");
		glBlendEquationiOES = provider.getFunctionAddress("glBlendEquationiOES");
		glBlendFunc = provider.getFunctionAddress("glBlendFunc");
		glBlendFuncSeparate = provider.getFunctionAddress("glBlendFuncSeparate");
		glBlendFuncSeparatei = provider.getFunctionAddress("glBlendFuncSeparatei");
		glBlendFuncSeparateiEXT = provider.getFunctionAddress("glBlendFuncSeparateiEXT");
		glBlendFuncSeparateiOES = provider.getFunctionAddress("glBlendFuncSeparateiOES");
		glBlendFunci = provider.getFunctionAddress("glBlendFunci");
		glBlendFunciEXT = provider.getFunctionAddress("glBlendFunciEXT");
		glBlendFunciOES = provider.getFunctionAddress("glBlendFunciOES");
		glBlendParameteriNV = provider.getFunctionAddress("glBlendParameteriNV");
		glBlitFramebuffer = provider.getFunctionAddress("glBlitFramebuffer");
		glBlitFramebufferANGLE = provider.getFunctionAddress("glBlitFramebufferANGLE");
		glBlitFramebufferNV = provider.getFunctionAddress("glBlitFramebufferNV");
		glBufferData = provider.getFunctionAddress("glBufferData");
		glBufferStorageEXT = provider.getFunctionAddress("glBufferStorageEXT");
		glBufferSubData = provider.getFunctionAddress("glBufferSubData");
		glCheckFramebufferStatus = provider.getFunctionAddress("glCheckFramebufferStatus");
		glClear = provider.getFunctionAddress("glClear");
		glClearBufferfi = provider.getFunctionAddress("glClearBufferfi");
		glClearBufferfv = provider.getFunctionAddress("glClearBufferfv");
		glClearBufferiv = provider.getFunctionAddress("glClearBufferiv");
		glClearBufferuiv = provider.getFunctionAddress("glClearBufferuiv");
		glClearColor = provider.getFunctionAddress("glClearColor");
		glClearDepthf = provider.getFunctionAddress("glClearDepthf");
		glClearPixelLocalStorageuiEXT = provider.getFunctionAddress("glClearPixelLocalStorageuiEXT");
		glClearStencil = provider.getFunctionAddress("glClearStencil");
		glClientWaitSync = provider.getFunctionAddress("glClientWaitSync");
		glClientWaitSyncAPPLE = provider.getFunctionAddress("glClientWaitSyncAPPLE");
		glColorMask = provider.getFunctionAddress("glColorMask");
		glColorMaski = provider.getFunctionAddress("glColorMaski");
		glColorMaskiEXT = provider.getFunctionAddress("glColorMaskiEXT");
		glColorMaskiOES = provider.getFunctionAddress("glColorMaskiOES");
		glCompileShader = provider.getFunctionAddress("glCompileShader");
		glCompressedTexImage2D = provider.getFunctionAddress("glCompressedTexImage2D");
		glCompressedTexImage3D = provider.getFunctionAddress("glCompressedTexImage3D");
		glCompressedTexImage3DNV = provider.getFunctionAddress("glCompressedTexImage3DNV");
		glCompressedTexImage3DOES = provider.getFunctionAddress("glCompressedTexImage3DOES");
		glCompressedTexSubImage2D = provider.getFunctionAddress("glCompressedTexSubImage2D");
		glCompressedTexSubImage3D = provider.getFunctionAddress("glCompressedTexSubImage3D");
		glCompressedTexSubImage3DNV = provider.getFunctionAddress("glCompressedTexSubImage3DNV");
		glCompressedTexSubImage3DOES = provider.getFunctionAddress("glCompressedTexSubImage3DOES");
		glConservativeRasterParameteriNV = provider.getFunctionAddress("glConservativeRasterParameteriNV");
		glCopyBufferSubData = provider.getFunctionAddress("glCopyBufferSubData");
		glCopyBufferSubDataNV = provider.getFunctionAddress("glCopyBufferSubDataNV");
		glCopyImageSubData = provider.getFunctionAddress("glCopyImageSubData");
		glCopyImageSubDataEXT = provider.getFunctionAddress("glCopyImageSubDataEXT");
		glCopyImageSubDataOES = provider.getFunctionAddress("glCopyImageSubDataOES");
		glCopyPathNV = provider.getFunctionAddress("glCopyPathNV");
		glCopyTexImage2D = provider.getFunctionAddress("glCopyTexImage2D");
		glCopyTexSubImage2D = provider.getFunctionAddress("glCopyTexSubImage2D");
		glCopyTexSubImage3D = provider.getFunctionAddress("glCopyTexSubImage3D");
		glCopyTexSubImage3DNV = provider.getFunctionAddress("glCopyTexSubImage3DNV");
		glCopyTexSubImage3DOES = provider.getFunctionAddress("glCopyTexSubImage3DOES");
		glCopyTextureLevelsAPPLE = provider.getFunctionAddress("glCopyTextureLevelsAPPLE");
		glCoverFillPathInstancedNV = provider.getFunctionAddress("glCoverFillPathInstancedNV");
		glCoverFillPathNV = provider.getFunctionAddress("glCoverFillPathNV");
		glCoverStrokePathInstancedNV = provider.getFunctionAddress("glCoverStrokePathInstancedNV");
		glCoverStrokePathNV = provider.getFunctionAddress("glCoverStrokePathNV");
		glCoverageMaskNV = provider.getFunctionAddress("glCoverageMaskNV");
		glCoverageModulationNV = provider.getFunctionAddress("glCoverageModulationNV");
		glCoverageModulationTableNV = provider.getFunctionAddress("glCoverageModulationTableNV");
		glCoverageOperationNV = provider.getFunctionAddress("glCoverageOperationNV");
		glCreatePerfQueryINTEL = provider.getFunctionAddress("glCreatePerfQueryINTEL");
		glCreateProgram = provider.getFunctionAddress("glCreateProgram");
		glCreateShader = provider.getFunctionAddress("glCreateShader");
		glCreateShaderProgramv = provider.getFunctionAddress("glCreateShaderProgramv");
		glCreateShaderProgramvEXT = provider.getFunctionAddress("glCreateShaderProgramvEXT");
		glCullFace = provider.getFunctionAddress("glCullFace");
		glDebugMessageCallback = provider.getFunctionAddress("glDebugMessageCallback");
		glDebugMessageCallbackKHR = provider.getFunctionAddress("glDebugMessageCallbackKHR");
		glDebugMessageControl = provider.getFunctionAddress("glDebugMessageControl");
		glDebugMessageControlKHR = provider.getFunctionAddress("glDebugMessageControlKHR");
		glDebugMessageInsert = provider.getFunctionAddress("glDebugMessageInsert");
		glDebugMessageInsertKHR = provider.getFunctionAddress("glDebugMessageInsertKHR");
		glDeleteBuffers = provider.getFunctionAddress("glDeleteBuffers");
		glDeleteFencesNV = provider.getFunctionAddress("glDeleteFencesNV");
		glDeleteFramebuffers = provider.getFunctionAddress("glDeleteFramebuffers");
		glDeletePathsNV = provider.getFunctionAddress("glDeletePathsNV");
		glDeletePerfMonitorsAMD = provider.getFunctionAddress("glDeletePerfMonitorsAMD");
		glDeletePerfQueryINTEL = provider.getFunctionAddress("glDeletePerfQueryINTEL");
		glDeleteProgram = provider.getFunctionAddress("glDeleteProgram");
		glDeleteProgramPipelines = provider.getFunctionAddress("glDeleteProgramPipelines");
		glDeleteProgramPipelinesEXT = provider.getFunctionAddress("glDeleteProgramPipelinesEXT");
		glDeleteQueries = provider.getFunctionAddress("glDeleteQueries");
		glDeleteQueriesEXT = provider.getFunctionAddress("glDeleteQueriesEXT");
		glDeleteRenderbuffers = provider.getFunctionAddress("glDeleteRenderbuffers");
		glDeleteSamplers = provider.getFunctionAddress("glDeleteSamplers");
		glDeleteShader = provider.getFunctionAddress("glDeleteShader");
		glDeleteSync = provider.getFunctionAddress("glDeleteSync");
		glDeleteSyncAPPLE = provider.getFunctionAddress("glDeleteSyncAPPLE");
		glDeleteTextures = provider.getFunctionAddress("glDeleteTextures");
		glDeleteTransformFeedbacks = provider.getFunctionAddress("glDeleteTransformFeedbacks");
		glDeleteVertexArrays = provider.getFunctionAddress("glDeleteVertexArrays");
		glDeleteVertexArraysOES = provider.getFunctionAddress("glDeleteVertexArraysOES");
		glDepthFunc = provider.getFunctionAddress("glDepthFunc");
		glDepthMask = provider.getFunctionAddress("glDepthMask");
		glDepthRangeArrayfvNV = provider.getFunctionAddress("glDepthRangeArrayfvNV");
		glDepthRangeIndexedfNV = provider.getFunctionAddress("glDepthRangeIndexedfNV");
		glDepthRangef = provider.getFunctionAddress("glDepthRangef");
		glDetachShader = provider.getFunctionAddress("glDetachShader");
		glDisable = provider.getFunctionAddress("glDisable");
		glDisableDriverControlQCOM = provider.getFunctionAddress("glDisableDriverControlQCOM");
		glDisableVertexAttribArray = provider.getFunctionAddress("glDisableVertexAttribArray");
		glDisablei = provider.getFunctionAddress("glDisablei");
		glDisableiEXT = provider.getFunctionAddress("glDisableiEXT");
		glDisableiNV = provider.getFunctionAddress("glDisableiNV");
		glDisableiOES = provider.getFunctionAddress("glDisableiOES");
		glDiscardFramebufferEXT = provider.getFunctionAddress("glDiscardFramebufferEXT");
		glDispatchCompute = provider.getFunctionAddress("glDispatchCompute");
		glDispatchComputeIndirect = provider.getFunctionAddress("glDispatchComputeIndirect");
		glDrawArrays = provider.getFunctionAddress("glDrawArrays");
		glDrawArraysIndirect = provider.getFunctionAddress("glDrawArraysIndirect");
		glDrawArraysInstanced = provider.getFunctionAddress("glDrawArraysInstanced");
		glDrawArraysInstancedANGLE = provider.getFunctionAddress("glDrawArraysInstancedANGLE");
		glDrawArraysInstancedBaseInstanceEXT = provider.getFunctionAddress("glDrawArraysInstancedBaseInstanceEXT");
		glDrawArraysInstancedEXT = provider.getFunctionAddress("glDrawArraysInstancedEXT");
		glDrawArraysInstancedNV = provider.getFunctionAddress("glDrawArraysInstancedNV");
		glDrawBuffers = provider.getFunctionAddress("glDrawBuffers");
		glDrawBuffersEXT = provider.getFunctionAddress("glDrawBuffersEXT");
		glDrawBuffersIndexedEXT = provider.getFunctionAddress("glDrawBuffersIndexedEXT");
		glDrawBuffersNV = provider.getFunctionAddress("glDrawBuffersNV");
		glDrawElements = provider.getFunctionAddress("glDrawElements");
		glDrawElementsBaseVertex = provider.getFunctionAddress("glDrawElementsBaseVertex");
		glDrawElementsBaseVertexEXT = provider.getFunctionAddress("glDrawElementsBaseVertexEXT");
		glDrawElementsBaseVertexOES = provider.getFunctionAddress("glDrawElementsBaseVertexOES");
		glDrawElementsIndirect = provider.getFunctionAddress("glDrawElementsIndirect");
		glDrawElementsInstanced = provider.getFunctionAddress("glDrawElementsInstanced");
		glDrawElementsInstancedANGLE = provider.getFunctionAddress("glDrawElementsInstancedANGLE");
		glDrawElementsInstancedBaseInstanceEXT = provider.getFunctionAddress("glDrawElementsInstancedBaseInstanceEXT");
		glDrawElementsInstancedBaseVertex = provider.getFunctionAddress("glDrawElementsInstancedBaseVertex");
		glDrawElementsInstancedBaseVertexBaseInstanceEXT = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexBaseInstanceEXT");
		glDrawElementsInstancedBaseVertexEXT = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexEXT");
		glDrawElementsInstancedBaseVertexOES = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexOES");
		glDrawElementsInstancedEXT = provider.getFunctionAddress("glDrawElementsInstancedEXT");
		glDrawElementsInstancedNV = provider.getFunctionAddress("glDrawElementsInstancedNV");
		glDrawRangeElements = provider.getFunctionAddress("glDrawRangeElements");
		glDrawRangeElementsBaseVertex = provider.getFunctionAddress("glDrawRangeElementsBaseVertex");
		glDrawRangeElementsBaseVertexEXT = provider.getFunctionAddress("glDrawRangeElementsBaseVertexEXT");
		glDrawRangeElementsBaseVertexOES = provider.getFunctionAddress("glDrawRangeElementsBaseVertexOES");
		glEGLImageTargetRenderbufferStorageOES = provider.getFunctionAddress("glEGLImageTargetRenderbufferStorageOES");
		glEGLImageTargetTexture2DOES = provider.getFunctionAddress("glEGLImageTargetTexture2DOES");
		glEnable = provider.getFunctionAddress("glEnable");
		glEnableDriverControlQCOM = provider.getFunctionAddress("glEnableDriverControlQCOM");
		glEnableVertexAttribArray = provider.getFunctionAddress("glEnableVertexAttribArray");
		glEnablei = provider.getFunctionAddress("glEnablei");
		glEnableiEXT = provider.getFunctionAddress("glEnableiEXT");
		glEnableiNV = provider.getFunctionAddress("glEnableiNV");
		glEnableiOES = provider.getFunctionAddress("glEnableiOES");
		glEndConditionalRenderNV = provider.getFunctionAddress("glEndConditionalRenderNV");
		glEndPerfMonitorAMD = provider.getFunctionAddress("glEndPerfMonitorAMD");
		glEndPerfQueryINTEL = provider.getFunctionAddress("glEndPerfQueryINTEL");
		glEndQuery = provider.getFunctionAddress("glEndQuery");
		glEndQueryEXT = provider.getFunctionAddress("glEndQueryEXT");
		glEndTilingQCOM = provider.getFunctionAddress("glEndTilingQCOM");
		glEndTransformFeedback = provider.getFunctionAddress("glEndTransformFeedback");
		glExtGetBufferPointervQCOM = provider.getFunctionAddress("glExtGetBufferPointervQCOM");
		glExtGetBuffersQCOM = provider.getFunctionAddress("glExtGetBuffersQCOM");
		glExtGetFramebuffersQCOM = provider.getFunctionAddress("glExtGetFramebuffersQCOM");
		glExtGetProgramBinarySourceQCOM = provider.getFunctionAddress("glExtGetProgramBinarySourceQCOM");
		glExtGetProgramsQCOM = provider.getFunctionAddress("glExtGetProgramsQCOM");
		glExtGetRenderbuffersQCOM = provider.getFunctionAddress("glExtGetRenderbuffersQCOM");
		glExtGetShadersQCOM = provider.getFunctionAddress("glExtGetShadersQCOM");
		glExtGetTexLevelParameterivQCOM = provider.getFunctionAddress("glExtGetTexLevelParameterivQCOM");
		glExtGetTexSubImageQCOM = provider.getFunctionAddress("glExtGetTexSubImageQCOM");
		glExtGetTexturesQCOM = provider.getFunctionAddress("glExtGetTexturesQCOM");
		glExtIsProgramBinaryQCOM = provider.getFunctionAddress("glExtIsProgramBinaryQCOM");
		glExtTexObjectStateOverrideiQCOM = provider.getFunctionAddress("glExtTexObjectStateOverrideiQCOM");
		glFenceSync = provider.getFunctionAddress("glFenceSync");
		glFenceSyncAPPLE = provider.getFunctionAddress("glFenceSyncAPPLE");
		glFinish = provider.getFunctionAddress("glFinish");
		glFinishFenceNV = provider.getFunctionAddress("glFinishFenceNV");
		glFlush = provider.getFunctionAddress("glFlush");
		glFlushMappedBufferRange = provider.getFunctionAddress("glFlushMappedBufferRange");
		glFlushMappedBufferRangeEXT = provider.getFunctionAddress("glFlushMappedBufferRangeEXT");
		glFragmentCoverageColorNV = provider.getFunctionAddress("glFragmentCoverageColorNV");
		glFramebufferParameteri = provider.getFunctionAddress("glFramebufferParameteri");
		glFramebufferPixelLocalStorageSizeEXT = provider.getFunctionAddress("glFramebufferPixelLocalStorageSizeEXT");
		glFramebufferRenderbuffer = provider.getFunctionAddress("glFramebufferRenderbuffer");
		glFramebufferSampleLocationsfvNV = provider.getFunctionAddress("glFramebufferSampleLocationsfvNV");
		glFramebufferTexture = provider.getFunctionAddress("glFramebufferTexture");
		glFramebufferTexture2D = provider.getFunctionAddress("glFramebufferTexture2D");
		glFramebufferTexture2DDownsampleIMG = provider.getFunctionAddress("glFramebufferTexture2DDownsampleIMG");
		glFramebufferTexture2DMultisampleEXT = provider.getFunctionAddress("glFramebufferTexture2DMultisampleEXT");
		glFramebufferTexture2DMultisampleIMG = provider.getFunctionAddress("glFramebufferTexture2DMultisampleIMG");
		glFramebufferTexture3DOES = provider.getFunctionAddress("glFramebufferTexture3DOES");
		glFramebufferTextureEXT = provider.getFunctionAddress("glFramebufferTextureEXT");
		glFramebufferTextureLayer = provider.getFunctionAddress("glFramebufferTextureLayer");
		glFramebufferTextureLayerDownsampleIMG = provider.getFunctionAddress("glFramebufferTextureLayerDownsampleIMG");
		glFramebufferTextureLayerNV = provider.getFunctionAddress("glFramebufferTextureLayerNV");
		glFramebufferTextureMultisampleMultiviewOVR = provider.getFunctionAddress("glFramebufferTextureMultisampleMultiviewOVR");
		glFramebufferTextureMultiviewOVR = provider.getFunctionAddress("glFramebufferTextureMultiviewOVR");
		glFramebufferTextureOES = provider.getFunctionAddress("glFramebufferTextureOES");
		glFrontFace = provider.getFunctionAddress("glFrontFace");
		glGenBuffers = provider.getFunctionAddress("glGenBuffers");
		glGenFencesNV = provider.getFunctionAddress("glGenFencesNV");
		glGenFramebuffers = provider.getFunctionAddress("glGenFramebuffers");
		glGenPathsNV = provider.getFunctionAddress("glGenPathsNV");
		glGenPerfMonitorsAMD = provider.getFunctionAddress("glGenPerfMonitorsAMD");
		glGenProgramPipelines = provider.getFunctionAddress("glGenProgramPipelines");
		glGenProgramPipelinesEXT = provider.getFunctionAddress("glGenProgramPipelinesEXT");
		glGenQueries = provider.getFunctionAddress("glGenQueries");
		glGenQueriesEXT = provider.getFunctionAddress("glGenQueriesEXT");
		glGenRenderbuffers = provider.getFunctionAddress("glGenRenderbuffers");
		glGenSamplers = provider.getFunctionAddress("glGenSamplers");
		glGenTextures = provider.getFunctionAddress("glGenTextures");
		glGenTransformFeedbacks = provider.getFunctionAddress("glGenTransformFeedbacks");
		glGenVertexArrays = provider.getFunctionAddress("glGenVertexArrays");
		glGenVertexArraysOES = provider.getFunctionAddress("glGenVertexArraysOES");
		glGenerateMipmap = provider.getFunctionAddress("glGenerateMipmap");
		glGetActiveAttrib = provider.getFunctionAddress("glGetActiveAttrib");
		glGetActiveUniform = provider.getFunctionAddress("glGetActiveUniform");
		glGetActiveUniformBlockName = provider.getFunctionAddress("glGetActiveUniformBlockName");
		glGetActiveUniformBlockiv = provider.getFunctionAddress("glGetActiveUniformBlockiv");
		glGetActiveUniformsiv = provider.getFunctionAddress("glGetActiveUniformsiv");
		glGetAttachedShaders = provider.getFunctionAddress("glGetAttachedShaders");
		glGetAttribLocation = provider.getFunctionAddress("glGetAttribLocation");
		glGetBooleani_v = provider.getFunctionAddress("glGetBooleani_v");
		glGetBooleanv = provider.getFunctionAddress("glGetBooleanv");
		glGetBufferParameteri64v = provider.getFunctionAddress("glGetBufferParameteri64v");
		glGetBufferParameteriv = provider.getFunctionAddress("glGetBufferParameteriv");
		glGetBufferPointerv = provider.getFunctionAddress("glGetBufferPointerv");
		glGetBufferPointervOES = provider.getFunctionAddress("glGetBufferPointervOES");
		glGetCoverageModulationTableNV = provider.getFunctionAddress("glGetCoverageModulationTableNV");
		glGetDebugMessageLog = provider.getFunctionAddress("glGetDebugMessageLog");
		glGetDebugMessageLogKHR = provider.getFunctionAddress("glGetDebugMessageLogKHR");
		glGetDriverControlStringQCOM = provider.getFunctionAddress("glGetDriverControlStringQCOM");
		glGetDriverControlsQCOM = provider.getFunctionAddress("glGetDriverControlsQCOM");
		glGetError = provider.getFunctionAddress("glGetError");
		glGetFenceivNV = provider.getFunctionAddress("glGetFenceivNV");
		glGetFirstPerfQueryIdINTEL = provider.getFunctionAddress("glGetFirstPerfQueryIdINTEL");
		glGetFloati_vNV = provider.getFunctionAddress("glGetFloati_vNV");
		glGetFloatv = provider.getFunctionAddress("glGetFloatv");
		glGetFragDataIndexEXT = provider.getFunctionAddress("glGetFragDataIndexEXT");
		glGetFragDataLocation = provider.getFunctionAddress("glGetFragDataLocation");
		glGetFramebufferAttachmentParameteriv = provider.getFunctionAddress("glGetFramebufferAttachmentParameteriv");
		glGetFramebufferParameteriv = provider.getFunctionAddress("glGetFramebufferParameteriv");
		glGetFramebufferPixelLocalStorageSizeEXT = provider.getFunctionAddress("glGetFramebufferPixelLocalStorageSizeEXT");
		glGetGraphicsResetStatus = provider.getFunctionAddress("glGetGraphicsResetStatus");
		glGetGraphicsResetStatusEXT = provider.getFunctionAddress("glGetGraphicsResetStatusEXT");
		glGetGraphicsResetStatusKHR = provider.getFunctionAddress("glGetGraphicsResetStatusKHR");
		glGetImageHandleNV = provider.getFunctionAddress("glGetImageHandleNV");
		glGetInteger64i_v = provider.getFunctionAddress("glGetInteger64i_v");
		glGetInteger64v = provider.getFunctionAddress("glGetInteger64v");
		glGetInteger64vAPPLE = provider.getFunctionAddress("glGetInteger64vAPPLE");
		glGetIntegeri_v = provider.getFunctionAddress("glGetIntegeri_v");
		glGetIntegeri_vEXT = provider.getFunctionAddress("glGetIntegeri_vEXT");
		glGetIntegerv = provider.getFunctionAddress("glGetIntegerv");
		glGetInternalformatSampleivNV = provider.getFunctionAddress("glGetInternalformatSampleivNV");
		glGetInternalformativ = provider.getFunctionAddress("glGetInternalformativ");
		glGetMultisamplefv = provider.getFunctionAddress("glGetMultisamplefv");
		glGetNextPerfQueryIdINTEL = provider.getFunctionAddress("glGetNextPerfQueryIdINTEL");
		glGetObjectLabel = provider.getFunctionAddress("glGetObjectLabel");
		glGetObjectLabelEXT = provider.getFunctionAddress("glGetObjectLabelEXT");
		glGetObjectLabelKHR = provider.getFunctionAddress("glGetObjectLabelKHR");
		glGetObjectPtrLabel = provider.getFunctionAddress("glGetObjectPtrLabel");
		glGetObjectPtrLabelKHR = provider.getFunctionAddress("glGetObjectPtrLabelKHR");
		glGetPathCommandsNV = provider.getFunctionAddress("glGetPathCommandsNV");
		glGetPathCoordsNV = provider.getFunctionAddress("glGetPathCoordsNV");
		glGetPathDashArrayNV = provider.getFunctionAddress("glGetPathDashArrayNV");
		glGetPathLengthNV = provider.getFunctionAddress("glGetPathLengthNV");
		glGetPathMetricRangeNV = provider.getFunctionAddress("glGetPathMetricRangeNV");
		glGetPathMetricsNV = provider.getFunctionAddress("glGetPathMetricsNV");
		glGetPathParameterfvNV = provider.getFunctionAddress("glGetPathParameterfvNV");
		glGetPathParameterivNV = provider.getFunctionAddress("glGetPathParameterivNV");
		glGetPathSpacingNV = provider.getFunctionAddress("glGetPathSpacingNV");
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
		glGetPointerv = provider.getFunctionAddress("glGetPointerv");
		glGetPointervKHR = provider.getFunctionAddress("glGetPointervKHR");
		glGetProgramBinary = provider.getFunctionAddress("glGetProgramBinary");
		glGetProgramBinaryOES = provider.getFunctionAddress("glGetProgramBinaryOES");
		glGetProgramInfoLog = provider.getFunctionAddress("glGetProgramInfoLog");
		glGetProgramInterfaceiv = provider.getFunctionAddress("glGetProgramInterfaceiv");
		glGetProgramPipelineInfoLog = provider.getFunctionAddress("glGetProgramPipelineInfoLog");
		glGetProgramPipelineInfoLogEXT = provider.getFunctionAddress("glGetProgramPipelineInfoLogEXT");
		glGetProgramPipelineiv = provider.getFunctionAddress("glGetProgramPipelineiv");
		glGetProgramPipelineivEXT = provider.getFunctionAddress("glGetProgramPipelineivEXT");
		glGetProgramResourceIndex = provider.getFunctionAddress("glGetProgramResourceIndex");
		glGetProgramResourceLocation = provider.getFunctionAddress("glGetProgramResourceLocation");
		glGetProgramResourceLocationIndexEXT = provider.getFunctionAddress("glGetProgramResourceLocationIndexEXT");
		glGetProgramResourceName = provider.getFunctionAddress("glGetProgramResourceName");
		glGetProgramResourcefvNV = provider.getFunctionAddress("glGetProgramResourcefvNV");
		glGetProgramResourceiv = provider.getFunctionAddress("glGetProgramResourceiv");
		glGetProgramiv = provider.getFunctionAddress("glGetProgramiv");
		glGetQueryObjecti64vEXT = provider.getFunctionAddress("glGetQueryObjecti64vEXT");
		glGetQueryObjectivEXT = provider.getFunctionAddress("glGetQueryObjectivEXT");
		glGetQueryObjectui64vEXT = provider.getFunctionAddress("glGetQueryObjectui64vEXT");
		glGetQueryObjectuiv = provider.getFunctionAddress("glGetQueryObjectuiv");
		glGetQueryObjectuivEXT = provider.getFunctionAddress("glGetQueryObjectuivEXT");
		glGetQueryiv = provider.getFunctionAddress("glGetQueryiv");
		glGetQueryivEXT = provider.getFunctionAddress("glGetQueryivEXT");
		glGetRenderbufferParameteriv = provider.getFunctionAddress("glGetRenderbufferParameteriv");
		glGetSamplerParameterIiv = provider.getFunctionAddress("glGetSamplerParameterIiv");
		glGetSamplerParameterIivEXT = provider.getFunctionAddress("glGetSamplerParameterIivEXT");
		glGetSamplerParameterIivOES = provider.getFunctionAddress("glGetSamplerParameterIivOES");
		glGetSamplerParameterIuiv = provider.getFunctionAddress("glGetSamplerParameterIuiv");
		glGetSamplerParameterIuivEXT = provider.getFunctionAddress("glGetSamplerParameterIuivEXT");
		glGetSamplerParameterIuivOES = provider.getFunctionAddress("glGetSamplerParameterIuivOES");
		glGetSamplerParameterfv = provider.getFunctionAddress("glGetSamplerParameterfv");
		glGetSamplerParameteriv = provider.getFunctionAddress("glGetSamplerParameteriv");
		glGetShaderInfoLog = provider.getFunctionAddress("glGetShaderInfoLog");
		glGetShaderPrecisionFormat = provider.getFunctionAddress("glGetShaderPrecisionFormat");
		glGetShaderSource = provider.getFunctionAddress("glGetShaderSource");
		glGetShaderiv = provider.getFunctionAddress("glGetShaderiv");
		glGetString = provider.getFunctionAddress("glGetString");
		glGetStringi = provider.getFunctionAddress("glGetStringi");
		glGetSynciv = provider.getFunctionAddress("glGetSynciv");
		glGetSyncivAPPLE = provider.getFunctionAddress("glGetSyncivAPPLE");
		glGetTexLevelParameterfv = provider.getFunctionAddress("glGetTexLevelParameterfv");
		glGetTexLevelParameteriv = provider.getFunctionAddress("glGetTexLevelParameteriv");
		glGetTexParameterIiv = provider.getFunctionAddress("glGetTexParameterIiv");
		glGetTexParameterIivEXT = provider.getFunctionAddress("glGetTexParameterIivEXT");
		glGetTexParameterIivOES = provider.getFunctionAddress("glGetTexParameterIivOES");
		glGetTexParameterIuiv = provider.getFunctionAddress("glGetTexParameterIuiv");
		glGetTexParameterIuivEXT = provider.getFunctionAddress("glGetTexParameterIuivEXT");
		glGetTexParameterIuivOES = provider.getFunctionAddress("glGetTexParameterIuivOES");
		glGetTexParameterfv = provider.getFunctionAddress("glGetTexParameterfv");
		glGetTexParameteriv = provider.getFunctionAddress("glGetTexParameteriv");
		glGetTextureHandleNV = provider.getFunctionAddress("glGetTextureHandleNV");
		glGetTextureSamplerHandleNV = provider.getFunctionAddress("glGetTextureSamplerHandleNV");
		glGetTransformFeedbackVarying = provider.getFunctionAddress("glGetTransformFeedbackVarying");
		glGetTranslatedShaderSourceANGLE = provider.getFunctionAddress("glGetTranslatedShaderSourceANGLE");
		glGetUniformBlockIndex = provider.getFunctionAddress("glGetUniformBlockIndex");
		glGetUniformIndices = provider.getFunctionAddress("glGetUniformIndices");
		glGetUniformLocation = provider.getFunctionAddress("glGetUniformLocation");
		glGetUniformfv = provider.getFunctionAddress("glGetUniformfv");
		glGetUniformi64vNV = provider.getFunctionAddress("glGetUniformi64vNV");
		glGetUniformiv = provider.getFunctionAddress("glGetUniformiv");
		glGetUniformui64vNV = provider.getFunctionAddress("glGetUniformui64vNV");
		glGetUniformuiv = provider.getFunctionAddress("glGetUniformuiv");
		glGetVertexAttribIiv = provider.getFunctionAddress("glGetVertexAttribIiv");
		glGetVertexAttribIuiv = provider.getFunctionAddress("glGetVertexAttribIuiv");
		glGetVertexAttribPointerv = provider.getFunctionAddress("glGetVertexAttribPointerv");
		glGetVertexAttribfv = provider.getFunctionAddress("glGetVertexAttribfv");
		glGetVertexAttribiv = provider.getFunctionAddress("glGetVertexAttribiv");
		glGetnUniformfv = provider.getFunctionAddress("glGetnUniformfv");
		glGetnUniformfvEXT = provider.getFunctionAddress("glGetnUniformfvEXT");
		glGetnUniformfvKHR = provider.getFunctionAddress("glGetnUniformfvKHR");
		glGetnUniformiv = provider.getFunctionAddress("glGetnUniformiv");
		glGetnUniformivEXT = provider.getFunctionAddress("glGetnUniformivEXT");
		glGetnUniformivKHR = provider.getFunctionAddress("glGetnUniformivKHR");
		glGetnUniformuiv = provider.getFunctionAddress("glGetnUniformuiv");
		glGetnUniformuivKHR = provider.getFunctionAddress("glGetnUniformuivKHR");
		glHint = provider.getFunctionAddress("glHint");
		glInsertEventMarkerEXT = provider.getFunctionAddress("glInsertEventMarkerEXT");
		glInterpolatePathsNV = provider.getFunctionAddress("glInterpolatePathsNV");
		glInvalidateFramebuffer = provider.getFunctionAddress("glInvalidateFramebuffer");
		glInvalidateSubFramebuffer = provider.getFunctionAddress("glInvalidateSubFramebuffer");
		glIsBuffer = provider.getFunctionAddress("glIsBuffer");
		glIsEnabled = provider.getFunctionAddress("glIsEnabled");
		glIsEnabledi = provider.getFunctionAddress("glIsEnabledi");
		glIsEnablediEXT = provider.getFunctionAddress("glIsEnablediEXT");
		glIsEnablediNV = provider.getFunctionAddress("glIsEnablediNV");
		glIsEnablediOES = provider.getFunctionAddress("glIsEnablediOES");
		glIsFenceNV = provider.getFunctionAddress("glIsFenceNV");
		glIsFramebuffer = provider.getFunctionAddress("glIsFramebuffer");
		glIsImageHandleResidentNV = provider.getFunctionAddress("glIsImageHandleResidentNV");
		glIsPathNV = provider.getFunctionAddress("glIsPathNV");
		glIsPointInFillPathNV = provider.getFunctionAddress("glIsPointInFillPathNV");
		glIsPointInStrokePathNV = provider.getFunctionAddress("glIsPointInStrokePathNV");
		glIsProgram = provider.getFunctionAddress("glIsProgram");
		glIsProgramPipeline = provider.getFunctionAddress("glIsProgramPipeline");
		glIsProgramPipelineEXT = provider.getFunctionAddress("glIsProgramPipelineEXT");
		glIsQuery = provider.getFunctionAddress("glIsQuery");
		glIsQueryEXT = provider.getFunctionAddress("glIsQueryEXT");
		glIsRenderbuffer = provider.getFunctionAddress("glIsRenderbuffer");
		glIsSampler = provider.getFunctionAddress("glIsSampler");
		glIsShader = provider.getFunctionAddress("glIsShader");
		glIsSync = provider.getFunctionAddress("glIsSync");
		glIsSyncAPPLE = provider.getFunctionAddress("glIsSyncAPPLE");
		glIsTexture = provider.getFunctionAddress("glIsTexture");
		glIsTextureHandleResidentNV = provider.getFunctionAddress("glIsTextureHandleResidentNV");
		glIsTransformFeedback = provider.getFunctionAddress("glIsTransformFeedback");
		glIsVertexArray = provider.getFunctionAddress("glIsVertexArray");
		glIsVertexArrayOES = provider.getFunctionAddress("glIsVertexArrayOES");
		glLabelObjectEXT = provider.getFunctionAddress("glLabelObjectEXT");
		glLineWidth = provider.getFunctionAddress("glLineWidth");
		glLinkProgram = provider.getFunctionAddress("glLinkProgram");
		glMakeImageHandleNonResidentNV = provider.getFunctionAddress("glMakeImageHandleNonResidentNV");
		glMakeImageHandleResidentNV = provider.getFunctionAddress("glMakeImageHandleResidentNV");
		glMakeTextureHandleNonResidentNV = provider.getFunctionAddress("glMakeTextureHandleNonResidentNV");
		glMakeTextureHandleResidentNV = provider.getFunctionAddress("glMakeTextureHandleResidentNV");
		glMapBufferOES = provider.getFunctionAddress("glMapBufferOES");
		glMapBufferRange = provider.getFunctionAddress("glMapBufferRange");
		glMapBufferRangeEXT = provider.getFunctionAddress("glMapBufferRangeEXT");
		glMatrixLoad3x2fNV = provider.getFunctionAddress("glMatrixLoad3x2fNV");
		glMatrixLoad3x3fNV = provider.getFunctionAddress("glMatrixLoad3x3fNV");
		glMatrixLoadTranspose3x3fNV = provider.getFunctionAddress("glMatrixLoadTranspose3x3fNV");
		glMatrixMult3x2fNV = provider.getFunctionAddress("glMatrixMult3x2fNV");
		glMatrixMult3x3fNV = provider.getFunctionAddress("glMatrixMult3x3fNV");
		glMatrixMultTranspose3x3fNV = provider.getFunctionAddress("glMatrixMultTranspose3x3fNV");
		glMemoryBarrier = provider.getFunctionAddress("glMemoryBarrier");
		glMemoryBarrierByRegion = provider.getFunctionAddress("glMemoryBarrierByRegion");
		glMinSampleShading = provider.getFunctionAddress("glMinSampleShading");
		glMinSampleShadingOES = provider.getFunctionAddress("glMinSampleShadingOES");
		glMultiDrawArraysEXT = provider.getFunctionAddress("glMultiDrawArraysEXT");
		glMultiDrawArraysIndirectEXT = provider.getFunctionAddress("glMultiDrawArraysIndirectEXT");
		glMultiDrawElementsBaseVertexEXT = provider.getFunctionAddress("glMultiDrawElementsBaseVertexEXT");
		glMultiDrawElementsBaseVertexOES = provider.getFunctionAddress("glMultiDrawElementsBaseVertexOES");
		glMultiDrawElementsEXT = provider.getFunctionAddress("glMultiDrawElementsEXT");
		glMultiDrawElementsIndirectEXT = provider.getFunctionAddress("glMultiDrawElementsIndirectEXT");
		glNamedFramebufferSampleLocationsfvNV = provider.getFunctionAddress("glNamedFramebufferSampleLocationsfvNV");
		glObjectLabel = provider.getFunctionAddress("glObjectLabel");
		glObjectLabelKHR = provider.getFunctionAddress("glObjectLabelKHR");
		glObjectPtrLabel = provider.getFunctionAddress("glObjectPtrLabel");
		glObjectPtrLabelKHR = provider.getFunctionAddress("glObjectPtrLabelKHR");
		glPatchParameteri = provider.getFunctionAddress("glPatchParameteri");
		glPatchParameteriEXT = provider.getFunctionAddress("glPatchParameteriEXT");
		glPatchParameteriOES = provider.getFunctionAddress("glPatchParameteriOES");
		glPathCommandsNV = provider.getFunctionAddress("glPathCommandsNV");
		glPathCoordsNV = provider.getFunctionAddress("glPathCoordsNV");
		glPathCoverDepthFuncNV = provider.getFunctionAddress("glPathCoverDepthFuncNV");
		glPathDashArrayNV = provider.getFunctionAddress("glPathDashArrayNV");
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
		glPauseTransformFeedback = provider.getFunctionAddress("glPauseTransformFeedback");
		glPixelStorei = provider.getFunctionAddress("glPixelStorei");
		glPointAlongPathNV = provider.getFunctionAddress("glPointAlongPathNV");
		glPolygonModeNV = provider.getFunctionAddress("glPolygonModeNV");
		glPolygonOffset = provider.getFunctionAddress("glPolygonOffset");
		glPolygonOffsetClampEXT = provider.getFunctionAddress("glPolygonOffsetClampEXT");
		glPopDebugGroup = provider.getFunctionAddress("glPopDebugGroup");
		glPopDebugGroupKHR = provider.getFunctionAddress("glPopDebugGroupKHR");
		glPopGroupMarkerEXT = provider.getFunctionAddress("glPopGroupMarkerEXT");
		glPrimitiveBoundingBox = provider.getFunctionAddress("glPrimitiveBoundingBox");
		glPrimitiveBoundingBoxEXT = provider.getFunctionAddress("glPrimitiveBoundingBoxEXT");
		glPrimitiveBoundingBoxOES = provider.getFunctionAddress("glPrimitiveBoundingBoxOES");
		glProgramBinary = provider.getFunctionAddress("glProgramBinary");
		glProgramBinaryOES = provider.getFunctionAddress("glProgramBinaryOES");
		glProgramParameteri = provider.getFunctionAddress("glProgramParameteri");
		glProgramParameteriEXT = provider.getFunctionAddress("glProgramParameteriEXT");
		glProgramPathFragmentInputGenNV = provider.getFunctionAddress("glProgramPathFragmentInputGenNV");
		glProgramUniform1f = provider.getFunctionAddress("glProgramUniform1f");
		glProgramUniform1fEXT = provider.getFunctionAddress("glProgramUniform1fEXT");
		glProgramUniform1fv = provider.getFunctionAddress("glProgramUniform1fv");
		glProgramUniform1fvEXT = provider.getFunctionAddress("glProgramUniform1fvEXT");
		glProgramUniform1i = provider.getFunctionAddress("glProgramUniform1i");
		glProgramUniform1i64NV = provider.getFunctionAddress("glProgramUniform1i64NV");
		glProgramUniform1i64vNV = provider.getFunctionAddress("glProgramUniform1i64vNV");
		glProgramUniform1iEXT = provider.getFunctionAddress("glProgramUniform1iEXT");
		glProgramUniform1iv = provider.getFunctionAddress("glProgramUniform1iv");
		glProgramUniform1ivEXT = provider.getFunctionAddress("glProgramUniform1ivEXT");
		glProgramUniform1ui = provider.getFunctionAddress("glProgramUniform1ui");
		glProgramUniform1ui64NV = provider.getFunctionAddress("glProgramUniform1ui64NV");
		glProgramUniform1ui64vNV = provider.getFunctionAddress("glProgramUniform1ui64vNV");
		glProgramUniform1uiEXT = provider.getFunctionAddress("glProgramUniform1uiEXT");
		glProgramUniform1uiv = provider.getFunctionAddress("glProgramUniform1uiv");
		glProgramUniform1uivEXT = provider.getFunctionAddress("glProgramUniform1uivEXT");
		glProgramUniform2f = provider.getFunctionAddress("glProgramUniform2f");
		glProgramUniform2fEXT = provider.getFunctionAddress("glProgramUniform2fEXT");
		glProgramUniform2fv = provider.getFunctionAddress("glProgramUniform2fv");
		glProgramUniform2fvEXT = provider.getFunctionAddress("glProgramUniform2fvEXT");
		glProgramUniform2i = provider.getFunctionAddress("glProgramUniform2i");
		glProgramUniform2i64NV = provider.getFunctionAddress("glProgramUniform2i64NV");
		glProgramUniform2i64vNV = provider.getFunctionAddress("glProgramUniform2i64vNV");
		glProgramUniform2iEXT = provider.getFunctionAddress("glProgramUniform2iEXT");
		glProgramUniform2iv = provider.getFunctionAddress("glProgramUniform2iv");
		glProgramUniform2ivEXT = provider.getFunctionAddress("glProgramUniform2ivEXT");
		glProgramUniform2ui = provider.getFunctionAddress("glProgramUniform2ui");
		glProgramUniform2ui64NV = provider.getFunctionAddress("glProgramUniform2ui64NV");
		glProgramUniform2ui64vNV = provider.getFunctionAddress("glProgramUniform2ui64vNV");
		glProgramUniform2uiEXT = provider.getFunctionAddress("glProgramUniform2uiEXT");
		glProgramUniform2uiv = provider.getFunctionAddress("glProgramUniform2uiv");
		glProgramUniform2uivEXT = provider.getFunctionAddress("glProgramUniform2uivEXT");
		glProgramUniform3f = provider.getFunctionAddress("glProgramUniform3f");
		glProgramUniform3fEXT = provider.getFunctionAddress("glProgramUniform3fEXT");
		glProgramUniform3fv = provider.getFunctionAddress("glProgramUniform3fv");
		glProgramUniform3fvEXT = provider.getFunctionAddress("glProgramUniform3fvEXT");
		glProgramUniform3i = provider.getFunctionAddress("glProgramUniform3i");
		glProgramUniform3i64NV = provider.getFunctionAddress("glProgramUniform3i64NV");
		glProgramUniform3i64vNV = provider.getFunctionAddress("glProgramUniform3i64vNV");
		glProgramUniform3iEXT = provider.getFunctionAddress("glProgramUniform3iEXT");
		glProgramUniform3iv = provider.getFunctionAddress("glProgramUniform3iv");
		glProgramUniform3ivEXT = provider.getFunctionAddress("glProgramUniform3ivEXT");
		glProgramUniform3ui = provider.getFunctionAddress("glProgramUniform3ui");
		glProgramUniform3ui64NV = provider.getFunctionAddress("glProgramUniform3ui64NV");
		glProgramUniform3ui64vNV = provider.getFunctionAddress("glProgramUniform3ui64vNV");
		glProgramUniform3uiEXT = provider.getFunctionAddress("glProgramUniform3uiEXT");
		glProgramUniform3uiv = provider.getFunctionAddress("glProgramUniform3uiv");
		glProgramUniform3uivEXT = provider.getFunctionAddress("glProgramUniform3uivEXT");
		glProgramUniform4f = provider.getFunctionAddress("glProgramUniform4f");
		glProgramUniform4fEXT = provider.getFunctionAddress("glProgramUniform4fEXT");
		glProgramUniform4fv = provider.getFunctionAddress("glProgramUniform4fv");
		glProgramUniform4fvEXT = provider.getFunctionAddress("glProgramUniform4fvEXT");
		glProgramUniform4i = provider.getFunctionAddress("glProgramUniform4i");
		glProgramUniform4i64NV = provider.getFunctionAddress("glProgramUniform4i64NV");
		glProgramUniform4i64vNV = provider.getFunctionAddress("glProgramUniform4i64vNV");
		glProgramUniform4iEXT = provider.getFunctionAddress("glProgramUniform4iEXT");
		glProgramUniform4iv = provider.getFunctionAddress("glProgramUniform4iv");
		glProgramUniform4ivEXT = provider.getFunctionAddress("glProgramUniform4ivEXT");
		glProgramUniform4ui = provider.getFunctionAddress("glProgramUniform4ui");
		glProgramUniform4ui64NV = provider.getFunctionAddress("glProgramUniform4ui64NV");
		glProgramUniform4ui64vNV = provider.getFunctionAddress("glProgramUniform4ui64vNV");
		glProgramUniform4uiEXT = provider.getFunctionAddress("glProgramUniform4uiEXT");
		glProgramUniform4uiv = provider.getFunctionAddress("glProgramUniform4uiv");
		glProgramUniform4uivEXT = provider.getFunctionAddress("glProgramUniform4uivEXT");
		glProgramUniformHandleui64NV = provider.getFunctionAddress("glProgramUniformHandleui64NV");
		glProgramUniformHandleui64vNV = provider.getFunctionAddress("glProgramUniformHandleui64vNV");
		glProgramUniformMatrix2fv = provider.getFunctionAddress("glProgramUniformMatrix2fv");
		glProgramUniformMatrix2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2fvEXT");
		glProgramUniformMatrix2x3fv = provider.getFunctionAddress("glProgramUniformMatrix2x3fv");
		glProgramUniformMatrix2x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x3fvEXT");
		glProgramUniformMatrix2x4fv = provider.getFunctionAddress("glProgramUniformMatrix2x4fv");
		glProgramUniformMatrix2x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x4fvEXT");
		glProgramUniformMatrix3fv = provider.getFunctionAddress("glProgramUniformMatrix3fv");
		glProgramUniformMatrix3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3fvEXT");
		glProgramUniformMatrix3x2fv = provider.getFunctionAddress("glProgramUniformMatrix3x2fv");
		glProgramUniformMatrix3x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x2fvEXT");
		glProgramUniformMatrix3x4fv = provider.getFunctionAddress("glProgramUniformMatrix3x4fv");
		glProgramUniformMatrix3x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x4fvEXT");
		glProgramUniformMatrix4fv = provider.getFunctionAddress("glProgramUniformMatrix4fv");
		glProgramUniformMatrix4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4fvEXT");
		glProgramUniformMatrix4x2fv = provider.getFunctionAddress("glProgramUniformMatrix4x2fv");
		glProgramUniformMatrix4x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x2fvEXT");
		glProgramUniformMatrix4x3fv = provider.getFunctionAddress("glProgramUniformMatrix4x3fv");
		glProgramUniformMatrix4x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x3fvEXT");
		glPushDebugGroup = provider.getFunctionAddress("glPushDebugGroup");
		glPushDebugGroupKHR = provider.getFunctionAddress("glPushDebugGroupKHR");
		glPushGroupMarkerEXT = provider.getFunctionAddress("glPushGroupMarkerEXT");
		glQueryCounterEXT = provider.getFunctionAddress("glQueryCounterEXT");
		glRasterSamplesEXT = provider.getFunctionAddress("glRasterSamplesEXT");
		glReadBuffer = provider.getFunctionAddress("glReadBuffer");
		glReadBufferIndexedEXT = provider.getFunctionAddress("glReadBufferIndexedEXT");
		glReadBufferNV = provider.getFunctionAddress("glReadBufferNV");
		glReadPixels = provider.getFunctionAddress("glReadPixels");
		glReadnPixels = provider.getFunctionAddress("glReadnPixels");
		glReadnPixelsEXT = provider.getFunctionAddress("glReadnPixelsEXT");
		glReadnPixelsKHR = provider.getFunctionAddress("glReadnPixelsKHR");
		glReleaseShaderCompiler = provider.getFunctionAddress("glReleaseShaderCompiler");
		glRenderbufferStorage = provider.getFunctionAddress("glRenderbufferStorage");
		glRenderbufferStorageMultisample = provider.getFunctionAddress("glRenderbufferStorageMultisample");
		glRenderbufferStorageMultisampleANGLE = provider.getFunctionAddress("glRenderbufferStorageMultisampleANGLE");
		glRenderbufferStorageMultisampleAPPLE = provider.getFunctionAddress("glRenderbufferStorageMultisampleAPPLE");
		glRenderbufferStorageMultisampleEXT = provider.getFunctionAddress("glRenderbufferStorageMultisampleEXT");
		glRenderbufferStorageMultisampleIMG = provider.getFunctionAddress("glRenderbufferStorageMultisampleIMG");
		glRenderbufferStorageMultisampleNV = provider.getFunctionAddress("glRenderbufferStorageMultisampleNV");
		glResolveDepthValuesNV = provider.getFunctionAddress("glResolveDepthValuesNV");
		glResolveMultisampleFramebufferAPPLE = provider.getFunctionAddress("glResolveMultisampleFramebufferAPPLE");
		glResumeTransformFeedback = provider.getFunctionAddress("glResumeTransformFeedback");
		glSampleCoverage = provider.getFunctionAddress("glSampleCoverage");
		glSampleMaski = provider.getFunctionAddress("glSampleMaski");
		glSamplerParameterIiv = provider.getFunctionAddress("glSamplerParameterIiv");
		glSamplerParameterIivEXT = provider.getFunctionAddress("glSamplerParameterIivEXT");
		glSamplerParameterIivOES = provider.getFunctionAddress("glSamplerParameterIivOES");
		glSamplerParameterIuiv = provider.getFunctionAddress("glSamplerParameterIuiv");
		glSamplerParameterIuivEXT = provider.getFunctionAddress("glSamplerParameterIuivEXT");
		glSamplerParameterIuivOES = provider.getFunctionAddress("glSamplerParameterIuivOES");
		glSamplerParameterf = provider.getFunctionAddress("glSamplerParameterf");
		glSamplerParameterfv = provider.getFunctionAddress("glSamplerParameterfv");
		glSamplerParameteri = provider.getFunctionAddress("glSamplerParameteri");
		glSamplerParameteriv = provider.getFunctionAddress("glSamplerParameteriv");
		glScissor = provider.getFunctionAddress("glScissor");
		glScissorArrayvNV = provider.getFunctionAddress("glScissorArrayvNV");
		glScissorIndexedNV = provider.getFunctionAddress("glScissorIndexedNV");
		glScissorIndexedvNV = provider.getFunctionAddress("glScissorIndexedvNV");
		glSelectPerfMonitorCountersAMD = provider.getFunctionAddress("glSelectPerfMonitorCountersAMD");
		glSetFenceNV = provider.getFunctionAddress("glSetFenceNV");
		glShaderBinary = provider.getFunctionAddress("glShaderBinary");
		glShaderSource = provider.getFunctionAddress("glShaderSource");
		glStartTilingQCOM = provider.getFunctionAddress("glStartTilingQCOM");
		glStencilFillPathInstancedNV = provider.getFunctionAddress("glStencilFillPathInstancedNV");
		glStencilFillPathNV = provider.getFunctionAddress("glStencilFillPathNV");
		glStencilFunc = provider.getFunctionAddress("glStencilFunc");
		glStencilFuncSeparate = provider.getFunctionAddress("glStencilFuncSeparate");
		glStencilMask = provider.getFunctionAddress("glStencilMask");
		glStencilMaskSeparate = provider.getFunctionAddress("glStencilMaskSeparate");
		glStencilOp = provider.getFunctionAddress("glStencilOp");
		glStencilOpSeparate = provider.getFunctionAddress("glStencilOpSeparate");
		glStencilStrokePathInstancedNV = provider.getFunctionAddress("glStencilStrokePathInstancedNV");
		glStencilStrokePathNV = provider.getFunctionAddress("glStencilStrokePathNV");
		glStencilThenCoverFillPathInstancedNV = provider.getFunctionAddress("glStencilThenCoverFillPathInstancedNV");
		glStencilThenCoverFillPathNV = provider.getFunctionAddress("glStencilThenCoverFillPathNV");
		glStencilThenCoverStrokePathInstancedNV = provider.getFunctionAddress("glStencilThenCoverStrokePathInstancedNV");
		glStencilThenCoverStrokePathNV = provider.getFunctionAddress("glStencilThenCoverStrokePathNV");
		glSubpixelPrecisionBiasNV = provider.getFunctionAddress("glSubpixelPrecisionBiasNV");
		glTestFenceNV = provider.getFunctionAddress("glTestFenceNV");
		glTexBuffer = provider.getFunctionAddress("glTexBuffer");
		glTexBufferEXT = provider.getFunctionAddress("glTexBufferEXT");
		glTexBufferOES = provider.getFunctionAddress("glTexBufferOES");
		glTexBufferRange = provider.getFunctionAddress("glTexBufferRange");
		glTexBufferRangeEXT = provider.getFunctionAddress("glTexBufferRangeEXT");
		glTexBufferRangeOES = provider.getFunctionAddress("glTexBufferRangeOES");
		glTexImage2D = provider.getFunctionAddress("glTexImage2D");
		glTexImage3D = provider.getFunctionAddress("glTexImage3D");
		glTexImage3DNV = provider.getFunctionAddress("glTexImage3DNV");
		glTexImage3DOES = provider.getFunctionAddress("glTexImage3DOES");
		glTexPageCommitmentARB = provider.getFunctionAddress("glTexPageCommitmentARB");
		glTexParameterIiv = provider.getFunctionAddress("glTexParameterIiv");
		glTexParameterIivEXT = provider.getFunctionAddress("glTexParameterIivEXT");
		glTexParameterIivOES = provider.getFunctionAddress("glTexParameterIivOES");
		glTexParameterIuiv = provider.getFunctionAddress("glTexParameterIuiv");
		glTexParameterIuivEXT = provider.getFunctionAddress("glTexParameterIuivEXT");
		glTexParameterIuivOES = provider.getFunctionAddress("glTexParameterIuivOES");
		glTexParameterf = provider.getFunctionAddress("glTexParameterf");
		glTexParameterfv = provider.getFunctionAddress("glTexParameterfv");
		glTexParameteri = provider.getFunctionAddress("glTexParameteri");
		glTexParameteriv = provider.getFunctionAddress("glTexParameteriv");
		glTexStorage1DEXT = provider.getFunctionAddress("glTexStorage1DEXT");
		glTexStorage2D = provider.getFunctionAddress("glTexStorage2D");
		glTexStorage2DEXT = provider.getFunctionAddress("glTexStorage2DEXT");
		glTexStorage2DMultisample = provider.getFunctionAddress("glTexStorage2DMultisample");
		glTexStorage3D = provider.getFunctionAddress("glTexStorage3D");
		glTexStorage3DEXT = provider.getFunctionAddress("glTexStorage3DEXT");
		glTexStorage3DMultisample = provider.getFunctionAddress("glTexStorage3DMultisample");
		glTexStorage3DMultisampleOES = provider.getFunctionAddress("glTexStorage3DMultisampleOES");
		glTexSubImage2D = provider.getFunctionAddress("glTexSubImage2D");
		glTexSubImage3D = provider.getFunctionAddress("glTexSubImage3D");
		glTexSubImage3DNV = provider.getFunctionAddress("glTexSubImage3DNV");
		glTexSubImage3DOES = provider.getFunctionAddress("glTexSubImage3DOES");
		glTextureStorage1DEXT = provider.getFunctionAddress("glTextureStorage1DEXT");
		glTextureStorage2DEXT = provider.getFunctionAddress("glTextureStorage2DEXT");
		glTextureStorage3DEXT = provider.getFunctionAddress("glTextureStorage3DEXT");
		glTextureViewEXT = provider.getFunctionAddress("glTextureViewEXT");
		glTextureViewOES = provider.getFunctionAddress("glTextureViewOES");
		glTransformFeedbackVaryings = provider.getFunctionAddress("glTransformFeedbackVaryings");
		glTransformPathNV = provider.getFunctionAddress("glTransformPathNV");
		glUniform1f = provider.getFunctionAddress("glUniform1f");
		glUniform1fv = provider.getFunctionAddress("glUniform1fv");
		glUniform1i = provider.getFunctionAddress("glUniform1i");
		glUniform1i64NV = provider.getFunctionAddress("glUniform1i64NV");
		glUniform1i64vNV = provider.getFunctionAddress("glUniform1i64vNV");
		glUniform1iv = provider.getFunctionAddress("glUniform1iv");
		glUniform1ui = provider.getFunctionAddress("glUniform1ui");
		glUniform1ui64NV = provider.getFunctionAddress("glUniform1ui64NV");
		glUniform1ui64vNV = provider.getFunctionAddress("glUniform1ui64vNV");
		glUniform1uiv = provider.getFunctionAddress("glUniform1uiv");
		glUniform2f = provider.getFunctionAddress("glUniform2f");
		glUniform2fv = provider.getFunctionAddress("glUniform2fv");
		glUniform2i = provider.getFunctionAddress("glUniform2i");
		glUniform2i64NV = provider.getFunctionAddress("glUniform2i64NV");
		glUniform2i64vNV = provider.getFunctionAddress("glUniform2i64vNV");
		glUniform2iv = provider.getFunctionAddress("glUniform2iv");
		glUniform2ui = provider.getFunctionAddress("glUniform2ui");
		glUniform2ui64NV = provider.getFunctionAddress("glUniform2ui64NV");
		glUniform2ui64vNV = provider.getFunctionAddress("glUniform2ui64vNV");
		glUniform2uiv = provider.getFunctionAddress("glUniform2uiv");
		glUniform3f = provider.getFunctionAddress("glUniform3f");
		glUniform3fv = provider.getFunctionAddress("glUniform3fv");
		glUniform3i = provider.getFunctionAddress("glUniform3i");
		glUniform3i64NV = provider.getFunctionAddress("glUniform3i64NV");
		glUniform3i64vNV = provider.getFunctionAddress("glUniform3i64vNV");
		glUniform3iv = provider.getFunctionAddress("glUniform3iv");
		glUniform3ui = provider.getFunctionAddress("glUniform3ui");
		glUniform3ui64NV = provider.getFunctionAddress("glUniform3ui64NV");
		glUniform3ui64vNV = provider.getFunctionAddress("glUniform3ui64vNV");
		glUniform3uiv = provider.getFunctionAddress("glUniform3uiv");
		glUniform4f = provider.getFunctionAddress("glUniform4f");
		glUniform4fv = provider.getFunctionAddress("glUniform4fv");
		glUniform4i = provider.getFunctionAddress("glUniform4i");
		glUniform4i64NV = provider.getFunctionAddress("glUniform4i64NV");
		glUniform4i64vNV = provider.getFunctionAddress("glUniform4i64vNV");
		glUniform4iv = provider.getFunctionAddress("glUniform4iv");
		glUniform4ui = provider.getFunctionAddress("glUniform4ui");
		glUniform4ui64NV = provider.getFunctionAddress("glUniform4ui64NV");
		glUniform4ui64vNV = provider.getFunctionAddress("glUniform4ui64vNV");
		glUniform4uiv = provider.getFunctionAddress("glUniform4uiv");
		glUniformBlockBinding = provider.getFunctionAddress("glUniformBlockBinding");
		glUniformHandleui64NV = provider.getFunctionAddress("glUniformHandleui64NV");
		glUniformHandleui64vNV = provider.getFunctionAddress("glUniformHandleui64vNV");
		glUniformMatrix2fv = provider.getFunctionAddress("glUniformMatrix2fv");
		glUniformMatrix2x3fv = provider.getFunctionAddress("glUniformMatrix2x3fv");
		glUniformMatrix2x3fvNV = provider.getFunctionAddress("glUniformMatrix2x3fvNV");
		glUniformMatrix2x4fv = provider.getFunctionAddress("glUniformMatrix2x4fv");
		glUniformMatrix2x4fvNV = provider.getFunctionAddress("glUniformMatrix2x4fvNV");
		glUniformMatrix3fv = provider.getFunctionAddress("glUniformMatrix3fv");
		glUniformMatrix3x2fv = provider.getFunctionAddress("glUniformMatrix3x2fv");
		glUniformMatrix3x2fvNV = provider.getFunctionAddress("glUniformMatrix3x2fvNV");
		glUniformMatrix3x4fv = provider.getFunctionAddress("glUniformMatrix3x4fv");
		glUniformMatrix3x4fvNV = provider.getFunctionAddress("glUniformMatrix3x4fvNV");
		glUniformMatrix4fv = provider.getFunctionAddress("glUniformMatrix4fv");
		glUniformMatrix4x2fv = provider.getFunctionAddress("glUniformMatrix4x2fv");
		glUniformMatrix4x2fvNV = provider.getFunctionAddress("glUniformMatrix4x2fvNV");
		glUniformMatrix4x3fv = provider.getFunctionAddress("glUniformMatrix4x3fv");
		glUniformMatrix4x3fvNV = provider.getFunctionAddress("glUniformMatrix4x3fvNV");
		glUnmapBuffer = provider.getFunctionAddress("glUnmapBuffer");
		glUnmapBufferOES = provider.getFunctionAddress("glUnmapBufferOES");
		glUseProgram = provider.getFunctionAddress("glUseProgram");
		glUseProgramStages = provider.getFunctionAddress("glUseProgramStages");
		glUseProgramStagesEXT = provider.getFunctionAddress("glUseProgramStagesEXT");
		glValidateProgram = provider.getFunctionAddress("glValidateProgram");
		glValidateProgramPipeline = provider.getFunctionAddress("glValidateProgramPipeline");
		glValidateProgramPipelineEXT = provider.getFunctionAddress("glValidateProgramPipelineEXT");
		glVertexAttrib1f = provider.getFunctionAddress("glVertexAttrib1f");
		glVertexAttrib1fv = provider.getFunctionAddress("glVertexAttrib1fv");
		glVertexAttrib2f = provider.getFunctionAddress("glVertexAttrib2f");
		glVertexAttrib2fv = provider.getFunctionAddress("glVertexAttrib2fv");
		glVertexAttrib3f = provider.getFunctionAddress("glVertexAttrib3f");
		glVertexAttrib3fv = provider.getFunctionAddress("glVertexAttrib3fv");
		glVertexAttrib4f = provider.getFunctionAddress("glVertexAttrib4f");
		glVertexAttrib4fv = provider.getFunctionAddress("glVertexAttrib4fv");
		glVertexAttribBinding = provider.getFunctionAddress("glVertexAttribBinding");
		glVertexAttribDivisor = provider.getFunctionAddress("glVertexAttribDivisor");
		glVertexAttribDivisorANGLE = provider.getFunctionAddress("glVertexAttribDivisorANGLE");
		glVertexAttribDivisorEXT = provider.getFunctionAddress("glVertexAttribDivisorEXT");
		glVertexAttribDivisorNV = provider.getFunctionAddress("glVertexAttribDivisorNV");
		glVertexAttribFormat = provider.getFunctionAddress("glVertexAttribFormat");
		glVertexAttribI4i = provider.getFunctionAddress("glVertexAttribI4i");
		glVertexAttribI4iv = provider.getFunctionAddress("glVertexAttribI4iv");
		glVertexAttribI4ui = provider.getFunctionAddress("glVertexAttribI4ui");
		glVertexAttribI4uiv = provider.getFunctionAddress("glVertexAttribI4uiv");
		glVertexAttribIFormat = provider.getFunctionAddress("glVertexAttribIFormat");
		glVertexAttribIPointer = provider.getFunctionAddress("glVertexAttribIPointer");
		glVertexAttribPointer = provider.getFunctionAddress("glVertexAttribPointer");
		glVertexBindingDivisor = provider.getFunctionAddress("glVertexBindingDivisor");
		glViewport = provider.getFunctionAddress("glViewport");
		glViewportArrayvNV = provider.getFunctionAddress("glViewportArrayvNV");
		glViewportIndexedfNV = provider.getFunctionAddress("glViewportIndexedfNV");
		glViewportIndexedfvNV = provider.getFunctionAddress("glViewportIndexedfvNV");
		glViewportSwizzleNV = provider.getFunctionAddress("glViewportSwizzleNV");
		glWaitSync = provider.getFunctionAddress("glWaitSync");
		glWaitSyncAPPLE = provider.getFunctionAddress("glWaitSyncAPPLE");
		glWeightPathsNV = provider.getFunctionAddress("glWeightPathsNV");

		GLES20 = ext.contains("GLES20") && GLES.checkExtension("GLES20", org.lwjgl.opengles.GLES20.isAvailable(this));
		GLES30 = ext.contains("GLES30") && GLES.checkExtension("GLES30", org.lwjgl.opengles.GLES30.isAvailable(this));
		GLES31 = ext.contains("GLES31") && GLES.checkExtension("GLES31", org.lwjgl.opengles.GLES31.isAvailable(this));
		GLES32 = ext.contains("GLES32") && GLES.checkExtension("GLES32", org.lwjgl.opengles.GLES32.isAvailable(this));
		GL_AMD_compressed_3DC_texture = ext.contains("GL_AMD_compressed_3DC_texture");
		GL_AMD_compressed_ATC_texture = ext.contains("GL_AMD_compressed_ATC_texture");
		GL_AMD_performance_monitor = ext.contains("GL_AMD_performance_monitor") && GLES.checkExtension("GL_AMD_performance_monitor", AMDPerformanceMonitor.isAvailable(this));
		GL_AMD_program_binary_Z400 = ext.contains("GL_AMD_program_binary_Z400");
		GL_ANDROID_extension_pack_es31a = ext.contains("GL_ANDROID_extension_pack_es31a");
		GL_ANGLE_depth_texture = ext.contains("GL_ANGLE_depth_texture");
		GL_ANGLE_framebuffer_blit = ext.contains("GL_ANGLE_framebuffer_blit") && GLES.checkExtension("GL_ANGLE_framebuffer_blit", ANGLEFramebufferBlit.isAvailable(this));
		GL_ANGLE_framebuffer_multisample = ext.contains("GL_ANGLE_framebuffer_multisample") && GLES.checkExtension("GL_ANGLE_framebuffer_multisample", ANGLEFramebufferMultisample.isAvailable(this));
		GL_ANGLE_instanced_arrays = ext.contains("GL_ANGLE_instanced_arrays") && GLES.checkExtension("GL_ANGLE_instanced_arrays", ANGLEInstancedArrays.isAvailable(this));
		GL_ANGLE_pack_reverse_row_order = ext.contains("GL_ANGLE_pack_reverse_row_order");
		GL_ANGLE_program_binary = ext.contains("GL_ANGLE_program_binary");
		GL_ANGLE_texture_compression_dxt1 = ext.contains("GL_ANGLE_texture_compression_dxt1");
		GL_ANGLE_texture_compression_dxt3 = ext.contains("GL_ANGLE_texture_compression_dxt3");
		GL_ANGLE_texture_compression_dxt5 = ext.contains("GL_ANGLE_texture_compression_dxt5");
		GL_ANGLE_texture_usage = ext.contains("GL_ANGLE_texture_usage");
		GL_ANGLE_translated_shader_source = ext.contains("GL_ANGLE_translated_shader_source") && GLES.checkExtension("GL_ANGLE_translated_shader_source", ANGLETranslatedShaderSource.isAvailable(this));
		GL_APPLE_clip_distance = ext.contains("GL_APPLE_clip_distance");
		GL_APPLE_color_buffer_packed_float = ext.contains("GL_APPLE_color_buffer_packed_float");
		GL_APPLE_copy_texture_levels = ext.contains("GL_APPLE_copy_texture_levels") && GLES.checkExtension("GL_APPLE_copy_texture_levels", APPLECopyTextureLevels.isAvailable(this));
		GL_APPLE_framebuffer_multisample = ext.contains("GL_APPLE_framebuffer_multisample") && GLES.checkExtension("GL_APPLE_framebuffer_multisample", APPLEFramebufferMultisample.isAvailable(this));
		GL_APPLE_rgb_422 = ext.contains("GL_APPLE_rgb_422");
		GL_APPLE_sync = ext.contains("GL_APPLE_sync") && GLES.checkExtension("GL_APPLE_sync", APPLESync.isAvailable(this));
		GL_APPLE_texture_format_BGRA8888 = ext.contains("GL_APPLE_texture_format_BGRA8888");
		GL_APPLE_texture_max_level = ext.contains("GL_APPLE_texture_max_level");
		GL_APPLE_texture_packed_float = ext.contains("GL_APPLE_texture_packed_float");
		GL_ARM_mali_program_binary = ext.contains("GL_ARM_mali_program_binary");
		GL_ARM_mali_shader_binary = ext.contains("GL_ARM_mali_shader_binary");
		GL_ARM_rgba8 = ext.contains("GL_ARM_rgba8");
		GL_ARM_shader_framebuffer_fetch = ext.contains("GL_ARM_shader_framebuffer_fetch");
		GL_ARM_shader_framebuffer_fetch_depth_stencil = ext.contains("GL_ARM_shader_framebuffer_fetch_depth_stencil");
		GL_DMP_program_binary = ext.contains("GL_DMP_program_binary");
		GL_DMP_shader_binary = ext.contains("GL_DMP_shader_binary");
		GL_EXT_base_instance = ext.contains("GL_EXT_base_instance") && GLES.checkExtension("GL_EXT_base_instance", EXTBaseInstance.isAvailable(this));
		GL_EXT_blend_func_extended = ext.contains("GL_EXT_blend_func_extended") && GLES.checkExtension("GL_EXT_blend_func_extended", EXTBlendFuncExtended.isAvailable(this));
		GL_EXT_blend_minmax = ext.contains("GL_EXT_blend_minmax");
		GL_EXT_buffer_storage = ext.contains("GL_EXT_buffer_storage") && GLES.checkExtension("GL_EXT_buffer_storage", EXTBufferStorage.isAvailable(this));
		GL_EXT_clip_cull_distance = ext.contains("GL_EXT_clip_cull_distance");
		GL_EXT_color_buffer_float = ext.contains("GL_EXT_color_buffer_float");
		GL_EXT_color_buffer_half_float = ext.contains("GL_EXT_color_buffer_half_float");
		GL_EXT_copy_image = ext.contains("GL_EXT_copy_image") && GLES.checkExtension("GL_EXT_copy_image", EXTCopyImage.isAvailable(this));
		GL_EXT_debug_label = ext.contains("GL_EXT_debug_label") && GLES.checkExtension("GL_EXT_debug_label", EXTDebugLabel.isAvailable(this));
		GL_EXT_debug_marker = ext.contains("GL_EXT_debug_marker") && GLES.checkExtension("GL_EXT_debug_marker", EXTDebugMarker.isAvailable(this));
		GL_EXT_discard_framebuffer = ext.contains("GL_EXT_discard_framebuffer") && GLES.checkExtension("GL_EXT_discard_framebuffer", EXTDiscardFramebuffer.isAvailable(this));
		GL_EXT_disjoint_timer_query = ext.contains("GL_EXT_disjoint_timer_query") && GLES.checkExtension("GL_EXT_disjoint_timer_query", EXTDisjointTimerQuery.isAvailable(this));
		GL_EXT_draw_buffers = ext.contains("GL_EXT_draw_buffers") && GLES.checkExtension("GL_EXT_draw_buffers", EXTDrawBuffers.isAvailable(this));
		GL_EXT_draw_buffers_indexed = ext.contains("GL_EXT_draw_buffers_indexed") && GLES.checkExtension("GL_EXT_draw_buffers_indexed", EXTDrawBuffersIndexed.isAvailable(this));
		GL_EXT_draw_elements_base_vertex = ext.contains("GL_EXT_draw_elements_base_vertex") && GLES.checkExtension("GL_EXT_draw_elements_base_vertex", EXTDrawElementsBaseVertex.isAvailable(this, ext));
		GL_EXT_draw_instanced = ext.contains("GL_EXT_draw_instanced") && GLES.checkExtension("GL_EXT_draw_instanced", EXTDrawInstanced.isAvailable(this));
		GL_EXT_float_blend = ext.contains("GL_EXT_float_blend");
		GL_EXT_geometry_point_size = ext.contains("GL_EXT_geometry_point_size");
		GL_EXT_geometry_shader = ext.contains("GL_EXT_geometry_shader") && GLES.checkExtension("GL_EXT_geometry_shader", EXTGeometryShader.isAvailable(this));
		GL_EXT_gpu_shader5 = ext.contains("GL_EXT_gpu_shader5");
		GL_EXT_instanced_arrays = ext.contains("GL_EXT_instanced_arrays") && GLES.checkExtension("GL_EXT_instanced_arrays", EXTInstancedArrays.isAvailable(this));
		GL_EXT_map_buffer_range = ext.contains("GL_EXT_map_buffer_range") && GLES.checkExtension("GL_EXT_map_buffer_range", EXTMapBufferRange.isAvailable(this));
		GL_EXT_multi_draw_arrays = ext.contains("GL_EXT_multi_draw_arrays") && GLES.checkExtension("GL_EXT_multi_draw_arrays", EXTMultiDrawArrays.isAvailable(this));
		GL_EXT_multi_draw_indirect = ext.contains("GL_EXT_multi_draw_indirect") && GLES.checkExtension("GL_EXT_multi_draw_indirect", EXTMultiDrawIndirect.isAvailable(this));
		GL_EXT_multisample_compatibility = ext.contains("GL_EXT_multisample_compatibility");
		GL_EXT_multisampled_render_to_texture = ext.contains("GL_EXT_multisampled_render_to_texture") && GLES.checkExtension("GL_EXT_multisampled_render_to_texture", EXTMultisampledRenderToTexture.isAvailable(this));
		GL_EXT_multiview_draw_buffers = ext.contains("GL_EXT_multiview_draw_buffers") && GLES.checkExtension("GL_EXT_multiview_draw_buffers", EXTMultiviewDrawBuffers.isAvailable(this));
		GL_EXT_occlusion_query_boolean = ext.contains("GL_EXT_occlusion_query_boolean") && GLES.checkExtension("GL_EXT_occlusion_query_boolean", EXTOcclusionQueryBoolean.isAvailable(this));
		GL_EXT_polygon_offset_clamp = ext.contains("GL_EXT_polygon_offset_clamp") && GLES.checkExtension("GL_EXT_polygon_offset_clamp", EXTPolygonOffsetClamp.isAvailable(this));
		GL_EXT_post_depth_coverage = ext.contains("GL_EXT_post_depth_coverage");
		GL_EXT_primitive_bounding_box = ext.contains("GL_EXT_primitive_bounding_box") && GLES.checkExtension("GL_EXT_primitive_bounding_box", EXTPrimitiveBoundingBox.isAvailable(this));
		GL_EXT_protected_textures = ext.contains("GL_EXT_protected_textures");
		GL_EXT_pvrtc_sRGB = ext.contains("GL_EXT_pvrtc_sRGB");
		GL_EXT_raster_multisample = ext.contains("GL_EXT_raster_multisample") && GLES.checkExtension("GL_EXT_raster_multisample", EXTRasterMultisample.isAvailable(this));
		GL_EXT_read_format_bgra = ext.contains("GL_EXT_read_format_bgra");
		GL_EXT_render_snorm = ext.contains("GL_EXT_render_snorm");
		GL_EXT_robustness = ext.contains("GL_EXT_robustness") && GLES.checkExtension("GL_EXT_robustness", EXTRobustness.isAvailable(this));
		GL_EXT_separate_shader_objects = ext.contains("GL_EXT_separate_shader_objects") && GLES.checkExtension("GL_EXT_separate_shader_objects", EXTSeparateShaderObjects.isAvailable(this));
		GL_EXT_shader_framebuffer_fetch = ext.contains("GL_EXT_shader_framebuffer_fetch");
		GL_EXT_shader_group_vote = ext.contains("GL_EXT_shader_group_vote");
		GL_EXT_shader_implicit_conversions = ext.contains("GL_EXT_shader_implicit_conversions");
		GL_EXT_shader_integer_mix = ext.contains("GL_EXT_shader_integer_mix");
		GL_EXT_shader_io_blocks = ext.contains("GL_EXT_shader_io_blocks");
		GL_EXT_shader_pixel_local_storage = ext.contains("GL_EXT_shader_pixel_local_storage");
		GL_EXT_shader_pixel_local_storage2 = ext.contains("GL_EXT_shader_pixel_local_storage2") && GLES.checkExtension("GL_EXT_shader_pixel_local_storage2", EXTShaderPixelLocalStorage2.isAvailable(this));
		GL_EXT_shader_texture_lod = ext.contains("GL_EXT_shader_texture_lod");
		GL_EXT_shadow_samplers = ext.contains("GL_EXT_shadow_samplers");
		GL_EXT_sparse_texture = ext.contains("GL_EXT_sparse_texture") && GLES.checkExtension("GL_EXT_sparse_texture", EXTSparseTexture.isAvailable(this));
		GL_EXT_sparse_texture2 = ext.contains("GL_EXT_sparse_texture2");
		GL_EXT_sRGB = ext.contains("GL_EXT_sRGB");
		GL_EXT_sRGB_write_control = ext.contains("GL_EXT_sRGB_write_control");
		GL_EXT_tessellation_point_size = ext.contains("GL_EXT_tessellation_point_size");
		GL_EXT_tessellation_shader = ext.contains("GL_EXT_tessellation_shader") && GLES.checkExtension("GL_EXT_tessellation_shader", EXTTessellationShader.isAvailable(this));
		GL_EXT_texture_border_clamp = ext.contains("GL_EXT_texture_border_clamp") && GLES.checkExtension("GL_EXT_texture_border_clamp", EXTTextureBorderClamp.isAvailable(this));
		GL_EXT_texture_buffer = ext.contains("GL_EXT_texture_buffer") && GLES.checkExtension("GL_EXT_texture_buffer", EXTTextureBuffer.isAvailable(this));
		GL_EXT_texture_compression_dxt1 = ext.contains("GL_EXT_texture_compression_dxt1");
		GL_EXT_texture_compression_s3tc = ext.contains("GL_EXT_texture_compression_s3tc");
		GL_EXT_texture_cube_map_array = ext.contains("GL_EXT_texture_cube_map_array");
		GL_EXT_texture_filter_anisotropic = ext.contains("GL_EXT_texture_filter_anisotropic");
		GL_EXT_texture_filter_minmax = ext.contains("GL_EXT_texture_filter_minmax") && GLES.checkExtension("GL_EXT_texture_filter_minmax", EXTTextureFilterMinmax.isAvailable(this));
		GL_EXT_texture_format_BGRA8888 = ext.contains("GL_EXT_texture_format_BGRA8888");
		GL_EXT_texture_norm16 = ext.contains("GL_EXT_texture_norm16");
		GL_EXT_texture_rg = ext.contains("GL_EXT_texture_rg");
		GL_EXT_texture_sRGB_decode = ext.contains("GL_EXT_texture_sRGB_decode");
		GL_EXT_texture_sRGB_R8 = ext.contains("GL_EXT_texture_sRGB_R8");
		GL_EXT_texture_sRGB_RG8 = ext.contains("GL_EXT_texture_sRGB_RG8");
		GL_EXT_texture_storage = ext.contains("GL_EXT_texture_storage") && GLES.checkExtension("GL_EXT_texture_storage", EXTTextureStorage.isAvailable(this));
		GL_EXT_texture_type_2_10_10_10_REV = ext.contains("GL_EXT_texture_type_2_10_10_10_REV");
		GL_EXT_texture_view = ext.contains("GL_EXT_texture_view") && GLES.checkExtension("GL_EXT_texture_view", EXTTextureView.isAvailable(this));
		GL_EXT_unpack_subimage = ext.contains("GL_EXT_unpack_subimage");
		GL_EXT_YUV_target = ext.contains("GL_EXT_YUV_target");
		GL_FJ_shader_binary_GCCSO = ext.contains("GL_FJ_shader_binary_GCCSO");
		GL_IMG_framebuffer_downsample = ext.contains("GL_IMG_framebuffer_downsample") && GLES.checkExtension("GL_IMG_framebuffer_downsample", IMGFramebufferDownsample.isAvailable(this));
		GL_IMG_multisampled_render_to_texture = ext.contains("GL_IMG_multisampled_render_to_texture") && GLES.checkExtension("GL_IMG_multisampled_render_to_texture", IMGMultisampledRenderToTexture.isAvailable(this));
		GL_IMG_program_binary = ext.contains("GL_IMG_program_binary");
		GL_IMG_read_format = ext.contains("GL_IMG_read_format");
		GL_IMG_shader_binary = ext.contains("GL_IMG_shader_binary");
		GL_IMG_texture_compression_pvrtc = ext.contains("GL_IMG_texture_compression_pvrtc");
		GL_IMG_texture_compression_pvrtc2 = ext.contains("GL_IMG_texture_compression_pvrtc2");
		GL_IMG_texture_filter_cubic = ext.contains("GL_IMG_texture_filter_cubic");
		GL_INTEL_framebuffer_CMAA = ext.contains("GL_INTEL_framebuffer_CMAA") && GLES.checkExtension("GL_INTEL_framebuffer_CMAA", INTELFramebufferCMAA.isAvailable(this));
		GL_INTEL_performance_query = ext.contains("GL_INTEL_performance_query") && GLES.checkExtension("GL_INTEL_performance_query", INTELPerformanceQuery.isAvailable(this));
		GL_KHR_blend_equation_advanced = ext.contains("GL_KHR_blend_equation_advanced") && GLES.checkExtension("GL_KHR_blend_equation_advanced", KHRBlendEquationAdvanced.isAvailable(this));
		GL_KHR_blend_equation_advanced_coherent = ext.contains("GL_KHR_blend_equation_advanced_coherent");
		GL_KHR_context_flush_control = ext.contains("GL_KHR_context_flush_control");
		GL_KHR_debug = ext.contains("GL_KHR_debug") && GLES.checkExtension("GL_KHR_debug", KHRDebug.isAvailable(this));
		GL_KHR_no_error = ext.contains("GL_KHR_no_error");
		GL_KHR_robust_buffer_access_behavior = ext.contains("GL_KHR_robust_buffer_access_behavior");
		GL_KHR_robustness = ext.contains("GL_KHR_robustness") && GLES.checkExtension("GL_KHR_robustness", KHRRobustness.isAvailable(this));
		GL_KHR_texture_compression_astc_hdr = ext.contains("GL_KHR_texture_compression_astc_hdr");
		GL_KHR_texture_compression_astc_ldr = ext.contains("GL_KHR_texture_compression_astc_ldr");
		GL_KHR_texture_compression_astc_sliced_3d = ext.contains("GL_KHR_texture_compression_astc_sliced_3d");
		GL_NV_bindless_texture = ext.contains("GL_NV_bindless_texture") && GLES.checkExtension("GL_NV_bindless_texture", NVBindlessTexture.isAvailable(this));
		GL_NV_blend_equation_advanced = ext.contains("GL_NV_blend_equation_advanced") && GLES.checkExtension("GL_NV_blend_equation_advanced", NVBlendEquationAdvanced.isAvailable(this));
		GL_NV_blend_equation_advanced_coherent = ext.contains("GL_NV_blend_equation_advanced_coherent");
		GL_NV_conditional_render = ext.contains("GL_NV_conditional_render") && GLES.checkExtension("GL_NV_conditional_render", NVConditionalRender.isAvailable(this));
		GL_NV_conservative_raster = ext.contains("GL_NV_conservative_raster") && GLES.checkExtension("GL_NV_conservative_raster", NVConservativeRaster.isAvailable(this));
		GL_NV_conservative_raster_pre_snap_triangles = ext.contains("GL_NV_conservative_raster_pre_snap_triangles") && GLES.checkExtension("GL_NV_conservative_raster_pre_snap_triangles", NVConservativeRasterPreSnapTriangles.isAvailable(this));
		GL_NV_copy_buffer = ext.contains("GL_NV_copy_buffer") && GLES.checkExtension("GL_NV_copy_buffer", NVCopyBuffer.isAvailable(this));
		GL_NV_coverage_sample = ext.contains("GL_NV_coverage_sample") && GLES.checkExtension("GL_NV_coverage_sample", NVCoverageSample.isAvailable(this));
		GL_NV_depth_nonlinear = ext.contains("GL_NV_depth_nonlinear");
		GL_NV_draw_buffers = ext.contains("GL_NV_draw_buffers") && GLES.checkExtension("GL_NV_draw_buffers", NVDrawBuffers.isAvailable(this));
		GL_NV_draw_instanced = ext.contains("GL_NV_draw_instanced") && GLES.checkExtension("GL_NV_draw_instanced", NVDrawInstanced.isAvailable(this));
		GL_NV_explicit_attrib_location = ext.contains("GL_NV_explicit_attrib_location");
		GL_NV_fbo_color_attachments = ext.contains("GL_NV_fbo_color_attachments");
		GL_NV_fence = ext.contains("GL_NV_fence") && GLES.checkExtension("GL_NV_fence", NVFence.isAvailable(this));
		GL_NV_fill_rectangle = ext.contains("GL_NV_fill_rectangle");
		GL_NV_fragment_coverage_to_color = ext.contains("GL_NV_fragment_coverage_to_color") && GLES.checkExtension("GL_NV_fragment_coverage_to_color", NVFragmentCoverageToColor.isAvailable(this));
		GL_NV_fragment_shader_interlock = ext.contains("GL_NV_fragment_shader_interlock");
		GL_NV_framebuffer_blit = ext.contains("GL_NV_framebuffer_blit") && GLES.checkExtension("GL_NV_framebuffer_blit", NVFramebufferBlit.isAvailable(this));
		GL_NV_framebuffer_mixed_samples = ext.contains("GL_NV_framebuffer_mixed_samples") && GLES.checkExtension("GL_NV_framebuffer_mixed_samples", NVFramebufferMixedSamples.isAvailable(this));
		GL_NV_framebuffer_multisample = ext.contains("GL_NV_framebuffer_multisample") && GLES.checkExtension("GL_NV_framebuffer_multisample", NVFramebufferMultisample.isAvailable(this));
		GL_NV_generate_mipmap_sRGB = ext.contains("GL_NV_generate_mipmap_sRGB");
		GL_NV_geometry_shader_passthrough = ext.contains("GL_NV_geometry_shader_passthrough");
		GL_NV_gpu_shader5 = ext.contains("GL_NV_gpu_shader5") && GLES.checkExtension("GL_NV_gpu_shader5", NVGPUShader5.isAvailable(this));
		GL_NV_image_formats = ext.contains("GL_NV_image_formats");
		GL_NV_instanced_arrays = ext.contains("GL_NV_instanced_arrays") && GLES.checkExtension("GL_NV_instanced_arrays", NVInstancedArrays.isAvailable(this));
		GL_NV_internalformat_sample_query = ext.contains("GL_NV_internalformat_sample_query") && GLES.checkExtension("GL_NV_internalformat_sample_query", NVInternalformatSampleQuery.isAvailable(this));
		GL_NV_non_square_matrices = ext.contains("GL_NV_non_square_matrices") && GLES.checkExtension("GL_NV_non_square_matrices", NVNonSquareMatrices.isAvailable(this));
		GL_NV_path_rendering = ext.contains("GL_NV_path_rendering") && GLES.checkExtension("GL_NV_path_rendering", NVPathRendering.isAvailable(this));
		GL_NV_path_rendering_shared_edge = ext.contains("GL_NV_path_rendering_shared_edge");
		GL_NV_polygon_mode = ext.contains("GL_NV_polygon_mode") && GLES.checkExtension("GL_NV_polygon_mode", NVPolygonMode.isAvailable(this));
		GL_NV_read_buffer = ext.contains("GL_NV_read_buffer") && GLES.checkExtension("GL_NV_read_buffer", NVReadBuffer.isAvailable(this));
		GL_NV_read_buffer_front = ext.contains("GL_NV_read_buffer_front");
		GL_NV_read_depth = ext.contains("GL_NV_read_depth");
		GL_NV_read_depth_stencil = ext.contains("GL_NV_read_depth_stencil");
		GL_NV_read_stencil = ext.contains("GL_NV_read_stencil");
		GL_NV_sample_locations = ext.contains("GL_NV_sample_locations") && GLES.checkExtension("GL_NV_sample_locations", NVSampleLocations.isAvailable(this));
		GL_NV_sample_mask_override_coverage = ext.contains("GL_NV_sample_mask_override_coverage");
		GL_NV_shader_atomic_fp16_vector = ext.contains("GL_NV_shader_atomic_fp16_vector");
		GL_NV_shader_noperspective_interpolation = ext.contains("GL_NV_shader_noperspective_interpolation");
		GL_NV_shadow_samplers_array = ext.contains("GL_NV_shadow_samplers_array");
		GL_NV_shadow_samplers_cube = ext.contains("GL_NV_shadow_samplers_cube");
		GL_NV_sRGB_formats = ext.contains("GL_NV_sRGB_formats");
		GL_NV_texture_array = ext.contains("GL_NV_texture_array") && GLES.checkExtension("GL_NV_texture_array", NVTextureArray.isAvailable(this));
		GL_NV_texture_border_clamp = ext.contains("GL_NV_texture_border_clamp");
		GL_NV_texture_compression_s3tc = ext.contains("GL_NV_texture_compression_s3tc");
		GL_NV_texture_compression_s3tc_update = ext.contains("GL_NV_texture_compression_s3tc_update");
		GL_NV_texture_npot_2D_mipmap = ext.contains("GL_NV_texture_npot_2D_mipmap");
		GL_NV_viewport_array = ext.contains("GL_NV_viewport_array") && GLES.checkExtension("GL_NV_viewport_array", NVViewportArray.isAvailable(this));
		GL_NV_viewport_array2 = ext.contains("GL_NV_viewport_array2");
		GL_NV_viewport_swizzle = ext.contains("GL_NV_viewport_swizzle") && GLES.checkExtension("GL_NV_viewport_swizzle", NVViewportSwizzle.isAvailable(this));
		GL_OES_compressed_ETC1_RGB8_sub_texture = ext.contains("GL_OES_compressed_ETC1_RGB8_sub_texture");
		GL_OES_compressed_ETC1_RGB8_texture = ext.contains("GL_OES_compressed_ETC1_RGB8_texture");
		GL_OES_compressed_paletted_texture = ext.contains("GL_OES_compressed_paletted_texture");
		GL_OES_copy_image = ext.contains("GL_OES_copy_image") && GLES.checkExtension("GL_OES_copy_image", OESCopyImage.isAvailable(this));
		GL_OES_depth24 = ext.contains("GL_OES_depth24");
		GL_OES_depth32 = ext.contains("GL_OES_depth32");
		GL_OES_depth_texture = ext.contains("GL_OES_depth_texture");
		GL_OES_depth_texture_cube_map = ext.contains("GL_OES_depth_texture_cube_map");
		GL_OES_draw_buffers_indexed = ext.contains("GL_OES_draw_buffers_indexed") && GLES.checkExtension("GL_OES_draw_buffers_indexed", OESDrawBuffersIndexed.isAvailable(this));
		GL_OES_draw_elements_base_vertex = ext.contains("GL_OES_draw_elements_base_vertex") && GLES.checkExtension("GL_OES_draw_elements_base_vertex", OESDrawElementsBaseVertex.isAvailable(this, ext));
		GL_OES_EGL_image = ext.contains("GL_OES_EGL_image") && GLES.checkExtension("GL_OES_EGL_image", OESEGLImage.isAvailable(this));
		GL_OES_EGL_image_external = ext.contains("GL_OES_EGL_image_external");
		GL_OES_EGL_image_external_essl3 = ext.contains("GL_OES_EGL_image_external_essl3");
		GL_OES_element_index_uint = ext.contains("GL_OES_element_index_uint");
		GL_OES_fbo_render_mipmap = ext.contains("GL_OES_fbo_render_mipmap");
		GL_OES_geometry_point_size = ext.contains("GL_OES_geometry_point_size");
		GL_OES_geometry_shader = ext.contains("GL_OES_geometry_shader") && GLES.checkExtension("GL_OES_geometry_shader", OESGeometryShader.isAvailable(this));
		GL_OES_get_program_binary = ext.contains("GL_OES_get_program_binary") && GLES.checkExtension("GL_OES_get_program_binary", OESGetProgramBinary.isAvailable(this));
		GL_OES_gpu_shader5 = ext.contains("GL_OES_gpu_shader5");
		GL_OES_mapbuffer = ext.contains("GL_OES_mapbuffer") && GLES.checkExtension("GL_OES_mapbuffer", OESMapbuffer.isAvailable(this));
		GL_OES_packed_depth_stencil = ext.contains("GL_OES_packed_depth_stencil");
		GL_OES_primitive_bounding_box = ext.contains("GL_OES_primitive_bounding_box") && GLES.checkExtension("GL_OES_primitive_bounding_box", OESPrimitiveBoundingBox.isAvailable(this));
		GL_OES_required_internalformat = ext.contains("GL_OES_required_internalformat");
		GL_OES_rgb8_rgba8 = ext.contains("GL_OES_rgb8_rgba8");
		GL_OES_sample_shading = ext.contains("GL_OES_sample_shading") && GLES.checkExtension("GL_OES_sample_shading", OESSampleShading.isAvailable(this));
		GL_OES_sample_variables = ext.contains("GL_OES_sample_variables");
		GL_OES_shader_image_atomic = ext.contains("GL_OES_shader_image_atomic");
		GL_OES_shader_io_blocks = ext.contains("GL_OES_shader_io_blocks");
		GL_OES_shader_multisample_interpolation = ext.contains("GL_OES_shader_multisample_interpolation");
		GL_OES_standard_derivatives = ext.contains("GL_OES_standard_derivatives");
		GL_OES_stencil1 = ext.contains("GL_OES_stencil1");
		GL_OES_stencil4 = ext.contains("GL_OES_stencil4");
		GL_OES_stencil8 = ext.contains("GL_OES_stencil8");
		GL_OES_surfaceless_context = ext.contains("GL_OES_surfaceless_context");
		GL_OES_tessellation_point_size = ext.contains("GL_OES_tessellation_point_size");
		GL_OES_tessellation_shader = ext.contains("GL_OES_tessellation_shader") && GLES.checkExtension("GL_OES_tessellation_shader", OESTessellationShader.isAvailable(this));
		GL_OES_texture_3D = ext.contains("GL_OES_texture_3D") && GLES.checkExtension("GL_OES_texture_3D", OESTexture3D.isAvailable(this));
		GL_OES_texture_border_clamp = ext.contains("GL_OES_texture_border_clamp") && GLES.checkExtension("GL_OES_texture_border_clamp", OESTextureBorderClamp.isAvailable(this));
		GL_OES_texture_buffer = ext.contains("GL_OES_texture_buffer") && GLES.checkExtension("GL_OES_texture_buffer", OESTextureBuffer.isAvailable(this));
		GL_OES_texture_compression_astc = ext.contains("GL_OES_texture_compression_astc");
		GL_OES_texture_cube_map_array = ext.contains("GL_OES_texture_cube_map_array");
		GL_OES_texture_float = ext.contains("GL_OES_texture_float");
		GL_OES_texture_float_linear = ext.contains("GL_OES_texture_float_linear");
		GL_OES_texture_half_float = ext.contains("GL_OES_texture_half_float");
		GL_OES_texture_half_float_linear = ext.contains("GL_OES_texture_half_float_linear");
		GL_OES_texture_npot = ext.contains("GL_OES_texture_npot");
		GL_OES_texture_stencil8 = ext.contains("GL_OES_texture_stencil8");
		GL_OES_texture_storage_multisample_2d_array = ext.contains("GL_OES_texture_storage_multisample_2d_array") && GLES.checkExtension("GL_OES_texture_storage_multisample_2d_array", OESTextureStorageMultisample2DArray.isAvailable(this));
		GL_OES_texture_view = ext.contains("GL_OES_texture_view") && GLES.checkExtension("GL_OES_texture_view", OESTextureView.isAvailable(this));
		GL_OES_vertex_array_object = ext.contains("GL_OES_vertex_array_object") && GLES.checkExtension("GL_OES_vertex_array_object", OESVertexArrayObject.isAvailable(this));
		GL_OES_vertex_half_float = ext.contains("GL_OES_vertex_half_float");
		GL_OES_vertex_type_10_10_10_2 = ext.contains("GL_OES_vertex_type_10_10_10_2");
		GL_OVR_multiview = ext.contains("GL_OVR_multiview") && GLES.checkExtension("GL_OVR_multiview", OVRMultiview.isAvailable(this));
		GL_OVR_multiview2 = ext.contains("GL_OVR_multiview2");
		GL_OVR_multiview_multisampled_render_to_texture = ext.contains("GL_OVR_multiview_multisampled_render_to_texture") && GLES.checkExtension("GL_OVR_multiview_multisampled_render_to_texture", OVRMultiviewMultisampledRenderToTexture.isAvailable(this));
		GL_QCOM_alpha_test = ext.contains("GL_QCOM_alpha_test") && GLES.checkExtension("GL_QCOM_alpha_test", QCOMAlphaTest.isAvailable(this));
		GL_QCOM_binning_control = ext.contains("GL_QCOM_binning_control");
		GL_QCOM_driver_control = ext.contains("GL_QCOM_driver_control") && GLES.checkExtension("GL_QCOM_driver_control", QCOMDriverControl.isAvailable(this));
		GL_QCOM_extended_get = ext.contains("GL_QCOM_extended_get") && GLES.checkExtension("GL_QCOM_extended_get", QCOMExtendedGet.isAvailable(this));
		GL_QCOM_extended_get2 = ext.contains("GL_QCOM_extended_get2") && GLES.checkExtension("GL_QCOM_extended_get2", QCOMExtendedGet2.isAvailable(this));
		GL_QCOM_perfmon_global_mode = ext.contains("GL_QCOM_perfmon_global_mode");
		GL_QCOM_tiled_rendering = ext.contains("GL_QCOM_tiled_rendering") && GLES.checkExtension("GL_QCOM_tiled_rendering", QCOMTiledRendering.isAvailable(this));
		GL_QCOM_writeonly_rendering = ext.contains("GL_QCOM_writeonly_rendering");
		GL_VIV_shader_binary = ext.contains("GL_VIV_shader_binary");
	}
}