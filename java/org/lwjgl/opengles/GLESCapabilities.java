/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;
import java.util.Set;

/** Defines the capabilities of an OpenGL ES context. */
public final class GLESCapabilities {

	final GLES20                              __GLES20;
	final GLES30                              __GLES30;
	final GLES31                              __GLES31;
	final GLES32                              __GLES32;
	final AMDPerformanceMonitor               __AMDPerformanceMonitor;
	final ANGLEFramebufferBlit                __ANGLEFramebufferBlit;
	final ANGLEFramebufferMultisample         __ANGLEFramebufferMultisample;
	final ANGLEInstancedArrays                __ANGLEInstancedArrays;
	final ANGLETranslatedShaderSource         __ANGLETranslatedShaderSource;
	final APPLECopyTextureLevels              __APPLECopyTextureLevels;
	final APPLEFramebufferMultisample         __APPLEFramebufferMultisample;
	final APPLESync                           __APPLESync;
	final EXTBaseInstance                     __EXTBaseInstance;
	final EXTBlendFuncExtended                __EXTBlendFuncExtended;
	final EXTBufferStorage                    __EXTBufferStorage;
	final EXTCopyImage                        __EXTCopyImage;
	final EXTDebugLabel                       __EXTDebugLabel;
	final EXTDebugMarker                      __EXTDebugMarker;
	final EXTDiscardFramebuffer               __EXTDiscardFramebuffer;
	final EXTDisjointTimerQuery               __EXTDisjointTimerQuery;
	final EXTDrawBuffers                      __EXTDrawBuffers;
	final EXTDrawBuffersIndexed               __EXTDrawBuffersIndexed;
	final EXTDrawElementsBaseVertex           __EXTDrawElementsBaseVertex;
	final EXTDrawInstanced                    __EXTDrawInstanced;
	final EXTGeometryShader                   __EXTGeometryShader;
	final EXTInstancedArrays                  __EXTInstancedArrays;
	final EXTMapBufferRange                   __EXTMapBufferRange;
	final EXTMultiDrawArrays                  __EXTMultiDrawArrays;
	final EXTMultiDrawIndirect                __EXTMultiDrawIndirect;
	final EXTMultisampledRenderToTexture      __EXTMultisampledRenderToTexture;
	final EXTMultiviewDrawBuffers             __EXTMultiviewDrawBuffers;
	final EXTOcclusionQueryBoolean            __EXTOcclusionQueryBoolean;
	final EXTPrimitiveBoundingBox             __EXTPrimitiveBoundingBox;
	final EXTRasterMultisample                __EXTRasterMultisample;
	final EXTRobustness                       __EXTRobustness;
	final EXTSeparateShaderObjects            __EXTSeparateShaderObjects;
	final EXTSparseTexture                    __EXTSparseTexture;
	final EXTTessellationShader               __EXTTessellationShader;
	final EXTTextureBorderClamp               __EXTTextureBorderClamp;
	final EXTTextureBuffer                    __EXTTextureBuffer;
	final EXTTextureFilterMinmax              __EXTTextureFilterMinmax;
	final EXTTextureStorage                   __EXTTextureStorage;
	final EXTTextureView                      __EXTTextureView;
	final IMGMultisampledRenderToTexture      __IMGMultisampledRenderToTexture;
	final INTELFramebufferCMAA                __INTELFramebufferCMAA;
	final INTELPerformanceQuery               __INTELPerformanceQuery;
	final KHRBlendEquationAdvanced            __KHRBlendEquationAdvanced;
	final KHRDebug                            __KHRDebug;
	final KHRRobustness                       __KHRRobustness;
	final NVBindlessTexture                   __NVBindlessTexture;
	final NVBlendEquationAdvanced             __NVBlendEquationAdvanced;
	final NVConditionalRender                 __NVConditionalRender;
	final NVConservativeRaster                __NVConservativeRaster;
	final NVCopyBuffer                        __NVCopyBuffer;
	final NVCoverageSample                    __NVCoverageSample;
	final NVDrawBuffers                       __NVDrawBuffers;
	final NVDrawInstanced                     __NVDrawInstanced;
	final NVFence                             __NVFence;
	final NVFragmentCoverageToColor           __NVFragmentCoverageToColor;
	final NVFramebufferBlit                   __NVFramebufferBlit;
	final NVFramebufferMixedSamples           __NVFramebufferMixedSamples;
	final NVFramebufferMultisample            __NVFramebufferMultisample;
	final NVInstancedArrays                   __NVInstancedArrays;
	final NVInternalformatSampleQuery         __NVInternalformatSampleQuery;
	final NVNonSquareMatrices                 __NVNonSquareMatrices;
	final NVPathRendering                     __NVPathRendering;
	final NVPolygonMode                       __NVPolygonMode;
	final NVReadBuffer                        __NVReadBuffer;
	final NVSampleLocations                   __NVSampleLocations;
	final NVTextureArray                      __NVTextureArray;
	final NVViewportArray                     __NVViewportArray;
	final OESCopyImage                        __OESCopyImage;
	final OESDrawBuffersIndexed               __OESDrawBuffersIndexed;
	final OESDrawElementsBaseVertex           __OESDrawElementsBaseVertex;
	final OESEGLImage                         __OESEGLImage;
	final OESGeometryShader                   __OESGeometryShader;
	final OESGetProgramBinary                 __OESGetProgramBinary;
	final OESMapbuffer                        __OESMapbuffer;
	final OESPrimitiveBoundingBox             __OESPrimitiveBoundingBox;
	final OESSampleShading                    __OESSampleShading;
	final OESTessellationShader               __OESTessellationShader;
	final OESTexture3D                        __OESTexture3D;
	final OESTextureBorderClamp               __OESTextureBorderClamp;
	final OESTextureBuffer                    __OESTextureBuffer;
	final OESTextureStorageMultisample2dArray __OESTextureStorageMultisample2dArray;
	final OESTextureView                      __OESTextureView;
	final OESVertexArrayObject                __OESVertexArrayObject;
	final OVRMultiview                        __OVRMultiview;
	final QCOMAlphaTest                       __QCOMAlphaTest;
	final QCOMDriverControl                   __QCOMDriverControl;
	final QCOMExtendedGet                     __QCOMExtendedGet;
	final QCOMExtendedGet2                    __QCOMExtendedGet2;
	final QCOMTiledRendering                  __QCOMTiledRendering;

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
	 * <p>Requires {@link GLES31 GLES E.S}.</p>
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
	 * <p>Requires {@link EXTColorBufferHalfFloat EXT_color_buffer_half_float} and {@link GLES30 GLES E.S} or {@link APPLETexturePackedFloat APPLE_texture_packed_float}.</p>
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
	 * <p>Requires {@link GLES20 GLES E.S}.</p>
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
	 * <p>Requires {@link GLES20 GLES E.S}.</p>
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
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_color_buffer_float.txt">EXT_color_buffer_float</a> extension is supported.
	 * 
	 * <p>This extension allows a variety of floating point formats to be rendered to via framebuffer objects.</p>
	 * 
	 * <p>Requires {@link GLES30 GLES E.S}.</p>
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
	 * functionality via the construct
	 * <pre><code style="font-family: monospace">
	 * 	#extension GL_EXT_gpu_shader5 : require (or enable)</code></pre>
	 * This extension provides a variety of new features for all shader types, including:
	 * <ul>
	 * <li>support for indexing into arrays of opaque types (samplers, and atomic counters) using dynamically uniform integer expressions;</li>
	 * <li>support for indexing into arrays of images and shader storage blocks using only constant integral expressions;</li>
	 * <li>extending the uniform block capability to allow shaders to index into an array of uniform blocks;</li>
	 * <li>a "precise" qualifier allowing computations to be carried out exactly as specified in the shader source to avoid optimization-induced invariance
	 * issues (which might cause cracking in tessellation);</li>
	 * <li>new built-in functions supporting:
	 * <ul>
	 * <li>fused floating-point multiply-add operations;</li>
	 * </ul></li>
	 * <li>extending the textureGather() built-in functions provided by OpenGL ES Shading Language 3.10:
	 * <ul>
	 * <li>allowing shaders to use arbitrary offsets computed at run-time to select a 2x2 footprint to gather from; and</li>
	 * <li>allowing shaders to use separate independent offsets for each of the four texels returned, instead of requiring a fixed 2x2 footprint.</li>
	 * </ul></li>
	 * </ul></p>
	 * 
	 * <p>Requires {@link GLES31 GLES E.S}.</p>
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
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/post_depth_coverage.txt">EXT_post_depth_coverage</a> extension is supported.
	 * 
	 * <p>This extension allows the fragment shader to control whether values in gl_SampleMaskIn[] reflect the coverage after application of the early depth and
	 * stencil tests. This feature can be enabled with the following layout qualifier in the fragment shader:
	 * <pre><code style="font-family: monospace">
	 * 	layout(post_depth_coverage) in;</code></pre>
	 * To use this feature, early fragment tests must also be enabled in the fragment shader via:
	 * <pre><code style="font-family: monospace">
	 * 	layout(early_fragment_tests) in;</code></pre>
	 * Requires {@link \#GL_OES_sample_variables OES_sample_variables}.</p>
	 */
	public final boolean GL_EXT_post_depth_coverage;
	/** When true, {@link EXTPrimitiveBoundingBox} is supported. */
	public final boolean GL_EXT_primitive_bounding_box;
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
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_shader_implicit_conversions.txt">EXT_shader_implicit_conversions</a> extension is supported.
	 * 
	 * <p>This extension provides support for implicitly converting signed integer types to unsigned types, as well as more general implicit conversion and
	 * function overloading infrastructure to support new data types introduced by other extensions.</p>
	 * 
	 * <p>Requires {@link GLES31 GLES E.S}.</p>
	 */
	public final boolean GL_EXT_shader_implicit_conversions;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/EXT/shader_integer_mix.txt">EXT_shader_integer_mix</a> extension is supported.
	 * 
	 * <p>GLSL 1.30 (and GLSL ES 3.00) expanded the mix() built-in function to operate on a boolean third argument that does not interpolate but selects. This
	 * extension extends mix() to select between int, uint, and bool components.</p>
	 * 
	 * <p>Requires {@link GLES30 GLES E.S}.</p>
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
	 * <p>Requires {@link GLES31 GLES E.S}.</p>
	 */
	public final boolean GL_EXT_shader_io_blocks;
	/** When true, {@link EXTShaderPixelLocalStorage} is supported. */
	public final boolean GL_EXT_shader_pixel_local_storage;
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
	 * <p>The existing isotropic vertex texture functions:
	 * <pre><code style="font-family: monospace">
	 * 	vec4 texture2DLodEXT(sampler2D sampler,
	 * 	                     vec2 coord,
	 * 	                     float lod);
	 * 	vec4 texture2DProjLodEXT(sampler2D sampler,
	 * 	                         vec3 coord,
	 * 	                         float lod);
	 * 	vec4 texture2DProjLodEXT(sampler2D sampler,
	 * 	                         vec4 coord,
	 * 	                         float lod);
	 * 
	 * 	vec4 textureCubeLodEXT(samplerCube sampler,
	 * 	                       vec3 coord,
	 * 	                       float lod);</code></pre>
	 * are added to the built-in functions for fragment shaders with "EXT" suffix appended.</p>
	 * 
	 * <p>New anisotropic texture functions, providing explicit derivatives:
	 * <pre><code style="font-family: monospace">
	 * 	vec4 texture2DGradEXT(sampler2D sampler,
	 * 	                      vec2 P,
	 * 	                      vec2 dPdx,
	 * 	                      vec2  dPdy);
	 * 	vec4 texture2DProjGradEXT(sampler2D sampler,
	 * 	                          vec3 P,
	 * 	                          vec2 dPdx,
	 * 	                          vec2 dPdy);
	 * 	vec4 texture2DProjGradEXT(sampler2D sampler,
	 * 	                          vec4 P,
	 * 	                          vec2 dPdx,
	 * 	                          vec2 dPdy);
	 * 
	 * 	vec4 textureCubeGradEXT(samplerCube sampler,
	 * 	                        vec3 P,
	 * 	                        vec3 dPdx,
	 * 	                        vec3 dPdy);</code></pre>
	 * are added to the built-in functions for vertex shaders and fragment shaders.</p>
	 */
	public final boolean GL_EXT_shader_texture_lod;
	/** When true, {@link EXTShadowSamplers} is supported. */
	public final boolean GL_EXT_shadow_samplers;
	/** When true, {@link EXTSparseTexture} is supported. */
	public final boolean GL_EXT_sparse_texture;
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
	 * <p>Requires {@link GLES20 GLES E.S} and {@link KHRRobustness KHR_robustness}.</p>
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
	 * <p>Requires {@link GLES20 GLES E.S}.</p>
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
	 * once, one or more of the following techniques may be required to ensure proper execution ordering:
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
	 * <p>Requires {@link GLES31 GLES E.S}.</p>
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
	 * vertices to output vertices. For example, consider the following simple geometry shader in unextended OpenGL:
	 * <pre><code style="font-family: monospace">
	 *       layout(triangles) in;
	 *       layout(triangle_strip) out;
	 *       layout(max_vertices=3) out;
	 * 
	 *       in Inputs {
	 *         vec2 texcoord;
	 *         vec4 baseColor;
	 *       } v_in[];
	 *       out Outputs {
	 *         vec2 texcoord;
	 *         vec4 baseColor;
	 *       };
	 * 
	 *       void main()
	 *       {
	 *         int layer = compute_layer();
	 *         for (int i = 0; i < 3; i++) {
	 *           gl_Position = gl_in[i].gl_Position;
	 *           texcoord = v_in[i].texcoord;
	 *           baseColor = v_in[i].baseColor;
	 *           gl_Layer = layer;
	 *           EmitVertex();
	 *         }
	 *       }</code></pre>
	 * In this shader, the inputs "gl_Position", "Inputs.texcoord", and "Inputs.baseColor" are simply copied from the input vertex to the corresponding output
	 * vertex. The only "interesting" work done by the geometry shader is computing and emitting a gl_Layer value for the primitive.</p>
	 * 
	 * <p>The following geometry shader, using this extension, is equivalent:
	 * <pre><code style="font-family: monospace">
	 *       #extension GL_NV_geometry_shader_passthrough : require
	 * 
	 *       layout(triangles) in;
	 *       // No output primitive layout qualifiers required.
	 * 
	 *       // Redeclare gl_PerVertex to pass through "gl_Position".
	 *       layout(passthrough) in gl_PerVertex {
	 *         vec4 gl_Position;
	 *       };
	 * 
	 *       // Declare "Inputs" with "passthrough" to automatically copy members.
	 *       layout(passthrough) in Inputs {
	 *         vec2 texcoord;
	 *         vec4 baseColor;
	 *       };
	 * 
	 *       // No output block declaration required.
	 * 
	 *       void main()
	 *       {
	 *         // The shader simply computes and writes gl_Layer.  We don't
	 *         // loop over three vertices or call EmitVertex().
	 *         gl_Layer = compute_layer();
	 *       }</code></pre>
	 * Requires {@link GLES31 GLES E.S}.</p>
	 */
	public final boolean GL_NV_geometry_shader_passthrough;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_image_formats.txt">NV_image_formats</a> extension is supported.
	 * 
	 * <p>OpenGL ES 3.1 specifies a variety of formats required to be usable with texture images. This extension introduces the texture image formats missing for
	 * parity with OpenGL 4.4.</p>
	 * 
	 * <p>Requires {@link GLES31 GLES E.S}.</p>
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
	 * layout qualifier:
	 * <pre><code style="font-family: monospace">
	 * 	layout(override_coverage) out int gl_SampleMask[];</code></pre>
	 * Requires {@link \#GL_OES_sample_variables OES_sample_variables}.</p>
	 */
	public final boolean GL_NV_sample_mask_override_coverage;
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
	 * <p>Requires {@link GLES30 GLES E.S}.</p>
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
	 * <p>With this extension, NPOT textures are specified and applied identically to mipmapped power-of-two 2D textures with the following limitations:
	 * <ul>
	 * <li>The texture wrap modes must be CLAMP_TO_EDGE.</li>
	 * <li>Coordinates used for texture sampling on an NPOT texture using a mipmapped minification filter must lie within the range [0,1]. Coordinate clamping
	 * is not performed by the GL in this case, causing values outside this range to produce undefined results.</li>
	 * </ul></p>
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
	 * <p>Requires {@link NVViewportArray NV_viewport_array}, {@link EXTGeometryShader EXT_geometry_shader} and {@link  EXT_shader_io_blocks}.</p>
	 */
	public final boolean GL_NV_viewport_array2;
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
	 * <p>Requires {@link GLES20 GLES E.S}.</p>
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
	 * <p>OpenGL ES 1.0 supports DrawElements with <type> value of UNSIGNED_BYTE and UNSIGNED_SHORT. This extension adds support for UNSIGNED_INT <type> values.</p>
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
	 * functionality via the construct
	 * <pre><code style="font-family: monospace">
	 * 	#extension GL_OES_gpu_shader5 : require (or enable)</code></pre>
	 * This extension provides a variety of new features for all shader types, including:
	 * <ul>
	 * <li>support for indexing into arrays of opaque types (samplers, and atomic counters) using dynamically uniform integer expressions;</li>
	 * <li>support for indexing into arrays of images and shader storage blocks using only constant integral expressions;</li>
	 * <li>extending the uniform block capability to allow shaders to index into an array of uniform blocks;</li>
	 * <li>a "precise" qualifier allowing computations to be carried out exactly as specified in the shader source to avoid optimization-induced invariance
	 * issues (which might cause cracking in tessellation);</li>
	 * <li>new built-in functions supporting:
	 * <ul>
	 * <li>fused floating-point multiply-add operations;</li>
	 * </ul></li>
	 * <li>extending the textureGather() built-in functions provided by OpenGL ES Shading Language 3.10:
	 * <ul>
	 * <li>allowing shaders to use arbitrary offsets computed at run-time to select a 2x2 footprint to gather from; and</li>
	 * <li>allowing shaders to use separate independent offsets for each of the four texels returned, instead of requiring a fixed 2x2 footprint.</li>
	 * </ul></li>
	 * </ul>
	 * Requires {@link GLES31 GLES E.S}.</p>
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
	 * <p>Requires {@link GLES30 GLES E.S}.</p>
	 */
	public final boolean GL_OES_sample_variables;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_shader_image_atomic.txt">OES_shader_image_atomic</a> extension is supported.
	 * 
	 * <p>This extension provides built-in functions allowing shaders to perform atomic read-modify-write operations to a single level of a texture object from
	 * any shader stage. These built-in functions are named imageAtomic*(), and accept integer texel coordinates to identify the texel accessed. These
	 * built-in functions extend the Images in ESSL 3.10.</p>
	 * 
	 * <p>Requires {@link GLES31 GLES E.S}.</p>
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
	 * <p>Requires {@link GLES31 GLES E.S}.</p>
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
	/** When true, {@link OESTextureCompressionAstc} is supported. */
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
	 * <p>Requires {@link  OES_texture_float}.</p>
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
	/** When true, {@link OESTextureStorageMultisample2dArray} is supported. */
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
	 * <p>Requires {@link GLES30 GLES E.S} and {@link OVRMultiview OVR_multiview}.</p>
	 */
	public final boolean GL_OVR_multiview2;
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
		GLES20 = (__GLES20 = org.lwjgl.opengles.GLES20.create(ext, provider)) != null;
		GLES30 = (__GLES30 = org.lwjgl.opengles.GLES30.create(ext, provider)) != null;
		GLES31 = (__GLES31 = org.lwjgl.opengles.GLES31.create(ext, provider)) != null;
		GLES32 = (__GLES32 = org.lwjgl.opengles.GLES32.create(ext, provider)) != null;
		GL_AMD_compressed_3DC_texture = ext.contains("GL_AMD_compressed_3DC_texture");
		GL_AMD_compressed_ATC_texture = ext.contains("GL_AMD_compressed_ATC_texture");
		GL_AMD_performance_monitor = (__AMDPerformanceMonitor = AMDPerformanceMonitor.create(ext, provider)) != null;
		GL_AMD_program_binary_Z400 = ext.contains("GL_AMD_program_binary_Z400");
		GL_ANDROID_extension_pack_es31a = ext.contains("GL_ANDROID_extension_pack_es31a");
		GL_ANGLE_depth_texture = ext.contains("GL_ANGLE_depth_texture");
		GL_ANGLE_framebuffer_blit = (__ANGLEFramebufferBlit = ANGLEFramebufferBlit.create(ext, provider)) != null;
		GL_ANGLE_framebuffer_multisample = (__ANGLEFramebufferMultisample = ANGLEFramebufferMultisample.create(ext, provider)) != null;
		GL_ANGLE_instanced_arrays = (__ANGLEInstancedArrays = ANGLEInstancedArrays.create(ext, provider)) != null;
		GL_ANGLE_pack_reverse_row_order = ext.contains("GL_ANGLE_pack_reverse_row_order");
		GL_ANGLE_program_binary = ext.contains("GL_ANGLE_program_binary");
		GL_ANGLE_texture_compression_dxt1 = ext.contains("GL_ANGLE_texture_compression_dxt1");
		GL_ANGLE_texture_compression_dxt3 = ext.contains("GL_ANGLE_texture_compression_dxt3");
		GL_ANGLE_texture_compression_dxt5 = ext.contains("GL_ANGLE_texture_compression_dxt5");
		GL_ANGLE_texture_usage = ext.contains("GL_ANGLE_texture_usage");
		GL_ANGLE_translated_shader_source = (__ANGLETranslatedShaderSource = ANGLETranslatedShaderSource.create(ext, provider)) != null;
		GL_APPLE_clip_distance = ext.contains("GL_APPLE_clip_distance");
		GL_APPLE_color_buffer_packed_float = ext.contains("GL_APPLE_color_buffer_packed_float");
		GL_APPLE_copy_texture_levels = (__APPLECopyTextureLevels = APPLECopyTextureLevels.create(ext, provider)) != null;
		GL_APPLE_framebuffer_multisample = (__APPLEFramebufferMultisample = APPLEFramebufferMultisample.create(ext, provider)) != null;
		GL_APPLE_rgb_422 = ext.contains("GL_APPLE_rgb_422");
		GL_APPLE_sync = (__APPLESync = APPLESync.create(ext, provider)) != null;
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
		GL_EXT_base_instance = (__EXTBaseInstance = EXTBaseInstance.create(ext, provider)) != null;
		GL_EXT_blend_func_extended = (__EXTBlendFuncExtended = EXTBlendFuncExtended.create(ext, provider)) != null;
		GL_EXT_blend_minmax = ext.contains("GL_EXT_blend_minmax");
		GL_EXT_buffer_storage = (__EXTBufferStorage = EXTBufferStorage.create(ext, provider)) != null;
		GL_EXT_color_buffer_float = ext.contains("GL_EXT_color_buffer_float");
		GL_EXT_color_buffer_half_float = ext.contains("GL_EXT_color_buffer_half_float");
		GL_EXT_copy_image = (__EXTCopyImage = EXTCopyImage.create(ext, provider)) != null;
		GL_EXT_debug_label = (__EXTDebugLabel = EXTDebugLabel.create(ext, provider)) != null;
		GL_EXT_debug_marker = (__EXTDebugMarker = EXTDebugMarker.create(ext, provider)) != null;
		GL_EXT_discard_framebuffer = (__EXTDiscardFramebuffer = EXTDiscardFramebuffer.create(ext, provider)) != null;
		GL_EXT_disjoint_timer_query = (__EXTDisjointTimerQuery = EXTDisjointTimerQuery.create(ext, provider)) != null;
		GL_EXT_draw_buffers = (__EXTDrawBuffers = EXTDrawBuffers.create(ext, provider)) != null;
		GL_EXT_draw_buffers_indexed = (__EXTDrawBuffersIndexed = EXTDrawBuffersIndexed.create(ext, provider)) != null;
		GL_EXT_draw_elements_base_vertex = (__EXTDrawElementsBaseVertex = EXTDrawElementsBaseVertex.create(ext, provider)) != null;
		GL_EXT_draw_instanced = (__EXTDrawInstanced = EXTDrawInstanced.create(ext, provider)) != null;
		GL_EXT_float_blend = ext.contains("GL_EXT_float_blend");
		GL_EXT_geometry_point_size = ext.contains("GL_EXT_geometry_point_size");
		GL_EXT_geometry_shader = (__EXTGeometryShader = EXTGeometryShader.create(ext, provider)) != null;
		GL_EXT_gpu_shader5 = ext.contains("GL_EXT_gpu_shader5");
		GL_EXT_instanced_arrays = (__EXTInstancedArrays = EXTInstancedArrays.create(ext, provider)) != null;
		GL_EXT_map_buffer_range = (__EXTMapBufferRange = EXTMapBufferRange.create(ext, provider)) != null;
		GL_EXT_multi_draw_arrays = (__EXTMultiDrawArrays = EXTMultiDrawArrays.create(ext, provider)) != null;
		GL_EXT_multi_draw_indirect = (__EXTMultiDrawIndirect = EXTMultiDrawIndirect.create(ext, provider)) != null;
		GL_EXT_multisample_compatibility = ext.contains("GL_EXT_multisample_compatibility");
		GL_EXT_multisampled_render_to_texture = (__EXTMultisampledRenderToTexture = EXTMultisampledRenderToTexture.create(ext, provider)) != null;
		GL_EXT_multiview_draw_buffers = (__EXTMultiviewDrawBuffers = EXTMultiviewDrawBuffers.create(ext, provider)) != null;
		GL_EXT_occlusion_query_boolean = (__EXTOcclusionQueryBoolean = EXTOcclusionQueryBoolean.create(ext, provider)) != null;
		GL_EXT_post_depth_coverage = ext.contains("GL_EXT_post_depth_coverage");
		GL_EXT_primitive_bounding_box = (__EXTPrimitiveBoundingBox = EXTPrimitiveBoundingBox.create(ext, provider)) != null;
		GL_EXT_pvrtc_sRGB = ext.contains("GL_EXT_pvrtc_sRGB");
		GL_EXT_raster_multisample = (__EXTRasterMultisample = EXTRasterMultisample.create(ext, provider)) != null;
		GL_EXT_read_format_bgra = ext.contains("GL_EXT_read_format_bgra");
		GL_EXT_render_snorm = ext.contains("GL_EXT_render_snorm");
		GL_EXT_robustness = (__EXTRobustness = EXTRobustness.create(ext, provider)) != null;
		GL_EXT_separate_shader_objects = (__EXTSeparateShaderObjects = EXTSeparateShaderObjects.create(ext, provider)) != null;
		GL_EXT_shader_framebuffer_fetch = ext.contains("GL_EXT_shader_framebuffer_fetch");
		GL_EXT_shader_implicit_conversions = ext.contains("GL_EXT_shader_implicit_conversions");
		GL_EXT_shader_integer_mix = ext.contains("GL_EXT_shader_integer_mix");
		GL_EXT_shader_io_blocks = ext.contains("GL_EXT_shader_io_blocks");
		GL_EXT_shader_pixel_local_storage = ext.contains("GL_EXT_shader_pixel_local_storage");
		GL_EXT_shader_texture_lod = ext.contains("GL_EXT_shader_texture_lod");
		GL_EXT_shadow_samplers = ext.contains("GL_EXT_shadow_samplers");
		GL_EXT_sparse_texture = (__EXTSparseTexture = EXTSparseTexture.create(ext, provider)) != null;
		GL_EXT_sRGB = ext.contains("GL_EXT_sRGB");
		GL_EXT_sRGB_write_control = ext.contains("GL_EXT_sRGB_write_control");
		GL_EXT_tessellation_point_size = ext.contains("GL_EXT_tessellation_point_size");
		GL_EXT_tessellation_shader = (__EXTTessellationShader = EXTTessellationShader.create(ext, provider)) != null;
		GL_EXT_texture_border_clamp = (__EXTTextureBorderClamp = EXTTextureBorderClamp.create(ext, provider)) != null;
		GL_EXT_texture_buffer = (__EXTTextureBuffer = EXTTextureBuffer.create(ext, provider)) != null;
		GL_EXT_texture_compression_dxt1 = ext.contains("GL_EXT_texture_compression_dxt1");
		GL_EXT_texture_compression_s3tc = ext.contains("GL_EXT_texture_compression_s3tc");
		GL_EXT_texture_cube_map_array = ext.contains("GL_EXT_texture_cube_map_array");
		GL_EXT_texture_filter_anisotropic = ext.contains("GL_EXT_texture_filter_anisotropic");
		GL_EXT_texture_filter_minmax = (__EXTTextureFilterMinmax = EXTTextureFilterMinmax.create(ext, provider)) != null;
		GL_EXT_texture_format_BGRA8888 = ext.contains("GL_EXT_texture_format_BGRA8888");
		GL_EXT_texture_norm16 = ext.contains("GL_EXT_texture_norm16");
		GL_EXT_texture_rg = ext.contains("GL_EXT_texture_rg");
		GL_EXT_texture_sRGB_decode = ext.contains("GL_EXT_texture_sRGB_decode");
		GL_EXT_texture_sRGB_R8 = ext.contains("GL_EXT_texture_sRGB_R8");
		GL_EXT_texture_sRGB_RG8 = ext.contains("GL_EXT_texture_sRGB_RG8");
		GL_EXT_texture_storage = (__EXTTextureStorage = EXTTextureStorage.create(ext, provider)) != null;
		GL_EXT_texture_type_2_10_10_10_REV = ext.contains("GL_EXT_texture_type_2_10_10_10_REV");
		GL_EXT_texture_view = (__EXTTextureView = EXTTextureView.create(ext, provider)) != null;
		GL_EXT_unpack_subimage = ext.contains("GL_EXT_unpack_subimage");
		GL_EXT_YUV_target = ext.contains("GL_EXT_YUV_target");
		GL_FJ_shader_binary_GCCSO = ext.contains("GL_FJ_shader_binary_GCCSO");
		GL_IMG_multisampled_render_to_texture = (__IMGMultisampledRenderToTexture = IMGMultisampledRenderToTexture.create(ext, provider)) != null;
		GL_IMG_program_binary = ext.contains("GL_IMG_program_binary");
		GL_IMG_read_format = ext.contains("GL_IMG_read_format");
		GL_IMG_shader_binary = ext.contains("GL_IMG_shader_binary");
		GL_IMG_texture_compression_pvrtc = ext.contains("GL_IMG_texture_compression_pvrtc");
		GL_IMG_texture_compression_pvrtc2 = ext.contains("GL_IMG_texture_compression_pvrtc2");
		GL_INTEL_framebuffer_CMAA = (__INTELFramebufferCMAA = INTELFramebufferCMAA.create(ext, provider)) != null;
		GL_INTEL_performance_query = (__INTELPerformanceQuery = INTELPerformanceQuery.create(ext, provider)) != null;
		GL_KHR_blend_equation_advanced = (__KHRBlendEquationAdvanced = KHRBlendEquationAdvanced.create(ext, provider)) != null;
		GL_KHR_blend_equation_advanced_coherent = ext.contains("GL_KHR_blend_equation_advanced_coherent");
		GL_KHR_context_flush_control = ext.contains("GL_KHR_context_flush_control");
		GL_KHR_debug = (__KHRDebug = KHRDebug.create(ext, provider)) != null;
		GL_KHR_no_error = ext.contains("GL_KHR_no_error");
		GL_KHR_robust_buffer_access_behavior = ext.contains("GL_KHR_robust_buffer_access_behavior");
		GL_KHR_robustness = (__KHRRobustness = KHRRobustness.create(ext, provider)) != null;
		GL_KHR_texture_compression_astc_hdr = ext.contains("GL_KHR_texture_compression_astc_hdr");
		GL_KHR_texture_compression_astc_ldr = ext.contains("GL_KHR_texture_compression_astc_ldr");
		GL_NV_bindless_texture = (__NVBindlessTexture = NVBindlessTexture.create(ext, provider)) != null;
		GL_NV_blend_equation_advanced = (__NVBlendEquationAdvanced = NVBlendEquationAdvanced.create(ext, provider)) != null;
		GL_NV_blend_equation_advanced_coherent = ext.contains("GL_NV_blend_equation_advanced_coherent");
		GL_NV_conditional_render = (__NVConditionalRender = NVConditionalRender.create(ext, provider)) != null;
		GL_NV_conservative_raster = (__NVConservativeRaster = NVConservativeRaster.create(ext, provider)) != null;
		GL_NV_copy_buffer = (__NVCopyBuffer = NVCopyBuffer.create(ext, provider)) != null;
		GL_NV_coverage_sample = (__NVCoverageSample = NVCoverageSample.create(ext, provider)) != null;
		GL_NV_depth_nonlinear = ext.contains("GL_NV_depth_nonlinear");
		GL_NV_draw_buffers = (__NVDrawBuffers = NVDrawBuffers.create(ext, provider)) != null;
		GL_NV_draw_instanced = (__NVDrawInstanced = NVDrawInstanced.create(ext, provider)) != null;
		GL_NV_explicit_attrib_location = ext.contains("GL_NV_explicit_attrib_location");
		GL_NV_fbo_color_attachments = ext.contains("GL_NV_fbo_color_attachments");
		GL_NV_fence = (__NVFence = NVFence.create(ext, provider)) != null;
		GL_NV_fill_rectangle = ext.contains("GL_NV_fill_rectangle");
		GL_NV_fragment_coverage_to_color = (__NVFragmentCoverageToColor = NVFragmentCoverageToColor.create(ext, provider)) != null;
		GL_NV_fragment_shader_interlock = ext.contains("GL_NV_fragment_shader_interlock");
		GL_NV_framebuffer_blit = (__NVFramebufferBlit = NVFramebufferBlit.create(ext, provider)) != null;
		GL_NV_framebuffer_mixed_samples = (__NVFramebufferMixedSamples = NVFramebufferMixedSamples.create(ext, provider)) != null;
		GL_NV_framebuffer_multisample = (__NVFramebufferMultisample = NVFramebufferMultisample.create(ext, provider)) != null;
		GL_NV_generate_mipmap_sRGB = ext.contains("GL_NV_generate_mipmap_sRGB");
		GL_NV_geometry_shader_passthrough = ext.contains("GL_NV_geometry_shader_passthrough");
		GL_NV_image_formats = ext.contains("GL_NV_image_formats");
		GL_NV_instanced_arrays = (__NVInstancedArrays = NVInstancedArrays.create(ext, provider)) != null;
		GL_NV_internalformat_sample_query = (__NVInternalformatSampleQuery = NVInternalformatSampleQuery.create(ext, provider)) != null;
		GL_NV_non_square_matrices = (__NVNonSquareMatrices = NVNonSquareMatrices.create(ext, provider)) != null;
		GL_NV_path_rendering = (__NVPathRendering = NVPathRendering.create(ext, provider)) != null;
		GL_NV_path_rendering_shared_edge = ext.contains("GL_NV_path_rendering_shared_edge");
		GL_NV_polygon_mode = (__NVPolygonMode = NVPolygonMode.create(ext, provider)) != null;
		GL_NV_read_buffer = (__NVReadBuffer = NVReadBuffer.create(ext, provider)) != null;
		GL_NV_read_buffer_front = ext.contains("GL_NV_read_buffer_front");
		GL_NV_read_depth = ext.contains("GL_NV_read_depth");
		GL_NV_read_depth_stencil = ext.contains("GL_NV_read_depth_stencil");
		GL_NV_read_stencil = ext.contains("GL_NV_read_stencil");
		GL_NV_sample_locations = (__NVSampleLocations = NVSampleLocations.create(ext, provider)) != null;
		GL_NV_sample_mask_override_coverage = ext.contains("GL_NV_sample_mask_override_coverage");
		GL_NV_shader_noperspective_interpolation = ext.contains("GL_NV_shader_noperspective_interpolation");
		GL_NV_shadow_samplers_array = ext.contains("GL_NV_shadow_samplers_array");
		GL_NV_shadow_samplers_cube = ext.contains("GL_NV_shadow_samplers_cube");
		GL_NV_sRGB_formats = ext.contains("GL_NV_sRGB_formats");
		GL_NV_texture_array = (__NVTextureArray = NVTextureArray.create(ext, provider)) != null;
		GL_NV_texture_border_clamp = ext.contains("GL_NV_texture_border_clamp");
		GL_NV_texture_compression_s3tc = ext.contains("GL_NV_texture_compression_s3tc");
		GL_NV_texture_compression_s3tc_update = ext.contains("GL_NV_texture_compression_s3tc_update");
		GL_NV_texture_npot_2D_mipmap = ext.contains("GL_NV_texture_npot_2D_mipmap");
		GL_NV_viewport_array = (__NVViewportArray = NVViewportArray.create(ext, provider)) != null;
		GL_NV_viewport_array2 = ext.contains("GL_NV_viewport_array2");
		GL_OES_compressed_ETC1_RGB8_sub_texture = ext.contains("GL_OES_compressed_ETC1_RGB8_sub_texture");
		GL_OES_compressed_ETC1_RGB8_texture = ext.contains("GL_OES_compressed_ETC1_RGB8_texture");
		GL_OES_compressed_paletted_texture = ext.contains("GL_OES_compressed_paletted_texture");
		GL_OES_copy_image = (__OESCopyImage = OESCopyImage.create(ext, provider)) != null;
		GL_OES_depth24 = ext.contains("GL_OES_depth24");
		GL_OES_depth32 = ext.contains("GL_OES_depth32");
		GL_OES_depth_texture = ext.contains("GL_OES_depth_texture");
		GL_OES_depth_texture_cube_map = ext.contains("GL_OES_depth_texture_cube_map");
		GL_OES_draw_buffers_indexed = (__OESDrawBuffersIndexed = OESDrawBuffersIndexed.create(ext, provider)) != null;
		GL_OES_draw_elements_base_vertex = (__OESDrawElementsBaseVertex = OESDrawElementsBaseVertex.create(ext, provider)) != null;
		GL_OES_EGL_image = (__OESEGLImage = OESEGLImage.create(ext, provider)) != null;
		GL_OES_EGL_image_external = ext.contains("GL_OES_EGL_image_external");
		GL_OES_EGL_image_external_essl3 = ext.contains("GL_OES_EGL_image_external_essl3");
		GL_OES_element_index_uint = ext.contains("GL_OES_element_index_uint");
		GL_OES_fbo_render_mipmap = ext.contains("GL_OES_fbo_render_mipmap");
		GL_OES_geometry_point_size = ext.contains("GL_OES_geometry_point_size");
		GL_OES_geometry_shader = (__OESGeometryShader = OESGeometryShader.create(ext, provider)) != null;
		GL_OES_get_program_binary = (__OESGetProgramBinary = OESGetProgramBinary.create(ext, provider)) != null;
		GL_OES_gpu_shader5 = ext.contains("GL_OES_gpu_shader5");
		GL_OES_mapbuffer = (__OESMapbuffer = OESMapbuffer.create(ext, provider)) != null;
		GL_OES_packed_depth_stencil = ext.contains("GL_OES_packed_depth_stencil");
		GL_OES_primitive_bounding_box = (__OESPrimitiveBoundingBox = OESPrimitiveBoundingBox.create(ext, provider)) != null;
		GL_OES_required_internalformat = ext.contains("GL_OES_required_internalformat");
		GL_OES_rgb8_rgba8 = ext.contains("GL_OES_rgb8_rgba8");
		GL_OES_sample_shading = (__OESSampleShading = OESSampleShading.create(ext, provider)) != null;
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
		GL_OES_tessellation_shader = (__OESTessellationShader = OESTessellationShader.create(ext, provider)) != null;
		GL_OES_texture_3D = (__OESTexture3D = OESTexture3D.create(ext, provider)) != null;
		GL_OES_texture_border_clamp = (__OESTextureBorderClamp = OESTextureBorderClamp.create(ext, provider)) != null;
		GL_OES_texture_buffer = (__OESTextureBuffer = OESTextureBuffer.create(ext, provider)) != null;
		GL_OES_texture_compression_astc = ext.contains("GL_OES_texture_compression_astc");
		GL_OES_texture_cube_map_array = ext.contains("GL_OES_texture_cube_map_array");
		GL_OES_texture_float = ext.contains("GL_OES_texture_float");
		GL_OES_texture_float_linear = ext.contains("GL_OES_texture_float_linear");
		GL_OES_texture_half_float = ext.contains("GL_OES_texture_half_float");
		GL_OES_texture_half_float_linear = ext.contains("GL_OES_texture_half_float_linear");
		GL_OES_texture_npot = ext.contains("GL_OES_texture_npot");
		GL_OES_texture_stencil8 = ext.contains("GL_OES_texture_stencil8");
		GL_OES_texture_storage_multisample_2d_array = (__OESTextureStorageMultisample2dArray = OESTextureStorageMultisample2dArray.create(ext, provider)) != null;
		GL_OES_texture_view = (__OESTextureView = OESTextureView.create(ext, provider)) != null;
		GL_OES_vertex_array_object = (__OESVertexArrayObject = OESVertexArrayObject.create(ext, provider)) != null;
		GL_OES_vertex_half_float = ext.contains("GL_OES_vertex_half_float");
		GL_OES_vertex_type_10_10_10_2 = ext.contains("GL_OES_vertex_type_10_10_10_2");
		GL_OVR_multiview = (__OVRMultiview = OVRMultiview.create(ext, provider)) != null;
		GL_OVR_multiview2 = ext.contains("GL_OVR_multiview2");
		GL_QCOM_alpha_test = (__QCOMAlphaTest = QCOMAlphaTest.create(ext, provider)) != null;
		GL_QCOM_binning_control = ext.contains("GL_QCOM_binning_control");
		GL_QCOM_driver_control = (__QCOMDriverControl = QCOMDriverControl.create(ext, provider)) != null;
		GL_QCOM_extended_get = (__QCOMExtendedGet = QCOMExtendedGet.create(ext, provider)) != null;
		GL_QCOM_extended_get2 = (__QCOMExtendedGet2 = QCOMExtendedGet2.create(ext, provider)) != null;
		GL_QCOM_perfmon_global_mode = ext.contains("GL_QCOM_perfmon_global_mode");
		GL_QCOM_tiled_rendering = (__QCOMTiledRendering = QCOMTiledRendering.create(ext, provider)) != null;
		GL_QCOM_writeonly_rendering = ext.contains("GL_QCOM_writeonly_rendering");
		GL_VIV_shader_binary = ext.contains("GL_VIV_shader_binary");
	}
}