/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_NV_sample_mask_override_coverage</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>95</dd>
 * <dt><b>Status</b></dt>
 * <dd>Complete</dd>
 * <dt><b>Last Modified Data</b></dt>
 * <dd>2016-12-08</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>This extension requires Vulkan 1.0.</li>
 * <li>This extension requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/NV/SPV_NV_sample_mask_override_coverage.html">SPV_NV_sample_mask_override_coverage</a> SPIR-V extension.</li>
 * <li>This extension requires the <a target="_blank" href="https://www.opengl.org/registry/specs/NV/sample_mask_override_coverage.txt">GL_NV_sample_mask_override_coverage</a> extension for GLSL source languages.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell (pdaniell 'at' nvidia.com)</li>
 * </ul></dd>
 * <dt><b>Overview</b></dt>
 * <dd>This extension adds support for the following SPIR-V extension in Vulkan:
 * 
 * <ul>
 * <li>SPV_NV_sample_mask_override_coverage</li>
 * </ul>
 * 
 * <p>The extension provides access to the {@code OverrideCoverageNV} decoration under the {@code SampleMaskOverrideCoverageNV} capability. Adding this decoration to a variable with the {@code SampleMask} builtin decoration allows the shader to modify the coverage mask and affect which samples are used to process the fragment.</p>
 * 
 * <p>When using GLSL source-based shader languages, the {@code override_coverage} layout qualifier from GL_NV_sample_mask_override_coverage maps to the {@code OverrideCoverageNV} decoration. To use the {@code override_coverage} layout qualifier in GLSL the GL_NV_sample_mask_override_coverage extension must be enabled. Behavior is described in the GL_NV_sample_mask_override_coverage extension spec.</p></dd>
 * </dl>
 */
public final class NVSampleMaskOverrideCoverage {

    /** The extension specification version. */
    public static final int VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_EXTENSION_NAME = "VK_NV_sample_mask_override_coverage";

    private NVSampleMaskOverrideCoverage() {}

}