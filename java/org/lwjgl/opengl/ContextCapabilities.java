/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;
import java.util.Set;

/** Defines the capabilities of an OpenGL context. */
public final class ContextCapabilities {

	final GL11                             __GL11;
	final GL12                             __GL12;
	final GL13                             __GL13;
	final GL14                             __GL14;
	final GL15                             __GL15;
	final GL20                             __GL20;
	final GL21                             __GL21;
	final GL30                             __GL30;
	final GL31                             __GL31;
	final GL32                             __GL32;
	final GL33                             __GL33;
	final GL40                             __GL40;
	final GL41                             __GL41;
	final GL42                             __GL42;
	final GL43                             __GL43;
	final GL44                             __GL44;
	final GL45                             __GL45;
	final GLX11                            __GLX11;
	final GLX12                            __GLX12;
	final GLX13                            __GLX13;
	final GLX14                            __GLX14;
	final GLXAMDGPUAssociation             __GLXAMDGPUAssociation;
	final GLXARBCreateContext              __GLXARBCreateContext;
	final GLXARBGetProcAddress             __GLXARBGetProcAddress;
	final GLXEXTImportContext              __GLXEXTImportContext;
	final GLXEXTSwapControl                __GLXEXTSwapControl;
	final GLXEXTTextureFromPixmap          __GLXEXTTextureFromPixmap;
	final GLXNVCopyImage                   __GLXNVCopyImage;
	final GLXNVDelayBeforeSwap             __GLXNVDelayBeforeSwap;
	final GLXSGIMakeCurrentRead            __GLXSGIMakeCurrentRead;
	final GLXSGISwapControl                __GLXSGISwapControl;
	final GLXSGIVideoSync                  __GLXSGIVideoSync;
	final GLXSGIXFBConfig                  __GLXSGIXFBConfig;
	final GLXSGIXPBuffer                   __GLXSGIXPBuffer;
	final GLXSGIXSwapBarrier               __GLXSGIXSwapBarrier;
	final GLXSGIXSwapGroup                 __GLXSGIXSwapGroup;
	final AMDDebugOutput                   __AMDDebugOutput;
	final AMDOcclusionQueryEvent           __AMDOcclusionQueryEvent;
	final ARBBaseInstance                  __ARBBaseInstance;
	final ARBBindlessTexture               __ARBBindlessTexture;
	final ARBBlendFuncExtended             __ARBBlendFuncExtended;
	final ARBBufferStorage                 __ARBBufferStorage;
	final ARBCLEvent                       __ARBCLEvent;
	final ARBClearBufferObject             __ARBClearBufferObject;
	final ARBClearTexture                  __ARBClearTexture;
	final ARBClipControl                   __ARBClipControl;
	final ARBColorBufferFloat              __ARBColorBufferFloat;
	final ARBComputeShader                 __ARBComputeShader;
	final ARBComputeVariableGroupSize      __ARBComputeVariableGroupSize;
	final ARBCopyBuffer                    __ARBCopyBuffer;
	final ARBCopyImage                     __ARBCopyImage;
	final ARBDebugOutput                   __ARBDebugOutput;
	final ARBDirectStateAccess             __ARBDirectStateAccess;
	final ARBDrawBuffers                   __ARBDrawBuffers;
	final ARBDrawBuffersBlend              __ARBDrawBuffersBlend;
	final ARBDrawElementsBaseVertex        __ARBDrawElementsBaseVertex;
	final ARBDrawIndirect                  __ARBDrawIndirect;
	final ARBDrawInstanced                 __ARBDrawInstanced;
	final ARBES2Compatibility              __ARBES2Compatibility;
	final ARBES31Compatibility             __ARBES31Compatibility;
	final ARBFramebufferNoAttachments      __ARBFramebufferNoAttachments;
	final ARBFramebufferObject             __ARBFramebufferObject;
	final ARBGeometryShader4               __ARBGeometryShader4;
	final ARBGetProgramBinary              __ARBGetProgramBinary;
	final ARBGetTextureSubImage            __ARBGetTextureSubImage;
	final ARBGPUShaderFP64                 __ARBGPUShaderFP64;
	final ARBImaging                       __ARBImaging;
	final ARBIndirectParameters            __ARBIndirectParameters;
	final ARBInstancedArrays               __ARBInstancedArrays;
	final ARBInternalformatQuery           __ARBInternalformatQuery;
	final ARBInternalformatQuery2          __ARBInternalformatQuery2;
	final ARBInvalidateSubdata             __ARBInvalidateSubdata;
	final ARBMapBufferRange                __ARBMapBufferRange;
	final ARBMatrixPalette                 __ARBMatrixPalette;
	final ARBMultiBind                     __ARBMultiBind;
	final ARBMultiDrawIndirect             __ARBMultiDrawIndirect;
	final ARBMultisample                   __ARBMultisample;
	final ARBMultitexture                  __ARBMultitexture;
	final ARBOcclusionQuery                __ARBOcclusionQuery;
	final ARBPointParameters               __ARBPointParameters;
	final ARBProgramInterfaceQuery         __ARBProgramInterfaceQuery;
	final ARBProvokingVertex               __ARBProvokingVertex;
	final ARBRobustness                    __ARBRobustness;
	final ARBSampleShading                 __ARBSampleShading;
	final ARBSamplerObjects                __ARBSamplerObjects;
	final ARBSeparateShaderObjects         __ARBSeparateShaderObjects;
	final ARBShaderAtomicCounters          __ARBShaderAtomicCounters;
	final ARBShaderImageLoadStore          __ARBShaderImageLoadStore;
	final ARBShaderObjects                 __ARBShaderObjects;
	final ARBShaderStorageBufferObject     __ARBShaderStorageBufferObject;
	final ARBShaderSubroutine              __ARBShaderSubroutine;
	final ARBShadingLanguageInclude        __ARBShadingLanguageInclude;
	final ARBSparseBuffer                  __ARBSparseBuffer;
	final ARBSparseTexture                 __ARBSparseTexture;
	final ARBSync                          __ARBSync;
	final ARBTessellationShader            __ARBTessellationShader;
	final ARBTextureBarrier                __ARBTextureBarrier;
	final ARBTextureBufferObject           __ARBTextureBufferObject;
	final ARBTextureBufferRange            __ARBTextureBufferRange;
	final ARBTextureCompression            __ARBTextureCompression;
	final ARBTextureMultisample            __ARBTextureMultisample;
	final ARBTextureStorage                __ARBTextureStorage;
	final ARBTextureStorageMultisample     __ARBTextureStorageMultisample;
	final ARBTextureView                   __ARBTextureView;
	final ARBTimerQuery                    __ARBTimerQuery;
	final ARBTransformFeedback2            __ARBTransformFeedback2;
	final ARBTransformFeedback3            __ARBTransformFeedback3;
	final ARBTransformFeedbackInstanced    __ARBTransformFeedbackInstanced;
	final ARBTransposeMatrix               __ARBTransposeMatrix;
	final ARBUniformBufferObject           __ARBUniformBufferObject;
	final ARBVertexArrayObject             __ARBVertexArrayObject;
	final ARBVertexAttrib64Bit             __ARBVertexAttrib64Bit;
	final ARBVertexAttribBinding           __ARBVertexAttribBinding;
	final ARBVertexBlend                   __ARBVertexBlend;
	final ARBVertexBufferObject            __ARBVertexBufferObject;
	final ARBVertexProgram                 __ARBVertexProgram;
	final ARBVertexShader                  __ARBVertexShader;
	final ARBVertexType2_10_10_10_REV      __ARBVertexType2_10_10_10_REV;
	final ARBViewportArray                 __ARBViewportArray;
	final ARBWindowPos                     __ARBWindowPos;
	final EXTBindableUniform               __EXTBindableUniform;
	final EXTBlendColor                    __EXTBlendColor;
	final EXTBlendEquationSeparate         __EXTBlendEquationSeparate;
	final EXTBlendFuncSeparate             __EXTBlendFuncSeparate;
	final EXTBlendMinmax                   __EXTBlendMinmax;
	final EXTDebugLabel                    __EXTDebugLabel;
	final EXTDebugMarker                   __EXTDebugMarker;
	final EXTDepthBoundsTest               __EXTDepthBoundsTest;
	final EXTDirectStateAccess             __EXTDirectStateAccess;
	final EXTFramebufferBlit               __EXTFramebufferBlit;
	final EXTFramebufferMultisample        __EXTFramebufferMultisample;
	final EXTFramebufferObject             __EXTFramebufferObject;
	final EXTPointParameters               __EXTPointParameters;
	final EXTPolygonOffsetClamp            __EXTPolygonOffsetClamp;
	final EXTRasterMultisample             __EXTRasterMultisample;
	final EXTSecondaryColor                __EXTSecondaryColor;
	final EXTShaderImageLoadStore          __EXTShaderImageLoadStore;
	final EXTTextureArray                  __EXTTextureArray;
	final EXTTextureInteger                __EXTTextureInteger;
	final EXTTransformFeedback             __EXTTransformFeedback;
	final EXTVertexAttrib64bit             __EXTVertexAttrib64bit;
	final EXTX11SyncObject                 __EXTX11SyncObject;
	final KHRBlendEquationAdvanced         __KHRBlendEquationAdvanced;
	final KHRDebug                         __KHRDebug;
	final KHRRobustness                    __KHRRobustness;
	final NVBindlessMultiDrawIndirect      __NVBindlessMultiDrawIndirect;
	final NVBindlessMultiDrawIndirectCount __NVBindlessMultiDrawIndirectCount;
	final NVBindlessTexture                __NVBindlessTexture;
	final NVBlendEquationAdvanced          __NVBlendEquationAdvanced;
	final NVCommandList                    __NVCommandList;
	final NVConditionalRender              __NVConditionalRender;
	final NVConservativeRaster             __NVConservativeRaster;
	final NVCopyImage                      __NVCopyImage;
	final NVDrawTexture                    __NVDrawTexture;
	final NVFragmentCoverageToColor        __NVFragmentCoverageToColor;
	final NVFramebufferMixedSamples        __NVFramebufferMixedSamples;
	final NVInternalformatSampleQuery      __NVInternalformatSampleQuery;
	final NVPathRenderingSharedEdge        __NVPathRenderingSharedEdge;
	final NVPointSprite                    __NVPointSprite;
	final NVSampleLocations                __NVSampleLocations;
	final NVShaderBufferLoad               __NVShaderBufferLoad;
	final NVTextureBarrier                 __NVTextureBarrier;
	final NVTextureMultisample             __NVTextureMultisample;
	final NVVertexArrayRange               __NVVertexArrayRange;
	final NVVertexBufferUnifiedMemory      __NVVertexBufferUnifiedMemory;
	final NVXConditionalRender             __NVXConditionalRender;
	final OVRMultiview                     __OVRMultiview;
	final WGLAMDGPUAssociation             __WGLAMDGPUAssociation;
	final WGLARBBufferRegion               __WGLARBBufferRegion;
	final WGLARBCreateContext              __WGLARBCreateContext;
	final WGLARBExtensionsString           __WGLARBExtensionsString;
	final WGLARBMakeCurrentRead            __WGLARBMakeCurrentRead;
	final WGLARBPbuffer                    __WGLARBPbuffer;
	final WGLARBPixelFormat                __WGLARBPixelFormat;
	final WGLARBRenderTexture              __WGLARBRenderTexture;
	final WGLEXTExtensionsString           __WGLEXTExtensionsString;
	final WGLEXTSwapControl                __WGLEXTSwapControl;
	final WGLNVCopyImage                   __WGLNVCopyImage;
	final WGLNVDelayBeforeSwap             __WGLNVDelayBeforeSwap;
	final WGLNVDXInterop                   __WGLNVDXInterop;
	final WGLNVGPUAffinity                 __WGLNVGPUAffinity;

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
	/** When true, {@link GLX11} is supported. */
	public final boolean GLX_11;
	/** When true, {@link GLX12} is supported. */
	public final boolean GLX_12;
	/** When true, {@link GLX13} is supported. */
	public final boolean GLX_13;
	/** When true, {@link GLX14} is supported. */
	public final boolean GLX_14;
	/** When true, {@link GLXAMDGPUAssociation} is supported. */
	public final boolean GLX_AMD_gpu_association;
	/** When true, {@link GLXARBContextFlushControl} is supported. */
	public final boolean GLX_ARB_context_flush_control;
	/** When true, {@link GLXARBCreateContext} is supported. */
	public final boolean GLX_ARB_create_context;
	/** When true, {@link GLXARBCreateContextProfile} is supported. */
	public final boolean GLX_ARB_create_context_profile;
	/** When true, {@link GLXARBCreateContextRobustness} is supported. */
	public final boolean GLX_ARB_create_context_robustness;
	/** When true, {@link GLXARBFBConfigFloat} is supported. */
	public final boolean GLX_ARB_fbconfig_float;
	/** When true, {@link GLXARBFramebufferSRGB} is supported. */
	public final boolean GLX_ARB_framebuffer_sRGB;
	/** When true, {@link GLXARBGetProcAddress} is supported. */
	public final boolean GLX_ARB_get_proc_address;
	/** When true, {@link GLXARBMultisample} is supported. */
	public final boolean GLX_ARB_multisample;
	/** When true, {@link GLXARBRobustnessApplicationIsolation} is supported. */
	public final boolean GLX_ARB_robustness_application_isolation;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/glx_robustness_isolation.txt">GLX_ARB_robustness_share_group_isolation</a> extension is supported.
	 * 
	 * <p>If the graphics driver advertises the GLX_ARB_robustness_share_group_isolation extension string, then the driver guarantees that if a context in a
	 * particular share group causes a graphics reset to occur:
	 * <ol>
	 * <li>No other share group within the application, nor any other application on the system, is affected by the graphics reset.</li>
	 * <li>No other share group within the application, nor any other application on the system, receives any notification that the graphics reset occurred.</li>
	 * </ol>
	 * Requires {@link GLX14 GLX 1.4} and {@link GLXARBCreateContextRobustness GLX_ARB_create_context_robustness}.</p>
	 */
	public final boolean GLX_ARB_robustness_share_group_isolation;
	/** When true, {@link GLXARBVertexBufferObject} is supported. */
	public final boolean GLX_ARB_vertex_buffer_object;
	/** When true, {@link GLXEXTBufferAge} is supported. */
	public final boolean GLX_EXT_buffer_age;
	/** When true, {@link GLXEXTCreateContextESProfile} is supported. */
	public final boolean GLX_EXT_create_context_es_profile;
	/** When true, {@link GLXEXTFBConfigPackedFloat} is supported. */
	public final boolean GLX_EXT_fbconfig_packed_float;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/EXT/framebuffer_sRGB.txt">GLX_EXT_framebuffer_sRGB</a> extension is supported.
	 * 
	 * <p>This extension adds a framebuffer capability for sRGB framebuffer update and blending.</p>
	 */
	public final boolean GLX_EXT_framebuffer_sRGB;
	/** When true, {@link GLXEXTImportContext} is supported. */
	public final boolean GLX_EXT_import_context;
	/** When true, {@link GLXEXTStereoTree} is supported. */
	public final boolean GLX_EXT_stereo_tree;
	/** When true, {@link GLXEXTSwapControl} is supported. */
	public final boolean GLX_EXT_swap_control;
	/** When true, {@link GLXEXTSwapControlTear} is supported. */
	public final boolean GLX_EXT_swap_control_tear;
	/** When true, {@link GLXEXTTextureFromPixmap} is supported. */
	public final boolean GLX_EXT_texture_from_pixmap;
	/** When true, {@link GLXEXTVisualInfo} is supported. */
	public final boolean GLX_EXT_visual_info;
	/** When true, {@link GLXEXTVisualRating} is supported. */
	public final boolean GLX_EXT_visual_rating;
	/** When true, {@link GLXINTELSwapEvent} is supported. */
	public final boolean GLX_INTEL_swap_event;
	/** When true, {@link GLXNVCopyImage} is supported. */
	public final boolean GLX_NV_copy_image;
	/** When true, {@link GLXNVDelayBeforeSwap} is supported. */
	public final boolean GLX_NV_delay_before_swap;
	/** When true, {@link GLXSGIMakeCurrentRead} is supported. */
	public final boolean GLX_SGI_make_current_read;
	/** When true, {@link GLXSGISwapControl} is supported. */
	public final boolean GLX_SGI_swap_control;
	/** When true, {@link GLXSGIVideoSync} is supported. */
	public final boolean GLX_SGI_video_sync;
	/** When true, {@link GLXSGIXFBConfig} is supported. */
	public final boolean GLX_SGIX_fbconfig;
	/** When true, {@link GLXSGIXPBuffer} is supported. */
	public final boolean GLX_SGIX_pbuffer;
	/** When true, {@link GLXSGIXSwapBarrier} is supported. */
	public final boolean GLX_SGIX_swap_barrier;
	/** When true, {@link GLXSGIXSwapGroup} is supported. */
	public final boolean GLX_SGIX_swap_group;
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
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/gpu_shader_int64.txt">AMD_gpu_shader_int64</a> extension is supported.
	 * 
	 * <p>This extension was developed based on the {@link #GL_NV_gpu_shader5 NV_gpu_shader5} extension to allow implementations supporting 64-bit integers to expose the feature
	 * without the additional requirements that are present in {@link #GL_NV_gpu_shader5 NV_gpu_shader5}.</p>
	 * 
	 * <p>Requires {@link GL40 OpenGL 4.0} and GLSL 4.00.</p>
	 */
	public final boolean GL_AMD_gpu_shader_int64;
	/** When true, {@link AMDOcclusionQueryEvent} is supported. */
	public final boolean GL_AMD_occlusion_query_event;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/shader_atomic_counter_ops.txt">AMD_shader_atomic_counter_ops</a> extension is supported.
	 * 
	 * <p>This extension is written against the OpenGL 4.3 (core) specification and the GLSL 4.30.7 specification.</p>
	 * 
	 * <p>Requires {@link GL42 OpenGL 4.2} or {@link #GL_ARB_shader_atomic_counters ARB_shader_atomic_counters}.</p>
	 */
	public final boolean GL_AMD_shader_atomic_counter_ops;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/shader_stencil_export.txt">AMD_shader_stencil_export</a> extension is supported.
	 * 
	 * <p>In OpenGL, the stencil test is a powerful mechanism to selectively discard fragments based on the content of the stencil buffer. However, facilites to
	 * update the content of the stencil buffer are limited to operations such as incrementing the existing value, or overwriting with a fixed reference value.</p>
	 * 
	 * <p>This extension provides a mechanism whereby a shader may generate the stencil reference value per invocation. When stencil testing is enabled, this
	 * allows the test to be performed against the value generated in the shader. When the stencil operation is set to {@link GL11#GL_REPLACE REPLACE}, this
	 * allows a value generated in the shader to be written to the stencil buffer directly.</p>
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
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/texture_texture4.txt">AMD_texture_texture4</a> extension is supported.
	 * 
	 * <p>This extension adds new shading language built-in texture functions to the shading language.</p>
	 * 
	 * <p>These texture functions may be used to access one component textures.</p>
	 * 
	 * <p>The {@code texture4} built-in function returns a texture value derived from a 2x2 set of texels in the image array of level levelbase is selected. These
	 * texels are selected in the same way as when the value of {@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER} is {@link GL11#GL_LINEAR LINEAR}, but instead
	 * of these texels being filtered to generate the texture value, the R, G, B and A texture values are derived directly from these four texels.</p>
	 */
	public final boolean GL_AMD_texture_texture4;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/AMD/transform_feedback3_lines_triangles.txt">AMD_transform_feedback3_lines_triangles</a> extension is supported.
	 * 
	 * <p>OpenGL 4.0 introduced the ability to record primitives into multiple output streams using transform feedback. However, the restriction that all streams
	 * must output {@link GL11#GL_POINT POINT} primitives when more than one output stream is active was also introduced. This extension simply removes that
	 * restriction, allowing the same set of primitives to be used with multiple transform feedback streams as with a single stream.</p>
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
	 * <p>To select the coarse derivative, use:
	 * <pre><code style="font-family: monospace">
	 * dFdxCoarse(p)
	 * dFdyCoarse(p)
	 * fwidthCoarse(p)</code></pre>
	 * To select the fine derivative, use:
	 * <pre><code style="font-family: monospace">
	 * dFdxFine(p)
	 * dFdyFine(p)
	 * fwidthFine(p)</code></pre>
	 * To select which ever is "better" (based on performance, API hints, or other factors), use:
	 * <pre><code style="font-family: monospace">
	 * dFdx(p)
	 * dFdy(p)
	 * fwidth(p)</code></pre>
	 * This last set is the set of previously existing built-ins for derivatives, and continues to work in a backward compatible way.</p>
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
	 * <p>The dominant 2D and 3D rendering APIs make two basic choices of convention when locating fragments in window space. The two choices are:
	 * <ol>
	 * <li>Is the origin nearest the lower-left- or upper-left-most pixel of the window?</li>
	 * <li>Is the (x,y) location of the pixel nearest the origin at (0,0) or (0.5,0.5)?</li>
	 * </ol>
	 * OpenGL assumes a lower-left origin for window coordinates and assumes pixel centers are located at half-pixel coordinates. This means the XY location
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
	/** When true, {@link ARBPipelineStatisticsQuery} is supported. */
	public final boolean GL_ARB_pipeline_statistics_query;
	/** When true, {@link ARBPixelBufferObject} is supported. */
	public final boolean GL_ARB_pixel_buffer_object;
	/** When true, {@link ARBPointParameters} is supported. */
	public final boolean GL_ARB_point_parameters;
	/** When true, {@link ARBPointSprite} is supported. */
	public final boolean GL_ARB_point_sprite;
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
	/** When true, {@link ARBShaderAtomicCounters} is supported. */
	public final boolean GL_ARB_shader_atomic_counters;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shader_bit_encoding.txt">ARB_shader_bit_encoding</a> extension is supported.
	 * 
	 * <p>This extension trivially adds built-in functions for getting/setting the bit encoding for floating-point values in the OpenGL Shading Language.</p>
	 * 
	 * <p>Promoted to core in {@link GL33 OpenGL 3.3}.</p>
	 */
	public final boolean GL_ARB_shader_bit_encoding;
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
	 * currently being processed by a Multi* variant of a drawing command (such as GL14#MultiDrawElements() or GL43#MultiDrawArraysIndirect()).</p>
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
	 * non-compute shader invocations and execute them in a SIMD fashion. When executing code like
	 * <pre><code style="font-family: monospace">
	 * if (condition) {
	 * 	result = do_fast_path();
	 * } else {
	 * 	result = do_general_path();
	 * }</code></pre>
	 * where {@code condition} diverges between invocations, a SIMD implementation might first call do_fast_path() for the invocations where {@code condition}
	 * is true and leave the other invocations dormant. Once do_fast_path() returns, it might call do_general_path() for invocations where {@code condition} is
	 * false and leave the other invocations dormant. In this case, the shader executes *both* the fast and the general path and might be better off just using
	 * the general path for all invocations.</p>
	 * 
	 * <p>This extension provides the ability to avoid divergent execution by evaluting a condition across an entire SIMD invocation group using code like:
	 * <pre><code style="font-family: monospace">
	 * if (allInvocationsARB(condition)) {
	 * 	result = do_fast_path();
	 * } else {
	 * 	result = do_general_path();
	 * }</code></pre>
	 * The built-in function allInvocationsARB() will return the same value for all invocations in the group, so the group will either execute do_fast_path()
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
	 * allows the test to be performed against the value generated in the shader. When the stencil operation is set to {@link GL11#GL_REPLACE REPLACE}, this
	 * allows a value generated in the shader to be written to the stencil buffer directly.</p>
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
	 * <p>Requires {@link GL43 OpenGL 4.3}. Promoted to core in {@link GL45 OpenGL 4.5}.</p>
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
	 * <p>The existing isotropic vertex texture functions:
	 * <pre><code style="font-family: monospace">
	 * texture1DLod,   texture1DProjLod,
	 * texture2DLod,   texture2DProjLod,
	 * texture3DLod,   texture3DProjLod,
	 * textureCubeLod,
	 * shadow1DLod,    shadow1DProjLod,
	 * shadow2DLod,    shadow2DProjLod</code></pre></p>
	 * 
	 * <p>are added to the built-in functions for fragment shaders.</p>
	 * 
	 * <p>New anisotropic texture functions, providing explicit derivatives:
	 * <pre><code style="font-family: monospace">
	 * texture1DGradARB(
	 * 	sampler1D sampler,
	 * 	float P, float dPdx, float dPdy);
	 * texture1DProjGradARB(
	 * 	sampler1D sampler,
	 * 	vec2 P, float dPdx, float dPdy);
	 * texture1DProjGradARB(
	 * 	sampler1D sampler,
	 * 	vec4 P, float dPdx, float dPdy);
	 * texture2DGradARB(
	 * 	sampler2D sampler,
	 * 	vec2 P, vec2 dPdx, vec2 dPdy);
	 * texture2DProjGradARB(
	 * 	sampler2D sampler,
	 * 	vec3 P, vec2 dPdx, vec2 dPdy);
	 * texture2DProjGradARB(
	 * 	sampler2D sampler,
	 * 	vec4 P, vec2 dPdx, vec2 dPdy);
	 * texture3DGradARB(
	 * 	sampler3D sampler,
	 * 	vec3 P, vec3 dPdx, vec3 dPdy);
	 * texture3DProjGradARB(
	 * 	sampler3D sampler,
	 * 	vec4 P, vec3 dPdx, vec3 dPdy);
	 * textureCubeGradARB(
	 * 	samplerCube sampler,
	 * 	vec3 P, vec3 dPdx, vec3 dPdy);
	 * 
	 * shadow1DGradARB(
	 * 	sampler1DShadow sampler,
	 * 	vec3 P, float dPdx, float dPdy);
	 * shadow1DProjGradARB(
	 * 	sampler1DShadow sampler,
	 * 	vec4 P, float dPdx, float dPdy);
	 * shadow2DGradARB(
	 * 	sampler2DShadow sampler,
	 * 	vec3 P, vec2 dPdx, vec2 dPdy);
	 * shadow2DProjGradARB(
	 * 	sampler2DShadow sampler,
	 * 	vec4 P, vec2 dPdx, vec2 dPdy);
	 * 
	 * texture2DRectGradARB(
	 * 	sampler2DRect sampler,
	 * 	vec2 P, vec2 dPdx, vec2 dPdy);
	 * texture2DRectProjGradARB(
	 * 	sampler2DRect sampler,
	 * 	vec3 P, vec2 dPdx, vec2 dPdy);
	 * texture2DRectProjGradARB(
	 * 	sampler2DRect sampler,
	 * 	vec4 P, vec2 dPdx, vec2 dPdy);
	 * 
	 * shadow2DRectGradARB(
	 * 	sampler2DRectShadow sampler,
	 * 	vec3 P, vec2 dPdx, vec2 dPdy);
	 * shadow2DRectProjGradARB(
	 * 	sampler2DRectShadow sampler,
	 * 	vec4 P, vec2 dPdx, vec2 dPdy);</code></pre></p>
	 * 
	 * <p>are added to the built-in functions for vertex shaders and fragment shaders.</p>
	 * 
	 * <p>Requires {@link #GL_ARB_shader_objects ARB_shader_objects}. Promoted to core in {@link GL30 OpenGL 3.0}.</p>
	 */
	public final boolean GL_ARB_shader_texture_lod;
	/** When true, {@link ARBShadingLanguage100} is supported. */
	public final boolean GL_ARB_shading_language_100;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/shading_language_420pack.txt">ARB_shading_language_420pack</a> extension is supported.
	 * 
	 * <p>This is a language feature only extension formed from changes made to version 4.20 of GLSL. It includes:
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
	 * Requires GLSL 1.30. Requires GLSL 1.40 for uniform block bindings. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
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
	 * <p>This extension adds the capability to use the texture color from other texture units as sources to the ARBTextureEnvCombine#COMBINE_ARB environment
	 * function. The {@link ARBTextureEnvCombine ARB_texture_env_combine} extension defined texture environment functions which could use the color from the current texture unit
	 * as a source. This extension adds the ability to use the color from any texture unit as a source.</p>
	 * 
	 * <p>Requires {@link #GL_ARB_multitexture ARB_multitexture} and {@link ARBTextureEnvCombine ARB_texture_env_combine}. Promoted to core in {@link GL14 OpenGL 1.4}.</p>
	 */
	public final boolean GL_ARB_texture_env_crossbar;
	/** When true, {@link ARBTextureEnvDot3} is supported. */
	public final boolean GL_ARB_texture_env_dot3;
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
	 * through TexImage*, TexStorage*, or TextureView* ({@link ARBTextureView ARB_texture_view}) APIs that are not below the GL12#TEXTURE_BASE_LEVEL or above the
	 * GL12#TEXTURE_MAX_LEVEL parameters. For textures defined with TexImage*, the set of resident levels is somewhat implementation-dependent. For fully
	 * defined results, applications should use TexStorage*&#47;TextureView unless the texture has a full mipmap chain and is used with a mipmapped minification
	 * filter.</p>
	 * 
	 * <p>These functions means that shaders are not required to manually recompute, approximate, or maintain a uniform holding a pre-computed level count, since
	 * the true level count is already available to the implementation. This value can be used to avoid black or leaking pixel artifacts for rendering methods
	 * which are using texture images as memory pages (eg: virtual textures); methods that can't only rely on the fixed pipeline texture functions which take
	 * advantage of GL12#TEXTURE_MAX_LEVEL for their sampling.</p>
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
	 * <p>This extension accepts GL30#STENCIL_INDEX8 as a texture internal format, and adds STENCIL_INDEX8 to the required internal format list. This removes the
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
	 * <p>The GL30#UNSIGNED_INT_10F_11F_11F_REV vertex attribute type is equivalent to the GL30#R11F_G11F_B10F texture internal format.</p>
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
	/** When true, {@link EXTDebugLabel} is supported. */
	public final boolean GL_EXT_debug_label;
	/** When true, {@link EXTDebugMarker} is supported. */
	public final boolean GL_EXT_debug_marker;
	/** When true, {@link EXTDepthBoundsTest} is supported. */
	public final boolean GL_EXT_depth_bounds_test;
	/** When true, {@link EXTDirectStateAccess} is supported. */
	public final boolean GL_EXT_direct_state_access;
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
	/** When true, {@link EXTPackedDepthStencil} is supported. */
	public final boolean GL_EXT_packed_depth_stencil;
	/** When true, {@link EXTPackedFloat} is supported. */
	public final boolean GL_EXT_packed_float;
	/** When true, {@link EXTPointParameters} is supported. */
	public final boolean GL_EXT_point_parameters;
	/** When true, {@link EXTPolygonOffsetClamp} is supported. */
	public final boolean GL_EXT_polygon_offset_clamp;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/EXT/post_depth_coverage.txt">EXT_post_depth_coverage</a> extension is supported.
	 * 
	 * <p>This extension allows the fragment shader to control whether values in {@code gl_SampleMaskIn[]} reflect the coverage after application of the early
	 * depth and stencil tests.  This feature can be enabled with the following layout qualifier in the fragment shader:
	 * <pre><code style="font-family: monospace">
	 * layout(post_depth_coverage) in;</code></pre>
	 * To use this feature, early fragment tests must also be enabled in the fragment shader via:
	 * <pre><code style="font-family: monospace">
	 * layout(early_fragment_tests) in;</code></pre></p>
	 */
	public final boolean GL_EXT_post_depth_coverage;
	/** When true, {@link EXTRasterMultisample} is supported. */
	public final boolean GL_EXT_raster_multisample;
	/** When true, {@link EXTSecondaryColor} is supported. */
	public final boolean GL_EXT_secondary_color;
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
	 * <p>This extension generalizes the {@link #GL_ARB_shadow ARB_shadow} extension to support all eight binary texture comparison functions rather than just
	 * {@link GL11#GL_LEQUAL LEQUAL} and {@link GL11#GL_GEQUAL GEQUAL}.</p>
	 * 
	 * <p>Requires {@link #GL_ARB_depth_texture ARB_depth_texture} and {@link #GL_ARB_shadow ARB_shadow}.</p>
	 */
	public final boolean GL_EXT_shadow_funcs;
	/** When true, {@link EXTSharedTexturePalette} is supported. */
	public final boolean GL_EXT_shared_texture_palette;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/EXT/sparse_texture2.txt">EXT_sparse_texture2</a> extension is supported.
	 * 
	 * <p>This extension builds on the {@link ARBSparseTexture ARB_sparse_texture} extension, providing the following new functionality:
	 * <ul>
	 * <li>New built-in GLSL texture lookup and image load functions are provided that return information on whether the texels accessed for the texture
	 * lookup accessed uncommitted texture memory.</p>
	 * 
	 * <p>New built-in GLSL texture lookup functions are provided that specify a minimum level of detail to use for lookups where the level of detail is
	 * computed automatically. This allows shaders to avoid accessing unpopulated portions of high-resolution levels of detail when it knows that the
	 * memory accessed is unpopulated, either from a priori knowledge or from feedback provided by the return value of previously executed "sparse"
	 * texture lookup functions.</p>
	 * 
	 * <p>Reads of uncommitted texture memory will act as though such memory were filled with zeroes; previously, the values returned by reads were undefined.</p>
	 * 
	 * <p>Standard implementation-independent virtual page sizes for internal formats required to be supported with sparse textures. These standard sizes can
	 * be requested by leaving ARBSparseTexture#VIRTUAL_PAGE_SIZE_INDEX_ARB at its initial value (0).</p>
	 * 
	 * <p>Support for creating sparse multisample and multisample array textures is added. However, the virtual page sizes for such textures remain fully
	 * implementation-dependent.</li>
	 * </ul></p>
	 * 
	 * <p>Requires {@link ARBSparseTexture ARB_sparse_texture}.</p>
	 */
	public final boolean GL_EXT_sparse_texture2;
	/** When true, {@link EXTStencilWrap} is supported. */
	public final boolean GL_EXT_stencil_wrap;
	/** When true, {@link EXTTextureArray} is supported. */
	public final boolean GL_EXT_texture_array;
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
	/** When true, {@link EXTTextureSRGB} is supported. */
	public final boolean GL_EXT_texture_sRGB;
	/** When true, {@link EXTTextureSRGBDecode} is supported. */
	public final boolean GL_EXT_texture_sRGB_decode;
	/** When true, {@link EXTTransformFeedback} is supported. */
	public final boolean GL_EXT_transform_feedback;
	/** When true, {@link EXTVertexAttrib64bit} is supported. */
	public final boolean GL_EXT_vertex_attrib_64bit;
	/** When true, {@link EXTX11SyncObject} is supported. */
	public final boolean GL_EXT_x11_sync_object;
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
	/** When true, {@link NVBindlessMultiDrawIndirect} is supported. */
	public final boolean GL_NV_bindless_multi_draw_indirect;
	/** When true, {@link NVBindlessMultiDrawIndirectCount} is supported. */
	public final boolean GL_NV_bindless_multi_draw_indirect_count;
	/** When true, {@link NVBindlessTexture} is supported. */
	public final boolean GL_NV_bindless_texture;
	/** When true, {@link NVBlendEquationAdvanced} is supported. */
	public final boolean GL_NV_blend_equation_advanced;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/blend_square.txt">NV_blend_square</a> extension is supported. */
	public final boolean GL_NV_blend_square;
	/** When true, {@link NVCommandList} is supported. */
	public final boolean GL_NV_command_list;
	/** When true, {@link NVComputeProgram5} is supported. */
	public final boolean GL_NV_compute_program5;
	/** When true, {@link NVConditionalRender} is supported. */
	public final boolean GL_NV_conditional_render;
	/** When true, {@link NVConservativeRaster} is supported. */
	public final boolean GL_NV_conservative_raster;
	/** When true, {@link NVCopyDepthToColor} is supported. */
	public final boolean GL_NV_copy_depth_to_color;
	/** When true, {@link NVCopyImage} is supported. */
	public final boolean GL_NV_copy_image;
	/** When true, {@link NVDeepTexture3D} is supported. */
	public final boolean GL_NV_deep_texture3D;
	/** When true, {@link NVDepthClamp} is supported. */
	public final boolean GL_NV_depth_clamp;
	/** When true, {@link NVDrawTexture} is supported. */
	public final boolean GL_NV_draw_texture;
	/** When true, {@link NVFillRectangle} is supported. */
	public final boolean GL_NV_fill_rectangle;
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
	 * following techniques may be required to ensure proper execution ordering:
	 * <ul>
	 * <li>inserting Finish or WaitSync commands to drain the pipeline between different "passes" or "layers";</li>
	 * <li>using only atomic memory operations to write to shader memory (which may be relatively slow and limits how memory may be updated); or</li>
	 * <li>injecting spin loops into shaders to prevent multiple shader invocations from touching the same memory concurrently.</li>
	 * </ul>
	 * This extension provides new GLSL built-in functions beginInvocationInterlockNV() and endInvocationInterlockNV() that delimit a critical section of
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
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/geometry_shader4.txt">NV_geometry_shader4</a> extension is supported.
	 * 
	 * <p>This extension builds upon the {@link #GL_EXT_geometry_shader4 EXT_geometry_shader4} specification to provide two additional capabilities:
	 * <ul>
	 * <li>Support for QUADS, QUAD_STRIP, and POLYGON primitive types when geometry shaders are enabled.  Such primitives will be tessellated into individual
	 * triangles.</li>
	 * <li>Setting the value of GEOMETRY_VERTICES_OUT_EXT will take effect immediately. It is not necessary to link the program object in order for this change
	 * to take effect, as is the case in the EXT version of this extension.</li>
	 * </ul>
	 * Requires {@link #GL_EXT_geometry_shader4 EXT_geometry_shader4}.</p>
	 */
	public final boolean GL_NV_geometry_shader4;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/geometry_shader_passthrough.txt">NV_geometry_shader_passthrough</a> extension is supported.
	 * 
	 * <p>This extension provides a shading language abstraction to express such shaders without requiring explicit logic to manually copy attributes from input
	 * vertices to output vertices.</p>
	 */
	public final boolean GL_NV_geometry_shader_passthrough;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/gpu_program5_mem_extended.txt">NV_gpu_program5_mem_extended</a> extension is supported.
	 * 
	 * <p>This extension provides a new set of storage modifiers that can be used by NV_gpu_program5 assembly program instructions loading from or storing to various
	 * forms of GPU memory.</p>
	 * 
	 * <p>Requires {@link #GL_NV_gpu_program5 NV_gpu_program5}.</p>
	 */
	public final boolean GL_NV_gpu_program5_mem_extended;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/gpu_shader5.txt">NV_gpu_shader5</a> extension is supported.
	 * 
	 * <p>This extension provides a set of new features to the OpenGL Shading Language and related APIs to support capabilities of new GPUs.</p>
	 * 
	 * <p>Requires {@link GL32 OpenGL 3.2}, GLSL 1.5 and {@link #GL_ARB_gpu_shader5 ARB_gpu_shader5}.</p>
	 */
	public final boolean GL_NV_gpu_shader5;
	/** When true, {@link NVInternalformatSampleQuery} is supported. */
	public final boolean GL_NV_internalformat_sample_query;
	/** When true, {@link NVLightMaxExponent} is supported. */
	public final boolean GL_NV_light_max_exponent;
	/** When true, {@link NVMultisampleCoverage} is supported. */
	public final boolean GL_NV_multisample_coverage;
	/** When true, {@link NVPackedDepthStencil} is supported. */
	public final boolean GL_NV_packed_depth_stencil;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/parameter_buffer_object2.txt">NV_parameter_buffer_object2</a> extension is supported.
	 * 
	 * <p>This extension builds on the {@link #GL_NV_parameter_buffer_object NV_parameter_buffer_object} extension to provide additional flexibility in sourcing data from buffer objects.</p>
	 * 
	 * <p>Requires {@link GL20 OpenGL 2.0}, {@link #GL_NV_gpu_program4 NV_gpu_program4} and {@link #GL_NV_parameter_buffer_object NV_parameter_buffer_object}.</p>
	 */
	public final boolean GL_NV_parameter_buffer_object2;
	/** When true, {@link NVPathRenderingSharedEdge} is supported. */
	public final boolean GL_NV_path_rendering_shared_edge;
	/** When true, {@link NVPointSprite} is supported. */
	public final boolean GL_NV_point_sprite;
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
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/shader_atomic_counters.txt">NV_shader_atomic_counters</a> extension is supported.
	 * 
	 * <p>This extension builds upon the {@link #GL_ARB_shader_atomic_counters ARB_shader_atomic_counters} and {@link #GL_NV_gpu_program5 NV_gpu_program5} extensions to provide assembly language support for
	 * incrementing, decrementing, and querying the values of atomic counters stored in buffer object memory.</p>
	 * 
	 * <p>Requires {@link #GL_ARB_shader_atomic_counters ARB_shader_atomic_counters} and {@link #GL_NV_gpu_program5 NV_gpu_program5}.</p>
	 */
	public final boolean GL_NV_shader_atomic_counters;
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
	 * for these operations is also provided if {@link #GL_NV_gpu_program5 NV_gpu_program5} is supported.</p>
	 */
	public final boolean GL_NV_shader_atomic_float;
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
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/shader_storage_buffer_object.txt">NV_shader_storage_buffer_object</a> extension is supported.
	 * 
	 * <p>This extension provides assembly language support for shader storage buffers (from the {@link #GL_ARB_shader_storage_buffer_object ARB_shader_storage_buffer_object} extension) for all
	 * program types supported by {@link #GL_NV_gpu_program5 NV_gpu_program5}, including compute programs added by the {@link #GL_NV_compute_program5 NV_compute_program5} extension.</p>
	 * 
	 * <p>Assembly programs using this extension can read and write to the memory of buffer objects bound to the binding points provided by
	 * {@link #GL_ARB_shader_storage_buffer_object ARB_shader_storage_buffer_object}.</p>
	 * 
	 * <p>Requires {@link GL40 OpenGL 4.0}, {@link #GL_NV_gpu_program4 NV_gpu_program4}, {@link #GL_NV_gpu_program5 NV_gpu_program5}, {@link ARBShaderStorageBufferObject ARB_shader_storage_buffer_object}.</p>
	 */
	public final boolean GL_NV_shader_storage_buffer_object;
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
	/** When true, {@link NVTexgenReflection} is supported. */
	public final boolean GL_NV_texgen_reflection;
	/** When true, {@link NVTextureBarrier} is supported. */
	public final boolean GL_NV_texture_barrier;
	/** When true, {@link NVTextureMultisample} is supported. */
	public final boolean GL_NV_texture_multisample;
	/** When true, {@link NVUniformBufferUnifiedMemory} is supported. */
	public final boolean GL_NV_uniform_buffer_unified_memory;
	/** When true, {@link NVVertexArrayRange} is supported. */
	public final boolean GL_NV_vertex_array_range;
	/** When true, {@link NVVertexBufferUnifiedMemory} is supported. */
	public final boolean GL_NV_vertex_buffer_unified_memory;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/vertex_program1_1.txt">NV_vertex_program1_1</a> extension is supported. */
	public final boolean GL_NV_vertex_program1_1;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/vertex_program2.txt">NV_vertex_program2</a> extension is supported. */
	public final boolean GL_NV_vertex_program2;
	/** When true, the <a href="http://www.opengl.org/registry/specs/NV/vertex_program4.txt">NV_vertex_program4</a> extension is supported. */
	public final boolean GL_NV_vertex_program4;
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
	/** When true, {@link NVXConditionalRender} is supported. */
	public final boolean GL_NVX_conditional_render;
	/** When true, {@link NVXGpuMemoryInfo} is supported. */
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
	/** When true, {@link WGLAMDGPUAssociation} is supported. */
	public final boolean WGL_AMD_gpu_association;
	/** When true, {@link WGLARBBufferRegion} is supported. */
	public final boolean WGL_ARB_buffer_region;
	/** When true, {@link WGLARBContextFlushControl} is supported. */
	public final boolean WGL_ARB_context_flush_control;
	/** When true, {@link WGLARBCreateContext} is supported. */
	public final boolean WGL_ARB_create_context;
	/** When true, {@link WGLARBCreateContextProfile} is supported. */
	public final boolean WGL_ARB_create_context_profile;
	/** When true, {@link WGLARBCreateContextRobustness} is supported. */
	public final boolean WGL_ARB_create_context_robustness;
	/** When true, {@link WGLARBExtensionsString} is supported. */
	public final boolean WGL_ARB_extensions_string;
	/** When true, {@link WGLARBFramebufferSRGB} is supported. */
	public final boolean WGL_ARB_framebuffer_sRGB;
	/** When true, {@link WGLARBMakeCurrentRead} is supported. */
	public final boolean WGL_ARB_make_current_read;
	/** When true, {@link WGLARBMultisample} is supported. */
	public final boolean WGL_ARB_multisample;
	/** When true, {@link WGLARBPbuffer} is supported. */
	public final boolean WGL_ARB_pbuffer;
	/** When true, {@link WGLARBPixelFormat} is supported. */
	public final boolean WGL_ARB_pixel_format;
	/** When true, {@link WGLARBPixelFormatFloat} is supported. */
	public final boolean WGL_ARB_pixel_format_float;
	/** When true, {@link WGLARBRenderTexture} is supported. */
	public final boolean WGL_ARB_render_texture;
	/** When true, {@link WGLARBRobustnessApplicationIsolation} is supported. */
	public final boolean WGL_ARB_robustness_application_isolation;
	/** When true, {@link WGLARBRobustnessShareGroupIsolation} is supported. */
	public final boolean WGL_ARB_robustness_share_group_isolation;
	/** When true, {@link WGLEXTCreateContextESProfile} is supported. */
	public final boolean WGL_EXT_create_context_es_profile;
	/** When true, {@link WGLEXTExtensionsString} is supported. */
	public final boolean WGL_EXT_extensions_string;
	/** When true, {@link WGLEXTFramebufferSRGB} is supported. */
	public final boolean WGL_EXT_framebuffer_sRGB;
	/** When true, {@link WGLEXTPixelFormatPackedFloat} is supported. */
	public final boolean WGL_EXT_pixel_format_packed_float;
	/** When true, {@link WGLEXTSwapControl} is supported. */
	public final boolean WGL_EXT_swap_control;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/EXT/wgl_swap_control_tear.txt">WGL_EXT_swap_control_tear</a> extension is supported.
	 * 
	 * <p>This extension extends the existing {@link WGLEXTSwapControl WGL_EXT_swap_control} extension by allowing a negative {@code interval} parameter to
	 * {@link WGLEXTSwapControl#wglSwapIntervalEXT}. The negative {@code interval} allows late swaps to occur without synchronization to the video frame. This
	 * reduces the visual stutter on late frames and reduces the stall on subsequent frames.</p>
	 */
	public final boolean WGL_EXT_swap_control_tear;
	/** When true, {@link WGLNVCopyImage} is supported. */
	public final boolean WGL_NV_copy_image;
	/** When true, {@link WGLNVDelayBeforeSwap} is supported. */
	public final boolean WGL_NV_delay_before_swap;
	/** When true, {@link WGLNVDXInterop} is supported. */
	public final boolean WGL_NV_DX_interop;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/NV/DX_interop2.txt">WGL_NV_DX_interop2</a> extension is supported.
	 * 
	 * <p>This extension expands on the specification of <a href="http://www.opengl.org/registry/specs/NV/DX_interop.txt">NV_DX_interop</a> to add support for DirectX version 10, 10.1 and 11 resources.</p>
	 * 
	 * <p>Requires {@link GL20 OpenGL 2.0} and <a href="http://www.opengl.org/registry/specs/NV/DX_interop.txt">NV_DX_interop</a>.</p>
	 */
	public final boolean WGL_NV_DX_interop2;
	/** When true, {@link WGLNVGPUAffinity} is supported. */
	public final boolean WGL_NV_gpu_affinity;

	ContextCapabilities(FunctionProvider provider, Set<String> ext, boolean fc) {
		OpenGL11 = (__GL11 = GL11.create(ext, provider, fc)) != null;
		OpenGL12 = (__GL12 = GL12.create(ext, provider)) != null;
		OpenGL13 = (__GL13 = GL13.create(ext, provider, fc)) != null;
		OpenGL14 = (__GL14 = GL14.create(ext, provider, fc)) != null;
		OpenGL15 = (__GL15 = GL15.create(ext, provider)) != null;
		OpenGL20 = (__GL20 = GL20.create(ext, provider)) != null;
		OpenGL21 = (__GL21 = GL21.create(ext, provider)) != null;
		OpenGL30 = (__GL30 = GL30.create(ext, provider)) != null;
		OpenGL31 = (__GL31 = GL31.create(ext, provider)) != null;
		OpenGL32 = (__GL32 = GL32.create(ext, provider)) != null;
		OpenGL33 = (__GL33 = GL33.create(ext, provider, fc)) != null;
		OpenGL40 = (__GL40 = GL40.create(ext, provider)) != null;
		OpenGL41 = (__GL41 = GL41.create(ext, provider)) != null;
		OpenGL42 = (__GL42 = GL42.create(ext, provider)) != null;
		OpenGL43 = (__GL43 = GL43.create(ext, provider)) != null;
		OpenGL44 = (__GL44 = GL44.create(ext, provider)) != null;
		OpenGL45 = (__GL45 = GL45.create(ext, provider)) != null;
		GLX_11 = (__GLX11 = GLX11.create(ext, provider)) != null;
		GLX_12 = (__GLX12 = GLX12.create(ext, provider)) != null;
		GLX_13 = (__GLX13 = GLX13.create(ext, provider)) != null;
		GLX_14 = (__GLX14 = GLX14.create(ext, provider)) != null;
		GLX_AMD_gpu_association = (__GLXAMDGPUAssociation = GLXAMDGPUAssociation.create(ext, provider)) != null;
		GLX_ARB_context_flush_control = ext.contains("GLX_ARB_context_flush_control");
		GLX_ARB_create_context = (__GLXARBCreateContext = GLXARBCreateContext.create(ext, provider)) != null;
		GLX_ARB_create_context_profile = ext.contains("GLX_ARB_create_context_profile");
		GLX_ARB_create_context_robustness = ext.contains("GLX_ARB_create_context_robustness");
		GLX_ARB_fbconfig_float = ext.contains("GLX_ARB_fbconfig_float");
		GLX_ARB_framebuffer_sRGB = ext.contains("GLX_ARB_framebuffer_sRGB");
		GLX_ARB_get_proc_address = (__GLXARBGetProcAddress = GLXARBGetProcAddress.create(ext, provider)) != null;
		GLX_ARB_multisample = ext.contains("GLX_ARB_multisample");
		GLX_ARB_robustness_application_isolation = ext.contains("GLX_ARB_robustness_application_isolation");
		GLX_ARB_robustness_share_group_isolation = ext.contains("GLX_ARB_robustness_share_group_isolation");
		GLX_ARB_vertex_buffer_object = ext.contains("GLX_ARB_vertex_buffer_object");
		GLX_EXT_buffer_age = ext.contains("GLX_EXT_buffer_age");
		GLX_EXT_create_context_es_profile = ext.contains("GLX_EXT_create_context_es_profile");
		GLX_EXT_fbconfig_packed_float = ext.contains("GLX_EXT_fbconfig_packed_float");
		GLX_EXT_framebuffer_sRGB = ext.contains("GLX_EXT_framebuffer_sRGB");
		GLX_EXT_import_context = (__GLXEXTImportContext = GLXEXTImportContext.create(ext, provider)) != null;
		GLX_EXT_stereo_tree = ext.contains("GLX_EXT_stereo_tree");
		GLX_EXT_swap_control = (__GLXEXTSwapControl = GLXEXTSwapControl.create(ext, provider)) != null;
		GLX_EXT_swap_control_tear = ext.contains("GLX_EXT_swap_control_tear");
		GLX_EXT_texture_from_pixmap = (__GLXEXTTextureFromPixmap = GLXEXTTextureFromPixmap.create(ext, provider)) != null;
		GLX_EXT_visual_info = ext.contains("GLX_EXT_visual_info");
		GLX_EXT_visual_rating = ext.contains("GLX_EXT_visual_rating");
		GLX_INTEL_swap_event = ext.contains("GLX_INTEL_swap_event");
		GLX_NV_copy_image = (__GLXNVCopyImage = GLXNVCopyImage.create(ext, provider)) != null;
		GLX_NV_delay_before_swap = (__GLXNVDelayBeforeSwap = GLXNVDelayBeforeSwap.create(ext, provider)) != null;
		GLX_SGI_make_current_read = (__GLXSGIMakeCurrentRead = GLXSGIMakeCurrentRead.create(ext, provider)) != null;
		GLX_SGI_swap_control = (__GLXSGISwapControl = GLXSGISwapControl.create(ext, provider)) != null;
		GLX_SGI_video_sync = (__GLXSGIVideoSync = GLXSGIVideoSync.create(ext, provider)) != null;
		GLX_SGIX_fbconfig = (__GLXSGIXFBConfig = GLXSGIXFBConfig.create(ext, provider)) != null;
		GLX_SGIX_pbuffer = (__GLXSGIXPBuffer = GLXSGIXPBuffer.create(ext, provider)) != null;
		GLX_SGIX_swap_barrier = (__GLXSGIXSwapBarrier = GLXSGIXSwapBarrier.create(ext, provider)) != null;
		GLX_SGIX_swap_group = (__GLXSGIXSwapGroup = GLXSGIXSwapGroup.create(ext, provider)) != null;
		GL_AMD_conservative_depth = ext.contains("GL_AMD_conservative_depth");
		GL_AMD_debug_output = (__AMDDebugOutput = AMDDebugOutput.create(ext, provider)) != null;
		GL_AMD_gcn_shader = ext.contains("GL_AMD_gcn_shader");
		GL_AMD_gpu_shader_int64 = ext.contains("GL_AMD_gpu_shader_int64");
		GL_AMD_occlusion_query_event = (__AMDOcclusionQueryEvent = AMDOcclusionQueryEvent.create(ext, provider)) != null;
		GL_AMD_shader_atomic_counter_ops = ext.contains("GL_AMD_shader_atomic_counter_ops");
		GL_AMD_shader_stencil_export = ext.contains("GL_AMD_shader_stencil_export");
		GL_AMD_shader_trinary_minmax = ext.contains("GL_AMD_shader_trinary_minmax");
		GL_AMD_texture_texture4 = ext.contains("GL_AMD_texture_texture4");
		GL_AMD_transform_feedback3_lines_triangles = ext.contains("GL_AMD_transform_feedback3_lines_triangles");
		GL_AMD_transform_feedback4 = ext.contains("GL_AMD_transform_feedback4");
		GL_AMD_vertex_shader_layer = ext.contains("GL_AMD_vertex_shader_layer");
		GL_AMD_vertex_shader_viewport_index = ext.contains("GL_AMD_vertex_shader_viewport_index");
		GL_ARB_arrays_of_arrays = ext.contains("GL_ARB_arrays_of_arrays");
		GL_ARB_base_instance = (__ARBBaseInstance = ARBBaseInstance.create(ext, provider)) != null;
		GL_ARB_bindless_texture = (__ARBBindlessTexture = ARBBindlessTexture.create(ext, provider)) != null;
		GL_ARB_blend_func_extended = (__ARBBlendFuncExtended = ARBBlendFuncExtended.create(ext, provider)) != null;
		GL_ARB_buffer_storage = (__ARBBufferStorage = ARBBufferStorage.create(ext, provider)) != null;
		GL_ARB_cl_event = (__ARBCLEvent = ARBCLEvent.create(ext, provider)) != null;
		GL_ARB_clear_buffer_object = (__ARBClearBufferObject = ARBClearBufferObject.create(ext, provider)) != null;
		GL_ARB_clear_texture = (__ARBClearTexture = ARBClearTexture.create(ext, provider)) != null;
		GL_ARB_clip_control = (__ARBClipControl = ARBClipControl.create(ext, provider)) != null;
		GL_ARB_color_buffer_float = (__ARBColorBufferFloat = ARBColorBufferFloat.create(ext, provider)) != null;
		GL_ARB_compatibility = ext.contains("GL_ARB_compatibility");
		GL_ARB_compressed_texture_pixel_storage = ext.contains("GL_ARB_compressed_texture_pixel_storage");
		GL_ARB_compute_shader = (__ARBComputeShader = ARBComputeShader.create(ext, provider)) != null;
		GL_ARB_compute_variable_group_size = (__ARBComputeVariableGroupSize = ARBComputeVariableGroupSize.create(ext, provider)) != null;
		GL_ARB_conditional_render_inverted = ext.contains("GL_ARB_conditional_render_inverted");
		GL_ARB_conservative_depth = ext.contains("GL_ARB_conservative_depth");
		GL_ARB_copy_buffer = (__ARBCopyBuffer = ARBCopyBuffer.create(ext, provider)) != null;
		GL_ARB_copy_image = (__ARBCopyImage = ARBCopyImage.create(ext, provider)) != null;
		GL_ARB_cull_distance = ext.contains("GL_ARB_cull_distance");
		GL_ARB_debug_output = (__ARBDebugOutput = ARBDebugOutput.create(ext, provider)) != null;
		GL_ARB_depth_buffer_float = ext.contains("GL_ARB_depth_buffer_float");
		GL_ARB_depth_clamp = ext.contains("GL_ARB_depth_clamp");
		GL_ARB_depth_texture = ext.contains("GL_ARB_depth_texture");
		GL_ARB_derivative_control = ext.contains("GL_ARB_derivative_control");
		GL_ARB_direct_state_access = (__ARBDirectStateAccess = ARBDirectStateAccess.create(ext, provider)) != null;
		GL_ARB_draw_buffers = (__ARBDrawBuffers = ARBDrawBuffers.create(ext, provider)) != null;
		GL_ARB_draw_buffers_blend = (__ARBDrawBuffersBlend = ARBDrawBuffersBlend.create(ext, provider)) != null;
		GL_ARB_draw_elements_base_vertex = (__ARBDrawElementsBaseVertex = ARBDrawElementsBaseVertex.create(ext, provider)) != null;
		GL_ARB_draw_indirect = (__ARBDrawIndirect = ARBDrawIndirect.create(ext, provider)) != null;
		GL_ARB_draw_instanced = (__ARBDrawInstanced = ARBDrawInstanced.create(ext, provider)) != null;
		GL_ARB_enhanced_layouts = ext.contains("GL_ARB_enhanced_layouts");
		GL_ARB_ES2_compatibility = (__ARBES2Compatibility = ARBES2Compatibility.create(ext, provider)) != null;
		GL_ARB_ES3_1_compatibility = (__ARBES31Compatibility = ARBES31Compatibility.create(ext, provider)) != null;
		GL_ARB_ES3_compatibility = ext.contains("GL_ARB_ES3_compatibility");
		GL_ARB_explicit_attrib_location = ext.contains("GL_ARB_explicit_attrib_location");
		GL_ARB_explicit_uniform_location = ext.contains("GL_ARB_explicit_uniform_location");
		GL_ARB_fragment_coord_conventions = ext.contains("GL_ARB_fragment_coord_conventions");
		GL_ARB_fragment_layer_viewport = ext.contains("GL_ARB_fragment_layer_viewport");
		GL_ARB_fragment_program = ext.contains("GL_ARB_fragment_program");
		GL_ARB_fragment_program_shadow = ext.contains("GL_ARB_fragment_program_shadow");
		GL_ARB_fragment_shader = ext.contains("GL_ARB_fragment_shader");
		GL_ARB_framebuffer_no_attachments = (__ARBFramebufferNoAttachments = ARBFramebufferNoAttachments.create(ext, provider)) != null;
		GL_ARB_framebuffer_object = (__ARBFramebufferObject = ARBFramebufferObject.create(ext, provider)) != null;
		GL_ARB_framebuffer_sRGB = ext.contains("GL_ARB_framebuffer_sRGB");
		GL_ARB_geometry_shader4 = (__ARBGeometryShader4 = ARBGeometryShader4.create(ext, provider)) != null;
		GL_ARB_get_program_binary = (__ARBGetProgramBinary = ARBGetProgramBinary.create(ext, provider)) != null;
		GL_ARB_get_texture_sub_image = (__ARBGetTextureSubImage = ARBGetTextureSubImage.create(ext, provider)) != null;
		GL_ARB_gpu_shader5 = ext.contains("GL_ARB_gpu_shader5");
		GL_ARB_gpu_shader_fp64 = (__ARBGPUShaderFP64 = ARBGPUShaderFP64.create(ext, provider)) != null;
		GL_ARB_half_float_pixel = ext.contains("GL_ARB_half_float_pixel");
		GL_ARB_half_float_vertex = ext.contains("GL_ARB_half_float_vertex");
		GL_ARB_imaging = (__ARBImaging = ARBImaging.create(ext, provider, fc)) != null;
		GL_ARB_indirect_parameters = (__ARBIndirectParameters = ARBIndirectParameters.create(ext, provider)) != null;
		GL_ARB_instanced_arrays = (__ARBInstancedArrays = ARBInstancedArrays.create(ext, provider)) != null;
		GL_ARB_internalformat_query = (__ARBInternalformatQuery = ARBInternalformatQuery.create(ext, provider)) != null;
		GL_ARB_internalformat_query2 = (__ARBInternalformatQuery2 = ARBInternalformatQuery2.create(ext, provider)) != null;
		GL_ARB_invalidate_subdata = (__ARBInvalidateSubdata = ARBInvalidateSubdata.create(ext, provider)) != null;
		GL_ARB_map_buffer_alignment = ext.contains("GL_ARB_map_buffer_alignment");
		GL_ARB_map_buffer_range = (__ARBMapBufferRange = ARBMapBufferRange.create(ext, provider)) != null;
		GL_ARB_matrix_palette = (__ARBMatrixPalette = ARBMatrixPalette.create(ext, provider)) != null;
		GL_ARB_multi_bind = (__ARBMultiBind = ARBMultiBind.create(ext, provider)) != null;
		GL_ARB_multi_draw_indirect = (__ARBMultiDrawIndirect = ARBMultiDrawIndirect.create(ext, provider)) != null;
		GL_ARB_multisample = (__ARBMultisample = ARBMultisample.create(ext, provider)) != null;
		GL_ARB_multitexture = (__ARBMultitexture = ARBMultitexture.create(ext, provider)) != null;
		GL_ARB_occlusion_query = (__ARBOcclusionQuery = ARBOcclusionQuery.create(ext, provider)) != null;
		GL_ARB_occlusion_query2 = ext.contains("GL_ARB_occlusion_query2");
		GL_ARB_pipeline_statistics_query = ext.contains("GL_ARB_pipeline_statistics_query");
		GL_ARB_pixel_buffer_object = ext.contains("GL_ARB_pixel_buffer_object");
		GL_ARB_point_parameters = (__ARBPointParameters = ARBPointParameters.create(ext, provider)) != null;
		GL_ARB_point_sprite = ext.contains("GL_ARB_point_sprite");
		GL_ARB_program_interface_query = (__ARBProgramInterfaceQuery = ARBProgramInterfaceQuery.create(ext, provider)) != null;
		GL_ARB_provoking_vertex = (__ARBProvokingVertex = ARBProvokingVertex.create(ext, provider)) != null;
		GL_ARB_query_buffer_object = ext.contains("GL_ARB_query_buffer_object");
		GL_ARB_robust_buffer_access_behavior = ext.contains("GL_ARB_robust_buffer_access_behavior");
		GL_ARB_robustness = (__ARBRobustness = ARBRobustness.create(ext, provider)) != null;
		GL_ARB_robustness_isolation = ext.contains("GL_ARB_robustness_isolation");
		GL_ARB_sample_shading = (__ARBSampleShading = ARBSampleShading.create(ext, provider)) != null;
		GL_ARB_sampler_objects = (__ARBSamplerObjects = ARBSamplerObjects.create(ext, provider)) != null;
		GL_ARB_seamless_cube_map = ext.contains("GL_ARB_seamless_cube_map");
		GL_ARB_seamless_cubemap_per_texture = ext.contains("GL_ARB_seamless_cubemap_per_texture");
		GL_ARB_separate_shader_objects = (__ARBSeparateShaderObjects = ARBSeparateShaderObjects.create(ext, provider)) != null;
		GL_ARB_shader_atomic_counters = (__ARBShaderAtomicCounters = ARBShaderAtomicCounters.create(ext, provider)) != null;
		GL_ARB_shader_bit_encoding = ext.contains("GL_ARB_shader_bit_encoding");
		GL_ARB_shader_draw_parameters = ext.contains("GL_ARB_shader_draw_parameters");
		GL_ARB_shader_group_vote = ext.contains("GL_ARB_shader_group_vote");
		GL_ARB_shader_image_load_store = (__ARBShaderImageLoadStore = ARBShaderImageLoadStore.create(ext, provider)) != null;
		GL_ARB_shader_image_size = ext.contains("GL_ARB_shader_image_size");
		GL_ARB_shader_objects = (__ARBShaderObjects = ARBShaderObjects.create(ext, provider)) != null;
		GL_ARB_shader_precision = ext.contains("GL_ARB_shader_precision");
		GL_ARB_shader_stencil_export = ext.contains("GL_ARB_shader_stencil_export");
		GL_ARB_shader_storage_buffer_object = (__ARBShaderStorageBufferObject = ARBShaderStorageBufferObject.create(ext, provider)) != null;
		GL_ARB_shader_subroutine = (__ARBShaderSubroutine = ARBShaderSubroutine.create(ext, provider)) != null;
		GL_ARB_shader_texture_image_samples = ext.contains("GL_ARB_shader_texture_image_samples");
		GL_ARB_shader_texture_lod = ext.contains("GL_ARB_shader_texture_lod");
		GL_ARB_shading_language_100 = ext.contains("GL_ARB_shading_language_100");
		GL_ARB_shading_language_420pack = ext.contains("GL_ARB_shading_language_420pack");
		GL_ARB_shading_language_include = (__ARBShadingLanguageInclude = ARBShadingLanguageInclude.create(ext, provider)) != null;
		GL_ARB_shading_language_packing = ext.contains("GL_ARB_shading_language_packing");
		GL_ARB_shadow = ext.contains("GL_ARB_shadow");
		GL_ARB_shadow_ambient = ext.contains("GL_ARB_shadow_ambient");
		GL_ARB_sparse_buffer = (__ARBSparseBuffer = ARBSparseBuffer.create(ext, provider)) != null;
		GL_ARB_sparse_texture = (__ARBSparseTexture = ARBSparseTexture.create(ext, provider)) != null;
		GL_ARB_stencil_texturing = ext.contains("GL_ARB_stencil_texturing");
		GL_ARB_sync = (__ARBSync = ARBSync.create(ext, provider)) != null;
		GL_ARB_tessellation_shader = (__ARBTessellationShader = ARBTessellationShader.create(ext, provider)) != null;
		GL_ARB_texture_barrier = (__ARBTextureBarrier = ARBTextureBarrier.create(ext, provider)) != null;
		GL_ARB_texture_border_clamp = ext.contains("GL_ARB_texture_border_clamp");
		GL_ARB_texture_buffer_object = (__ARBTextureBufferObject = ARBTextureBufferObject.create(ext, provider)) != null;
		GL_ARB_texture_buffer_object_rgb32 = ext.contains("GL_ARB_texture_buffer_object_rgb32");
		GL_ARB_texture_buffer_range = (__ARBTextureBufferRange = ARBTextureBufferRange.create(ext, provider)) != null;
		GL_ARB_texture_compression = (__ARBTextureCompression = ARBTextureCompression.create(ext, provider)) != null;
		GL_ARB_texture_compression_bptc = ext.contains("GL_ARB_texture_compression_bptc");
		GL_ARB_texture_compression_rgtc = ext.contains("GL_ARB_texture_compression_rgtc");
		GL_ARB_texture_cube_map = ext.contains("GL_ARB_texture_cube_map");
		GL_ARB_texture_cube_map_array = ext.contains("GL_ARB_texture_cube_map_array");
		GL_ARB_texture_env_add = ext.contains("GL_ARB_texture_env_add");
		GL_ARB_texture_env_combine = ext.contains("GL_ARB_texture_env_combine");
		GL_ARB_texture_env_crossbar = ext.contains("GL_ARB_texture_env_crossbar");
		GL_ARB_texture_env_dot3 = ext.contains("GL_ARB_texture_env_dot3");
		GL_ARB_texture_float = ext.contains("GL_ARB_texture_float");
		GL_ARB_texture_gather = ext.contains("GL_ARB_texture_gather");
		GL_ARB_texture_mirror_clamp_to_edge = ext.contains("GL_ARB_texture_mirror_clamp_to_edge");
		GL_ARB_texture_mirrored_repeat = ext.contains("GL_ARB_texture_mirrored_repeat");
		GL_ARB_texture_multisample = (__ARBTextureMultisample = ARBTextureMultisample.create(ext, provider)) != null;
		GL_ARB_texture_non_power_of_two = ext.contains("GL_ARB_texture_non_power_of_two");
		GL_ARB_texture_query_levels = ext.contains("GL_ARB_texture_query_levels");
		GL_ARB_texture_query_lod = ext.contains("GL_ARB_texture_query_lod");
		GL_ARB_texture_rectangle = ext.contains("GL_ARB_texture_rectangle");
		GL_ARB_texture_rg = ext.contains("GL_ARB_texture_rg");
		GL_ARB_texture_rgb10_a2ui = ext.contains("GL_ARB_texture_rgb10_a2ui");
		GL_ARB_texture_stencil8 = ext.contains("GL_ARB_texture_stencil8");
		GL_ARB_texture_storage = (__ARBTextureStorage = ARBTextureStorage.create(ext, provider)) != null;
		GL_ARB_texture_storage_multisample = (__ARBTextureStorageMultisample = ARBTextureStorageMultisample.create(ext, provider)) != null;
		GL_ARB_texture_swizzle = ext.contains("GL_ARB_texture_swizzle");
		GL_ARB_texture_view = (__ARBTextureView = ARBTextureView.create(ext, provider)) != null;
		GL_ARB_timer_query = (__ARBTimerQuery = ARBTimerQuery.create(ext, provider)) != null;
		GL_ARB_transform_feedback2 = (__ARBTransformFeedback2 = ARBTransformFeedback2.create(ext, provider)) != null;
		GL_ARB_transform_feedback3 = (__ARBTransformFeedback3 = ARBTransformFeedback3.create(ext, provider)) != null;
		GL_ARB_transform_feedback_instanced = (__ARBTransformFeedbackInstanced = ARBTransformFeedbackInstanced.create(ext, provider)) != null;
		GL_ARB_transform_feedback_overflow_query = ext.contains("GL_ARB_transform_feedback_overflow_query");
		GL_ARB_transpose_matrix = (__ARBTransposeMatrix = ARBTransposeMatrix.create(ext, provider)) != null;
		GL_ARB_uniform_buffer_object = (__ARBUniformBufferObject = ARBUniformBufferObject.create(ext, provider)) != null;
		GL_ARB_vertex_array_bgra = ext.contains("GL_ARB_vertex_array_bgra");
		GL_ARB_vertex_array_object = (__ARBVertexArrayObject = ARBVertexArrayObject.create(ext, provider)) != null;
		GL_ARB_vertex_attrib_64bit = (__ARBVertexAttrib64Bit = ARBVertexAttrib64Bit.create(ext, provider)) != null;
		GL_ARB_vertex_attrib_binding = (__ARBVertexAttribBinding = ARBVertexAttribBinding.create(ext, provider)) != null;
		GL_ARB_vertex_blend = (__ARBVertexBlend = ARBVertexBlend.create(ext, provider)) != null;
		GL_ARB_vertex_buffer_object = (__ARBVertexBufferObject = ARBVertexBufferObject.create(ext, provider)) != null;
		GL_ARB_vertex_program = (__ARBVertexProgram = ARBVertexProgram.create(ext, provider)) != null;
		GL_ARB_vertex_shader = (__ARBVertexShader = ARBVertexShader.create(ext, provider)) != null;
		GL_ARB_vertex_type_10f_11f_11f_rev = ext.contains("GL_ARB_vertex_type_10f_11f_11f_rev");
		GL_ARB_vertex_type_2_10_10_10_rev = (__ARBVertexType2_10_10_10_REV = ARBVertexType2_10_10_10_REV.create(ext, provider, fc)) != null;
		GL_ARB_viewport_array = (__ARBViewportArray = ARBViewportArray.create(ext, provider)) != null;
		GL_ARB_window_pos = (__ARBWindowPos = ARBWindowPos.create(ext, provider)) != null;
		GL_ATI_meminfo = ext.contains("GL_ATI_meminfo");
		GL_ATI_shader_texture_lod = ext.contains("GL_ATI_shader_texture_lod");
		GL_ATI_texture_compression_3dc = ext.contains("GL_ATI_texture_compression_3dc");
		GL_EXT_abgr = ext.contains("GL_EXT_abgr");
		GL_EXT_bgra = ext.contains("GL_EXT_bgra");
		GL_EXT_bindable_uniform = (__EXTBindableUniform = EXTBindableUniform.create(ext, provider)) != null;
		GL_EXT_blend_color = (__EXTBlendColor = EXTBlendColor.create(ext, provider)) != null;
		GL_EXT_blend_equation_separate = (__EXTBlendEquationSeparate = EXTBlendEquationSeparate.create(ext, provider)) != null;
		GL_EXT_blend_func_separate = (__EXTBlendFuncSeparate = EXTBlendFuncSeparate.create(ext, provider)) != null;
		GL_EXT_blend_minmax = (__EXTBlendMinmax = EXTBlendMinmax.create(ext, provider)) != null;
		GL_EXT_blend_subtract = ext.contains("GL_EXT_blend_subtract");
		GL_EXT_debug_label = (__EXTDebugLabel = EXTDebugLabel.create(ext, provider)) != null;
		GL_EXT_debug_marker = (__EXTDebugMarker = EXTDebugMarker.create(ext, provider)) != null;
		GL_EXT_depth_bounds_test = (__EXTDepthBoundsTest = EXTDepthBoundsTest.create(ext, provider)) != null;
		GL_EXT_direct_state_access = (__EXTDirectStateAccess = EXTDirectStateAccess.create(ext, provider)) != null;
		GL_EXT_framebuffer_blit = (__EXTFramebufferBlit = EXTFramebufferBlit.create(ext, provider)) != null;
		GL_EXT_framebuffer_multisample = (__EXTFramebufferMultisample = EXTFramebufferMultisample.create(ext, provider)) != null;
		GL_EXT_framebuffer_multisample_blit_scaled = ext.contains("GL_EXT_framebuffer_multisample_blit_scaled");
		GL_EXT_framebuffer_object = (__EXTFramebufferObject = EXTFramebufferObject.create(ext, provider)) != null;
		GL_EXT_framebuffer_sRGB = ext.contains("GL_EXT_framebuffer_sRGB");
		GL_EXT_packed_depth_stencil = ext.contains("GL_EXT_packed_depth_stencil");
		GL_EXT_packed_float = ext.contains("GL_EXT_packed_float");
		GL_EXT_point_parameters = (__EXTPointParameters = EXTPointParameters.create(ext, provider)) != null;
		GL_EXT_polygon_offset_clamp = (__EXTPolygonOffsetClamp = EXTPolygonOffsetClamp.create(ext, provider)) != null;
		GL_EXT_post_depth_coverage = ext.contains("GL_EXT_post_depth_coverage");
		GL_EXT_raster_multisample = (__EXTRasterMultisample = EXTRasterMultisample.create(ext, provider)) != null;
		GL_EXT_secondary_color = (__EXTSecondaryColor = EXTSecondaryColor.create(ext, provider)) != null;
		GL_EXT_shader_image_load_formatted = ext.contains("GL_EXT_shader_image_load_formatted");
		GL_EXT_shader_image_load_store = (__EXTShaderImageLoadStore = EXTShaderImageLoadStore.create(ext, provider)) != null;
		GL_EXT_shader_integer_mix = ext.contains("GL_EXT_shader_integer_mix");
		GL_EXT_shadow_funcs = ext.contains("GL_EXT_shadow_funcs");
		GL_EXT_shared_texture_palette = ext.contains("GL_EXT_shared_texture_palette");
		GL_EXT_sparse_texture2 = ext.contains("GL_EXT_sparse_texture2");
		GL_EXT_stencil_wrap = ext.contains("GL_EXT_stencil_wrap");
		GL_EXT_texture_array = (__EXTTextureArray = EXTTextureArray.create(ext, provider)) != null;
		GL_EXT_texture_compression_latc = ext.contains("GL_EXT_texture_compression_latc");
		GL_EXT_texture_compression_rgtc = ext.contains("GL_EXT_texture_compression_rgtc");
		GL_EXT_texture_compression_s3tc = ext.contains("GL_EXT_texture_compression_s3tc");
		GL_EXT_texture_filter_anisotropic = ext.contains("GL_EXT_texture_filter_anisotropic");
		GL_EXT_texture_filter_minmax = ext.contains("GL_EXT_texture_filter_minmax");
		GL_EXT_texture_integer = (__EXTTextureInteger = EXTTextureInteger.create(ext, provider)) != null;
		GL_EXT_texture_mirror_clamp = ext.contains("GL_EXT_texture_mirror_clamp");
		GL_EXT_texture_shared_exponent = ext.contains("GL_EXT_texture_shared_exponent");
		GL_EXT_texture_sRGB = ext.contains("GL_EXT_texture_sRGB");
		GL_EXT_texture_sRGB_decode = ext.contains("GL_EXT_texture_sRGB_decode");
		GL_EXT_transform_feedback = (__EXTTransformFeedback = EXTTransformFeedback.create(ext, provider)) != null;
		GL_EXT_vertex_attrib_64bit = (__EXTVertexAttrib64bit = EXTVertexAttrib64bit.create(ext, provider)) != null;
		GL_EXT_x11_sync_object = (__EXTX11SyncObject = EXTX11SyncObject.create(ext, provider)) != null;
		GL_KHR_blend_equation_advanced = (__KHRBlendEquationAdvanced = KHRBlendEquationAdvanced.create(ext, provider)) != null;
		GL_KHR_blend_equation_advanced_coherent = ext.contains("GL_KHR_blend_equation_advanced_coherent");
		GL_KHR_context_flush_control = ext.contains("GL_KHR_context_flush_control");
		GL_KHR_debug = (__KHRDebug = KHRDebug.create(ext, provider)) != null;
		GL_KHR_no_error = ext.contains("GL_KHR_no_error");
		GL_KHR_robust_buffer_access_behavior = ext.contains("GL_KHR_robust_buffer_access_behavior");
		GL_KHR_robustness = (__KHRRobustness = KHRRobustness.create(ext, provider)) != null;
		GL_KHR_texture_compression_astc_hdr = ext.contains("GL_KHR_texture_compression_astc_hdr");
		GL_KHR_texture_compression_astc_ldr = ext.contains("GL_KHR_texture_compression_astc_ldr");
		GL_NV_bindless_multi_draw_indirect = (__NVBindlessMultiDrawIndirect = NVBindlessMultiDrawIndirect.create(ext, provider)) != null;
		GL_NV_bindless_multi_draw_indirect_count = (__NVBindlessMultiDrawIndirectCount = NVBindlessMultiDrawIndirectCount.create(ext, provider)) != null;
		GL_NV_bindless_texture = (__NVBindlessTexture = NVBindlessTexture.create(ext, provider)) != null;
		GL_NV_blend_equation_advanced = (__NVBlendEquationAdvanced = NVBlendEquationAdvanced.create(ext, provider)) != null;
		GL_NV_blend_square = ext.contains("GL_NV_blend_square");
		GL_NV_command_list = (__NVCommandList = NVCommandList.create(ext, provider)) != null;
		GL_NV_compute_program5 = ext.contains("GL_NV_compute_program5");
		GL_NV_conditional_render = (__NVConditionalRender = NVConditionalRender.create(ext, provider)) != null;
		GL_NV_conservative_raster = (__NVConservativeRaster = NVConservativeRaster.create(ext, provider)) != null;
		GL_NV_copy_depth_to_color = ext.contains("GL_NV_copy_depth_to_color");
		GL_NV_copy_image = (__NVCopyImage = NVCopyImage.create(ext, provider)) != null;
		GL_NV_deep_texture3D = ext.contains("GL_NV_deep_texture3D");
		GL_NV_depth_clamp = ext.contains("GL_NV_depth_clamp");
		GL_NV_draw_texture = (__NVDrawTexture = NVDrawTexture.create(ext, provider)) != null;
		GL_NV_fill_rectangle = ext.contains("GL_NV_fill_rectangle");
		GL_NV_fragment_coverage_to_color = (__NVFragmentCoverageToColor = NVFragmentCoverageToColor.create(ext, provider)) != null;
		GL_NV_fragment_program4 = ext.contains("GL_NV_fragment_program4");
		GL_NV_fragment_program_option = ext.contains("GL_NV_fragment_program_option");
		GL_NV_fragment_shader_interlock = ext.contains("GL_NV_fragment_shader_interlock");
		GL_NV_framebuffer_mixed_samples = (__NVFramebufferMixedSamples = NVFramebufferMixedSamples.create(ext, provider)) != null;
		GL_NV_geometry_shader4 = ext.contains("GL_NV_geometry_shader4");
		GL_NV_geometry_shader_passthrough = ext.contains("GL_NV_geometry_shader_passthrough");
		GL_NV_gpu_program5_mem_extended = ext.contains("GL_NV_gpu_program5_mem_extended");
		GL_NV_gpu_shader5 = ext.contains("GL_NV_gpu_shader5");
		GL_NV_internalformat_sample_query = (__NVInternalformatSampleQuery = NVInternalformatSampleQuery.create(ext, provider)) != null;
		GL_NV_light_max_exponent = ext.contains("GL_NV_light_max_exponent");
		GL_NV_multisample_coverage = ext.contains("GL_NV_multisample_coverage");
		GL_NV_packed_depth_stencil = ext.contains("GL_NV_packed_depth_stencil");
		GL_NV_parameter_buffer_object2 = ext.contains("GL_NV_parameter_buffer_object2");
		GL_NV_path_rendering_shared_edge = (__NVPathRenderingSharedEdge = NVPathRenderingSharedEdge.create(ext, provider)) != null;
		GL_NV_point_sprite = (__NVPointSprite = NVPointSprite.create(ext, provider)) != null;
		GL_NV_sample_locations = (__NVSampleLocations = NVSampleLocations.create(ext, provider)) != null;
		GL_NV_sample_mask_override_coverage = ext.contains("GL_NV_sample_mask_override_coverage");
		GL_NV_shader_atomic_counters = ext.contains("GL_NV_shader_atomic_counters");
		GL_NV_shader_atomic_float = ext.contains("GL_NV_shader_atomic_float");
		GL_NV_shader_atomic_fp16_vector = ext.contains("GL_NV_shader_atomic_fp16_vector");
		GL_NV_shader_atomic_int64 = ext.contains("GL_NV_shader_atomic_int64");
		GL_NV_shader_buffer_load = (__NVShaderBufferLoad = NVShaderBufferLoad.create(ext, provider)) != null;
		GL_NV_shader_buffer_store = ext.contains("GL_NV_shader_buffer_store");
		GL_NV_shader_storage_buffer_object = ext.contains("GL_NV_shader_storage_buffer_object");
		GL_NV_shader_thread_group = ext.contains("GL_NV_shader_thread_group");
		GL_NV_shader_thread_shuffle = ext.contains("GL_NV_shader_thread_shuffle");
		GL_NV_texgen_reflection = ext.contains("GL_NV_texgen_reflection");
		GL_NV_texture_barrier = (__NVTextureBarrier = NVTextureBarrier.create(ext, provider)) != null;
		GL_NV_texture_multisample = (__NVTextureMultisample = NVTextureMultisample.create(ext, provider)) != null;
		GL_NV_uniform_buffer_unified_memory = ext.contains("GL_NV_uniform_buffer_unified_memory");
		GL_NV_vertex_array_range = (__NVVertexArrayRange = NVVertexArrayRange.create(ext, provider)) != null;
		GL_NV_vertex_buffer_unified_memory = (__NVVertexBufferUnifiedMemory = NVVertexBufferUnifiedMemory.create(ext, provider)) != null;
		GL_NV_vertex_program1_1 = ext.contains("GL_NV_vertex_program1_1");
		GL_NV_vertex_program2 = ext.contains("GL_NV_vertex_program2");
		GL_NV_vertex_program4 = ext.contains("GL_NV_vertex_program4");
		GL_NV_viewport_array2 = ext.contains("GL_NV_viewport_array2");
		GL_NVX_conditional_render = (__NVXConditionalRender = NVXConditionalRender.create(ext, provider)) != null;
		GL_NVX_gpu_memory_info = ext.contains("GL_NVX_gpu_memory_info");
		GL_OVR_multiview = (__OVRMultiview = OVRMultiview.create(ext, provider)) != null;
		GL_OVR_multiview2 = ext.contains("GL_OVR_multiview2");
		WGL_AMD_gpu_association = (__WGLAMDGPUAssociation = WGLAMDGPUAssociation.create(ext, provider)) != null;
		WGL_ARB_buffer_region = (__WGLARBBufferRegion = WGLARBBufferRegion.create(ext, provider)) != null;
		WGL_ARB_context_flush_control = ext.contains("WGL_ARB_context_flush_control");
		WGL_ARB_create_context = (__WGLARBCreateContext = WGLARBCreateContext.create(ext, provider)) != null;
		WGL_ARB_create_context_profile = ext.contains("WGL_ARB_create_context_profile");
		WGL_ARB_create_context_robustness = ext.contains("WGL_ARB_create_context_robustness");
		WGL_ARB_extensions_string = (__WGLARBExtensionsString = WGLARBExtensionsString.create(ext, provider)) != null;
		WGL_ARB_framebuffer_sRGB = ext.contains("WGL_ARB_framebuffer_sRGB");
		WGL_ARB_make_current_read = (__WGLARBMakeCurrentRead = WGLARBMakeCurrentRead.create(ext, provider)) != null;
		WGL_ARB_multisample = ext.contains("WGL_ARB_multisample");
		WGL_ARB_pbuffer = (__WGLARBPbuffer = WGLARBPbuffer.create(ext, provider)) != null;
		WGL_ARB_pixel_format = (__WGLARBPixelFormat = WGLARBPixelFormat.create(ext, provider)) != null;
		WGL_ARB_pixel_format_float = ext.contains("WGL_ARB_pixel_format_float");
		WGL_ARB_render_texture = (__WGLARBRenderTexture = WGLARBRenderTexture.create(ext, provider)) != null;
		WGL_ARB_robustness_application_isolation = ext.contains("WGL_ARB_robustness_application_isolation");
		WGL_ARB_robustness_share_group_isolation = ext.contains("WGL_ARB_robustness_share_group_isolation");
		WGL_EXT_create_context_es_profile = ext.contains("WGL_EXT_create_context_es_profile");
		WGL_EXT_extensions_string = (__WGLEXTExtensionsString = WGLEXTExtensionsString.create(ext, provider)) != null;
		WGL_EXT_framebuffer_sRGB = ext.contains("WGL_EXT_framebuffer_sRGB");
		WGL_EXT_pixel_format_packed_float = ext.contains("WGL_EXT_pixel_format_packed_float");
		WGL_EXT_swap_control = (__WGLEXTSwapControl = WGLEXTSwapControl.create(ext, provider)) != null;
		WGL_EXT_swap_control_tear = ext.contains("WGL_EXT_swap_control_tear");
		WGL_NV_copy_image = (__WGLNVCopyImage = WGLNVCopyImage.create(ext, provider)) != null;
		WGL_NV_delay_before_swap = (__WGLNVDelayBeforeSwap = WGLNVDelayBeforeSwap.create(ext, provider)) != null;
		WGL_NV_DX_interop = (__WGLNVDXInterop = WGLNVDXInterop.create(ext, provider)) != null;
		WGL_NV_DX_interop2 = ext.contains("WGL_NV_DX_interop2");
		WGL_NV_gpu_affinity = (__WGLNVGPUAffinity = WGLNVGPUAffinity.create(ext, provider)) != null;
	}
}